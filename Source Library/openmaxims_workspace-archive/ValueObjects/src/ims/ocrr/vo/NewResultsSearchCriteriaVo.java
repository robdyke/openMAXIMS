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

package ims.ocrr.vo;


public class NewResultsSearchCriteriaVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public NewResultsSearchCriteriaVo()
	{
	}
	public NewResultsSearchCriteriaVo(ims.ocrr.vo.beans.NewResultsSearchCriteriaVoBean bean)
	{
		this.hospital = bean.getHospital() == null ? null : bean.getHospital().buildVo();
		this.orderinglocationtype = bean.getOrderingLocationType();
		// Base value object field type not supported.
		// Base value object field type not supported.
		this.discipline = bean.getDiscipline() == null ? null : bean.getDiscipline().buildVo();
		this.orderinghcp = bean.getOrderingHCP() == null ? null : bean.getOrderingHCP().buildVo();
		this.inpatients = bean.getInpatients();
		this.newupdated = bean.getNewUpdated();
		this.fromdate = bean.getFromDate() == null ? null : bean.getFromDate().buildDate();
		this.todate = bean.getToDate() == null ? null : bean.getToDate().buildDate();
		this.days = bean.getDays();
		this.seenchecked = bean.getSeenChecked();
		this.forreview = bean.getForReview();
		this.specialty = bean.getSpecialty();
		this.specialtyinstance = bean.getSpecialtyInstance() == null ? null : bean.getSpecialtyInstance().buildLookupInstVo();
		this.initiallyseenbyhcp = bean.getInitiallySeenByHCP() == null ? null : bean.getInitiallySeenByHCP().buildVo();
		this.completed = bean.getCompleted();
		this.checked = bean.getChecked();
		this.reviewinghcp = bean.getReviewingHCP() == null ? null : bean.getReviewingHCP().buildVo();
		this.responsibleclinician = bean.getResponsibleClinician() == null ? null : bean.getResponsibleClinician().buildVo();
		this.excludeinpatients = bean.getExcludeInpatients();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.NewResultsSearchCriteriaVoBean bean)
	{
		this.hospital = bean.getHospital() == null ? null : bean.getHospital().buildVo(map);
		this.orderinglocationtype = bean.getOrderingLocationType();
		// Base value object field type not supported.
		// Base value object field type not supported.
		this.discipline = bean.getDiscipline() == null ? null : bean.getDiscipline().buildVo(map);
		this.orderinghcp = bean.getOrderingHCP() == null ? null : bean.getOrderingHCP().buildVo(map);
		this.inpatients = bean.getInpatients();
		this.newupdated = bean.getNewUpdated();
		this.fromdate = bean.getFromDate() == null ? null : bean.getFromDate().buildDate();
		this.todate = bean.getToDate() == null ? null : bean.getToDate().buildDate();
		this.days = bean.getDays();
		this.seenchecked = bean.getSeenChecked();
		this.forreview = bean.getForReview();
		this.specialty = bean.getSpecialty();
		this.specialtyinstance = bean.getSpecialtyInstance() == null ? null : bean.getSpecialtyInstance().buildLookupInstVo();
		this.initiallyseenbyhcp = bean.getInitiallySeenByHCP() == null ? null : bean.getInitiallySeenByHCP().buildVo(map);
		this.completed = bean.getCompleted();
		this.checked = bean.getChecked();
		this.reviewinghcp = bean.getReviewingHCP() == null ? null : bean.getReviewingHCP().buildVo(map);
		this.responsibleclinician = bean.getResponsibleClinician() == null ? null : bean.getResponsibleClinician().buildVo(map);
		this.excludeinpatients = bean.getExcludeInpatients();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.NewResultsSearchCriteriaVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.NewResultsSearchCriteriaVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.NewResultsSearchCriteriaVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getHospitalIsNotNull()
	{
		return this.hospital != null;
	}
	public ims.core.vo.LocationLiteVo getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.hospital = value;
	}
	public boolean getOrderingLocationTypeIsNotNull()
	{
		return this.orderinglocationtype != null;
	}
	public Integer getOrderingLocationType()
	{
		return this.orderinglocationtype;
	}
	public void setOrderingLocationType(Integer value)
	{
		this.isValidated = false;
		this.orderinglocationtype = value;
	}
	public boolean getOrderingLocationIsNotNull()
	{
		return this.orderinglocation != null;
	}
	public ims.vo.ValueObject getOrderingLocation()
	{
		return this.orderinglocation;
	}
	public void setOrderingLocation(ims.vo.ValueObject value)
	{
		this.isValidated = false;
		this.orderinglocation = value;
	}
	public boolean getOrderingClinicianIsNotNull()
	{
		return this.orderingclinician != null;
	}
	public ims.vo.ValueObject getOrderingClinician()
	{
		return this.orderingclinician;
	}
	public void setOrderingClinician(ims.vo.ValueObject value)
	{
		this.isValidated = false;
		this.orderingclinician = value;
	}
	public boolean getDisciplineIsNotNull()
	{
		return this.discipline != null;
	}
	public ims.core.vo.ServiceLiteVo getDiscipline()
	{
		return this.discipline;
	}
	public void setDiscipline(ims.core.vo.ServiceLiteVo value)
	{
		this.isValidated = false;
		this.discipline = value;
	}
	public boolean getOrderingHCPIsNotNull()
	{
		return this.orderinghcp != null;
	}
	public ims.core.vo.HcpLiteVo getOrderingHCP()
	{
		return this.orderinghcp;
	}
	public void setOrderingHCP(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.orderinghcp = value;
	}
	public boolean getInpatientsIsNotNull()
	{
		return this.inpatients != null;
	}
	public Integer getInpatients()
	{
		return this.inpatients;
	}
	public void setInpatients(Integer value)
	{
		this.isValidated = false;
		this.inpatients = value;
	}
	public boolean getNewUpdatedIsNotNull()
	{
		return this.newupdated != null;
	}
	public Boolean getNewUpdated()
	{
		return this.newupdated;
	}
	public void setNewUpdated(Boolean value)
	{
		this.isValidated = false;
		this.newupdated = value;
	}
	public boolean getFromDateIsNotNull()
	{
		return this.fromdate != null;
	}
	public ims.framework.utils.Date getFromDate()
	{
		return this.fromdate;
	}
	public void setFromDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.fromdate = value;
	}
	public boolean getToDateIsNotNull()
	{
		return this.todate != null;
	}
	public ims.framework.utils.Date getToDate()
	{
		return this.todate;
	}
	public void setToDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.todate = value;
	}
	public boolean getDaysIsNotNull()
	{
		return this.days != null;
	}
	public Integer getDays()
	{
		return this.days;
	}
	public void setDays(Integer value)
	{
		this.isValidated = false;
		this.days = value;
	}
	public boolean getSeenCheckedIsNotNull()
	{
		return this.seenchecked != null;
	}
	public Boolean getSeenChecked()
	{
		return this.seenchecked;
	}
	public void setSeenChecked(Boolean value)
	{
		this.isValidated = false;
		this.seenchecked = value;
	}
	public boolean getForReviewIsNotNull()
	{
		return this.forreview != null;
	}
	public Boolean getForReview()
	{
		return this.forreview;
	}
	public void setForReview(Boolean value)
	{
		this.isValidated = false;
		this.forreview = value;
	}
	public boolean getSpecialtyIsNotNull()
	{
		return this.specialty != null;
	}
	public Boolean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(Boolean value)
	{
		this.isValidated = false;
		this.specialty = value;
	}
	public boolean getSpecialtyInstanceIsNotNull()
	{
		return this.specialtyinstance != null;
	}
	public ims.vo.LookupInstVo getSpecialtyInstance()
	{
		return this.specialtyinstance;
	}
	public void setSpecialtyInstance(ims.vo.LookupInstVo value)
	{
		this.isValidated = false;
		this.specialtyinstance = value;
	}
	public boolean getInitiallySeenByHCPIsNotNull()
	{
		return this.initiallyseenbyhcp != null;
	}
	public ims.core.vo.HcpLiteVo getInitiallySeenByHCP()
	{
		return this.initiallyseenbyhcp;
	}
	public void setInitiallySeenByHCP(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.initiallyseenbyhcp = value;
	}
	public boolean getCompletedIsNotNull()
	{
		return this.completed != null;
	}
	public Boolean getCompleted()
	{
		return this.completed;
	}
	public void setCompleted(Boolean value)
	{
		this.isValidated = false;
		this.completed = value;
	}
	public boolean getCheckedIsNotNull()
	{
		return this.checked != null;
	}
	public Boolean getChecked()
	{
		return this.checked;
	}
	public void setChecked(Boolean value)
	{
		this.isValidated = false;
		this.checked = value;
	}
	public boolean getReviewingHCPIsNotNull()
	{
		return this.reviewinghcp != null;
	}
	public ims.core.vo.HcpLiteVo getReviewingHCP()
	{
		return this.reviewinghcp;
	}
	public void setReviewingHCP(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.reviewinghcp = value;
	}
	public boolean getResponsibleClinicianIsNotNull()
	{
		return this.responsibleclinician != null;
	}
	public ims.core.vo.HcpLiteVo getResponsibleClinician()
	{
		return this.responsibleclinician;
	}
	public void setResponsibleClinician(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.responsibleclinician = value;
	}
	public boolean getExcludeInpatientsIsNotNull()
	{
		return this.excludeinpatients != null;
	}
	public Boolean getExcludeInpatients()
	{
		return this.excludeinpatients;
	}
	public void setExcludeInpatients(Boolean value)
	{
		this.isValidated = false;
		this.excludeinpatients = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof NewResultsSearchCriteriaVo))
			return false;
		NewResultsSearchCriteriaVo compareObj = (NewResultsSearchCriteriaVo)obj;
		if(this.getHospital() == null && compareObj.getHospital() != null)
			return false;
		if(this.getHospital() != null && compareObj.getHospital() == null)
			return false;
		if(this.getHospital() != null && compareObj.getHospital() != null)
			return this.getHospital().equals(compareObj.getHospital());
		return super.equals(obj);
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
		if(this.orderinglocation != null)
		{
			if(!this.orderinglocation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.orderingclinician != null)
		{
			if(!this.orderingclinician.isValidated())
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
		if(this.orderinglocation != null)
		{
			String[] listOfOtherErrors = this.orderinglocation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.orderingclinician != null)
		{
			String[] listOfOtherErrors = this.orderingclinician.validate();
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		NewResultsSearchCriteriaVo clone = new NewResultsSearchCriteriaVo();
		
		if(this.hospital == null)
			clone.hospital = null;
		else
			clone.hospital = (ims.core.vo.LocationLiteVo)this.hospital.clone();
		clone.orderinglocationtype = this.orderinglocationtype;
		if(this.orderinglocation == null)
			clone.orderinglocation = null;
		else
			clone.orderinglocation = (ims.vo.ValueObject)this.orderinglocation.clone();
		if(this.orderingclinician == null)
			clone.orderingclinician = null;
		else
			clone.orderingclinician = (ims.vo.ValueObject)this.orderingclinician.clone();
		if(this.discipline == null)
			clone.discipline = null;
		else
			clone.discipline = (ims.core.vo.ServiceLiteVo)this.discipline.clone();
		if(this.orderinghcp == null)
			clone.orderinghcp = null;
		else
			clone.orderinghcp = (ims.core.vo.HcpLiteVo)this.orderinghcp.clone();
		clone.inpatients = this.inpatients;
		clone.newupdated = this.newupdated;
		if(this.fromdate == null)
			clone.fromdate = null;
		else
			clone.fromdate = (ims.framework.utils.Date)this.fromdate.clone();
		if(this.todate == null)
			clone.todate = null;
		else
			clone.todate = (ims.framework.utils.Date)this.todate.clone();
		clone.days = this.days;
		clone.seenchecked = this.seenchecked;
		clone.forreview = this.forreview;
		clone.specialty = this.specialty;
		clone.specialtyinstance = this.specialtyinstance;
		if(this.initiallyseenbyhcp == null)
			clone.initiallyseenbyhcp = null;
		else
			clone.initiallyseenbyhcp = (ims.core.vo.HcpLiteVo)this.initiallyseenbyhcp.clone();
		clone.completed = this.completed;
		clone.checked = this.checked;
		if(this.reviewinghcp == null)
			clone.reviewinghcp = null;
		else
			clone.reviewinghcp = (ims.core.vo.HcpLiteVo)this.reviewinghcp.clone();
		if(this.responsibleclinician == null)
			clone.responsibleclinician = null;
		else
			clone.responsibleclinician = (ims.core.vo.HcpLiteVo)this.responsibleclinician.clone();
		clone.excludeinpatients = this.excludeinpatients;
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
		if (!(NewResultsSearchCriteriaVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A NewResultsSearchCriteriaVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		NewResultsSearchCriteriaVo compareObj = (NewResultsSearchCriteriaVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getHospital() == null && compareObj.getHospital() != null)
				return -1;
			if(this.getHospital() != null && compareObj.getHospital() == null)
				return 1;
			if(this.getHospital() != null && compareObj.getHospital() != null)
				retVal = this.getHospital().compareTo(compareObj.getHospital());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.hospital != null)
			count++;
		if(this.orderinglocationtype != null)
			count++;
		if(this.orderinglocation != null)
			count++;
		if(this.orderingclinician != null)
			count++;
		if(this.discipline != null)
			count++;
		if(this.orderinghcp != null)
			count++;
		if(this.inpatients != null)
			count++;
		if(this.newupdated != null)
			count++;
		if(this.fromdate != null)
			count++;
		if(this.todate != null)
			count++;
		if(this.days != null)
			count++;
		if(this.seenchecked != null)
			count++;
		if(this.forreview != null)
			count++;
		if(this.specialty != null)
			count++;
		if(this.specialtyinstance != null)
			count++;
		if(this.initiallyseenbyhcp != null)
			count++;
		if(this.completed != null)
			count++;
		if(this.checked != null)
			count++;
		if(this.reviewinghcp != null)
			count++;
		if(this.responsibleclinician != null)
			count++;
		if(this.excludeinpatients != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 21;
	}
	protected ims.core.vo.LocationLiteVo hospital;
	protected Integer orderinglocationtype;
	protected ims.vo.ValueObject orderinglocation;
	protected ims.vo.ValueObject orderingclinician;
	protected ims.core.vo.ServiceLiteVo discipline;
	protected ims.core.vo.HcpLiteVo orderinghcp;
	protected Integer inpatients;
	protected Boolean newupdated;
	protected ims.framework.utils.Date fromdate;
	protected ims.framework.utils.Date todate;
	protected Integer days;
	protected Boolean seenchecked;
	protected Boolean forreview;
	protected Boolean specialty;
	protected ims.vo.LookupInstVo specialtyinstance;
	protected ims.core.vo.HcpLiteVo initiallyseenbyhcp;
	protected Boolean completed;
	protected Boolean checked;
	protected ims.core.vo.HcpLiteVo reviewinghcp;
	protected ims.core.vo.HcpLiteVo responsibleclinician;
	protected Boolean excludeinpatients;
	private boolean isValidated = false;
	private boolean isBusy = false;
}