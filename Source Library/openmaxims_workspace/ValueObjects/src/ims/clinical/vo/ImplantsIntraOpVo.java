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

package ims.clinical.vo;

/**
 * Linked to clinical.ImplantsIntraOp business object (ID: 1072100146).
 */
public class ImplantsIntraOpVo extends ims.clinical.vo.ImplantsIntraOpRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ImplantsIntraOpVo()
	{
	}
	public ImplantsIntraOpVo(Integer id, int version)
	{
		super(id, version);
	}
	public ImplantsIntraOpVo(ims.clinical.vo.beans.ImplantsIntraOpVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.implantdescription = bean.getImplantDescription();
		this.manufacturer = bean.getManufacturer();
		this.cataloguenumber = bean.getCatalogueNumber();
		this.lotnumber = bean.getLotNumber();
		this.serialnumber = bean.getSerialNumber();
		this.quantity = bean.getQuantity();
		this.size = bean.getSize();
		this.expirydate = bean.getExpiryDate() == null ? null : bean.getExpiryDate().buildDate();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.ImplantsIntraOpVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.implantdescription = bean.getImplantDescription();
		this.manufacturer = bean.getManufacturer();
		this.cataloguenumber = bean.getCatalogueNumber();
		this.lotnumber = bean.getLotNumber();
		this.serialnumber = bean.getSerialNumber();
		this.quantity = bean.getQuantity();
		this.size = bean.getSize();
		this.expirydate = bean.getExpiryDate() == null ? null : bean.getExpiryDate().buildDate();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.ImplantsIntraOpVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.ImplantsIntraOpVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.ImplantsIntraOpVoBean();
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
		if(fieldName.equals("THEATREAPPOINTMENT"))
			return getTheatreAppointment();
		if(fieldName.equals("IMPLANTDESCRIPTION"))
			return getImplantDescription();
		if(fieldName.equals("MANUFACTURER"))
			return getManufacturer();
		if(fieldName.equals("CATALOGUENUMBER"))
			return getCatalogueNumber();
		if(fieldName.equals("LOTNUMBER"))
			return getLotNumber();
		if(fieldName.equals("SERIALNUMBER"))
			return getSerialNumber();
		if(fieldName.equals("QUANTITY"))
			return getQuantity();
		if(fieldName.equals("SIZE"))
			return getSize();
		if(fieldName.equals("EXPIRYDATE"))
			return getExpiryDate();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTheatreAppointmentIsNotNull()
	{
		return this.theatreappointment != null;
	}
	public ims.scheduling.vo.Booking_AppointmentRefVo getTheatreAppointment()
	{
		return this.theatreappointment;
	}
	public void setTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo value)
	{
		this.isValidated = false;
		this.theatreappointment = value;
	}
	public boolean getImplantDescriptionIsNotNull()
	{
		return this.implantdescription != null;
	}
	public String getImplantDescription()
	{
		return this.implantdescription;
	}
	public static int getImplantDescriptionMaxLength()
	{
		return 150;
	}
	public void setImplantDescription(String value)
	{
		this.isValidated = false;
		this.implantdescription = value;
	}
	public boolean getManufacturerIsNotNull()
	{
		return this.manufacturer != null;
	}
	public String getManufacturer()
	{
		return this.manufacturer;
	}
	public static int getManufacturerMaxLength()
	{
		return 150;
	}
	public void setManufacturer(String value)
	{
		this.isValidated = false;
		this.manufacturer = value;
	}
	public boolean getCatalogueNumberIsNotNull()
	{
		return this.cataloguenumber != null;
	}
	public String getCatalogueNumber()
	{
		return this.cataloguenumber;
	}
	public static int getCatalogueNumberMaxLength()
	{
		return 150;
	}
	public void setCatalogueNumber(String value)
	{
		this.isValidated = false;
		this.cataloguenumber = value;
	}
	public boolean getLotNumberIsNotNull()
	{
		return this.lotnumber != null;
	}
	public String getLotNumber()
	{
		return this.lotnumber;
	}
	public static int getLotNumberMaxLength()
	{
		return 150;
	}
	public void setLotNumber(String value)
	{
		this.isValidated = false;
		this.lotnumber = value;
	}
	public boolean getSerialNumberIsNotNull()
	{
		return this.serialnumber != null;
	}
	public String getSerialNumber()
	{
		return this.serialnumber;
	}
	public static int getSerialNumberMaxLength()
	{
		return 150;
	}
	public void setSerialNumber(String value)
	{
		this.isValidated = false;
		this.serialnumber = value;
	}
	public boolean getQuantityIsNotNull()
	{
		return this.quantity != null;
	}
	public Integer getQuantity()
	{
		return this.quantity;
	}
	public void setQuantity(Integer value)
	{
		this.isValidated = false;
		this.quantity = value;
	}
	public boolean getSizeIsNotNull()
	{
		return this.size != null;
	}
	public String getSize()
	{
		return this.size;
	}
	public static int getSizeMaxLength()
	{
		return 150;
	}
	public void setSize(String value)
	{
		this.isValidated = false;
		this.size = value;
	}
	public boolean getExpiryDateIsNotNull()
	{
		return this.expirydate != null;
	}
	public ims.framework.utils.Date getExpiryDate()
	{
		return this.expirydate;
	}
	public void setExpiryDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.expirydate = value;
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
		if(this.theatreappointment == null)
			listOfErrors.add("TheatreAppointment is mandatory");
		if(this.implantdescription == null || this.implantdescription.length() == 0)
			listOfErrors.add("ImplantDescription is mandatory");
		else if(this.implantdescription.length() > 150)
			listOfErrors.add("The length of the field [implantdescription] in the value object [ims.clinical.vo.ImplantsIntraOpVo] is too big. It should be less or equal to 150");
		if(this.manufacturer == null || this.manufacturer.length() == 0)
			listOfErrors.add("Manufacturer is mandatory");
		else if(this.manufacturer.length() > 150)
			listOfErrors.add("The length of the field [manufacturer] in the value object [ims.clinical.vo.ImplantsIntraOpVo] is too big. It should be less or equal to 150");
		if(this.cataloguenumber == null || this.cataloguenumber.length() == 0)
			listOfErrors.add("CatalogueNumber is mandatory");
		else if(this.cataloguenumber.length() > 150)
			listOfErrors.add("The length of the field [cataloguenumber] in the value object [ims.clinical.vo.ImplantsIntraOpVo] is too big. It should be less or equal to 150");
		if(this.lotnumber == null || this.lotnumber.length() == 0)
			listOfErrors.add("LotNumber is mandatory");
		else if(this.lotnumber.length() > 150)
			listOfErrors.add("The length of the field [lotnumber] in the value object [ims.clinical.vo.ImplantsIntraOpVo] is too big. It should be less or equal to 150");
		if(this.serialnumber != null)
			if(this.serialnumber.length() > 150)
				listOfErrors.add("The length of the field [serialnumber] in the value object [ims.clinical.vo.ImplantsIntraOpVo] is too big. It should be less or equal to 150");
		if(this.quantity == null)
			listOfErrors.add("Quantity is mandatory");
		if(this.size == null || this.size.length() == 0)
			listOfErrors.add("Size is mandatory");
		else if(this.size.length() > 150)
			listOfErrors.add("The length of the field [size] in the value object [ims.clinical.vo.ImplantsIntraOpVo] is too big. It should be less or equal to 150");
		if(this.expirydate == null)
			listOfErrors.add("ExpiryDate is mandatory");
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
	
		ImplantsIntraOpVo clone = new ImplantsIntraOpVo(this.id, this.version);
		
		clone.theatreappointment = this.theatreappointment;
		clone.implantdescription = this.implantdescription;
		clone.manufacturer = this.manufacturer;
		clone.cataloguenumber = this.cataloguenumber;
		clone.lotnumber = this.lotnumber;
		clone.serialnumber = this.serialnumber;
		clone.quantity = this.quantity;
		clone.size = this.size;
		if(this.expirydate == null)
			clone.expirydate = null;
		else
			clone.expirydate = (ims.framework.utils.Date)this.expirydate.clone();
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
		if (!(ImplantsIntraOpVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ImplantsIntraOpVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ImplantsIntraOpVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ImplantsIntraOpVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.theatreappointment != null)
			count++;
		if(this.implantdescription != null)
			count++;
		if(this.manufacturer != null)
			count++;
		if(this.cataloguenumber != null)
			count++;
		if(this.lotnumber != null)
			count++;
		if(this.serialnumber != null)
			count++;
		if(this.quantity != null)
			count++;
		if(this.size != null)
			count++;
		if(this.expirydate != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.scheduling.vo.Booking_AppointmentRefVo theatreappointment;
	protected String implantdescription;
	protected String manufacturer;
	protected String cataloguenumber;
	protected String lotnumber;
	protected String serialnumber;
	protected Integer quantity;
	protected String size;
	protected ims.framework.utils.Date expirydate;
	private boolean isValidated = false;
	private boolean isBusy = false;
}