// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class CatsReferralForClinicListVoBean extends ims.vo.ValueObjectBean
{
	public CatsReferralForClinicListVoBean()
	{
	}
	public CatsReferralForClinicListVoBean(ims.RefMan.vo.CatsReferralForClinicListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.hasdnaapptsforreview = vo.getHasDNAApptsForReview();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.CatsReferralForClinicListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.hasdnaapptsforreview = vo.getHasDNAApptsForReview();
	}

	public ims.RefMan.vo.CatsReferralForClinicListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.CatsReferralForClinicListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.CatsReferralForClinicListVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.CatsReferralForClinicListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.CatsReferralForClinicListVo();
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
	public Boolean getHasDNAApptsForReview()
	{
		return this.hasdnaapptsforreview;
	}
	public void setHasDNAApptsForReview(Boolean value)
	{
		this.hasdnaapptsforreview = value;
	}

	private Integer id;
	private int version;
	private Boolean hasdnaapptsforreview;
}