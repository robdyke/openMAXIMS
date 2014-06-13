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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4738.16294)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.core.forms.adtpatientadmission;

import ims.core.vo.AdmissionDetailVo;
import ims.core.vo.CareContextShortVo;
import ims.core.vo.CareContextVo;
import ims.core.vo.EpisodeofCareShortVo;
import ims.core.vo.PatientShort;
import ims.core.vo.enums.ADTAdmissionDetailEvent;
import ims.core.vo.lookups.CareContextStatus;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onlyrADTTabChanged(ims.framework.LayerBridge tab)
	{
		if (FormMode.VIEW.equals(form.getMode()))
		{
			PatientShort patient = domain.getPatient(form.getGlobalContext().Core.getPatientShort());
			form.getGlobalContext().Core.setPatientShort(patient);
			
			AdmissionDetailVo currentAdmissionDet =null;
			CareContextVo tempCareContext = (form.getGlobalContext().Core.getCurrentCareContextIsNotNull() ? domain.getCareContextByCareContextRef(form.getGlobalContext().Core.getCurrentCareContext()) :null );
			
			if (tempCareContext!=null && tempCareContext.getPasEventIsNotNull() && tempCareContext.getCurrentStatusIsNotNull() && CareContextStatus.OPEN.equals(tempCareContext.getCurrentStatus().getStatus()) ) 
			{
				currentAdmissionDet=domain.getAdmissionDetailByPasEvent(form.getGlobalContext().Core.getCurrentCareContext().getPasEvent());
			}
			else if (patient.getWardIsNotNull())
			{
				currentAdmissionDet = domain.getAdmissionDetail(patient);
				
				if (currentAdmissionDet!=null && currentAdmissionDet.getPasEventIsNotNull())
				{
					form.getGlobalContext().Core.setCurrentCareContext(domain.getCareContext(currentAdmissionDet.getPasEvent()));
				}
			}
			
			EpisodeofCareShortVo episodeOfCare = form.getGlobalContext().Core.getEpisodeofCareShort();
			CareContextShortVo careContext = form.getGlobalContext().Core.getCurrentCareContext();
			
    		
			if (tab.equals(form.lyrADT().tabAdmissionDetails()))
    		{
    			form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().initialize(patient, episodeOfCare, careContext, currentAdmissionDet);
    		}
    		else if (tab.equals(form.lyrADT().tabDischargeDetails()))
    		{
    			form.lyrADT().tabDischargeDetails().ccDischargeDetails().initialize(patient, episodeOfCare, careContext, currentAdmissionDet,form.getLocalContext().getIsOpenedFromInpatientListForm());  //wdev-16427
    		}

    		updateControlsState();
		}
	}

	@Override
	protected void onCcAdmissionDetailsValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		if (ADTAdmissionDetailEvent.SAVE.equals(form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().getSelectedEvent()) || ADTAdmissionDetailEvent.CANCEL.equals(form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().getSelectedEvent()))
		{
			form.getLocalContext().setCurrentAdmissionDetail(form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().getValue());
			form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().resetSelectedEvent();
			open();
			return;

		}
		else if (ADTAdmissionDetailEvent.SAVE.equals(form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().getSelectedEvent()))
		{
		
			form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().resetSelectedEvent();
		}
		FormMode admissionDetailMode = form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().getMode();
		form.setMode(admissionDetailMode);
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();

	}

	private void updateControlsState()
	{
		if (FormMode.VIEW.equals(form.getMode()))
		{
			form.lyrADT().tabAdmissionDetails().setHeaderEnabled(true);		
			form.lyrADT().tabDischargeDetails().setHeaderEnabled(true);
		}
		else
		{
			form.lyrADT().tabAdmissionDetails().setHeaderEnabled(form.lyrADT().tabAdmissionDetails().isVisible());
			form.lyrADT().tabDischargeDetails().setHeaderEnabled(form.lyrADT().tabDischargeDetails().isVisible());	
		}

	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		form.getLocalContext().setIsOpenedFromInpatientListForm(null);								//wdev-16427
		if( args != null && args.length == 1 && args[0] != null && args[0] instanceof Boolean )		//wdev-16427
		{
			if( Boolean.TRUE.equals(args[0]))
				form.getLocalContext().setIsOpenedFromInpatientListForm(true);
				
		}
		open();
	}

	private void open()
	{		
		PatientShort patient = domain.getPatient(form.getGlobalContext().Core.getPatientShort());
		form.getGlobalContext().Core.setPatientShort(patient);
		
		AdmissionDetailVo currentAdmissionDet =null;
		CareContextVo tempCareContext = (form.getGlobalContext().Core.getCurrentCareContextIsNotNull() ? domain.getCareContextByCareContextRef(form.getGlobalContext().Core.getCurrentCareContext()) :null );
		
		if (tempCareContext!=null && tempCareContext.getPasEventIsNotNull() && tempCareContext.getCurrentStatusIsNotNull() && CareContextStatus.OPEN.equals(tempCareContext.getCurrentStatus().getStatus()) ) 
		{
			currentAdmissionDet=domain.getAdmissionDetailByPasEvent(form.getGlobalContext().Core.getCurrentCareContext().getPasEvent());
		}
		else if (patient.getWardIsNotNull())
		{
			currentAdmissionDet = domain.getAdmissionDetail(patient);
			
			if (currentAdmissionDet!=null && currentAdmissionDet.getPasEventIsNotNull())
			{
				form.getGlobalContext().Core.setCurrentCareContext(domain.getCareContext(currentAdmissionDet.getPasEvent()));
			}
		}
		
		EpisodeofCareShortVo episodeOfCare = form.getGlobalContext().Core.getEpisodeofCareShort();
		CareContextShortVo careContext = form.getGlobalContext().Core.getCurrentCareContext();
		
		form.lyrADT().tabAdmissionDetails().ccAdmissionDetails().initialize(patient, episodeOfCare, careContext, currentAdmissionDet);
		form.lyrADT().tabDischargeDetails().ccDischargeDetails().initialize(patient, episodeOfCare, careContext, currentAdmissionDet,form.getLocalContext().getIsOpenedFromInpatientListForm()); //wdev-16427
		
		if( form.getLocalContext().getIsOpenedFromInpatientListFormIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsOpenedFromInpatientListForm())) //wdev-16427
		{
			form.lyrADT().tabDischargeDetails().ccDischargeDetails().setMode(FormMode.EDIT);
			form.lyrADT().showtabDischargeDetails();
			form.setMode(FormMode.EDIT);
			
		}
		else
		
			form.setMode(FormMode.VIEW);
		
	}

	//wdev-16427
	protected void onCcDischargeDetailsValueChanged() throws PresentationLogicException
	{
		if( ADTAdmissionDetailEvent.SAVE.equals(form.lyrADT().tabDischargeDetails().ccDischargeDetails().getSelectedEvent()) || ADTAdmissionDetailEvent.CANCEL.equals(form.lyrADT().tabDischargeDetails().ccDischargeDetails().getSelectedEvent()) || ADTAdmissionDetailEvent.UNDODISCHARGE.equals(form.lyrADT().tabDischargeDetails().ccDischargeDetails().getSelectedEvent()))
		{
			form.lyrADT().tabDischargeDetails().ccDischargeDetails().resetSelectedEvent();
			open();
			return;

		}
		else if( ADTAdmissionDetailEvent.SAVEANDCLOSE.equals(form.lyrADT().tabDischargeDetails().ccDischargeDetails().getSelectedEvent()))
		{
		
			form.lyrADT().tabDischargeDetails().ccDischargeDetails().resetSelectedEvent();
			engine.open(form.getForms().Core.InpatientList);
			return;
		}
		else if( ADTAdmissionDetailEvent.CANCELANDCLOSE.equals(form.lyrADT().tabDischargeDetails().ccDischargeDetails().getSelectedEvent()))
		{
		
			form.lyrADT().tabDischargeDetails().ccDischargeDetails().resetSelectedEvent();
			engine.open(form.getForms().Core.InpatientList);
			return;
		}
		FormMode dischargeDetailMode = form.lyrADT().tabDischargeDetails().ccDischargeDetails().getMode();
		form.setMode(dischargeDetailMode);
		
	}
}