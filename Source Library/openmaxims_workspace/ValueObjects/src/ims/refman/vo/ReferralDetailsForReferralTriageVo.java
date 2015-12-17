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
 * Linked to core.clinical.ReferralLetterDetails business object (ID: 1003100093).
 */
public class ReferralDetailsForReferralTriageVo extends ims.core.clinical.vo.ReferralLetterDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ReferralDetailsForReferralTriageVo()
	{
	}
	public ReferralDetailsForReferralTriageVo(Integer id, int version)
	{
		super(id, version);
	}
	public ReferralDetailsForReferralTriageVo(ims.RefMan.vo.beans.ReferralDetailsForReferralTriageVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.service = bean.getService() == null ? null : bean.getService().buildVo();
		this.consultant = bean.getConsultant() == null ? null : bean.getConsultant().buildVo();
		this.function = bean.getFunction() == null ? null : bean.getFunction().buildVo();
		this.originalservice = bean.getOriginalService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getOriginalService().getId()), bean.getOriginalService().getVersion());
		this.serviceupdatehistory = ims.RefMan.vo.ReferralServiceUpdatesVoCollection.buildFromBeanCollection(bean.getServiceUpdateHistory());
		this.dateofreferral = bean.getDateOfReferral() == null ? null : bean.getDateOfReferral().buildDate();
		this.end18ww = bean.getEnd18WW() == null ? null : bean.getEnd18WW().buildDate();
		this.originalconsultant = bean.getOriginalConsultant() == null ? null : bean.getOriginalConsultant().buildVo();
		this.referrertype = bean.getReferrerType() == null ? null : ims.core.vo.lookups.SourceOfReferral.buildLookup(bean.getReferrerType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.ReferralDetailsForReferralTriageVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.service = bean.getService() == null ? null : bean.getService().buildVo(map);
		this.consultant = bean.getConsultant() == null ? null : bean.getConsultant().buildVo(map);
		this.function = bean.getFunction() == null ? null : bean.getFunction().buildVo(map);
		this.originalservice = bean.getOriginalService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getOriginalService().getId()), bean.getOriginalService().getVersion());
		this.serviceupdatehistory = ims.RefMan.vo.ReferralServiceUpdatesVoCollection.buildFromBeanCollection(bean.getServiceUpdateHistory());
		this.dateofreferral = bean.getDateOfReferral() == null ? null : bean.getDateOfReferral().buildDate();
		this.end18ww = bean.getEnd18WW() == null ? null : bean.getEnd18WW().buildDate();
		this.originalconsultant = bean.getOriginalConsultant() == null ? null : bean.getOriginalConsultant().buildVo(map);
		this.referrertype = bean.getReferrerType() == null ? null : ims.core.vo.lookups.SourceOfReferral.buildLookup(bean.getReferrerType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.ReferralDetailsForReferralTriageVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.ReferralDetailsForReferralTriageVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.ReferralDetailsForReferralTriageVoBean();
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
		if(fieldName.equals("SERVICE"))
			return getService();
		if(fieldName.equals("CONSULTANT"))
			return getConsultant();
		if(fieldName.equals("FUNCTION"))
			return getFunction();
		if(fieldName.equals("ORIGINALSERVICE"))
			return getOriginalService();
		if(fieldName.equals("SERVICEUPDATEHISTORY"))
			return getServiceUpdateHistory();
		if(fieldName.equals("DATEOFREFERRAL"))
			return getDateOfReferral();
		if(fieldName.equals("END18WW"))
			return getEnd18WW();
		if(fieldName.equals("ORIGINALCONSULTANT"))
			return getOriginalConsultant();
		if(fieldName.equals("REFERRERTYPE"))
			return getReferrerType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getServiceIsNotNull()
	{
		return this.service != null;
	}
	public ims.core.vo.ServiceLiteVo getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.ServiceLiteVo value)
	{
		this.isValidated = false;
		this.service = value;
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
	public boolean getFunctionIsNotNull()
	{
		return this.function != null;
	}
	public ims.core.vo.ServiceFunctionLiteVo getFunction()
	{
		return this.function;
	}
	public void setFunction(ims.core.vo.ServiceFunctionLiteVo value)
	{
		this.isValidated = false;
		this.function = value;
	}
	public boolean getOriginalServiceIsNotNull()
	{
		return this.originalservice != null;
	}
	public ims.core.clinical.vo.ServiceRefVo getOriginalService()
	{
		return this.originalservice;
	}
	public void setOriginalService(ims.core.clinical.vo.ServiceRefVo value)
	{
		this.isValidated = false;
		this.originalservice = value;
	}
	public boolean getServiceUpdateHistoryIsNotNull()
	{
		return this.serviceupdatehistory != null;
	}
	public ims.RefMan.vo.ReferralServiceUpdatesVoCollection getServiceUpdateHistory()
	{
		return this.serviceupdatehistory;
	}
	public void setServiceUpdateHistory(ims.RefMan.vo.ReferralServiceUpdatesVoCollection value)
	{
		this.isValidated = false;
		this.serviceupdatehistory = value;
	}
	public boolean getDateOfReferralIsNotNull()
	{
		return this.dateofreferral != null;
	}
	public ims.framework.utils.Date getDateOfReferral()
	{
		return this.dateofreferral;
	}
	public void setDateOfReferral(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dateofreferral = value;
	}
	public boolean getEnd18WWIsNotNull()
	{
		return this.end18ww != null;
	}
	public ims.framework.utils.Date getEnd18WW()
	{
		return this.end18ww;
	}
	public void setEnd18WW(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.end18ww = value;
	}
	public boolean getOriginalConsultantIsNotNull()
	{
		return this.originalconsultant != null;
	}
	public ims.core.vo.HcpLiteVo getOriginalConsultant()
	{
		return this.originalconsultant;
	}
	public void setOriginalConsultant(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.originalconsultant = value;
	}
	public boolean getReferrerTypeIsNotNull()
	{
		return this.referrertype != null;
	}
	public ims.core.vo.lookups.SourceOfReferral getReferrerType()
	{
		return this.referrertype;
	}
	public void setReferrerType(ims.core.vo.lookups.SourceOfReferral value)
	{
		this.isValidated = false;
		this.referrertype = value;
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
		if(this.serviceupdatehistory != null)
		{
			if(!this.serviceupdatehistory.isValidated())
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
		if(this.service == null)
			listOfErrors.add("Service is mandatory");
		if(this.serviceupdatehistory != null)
		{
			String[] listOfOtherErrors = this.serviceupdatehistory.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.dateofreferral == null)
			listOfErrors.add("DateOfReferral is mandatory");
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
	
		ReferralDetailsForReferralTriageVo clone = new ReferralDetailsForReferralTriageVo(this.id, this.version);
		
		if(this.service == null)
			clone.service = null;
		else
			clone.service = (ims.core.vo.ServiceLiteVo)this.service.clone();
		if(this.consultant == null)
			clone.consultant = null;
		else
			clone.consultant = (ims.core.vo.HcpLiteVo)this.consultant.clone();
		if(this.function == null)
			clone.function = null;
		else
			clone.function = (ims.core.vo.ServiceFunctionLiteVo)this.function.clone();
		clone.originalservice = this.originalservice;
		if(this.serviceupdatehistory == null)
			clone.serviceupdatehistory = null;
		else
			clone.serviceupdatehistory = (ims.RefMan.vo.ReferralServiceUpdatesVoCollection)this.serviceupdatehistory.clone();
		if(this.dateofreferral == null)
			clone.dateofreferral = null;
		else
			clone.dateofreferral = (ims.framework.utils.Date)this.dateofreferral.clone();
		if(this.end18ww == null)
			clone.end18ww = null;
		else
			clone.end18ww = (ims.framework.utils.Date)this.end18ww.clone();
		if(this.originalconsultant == null)
			clone.originalconsultant = null;
		else
			clone.originalconsultant = (ims.core.vo.HcpLiteVo)this.originalconsultant.clone();
		if(this.referrertype == null)
			clone.referrertype = null;
		else
			clone.referrertype = (ims.core.vo.lookups.SourceOfReferral)this.referrertype.clone();
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
		if (!(ReferralDetailsForReferralTriageVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ReferralDetailsForReferralTriageVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ReferralDetailsForReferralTriageVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ReferralDetailsForReferralTriageVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.service != null)
			count++;
		if(this.consultant != null)
			count++;
		if(this.function != null)
			count++;
		if(this.originalservice != null)
			count++;
		if(this.serviceupdatehistory != null)
			count++;
		if(this.dateofreferral != null)
			count++;
		if(this.end18ww != null)
			count++;
		if(this.originalconsultant != null)
			count++;
		if(this.referrertype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.vo.ServiceLiteVo service;
	protected ims.core.vo.HcpLiteVo consultant;
	protected ims.core.vo.ServiceFunctionLiteVo function;
	protected ims.core.clinical.vo.ServiceRefVo originalservice;
	protected ims.RefMan.vo.ReferralServiceUpdatesVoCollection serviceupdatehistory;
	protected ims.framework.utils.Date dateofreferral;
	protected ims.framework.utils.Date end18ww;
	protected ims.core.vo.HcpLiteVo originalconsultant;
	protected ims.core.vo.lookups.SourceOfReferral referrertype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}