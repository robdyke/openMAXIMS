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

package ims.ntpf.vo;

/**
 * Linked to NTPF.LoCall.LoCall business object (ID: 1039100000).
 */
public class LoCallVo extends ims.ntpf.vo.LoCallLiteVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public LoCallVo()
	{
	}
	public LoCallVo(Integer id, int version)
	{
		super(id, version);
	}
	public LoCallVo(ims.ntpf.vo.beans.LoCallVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.localldate = bean.getLoCallDate() == null ? null : bean.getLoCallDate().buildDate();
		this.waitinglistdetails = ims.ntpf.vo.LoCallWaitingListDetailsVoCollection.buildFromBeanCollection(bean.getWaitingListDetails());
		this.hascomments = bean.getHasComments();
		this.locallnumber = bean.getLoCallNumber();
		this.whereheard = bean.getWhereHeard() == null ? null : ims.ntpf.vo.lookups.WhereHeard.buildLookup(bean.getWhereHeard());
		this.callername = bean.getCallerName();
		this.callernumber = bean.getCallerNumber();
		this.patientchecklist = ims.ntpf.vo.PatientCheckListVoCollection.buildFromBeanCollection(bean.getPatientCheckList());
		this.callerrelationship = bean.getCallerRelationship() == null ? null : ims.ntpf.vo.lookups.CallerRelationship.buildLookup(bean.getCallerRelationship());
		this.calltype = bean.getCallType() == null ? null : ims.ntpf.vo.lookups.CallType.buildLookup(bean.getCallType());
		this.medicalinsurance = bean.getMedicalInsurance() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getMedicalInsurance());
		this.insurancetype = bean.getInsuranceType() == null ? null : ims.ntpf.vo.lookups.InsuranceType.buildLookup(bean.getInsuranceType());
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.gpdetails = bean.getGPDetails() == null ? null : bean.getGPDetails().buildVo();
		this.locallcomments = ims.ntpf.vo.CommentVoCollection.buildFromBeanCollection(bean.getLoCallComments());
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ntpf.vo.beans.LoCallVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.localldate = bean.getLoCallDate() == null ? null : bean.getLoCallDate().buildDate();
		this.waitinglistdetails = ims.ntpf.vo.LoCallWaitingListDetailsVoCollection.buildFromBeanCollection(bean.getWaitingListDetails());
		this.hascomments = bean.getHasComments();
		this.locallnumber = bean.getLoCallNumber();
		this.whereheard = bean.getWhereHeard() == null ? null : ims.ntpf.vo.lookups.WhereHeard.buildLookup(bean.getWhereHeard());
		this.callername = bean.getCallerName();
		this.callernumber = bean.getCallerNumber();
		this.patientchecklist = ims.ntpf.vo.PatientCheckListVoCollection.buildFromBeanCollection(bean.getPatientCheckList());
		this.callerrelationship = bean.getCallerRelationship() == null ? null : ims.ntpf.vo.lookups.CallerRelationship.buildLookup(bean.getCallerRelationship());
		this.calltype = bean.getCallType() == null ? null : ims.ntpf.vo.lookups.CallType.buildLookup(bean.getCallType());
		this.medicalinsurance = bean.getMedicalInsurance() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getMedicalInsurance());
		this.insurancetype = bean.getInsuranceType() == null ? null : ims.ntpf.vo.lookups.InsuranceType.buildLookup(bean.getInsuranceType());
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.gpdetails = bean.getGPDetails() == null ? null : bean.getGPDetails().buildVo(map);
		this.locallcomments = ims.ntpf.vo.CommentVoCollection.buildFromBeanCollection(bean.getLoCallComments());
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ntpf.vo.beans.LoCallVoBean bean = null;
		if(map != null)
			bean = (ims.ntpf.vo.beans.LoCallVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ntpf.vo.beans.LoCallVoBean();
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
		if(fieldName.equals("LOCALLNUMBER"))
			return getLoCallNumber();
		if(fieldName.equals("WHEREHEARD"))
			return getWhereHeard();
		if(fieldName.equals("CALLERNAME"))
			return getCallerName();
		if(fieldName.equals("CALLERNUMBER"))
			return getCallerNumber();
		if(fieldName.equals("PATIENTCHECKLIST"))
			return getPatientCheckList();
		if(fieldName.equals("CALLERRELATIONSHIP"))
			return getCallerRelationship();
		if(fieldName.equals("CALLTYPE"))
			return getCallType();
		if(fieldName.equals("MEDICALINSURANCE"))
			return getMedicalInsurance();
		if(fieldName.equals("INSURANCETYPE"))
			return getInsuranceType();
		if(fieldName.equals("SYSINFO"))
			return getSysInfo();
		if(fieldName.equals("GPDETAILS"))
			return getGPDetails();
		if(fieldName.equals("LOCALLCOMMENTS"))
			return getLoCallComments();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getLoCallNumberIsNotNull()
	{
		return this.locallnumber != null;
	}
	public String getLoCallNumber()
	{
		return this.locallnumber;
	}
	public static int getLoCallNumberMaxLength()
	{
		return 255;
	}
	public void setLoCallNumber(String value)
	{
		this.isValidated = false;
		this.locallnumber = value;
	}
	public boolean getWhereHeardIsNotNull()
	{
		return this.whereheard != null;
	}
	public ims.ntpf.vo.lookups.WhereHeard getWhereHeard()
	{
		return this.whereheard;
	}
	public void setWhereHeard(ims.ntpf.vo.lookups.WhereHeard value)
	{
		this.isValidated = false;
		this.whereheard = value;
	}
	public boolean getCallerNameIsNotNull()
	{
		return this.callername != null;
	}
	public String getCallerName()
	{
		return this.callername;
	}
	public static int getCallerNameMaxLength()
	{
		return 50;
	}
	public void setCallerName(String value)
	{
		this.isValidated = false;
		this.callername = value;
	}
	public boolean getCallerNumberIsNotNull()
	{
		return this.callernumber != null;
	}
	public String getCallerNumber()
	{
		return this.callernumber;
	}
	public static int getCallerNumberMaxLength()
	{
		return 30;
	}
	public void setCallerNumber(String value)
	{
		this.isValidated = false;
		this.callernumber = value;
	}
	public boolean getPatientCheckListIsNotNull()
	{
		return this.patientchecklist != null;
	}
	public ims.ntpf.vo.PatientCheckListVoCollection getPatientCheckList()
	{
		return this.patientchecklist;
	}
	public void setPatientCheckList(ims.ntpf.vo.PatientCheckListVoCollection value)
	{
		this.isValidated = false;
		this.patientchecklist = value;
	}
	public boolean getCallerRelationshipIsNotNull()
	{
		return this.callerrelationship != null;
	}
	public ims.ntpf.vo.lookups.CallerRelationship getCallerRelationship()
	{
		return this.callerrelationship;
	}
	public void setCallerRelationship(ims.ntpf.vo.lookups.CallerRelationship value)
	{
		this.isValidated = false;
		this.callerrelationship = value;
	}
	public boolean getCallTypeIsNotNull()
	{
		return this.calltype != null;
	}
	public ims.ntpf.vo.lookups.CallType getCallType()
	{
		return this.calltype;
	}
	public void setCallType(ims.ntpf.vo.lookups.CallType value)
	{
		this.isValidated = false;
		this.calltype = value;
	}
	public boolean getMedicalInsuranceIsNotNull()
	{
		return this.medicalinsurance != null;
	}
	public ims.core.vo.lookups.YesNo getMedicalInsurance()
	{
		return this.medicalinsurance;
	}
	public void setMedicalInsurance(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.medicalinsurance = value;
	}
	public boolean getInsuranceTypeIsNotNull()
	{
		return this.insurancetype != null;
	}
	public ims.ntpf.vo.lookups.InsuranceType getInsuranceType()
	{
		return this.insurancetype;
	}
	public void setInsuranceType(ims.ntpf.vo.lookups.InsuranceType value)
	{
		this.isValidated = false;
		this.insurancetype = value;
	}
	public boolean getSysInfoIsNotNull()
	{
		return this.sysinfo != null;
	}
	public ims.vo.SystemInformation getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.sysinfo = value;
	}
	public boolean getGPDetailsIsNotNull()
	{
		return this.gpdetails != null;
	}
	public ims.ntpf.vo.GPDetailsNTPFVo getGPDetails()
	{
		return this.gpdetails;
	}
	public void setGPDetails(ims.ntpf.vo.GPDetailsNTPFVo value)
	{
		this.isValidated = false;
		this.gpdetails = value;
	}
	public boolean getLoCallCommentsIsNotNull()
	{
		return this.locallcomments != null;
	}
	public ims.ntpf.vo.CommentVoCollection getLoCallComments()
	{
		return this.locallcomments;
	}
	public void setLoCallComments(ims.ntpf.vo.CommentVoCollection value)
	{
		this.isValidated = false;
		this.locallcomments = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.Patient getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.Patient value)
	{
		this.isValidated = false;
		this.patient = value;
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
		if(this.waitinglistdetails != null)
		{
			if(!this.waitinglistdetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patientchecklist != null)
		{
			if(!this.patientchecklist.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.gpdetails != null)
		{
			if(!this.gpdetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.locallcomments != null)
		{
			if(!this.locallcomments.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patient != null)
		{
			if(!this.patient.isValidated())
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
		if(this.waitinglistdetails != null)
		{
			String[] listOfOtherErrors = this.waitinglistdetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.hascomments == null)
			listOfErrors.add("hasComments is mandatory");
		if(this.callername != null)
			if(this.callername.length() > 50)
				listOfErrors.add("The length of the field [callername] in the value object [ims.ntpf.vo.LoCallVo] is too big. It should be less or equal to 50");
		if(this.callernumber != null)
			if(this.callernumber.length() > 30)
				listOfErrors.add("The length of the field [callernumber] in the value object [ims.ntpf.vo.LoCallVo] is too big. It should be less or equal to 30");
		if(this.patientchecklist != null)
		{
			String[] listOfOtherErrors = this.patientchecklist.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.gpdetails != null)
		{
			String[] listOfOtherErrors = this.gpdetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.locallcomments != null)
		{
			String[] listOfOtherErrors = this.locallcomments.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.patient != null)
		{
			String[] listOfOtherErrors = this.patient.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		LoCallVo clone = new LoCallVo(this.id, this.version);
		
		if(this.localldate == null)
			clone.localldate = null;
		else
			clone.localldate = (ims.framework.utils.Date)this.localldate.clone();
		if(this.waitinglistdetails == null)
			clone.waitinglistdetails = null;
		else
			clone.waitinglistdetails = (ims.ntpf.vo.LoCallWaitingListDetailsVoCollection)this.waitinglistdetails.clone();
		clone.hascomments = this.hascomments;
		clone.locallnumber = this.locallnumber;
		if(this.whereheard == null)
			clone.whereheard = null;
		else
			clone.whereheard = (ims.ntpf.vo.lookups.WhereHeard)this.whereheard.clone();
		clone.callername = this.callername;
		clone.callernumber = this.callernumber;
		if(this.patientchecklist == null)
			clone.patientchecklist = null;
		else
			clone.patientchecklist = (ims.ntpf.vo.PatientCheckListVoCollection)this.patientchecklist.clone();
		if(this.callerrelationship == null)
			clone.callerrelationship = null;
		else
			clone.callerrelationship = (ims.ntpf.vo.lookups.CallerRelationship)this.callerrelationship.clone();
		if(this.calltype == null)
			clone.calltype = null;
		else
			clone.calltype = (ims.ntpf.vo.lookups.CallType)this.calltype.clone();
		if(this.medicalinsurance == null)
			clone.medicalinsurance = null;
		else
			clone.medicalinsurance = (ims.core.vo.lookups.YesNo)this.medicalinsurance.clone();
		if(this.insurancetype == null)
			clone.insurancetype = null;
		else
			clone.insurancetype = (ims.ntpf.vo.lookups.InsuranceType)this.insurancetype.clone();
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.gpdetails == null)
			clone.gpdetails = null;
		else
			clone.gpdetails = (ims.ntpf.vo.GPDetailsNTPFVo)this.gpdetails.clone();
		if(this.locallcomments == null)
			clone.locallcomments = null;
		else
			clone.locallcomments = (ims.ntpf.vo.CommentVoCollection)this.locallcomments.clone();
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.Patient)this.patient.clone();
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
		if (!(LoCallVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A LoCallVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		LoCallVo compareObj = (LoCallVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getLoCallDate() == null && compareObj.getLoCallDate() != null)
				return -1;
			if(this.getLoCallDate() != null && compareObj.getLoCallDate() == null)
				return 1;
			if(this.getLoCallDate() != null && compareObj.getLoCallDate() != null)
				retVal = this.getLoCallDate().compareTo(compareObj.getLoCallDate());
		}
		if (retVal == 0)
		{
			if(this.getID_LoCall() == null && compareObj.getID_LoCall() != null)
				return -1;
			if(this.getID_LoCall() != null && compareObj.getID_LoCall() == null)
				return 1;
			if(this.getID_LoCall() != null && compareObj.getID_LoCall() != null)
				retVal = this.getID_LoCall().compareTo(compareObj.getID_LoCall());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.locallnumber != null)
			count++;
		if(this.whereheard != null)
			count++;
		if(this.callername != null)
			count++;
		if(this.callernumber != null)
			count++;
		if(this.patientchecklist != null)
			count++;
		if(this.callerrelationship != null)
			count++;
		if(this.calltype != null)
			count++;
		if(this.medicalinsurance != null)
			count++;
		if(this.insurancetype != null)
			count++;
		if(this.sysinfo != null)
			count++;
		if(this.gpdetails != null)
			count++;
		if(this.locallcomments != null)
			count++;
		if(this.patient != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 13;
	}
	protected String locallnumber;
	protected ims.ntpf.vo.lookups.WhereHeard whereheard;
	protected String callername;
	protected String callernumber;
	protected ims.ntpf.vo.PatientCheckListVoCollection patientchecklist;
	protected ims.ntpf.vo.lookups.CallerRelationship callerrelationship;
	protected ims.ntpf.vo.lookups.CallType calltype;
	protected ims.core.vo.lookups.YesNo medicalinsurance;
	protected ims.ntpf.vo.lookups.InsuranceType insurancetype;
	protected ims.vo.SystemInformation sysinfo;
	protected ims.ntpf.vo.GPDetailsNTPFVo gpdetails;
	protected ims.ntpf.vo.CommentVoCollection locallcomments;
	protected ims.core.vo.Patient patient;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
