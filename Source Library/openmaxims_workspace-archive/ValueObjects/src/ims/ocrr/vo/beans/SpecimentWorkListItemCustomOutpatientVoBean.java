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

package ims.ocrr.vo.beans;

public class SpecimentWorkListItemCustomOutpatientVoBean extends ims.vo.ValueObjectBean
{
	public SpecimentWorkListItemCustomOutpatientVoBean()
	{
	}
	public SpecimentWorkListItemCustomOutpatientVoBean(ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo vo)
	{
		this.worklistitemid = vo.getWorkListitemId();
		this.specimenid = vo.getSpecimenId();
		this.serviceid = vo.getServiceId();
		this.servicename = vo.getServiceName();
		this.investigation = vo.getInvestigation();
		this.container = vo.getContainer();
		this.containerquantity = vo.getContainerQuantity();
		this.daterequired = vo.getDateRequired() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateRequired().getBean();
		this.hcpname = vo.getHcpName();
		this.hcpid = vo.getHcpID();
		this.specimencontainerid = vo.getSpecimenContainerId();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo vo)
	{
		this.worklistitemid = vo.getWorkListitemId();
		this.specimenid = vo.getSpecimenId();
		this.serviceid = vo.getServiceId();
		this.servicename = vo.getServiceName();
		this.investigation = vo.getInvestigation();
		this.container = vo.getContainer();
		this.containerquantity = vo.getContainerQuantity();
		this.daterequired = vo.getDateRequired() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateRequired().getBean();
		this.hcpname = vo.getHcpName();
		this.hcpid = vo.getHcpID();
		this.specimencontainerid = vo.getSpecimenContainerId();
	}

	public ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.SpecimentWorkListItemCustomOutpatientVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getWorkListitemId()
	{
		return this.worklistitemid;
	}
	public void setWorkListitemId(Integer value)
	{
		this.worklistitemid = value;
	}
	public Integer getSpecimenId()
	{
		return this.specimenid;
	}
	public void setSpecimenId(Integer value)
	{
		this.specimenid = value;
	}
	public Integer getServiceId()
	{
		return this.serviceid;
	}
	public void setServiceId(Integer value)
	{
		this.serviceid = value;
	}
	public String getServiceName()
	{
		return this.servicename;
	}
	public void setServiceName(String value)
	{
		this.servicename = value;
	}
	public String getInvestigation()
	{
		return this.investigation;
	}
	public void setInvestigation(String value)
	{
		this.investigation = value;
	}
	public String getContainer()
	{
		return this.container;
	}
	public void setContainer(String value)
	{
		this.container = value;
	}
	public Integer getContainerQuantity()
	{
		return this.containerquantity;
	}
	public void setContainerQuantity(Integer value)
	{
		this.containerquantity = value;
	}
	public ims.framework.utils.beans.DateBean getDateRequired()
	{
		return this.daterequired;
	}
	public void setDateRequired(ims.framework.utils.beans.DateBean value)
	{
		this.daterequired = value;
	}
	public String getHcpName()
	{
		return this.hcpname;
	}
	public void setHcpName(String value)
	{
		this.hcpname = value;
	}
	public Integer getHcpID()
	{
		return this.hcpid;
	}
	public void setHcpID(Integer value)
	{
		this.hcpid = value;
	}
	public Integer getSpecimenContainerId()
	{
		return this.specimencontainerid;
	}
	public void setSpecimenContainerId(Integer value)
	{
		this.specimencontainerid = value;
	}

	private Integer worklistitemid;
	private Integer specimenid;
	private Integer serviceid;
	private String servicename;
	private String investigation;
	private String container;
	private Integer containerquantity;
	private ims.framework.utils.beans.DateBean daterequired;
	private String hcpname;
	private Integer hcpid;
	private Integer specimencontainerid;
}