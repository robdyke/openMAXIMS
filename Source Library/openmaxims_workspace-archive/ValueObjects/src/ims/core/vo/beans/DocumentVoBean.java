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

public class DocumentVoBean extends ims.vo.ValueObjectBean
{
	public DocumentVoBean()
	{
	}
	public DocumentVoBean(ims.core.vo.DocumentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.template = vo.getTemplate() == null ? null : (ims.admin.vo.beans.ReportTemplateVoBean)vo.getTemplate().getBean();
		this.content = vo.getContent();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.recuser = vo.getRecUser();
		this.creationdate = vo.getCreationDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCreationDate().getBean();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventLiteVoBean)vo.getPasEvent().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.DocumentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.template = vo.getTemplate() == null ? null : (ims.admin.vo.beans.ReportTemplateVoBean)vo.getTemplate().getBean(map);
		this.content = vo.getContent();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean(map);
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean(map);
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.recuser = vo.getRecUser();
		this.creationdate = vo.getCreationDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCreationDate().getBean();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventLiteVoBean)vo.getPasEvent().getBean(map);
	}

	public ims.core.vo.DocumentVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.DocumentVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.DocumentVo vo = null;
		if(map != null)
			vo = (ims.core.vo.DocumentVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.DocumentVo();
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
	public ims.admin.vo.beans.ReportTemplateVoBean getTemplate()
	{
		return this.template;
	}
	public void setTemplate(ims.admin.vo.beans.ReportTemplateVoBean value)
	{
		this.template = value;
	}
	public String getContent()
	{
		return this.content;
	}
	public void setContent(String value)
	{
		this.content = value;
	}
	public ims.core.vo.beans.PatientShortBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientShortBean value)
	{
		this.patient = value;
	}
	public ims.core.vo.beans.ClinicalContactShortVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.beans.ClinicalContactShortVoBean value)
	{
		this.clinicalcontact = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public String getRecUser()
	{
		return this.recuser;
	}
	public void setRecUser(String value)
	{
		this.recuser = value;
	}
	public ims.framework.utils.beans.DateBean getCreationDate()
	{
		return this.creationdate;
	}
	public void setCreationDate(ims.framework.utils.beans.DateBean value)
	{
		this.creationdate = value;
	}
	public ims.core.vo.beans.PasEventLiteVoBean getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.vo.beans.PasEventLiteVoBean value)
	{
		this.pasevent = value;
	}

	private Integer id;
	private int version;
	private ims.admin.vo.beans.ReportTemplateVoBean template;
	private String content;
	private ims.core.vo.beans.PatientShortBean patient;
	private ims.core.vo.beans.ClinicalContactShortVoBean clinicalcontact;
	private ims.vo.LookupInstanceBean status;
	private String recuser;
	private ims.framework.utils.beans.DateBean creationdate;
	private ims.core.vo.beans.PasEventLiteVoBean pasevent;
}