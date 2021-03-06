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

package ims.spinalinjuries.forms.adviceleaflets;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.spinalinjuries.domain.AdviceLeaflets.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.spinalinjuries.domain.AdviceLeaflets domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbGivenToValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbGivenTo().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.AdviceLeafletGivenTo existingInstance = (ims.core.vo.lookups.AdviceLeafletGivenTo)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbGivenToLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.AdviceLeafletGivenTo)
		{
			ims.core.vo.lookups.AdviceLeafletGivenTo instance = (ims.core.vo.lookups.AdviceLeafletGivenTo)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbGivenToLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.AdviceLeafletGivenTo existingInstance = (ims.core.vo.lookups.AdviceLeafletGivenTo)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbGivenTo().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbGivenToLookup()
	{
		this.form.cmbGivenTo().clear();
		ims.core.vo.lookups.AdviceLeafletGivenToCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getAdviceLeafletGivenTo(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbGivenTo().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbGivenToLookupValue(int id)
	{
		ims.core.vo.lookups.AdviceLeafletGivenTo instance = ims.core.vo.lookups.LookupHelper.getAdviceLeafletGivenToInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbGivenTo().setValue(instance);
	}
	protected final void defaultcmbGivenToLookupValue()
	{
		this.form.cmbGivenTo().setValue((ims.core.vo.lookups.AdviceLeafletGivenTo)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.AdviceLeafletGivenTo.class, engine.getFormName().getID(), ims.core.vo.lookups.AdviceLeafletGivenTo.TYPE_ID));
	}
	protected final void oncmbLeafletValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbLeaflet().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.AdviceLeaflets existingInstance = (ims.core.vo.lookups.AdviceLeaflets)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbLeafletLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.AdviceLeaflets)
		{
			ims.core.vo.lookups.AdviceLeaflets instance = (ims.core.vo.lookups.AdviceLeaflets)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbLeafletLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.AdviceLeaflets existingInstance = (ims.core.vo.lookups.AdviceLeaflets)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbLeaflet().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbLeafletLookup()
	{
		this.form.cmbLeaflet().clear();
		ims.core.vo.lookups.AdviceLeafletsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getAdviceLeaflets(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbLeaflet().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbLeafletLookupValue(int id)
	{
		ims.core.vo.lookups.AdviceLeaflets instance = ims.core.vo.lookups.LookupHelper.getAdviceLeafletsInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbLeaflet().setValue(instance);
	}
	protected final void defaultcmbLeafletLookupValue()
	{
		this.form.cmbLeaflet().setValue((ims.core.vo.lookups.AdviceLeaflets)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.AdviceLeaflets.class, engine.getFormName().getID(), ims.core.vo.lookups.AdviceLeaflets.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.spinalinjuries.domain.AdviceLeaflets domain;
}
