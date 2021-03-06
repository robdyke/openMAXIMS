//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Andrei Stefan Bondar using IMS Development Environment (version 1.80 build 4091.21781)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.hospitalatnightpatientdetail;

import java.util.Comparator;

import ims.clinical.forms.hospitalatnightpatientdetail.GenForm.grdClinicalTaskRow;
import ims.clinical.forms.hospitalatnightpatientdetail.GenForm.grdTypeRequestRow;
import ims.clinical.forms.hospitalatnightpatientdetail.GenForm.grdUpdatedNotesRow;
import ims.clinical.vo.HospitalAtNightListandDatesRefVo;
import ims.clinical.vo.HospitalAtNightNotesVo;
import ims.clinical.vo.HospitalAtNightNotesVoCollection;
import ims.clinical.vo.HospitalAtNightPatientDetailStatusVo;
import ims.clinical.vo.HospitalAtNightPatientDetailStatusVoCollection;
import ims.clinical.vo.HospitalAtNightPatientDetailVo;
import ims.clinical.vo.lookups.HospitalAtNightClinicalTask;
import ims.clinical.vo.lookups.HospitalAtNightClinicalTaskCollection;
import ims.clinical.vo.lookups.HospitalAtNightPatientStatus;
import ims.clinical.vo.lookups.HospitalAtNightRequestType;
import ims.clinical.vo.lookups.HospitalAtNightRequestTypeCollection;
import ims.configuration.AppRight;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.enums.MosType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.Control;
import ims.framework.FormName;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{
		initialize(args);
		open();
	}

	private void initialize(Object[] args) throws PresentationLogicException 
	{
		form.ccRequestingHCP().isRequired(true);
		form.ccRequestingHCP().initialize(MosType.HCP);
		
		Object hcp = domain.getHcpLiteUser();
		
		if(hcp instanceof HcpLiteVo)
		{
			form.getLocalContext().setLoggedHCP((HcpLiteVo) hcp);	
		}
		
		form.getLocalContext().setHospitalAtNightConfig(domain.getCurrentHospitalAtNightConfig(engine.getCurrentLocation()));//	WDEV-13968 - this information should be used only on NEW record
		
		if(form.getGlobalContext().Clinical.getHospitalAtNightPatientDetails() == null)
		{
			if(form.getLocalContext().getLoggedHCP() == null)
			{
				form.getLocalContext().setErrorMessage(engine.showMessage("Logged in user must be an HCP.", "", MessageButtons.OK, MessageIcon.INFORMATION));
				return;
			}
			
			if(form.getLocalContext().getHospitalAtNightConfig() == null)//	WDEV-13968
			{
				form.getLocalContext().setErrorMessage(engine.showMessage("Selected Hospital doesn't have a Hospital At Night Config.", "", MessageButtons.OK, MessageIcon.INFORMATION));
				return;
			}
			
			if(form.getGlobalContext().Core.getPatientShort() == null)
			{
				form.getLocalContext().setErrorMessage(engine.showMessage("Please select a patient.", "", MessageButtons.OK, MessageIcon.INFORMATION));
				return;
			}
			
			if(domain.isPatientAlreadyAddedToHospAtNightList(form.getGlobalContext().Core.getPatientShort(), form.getLocalContext().getHospitalAtNightConfig()))//	WDEV-13968
			{
				form.getLocalContext().setErrorMessage(engine.showMessage("Selected patient is already added to Hospital At Night List.", "", MessageButtons.OK, MessageIcon.INFORMATION));
				return;
			}
			
			form.getLocalContext().setInpatientCareContext(domain.getInpatientCareContext(form.getGlobalContext().Core.getPatientShort()));
			if(form.getLocalContext().getInpatientCareContext() == null)
			{
				form.getLocalContext().setErrorMessage(engine.showMessage("Selected patient cannot be added to Hospital At Nigth List because is not currently an Inpatient.", "", MessageButtons.OK, MessageIcon.INFORMATION));
				return;
			}
			
			form.ccRequestingHCP().setValue(form.getLocalContext().getLoggedHCP());
			form.dtimRequestingDate().setValue(new DateTime());
		}
		
		if(args != null && args.length > 0)
		{
			if(args[0] instanceof FormMode)
				form.getLocalContext().setDialogMode((FormMode) args[0]);
		}
		
		HospitalAtNightRequestTypeCollection typeOfRequestColl = ims.clinical.vo.lookups.LookupHelper.getHospitalAtNightRequestType(domain.getLookupService());
		populateTypeOfRequestGrid(typeOfRequestColl);
	}

	private void populateTypeOfRequestGrid(HospitalAtNightRequestTypeCollection typeOfRequestColl) 
	{
		form.grdTypeRequest().getRows().clear();
		
		if(typeOfRequestColl == null || typeOfRequestColl.size() == 0)
			return;
		
		for(int i=0; i<typeOfRequestColl.size(); i++)
		{
			grdTypeRequestRow row = form.grdTypeRequest().getRows().newRow();
			
			row.setColType(typeOfRequestColl.get(i).getText());
			row.setValue(typeOfRequestColl.get(i));
		}
	}

	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.getLocalContext().getSelectedInstance() != null)
		{
			form.getLocalContext().setSelectedInstance(domain.getHospitalAtNightPatientDetails(form.getLocalContext().getSelectedInstance()));
		}
		else if(form.getGlobalContext().Clinical.getHospitalAtNightPatientDetailsIsNotNull())
		{
			form.getLocalContext().setSelectedInstance(domain.getHospitalAtNightPatientDetails(form.getGlobalContext().Clinical.getHospitalAtNightPatientDetails()));
		}
		
		if(form.getLocalContext().getSelectedInstance() != null)
		{
			clearScreen();	
			
			populateScreenFromData(form.getLocalContext().getSelectedInstance());
			
			if(form.getLocalContext().getDialogModeIsNotNull())
			{
				form.setMode(form.getLocalContext().getDialogMode());
				form.getLocalContext().setDialogMode(null);
				return;
			}
			
			form.setMode(FormMode.VIEW);
			return;
		}
		
		form.setMode(FormMode.EDIT);
	}
	
	private void populateScreenFromData(HospitalAtNightPatientDetailVo selectedInstance) 
	{
		if(selectedInstance == null)
			return;
		
		form.txtSituation().setValue(selectedInstance.getSituation());
		form.txtSituation().setTooltip(selectedInstance.getSituation());
		form.txtBackground().setValue(selectedInstance.getBackground());
		form.txtBackground().setTooltip(selectedInstance.getBackground());
		form.txtAssessment().setValue(selectedInstance.getAssessment());
		form.txtAssessment().setTooltip(selectedInstance.getAssessment());
		form.txtRecommendation().setValue(selectedInstance.getRecommendation());
		form.txtRecommendation().setTooltip(selectedInstance.getRecommendation());
		
		form.cmbMEWS().setValue(selectedInstance.getMEWS());
		
		populateTypeOfRequestGridWithValue(selectedInstance.getTypeOfRequest());
		
		populateClinicalTasksGrid(selectedInstance.getClinicalTasks());
		
		form.ccRequestingHCP().setValue(selectedInstance.getRequestingHCP());
		form.dtimRequestingDate().setValue(selectedInstance.getRequestingDateTime());
		
		populateNotesGrid(selectedInstance.getNotes().sort(new HospitalAtNightNotesDateComparator(SortOrder.DESCENDING)));
	}

	private void populateTypeOfRequestGridWithValue(HospitalAtNightRequestType typeOfRequest) 
	{
		if(typeOfRequest == null)
			return;
		
		for(int i=0; i<form.grdTypeRequest().getRows().size(); i++)
		{
			if(typeOfRequest.equals(form.grdTypeRequest().getRows().get(i).getValue()))
			{
				form.grdTypeRequest().getRows().get(i).setColSelect(true);
				return;
			}
		}
	}

	private void populateNotesGrid(HospitalAtNightNotesVoCollection notes) 
	{
		form.grdUpdatedNotes().getRows().clear();
		
		if(notes == null || notes.size() == 0)
			return;
		
		for(int i=0; i<notes.size(); i++)
		{
			HospitalAtNightNotesVo note = notes.get(i);
			
			if(note == null)
				return;
			
			grdUpdatedNotesRow row = form.grdUpdatedNotes().getRows().newRow();
			addNotesGrid(note, row);
		}
	}

	private void addNotesGrid(HospitalAtNightNotesVo note, grdUpdatedNotesRow row) 
	{
		if(note == null)
			return;
		
		if(row == null)
			row = form.grdUpdatedNotes().getRows().newRow();
		
		row.setColDateTime(note.getAuthoringInformationIsNotNull() && note.getAuthoringInformation().getAuthoringDateTimeIsNotNull() ? note.getAuthoringInformation().getAuthoringDateTime().toString() : null);
		row.setTooltipForColDateTime(row.getColDateTime());
		row.setColHCP(note.getAuthoringInformationIsNotNull() && note.getAuthoringInformation().getAuthoringHcpIsNotNull() ? note.getAuthoringInformation().getAuthoringHcp().toString() : null);
		row.setTooltipForColHCP(row.getColHCP());
		row.setColNote(note.getNote());
		row.setTooltipForColNote(row.getColNote());
		
		row.setValue(note);
	}

	private void clearScreen() 
	{
		form.txtSituation().setValue(null);
		form.txtBackground().setValue(null);
		form.txtAssessment().setValue(null);
		form.txtRecommendation().setValue(null);
		
		form.cmbMEWS().setValue(null);
		clearTypeOfRequestGrid();
		form.grdClinicalTask().getRows().clear();
		form.ccRequestingHCP().setValue(null);
		form.dtimRequestingDate().setValue(null);
		form.grdUpdatedNotes().getRows().clear();
		
		form.getGlobalContext().Clinical.setRemoveFromHospitalAtNight(null);
	}

	private void clearTypeOfRequestGrid() 
	{
		for(int i=0; i<form.grdTypeRequest().getRows().size(); i++)
		{
			form.grdTypeRequest().getRows().get(i).setColSelect(false);
		}
	}

	protected void onBtnSaveClick() throws PresentationLogicException 
	{
		if(save(Boolean.TRUE.equals(form.getGlobalContext().Clinical.getRemoveFromHospitalAtNight()) ? HospitalAtNightPatientStatus.REMOVE_FROM_LIST : null))
			open();
	}
	
	private boolean save(HospitalAtNightPatientStatus status) throws PresentationLogicException 
	{
		HospitalAtNightPatientDetailVo details = populateDataFromScreen(form.getLocalContext().getSelectedInstance(), status);
		
		if(details != null && details.getID_HospitalAtNightPatientDetail() == null)
		{
			if(domain.isPatientAlreadyAddedToHospAtNightList(form.getGlobalContext().Core.getPatientShort(), form.getLocalContext().getHospitalAtNightConfig()))
			{
				form.getLocalContext().setErrorMessage(engine.showMessage("Selected patient is already added to Hospital At Night List.", "", MessageButtons.OK, MessageIcon.INFORMATION));
				return false;
			}
		}
		
		String[] errors = details.validate();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try 
		{
			form.getLocalContext().setSelectedInstance(domain.savePatientHospitalAtNight(details));
		} 
		catch (DomainInterfaceException e) 
		{
			e.printStackTrace();
			engine.showMessage(e.getMessage());
			return false;
		} 
		catch (StaleObjectException e) 
		{
			e.printStackTrace();
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}
		
		return true;
	}

	private HospitalAtNightPatientDetailVo populateDataFromScreen(HospitalAtNightPatientDetailVo selectedInstance, HospitalAtNightPatientStatus status) 
	{
		if(selectedInstance == null)
			selectedInstance = new HospitalAtNightPatientDetailVo();
		
		if(selectedInstance.getPatient() == null)
			selectedInstance.setPatient(form.getGlobalContext().Core.getPatientShort());
		
		if(selectedInstance.getCareContext() == null)
			selectedInstance.setCareContext(form.getLocalContext().getInpatientCareContext().getCareContext());
		
		selectedInstance.setSituation(form.txtSituation().getValue());
		selectedInstance.setBackground(form.txtBackground().getValue());
		selectedInstance.setAssessment(form.txtAssessment().getValue());
		selectedInstance.setRecommendation(form.txtRecommendation().getValue());
		selectedInstance.setMEWS(form.cmbMEWS().getValue());
		selectedInstance.setTypeOfRequest(populateDataFromTypeOfRequestGrid());
		
		selectedInstance.setClinicalTasks(getClinicalTasksFromScreen());
		selectedInstance.setRequestingDateTime(form.dtimRequestingDate().getValue());
		selectedInstance.setRequestingHCP(form.ccRequestingHCP().getValue() instanceof HcpLiteVo ? (HcpLiteVo) form.ccRequestingHCP().getValue() : null);
		
		selectedInstance.setNotes(populateDataFromNotesGrid());
		
		if(selectedInstance.getWardWhenPlacedOnList() == null)
		{
			if(form.getLocalContext().getInpatientCareContext().getInpatientEpisode() != null && form.getLocalContext().getInpatientCareContext().getInpatientEpisode().getPasEvent() != null)
			{
				selectedInstance.setWardWhenPlacedOnList(form.getLocalContext().getInpatientCareContext().getInpatientEpisode().getPasEvent().getLocation());
			}
		}
		
		if(selectedInstance.getID_HospitalAtNightPatientDetail() == null)
			status = HospitalAtNightPatientStatus.NEW;
		
		if(status != null)
		{
			HospitalAtNightPatientDetailStatusVo statusVo = new HospitalAtNightPatientDetailStatusVo();
			statusVo.setStatus(status);
			statusVo.setStatusDateTime(new DateTime());
		
			Object mos = domain.getMosUser();
			statusVo.setAuthoringUser(mos instanceof MemberOfStaffLiteVo ? (MemberOfStaffLiteVo) mos : null);
		
			selectedInstance.setCurrentStatus(statusVo);
		
			if(selectedInstance.getStatusHistory() == null)
				selectedInstance.setStatusHistory(new HospitalAtNightPatientDetailStatusVoCollection());
		
			selectedInstance.getStatusHistory().add(statusVo);
		}
		
		if(selectedInstance.getHospitalAtNightListAndDates() == null)
			selectedInstance.setHospitalAtNightListAndDates(new HospitalAtNightListandDatesRefVo());//only to pass the validate
		
		return selectedInstance;
	}

	private HospitalAtNightNotesVoCollection populateDataFromNotesGrid() 
	{
		HospitalAtNightNotesVoCollection notes = new HospitalAtNightNotesVoCollection();
		
		for(int i=0; i<form.grdUpdatedNotes().getRows().size(); i++)
		{
			notes.add(form.grdUpdatedNotes().getRows().get(i).getValue());
		}
		
		return notes.size() > 0 ? notes : null;
	}
	
	private HospitalAtNightRequestType populateDataFromTypeOfRequestGrid() 
	{
		for(int i=0; i<form.grdTypeRequest().getRows().size(); i++)
		{
			if(form.grdTypeRequest().getRows().get(i).getColSelect())
				return form.grdTypeRequest().getRows().get(i).getValue();
		}
		
		return null;
	}

	protected void onBtnCancelClick() throws PresentationLogicException 
	{
		if(form.getLocalContext().getSelectedInstance() != null)
		{
			open();
		}
		else
		{
			engine.close(DialogResult.CANCEL);
		}
	}
	
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.ClinicalNamespace.HospitalAtNightUpdateNotes.NEW:
				newNote();
			break;
			
			case GenForm.ContextMenus.ClinicalNamespace.HospitalAtNightUpdateNotes.EDIT:
				editNote();
			break;	
			
			case GenForm.ContextMenus.ClinicalNamespace.HospitalAtNightClinicalTaskMenu.EDIT:
				editClinicalTasks();
			break;
		}			
	}

	private void editClinicalTasks() 
	{
		form.getGlobalContext().Clinical.setClinicalTasks(getClinicalTasksFromScreen());
		engine.open(form.getForms().Clinical.ClinicalTask);
	}
	
	private HospitalAtNightClinicalTaskCollection getClinicalTasksFromScreen() 
	{
		HospitalAtNightClinicalTaskCollection tasks = new HospitalAtNightClinicalTaskCollection();
		
		for(int i=0; i< form.grdClinicalTask().getRows().size(); i++)
		{
			if(form.grdClinicalTask().getRows().get(i).getValue() instanceof HospitalAtNightClinicalTask)
				tasks.add(form.grdClinicalTask().getRows().get(i).getValue());
		}
		
		return tasks.size() > 0 ? tasks : null;
	}

	private void editNote() 
	{
		form.getGlobalContext().Clinical.setHospitalAtNightNotes(form.grdUpdatedNotes().getValue());
		
		boolean isRecordActive = form.getLocalContext().getSelectedInstanceIsNotNull() && HospitalAtNightPatientStatus.ACTIVE.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus());//	WDEV-13968
		engine.open(form.getForms().Clinical.Notes, new Object[] {isRecordActive});//	WDEV-13968
	}

	private void newNote() 
	{
		form.grdUpdatedNotes().setValue(null);
		form.getGlobalContext().Clinical.setHospitalAtNightNotes(null);
		boolean isRecordActive = form.getLocalContext().getSelectedInstanceIsNotNull() && HospitalAtNightPatientStatus.ACTIVE.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus());//	WDEV-13968
		engine.open(form.getForms().Clinical.Notes, new Object[] {isRecordActive});//	WDEV-13968
	}

	protected void onBtnClinicalTaskClick() throws PresentationLogicException 
	{
		engine.open(form.getForms().Clinical.ClinicalTask);
	}
	
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException 
	{
		if(form.getForms().Clinical.ClinicalTask.equals(formName))
		{
			if(DialogResult.OK.equals(result))
			{
				populateClinicalTasksGrid(form.getGlobalContext().Clinical.getClinicalTasks());
			}
		}
		else if(form.getForms().Clinical.Notes.equals(formName))
		{
			if(DialogResult.OK.equals(result))
			{
				addNotesGrid(form.getGlobalContext().Clinical.getHospitalAtNightNotes(), form.grdUpdatedNotes().getSelectedRow());
				
				populateNotesGrid(form.grdUpdatedNotes().getValues().sort(new HospitalAtNightNotesDateComparator(SortOrder.DESCENDING)));
				
				if(FormMode.VIEW.equals(form.getMode()))
				{
					if(save(Boolean.TRUE.equals(form.getGlobalContext().Clinical.getRemoveFromHospitalAtNight()) ? HospitalAtNightPatientStatus.REMOVE_FROM_LIST : null))
						open();
				}
			}
		}
	}
		
	private void populateClinicalTasksGrid(HospitalAtNightClinicalTaskCollection hospitalAtNightClinicalTaskCollection) 
	{
		form.grdClinicalTask().getRows().clear();
		
		if(hospitalAtNightClinicalTaskCollection == null || hospitalAtNightClinicalTaskCollection.size() == 0)
			return;
		
		for(int i=0; i<hospitalAtNightClinicalTaskCollection.size(); i++)
		{
			grdClinicalTaskRow row = form.grdClinicalTask().getRows().newRow();
			row.setColClinicalTask(hospitalAtNightClinicalTaskCollection.get(i).getText());
			row.setValue(hospitalAtNightClinicalTaskCollection.get(i));
		}	
	}

	protected void onGrdTypeRequestGridCheckBoxClicked(int column,grdTypeRequestRow row, boolean isChecked)	throws PresentationLogicException 
	{
		if(isChecked)
		{
			for(int i=0; i<form.grdTypeRequest().getRows().size(); i++)
			{
				if(!row.getValue().equals(form.grdTypeRequest().getRows().get(i).getValue()))
				{
					form.grdTypeRequest().getRows().get(i).setColSelect(false);
				}
			}
		}
	}
	
	protected void onBtnRemoveFromListClick() throws PresentationLogicException 
	{
		if(save(HospitalAtNightPatientStatus.REMOVE_FROM_LIST))
			open();
	}

	@Override
	protected void onFormModeChanged() 
	{
		updateControlsState();
	}

	private void updateControlsState() 
	{
		boolean isNewStatus = form.getLocalContext().getSelectedInstance() == null || (form.getLocalContext().getSelectedInstanceIsNotNull() && HospitalAtNightPatientStatus.NEW.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus()));
		boolean isNotRemoveFromList = form.getLocalContext().getSelectedInstance() == null || (form.getLocalContext().getSelectedInstanceIsNotNull() && !HospitalAtNightPatientStatus.REMOVE_FROM_LIST.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus()));
		
		form.ccRequestingHCP().setEnabled(FormMode.EDIT.equals(form.getMode()) && isNewStatus);
		
		form.getContextMenus().Clinical.getHospitalAtNightClinicalTaskMenuEDITItem().setVisible(FormMode.EDIT.equals(form.getMode()) && isNewStatus);
		form.getContextMenus().Clinical.getHospitalAtNightUpdateNotesNEWItem().setVisible(form.getLocalContext().getLoggedHCPIsNotNull() && isNotRemoveFromList);
		form.getContextMenus().Clinical.getHospitalAtNightUpdateNotesEDITItem().setVisible(form.getLocalContext().getLoggedHCPIsNotNull() && form.grdUpdatedNotes().getValue() instanceof HospitalAtNightNotesVo && isNotRemoveFromList);
		
		if(FormMode.VIEW.equals(form.getMode()))
		{
			//WDEV-18180
			boolean canAllocateTask = engine.hasRight(AppRight.HAN_CAN_ALLOCATE_TASKS)&& form.getLocalContext().getLoggedHCPIsNotNull() && form.getLocalContext().getSelectedInstanceIsNotNull() && HospitalAtNightPatientStatus.NEW.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus());
			form.btnActive().setVisible(canAllocateTask);
			form.btnRemoveFromList().setVisible(form.getLocalContext().getLoggedHCPIsNotNull() && form.getLocalContext().getSelectedInstanceIsNotNull() && HospitalAtNightPatientStatus.ACTIVE.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus()));//	WDEV-13968
			form.btnEdit().setVisible(form.getLocalContext().getLoggedHCPIsNotNull() && form.getLocalContext().getSelectedInstanceIsNotNull() && HospitalAtNightPatientStatus.NEW.equals(form.getLocalContext().getSelectedInstance().getCurrentStatus().getStatus()));
		}
		else if(FormMode.EDIT.equals(form.getMode()))
		{
			form.txtSituation().setEnabled(isNewStatus);
			form.txtBackground().setEnabled(isNewStatus);
			form.txtAssessment().setEnabled(isNewStatus);
			form.txtRecommendation().setEnabled(isNewStatus);
			form.cmbMEWS().setEnabled(isNewStatus);
			form.grdTypeRequest().setReadOnly(!isNewStatus);
			form.dtimRequestingDate().setEnabled(isNewStatus);
		}
	}

	@Override
	protected void onBtnActiveClick() throws PresentationLogicException 
	{
		if(save(HospitalAtNightPatientStatus.ACTIVE))
			open();
	}

	@Override
	protected void onMessageBoxClosed(int messageBoxId, DialogResult result) throws PresentationLogicException 
	{
		if(form.getLocalContext().getErrorMessageIsNotNull() && form.getLocalContext().getErrorMessage() == messageBoxId)
		{
			if(DialogResult.OK.equals(result))
				engine.close(DialogResult.ABORT);
		}
	}

	@Override
	protected void onBtnEditClick() throws PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onBtnCloseClick() throws PresentationLogicException 
	{
		engine.close(DialogResult.CANCEL);
	}

	@Override
	protected void onGrdUpdatedNotesSelectionChanged() throws PresentationLogicException 
	{
		updateControlsState();
	}
	
	class HospitalAtNightNotesDateComparator implements Comparator<HospitalAtNightNotesVo>
	{
		private int order =1;
		
		public HospitalAtNightNotesDateComparator()
		{
			order = 1;
		}
		
		public HospitalAtNightNotesDateComparator(SortOrder order)
		{
			this.order = SortOrder.DESCENDING.equals(order) ? -1 : 1;
		}
		
		public int compare(HospitalAtNightNotesVo o1, HospitalAtNightNotesVo o2)
		{
			DateTime o1DateTime = o1.getAuthoringInformation() != null ? o1.getAuthoringInformation().getAuthoringDateTime() : null;
			DateTime o2DateTime = o2.getAuthoringInformation() != null ? o2.getAuthoringInformation().getAuthoringDateTime() : null;
			
			if (o1DateTime != null && o2DateTime != null)
			{
				return order * o1DateTime.compareTo(o2DateTime);
			}
			
			if (o1DateTime == null)
				return -1 * order;
			
			if (o2DateTime == null)
				return order;
			
			return 0;
		}
	}
}
