// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referralstatuslist;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.ReferralStatusList.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.ReferralStatusList domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbSecondOpinionValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSecondOpinion().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.SecondOpinionCategory existingInstance = (ims.RefMan.vo.lookups.SecondOpinionCategory)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSecondOpinionLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.SecondOpinionCategory)
		{
			ims.RefMan.vo.lookups.SecondOpinionCategory instance = (ims.RefMan.vo.lookups.SecondOpinionCategory)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSecondOpinionLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.SecondOpinionCategory existingInstance = (ims.RefMan.vo.lookups.SecondOpinionCategory)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSecondOpinion().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSecondOpinionLookup()
	{
		this.form.cmbSecondOpinion().clear();
		ims.RefMan.vo.lookups.SecondOpinionCategoryCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getSecondOpinionCategory(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSecondOpinion().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSecondOpinionLookupValue(int id)
	{
		ims.RefMan.vo.lookups.SecondOpinionCategory instance = ims.RefMan.vo.lookups.LookupHelper.getSecondOpinionCategoryInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSecondOpinion().setValue(instance);
	}
	protected final void defaultcmbSecondOpinionLookupValue()
	{
		this.form.cmbSecondOpinion().setValue((ims.RefMan.vo.lookups.SecondOpinionCategory)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.SecondOpinionCategory.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.SecondOpinionCategory.TYPE_ID));
	}
	protected final void oncmbReportsRequiredValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReportsRequired().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReportNoteType existingInstance = (ims.RefMan.vo.lookups.ReportNoteType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReportsRequiredLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReportNoteType)
		{
			ims.RefMan.vo.lookups.ReportNoteType instance = (ims.RefMan.vo.lookups.ReportNoteType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReportsRequiredLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReportNoteType existingInstance = (ims.RefMan.vo.lookups.ReportNoteType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReportsRequired().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReportsRequiredLookup()
	{
		this.form.cmbReportsRequired().clear();
		ims.RefMan.vo.lookups.ReportNoteTypeCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReportNoteType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReportsRequired().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReportsRequiredLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReportNoteType instance = ims.RefMan.vo.lookups.LookupHelper.getReportNoteTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReportsRequired().setValue(instance);
	}
	protected final void defaultcmbReportsRequiredLookupValue()
	{
		this.form.cmbReportsRequired().setValue((ims.RefMan.vo.lookups.ReportNoteType)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReportNoteType.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReportNoteType.TYPE_ID));
	}
	protected final void oncmbOnwardReferralReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbOnwardReferralReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.OnwardReferralReason existingInstance = (ims.RefMan.vo.lookups.OnwardReferralReason)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbOnwardReferralReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.OnwardReferralReason)
		{
			ims.RefMan.vo.lookups.OnwardReferralReason instance = (ims.RefMan.vo.lookups.OnwardReferralReason)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbOnwardReferralReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.OnwardReferralReason existingInstance = (ims.RefMan.vo.lookups.OnwardReferralReason)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbOnwardReferralReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbOnwardReferralReasonLookup()
	{
		this.form.cmbOnwardReferralReason().clear();
		ims.RefMan.vo.lookups.OnwardReferralReasonCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getOnwardReferralReason(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbOnwardReferralReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbOnwardReferralReasonLookupValue(int id)
	{
		ims.RefMan.vo.lookups.OnwardReferralReason instance = ims.RefMan.vo.lookups.LookupHelper.getOnwardReferralReasonInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbOnwardReferralReason().setValue(instance);
	}
	protected final void defaultcmbOnwardReferralReasonLookupValue()
	{
		this.form.cmbOnwardReferralReason().setValue((ims.RefMan.vo.lookups.OnwardReferralReason)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.OnwardReferralReason.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.OnwardReferralReason.TYPE_ID));
	}
	protected final void oncmbTLTTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbTLTType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.TLTType existingInstance = (ims.RefMan.vo.lookups.TLTType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTLTTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.TLTType)
		{
			ims.RefMan.vo.lookups.TLTType instance = (ims.RefMan.vo.lookups.TLTType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTLTTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.TLTType existingInstance = (ims.RefMan.vo.lookups.TLTType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbTLTType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTLTTypeLookup()
	{
		this.form.cmbTLTType().clear();
		ims.RefMan.vo.lookups.TLTTypeCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getTLTType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbTLTType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTLTTypeLookupValue(int id)
	{
		ims.RefMan.vo.lookups.TLTType instance = ims.RefMan.vo.lookups.LookupHelper.getTLTTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbTLTType().setValue(instance);
	}
	protected final void defaultcmbTLTTypeLookupValue()
	{
		this.form.cmbTLTType().setValue((ims.RefMan.vo.lookups.TLTType)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.TLTType.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.TLTType.TYPE_ID));
	}
	protected final void oncmbReportsRequiredSubCategoryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReportsRequiredSubCategory().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReportsRequiredSubCategory existingInstance = (ims.RefMan.vo.lookups.ReportsRequiredSubCategory)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReportsRequiredSubCategoryLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReportsRequiredSubCategory)
		{
			ims.RefMan.vo.lookups.ReportsRequiredSubCategory instance = (ims.RefMan.vo.lookups.ReportsRequiredSubCategory)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReportsRequiredSubCategoryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReportsRequiredSubCategory existingInstance = (ims.RefMan.vo.lookups.ReportsRequiredSubCategory)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReportsRequiredSubCategory().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReportsRequiredSubCategoryLookup()
	{
		this.form.cmbReportsRequiredSubCategory().clear();
		ims.RefMan.vo.lookups.ReportsRequiredSubCategoryCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReportsRequiredSubCategory(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReportsRequiredSubCategory().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReportsRequiredSubCategoryLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReportsRequiredSubCategory instance = ims.RefMan.vo.lookups.LookupHelper.getReportsRequiredSubCategoryInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReportsRequiredSubCategory().setValue(instance);
	}
	protected final void defaultcmbReportsRequiredSubCategoryLookupValue()
	{
		this.form.cmbReportsRequiredSubCategory().setValue((ims.RefMan.vo.lookups.ReportsRequiredSubCategory)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReportsRequiredSubCategory.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReportsRequiredSubCategory.TYPE_ID));
	}
	protected final void oncmbReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReviewType existingInstance = (ims.RefMan.vo.lookups.ReviewType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReviewType)
		{
			ims.RefMan.vo.lookups.ReviewType instance = (ims.RefMan.vo.lookups.ReviewType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReviewType existingInstance = (ims.RefMan.vo.lookups.ReviewType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReasonLookup()
	{
		this.form.cmbReason().clear();
		ims.RefMan.vo.lookups.ReviewTypeCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReviewType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReasonLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReviewType instance = ims.RefMan.vo.lookups.LookupHelper.getReviewTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReason().setValue(instance);
	}
	protected final void defaultcmbReasonLookupValue()
	{
		this.form.cmbReason().setValue((ims.RefMan.vo.lookups.ReviewType)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReviewType.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReviewType.TYPE_ID));
	}
	protected final void oncmbWorklistStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbWorklistStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralWorklistStatus existingInstance = (ims.RefMan.vo.lookups.ReferralWorklistStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbWorklistStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReferralWorklistStatus)
		{
			ims.RefMan.vo.lookups.ReferralWorklistStatus instance = (ims.RefMan.vo.lookups.ReferralWorklistStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbWorklistStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralWorklistStatus existingInstance = (ims.RefMan.vo.lookups.ReferralWorklistStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbWorklistStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbWorklistStatusLookup()
	{
		this.form.cmbWorklistStatus().clear();
		ims.RefMan.vo.lookups.ReferralWorklistStatusCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReferralWorklistStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbWorklistStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbWorklistStatusLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReferralWorklistStatus instance = ims.RefMan.vo.lookups.LookupHelper.getReferralWorklistStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbWorklistStatus().setValue(instance);
	}
	protected final void defaultcmbWorklistStatusLookupValue()
	{
		this.form.cmbWorklistStatus().setValue((ims.RefMan.vo.lookups.ReferralWorklistStatus)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReferralWorklistStatus.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReferralWorklistStatus.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.ReferralStatusList domain;
}
