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

package ims.core.vo.beans;

public class PatientLite_IdentifiersVoBean extends ims.vo.ValueObjectBean
{
	public PatientLite_IdentifiersVoBean()
	{
	}
	public PatientLite_IdentifiersVoBean(ims.core.vo.PatientLite_IdentifiersVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean();
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.isactive = vo.getIsActive();
		this.isquickregistrationpatient = vo.getIsQuickRegistrationPatient();
		this.primaryidvalueused = vo.getPrimaryIdValueUsed();
		this.identifiers = vo.getIdentifiers() == null ? null : vo.getIdentifiers().getBeanCollection();
		this.dod = vo.getDod() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDod().getBean();
		this.age = vo.getAge();
		this.agetext = vo.getAgeText();
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		if(vo.getPatientAlerts() != null)
		{
			this.patientalerts = new ims.vo.RefVoBean[vo.getPatientAlerts().size()];
			for(int patientalerts_i = 0; patientalerts_i < vo.getPatientAlerts().size(); patientalerts_i++)
			{
				this.patientalerts[patientalerts_i] = new ims.vo.RefVoBean(vo.getPatientAlerts().get(patientalerts_i).getBoId(),vo.getPatientAlerts().get(patientalerts_i).getBoVersion());
			}
		}
		this.hasalerts = vo.getHasAlerts();
		this.associatedpatient = vo.getAssociatedPatient() == null ? null : new ims.vo.RefVoBean(vo.getAssociatedPatient().getBoId(), vo.getAssociatedPatient().getBoVersion());
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean();
		this.isselfadmitpatient = vo.getIsSelfAdmitPatient();
		this.timeofdeath = vo.getTimeOfDeath() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOfDeath().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PatientLite_IdentifiersVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean(map);
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.isactive = vo.getIsActive();
		this.isquickregistrationpatient = vo.getIsQuickRegistrationPatient();
		this.primaryidvalueused = vo.getPrimaryIdValueUsed();
		this.identifiers = vo.getIdentifiers() == null ? null : vo.getIdentifiers().getBeanCollection();
		this.dod = vo.getDod() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDod().getBean();
		this.age = vo.getAge();
		this.agetext = vo.getAgeText();
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		if(vo.getPatientAlerts() != null)
		{
			this.patientalerts = new ims.vo.RefVoBean[vo.getPatientAlerts().size()];
			for(int patientalerts_i = 0; patientalerts_i < vo.getPatientAlerts().size(); patientalerts_i++)
			{
				this.patientalerts[patientalerts_i] = new ims.vo.RefVoBean(vo.getPatientAlerts().get(patientalerts_i).getBoId(),vo.getPatientAlerts().get(patientalerts_i).getBoVersion());
			}
		}
		this.hasalerts = vo.getHasAlerts();
		this.associatedpatient = vo.getAssociatedPatient() == null ? null : new ims.vo.RefVoBean(vo.getAssociatedPatient().getBoId(), vo.getAssociatedPatient().getBoVersion());
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean(map);
		this.isselfadmitpatient = vo.getIsSelfAdmitPatient();
		this.timeofdeath = vo.getTimeOfDeath() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOfDeath().getBean();
	}

	public ims.core.vo.PatientLite_IdentifiersVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PatientLite_IdentifiersVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PatientLite_IdentifiersVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PatientLite_IdentifiersVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PatientLite_IdentifiersVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.core.vo.beans.PersonNameBean getName()
	{
		return this.name;
	}
	public void setName(ims.core.vo.beans.PersonNameBean value)
	{
		this.name = value;
	}
	public ims.vo.LookupInstanceBean getSex()
	{
		return this.sex;
	}
	public void setSex(ims.vo.LookupInstanceBean value)
	{
		this.sex = value;
	}
	public ims.framework.utils.beans.PartialDateBean getDob()
	{
		return this.dob;
	}
	public void setDob(ims.framework.utils.beans.PartialDateBean value)
	{
		this.dob = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Boolean getIsQuickRegistrationPatient()
	{
		return this.isquickregistrationpatient;
	}
	public void setIsQuickRegistrationPatient(Boolean value)
	{
		this.isquickregistrationpatient = value;
	}
	public String getPrimaryIdValueUsed()
	{
		return this.primaryidvalueused;
	}
	public void setPrimaryIdValueUsed(String value)
	{
		this.primaryidvalueused = value;
	}
	public ims.core.vo.beans.PatientIdBean[] getIdentifiers()
	{
		return this.identifiers;
	}
	public void setIdentifiers(ims.core.vo.beans.PatientIdBean[] value)
	{
		this.identifiers = value;
	}
	public ims.framework.utils.beans.DateBean getDod()
	{
		return this.dod;
	}
	public void setDod(ims.framework.utils.beans.DateBean value)
	{
		this.dod = value;
	}
	public Integer getAge()
	{
		return this.age;
	}
	public void setAge(Integer value)
	{
		this.age = value;
	}
	public String getAgeText()
	{
		return this.agetext;
	}
	public void setAgeText(String value)
	{
		this.agetext = value;
	}
	public ims.vo.LookupInstanceBean getPatientCategory()
	{
		return this.patientcategory;
	}
	public void setPatientCategory(ims.vo.LookupInstanceBean value)
	{
		this.patientcategory = value;
	}
	public ims.vo.RefVoBean[] getPatientAlerts()
	{
		return this.patientalerts;
	}
	public void setPatientAlerts(ims.vo.RefVoBean[] value)
	{
		this.patientalerts = value;
	}
	public Boolean getHasAlerts()
	{
		return this.hasalerts;
	}
	public void setHasAlerts(Boolean value)
	{
		this.hasalerts = value;
	}
	public ims.vo.RefVoBean getAssociatedPatient()
	{
		return this.associatedpatient;
	}
	public void setAssociatedPatient(ims.vo.RefVoBean value)
	{
		this.associatedpatient = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.ward = value;
	}
	public Boolean getIsSelfAdmitPatient()
	{
		return this.isselfadmitpatient;
	}
	public void setIsSelfAdmitPatient(Boolean value)
	{
		this.isselfadmitpatient = value;
	}
	public ims.framework.utils.beans.TimeBean getTimeOfDeath()
	{
		return this.timeofdeath;
	}
	public void setTimeOfDeath(ims.framework.utils.beans.TimeBean value)
	{
		this.timeofdeath = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PersonNameBean name;
	private ims.vo.LookupInstanceBean sex;
	private ims.framework.utils.beans.PartialDateBean dob;
	private Boolean isactive;
	private Boolean isquickregistrationpatient;
	private String primaryidvalueused;
	private ims.core.vo.beans.PatientIdBean[] identifiers;
	private ims.framework.utils.beans.DateBean dod;
	private Integer age;
	private String agetext;
	private ims.vo.LookupInstanceBean patientcategory;
	private ims.vo.RefVoBean[] patientalerts;
	private Boolean hasalerts;
	private ims.vo.RefVoBean associatedpatient;
	private ims.core.vo.beans.LocationLiteVoBean ward;
	private Boolean isselfadmitpatient;
	private ims.framework.utils.beans.TimeBean timeofdeath;
}
