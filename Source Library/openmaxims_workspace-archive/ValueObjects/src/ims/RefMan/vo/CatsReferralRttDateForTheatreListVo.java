// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

/**
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralRttDateForTheatreListVo extends ims.RefMan.vo.CatsReferralRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CatsReferralRttDateForTheatreListVo()
	{
	}
	public CatsReferralRttDateForTheatreListVo(Integer id, int version)
	{
		super(id, version);
	}
	public CatsReferralRttDateForTheatreListVo(ims.RefMan.vo.beans.CatsReferralRttDateForTheatreListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.CatsReferralRttDateForTheatreListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.CatsReferralRttDateForTheatreListVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.CatsReferralRttDateForTheatreListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.CatsReferralRttDateForTheatreListVoBean();
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
		if(fieldName.equals("REFERRALDETAILS"))
			return getReferralDetails();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getReferralDetailsIsNotNull()
	{
		return this.referraldetails != null;
	}
	public ims.core.vo.CatsReferralDetailsForTheatreListVo getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.core.vo.CatsReferralDetailsForTheatreListVo value)
	{
		this.isValidated = false;
		this.referraldetails = value;
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
	
		CatsReferralRttDateForTheatreListVo clone = new CatsReferralRttDateForTheatreListVo(this.id, this.version);
		
		if(this.referraldetails == null)
			clone.referraldetails = null;
		else
			clone.referraldetails = (ims.core.vo.CatsReferralDetailsForTheatreListVo)this.referraldetails.clone();
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
		if (!(CatsReferralRttDateForTheatreListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CatsReferralRttDateForTheatreListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CatsReferralRttDateForTheatreListVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CatsReferralRttDateForTheatreListVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.referraldetails != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 1;
	}
	protected ims.core.vo.CatsReferralDetailsForTheatreListVo referraldetails;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
