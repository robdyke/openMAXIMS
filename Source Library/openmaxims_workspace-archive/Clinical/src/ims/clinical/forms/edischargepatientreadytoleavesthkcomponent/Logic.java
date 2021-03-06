//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.71 build 3945.19817)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.edischargepatientreadytoleavesthkcomponent;

import ims.clinical.vo.DischargeDetailsVo;
import ims.clinical.vo.DischargeReadyToLeaveVo;
import ims.clinical.vo.EDischargeSTHKSummaryVo;
import ims.clinical.vo.NurseEnabledInstructionsVo;
import ims.clinical.vo.enums.EDischargeLastEvent;
import ims.clinical.vo.lookups.DischargeLetterStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.CareContextShortVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.GP;
import ims.core.vo.Hcp;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.enums.MosType;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.HcpDisType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.edischarge.vo.SummaryRefVo;
import ims.framework.enumerations.FormMode;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.vo.interfaces.IMos;

import java.util.ArrayList;
import java.util.Arrays;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	private String urlQueryServer = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
	private String urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();

	@Override
	protected void onFormModeChanged()
	{
		if (form.getMode().equals(FormMode.EDIT))
		{
			form.btnSave().setVisible(true);
			activatedeactivatecontrols(true);
			
			form.btnPrintDisch().setEnabled(false);
			form.btnPrintDisch().setVisible(false);
			form.hint2().setVisible(false);
			form.lblLetterGiven().setVisible(false);
			form.chkLetterGiven().setVisible(false);
			
			form.chkComplete().setEnabled(form.dtimDODisch().getValue() != null);
		}
		else if (form.getMode().equals(FormMode.VIEW))
		{
			form.btnEdit().setVisible(true);// form.getLocalContext().getisReadonly()
											// == false ? true : false);
			form.btnEdit().setEnabled(true);// form.getLocalContext().getisReadonly()
											// == false ? true : false);
		}
	}
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setisReadonly(false);
		form.setMode(FormMode.VIEW);
		
	}
	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
	}
	@Override
	protected void onBtnPrintDischClick() throws ims.framework.exceptions.PresentationLogicException
	{
		buildReport();
		
		if (form.getMode().equals(FormMode.VIEW)
			&& form.getLocalContext().getisReadonlyIsNotNull() 
			&& form.getLocalContext().getisReadonly())
			return;
		
		if (form.getMode().equals(FormMode.VIEW))
			editData();
		
		open();
		manageCheckBox(true, true);
	}
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		editData();
	}

	private void editData() 
	{
		form.setMode(FormMode.EDIT);

		
		if (form.getLocalContext().getSelectedRecordIsNotNull()
			&& form.getLocalContext().getSelectedRecord().getID_ReadyToLeave() == null)
		{
			Hcp hcpVo = (Hcp)domain.getHcpUser();
			if (hcpVo != null
				&& hcpVo.getHcpTypeIsNotNull()
				&& hcpVo.getHcpType().equals(HcpDisType.NURSING))
				form.ccDischNurseorMidwife().setValue(hcpVo);
			
			form.dtimDischMidf().setValue(new DateTime());
		}
		
		form.getGlobalContext().Clinical.seteDischargeDisableTabs(true);
		form.getLocalContext().setLastEvent(null);
		form.fireCustomControlValueChanged();
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
		{
			open();
			form.getLocalContext().setLastEvent(EDischargeLastEvent.EDISCHARGE_SAVE);
			form.fireCustomControlValueChanged();
		}
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
		open();

		form.getGlobalContext().Clinical.seteDischargeDisableTabs(false);
		form.getLocalContext().setLastEvent(null);

		form.fireCustomControlValueChanged();
	}
	public void initialise(SummaryRefVo summary)
	{
		form.getLocalContext().setSTHKSummary(summary);
		initialise();
	}

	public void initialise()
	{
		initializeComponent();
		open();
	}

	public void setReadOnly()
	{
		form.getLocalContext().setisReadonly(true);
		manageReadOnly();
	}

	private void manageReadOnly()
	{
		if (form.getMode().equals(FormMode.VIEW))
			form.btnEdit().setVisible(true);

		if (form.getMode().equals(FormMode.VIEW)
			&& form.getLocalContext().getisReadonlyIsNotNull() 
			&& form.getLocalContext().getisReadonly())
			form.btnEdit().setVisible(false);
			
		if (form.getLocalContext().getisReadonlyIsNotNull() 
			&& form.getLocalContext().getisReadonly() 
			&& form.getMode().equals(FormMode.EDIT))
		{
			activatedeactivatecontrols(form.getMode().equals(FormMode.EDIT));
		}
	}

	private void activatedeactivatecontrols(boolean mode)
	{
		form.txtNurseEnabledConfirmation().setEnabled(mode);
		form.txtCommentsfromPatient().setEnabled(mode);
		form.btnPrintDisch().setEnabled(mode);
		form.ccDischNurseorMidwife().setMode(FormMode.EDIT);
		form.ccDischNurseorMidwife().setEnabled(mode);
		form.dtimDischMidf().setEnabled(mode);

		if (FormMode.EDIT.equals(form.getMode()))
			form.btnSave().setVisible(mode);

		form.btnSave().setEnabled(mode);

		manageCheckBox(form.getLocalContext().getSelectedRecord().getHasPatientReceivedCopyOfDischargeIsNotNull(), mode);
		
		checkIfCheckBoxShouldBeDisplayedAnyway(form.getLocalContext().getSelectedRecord());
	}

	private void checkIfCheckBoxShouldBeDisplayedAnyway(DischargeReadyToLeaveVo voReady) 
	{
		GP voGP = domain.getPatientsGP(form.getGlobalContext().Core.getPatientShort());
		boolean hasEmail = false;
		if (voGP != null && voGP.getCommChannel(ChannelType.EMAIL) != null)
			hasEmail = true;
			
		DischargeDetailsVo volocalDD = domain.getDischargeDetails(form.getGlobalContext().Core.getCurrentCareContext());
		form.getLocalContext().setCurrentDischargeDetailsVo(volocalDD);

		if ( !hasEmail
			&& volocalDD != null
			&& volocalDD.getDischargeLetterStatusIsNotNull()
			&& volocalDD.getDischargeLetterStatus().equals(DischargeLetterStatus.GENERATED)
			&& (voReady.getHasPatientReceivedCopyOfDischarge() == null
					|| (voReady.getHasPatientReceivedCopyOfDischargeIsNotNull()	&&  ! voReady.getHasPatientReceivedCopyOfDischarge()) ) )
		{
			form.chkLetterGiven().setVisible(true);
			form.lblLetterGiven().setVisible(true);
			
			if (form.getMode().equals(FormMode.EDIT))
				form.chkLetterGiven().setEnabled(true);
		}
		
	}

	public void initializeComponent()
	{
		form.ccDischNurseorMidwife().initialize(MosType.HCP, HcpDisType.NURSING);
		clearInstanceControls();

		form.getGlobalContext().Clinical.seteDischargeCompleted(false);

		form.getLocalContext().setisReadonly(false);
		form.getLocalContext().setLastEvent(null);
	}

	public void open()
	{
		clearInstanceControls();

		manageCheckBox(false, false);

		DischargeReadyToLeaveVo voReady = domain.getReadyToLeave(form.getGlobalContext().Core.getCurrentCareContext());
		if (voReady != null)
		{
			if(voReady.getDischargeDetailsIsNotNull()
				&& voReady.getDischargeDetails().getNurseEnabledInstructions() == null)
			{
				NurseEnabledInstructionsVo voNrs  = domain.getNurseEnabledInstructions(form.getGlobalContext().Core.getCurrentCareContext());
				if(voNrs != null)
					voReady.getDischargeDetails().setNurseEnabledInstructions(voNrs);
			}

			form.getLocalContext().setisReadonly(voReady.getCompletedOnIsNotNull() ? true : false);
			populateScreenFromData(voReady);

			if (voReady.getDischargeDetailsIsNotNull()
					&& voReady.getDischargeDetails().getDischargingConsultant() == null
					&& voReady.getDischargeDetails().getDischargingSpecialty() == null
					&& voReady.getDischargeDetails().getDateOfDischarge() == null
					&& voReady.getDischargeDetails().getMethodOfDischarge() == null
					&& voReady.getDischargeDetails().getDischargeDestination() == null
					&& voReady.getDischargeDetails().getDischargingWard() == null)
				loadDischargedEpisode();
		}

		EDischargeSTHKSummaryVo voSumm = domain.getCurrentSummary(form.getGlobalContext().Core.getCurrentCareContext());
		if (form.getMode().equals(FormMode.VIEW))
		{
			form.btnPrintDisch().setEnabled(false);
			form.btnPrintDisch().setVisible(false);
			form.hint2().setVisible(false);
			form.lblLetterGiven().setVisible(false);
			form.chkLetterGiven().setVisible(false);

			if(voSumm != null
				&& voSumm.isSummaryRecordComplete())
			{
				form.btnPrintDisch().setEnabled(true);
				form.btnPrintDisch().setVisible(true);
				form.hint2().setVisible(true);
				form.lblLetterGiven().setVisible(true);
				form.chkLetterGiven().setVisible(true);
				form.chkLetterGiven().setEnabled(false);
			}
		}
		
		if (voReady == null)
		{
			DischargeDetailsVo voDD = domain.getDischargeDetails(form.getGlobalContext().Core.getCurrentCareContext());
			if (voDD != null)
			{
				voReady = new DischargeReadyToLeaveVo();
				if(voDD.getNurseEnabledInstructions() == null)
				{
					NurseEnabledInstructionsVo voNrs  = domain.getNurseEnabledInstructions(form.getGlobalContext().Core.getCurrentCareContext());
					if(voNrs != null)
						voDD.setNurseEnabledInstructions(voNrs);
				}

				voReady.setDischargeDetails(voDD);

				if(voDD.getNurseEnabledInstructions() != null)
					form.txtNurseEnabledDischargeInstruction().setValue(voDD.getNurseEnabledInstructions().getNurseEnabledInstructions());

				loadDischargedEpisode();
			}
			
			
		}
		//WDEV-12797
		DateTime dateTimeAdmission = domain.getAdmissionDateTimeFromAdmissionDetail(form.getGlobalContext().Core.getCurrentCareContext(), form.getGlobalContext().Core.getPatientShort());
		if (dateTimeAdmission != null)
			form.dtimAdmission().setValue(dateTimeAdmission);
		
		form.getLocalContext().setSelectedRecord(voReady);

		manageReadOnly();
	}

	private void loadDischargedEpisode()
	{
		DischargedEpisodeVo voDischargedEpisode = domain.getDischargedEpisodeDetails(form.getGlobalContext().Core.getCurrentCareContext(), form.getGlobalContext().Core.getPatientShort());
		if (voDischargedEpisode != null)
		{
			form.cmbDischMethod().setValue(voDischargedEpisode.getMethodOfDischarge());
			form.cmbDischDest().setValue(voDischargedEpisode.getDischargeDestination());
			form.dtimDODisch().setValue(voDischargedEpisode.getDischargeDateTime());
			if (voDischargedEpisode.getPasEventIsNotNull())
			{
				HcpLiteVo completingHcp = domain.getHcp(voDischargedEpisode.getPasEvent().getConsultant());
				form.cmbDischCons().newRow(completingHcp, completingHcp.getName().toString());
				form.cmbDischCons().setValue(completingHcp);
			}
			form.cmbDischSpec().setValue(voDischargedEpisode.getPasEventIsNotNull() ? voDischargedEpisode.getPasEvent().getSpecialty() : null);
			if (voDischargedEpisode.getPasEventIsNotNull()
				&& voDischargedEpisode.getPasEvent().getLocationIsNotNull())
			{
				form.cmbDischWard().newRow(voDischargedEpisode.getPasEvent().getLocation(), voDischargedEpisode.getPasEvent().getLocation().getName());
				form.cmbDischWard().setValue(voDischargedEpisode.getPasEvent().getLocation());
			}
		}
	}

	private String buildReport()
	{
		CareContextShortVo currentCareContext = form.getGlobalContext().Core.getCurrentCareContext();
		Object[] obj = null;
		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, engine.getSessionId());
		String url = "";

		Integer reportID = 247;
		obj = domain.getSystemReportAndTemplate(reportID);
		client.addSeed(new SeedValue("CARE_CONTEXT", currentCareContext.getID_CareContext(), Integer.class));

		if (obj == null || obj.length < 2)
		{
			engine.showMessage("I could not get the report and template !");
			return "";
		}

		if (obj[0] == null || obj[1] == null)
		{
			engine.showMessage("The report has not been deployed !");
			return "";
		}

		try
		{
			url = client.buildReportAsUrl((String) obj[0], (String) obj[1], urlReportServer, "PDF", "", 1);
			if (url != null)
			{
				engine.openUrl(url);
			}
		}
		catch (QueryBuilderClientException e1)
		{
			engine.showMessage("Error creating report: " + e1.getMessage());
			return "";
		}
		return "";
	}

	private void manageCheckBox(boolean bShow, boolean bEnable) 
	{
		form.chkLetterGiven().setVisible(bShow);
		form.chkLetterGiven().setEnabled(bEnable);
		form.lblLetterGiven().setVisible(bShow);
	}

	private void populateScreenFromData(DischargeReadyToLeaveVo voReady)
	{
		if (voReady == null)
			return;
		
		form.txtNurseEnabledDischargeInstruction().setValue((voReady.getDischargeDetailsIsNotNull()&& voReady.getDischargeDetails().getNurseEnabledInstructionsIsNotNull())? voReady.getDischargeDetails().getNurseEnabledInstructions().getNurseEnabledInstructions() : null);
		form.txtNurseEnabledConfirmation().setValue(voReady.getNurseEnabledDischargeConfirmation());
		form.txtCommentsfromPatient().setValue(voReady.getCommentsFromPatient());
		//WDEV-12797 form.dtimAdmission().setValue(voReady.getAdmittedOnIsNotNull() && voReady.getAdmittedTimeIsNotNull()? new DateTime(voReady.getAdmittedOn(), voReady.getAdmittedTime()) : null);
		form.dtimDODisch().setValue(voReady.getCompletedOnIsNotNull() ? voReady.getCompletedOn() : null);
		form.dtimDischMidf().setValue(voReady.getClinicalDischargeDateTimeIsNotNull() ? voReady.getClinicalDischargeDateTime() : null);
		form.ccDischNurseorMidwife().setValue(voReady.getDischargingNurseIsNotNull() ? voReady.getDischargingNurse() : null);
		form.cmbDischMethod().setValue(voReady.getDischargeDetailsIsNotNull() ? voReady.getDischargeDetails().getMethodOfDischarge() : null);
		form.cmbDischDest().setValue(voReady.getDischargeDetailsIsNotNull() ? voReady.getDischargeDetails().getDischargeDestination() : null);

		if (voReady.getHasPatientReceivedCopyOfDischargeIsNotNull())
		{
			form.chkLetterGiven().setValue(voReady.getHasPatientReceivedCopyOfDischarge());
			manageCheckBox(true, false);
		}

		form.chkComplete().setValue(voReady.getIsComplete());

		//check if the gps have email and if letter status is IN_PROGRESS / GENERATED and HasPatientReceivedCopyOfDischarge == null
		checkIfCheckBoxShouldBeDisplayedAnyway(voReady);
		
		if (voReady.getDischargeDetailsIsNotNull())
		{
			DischargeDetailsVo voDisch = voReady.getDischargeDetails();

			if (voDisch.getDischargingConsultantIsNotNull())
			{
				form.cmbDischCons().newRow(voDisch.getDischargingConsultant(), voDisch.getDischargingConsultant().getName().toString());
				form.cmbDischCons().setValue(voDisch.getDischargingConsultant());
			}
			form.cmbDischSpec().setValue(voDisch.getDischargingSpecialtyIsNotNull() ? voDisch.getDischargingSpecialty() : null);
			form.dtimDODisch().setValue(voDisch.getDateOfDischargeIsNotNull() ? voDisch.getDateOfDischarge() : null);
			form.cmbDischMethod().setValue(voDisch.getMethodOfDischargeIsNotNull() ? voDisch.getMethodOfDischarge() : null);
			form.cmbDischDest().setValue(voDisch.getDischargeDestinationIsNotNull() ? voDisch.getDischargeDestination() : null);
			if (voDisch.getDischargingWardIsNotNull())
			{
				form.cmbDischWard().newRow(voDisch.getDischargingWard(), voDisch.getDischargingWard().getName());
				form.cmbDischWard().setValue(voDisch.getDischargingWard());
			}
		}

	}


	private void clearInstanceControls()
	{
		form.txtNurseEnabledDischargeInstruction().setValue(null);
		form.txtNurseEnabledConfirmation().setValue(null);
		form.txtCommentsfromPatient().setValue(null);
		form.dtimDODisch().setValue(null);
		form.cmbDischMethod().setValue(null);
		form.cmbDischDest().setValue(null);
		form.cmbDischCons().setValue(null);
		form.cmbDischSpec().setValue(null);
		form.cmbDischWard().setValue(null);
		form.ccDischNurseorMidwife().setValue(null);
		form.dtimDischMidf().setValue(null);
		form.chkLetterGiven().setValue(false);
		form.chkComplete().setValue(null);
	}

	private DischargeReadyToLeaveVo populateDataFromScreen()
	{
		DischargeReadyToLeaveVo voReady = null;
		if (form.getLocalContext().getSelectedRecordIsNotNull())
			voReady = form.getLocalContext().getSelectedRecord();
		else
			voReady = new DischargeReadyToLeaveVo();

		if (voReady.getCareContext() == null)
			voReady.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());

		voReady.setNurseEnabledDischargeConfirmation(form.txtNurseEnabledConfirmation().getValue());
		voReady.setCommentsFromPatient(form.txtCommentsfromPatient().getValue());
		voReady.setClinicalDischargeDateTime(form.dtimDischMidf().getValue());
		IMos iHcp = form.ccDischNurseorMidwife().getValue();
		if (iHcp != null)
		{
			HcpLiteVo dischHcp = domain.getHcp((HcpRefVo) iHcp);
			voReady.setDischargingNurse(dischHcp);
		}
		else
			voReady.setDischargingNurse(null);

		if (voReady.getAuthoringInfo() == null)
		{
			AuthoringInformationVo voAuth = new AuthoringInformationVo();
			voAuth.setAuthoringDateTime(new DateTime());
			voAuth.setAuthoringHcp((HcpLiteVo)domain.getHcpLiteUser());
					
			voReady.setAuthoringInfo(voAuth);
		}
		
		if (form.chkLetterGiven().isVisible())
			voReady.setHasPatientReceivedCopyOfDischarge(form.chkLetterGiven().getValue());

		voReady.setAdmittedOn(form.dtimAdmission().getValue() != null ? form.dtimAdmission().getValue().getDate() : null);
		voReady.setAdmittedTime(form.dtimAdmission().getValue() != null ? form.dtimAdmission().getValue().getTime() : null);
		
		voReady.setIsComplete(form.chkComplete().getValue());
		
		DischargeDetailsVo voDisch = null;
		if (form.getLocalContext().getSelectedRecordIsNotNull() && voReady.getDischargeDetailsIsNotNull())
			voDisch = form.getLocalContext().getSelectedRecord().getDischargeDetails();
		else
			voDisch = new DischargeDetailsVo();

		if (voDisch != null)
		{
			voDisch.setDischargingConsultant(form.cmbDischCons().getValue());
			voDisch.setDischargingSpecialty(form.cmbDischSpec().getValue());

			if (voDisch.getCareContext() == null)
				voDisch.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());

			voDisch.setDateOfDischarge(form.dtimDODisch().getValue());
			voDisch.setMethodOfDischarge(form.cmbDischMethod().getValue());
			voDisch.setDischargeDestination(form.cmbDischDest().getValue());
			voDisch.setDischargingWard(form.cmbDischWard().getValue());
			
			voReady.setDischargeDetails(voDisch);
		}

		return voReady;
	}

	private boolean save()
	{
		DischargeReadyToLeaveVo voReady = populateDataFromScreen();
		String[] str = null;
		if (voReady.getAuthoringInfo() == null)
		{
			str = new String[] { "Authoring HCP and Authoring Date/Time are mandatory" };
		}
		str = voReady.validate(validateUIRules(str));
		if (str != null && str.length > 0)
		{
			engine.showErrors(str);
			return false;
		}

		try
		{
			voReady = domain.saveReadyToLeave(voReady, form.getLocalContext().getSTHKSummary());
		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage(e.getMessage());
			open();
			form.setMode(FormMode.VIEW);
			return false;
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());

			form.setMode(FormMode.VIEW);
			open();
			form.getLocalContext().setLastEvent(EDischargeLastEvent.EDISCHARGE_SAVE);
			form.getGlobalContext().Clinical.seteDischargeDisableTabs(false);
			form.fireCustomControlValueChanged();

			return false;
		}
		form.getLocalContext().setSelectedRecord(voReady);

		if (voReady.getCompletedOnIsNotNull())
		{
			setReadOnly();
			form.getGlobalContext().Clinical.seteDischargeCompleted(true);
		}
		else
		{
			form.getGlobalContext().Clinical.seteDischargeCompleted(false);
			form.getLocalContext().setisReadonly(false);
		}
		//WDEV-11822 - Start
		if (voReady.getIsComplete())
		{
			String message = domain.getDisplayStringAfterSave(form.getLocalContext().getSTHKSummary());
			if (message != null)
			{
				engine.showMessage(message);
			}
		}
		//WDEV-11822 - End
		
		form.setMode(FormMode.VIEW);
		form.getGlobalContext().Clinical.seteDischargeDisableTabs(false);
		form.fireCustomControlValueChanged();

		return true;
	}

	@SuppressWarnings("deprecation")
	private String[] validateUIRules(String[] previousErrors)
	{
		ArrayList<String> errors = new ArrayList<String>();
		if (previousErrors != null && previousErrors.length > 0)
		{

			errors.addAll(Arrays.asList(previousErrors));
		}
		if (form.dtimDODisch().getValue() != null)
		{
			PartialDate pDOB;
			if (form.getGlobalContext().Core.getPatientShortIsNotNull() && form.getGlobalContext().Core.getPatientShort().getDobIsNotNull())
			{
				pDOB = form.getGlobalContext().Core.getPatientShort().getDob();
				Integer day = pDOB.getDay();
				if (day == null)
					day = 1;
				Integer month = pDOB.getMonth();
				if (month == null)
					month = 1;
				
				DateTime dtimDOB = new DateTime(new Date(pDOB.getYear()-1900,month-1,day));	
				
				if (form.dtimDODisch().getValue().isLessThan(dtimDOB))
				{
					errors.add("Discharge Date cannot be before patient DOB");
				}
			}
			if (form.dtimDODisch().getValue().isGreaterThan(new DateTime()))
			{
				errors.add("Discharge Date cannot be in the future");
			}
		}
		
		if (errors != null && errors.size() > 0)
		{
			String[] result = new String[errors.size()];
			errors.toArray(result);
			return result;
		}
		return null;
	}

	public void refresh() 
	{
		open();
	}
	public EDischargeLastEvent getLastEvent() 
	{
		return form.getLocalContext().getLastEvent();
	}
	public void clearLastEvent() 
	{
		form.getLocalContext().setLastEvent(null);
	}

}
