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

public class AdmissionDetailShortVoBean extends ims.vo.ValueObjectBean
{
	public AdmissionDetailShortVoBean()
	{
	}
	public AdmissionDetailShortVoBean(ims.core.vo.AdmissionDetailShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventShortAdmitVoBean)vo.getPasEvent().getBean();
		this.admissiondatetime = vo.getAdmissionDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAdmissionDateTime().getBean();
		this.anticipatedstay = vo.getAnticipatedStay();
		this.estdischargedate = vo.getEstDischargeDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEstDischargeDate().getBean();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean();
		this.bed = vo.getBed() == null ? null : (ims.core.vo.beans.BedSpaceLiteVoBean)vo.getBed().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getConsultant().getBean();
		this.wardtype = vo.getWardType() == null ? null : (ims.vo.LookupInstanceBean)vo.getWardType().getBean();
		this.sourceofadmission = vo.getSourceOfAdmission() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceOfAdmission().getBean();
		this.methodofadmission = vo.getMethodOfAdmission() == null ? null : (ims.vo.LookupInstanceBean)vo.getMethodOfAdmission().getBean();
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		this.sourceofemergencyreferral = vo.getSourceOfEmergencyReferral() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceOfEmergencyReferral().getBean();
		this.ischaplainrequired = vo.getIsChaplainRequired();
		this.reasonforadmission = vo.getReasonForAdmission();
		this.referringconsultant = vo.getReferringConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getReferringConsultant().getBean();
		this.selfadmitpatient = vo.getSelfAdmitPatient();
		this.updatecfl = vo.getUpdateCFL();
		this.casefoldercomments = vo.getCaseFolderComments();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.AdmissionDetailShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventShortAdmitVoBean)vo.getPasEvent().getBean(map);
		this.admissiondatetime = vo.getAdmissionDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAdmissionDateTime().getBean();
		this.anticipatedstay = vo.getAnticipatedStay();
		this.estdischargedate = vo.getEstDischargeDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEstDischargeDate().getBean();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean(map);
		this.bed = vo.getBed() == null ? null : (ims.core.vo.beans.BedSpaceLiteVoBean)vo.getBed().getBean(map);
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getConsultant().getBean(map);
		this.wardtype = vo.getWardType() == null ? null : (ims.vo.LookupInstanceBean)vo.getWardType().getBean();
		this.sourceofadmission = vo.getSourceOfAdmission() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceOfAdmission().getBean();
		this.methodofadmission = vo.getMethodOfAdmission() == null ? null : (ims.vo.LookupInstanceBean)vo.getMethodOfAdmission().getBean();
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		this.sourceofemergencyreferral = vo.getSourceOfEmergencyReferral() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceOfEmergencyReferral().getBean();
		this.ischaplainrequired = vo.getIsChaplainRequired();
		this.reasonforadmission = vo.getReasonForAdmission();
		this.referringconsultant = vo.getReferringConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getReferringConsultant().getBean(map);
		this.selfadmitpatient = vo.getSelfAdmitPatient();
		this.updatecfl = vo.getUpdateCFL();
		this.casefoldercomments = vo.getCaseFolderComments();
	}

	public ims.core.vo.AdmissionDetailShortVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.AdmissionDetailShortVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.AdmissionDetailShortVo vo = null;
		if(map != null)
			vo = (ims.core.vo.AdmissionDetailShortVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.AdmissionDetailShortVo();
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
	public ims.core.vo.beans.PasEventShortAdmitVoBean getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.vo.beans.PasEventShortAdmitVoBean value)
	{
		this.pasevent = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAdmissionDateTime()
	{
		return this.admissiondatetime;
	}
	public void setAdmissionDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.admissiondatetime = value;
	}
	public Integer getAnticipatedStay()
	{
		return this.anticipatedstay;
	}
	public void setAnticipatedStay(Integer value)
	{
		this.anticipatedstay = value;
	}
	public ims.framework.utils.beans.DateTimeBean getEstDischargeDate()
	{
		return this.estdischargedate;
	}
	public void setEstDischargeDate(ims.framework.utils.beans.DateTimeBean value)
	{
		this.estdischargedate = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.ward = value;
	}
	public ims.core.vo.beans.BedSpaceLiteVoBean getBed()
	{
		return this.bed;
	}
	public void setBed(ims.core.vo.beans.BedSpaceLiteVoBean value)
	{
		this.bed = value;
	}
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}
	public ims.core.vo.beans.MedicLiteVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.beans.MedicLiteVoBean value)
	{
		this.consultant = value;
	}
	public ims.vo.LookupInstanceBean getWardType()
	{
		return this.wardtype;
	}
	public void setWardType(ims.vo.LookupInstanceBean value)
	{
		this.wardtype = value;
	}
	public ims.vo.LookupInstanceBean getSourceOfAdmission()
	{
		return this.sourceofadmission;
	}
	public void setSourceOfAdmission(ims.vo.LookupInstanceBean value)
	{
		this.sourceofadmission = value;
	}
	public ims.vo.LookupInstanceBean getMethodOfAdmission()
	{
		return this.methodofadmission;
	}
	public void setMethodOfAdmission(ims.vo.LookupInstanceBean value)
	{
		this.methodofadmission = value;
	}
	public ims.vo.LookupInstanceBean getPatientCategory()
	{
		return this.patientcategory;
	}
	public void setPatientCategory(ims.vo.LookupInstanceBean value)
	{
		this.patientcategory = value;
	}
	public ims.vo.LookupInstanceBean getSourceOfEmergencyReferral()
	{
		return this.sourceofemergencyreferral;
	}
	public void setSourceOfEmergencyReferral(ims.vo.LookupInstanceBean value)
	{
		this.sourceofemergencyreferral = value;
	}
	public Boolean getIsChaplainRequired()
	{
		return this.ischaplainrequired;
	}
	public void setIsChaplainRequired(Boolean value)
	{
		this.ischaplainrequired = value;
	}
	public String getReasonForAdmission()
	{
		return this.reasonforadmission;
	}
	public void setReasonForAdmission(String value)
	{
		this.reasonforadmission = value;
	}
	public ims.core.vo.beans.MedicLiteVoBean getReferringConsultant()
	{
		return this.referringconsultant;
	}
	public void setReferringConsultant(ims.core.vo.beans.MedicLiteVoBean value)
	{
		this.referringconsultant = value;
	}
	public Boolean getSelfAdmitPatient()
	{
		return this.selfadmitpatient;
	}
	public void setSelfAdmitPatient(Boolean value)
	{
		this.selfadmitpatient = value;
	}
	public Boolean getUpdateCFL()
	{
		return this.updatecfl;
	}
	public void setUpdateCFL(Boolean value)
	{
		this.updatecfl = value;
	}
	public String getCaseFolderComments()
	{
		return this.casefoldercomments;
	}
	public void setCaseFolderComments(String value)
	{
		this.casefoldercomments = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PasEventShortAdmitVoBean pasevent;
	private ims.framework.utils.beans.DateTimeBean admissiondatetime;
	private Integer anticipatedstay;
	private ims.framework.utils.beans.DateTimeBean estdischargedate;
	private ims.core.vo.beans.LocationLiteVoBean ward;
	private ims.core.vo.beans.BedSpaceLiteVoBean bed;
	private ims.core.vo.beans.ServiceLiteVoBean service;
	private ims.vo.LookupInstanceBean specialty;
	private ims.core.vo.beans.MedicLiteVoBean consultant;
	private ims.vo.LookupInstanceBean wardtype;
	private ims.vo.LookupInstanceBean sourceofadmission;
	private ims.vo.LookupInstanceBean methodofadmission;
	private ims.vo.LookupInstanceBean patientcategory;
	private ims.vo.LookupInstanceBean sourceofemergencyreferral;
	private Boolean ischaplainrequired;
	private String reasonforadmission;
	private ims.core.vo.beans.MedicLiteVoBean referringconsultant;
	private Boolean selfadmitpatient;
	private Boolean updatecfl;
	private String casefoldercomments;
}
