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

package ims.core.vo;

/**
 * Linked to core.generic.Person Name business object (ID: 1002100001).
 */
public class PersonName extends ims.core.generic.vo.PersonNameRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PersonName()
	{
	}
	public PersonName(Integer id, int version)
	{
		super(id, version);
	}
	public PersonName(ims.core.vo.beans.PersonNameBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.nametype = bean.getNameType() == null ? null : ims.core.vo.lookups.NameType.buildLookup(bean.getNameType());
		this.surname = bean.getSurname();
		this.forename = bean.getForename();
		this.middlename = bean.getMiddleName();
		this.title = bean.getTitle() == null ? null : ims.core.vo.lookups.PersonTitle.buildLookup(bean.getTitle());
		this.uppersurname = bean.getUpperSurname();
		this.upperforename = bean.getUpperForename();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PersonNameBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.nametype = bean.getNameType() == null ? null : ims.core.vo.lookups.NameType.buildLookup(bean.getNameType());
		this.surname = bean.getSurname();
		this.forename = bean.getForename();
		this.middlename = bean.getMiddleName();
		this.title = bean.getTitle() == null ? null : ims.core.vo.lookups.PersonTitle.buildLookup(bean.getTitle());
		this.uppersurname = bean.getUpperSurname();
		this.upperforename = bean.getUpperForename();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PersonNameBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PersonNameBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PersonNameBean();
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
		if(fieldName.equals("NAMETYPE"))
			return getNameType();
		if(fieldName.equals("SURNAME"))
			return getSurname();
		if(fieldName.equals("FORENAME"))
			return getForename();
		if(fieldName.equals("MIDDLENAME"))
			return getMiddleName();
		if(fieldName.equals("TITLE"))
			return getTitle();
		if(fieldName.equals("UPPERSURNAME"))
			return getUpperSurname();
		if(fieldName.equals("UPPERFORENAME"))
			return getUpperForename();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNameTypeIsNotNull()
	{
		return this.nametype != null;
	}
	public ims.core.vo.lookups.NameType getNameType()
	{
		return this.nametype;
	}
	public void setNameType(ims.core.vo.lookups.NameType value)
	{
		this.isValidated = false;
		this.nametype = value;
	}
	public boolean getSurnameIsNotNull()
	{
		return this.surname != null;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public static int getSurnameMaxLength()
	{
		return 40;
	}
	public void setSurname(String value)
	{
		this.isValidated = false;
		this.surname = value;
	}
	public boolean getForenameIsNotNull()
	{
		return this.forename != null;
	}
	public String getForename()
	{
		return this.forename;
	}
	public static int getForenameMaxLength()
	{
		return 40;
	}
	public void setForename(String value)
	{
		this.isValidated = false;
		this.forename = value;
	}
	public boolean getMiddleNameIsNotNull()
	{
		return this.middlename != null;
	}
	public String getMiddleName()
	{
		return this.middlename;
	}
	public static int getMiddleNameMaxLength()
	{
		return 40;
	}
	public void setMiddleName(String value)
	{
		this.isValidated = false;
		this.middlename = value;
	}
	public boolean getTitleIsNotNull()
	{
		return this.title != null;
	}
	public ims.core.vo.lookups.PersonTitle getTitle()
	{
		return this.title;
	}
	public void setTitle(ims.core.vo.lookups.PersonTitle value)
	{
		this.isValidated = false;
		this.title = value;
	}
	public boolean getUpperSurnameIsNotNull()
	{
		return this.uppersurname != null;
	}
	public String getUpperSurname()
	{
		return this.uppersurname;
	}
	public static int getUpperSurnameMaxLength()
	{
		return 40;
	}
	public void setUpperSurname(String value)
	{
		this.isValidated = false;
		this.uppersurname = value;
	}
	public boolean getUpperForenameIsNotNull()
	{
		return this.upperforename != null;
	}
	public String getUpperForename()
	{
		return this.upperforename;
	}
	public static int getUpperForenameMaxLength()
	{
		return 40;
	}
	public void setUpperForename(String value)
	{
		this.isValidated = false;
		this.upperforename = value;
	}
	/**
	* toString: Returns a formatted String suitable for display purposes
	*/
	public String toString()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (this.title != null) {
			sb.append(this.title.getText() + " ");
		}
		if (this.forename != null && this.forename.length() > 0) {
			sb.append(this.forename + " ");
		}
		if (this.middlename != null && this.middlename.length() > 0) {
			sb.append(this.middlename + " ");
		}
		if (this.surname != null && this.surname.length() > 0) {
			sb.append(this.surname + " ");
		}
		if (sb.length() > 0)
		{
			sb.setLength(sb.length() - 1);
		}
		return sb.toString();
	}
	/**
	* setUppers() : Set's the upper case surname and forename first 10 chars
	*/
	public void setUppers()
	{
		if (this.surname != null)
		{
			//this.uppersurname = this.surname.toUpperCase().substring(0, Math.min(this.getUpperSurnameMaxLength(),this.surname.length()));
			this.uppersurname = this.surname.replaceAll("[^a-zA-Z]", "");
			this.uppersurname = this.uppersurname.toUpperCase().substring(0, Math.min(this.getUpperSurnameMaxLength(),this.uppersurname.length()));
		}
		if (this.forename != null)
		{
			//this.upperforename = this.forename.toUpperCase().substring(0, Math.min(this.getUpperForenameMaxLength(),this.forename.length()));
			this.upperforename = this.forename.replaceAll("[^a-zA-Z]", "");
			this.upperforename = this.upperforename.toUpperCase().substring(0, Math.min(this.getUpperForenameMaxLength(),this.upperforename.length()));
		}
	}
	/**
	* toShortForm(): Returns the Name in a short format
	*/
	public String toShortForm()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (this.surname != null && this.surname.length() > 0) {
			sb.append(this.surname + ", ");
		}
		if (this.forename != null && this.forename.length() > 0) {
			sb.append(this.forename + ", ");
		}
		if (sb.length() > 0)
		{
			sb.setLength(sb.length() - 2);
		}
		return sb.toString();
	}
	/**
	* upperFirstChar() : sets the first charachter of a string to uppercase  
	*/
	public static String upperFirstChar(String value)
	{
		char arrVal[] = null;
		if(value != null && value.length() > 0)
		{
			String lowerValue = value.toLowerCase();
		
			arrVal = new char[lowerValue.length()];
			arrVal = lowerValue.toCharArray();
			arrVal[0] = String.valueOf(arrVal[0]).toUpperCase().charAt(0);
		}
			
		if(arrVal != null)
			return String.valueOf(arrVal);
		else
			return null;
	}
	/**
	* toProperCase
	*/
	public String toProperCase()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (this.title != null) {
			sb.append(this.title.getText() + " ");
		}
		if (this.forename != null && this.forename.length() > 0) {
			sb.append(upperFirstChar(this.forename) + " ");
		}
		if (this.middlename != null && this.middlename.length() > 0) {
			sb.append(upperFirstChar(this.middlename) + " ");
		}
		if (this.surname != null && this.surname.length() > 0) {
			sb.append(upperFirstChar(this.surname) + " ");
		}
		if (sb.length() > 0)
		{
			sb.setLength(sb.length() - 1);
		}
		return sb.toString();
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
		if(this.surname != null)
			if(this.surname.length() > 40)
				listOfErrors.add("The length of the field [surname] in the value object [ims.core.vo.PersonName] is too big. It should be less or equal to 40");
		if(this.forename != null)
			if(this.forename.length() > 40)
				listOfErrors.add("The length of the field [forename] in the value object [ims.core.vo.PersonName] is too big. It should be less or equal to 40");
		if(this.middlename != null)
			if(this.middlename.length() > 40)
				listOfErrors.add("The length of the field [middlename] in the value object [ims.core.vo.PersonName] is too big. It should be less or equal to 40");
		if(this.uppersurname != null)
			if(this.uppersurname.length() > 40)
				listOfErrors.add("The length of the field [uppersurname] in the value object [ims.core.vo.PersonName] is too big. It should be less or equal to 40");
		if(this.upperforename != null)
			if(this.upperforename.length() > 40)
				listOfErrors.add("The length of the field [upperforename] in the value object [ims.core.vo.PersonName] is too big. It should be less or equal to 40");
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
	
		PersonName clone = new PersonName(this.id, this.version);
		
		if(this.nametype == null)
			clone.nametype = null;
		else
			clone.nametype = (ims.core.vo.lookups.NameType)this.nametype.clone();
		clone.surname = this.surname;
		clone.forename = this.forename;
		clone.middlename = this.middlename;
		if(this.title == null)
			clone.title = null;
		else
			clone.title = (ims.core.vo.lookups.PersonTitle)this.title.clone();
		clone.uppersurname = this.uppersurname;
		clone.upperforename = this.upperforename;
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
		if (!(PersonName.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PersonName object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PersonName compareObj = (PersonName)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSurname() == null && compareObj.getSurname() != null)
				return -1;
			if(this.getSurname() != null && compareObj.getSurname() == null)
				return 1;
			if(this.getSurname() != null && compareObj.getSurname() != null)
			{
				if(caseInsensitive)
					retVal = this.getSurname().toLowerCase().compareTo(compareObj.getSurname().toLowerCase());
				else
					retVal = this.getSurname().compareTo(compareObj.getSurname());
			}
		}
		if (retVal == 0)
		{
			if(this.getForename() == null && compareObj.getForename() != null)
				return -1;
			if(this.getForename() != null && compareObj.getForename() == null)
				return 1;
			if(this.getForename() != null && compareObj.getForename() != null)
			{
				if(caseInsensitive)
					retVal = this.getForename().toLowerCase().compareTo(compareObj.getForename().toLowerCase());
				else
					retVal = this.getForename().compareTo(compareObj.getForename());
			}
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
		if(this.nametype != null)
			count++;
		if(this.surname != null)
			count++;
		if(this.forename != null)
			count++;
		if(this.middlename != null)
			count++;
		if(this.title != null)
			count++;
		if(this.uppersurname != null)
			count++;
		if(this.upperforename != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 7;
	}
	protected ims.core.vo.lookups.NameType nametype;
	protected String surname;
	protected String forename;
	protected String middlename;
	protected ims.core.vo.lookups.PersonTitle title;
	protected String uppersurname;
	protected String upperforename;
	private boolean isValidated = false;
	private boolean isBusy = false;
}