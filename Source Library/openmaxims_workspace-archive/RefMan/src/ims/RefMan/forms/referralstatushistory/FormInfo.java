// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referralstatushistory;

public final class FormInfo extends ims.framework.FormInfo
{
	private static final long serialVersionUID = 1L;
	public FormInfo(Integer formId)
	{
		super(formId);
	}
	public String getNamespaceName()
	{
		return "RefMan";
	}
	public String getFormName()
	{
		return "ReferralStatusHistory";
	}
	public int getWidth()
	{
		return 528;
	}
	public int getHeight()
	{
		return 368;
	}
	public String[] getContextVariables()
	{
		return new String[] { "_cv_RefMan.CatsReferralStatusHistory" };
	}
	public String getLocalVariablesPrefix()
	{
		return "_lv_RefMan.ReferralStatusHistory.__internal_x_context__" + String.valueOf(getFormId());
	}
	public ims.framework.FormInfo[] getComponentsFormInfo()
	{
		ims.framework.FormInfo[] componentsInfo = new ims.framework.FormInfo[0];
		return componentsInfo;
	}
	public String getImagePath()
	{
		return "Images/RefMan/referral_status_history_48.png";
	}
}
