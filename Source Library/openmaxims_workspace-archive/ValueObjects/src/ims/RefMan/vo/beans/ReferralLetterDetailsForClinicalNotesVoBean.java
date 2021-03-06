// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class ReferralLetterDetailsForClinicalNotesVoBean extends ims.vo.ValueObjectBean
{
	public ReferralLetterDetailsForClinicalNotesVoBean()
	{
	}
	public ReferralLetterDetailsForClinicalNotesVoBean(ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.dateofreferral = vo.getDateOfReferral() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOfReferral().getBean();
		this.service = vo.getService() == null ? null : (ims.RefMan.vo.beans.ServiceForClinicaNotesVoBean)vo.getService().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.dateofreferral = vo.getDateOfReferral() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOfReferral().getBean();
		this.service = vo.getService() == null ? null : (ims.RefMan.vo.beans.ServiceForClinicaNotesVoBean)vo.getService().getBean(map);
	}

	public ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.ReferralLetterDetailsForClinicalNotesVo();
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
	public ims.framework.utils.beans.DateBean getDateOfReferral()
	{
		return this.dateofreferral;
	}
	public void setDateOfReferral(ims.framework.utils.beans.DateBean value)
	{
		this.dateofreferral = value;
	}
	public ims.RefMan.vo.beans.ServiceForClinicaNotesVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.RefMan.vo.beans.ServiceForClinicaNotesVoBean value)
	{
		this.service = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateBean dateofreferral;
	private ims.RefMan.vo.beans.ServiceForClinicaNotesVoBean service;
}
