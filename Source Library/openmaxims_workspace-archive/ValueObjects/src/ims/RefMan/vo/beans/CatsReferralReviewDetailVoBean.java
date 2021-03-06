// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class CatsReferralReviewDetailVoBean extends ims.vo.ValueObjectBean
{
	public CatsReferralReviewDetailVoBean()
	{
	}
	public CatsReferralReviewDetailVoBean(ims.RefMan.vo.CatsReferralReviewDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.currentreviewdetail = vo.getCurrentReviewDetail() == null ? null : vo.getCurrentReviewDetail().getBeanCollection();
		this.reviewhistory = vo.getReviewHistory() == null ? null : vo.getReviewHistory().getBeanCollection();
		this.isflaggedforreview = vo.getIsFlaggedForReview();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.CatsReferralReviewDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.currentreviewdetail = vo.getCurrentReviewDetail() == null ? null : vo.getCurrentReviewDetail().getBeanCollection();
		this.reviewhistory = vo.getReviewHistory() == null ? null : vo.getReviewHistory().getBeanCollection();
		this.isflaggedforreview = vo.getIsFlaggedForReview();
	}

	public ims.RefMan.vo.CatsReferralReviewDetailVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.CatsReferralReviewDetailVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.CatsReferralReviewDetailVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.CatsReferralReviewDetailVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.CatsReferralReviewDetailVo();
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
	public ims.RefMan.vo.beans.ReviewReferralDetailVoBean[] getCurrentReviewDetail()
	{
		return this.currentreviewdetail;
	}
	public void setCurrentReviewDetail(ims.RefMan.vo.beans.ReviewReferralDetailVoBean[] value)
	{
		this.currentreviewdetail = value;
	}
	public ims.RefMan.vo.beans.ReviewReferralDetailVoBean[] getReviewHistory()
	{
		return this.reviewhistory;
	}
	public void setReviewHistory(ims.RefMan.vo.beans.ReviewReferralDetailVoBean[] value)
	{
		this.reviewhistory = value;
	}
	public Boolean getIsFlaggedForReview()
	{
		return this.isflaggedforreview;
	}
	public void setIsFlaggedForReview(Boolean value)
	{
		this.isflaggedforreview = value;
	}

	private Integer id;
	private int version;
	private ims.RefMan.vo.beans.ReviewReferralDetailVoBean[] currentreviewdetail;
	private ims.RefMan.vo.beans.ReviewReferralDetailVoBean[] reviewhistory;
	private Boolean isflaggedforreview;
}
