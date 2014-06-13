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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.oncology.domain.impl;

import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.domain.DomainFactory;
import ims.oncology.domain.base.impl.BasePatientsTreatmentPlanActionsDialogImpl;
import ims.oncology.vo.PatTreatmentPlanRadiotherapyDialogVoCollection;
import ims.oncology.vo.RadiotherapyDetailsLiteDialogVoCollection;
import ims.oncology.vo.domain.PatTreatmentPlanRadiotherapyDialogVoAssembler;
import ims.oncology.vo.domain.RadiotherapyDetailsLiteDialogVoAssembler;

import java.util.ArrayList;
import java.util.List;

public class PatientsTreatmentPlanActionsDialogImpl extends BasePatientsTreatmentPlanActionsDialogImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* listPatient Diary Events
	*/
	public PatTreatmentPlanRadiotherapyDialogVoCollection listActivePatTreatMentPlans(ims.core.patient.vo.PatientRefVo patient, EpisodeOfCareRefVo episode)
	{
		DomainFactory factory = getDomainFactory();
		String hql;
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		
		hql = " select tp from PatTreatmentPlan tp left join tp.actions as acts"; 
		StringBuffer condStr = new StringBuffer();
		String andStr = " and ";
		
		condStr.append(" tp.activeStatus = :isActive");
		markers.add("isActive");
		values.add(Boolean.TRUE);
	
		condStr.append(andStr + " tp.patient.id = :patID");
		markers.add("patID");
		values.add(patient.getID_Patient());
		andStr = " and ";	
		
		condStr.append(andStr + " tp.episode.id = :episID");
		markers.add("episID");
		values.add(episode.getID_EpisodeOfCare());
		
		condStr.append(andStr + " acts.active = :isActionActive");
		markers.add("isActionActive");
		values.add(Boolean.TRUE);
		

		condStr.append(andStr + " acts.activityGroup = -104");
		
		condStr.append(andStr + " acts.id not in (select actions.id from RadiotherapyDetails as rd left join rd.careContext as cc left join cc.episodeOfCare as ep left join ep.careSpell as cs left join rd.associatedTreatmentPlanAction as actions where cs.patient.id = :patID2 and rd.associatedTreatmentPlanAction is not null) "); 
		markers.add("patID2");
		values.add(patient.getID_Patient());
		
		hql += " where ";
		
		hql += condStr.toString();
		List ops = factory.find(hql, markers, values);
		
		return PatTreatmentPlanRadiotherapyDialogVoAssembler.createPatTreatmentPlanRadiotherapyDialogVoCollectionFromPatTreatmentPlan(ops).sort();
	}

	public RadiotherapyDetailsLiteDialogVoCollection listActionsAlreadyLinkedToRadiotherapy(PatientRefVo patientRefVo) 
	{
		DomainFactory factory = getDomainFactory();
		String hql;
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		
		hql = " select rt from RadiotherapyDetails rt "; 
		StringBuffer condStr = new StringBuffer();
		
		condStr.append(" rt.episodeOfCare.careSpell.patient.id = :patID");
		markers.add("patID");
		values.add(patientRefVo.getID_Patient());
		
		hql += " where ";
		
		hql += condStr.toString();
		List ops = factory.find(hql, markers, values);
		
		return RadiotherapyDetailsLiteDialogVoAssembler.createRadiotherapyDetailsLiteDialogVoCollectionFromRadiotherapyDetails(ops);
	}
}