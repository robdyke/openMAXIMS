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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

/**
 * Linked to RefMan.PatientElectiveList business object (ID: 1014100020).
 */
public class PatientElevectiveListManagementVo extends ims.RefMan.vo.PatientElectiveListRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientElevectiveListManagementVo()
	{
	}
	public PatientElevectiveListManagementVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientElevectiveListManagementVo(ims.RefMan.vo.beans.PatientElevectiveListManagementVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.referral = bean.getReferral() == null ? null : bean.getReferral().buildVo();
		this.consultant = bean.getConsultant() == null ? null : bean.getConsultant().buildVo();
		this.dateonlist = bean.getDateOnList() == null ? null : bean.getDateOnList().buildDate();
		this.electiveadmissiontype = bean.getElectiveAdmissionType() == null ? null : ims.RefMan.vo.lookups.ElectiveAdmissionType.buildLookup(bean.getElectiveAdmissionType());
		this.intendedmanagement = bean.getIntendedManagement() == null ? null : ims.core.vo.lookups.ManagementIntention.buildLookup(bean.getIntendedManagement());
		this.anticipatedstay = bean.getAnticipatedStay();
		if(bean.getSuspensions() != null)
		{
			this.suspensions = new ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection();
			for(int suspensions_i = 0; suspensions_i < bean.getSuspensions().length; suspensions_i++)
			{
				this.suspensions.add(new ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVo(new Integer(bean.getSuspensions()[suspensions_i].getId()), bean.getSuspensions()[suspensions_i].getVersion()));
			}
		}
		this.operativeprocedurestatus = bean.getOperativeProcedureStatus();
		this.primaryprocedure = bean.getPrimaryProcedure() == null ? null : bean.getPrimaryProcedure().buildVo();
		if(bean.getOtherProcedures() != null)
		{
			this.otherprocedures = new ims.core.clinical.vo.ProcedureRefVoCollection();
			for(int otherprocedures_i = 0; otherprocedures_i < bean.getOtherProcedures().length; otherprocedures_i++)
			{
				this.otherprocedures.add(new ims.core.clinical.vo.ProcedureRefVo(new Integer(bean.getOtherProcedures()[otherprocedures_i].getId()), bean.getOtherProcedures()[otherprocedures_i].getVersion()));
			}
		}
		if(bean.getTCIHistory() != null)
		{
			this.tcihistory = new ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection();
			for(int tcihistory_i = 0; tcihistory_i < bean.getTCIHistory().length; tcihistory_i++)
			{
				this.tcihistory.add(new ims.RefMan.vo.TCIForPatientElectiveListRefVo(new Integer(bean.getTCIHistory()[tcihistory_i].getId()), bean.getTCIHistory()[tcihistory_i].getVersion()));
			}
		}
		this.interpretatorrequired = bean.getInterpretatorRequired();
		if(bean.getNotes() != null)
		{
			this.notes = new ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection();
			for(int notes_i = 0; notes_i < bean.getNotes().length; notes_i++)
			{
				this.notes.add(new ims.RefMan.vo.NotesForPatientElectiveListRefVo(new Integer(bean.getNotes()[notes_i].getId()), bean.getNotes()[notes_i].getVersion()));
			}
		}
		this.erod = bean.getEROD() == null ? null : new ims.RefMan.vo.ReferralERODRefVo(new Integer(bean.getEROD().getId()), bean.getEROD().getVersion());
		if(bean.getERODHistory() != null)
		{
			this.erodhistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
			for(int erodhistory_i = 0; erodhistory_i < bean.getERODHistory().length; erodhistory_i++)
			{
				this.erodhistory.add(new ims.RefMan.vo.ReferralERODRefVo(new Integer(bean.getERODHistory()[erodhistory_i].getId()), bean.getERODHistory()[erodhistory_i].getVersion()));
			}
		}
		this.tcidetails = bean.getTCIDetails() == null ? null : bean.getTCIDetails().buildVo();
		this.electivelist = bean.getElectiveList() == null ? null : bean.getElectiveList().buildVo();
		this.electiveliststatus = bean.getElectiveListStatus() == null ? null : bean.getElectiveListStatus().buildVo();
		this.patientstatus = bean.getPatientStatus() == null ? null : ims.RefMan.vo.lookups.CatsReferralCategory.buildLookup(bean.getPatientStatus());
		this.electivelistreason = bean.getElectiveListReason() == null ? null : ims.emergency.vo.lookups.ElectiveListReason.buildLookup(bean.getElectiveListReason());
		this.proclaterality = bean.getProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getProcLaterality());
		this.creatingappointment = bean.getCreatingAppointment() == null ? null : bean.getCreatingAppointment().buildVo();
		this.priority = bean.getPriority() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getPriority());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.PatientElevectiveListManagementVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.referral = bean.getReferral() == null ? null : bean.getReferral().buildVo(map);
		this.consultant = bean.getConsultant() == null ? null : bean.getConsultant().buildVo(map);
		this.dateonlist = bean.getDateOnList() == null ? null : bean.getDateOnList().buildDate();
		this.electiveadmissiontype = bean.getElectiveAdmissionType() == null ? null : ims.RefMan.vo.lookups.ElectiveAdmissionType.buildLookup(bean.getElectiveAdmissionType());
		this.intendedmanagement = bean.getIntendedManagement() == null ? null : ims.core.vo.lookups.ManagementIntention.buildLookup(bean.getIntendedManagement());
		this.anticipatedstay = bean.getAnticipatedStay();
		if(bean.getSuspensions() != null)
		{
			this.suspensions = new ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection();
			for(int suspensions_i = 0; suspensions_i < bean.getSuspensions().length; suspensions_i++)
			{
				this.suspensions.add(new ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVo(new Integer(bean.getSuspensions()[suspensions_i].getId()), bean.getSuspensions()[suspensions_i].getVersion()));
			}
		}
		this.operativeprocedurestatus = bean.getOperativeProcedureStatus();
		this.primaryprocedure = bean.getPrimaryProcedure() == null ? null : bean.getPrimaryProcedure().buildVo(map);
		if(bean.getOtherProcedures() != null)
		{
			this.otherprocedures = new ims.core.clinical.vo.ProcedureRefVoCollection();
			for(int otherprocedures_i = 0; otherprocedures_i < bean.getOtherProcedures().length; otherprocedures_i++)
			{
				this.otherprocedures.add(new ims.core.clinical.vo.ProcedureRefVo(new Integer(bean.getOtherProcedures()[otherprocedures_i].getId()), bean.getOtherProcedures()[otherprocedures_i].getVersion()));
			}
		}
		if(bean.getTCIHistory() != null)
		{
			this.tcihistory = new ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection();
			for(int tcihistory_i = 0; tcihistory_i < bean.getTCIHistory().length; tcihistory_i++)
			{
				this.tcihistory.add(new ims.RefMan.vo.TCIForPatientElectiveListRefVo(new Integer(bean.getTCIHistory()[tcihistory_i].getId()), bean.getTCIHistory()[tcihistory_i].getVersion()));
			}
		}
		this.interpretatorrequired = bean.getInterpretatorRequired();
		if(bean.getNotes() != null)
		{
			this.notes = new ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection();
			for(int notes_i = 0; notes_i < bean.getNotes().length; notes_i++)
			{
				this.notes.add(new ims.RefMan.vo.NotesForPatientElectiveListRefVo(new Integer(bean.getNotes()[notes_i].getId()), bean.getNotes()[notes_i].getVersion()));
			}
		}
		this.erod = bean.getEROD() == null ? null : new ims.RefMan.vo.ReferralERODRefVo(new Integer(bean.getEROD().getId()), bean.getEROD().getVersion());
		if(bean.getERODHistory() != null)
		{
			this.erodhistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
			for(int erodhistory_i = 0; erodhistory_i < bean.getERODHistory().length; erodhistory_i++)
			{
				this.erodhistory.add(new ims.RefMan.vo.ReferralERODRefVo(new Integer(bean.getERODHistory()[erodhistory_i].getId()), bean.getERODHistory()[erodhistory_i].getVersion()));
			}
		}
		this.tcidetails = bean.getTCIDetails() == null ? null : bean.getTCIDetails().buildVo(map);
		this.electivelist = bean.getElectiveList() == null ? null : bean.getElectiveList().buildVo(map);
		this.electiveliststatus = bean.getElectiveListStatus() == null ? null : bean.getElectiveListStatus().buildVo(map);
		this.patientstatus = bean.getPatientStatus() == null ? null : ims.RefMan.vo.lookups.CatsReferralCategory.buildLookup(bean.getPatientStatus());
		this.electivelistreason = bean.getElectiveListReason() == null ? null : ims.emergency.vo.lookups.ElectiveListReason.buildLookup(bean.getElectiveListReason());
		this.proclaterality = bean.getProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getProcLaterality());
		this.creatingappointment = bean.getCreatingAppointment() == null ? null : bean.getCreatingAppointment().buildVo(map);
		this.priority = bean.getPriority() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getPriority());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.PatientElevectiveListManagementVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.PatientElevectiveListManagementVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.PatientElevectiveListManagementVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("REFERRAL"))
			return getReferral();
		if(fieldName.equals("CONSULTANT"))
			return getConsultant();
		if(fieldName.equals("DATEONLIST"))
			return getDateOnList();
		if(fieldName.equals("ELECTIVEADMISSIONTYPE"))
			return getElectiveAdmissionType();
		if(fieldName.equals("INTENDEDMANAGEMENT"))
			return getIntendedManagement();
		if(fieldName.equals("ANTICIPATEDSTAY"))
			return getAnticipatedStay();
		if(fieldName.equals("SUSPENSIONS"))
			return getSuspensions();
		if(fieldName.equals("OPERATIVEPROCEDURESTATUS"))
			return getOperativeProcedureStatus();
		if(fieldName.equals("PRIMARYPROCEDURE"))
			return getPrimaryProcedure();
		if(fieldName.equals("OTHERPROCEDURES"))
			return getOtherProcedures();
		if(fieldName.equals("TCIHISTORY"))
			return getTCIHistory();
		if(fieldName.equals("INTERPRETATORREQUIRED"))
			return getInterpretatorRequired();
		if(fieldName.equals("NOTES"))
			return getNotes();
		if(fieldName.equals("EROD"))
			return getEROD();
		if(fieldName.equals("ERODHISTORY"))
			return getERODHistory();
		if(fieldName.equals("TCIDETAILS"))
			return getTCIDetails();
		if(fieldName.equals("ELECTIVELIST"))
			return getElectiveList();
		if(fieldName.equals("ELECTIVELISTSTATUS"))
			return getElectiveListStatus();
		if(fieldName.equals("PATIENTSTATUS"))
			return getPatientStatus();
		if(fieldName.equals("ELECTIVELISTREASON"))
			return getElectiveListReason();
		if(fieldName.equals("PROCLATERALITY"))
			return getProcLaterality();
		if(fieldName.equals("CREATINGAPPOINTMENT"))
			return getCreatingAppointment();
		if(fieldName.equals("PRIORITY"))
			return getPriority();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.PatientLite_IdentifiersVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.PatientLite_IdentifiersVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getReferralIsNotNull()
	{
		return this.referral != null;
	}
	public ims.RefMan.vo.CatsReferralForElectiveListManagementVo getReferral()
	{
		return this.referral;
	}
	public void setReferral(ims.RefMan.vo.CatsReferralForElectiveListManagementVo value)
	{
		this.isValidated = false;
		this.referral = value;
	}
	public boolean getConsultantIsNotNull()
	{
		return this.consultant != null;
	}
	public ims.core.vo.HcpLiteVo getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.consultant = value;
	}
	public boolean getDateOnListIsNotNull()
	{
		return this.dateonlist != null;
	}
	public ims.framework.utils.Date getDateOnList()
	{
		return this.dateonlist;
	}
	public void setDateOnList(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dateonlist = value;
	}
	public boolean getElectiveAdmissionTypeIsNotNull()
	{
		return this.electiveadmissiontype != null;
	}
	public ims.RefMan.vo.lookups.ElectiveAdmissionType getElectiveAdmissionType()
	{
		return this.electiveadmissiontype;
	}
	public void setElectiveAdmissionType(ims.RefMan.vo.lookups.ElectiveAdmissionType value)
	{
		this.isValidated = false;
		this.electiveadmissiontype = value;
	}
	public boolean getIntendedManagementIsNotNull()
	{
		return this.intendedmanagement != null;
	}
	public ims.core.vo.lookups.ManagementIntention getIntendedManagement()
	{
		return this.intendedmanagement;
	}
	public void setIntendedManagement(ims.core.vo.lookups.ManagementIntention value)
	{
		this.isValidated = false;
		this.intendedmanagement = value;
	}
	public boolean getAnticipatedStayIsNotNull()
	{
		return this.anticipatedstay != null;
	}
	public Integer getAnticipatedStay()
	{
		return this.anticipatedstay;
	}
	public void setAnticipatedStay(Integer value)
	{
		this.isValidated = false;
		this.anticipatedstay = value;
	}
	public boolean getSuspensionsIsNotNull()
	{
		return this.suspensions != null;
	}
	public ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection getSuspensions()
	{
		return this.suspensions;
	}
	public void setSuspensions(ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection value)
	{
		this.isValidated = false;
		this.suspensions = value;
	}
	public boolean getOperativeProcedureStatusIsNotNull()
	{
		return this.operativeprocedurestatus != null;
	}
	public Boolean getOperativeProcedureStatus()
	{
		return this.operativeprocedurestatus;
	}
	public void setOperativeProcedureStatus(Boolean value)
	{
		this.isValidated = false;
		this.operativeprocedurestatus = value;
	}
	public boolean getPrimaryProcedureIsNotNull()
	{
		return this.primaryprocedure != null;
	}
	public ims.core.vo.ProcedureLiteVo getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.core.vo.ProcedureLiteVo value)
	{
		this.isValidated = false;
		this.primaryprocedure = value;
	}
	public boolean getOtherProceduresIsNotNull()
	{
		return this.otherprocedures != null;
	}
	public ims.core.clinical.vo.ProcedureRefVoCollection getOtherProcedures()
	{
		return this.otherprocedures;
	}
	public void setOtherProcedures(ims.core.clinical.vo.ProcedureRefVoCollection value)
	{
		this.isValidated = false;
		this.otherprocedures = value;
	}
	public boolean getTCIHistoryIsNotNull()
	{
		return this.tcihistory != null;
	}
	public ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection getTCIHistory()
	{
		return this.tcihistory;
	}
	public void setTCIHistory(ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection value)
	{
		this.isValidated = false;
		this.tcihistory = value;
	}
	public boolean getInterpretatorRequiredIsNotNull()
	{
		return this.interpretatorrequired != null;
	}
	public Boolean getInterpretatorRequired()
	{
		return this.interpretatorrequired;
	}
	public void setInterpretatorRequired(Boolean value)
	{
		this.isValidated = false;
		this.interpretatorrequired = value;
	}
	public boolean getNotesIsNotNull()
	{
		return this.notes != null;
	}
	public ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection getNotes()
	{
		return this.notes;
	}
	public void setNotes(ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection value)
	{
		this.isValidated = false;
		this.notes = value;
	}
	public boolean getERODIsNotNull()
	{
		return this.erod != null;
	}
	public ims.RefMan.vo.ReferralERODRefVo getEROD()
	{
		return this.erod;
	}
	public void setEROD(ims.RefMan.vo.ReferralERODRefVo value)
	{
		this.isValidated = false;
		this.erod = value;
	}
	public boolean getERODHistoryIsNotNull()
	{
		return this.erodhistory != null;
	}
	public ims.RefMan.vo.ReferralERODRefVoCollection getERODHistory()
	{
		return this.erodhistory;
	}
	public void setERODHistory(ims.RefMan.vo.ReferralERODRefVoCollection value)
	{
		this.isValidated = false;
		this.erodhistory = value;
	}
	public boolean getTCIDetailsIsNotNull()
	{
		return this.tcidetails != null;
	}
	public ims.RefMan.vo.PatientElectiveListTCIVo getTCIDetails()
	{
		return this.tcidetails;
	}
	public void setTCIDetails(ims.RefMan.vo.PatientElectiveListTCIVo value)
	{
		this.isValidated = false;
		this.tcidetails = value;
	}
	public boolean getElectiveListIsNotNull()
	{
		return this.electivelist != null;
	}
	public ims.admin.vo.ElectiveListConfigurationVo getElectiveList()
	{
		return this.electivelist;
	}
	public void setElectiveList(ims.admin.vo.ElectiveListConfigurationVo value)
	{
		this.isValidated = false;
		this.electivelist = value;
	}
	public boolean getElectiveListStatusIsNotNull()
	{
		return this.electiveliststatus != null;
	}
	public ims.RefMan.vo.ElectiveListStatusVo getElectiveListStatus()
	{
		return this.electiveliststatus;
	}
	public void setElectiveListStatus(ims.RefMan.vo.ElectiveListStatusVo value)
	{
		this.isValidated = false;
		this.electiveliststatus = value;
	}
	public boolean getPatientStatusIsNotNull()
	{
		return this.patientstatus != null;
	}
	public ims.RefMan.vo.lookups.CatsReferralCategory getPatientStatus()
	{
		return this.patientstatus;
	}
	public void setPatientStatus(ims.RefMan.vo.lookups.CatsReferralCategory value)
	{
		this.isValidated = false;
		this.patientstatus = value;
	}
	public boolean getElectiveListReasonIsNotNull()
	{
		return this.electivelistreason != null;
	}
	public ims.emergency.vo.lookups.ElectiveListReason getElectiveListReason()
	{
		return this.electivelistreason;
	}
	public void setElectiveListReason(ims.emergency.vo.lookups.ElectiveListReason value)
	{
		this.isValidated = false;
		this.electivelistreason = value;
	}
	public boolean getProcLateralityIsNotNull()
	{
		return this.proclaterality != null;
	}
	public ims.core.vo.lookups.LateralityLRB getProcLaterality()
	{
		return this.proclaterality;
	}
	public void setProcLaterality(ims.core.vo.lookups.LateralityLRB value)
	{
		this.isValidated = false;
		this.proclaterality = value;
	}
	public boolean getCreatingAppointmentIsNotNull()
	{
		return this.creatingappointment != null;
	}
	public ims.RefMan.vo.Booking_AppointmentOutcomeForElectiveListVo getCreatingAppointment()
	{
		return this.creatingappointment;
	}
	public void setCreatingAppointment(ims.RefMan.vo.Booking_AppointmentOutcomeForElectiveListVo value)
	{
		this.isValidated = false;
		this.creatingappointment = value;
	}
	public boolean getPriorityIsNotNull()
	{
		return this.priority != null;
	}
	public ims.RefMan.vo.lookups.ReferralUrgency getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.RefMan.vo.lookups.ReferralUrgency value)
	{
		this.isValidated = false;
		this.priority = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.primaryprocedure != null)
		{
			if(!this.primaryprocedure.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.tcidetails != null)
		{
			if(!this.tcidetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.electivelist != null)
		{
			if(!this.electivelist.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.electiveliststatus != null)
		{
			if(!this.electiveliststatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.referral == null)
			listOfErrors.add("Referral is mandatory");
		if(this.dateonlist == null)
			listOfErrors.add("DateOnList is mandatory");
		if(this.electiveadmissiontype == null)
			listOfErrors.add("ElectiveAdmissionType is mandatory");
		if(this.operativeprocedurestatus == null)
			listOfErrors.add("OperativeProcedureStatus is mandatory");
		if(this.primaryprocedure != null)
		{
			String[] listOfOtherErrors = this.primaryprocedure.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.tcidetails != null)
		{
			String[] listOfOtherErrors = this.tcidetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.electivelist != null)
		{
			String[] listOfOtherErrors = this.electivelist.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.electiveliststatus == null)
			listOfErrors.add("ElectiveListStatus is mandatory");
		if(this.electiveliststatus != null)
		{
			String[] listOfOtherErrors = this.electiveliststatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.electivelistreason == null)
			listOfErrors.add("ElectiveListReason is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientElevectiveListManagementVo clone = new PatientElevectiveListManagementVo(this.id, this.version);
		
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.PatientLite_IdentifiersVo)this.patient.clone();
		if(this.referral == null)
			clone.referral = null;
		else
			clone.referral = (ims.RefMan.vo.CatsReferralForElectiveListManagementVo)this.referral.clone();
		if(this.consultant == null)
			clone.consultant = null;
		else
			clone.consultant = (ims.core.vo.HcpLiteVo)this.consultant.clone();
		if(this.dateonlist == null)
			clone.dateonlist = null;
		else
			clone.dateonlist = (ims.framework.utils.Date)this.dateonlist.clone();
		if(this.electiveadmissiontype == null)
			clone.electiveadmissiontype = null;
		else
			clone.electiveadmissiontype = (ims.RefMan.vo.lookups.ElectiveAdmissionType)this.electiveadmissiontype.clone();
		if(this.intendedmanagement == null)
			clone.intendedmanagement = null;
		else
			clone.intendedmanagement = (ims.core.vo.lookups.ManagementIntention)this.intendedmanagement.clone();
		clone.anticipatedstay = this.anticipatedstay;
		clone.suspensions = this.suspensions;
		clone.operativeprocedurestatus = this.operativeprocedurestatus;
		if(this.primaryprocedure == null)
			clone.primaryprocedure = null;
		else
			clone.primaryprocedure = (ims.core.vo.ProcedureLiteVo)this.primaryprocedure.clone();
		clone.otherprocedures = this.otherprocedures;
		clone.tcihistory = this.tcihistory;
		clone.interpretatorrequired = this.interpretatorrequired;
		clone.notes = this.notes;
		clone.erod = this.erod;
		clone.erodhistory = this.erodhistory;
		if(this.tcidetails == null)
			clone.tcidetails = null;
		else
			clone.tcidetails = (ims.RefMan.vo.PatientElectiveListTCIVo)this.tcidetails.clone();
		if(this.electivelist == null)
			clone.electivelist = null;
		else
			clone.electivelist = (ims.admin.vo.ElectiveListConfigurationVo)this.electivelist.clone();
		if(this.electiveliststatus == null)
			clone.electiveliststatus = null;
		else
			clone.electiveliststatus = (ims.RefMan.vo.ElectiveListStatusVo)this.electiveliststatus.clone();
		if(this.patientstatus == null)
			clone.patientstatus = null;
		else
			clone.patientstatus = (ims.RefMan.vo.lookups.CatsReferralCategory)this.patientstatus.clone();
		if(this.electivelistreason == null)
			clone.electivelistreason = null;
		else
			clone.electivelistreason = (ims.emergency.vo.lookups.ElectiveListReason)this.electivelistreason.clone();
		if(this.proclaterality == null)
			clone.proclaterality = null;
		else
			clone.proclaterality = (ims.core.vo.lookups.LateralityLRB)this.proclaterality.clone();
		if(this.creatingappointment == null)
			clone.creatingappointment = null;
		else
			clone.creatingappointment = (ims.RefMan.vo.Booking_AppointmentOutcomeForElectiveListVo)this.creatingappointment.clone();
		if(this.priority == null)
			clone.priority = null;
		else
			clone.priority = (ims.RefMan.vo.lookups.ReferralUrgency)this.priority.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PatientElevectiveListManagementVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientElevectiveListManagementVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientElevectiveListManagementVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientElevectiveListManagementVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.patient != null)
			count++;
		if(this.referral != null)
			count++;
		if(this.consultant != null)
			count++;
		if(this.dateonlist != null)
			count++;
		if(this.electiveadmissiontype != null)
			count++;
		if(this.intendedmanagement != null)
			count++;
		if(this.anticipatedstay != null)
			count++;
		if(this.suspensions != null)
			count++;
		if(this.operativeprocedurestatus != null)
			count++;
		if(this.primaryprocedure != null)
			count++;
		if(this.otherprocedures != null)
			count++;
		if(this.tcihistory != null)
			count++;
		if(this.interpretatorrequired != null)
			count++;
		if(this.notes != null)
			count++;
		if(this.erod != null)
			count++;
		if(this.erodhistory != null)
			count++;
		if(this.tcidetails != null)
			count++;
		if(this.electivelist != null)
			count++;
		if(this.electiveliststatus != null)
			count++;
		if(this.patientstatus != null)
			count++;
		if(this.electivelistreason != null)
			count++;
		if(this.proclaterality != null)
			count++;
		if(this.creatingappointment != null)
			count++;
		if(this.priority != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 24;
	}
	protected ims.core.vo.PatientLite_IdentifiersVo patient;
	protected ims.RefMan.vo.CatsReferralForElectiveListManagementVo referral;
	protected ims.core.vo.HcpLiteVo consultant;
	protected ims.framework.utils.Date dateonlist;
	protected ims.RefMan.vo.lookups.ElectiveAdmissionType electiveadmissiontype;
	protected ims.core.vo.lookups.ManagementIntention intendedmanagement;
	protected Integer anticipatedstay;
	protected ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection suspensions;
	protected Boolean operativeprocedurestatus;
	protected ims.core.vo.ProcedureLiteVo primaryprocedure;
	protected ims.core.clinical.vo.ProcedureRefVoCollection otherprocedures;
	protected ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection tcihistory;
	protected Boolean interpretatorrequired;
	protected ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection notes;
	protected ims.RefMan.vo.ReferralERODRefVo erod;
	protected ims.RefMan.vo.ReferralERODRefVoCollection erodhistory;
	protected ims.RefMan.vo.PatientElectiveListTCIVo tcidetails;
	protected ims.admin.vo.ElectiveListConfigurationVo electivelist;
	protected ims.RefMan.vo.ElectiveListStatusVo electiveliststatus;
	protected ims.RefMan.vo.lookups.CatsReferralCategory patientstatus;
	protected ims.emergency.vo.lookups.ElectiveListReason electivelistreason;
	protected ims.core.vo.lookups.LateralityLRB proclaterality;
	protected ims.RefMan.vo.Booking_AppointmentOutcomeForElectiveListVo creatingappointment;
	protected ims.RefMan.vo.lookups.ReferralUrgency priority;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
