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

package ims.correspondence.vo;

/**
 * Linked to correspondence.configuration.UserAccess business object (ID: 1053100011).
 */
public class UserAccessFullVo extends ims.correspondence.configuration.vo.UserAccessRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public UserAccessFullVo()
	{
	}
	public UserAccessFullVo(Integer id, int version)
	{
		super(id, version);
	}
	public UserAccessFullVo(ims.correspondence.vo.beans.UserAccessFullVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.appuser = bean.getAppUser() == null ? null : new ims.core.configuration.vo.AppUserRefVo(new Integer(bean.getAppUser().getId()), bean.getAppUser().getVersion());
		this.consultantaccess = ims.correspondence.vo.ConsultantAccessFullVoCollection.buildFromBeanCollection(bean.getConsultantAccess());
		this.clinicaccess = ims.correspondence.vo.ClinicAccessFullVoCollection.buildFromBeanCollection(bean.getClinicAccess());
		this.specialtyaccess = ims.correspondence.vo.SpecialtyAccessVoCollection.buildFromBeanCollection(bean.getSpecialtyAccess());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.correspondence.vo.beans.UserAccessFullVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.appuser = bean.getAppUser() == null ? null : new ims.core.configuration.vo.AppUserRefVo(new Integer(bean.getAppUser().getId()), bean.getAppUser().getVersion());
		this.consultantaccess = ims.correspondence.vo.ConsultantAccessFullVoCollection.buildFromBeanCollection(bean.getConsultantAccess());
		this.clinicaccess = ims.correspondence.vo.ClinicAccessFullVoCollection.buildFromBeanCollection(bean.getClinicAccess());
		this.specialtyaccess = ims.correspondence.vo.SpecialtyAccessVoCollection.buildFromBeanCollection(bean.getSpecialtyAccess());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.correspondence.vo.beans.UserAccessFullVoBean bean = null;
		if(map != null)
			bean = (ims.correspondence.vo.beans.UserAccessFullVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.correspondence.vo.beans.UserAccessFullVoBean();
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
		if(fieldName.equals("APPUSER"))
			return getAppUser();
		if(fieldName.equals("CONSULTANTACCESS"))
			return getConsultantAccess();
		if(fieldName.equals("CLINICACCESS"))
			return getClinicAccess();
		if(fieldName.equals("SPECIALTYACCESS"))
			return getSpecialtyAccess();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAppUserIsNotNull()
	{
		return this.appuser != null;
	}
	public ims.core.configuration.vo.AppUserRefVo getAppUser()
	{
		return this.appuser;
	}
	public void setAppUser(ims.core.configuration.vo.AppUserRefVo value)
	{
		this.isValidated = false;
		this.appuser = value;
	}
	public boolean getConsultantAccessIsNotNull()
	{
		return this.consultantaccess != null;
	}
	public ims.correspondence.vo.ConsultantAccessFullVoCollection getConsultantAccess()
	{
		return this.consultantaccess;
	}
	public void setConsultantAccess(ims.correspondence.vo.ConsultantAccessFullVoCollection value)
	{
		this.isValidated = false;
		this.consultantaccess = value;
	}
	public boolean getClinicAccessIsNotNull()
	{
		return this.clinicaccess != null;
	}
	public ims.correspondence.vo.ClinicAccessFullVoCollection getClinicAccess()
	{
		return this.clinicaccess;
	}
	public void setClinicAccess(ims.correspondence.vo.ClinicAccessFullVoCollection value)
	{
		this.isValidated = false;
		this.clinicaccess = value;
	}
	public boolean getSpecialtyAccessIsNotNull()
	{
		return this.specialtyaccess != null;
	}
	public ims.correspondence.vo.SpecialtyAccessVoCollection getSpecialtyAccess()
	{
		return this.specialtyaccess;
	}
	public void setSpecialtyAccess(ims.correspondence.vo.SpecialtyAccessVoCollection value)
	{
		this.isValidated = false;
		this.specialtyaccess = value;
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
		if(this.consultantaccess != null)
		{
			if(!this.consultantaccess.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.clinicaccess != null)
		{
			if(!this.clinicaccess.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.specialtyaccess != null)
		{
			if(!this.specialtyaccess.isValidated())
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
		if(this.appuser == null)
			listOfErrors.add("AppUser is mandatory");
		if(this.consultantaccess != null)
		{
			String[] listOfOtherErrors = this.consultantaccess.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.clinicaccess != null)
		{
			String[] listOfOtherErrors = this.clinicaccess.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.specialtyaccess != null)
		{
			String[] listOfOtherErrors = this.specialtyaccess.validate();
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
	
		UserAccessFullVo clone = new UserAccessFullVo(this.id, this.version);
		
		clone.appuser = this.appuser;
		if(this.consultantaccess == null)
			clone.consultantaccess = null;
		else
			clone.consultantaccess = (ims.correspondence.vo.ConsultantAccessFullVoCollection)this.consultantaccess.clone();
		if(this.clinicaccess == null)
			clone.clinicaccess = null;
		else
			clone.clinicaccess = (ims.correspondence.vo.ClinicAccessFullVoCollection)this.clinicaccess.clone();
		if(this.specialtyaccess == null)
			clone.specialtyaccess = null;
		else
			clone.specialtyaccess = (ims.correspondence.vo.SpecialtyAccessVoCollection)this.specialtyaccess.clone();
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
		if (!(UserAccessFullVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A UserAccessFullVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((UserAccessFullVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((UserAccessFullVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.appuser != null)
			count++;
		if(this.consultantaccess != null)
			count++;
		if(this.clinicaccess != null)
			count++;
		if(this.specialtyaccess != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.configuration.vo.AppUserRefVo appuser;
	protected ims.correspondence.vo.ConsultantAccessFullVoCollection consultantaccess;
	protected ims.correspondence.vo.ClinicAccessFullVoCollection clinicaccess;
	protected ims.correspondence.vo.SpecialtyAccessVoCollection specialtyaccess;
	private boolean isValidated = false;
	private boolean isBusy = false;
}