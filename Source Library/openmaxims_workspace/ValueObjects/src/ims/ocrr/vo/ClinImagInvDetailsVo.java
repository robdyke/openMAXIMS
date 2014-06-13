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

/**
 * Linked to OCRR.Configuration.ClinImagInvDetails business object (ID: 1058100002).
 */
public class ClinImagInvDetailsVo extends ims.ocrr.configuration.vo.ClinImagInvDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClinImagInvDetailsVo()
	{
	}
	public ClinImagInvDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClinImagInvDetailsVo(ims.ocrr.vo.beans.ClinImagInvDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.durationval = bean.getDurationVal();
		this.durationunit = bean.getDurationUnit() == null ? null : ims.ocrr.vo.lookups.ClinImagDurUnit.buildLookup(bean.getDurationUnit());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.ClinImagInvDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.durationval = bean.getDurationVal();
		this.durationunit = bean.getDurationUnit() == null ? null : ims.ocrr.vo.lookups.ClinImagDurUnit.buildLookup(bean.getDurationUnit());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.ClinImagInvDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.ClinImagInvDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.ClinImagInvDetailsVoBean();
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
		if(fieldName.equals("DURATIONVAL"))
			return getDurationVal();
		if(fieldName.equals("DURATIONUNIT"))
			return getDurationUnit();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDurationValIsNotNull()
	{
		return this.durationval != null;
	}
	public Integer getDurationVal()
	{
		return this.durationval;
	}
	public void setDurationVal(Integer value)
	{
		this.isValidated = false;
		this.durationval = value;
	}
	public boolean getDurationUnitIsNotNull()
	{
		return this.durationunit != null;
	}
	public ims.ocrr.vo.lookups.ClinImagDurUnit getDurationUnit()
	{
		return this.durationunit;
	}
	public void setDurationUnit(ims.ocrr.vo.lookups.ClinImagDurUnit value)
	{
		this.isValidated = false;
		this.durationunit = value;
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
	
		ClinImagInvDetailsVo clone = new ClinImagInvDetailsVo(this.id, this.version);
		
		clone.durationval = this.durationval;
		if(this.durationunit == null)
			clone.durationunit = null;
		else
			clone.durationunit = (ims.ocrr.vo.lookups.ClinImagDurUnit)this.durationunit.clone();
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
		if (!(ClinImagInvDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClinImagInvDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		ClinImagInvDetailsVo compareObj = (ClinImagInvDetailsVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_ClinImagInvDetails() == null && compareObj.getID_ClinImagInvDetails() != null)
				return -1;
			if(this.getID_ClinImagInvDetails() != null && compareObj.getID_ClinImagInvDetails() == null)
				return 1;
			if(this.getID_ClinImagInvDetails() != null && compareObj.getID_ClinImagInvDetails() != null)
				retVal = this.getID_ClinImagInvDetails().compareTo(compareObj.getID_ClinImagInvDetails());
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
		if(this.durationval != null)
			count++;
		if(this.durationunit != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected Integer durationval;
	protected ims.ocrr.vo.lookups.ClinImagDurUnit durationunit;
	private boolean isValidated = false;
	private boolean isBusy = false;
}