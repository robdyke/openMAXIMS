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

package ims.ntpf.vo;

/**
 * Linked to core.resource.ServiceActivityExport business object (ID: 1005100006).
 */
public class ServiceActivityExportVo extends ims.core.resource.vo.ServiceActivityExportRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ServiceActivityExportVo()
	{
	}
	public ServiceActivityExportVo(Integer id, int version)
	{
		super(id, version);
	}
	public ServiceActivityExportVo(ims.ntpf.vo.beans.ServiceActivityExportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.serviceactivity = bean.getServiceActivity() == null ? null : new ims.core.resource.vo.ServiceActivityRefVo(new Integer(bean.getServiceActivity().getId()), bean.getServiceActivity().getVersion());
		this.readyforexport = bean.getReadyForExport();
		this.datelastexported = bean.getDateLastExported() == null ? null : bean.getDateLastExported().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ntpf.vo.beans.ServiceActivityExportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.serviceactivity = bean.getServiceActivity() == null ? null : new ims.core.resource.vo.ServiceActivityRefVo(new Integer(bean.getServiceActivity().getId()), bean.getServiceActivity().getVersion());
		this.readyforexport = bean.getReadyForExport();
		this.datelastexported = bean.getDateLastExported() == null ? null : bean.getDateLastExported().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ntpf.vo.beans.ServiceActivityExportVoBean bean = null;
		if(map != null)
			bean = (ims.ntpf.vo.beans.ServiceActivityExportVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ntpf.vo.beans.ServiceActivityExportVoBean();
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
		if(fieldName.equals("SERVICEACTIVITY"))
			return getServiceActivity();
		if(fieldName.equals("READYFOREXPORT"))
			return getReadyForExport();
		if(fieldName.equals("DATELASTEXPORTED"))
			return getDateLastExported();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getServiceActivityIsNotNull()
	{
		return this.serviceactivity != null;
	}
	public ims.core.resource.vo.ServiceActivityRefVo getServiceActivity()
	{
		return this.serviceactivity;
	}
	public void setServiceActivity(ims.core.resource.vo.ServiceActivityRefVo value)
	{
		this.isValidated = false;
		this.serviceactivity = value;
	}
	public boolean getReadyForExportIsNotNull()
	{
		return this.readyforexport != null;
	}
	public Boolean getReadyForExport()
	{
		return this.readyforexport;
	}
	public void setReadyForExport(Boolean value)
	{
		this.isValidated = false;
		this.readyforexport = value;
	}
	public boolean getDateLastExportedIsNotNull()
	{
		return this.datelastexported != null;
	}
	public ims.framework.utils.DateTime getDateLastExported()
	{
		return this.datelastexported;
	}
	public void setDateLastExported(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.datelastexported = value;
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
	
		ServiceActivityExportVo clone = new ServiceActivityExportVo(this.id, this.version);
		
		clone.serviceactivity = this.serviceactivity;
		clone.readyforexport = this.readyforexport;
		if(this.datelastexported == null)
			clone.datelastexported = null;
		else
			clone.datelastexported = (ims.framework.utils.DateTime)this.datelastexported.clone();
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
		if (!(ServiceActivityExportVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ServiceActivityExportVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ServiceActivityExportVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ServiceActivityExportVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.serviceactivity != null)
			count++;
		if(this.readyforexport != null)
			count++;
		if(this.datelastexported != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.resource.vo.ServiceActivityRefVo serviceactivity;
	protected Boolean readyforexport;
	protected ims.framework.utils.DateTime datelastexported;
	private boolean isValidated = false;
	private boolean isBusy = false;
}