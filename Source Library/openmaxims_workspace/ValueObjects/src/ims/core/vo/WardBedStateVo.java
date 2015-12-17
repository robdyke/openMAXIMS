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

package ims.core.vo;


public class WardBedStateVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public WardBedStateVo()
	{
	}
	public WardBedStateVo(ims.core.vo.beans.WardBedStateVoBean bean)
	{
		this.bedspace = bean.getBedSpace() == null ? null : bean.getBedSpace().buildVo();
		this.bedspacestate = bean.getBedSpaceState() == null ? null : bean.getBedSpaceState().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.WardBedStateVoBean bean)
	{
		this.bedspace = bean.getBedSpace() == null ? null : bean.getBedSpace().buildVo(map);
		this.bedspacestate = bean.getBedSpaceState() == null ? null : bean.getBedSpaceState().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.WardBedStateVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.WardBedStateVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.WardBedStateVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getBedSpaceIsNotNull()
	{
		return this.bedspace != null;
	}
	public ims.core.vo.BedSpaceVo getBedSpace()
	{
		return this.bedspace;
	}
	public void setBedSpace(ims.core.vo.BedSpaceVo value)
	{
		this.isValidated = false;
		this.bedspace = value;
	}
	public boolean getBedSpaceStateIsNotNull()
	{
		return this.bedspacestate != null;
	}
	public ims.core.vo.BedSpaceStateShortVo getBedSpaceState()
	{
		return this.bedspacestate;
	}
	public void setBedSpaceState(ims.core.vo.BedSpaceStateShortVo value)
	{
		this.isValidated = false;
		this.bedspacestate = value;
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
		if(!(obj instanceof WardBedStateVo))
			return false;
		WardBedStateVo compareObj = (WardBedStateVo)obj;
		if(this.getBedSpace() == null && compareObj.getBedSpace() != null)
			return false;
		if(this.getBedSpace() != null && compareObj.getBedSpace() == null)
			return false;
		if(this.getBedSpace() != null && compareObj.getBedSpace() != null)
			return this.getBedSpace().equals(compareObj.getBedSpace());
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		WardBedStateVo clone = new WardBedStateVo();
		
		if(this.bedspace == null)
			clone.bedspace = null;
		else
			clone.bedspace = (ims.core.vo.BedSpaceVo)this.bedspace.clone();
		if(this.bedspacestate == null)
			clone.bedspacestate = null;
		else
			clone.bedspacestate = (ims.core.vo.BedSpaceStateShortVo)this.bedspacestate.clone();
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
		if (!(WardBedStateVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A WardBedStateVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		WardBedStateVo compareObj = (WardBedStateVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getBedSpace() == null && compareObj.getBedSpace() != null)
				return -1;
			if(this.getBedSpace() != null && compareObj.getBedSpace() == null)
				return 1;
			if(this.getBedSpace() != null && compareObj.getBedSpace() != null)
				retVal = this.getBedSpace().compareTo(compareObj.getBedSpace());
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
		if(this.bedspace != null)
			count++;
		if(this.bedspacestate != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.core.vo.BedSpaceVo bedspace;
	protected ims.core.vo.BedSpaceStateShortVo bedspacestate;
	private boolean isValidated = false;
	private boolean isBusy = false;
}