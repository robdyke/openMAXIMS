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

package ims.RefMan.vo;

/**
 * Linked to Pathways.PatientPathwayJourney business object (ID: 1088100000).
 */
public class JourneyForPatientJourneyVo extends ims.pathways.vo.PatientPathwayJourneyRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public JourneyForPatientJourneyVo()
	{
	}
	public JourneyForPatientJourneyVo(Integer id, int version)
	{
		super(id, version);
	}
	public JourneyForPatientJourneyVo(ims.RefMan.vo.beans.JourneyForPatientJourneyVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referral = bean.getReferral() == null ? null : bean.getReferral().buildVo();
		this.currentclock = bean.getCurrentClock() == null ? null : bean.getCurrentClock().buildVo();
		this.pathway = bean.getPathway() == null ? null : bean.getPathway().buildVo();
		this.pathwayhistory = ims.pathways.vo.PathwayHistoryVoCollection.buildFromBeanCollection(bean.getPathwayHistory());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.JourneyForPatientJourneyVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referral = bean.getReferral() == null ? null : bean.getReferral().buildVo(map);
		this.currentclock = bean.getCurrentClock() == null ? null : bean.getCurrentClock().buildVo(map);
		this.pathway = bean.getPathway() == null ? null : bean.getPathway().buildVo(map);
		this.pathwayhistory = ims.pathways.vo.PathwayHistoryVoCollection.buildFromBeanCollection(bean.getPathwayHistory());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.JourneyForPatientJourneyVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.JourneyForPatientJourneyVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.JourneyForPatientJourneyVoBean();
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
		if(fieldName.equals("REFERRAL"))
			return getReferral();
		if(fieldName.equals("CURRENTCLOCK"))
			return getCurrentClock();
		if(fieldName.equals("PATHWAY"))
			return getPathway();
		if(fieldName.equals("PATHWAYHISTORY"))
			return getPathwayHistory();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getReferralIsNotNull()
	{
		return this.referral != null;
	}
	public ims.core.vo.ReferralLiteVo getReferral()
	{
		return this.referral;
	}
	public void setReferral(ims.core.vo.ReferralLiteVo value)
	{
		this.isValidated = false;
		this.referral = value;
	}
	public boolean getCurrentClockIsNotNull()
	{
		return this.currentclock != null;
	}
	public ims.pathways.vo.PathwayCurrentClockForRttStatusVo getCurrentClock()
	{
		return this.currentclock;
	}
	public void setCurrentClock(ims.pathways.vo.PathwayCurrentClockForRttStatusVo value)
	{
		this.isValidated = false;
		this.currentclock = value;
	}
	public boolean getPathwayIsNotNull()
	{
		return this.pathway != null;
	}
	public ims.pathways.vo.PathwayLiteVo getPathway()
	{
		return this.pathway;
	}
	public void setPathway(ims.pathways.vo.PathwayLiteVo value)
	{
		this.isValidated = false;
		this.pathway = value;
	}
	public boolean getPathwayHistoryIsNotNull()
	{
		return this.pathwayhistory != null;
	}
	public ims.pathways.vo.PathwayHistoryVoCollection getPathwayHistory()
	{
		return this.pathwayhistory;
	}
	public void setPathwayHistory(ims.pathways.vo.PathwayHistoryVoCollection value)
	{
		this.isValidated = false;
		this.pathwayhistory = value;
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
		if(this.pathway == null)
			listOfErrors.add("Pathway is mandatory");
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
	
		JourneyForPatientJourneyVo clone = new JourneyForPatientJourneyVo(this.id, this.version);
		
		if(this.referral == null)
			clone.referral = null;
		else
			clone.referral = (ims.core.vo.ReferralLiteVo)this.referral.clone();
		if(this.currentclock == null)
			clone.currentclock = null;
		else
			clone.currentclock = (ims.pathways.vo.PathwayCurrentClockForRttStatusVo)this.currentclock.clone();
		if(this.pathway == null)
			clone.pathway = null;
		else
			clone.pathway = (ims.pathways.vo.PathwayLiteVo)this.pathway.clone();
		if(this.pathwayhistory == null)
			clone.pathwayhistory = null;
		else
			clone.pathwayhistory = (ims.pathways.vo.PathwayHistoryVoCollection)this.pathwayhistory.clone();
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
		if (!(JourneyForPatientJourneyVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A JourneyForPatientJourneyVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((JourneyForPatientJourneyVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((JourneyForPatientJourneyVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.referral != null)
			count++;
		if(this.currentclock != null)
			count++;
		if(this.pathway != null)
			count++;
		if(this.pathwayhistory != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.ReferralLiteVo referral;
	protected ims.pathways.vo.PathwayCurrentClockForRttStatusVo currentclock;
	protected ims.pathways.vo.PathwayLiteVo pathway;
	protected ims.pathways.vo.PathwayHistoryVoCollection pathwayhistory;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
