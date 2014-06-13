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

package ims.core.vo.beans;

public class PatientNoAlertInfoForTriageVoBean extends ims.vo.ValueObjectBean
{
	public PatientNoAlertInfoForTriageVoBean()
	{
	}
	public PatientNoAlertInfoForTriageVoBean(ims.core.vo.PatientNoAlertInfoForTriageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.alertstatus = vo.getAlertStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getAlertStatus().getBean();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInfoForTriageVoBean)vo.getAuthoringInformation().getBean();
		this.whenidentified = vo.getWhenIdentified() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getWhenIdentified().getBean();
		this.noalertsourceofinformation = vo.getNoAlertSourceofInformation() == null ? null : (ims.vo.LookupInstanceBean)vo.getNoAlertSourceofInformation().getBean();
		this.recordinginformation = vo.getRecordingInformation() == null ? null : (ims.core.vo.beans.RecordingUserInformationForTriageVoBean)vo.getRecordingInformation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PatientNoAlertInfoForTriageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.alertstatus = vo.getAlertStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getAlertStatus().getBean();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInfoForTriageVoBean)vo.getAuthoringInformation().getBean(map);
		this.whenidentified = vo.getWhenIdentified() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getWhenIdentified().getBean();
		this.noalertsourceofinformation = vo.getNoAlertSourceofInformation() == null ? null : (ims.vo.LookupInstanceBean)vo.getNoAlertSourceofInformation().getBean();
		this.recordinginformation = vo.getRecordingInformation() == null ? null : (ims.core.vo.beans.RecordingUserInformationForTriageVoBean)vo.getRecordingInformation().getBean(map);
	}

	public ims.core.vo.PatientNoAlertInfoForTriageVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PatientNoAlertInfoForTriageVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PatientNoAlertInfoForTriageVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PatientNoAlertInfoForTriageVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PatientNoAlertInfoForTriageVo();
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
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.LookupInstanceBean getAlertStatus()
	{
		return this.alertstatus;
	}
	public void setAlertStatus(ims.vo.LookupInstanceBean value)
	{
		this.alertstatus = value;
	}
	public ims.core.vo.beans.AuthoringInfoForTriageVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInfoForTriageVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.framework.utils.beans.PartialDateBean getWhenIdentified()
	{
		return this.whenidentified;
	}
	public void setWhenIdentified(ims.framework.utils.beans.PartialDateBean value)
	{
		this.whenidentified = value;
	}
	public ims.vo.LookupInstanceBean getNoAlertSourceofInformation()
	{
		return this.noalertsourceofinformation;
	}
	public void setNoAlertSourceofInformation(ims.vo.LookupInstanceBean value)
	{
		this.noalertsourceofinformation = value;
	}
	public ims.core.vo.beans.RecordingUserInformationForTriageVoBean getRecordingInformation()
	{
		return this.recordinginformation;
	}
	public void setRecordingInformation(ims.core.vo.beans.RecordingUserInformationForTriageVoBean value)
	{
		this.recordinginformation = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.vo.LookupInstanceBean alertstatus;
	private ims.core.vo.beans.AuthoringInfoForTriageVoBean authoringinformation;
	private ims.framework.utils.beans.PartialDateBean whenidentified;
	private ims.vo.LookupInstanceBean noalertsourceofinformation;
	private ims.core.vo.beans.RecordingUserInformationForTriageVoBean recordinginformation;
}