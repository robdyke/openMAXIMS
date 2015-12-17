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

package ims.clinical.vo;

/**
 * Linked to clinical.SoapNote business object (ID: 1072100036).
 */
public class SoapNoteVo extends ims.clinical.vo.SoapNoteRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SoapNoteVo()
	{
	}
	public SoapNoteVo(Integer id, int version)
	{
		super(id, version);
	}
	public SoapNoteVo(ims.clinical.vo.beans.SoapNoteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.clinicalcontact = bean.getClinicalContact() == null ? null : bean.getClinicalContact().buildVo();
		this.subjectivenote = bean.getSubjectiveNote();
		this.objectivenote = bean.getObjectiveNote();
		this.analysisnote = bean.getAnalysisNote();
		this.plannote = bean.getPlanNote();
		this.clinicalnote = bean.getClinicalNote() == null ? null : bean.getClinicalNote().buildVo();
		this.areaofneed = ims.core.vo.lookups.AreaOfNeedCollection.buildFromBeanCollection(bean.getAreaofNeed());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.SoapNoteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.clinicalcontact = bean.getClinicalContact() == null ? null : bean.getClinicalContact().buildVo(map);
		this.subjectivenote = bean.getSubjectiveNote();
		this.objectivenote = bean.getObjectiveNote();
		this.analysisnote = bean.getAnalysisNote();
		this.plannote = bean.getPlanNote();
		this.clinicalnote = bean.getClinicalNote() == null ? null : bean.getClinicalNote().buildVo(map);
		this.areaofneed = ims.core.vo.lookups.AreaOfNeedCollection.buildFromBeanCollection(bean.getAreaofNeed());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.SoapNoteVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.SoapNoteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.SoapNoteVoBean();
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
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("CLINICALCONTACT"))
			return getClinicalContact();
		if(fieldName.equals("SUBJECTIVENOTE"))
			return getSubjectiveNote();
		if(fieldName.equals("OBJECTIVENOTE"))
			return getObjectiveNote();
		if(fieldName.equals("ANALYSISNOTE"))
			return getAnalysisNote();
		if(fieldName.equals("PLANNOTE"))
			return getPlanNote();
		if(fieldName.equals("CLINICALNOTE"))
			return getClinicalNote();
		if(fieldName.equals("AREAOFNEED"))
			return getAreaofNeed();
		return super.getFieldValueByFieldName(fieldName);
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
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getClinicalContactIsNotNull()
	{
		return this.clinicalcontact != null;
	}
	public ims.core.vo.ClinicalContactShortVo getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.ClinicalContactShortVo value)
	{
		this.isValidated = false;
		this.clinicalcontact = value;
	}
	public boolean getSubjectiveNoteIsNotNull()
	{
		return this.subjectivenote != null;
	}
	public String getSubjectiveNote()
	{
		return this.subjectivenote;
	}
	public static int getSubjectiveNoteMaxLength()
	{
		return 4000;
	}
	public void setSubjectiveNote(String value)
	{
		this.isValidated = false;
		this.subjectivenote = value;
	}
	public boolean getObjectiveNoteIsNotNull()
	{
		return this.objectivenote != null;
	}
	public String getObjectiveNote()
	{
		return this.objectivenote;
	}
	public static int getObjectiveNoteMaxLength()
	{
		return 4000;
	}
	public void setObjectiveNote(String value)
	{
		this.isValidated = false;
		this.objectivenote = value;
	}
	public boolean getAnalysisNoteIsNotNull()
	{
		return this.analysisnote != null;
	}
	public String getAnalysisNote()
	{
		return this.analysisnote;
	}
	public static int getAnalysisNoteMaxLength()
	{
		return 4000;
	}
	public void setAnalysisNote(String value)
	{
		this.isValidated = false;
		this.analysisnote = value;
	}
	public boolean getPlanNoteIsNotNull()
	{
		return this.plannote != null;
	}
	public String getPlanNote()
	{
		return this.plannote;
	}
	public static int getPlanNoteMaxLength()
	{
		return 4000;
	}
	public void setPlanNote(String value)
	{
		this.isValidated = false;
		this.plannote = value;
	}
	public boolean getClinicalNoteIsNotNull()
	{
		return this.clinicalnote != null;
	}
	public ims.core.vo.ClinicalNotesVo getClinicalNote()
	{
		return this.clinicalnote;
	}
	public void setClinicalNote(ims.core.vo.ClinicalNotesVo value)
	{
		this.isValidated = false;
		this.clinicalnote = value;
	}
	public boolean getAreaofNeedIsNotNull()
	{
		return this.areaofneed != null;
	}
	public ims.core.vo.lookups.AreaOfNeedCollection getAreaofNeed()
	{
		return this.areaofneed;
	}
	public void setAreaofNeed(ims.core.vo.lookups.AreaOfNeedCollection value)
	{
		this.isValidated = false;
		this.areaofneed = value;
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
		if(this.clinicalnote != null)
		{
			if(!this.clinicalnote.isValidated())
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
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
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
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.clinicalnote == null)
			listOfErrors.add("ClinicalNote is mandatory");
		if(this.clinicalnote != null)
		{
			String[] listOfOtherErrors = this.clinicalnote.validate();
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
	
		SoapNoteVo clone = new SoapNoteVo(this.id, this.version);
		
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		clone.carecontext = this.carecontext;
		if(this.clinicalcontact == null)
			clone.clinicalcontact = null;
		else
			clone.clinicalcontact = (ims.core.vo.ClinicalContactShortVo)this.clinicalcontact.clone();
		clone.subjectivenote = this.subjectivenote;
		clone.objectivenote = this.objectivenote;
		clone.analysisnote = this.analysisnote;
		clone.plannote = this.plannote;
		if(this.clinicalnote == null)
			clone.clinicalnote = null;
		else
			clone.clinicalnote = (ims.core.vo.ClinicalNotesVo)this.clinicalnote.clone();
		if(this.areaofneed == null)
			clone.areaofneed = null;
		else
			clone.areaofneed = (ims.core.vo.lookups.AreaOfNeedCollection)this.areaofneed.clone();
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
		if (!(SoapNoteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SoapNoteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SoapNoteVo compareObj = (SoapNoteVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_SoapNote() == null && compareObj.getID_SoapNote() != null)
				return -1;
			if(this.getID_SoapNote() != null && compareObj.getID_SoapNote() == null)
				return 1;
			if(this.getID_SoapNote() != null && compareObj.getID_SoapNote() != null)
				retVal = this.getID_SoapNote().compareTo(compareObj.getID_SoapNote());
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
		if(this.authoringinformation != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.clinicalcontact != null)
			count++;
		if(this.subjectivenote != null)
			count++;
		if(this.objectivenote != null)
			count++;
		if(this.analysisnote != null)
			count++;
		if(this.plannote != null)
			count++;
		if(this.clinicalnote != null)
			count++;
		if(this.areaofneed != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.core.vo.ClinicalContactShortVo clinicalcontact;
	protected String subjectivenote;
	protected String objectivenote;
	protected String analysisnote;
	protected String plannote;
	protected ims.core.vo.ClinicalNotesVo clinicalnote;
	protected ims.core.vo.lookups.AreaOfNeedCollection areaofneed;
	private boolean isValidated = false;
	private boolean isBusy = false;
}