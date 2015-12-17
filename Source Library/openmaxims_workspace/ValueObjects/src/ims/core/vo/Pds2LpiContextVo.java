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


public class Pds2LpiContextVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public Pds2LpiContextVo()
	{
	}
	public Pds2LpiContextVo(ims.core.vo.beans.Pds2LpiContextVoBean bean)
	{
		this.initialpatient = bean.getInitialPatient() == null ? null : bean.getInitialPatient().buildVo();
		this.pdspatient = bean.getPdsPatient() == null ? null : bean.getPdsPatient().buildVo();
		this.nhsnumber = bean.getNhsNumber();
		this.superseedednhsnumber = bean.getSuperseededNhsNumber();
		this.patsuperseeded = bean.getPatSuperseeded() == null ? null : bean.getPatSuperseeded().buildVo();
		this.hassuperseeded = bean.getHasSuperseeded();
		this.missingmappings = ims.core.vo.MissingMappingVoCollection.buildFromBeanCollection(bean.getMissingMappings());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.Pds2LpiContextVoBean bean)
	{
		this.initialpatient = bean.getInitialPatient() == null ? null : bean.getInitialPatient().buildVo(map);
		this.pdspatient = bean.getPdsPatient() == null ? null : bean.getPdsPatient().buildVo(map);
		this.nhsnumber = bean.getNhsNumber();
		this.superseedednhsnumber = bean.getSuperseededNhsNumber();
		this.patsuperseeded = bean.getPatSuperseeded() == null ? null : bean.getPatSuperseeded().buildVo(map);
		this.hassuperseeded = bean.getHasSuperseeded();
		this.missingmappings = ims.core.vo.MissingMappingVoCollection.buildFromBeanCollection(bean.getMissingMappings());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.Pds2LpiContextVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.Pds2LpiContextVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.Pds2LpiContextVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getInitialPatientIsNotNull()
	{
		return this.initialpatient != null;
	}
	public ims.core.vo.Patient getInitialPatient()
	{
		return this.initialpatient;
	}
	public void setInitialPatient(ims.core.vo.Patient value)
	{
		this.isValidated = false;
		this.initialpatient = value;
	}
	public boolean getPdsPatientIsNotNull()
	{
		return this.pdspatient != null;
	}
	public ims.core.vo.Patient getPdsPatient()
	{
		return this.pdspatient;
	}
	public void setPdsPatient(ims.core.vo.Patient value)
	{
		this.isValidated = false;
		this.pdspatient = value;
	}
	public boolean getNhsNumberIsNotNull()
	{
		return this.nhsnumber != null;
	}
	public String getNhsNumber()
	{
		return this.nhsnumber;
	}
	public static int getNhsNumberMaxLength()
	{
		return 255;
	}
	public void setNhsNumber(String value)
	{
		this.isValidated = false;
		this.nhsnumber = value;
	}
	public boolean getSuperseededNhsNumberIsNotNull()
	{
		return this.superseedednhsnumber != null;
	}
	public String getSuperseededNhsNumber()
	{
		return this.superseedednhsnumber;
	}
	public static int getSuperseededNhsNumberMaxLength()
	{
		return 255;
	}
	public void setSuperseededNhsNumber(String value)
	{
		this.isValidated = false;
		this.superseedednhsnumber = value;
	}
	public boolean getPatSuperseededIsNotNull()
	{
		return this.patsuperseeded != null;
	}
	public ims.core.vo.Patient getPatSuperseeded()
	{
		return this.patsuperseeded;
	}
	public void setPatSuperseeded(ims.core.vo.Patient value)
	{
		this.isValidated = false;
		this.patsuperseeded = value;
	}
	public boolean getHasSuperseededIsNotNull()
	{
		return this.hassuperseeded != null;
	}
	public Boolean getHasSuperseeded()
	{
		return this.hassuperseeded;
	}
	public void setHasSuperseeded(Boolean value)
	{
		this.isValidated = false;
		this.hassuperseeded = value;
	}
	public boolean getMissingMappingsIsNotNull()
	{
		return this.missingmappings != null;
	}
	public ims.core.vo.MissingMappingVoCollection getMissingMappings()
	{
		return this.missingmappings;
	}
	public void setMissingMappings(ims.core.vo.MissingMappingVoCollection value)
	{
		this.isValidated = false;
		this.missingmappings = value;
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
		if(!(obj instanceof Pds2LpiContextVo))
			return false;
		Pds2LpiContextVo compareObj = (Pds2LpiContextVo)obj;
		if(this.getInitialPatient() == null && compareObj.getInitialPatient() != null)
			return false;
		if(this.getInitialPatient() != null && compareObj.getInitialPatient() == null)
			return false;
		if(this.getInitialPatient() != null && compareObj.getInitialPatient() != null)
			if(!this.getInitialPatient().equals(compareObj.getInitialPatient()))
				return false;
		if(this.getPdsPatient() == null && compareObj.getPdsPatient() != null)
			return false;
		if(this.getPdsPatient() != null && compareObj.getPdsPatient() == null)
			return false;
		if(this.getPdsPatient() != null && compareObj.getPdsPatient() != null)
			if(!this.getPdsPatient().equals(compareObj.getPdsPatient()))
				return false;
		if(this.getNhsNumber() == null && compareObj.getNhsNumber() != null)
			return false;
		if(this.getNhsNumber() != null && compareObj.getNhsNumber() == null)
			return false;
		if(this.getNhsNumber() != null && compareObj.getNhsNumber() != null)
			if(!this.getNhsNumber().equals(compareObj.getNhsNumber()))
				return false;
		if(this.getSuperseededNhsNumber() == null && compareObj.getSuperseededNhsNumber() != null)
			return false;
		if(this.getSuperseededNhsNumber() != null && compareObj.getSuperseededNhsNumber() == null)
			return false;
		if(this.getSuperseededNhsNumber() != null && compareObj.getSuperseededNhsNumber() != null)
			if(!this.getSuperseededNhsNumber().equals(compareObj.getSuperseededNhsNumber()))
				return false;
		if(this.getPatSuperseeded() == null && compareObj.getPatSuperseeded() != null)
			return false;
		if(this.getPatSuperseeded() != null && compareObj.getPatSuperseeded() == null)
			return false;
		if(this.getPatSuperseeded() != null && compareObj.getPatSuperseeded() != null)
			if(!this.getPatSuperseeded().equals(compareObj.getPatSuperseeded()))
				return false;
		if(this.getHasSuperseeded() == null && compareObj.getHasSuperseeded() != null)
			return false;
		if(this.getHasSuperseeded() != null && compareObj.getHasSuperseeded() == null)
			return false;
		if(this.getHasSuperseeded() != null && compareObj.getHasSuperseeded() != null)
			return this.getHasSuperseeded().equals(compareObj.getHasSuperseeded());
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
		if(this.pdspatient != null)
		{
			if(!this.pdspatient.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patsuperseeded != null)
		{
			if(!this.patsuperseeded.isValidated())
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
		if(this.pdspatient != null)
		{
			String[] listOfOtherErrors = this.pdspatient.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patsuperseeded != null)
		{
			String[] listOfOtherErrors = this.patsuperseeded.validate();
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
	
		Pds2LpiContextVo clone = new Pds2LpiContextVo();
		
		if(this.initialpatient == null)
			clone.initialpatient = null;
		else
			clone.initialpatient = (ims.core.vo.Patient)this.initialpatient.clone();
		if(this.pdspatient == null)
			clone.pdspatient = null;
		else
			clone.pdspatient = (ims.core.vo.Patient)this.pdspatient.clone();
		clone.nhsnumber = this.nhsnumber;
		clone.superseedednhsnumber = this.superseedednhsnumber;
		if(this.patsuperseeded == null)
			clone.patsuperseeded = null;
		else
			clone.patsuperseeded = (ims.core.vo.Patient)this.patsuperseeded.clone();
		clone.hassuperseeded = this.hassuperseeded;
		if(this.missingmappings == null)
			clone.missingmappings = null;
		else
			clone.missingmappings = (ims.core.vo.MissingMappingVoCollection)this.missingmappings.clone();
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
		if (!(Pds2LpiContextVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A Pds2LpiContextVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		Pds2LpiContextVo compareObj = (Pds2LpiContextVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getInitialPatient() == null && compareObj.getInitialPatient() != null)
				return -1;
			if(this.getInitialPatient() != null && compareObj.getInitialPatient() == null)
				return 1;
			if(this.getInitialPatient() != null && compareObj.getInitialPatient() != null)
				retVal = this.getInitialPatient().compareTo(compareObj.getInitialPatient());
		}
		if (retVal == 0)
		{
			if(this.getPdsPatient() == null && compareObj.getPdsPatient() != null)
				return -1;
			if(this.getPdsPatient() != null && compareObj.getPdsPatient() == null)
				return 1;
			if(this.getPdsPatient() != null && compareObj.getPdsPatient() != null)
				retVal = this.getPdsPatient().compareTo(compareObj.getPdsPatient());
		}
		if (retVal == 0)
		{
			if(this.getNhsNumber() == null && compareObj.getNhsNumber() != null)
				return -1;
			if(this.getNhsNumber() != null && compareObj.getNhsNumber() == null)
				return 1;
			if(this.getNhsNumber() != null && compareObj.getNhsNumber() != null)
			{
				if(caseInsensitive)
					retVal = this.getNhsNumber().toLowerCase().compareTo(compareObj.getNhsNumber().toLowerCase());
				else
					retVal = this.getNhsNumber().compareTo(compareObj.getNhsNumber());
			}
		}
		if (retVal == 0)
		{
			if(this.getSuperseededNhsNumber() == null && compareObj.getSuperseededNhsNumber() != null)
				return -1;
			if(this.getSuperseededNhsNumber() != null && compareObj.getSuperseededNhsNumber() == null)
				return 1;
			if(this.getSuperseededNhsNumber() != null && compareObj.getSuperseededNhsNumber() != null)
			{
				if(caseInsensitive)
					retVal = this.getSuperseededNhsNumber().toLowerCase().compareTo(compareObj.getSuperseededNhsNumber().toLowerCase());
				else
					retVal = this.getSuperseededNhsNumber().compareTo(compareObj.getSuperseededNhsNumber());
			}
		}
		if (retVal == 0)
		{
			if(this.getPatSuperseeded() == null && compareObj.getPatSuperseeded() != null)
				return -1;
			if(this.getPatSuperseeded() != null && compareObj.getPatSuperseeded() == null)
				return 1;
			if(this.getPatSuperseeded() != null && compareObj.getPatSuperseeded() != null)
				retVal = this.getPatSuperseeded().compareTo(compareObj.getPatSuperseeded());
		}
		if (retVal == 0)
		{
			if(this.getHasSuperseeded() == null && compareObj.getHasSuperseeded() != null)
				return -1;
			if(this.getHasSuperseeded() != null && compareObj.getHasSuperseeded() == null)
				return 1;
			if(this.getHasSuperseeded() != null && compareObj.getHasSuperseeded() != null)
				retVal = this.getHasSuperseeded().compareTo(compareObj.getHasSuperseeded());
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
		if(this.initialpatient != null)
			count++;
		if(this.pdspatient != null)
			count++;
		if(this.nhsnumber != null)
			count++;
		if(this.superseedednhsnumber != null)
			count++;
		if(this.patsuperseeded != null)
			count++;
		if(this.hassuperseeded != null)
			count++;
		if(this.missingmappings != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 7;
	}
	protected ims.core.vo.Patient initialpatient;
	protected ims.core.vo.Patient pdspatient;
	protected String nhsnumber;
	protected String superseedednhsnumber;
	protected ims.core.vo.Patient patsuperseeded;
	protected Boolean hassuperseeded;
	protected ims.core.vo.MissingMappingVoCollection missingmappings;
	private boolean isValidated = false;
	private boolean isBusy = false;
}