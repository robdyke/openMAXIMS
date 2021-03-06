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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.emergency.vo;

/**
 * Linked to emergency.Tracking business object (ID: 1086100005).
 */
public class TrackingAttendanceOutcomeVo extends ims.emergency.vo.TrackingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TrackingAttendanceOutcomeVo()
	{
	}
	public TrackingAttendanceOutcomeVo(Integer id, int version)
	{
		super(id, version);
	}
	public TrackingAttendanceOutcomeVo(ims.emergency.vo.beans.TrackingAttendanceOutcomeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.attendance = bean.getAttendance() == null ? null : bean.getAttendance().buildVo();
		this.currentarea = bean.getCurrentArea() == null ? null : new ims.emergency.configuration.vo.TrackingAreaRefVo(new Integer(bean.getCurrentArea().getId()), bean.getCurrentArea().getVersion());
		this.isdischarged = bean.getIsDischarged();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		this.associatedpendingemergencyadmission = bean.getAssociatedPendingEmergencyAdmission() == null ? null : bean.getAssociatedPendingEmergencyAdmission().buildVo();
		this.bedavailability = bean.getBedAvailability() == null ? null : bean.getBedAvailability().buildVo();
		this.currentdnw = bean.getCurrentDNW() == null ? null : bean.getCurrentDNW().buildVo();
		this.reasonforbreach = bean.getReasonForBreach() == null ? null : ims.emergency.vo.lookups.ReasonForBreach.buildLookup(bean.getReasonForBreach());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.TrackingAttendanceOutcomeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.attendance = bean.getAttendance() == null ? null : bean.getAttendance().buildVo(map);
		this.currentarea = bean.getCurrentArea() == null ? null : new ims.emergency.configuration.vo.TrackingAreaRefVo(new Integer(bean.getCurrentArea().getId()), bean.getCurrentArea().getVersion());
		this.isdischarged = bean.getIsDischarged();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		this.associatedpendingemergencyadmission = bean.getAssociatedPendingEmergencyAdmission() == null ? null : bean.getAssociatedPendingEmergencyAdmission().buildVo(map);
		this.bedavailability = bean.getBedAvailability() == null ? null : bean.getBedAvailability().buildVo(map);
		this.currentdnw = bean.getCurrentDNW() == null ? null : bean.getCurrentDNW().buildVo(map);
		this.reasonforbreach = bean.getReasonForBreach() == null ? null : ims.emergency.vo.lookups.ReasonForBreach.buildLookup(bean.getReasonForBreach());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.TrackingAttendanceOutcomeVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.TrackingAttendanceOutcomeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.TrackingAttendanceOutcomeVoBean();
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
		if(fieldName.equals("ATTENDANCE"))
			return getAttendance();
		if(fieldName.equals("CURRENTAREA"))
			return getCurrentArea();
		if(fieldName.equals("ISDISCHARGED"))
			return getIsDischarged();
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("ASSOCIATEDPENDINGEMERGENCYADMISSION"))
			return getAssociatedPendingEmergencyAdmission();
		if(fieldName.equals("BEDAVAILABILITY"))
			return getBedAvailability();
		if(fieldName.equals("CURRENTDNW"))
			return getCurrentDNW();
		if(fieldName.equals("REASONFORBREACH"))
			return getReasonForBreach();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAttendanceIsNotNull()
	{
		return this.attendance != null;
	}
	public ims.emergency.vo.EmergencyAttendanceOutcomeVo getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.emergency.vo.EmergencyAttendanceOutcomeVo value)
	{
		this.isValidated = false;
		this.attendance = value;
	}
	public boolean getCurrentAreaIsNotNull()
	{
		return this.currentarea != null;
	}
	public ims.emergency.configuration.vo.TrackingAreaRefVo getCurrentArea()
	{
		return this.currentarea;
	}
	public void setCurrentArea(ims.emergency.configuration.vo.TrackingAreaRefVo value)
	{
		this.isValidated = false;
		this.currentarea = value;
	}
	public boolean getIsDischargedIsNotNull()
	{
		return this.isdischarged != null;
	}
	public Boolean getIsDischarged()
	{
		return this.isdischarged;
	}
	public void setIsDischarged(Boolean value)
	{
		this.isValidated = false;
		this.isdischarged = value;
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.emergency.vo.TrackingAttendanceStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.emergency.vo.TrackingAttendanceStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getAssociatedPendingEmergencyAdmissionIsNotNull()
	{
		return this.associatedpendingemergencyadmission != null;
	}
	public ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo getAssociatedPendingEmergencyAdmission()
	{
		return this.associatedpendingemergencyadmission;
	}
	public void setAssociatedPendingEmergencyAdmission(ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo value)
	{
		this.isValidated = false;
		this.associatedpendingemergencyadmission = value;
	}
	public boolean getBedAvailabilityIsNotNull()
	{
		return this.bedavailability != null;
	}
	public ims.emergency.vo.BedAvailabilityVo getBedAvailability()
	{
		return this.bedavailability;
	}
	public void setBedAvailability(ims.emergency.vo.BedAvailabilityVo value)
	{
		this.isValidated = false;
		this.bedavailability = value;
	}
	public boolean getCurrentDNWIsNotNull()
	{
		return this.currentdnw != null;
	}
	public ims.emergency.vo.DNWForOutcomeVo getCurrentDNW()
	{
		return this.currentdnw;
	}
	public void setCurrentDNW(ims.emergency.vo.DNWForOutcomeVo value)
	{
		this.isValidated = false;
		this.currentdnw = value;
	}
	public boolean getReasonForBreachIsNotNull()
	{
		return this.reasonforbreach != null;
	}
	public ims.emergency.vo.lookups.ReasonForBreach getReasonForBreach()
	{
		return this.reasonforbreach;
	}
	public void setReasonForBreach(ims.emergency.vo.lookups.ReasonForBreach value)
	{
		this.isValidated = false;
		this.reasonforbreach = value;
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
		if(this.attendance != null)
		{
			if(!this.attendance.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currentstatus != null)
		{
			if(!this.currentstatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.associatedpendingemergencyadmission != null)
		{
			if(!this.associatedpendingemergencyadmission.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.bedavailability != null)
		{
			if(!this.bedavailability.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currentdnw != null)
		{
			if(!this.currentdnw.isValidated())
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
		if(this.attendance == null)
			listOfErrors.add("Attendance is mandatory");
		if(this.attendance != null)
		{
			String[] listOfOtherErrors = this.attendance.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currentstatus != null)
		{
			String[] listOfOtherErrors = this.currentstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.associatedpendingemergencyadmission != null)
		{
			String[] listOfOtherErrors = this.associatedpendingemergencyadmission.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.bedavailability != null)
		{
			String[] listOfOtherErrors = this.bedavailability.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currentdnw != null)
		{
			String[] listOfOtherErrors = this.currentdnw.validate();
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
	
		TrackingAttendanceOutcomeVo clone = new TrackingAttendanceOutcomeVo(this.id, this.version);
		
		if(this.attendance == null)
			clone.attendance = null;
		else
			clone.attendance = (ims.emergency.vo.EmergencyAttendanceOutcomeVo)this.attendance.clone();
		clone.currentarea = this.currentarea;
		clone.isdischarged = this.isdischarged;
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.emergency.vo.TrackingAttendanceStatusVo)this.currentstatus.clone();
		if(this.associatedpendingemergencyadmission == null)
			clone.associatedpendingemergencyadmission = null;
		else
			clone.associatedpendingemergencyadmission = (ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo)this.associatedpendingemergencyadmission.clone();
		if(this.bedavailability == null)
			clone.bedavailability = null;
		else
			clone.bedavailability = (ims.emergency.vo.BedAvailabilityVo)this.bedavailability.clone();
		if(this.currentdnw == null)
			clone.currentdnw = null;
		else
			clone.currentdnw = (ims.emergency.vo.DNWForOutcomeVo)this.currentdnw.clone();
		if(this.reasonforbreach == null)
			clone.reasonforbreach = null;
		else
			clone.reasonforbreach = (ims.emergency.vo.lookups.ReasonForBreach)this.reasonforbreach.clone();
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
		if (!(TrackingAttendanceOutcomeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TrackingAttendanceOutcomeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TrackingAttendanceOutcomeVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TrackingAttendanceOutcomeVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.attendance != null)
			count++;
		if(this.currentarea != null)
			count++;
		if(this.isdischarged != null)
			count++;
		if(this.currentstatus != null)
			count++;
		if(this.associatedpendingemergencyadmission != null)
			count++;
		if(this.bedavailability != null)
			count++;
		if(this.currentdnw != null)
			count++;
		if(this.reasonforbreach != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.emergency.vo.EmergencyAttendanceOutcomeVo attendance;
	protected ims.emergency.configuration.vo.TrackingAreaRefVo currentarea;
	protected Boolean isdischarged;
	protected ims.emergency.vo.TrackingAttendanceStatusVo currentstatus;
	protected ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo associatedpendingemergencyadmission;
	protected ims.emergency.vo.BedAvailabilityVo bedavailability;
	protected ims.emergency.vo.DNWForOutcomeVo currentdnw;
	protected ims.emergency.vo.lookups.ReasonForBreach reasonforbreach;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
