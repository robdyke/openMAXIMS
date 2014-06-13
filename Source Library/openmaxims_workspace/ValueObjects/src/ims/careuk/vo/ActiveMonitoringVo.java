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

package ims.careuk.vo;

/**
 * Linked to CAREUK.ActiveMonitoring business object (ID: 1096100046).
 */
public class ActiveMonitoringVo extends ims.careuk.vo.ActiveMonitoringRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ActiveMonitoringVo()
	{
	}
	public ActiveMonitoringVo(Integer id, int version)
	{
		super(id, version);
	}
	public ActiveMonitoringVo(ims.careuk.vo.beans.ActiveMonitoringVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.startdateactivemonitoring = bean.getStartDateActiveMonitoring() == null ? null : bean.getStartDateActiveMonitoring().buildDateTime();
		this.activemonitoringreason = bean.getActiveMonitoringReason() == null ? null : ims.careuk.vo.lookups.ActiveMonitoringReason.buildLookup(bean.getActiveMonitoringReason());
		this.periodofmonitoringdays = bean.getPeriodOfMonitoringDays();
		this.bookapptby = bean.getBookApptBy() == null ? null : bean.getBookApptBy().buildDate();
		this.activemonitoringcomments = bean.getActiveMonitoringComments();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.recordinginformation = bean.getRecordingInformation() == null ? null : bean.getRecordingInformation().buildVo();
		this.activemonitoringenddate = bean.getActiveMonitoringEndDate() == null ? null : bean.getActiveMonitoringEndDate().buildDate();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.careuk.vo.beans.ActiveMonitoringVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.startdateactivemonitoring = bean.getStartDateActiveMonitoring() == null ? null : bean.getStartDateActiveMonitoring().buildDateTime();
		this.activemonitoringreason = bean.getActiveMonitoringReason() == null ? null : ims.careuk.vo.lookups.ActiveMonitoringReason.buildLookup(bean.getActiveMonitoringReason());
		this.periodofmonitoringdays = bean.getPeriodOfMonitoringDays();
		this.bookapptby = bean.getBookApptBy() == null ? null : bean.getBookApptBy().buildDate();
		this.activemonitoringcomments = bean.getActiveMonitoringComments();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.recordinginformation = bean.getRecordingInformation() == null ? null : bean.getRecordingInformation().buildVo(map);
		this.activemonitoringenddate = bean.getActiveMonitoringEndDate() == null ? null : bean.getActiveMonitoringEndDate().buildDate();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.careuk.vo.beans.ActiveMonitoringVoBean bean = null;
		if(map != null)
			bean = (ims.careuk.vo.beans.ActiveMonitoringVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.careuk.vo.beans.ActiveMonitoringVoBean();
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
		if(fieldName.equals("STARTDATEACTIVEMONITORING"))
			return getStartDateActiveMonitoring();
		if(fieldName.equals("ACTIVEMONITORINGREASON"))
			return getActiveMonitoringReason();
		if(fieldName.equals("PERIODOFMONITORINGDAYS"))
			return getPeriodOfMonitoringDays();
		if(fieldName.equals("BOOKAPPTBY"))
			return getBookApptBy();
		if(fieldName.equals("ACTIVEMONITORINGCOMMENTS"))
			return getActiveMonitoringComments();
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("RECORDINGINFORMATION"))
			return getRecordingInformation();
		if(fieldName.equals("ACTIVEMONITORINGENDDATE"))
			return getActiveMonitoringEndDate();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getStartDateActiveMonitoringIsNotNull()
	{
		return this.startdateactivemonitoring != null;
	}
	public ims.framework.utils.DateTime getStartDateActiveMonitoring()
	{
		return this.startdateactivemonitoring;
	}
	public void setStartDateActiveMonitoring(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.startdateactivemonitoring = value;
	}
	public boolean getActiveMonitoringReasonIsNotNull()
	{
		return this.activemonitoringreason != null;
	}
	public ims.careuk.vo.lookups.ActiveMonitoringReason getActiveMonitoringReason()
	{
		return this.activemonitoringreason;
	}
	public void setActiveMonitoringReason(ims.careuk.vo.lookups.ActiveMonitoringReason value)
	{
		this.isValidated = false;
		this.activemonitoringreason = value;
	}
	public boolean getPeriodOfMonitoringDaysIsNotNull()
	{
		return this.periodofmonitoringdays != null;
	}
	public Integer getPeriodOfMonitoringDays()
	{
		return this.periodofmonitoringdays;
	}
	public void setPeriodOfMonitoringDays(Integer value)
	{
		this.isValidated = false;
		this.periodofmonitoringdays = value;
	}
	public boolean getBookApptByIsNotNull()
	{
		return this.bookapptby != null;
	}
	public ims.framework.utils.Date getBookApptBy()
	{
		return this.bookapptby;
	}
	public void setBookApptBy(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.bookapptby = value;
	}
	public boolean getActiveMonitoringCommentsIsNotNull()
	{
		return this.activemonitoringcomments != null;
	}
	public String getActiveMonitoringComments()
	{
		return this.activemonitoringcomments;
	}
	public static int getActiveMonitoringCommentsMaxLength()
	{
		return 3000;
	}
	public void setActiveMonitoringComments(String value)
	{
		this.isValidated = false;
		this.activemonitoringcomments = value;
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getRecordingInformationIsNotNull()
	{
		return this.recordinginformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getRecordingInformation()
	{
		return this.recordinginformation;
	}
	public void setRecordingInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.recordinginformation = value;
	}
	public boolean getActiveMonitoringEndDateIsNotNull()
	{
		return this.activemonitoringenddate != null;
	}
	public ims.framework.utils.Date getActiveMonitoringEndDate()
	{
		return this.activemonitoringenddate;
	}
	public void setActiveMonitoringEndDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.activemonitoringenddate = value;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.recordinginformation != null)
		{
			if(!this.recordinginformation.isValidated())
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
		if(this.startdateactivemonitoring == null)
			listOfErrors.add("StartDateActiveMonitoring is mandatory");
		if(this.periodofmonitoringdays == null)
			listOfErrors.add("PeriodOfMonitoringDays is mandatory");
		if(this.bookapptby == null)
			listOfErrors.add("BookApptBy is mandatory");
		if(this.activemonitoringcomments != null)
			if(this.activemonitoringcomments.length() > 3000)
				listOfErrors.add("The length of the field [activemonitoringcomments] in the value object [ims.careuk.vo.ActiveMonitoringVo] is too big. It should be less or equal to 3000");
		if(this.authoringinformation == null)
			listOfErrors.add("Authoring HCP is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.recordinginformation == null)
			listOfErrors.add("RecordingInformation is mandatory");
		if(this.recordinginformation != null)
		{
			String[] listOfOtherErrors = this.recordinginformation.validate();
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
	
		ActiveMonitoringVo clone = new ActiveMonitoringVo(this.id, this.version);
		
		if(this.startdateactivemonitoring == null)
			clone.startdateactivemonitoring = null;
		else
			clone.startdateactivemonitoring = (ims.framework.utils.DateTime)this.startdateactivemonitoring.clone();
		if(this.activemonitoringreason == null)
			clone.activemonitoringreason = null;
		else
			clone.activemonitoringreason = (ims.careuk.vo.lookups.ActiveMonitoringReason)this.activemonitoringreason.clone();
		clone.periodofmonitoringdays = this.periodofmonitoringdays;
		if(this.bookapptby == null)
			clone.bookapptby = null;
		else
			clone.bookapptby = (ims.framework.utils.Date)this.bookapptby.clone();
		clone.activemonitoringcomments = this.activemonitoringcomments;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.recordinginformation == null)
			clone.recordinginformation = null;
		else
			clone.recordinginformation = (ims.core.vo.AuthoringInformationVo)this.recordinginformation.clone();
		if(this.activemonitoringenddate == null)
			clone.activemonitoringenddate = null;
		else
			clone.activemonitoringenddate = (ims.framework.utils.Date)this.activemonitoringenddate.clone();
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
		if (!(ActiveMonitoringVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ActiveMonitoringVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ActiveMonitoringVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ActiveMonitoringVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.startdateactivemonitoring != null)
			count++;
		if(this.activemonitoringreason != null)
			count++;
		if(this.periodofmonitoringdays != null)
			count++;
		if(this.bookapptby != null)
			count++;
		if(this.activemonitoringcomments != null)
			count++;
		if(this.authoringinformation != null)
			count++;
		if(this.recordinginformation != null)
			count++;
		if(this.activemonitoringenddate != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.framework.utils.DateTime startdateactivemonitoring;
	protected ims.careuk.vo.lookups.ActiveMonitoringReason activemonitoringreason;
	protected Integer periodofmonitoringdays;
	protected ims.framework.utils.Date bookapptby;
	protected String activemonitoringcomments;
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.vo.AuthoringInformationVo recordinginformation;
	protected ims.framework.utils.Date activemonitoringenddate;
	private boolean isValidated = false;
	private boolean isBusy = false;
}