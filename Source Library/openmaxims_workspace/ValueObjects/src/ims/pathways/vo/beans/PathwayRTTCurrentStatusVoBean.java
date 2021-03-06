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

package ims.pathways.vo.beans;

public class PathwayRTTCurrentStatusVoBean extends ims.vo.ValueObjectBean
{
	public PathwayRTTCurrentStatusVoBean()
	{
	}
	public PathwayRTTCurrentStatusVoBean(ims.pathways.vo.PathwayRTTCurrentStatusVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.rttstatus = vo.getRTTStatus() == null ? null : (ims.pathways.vo.beans.PathwayRTTStatusDescriptionVoBean)vo.getRTTStatus().getBean();
		this.statusby = vo.getStatusBy() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getStatusBy().getBean();
		this.statusdatetime = vo.getStatusDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getStatusDateTime().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.PathwayRTTCurrentStatusVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.rttstatus = vo.getRTTStatus() == null ? null : (ims.pathways.vo.beans.PathwayRTTStatusDescriptionVoBean)vo.getRTTStatus().getBean(map);
		this.statusby = vo.getStatusBy() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getStatusBy().getBean(map);
		this.statusdatetime = vo.getStatusDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getStatusDateTime().getBean();
	}

	public ims.pathways.vo.PathwayRTTCurrentStatusVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.pathways.vo.PathwayRTTCurrentStatusVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.PathwayRTTCurrentStatusVo vo = null;
		if(map != null)
			vo = (ims.pathways.vo.PathwayRTTCurrentStatusVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.pathways.vo.PathwayRTTCurrentStatusVo();
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
	public ims.pathways.vo.beans.PathwayRTTStatusDescriptionVoBean getRTTStatus()
	{
		return this.rttstatus;
	}
	public void setRTTStatus(ims.pathways.vo.beans.PathwayRTTStatusDescriptionVoBean value)
	{
		this.rttstatus = value;
	}
	public ims.core.vo.beans.MemberOfStaffLiteVoBean getStatusBy()
	{
		return this.statusby;
	}
	public void setStatusBy(ims.core.vo.beans.MemberOfStaffLiteVoBean value)
	{
		this.statusby = value;
	}
	public ims.framework.utils.beans.DateTimeBean getStatusDateTime()
	{
		return this.statusdatetime;
	}
	public void setStatusDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.statusdatetime = value;
	}

	private Integer id;
	private int version;
	private ims.pathways.vo.beans.PathwayRTTStatusDescriptionVoBean rttstatus;
	private ims.core.vo.beans.MemberOfStaffLiteVoBean statusby;
	private ims.framework.utils.beans.DateTimeBean statusdatetime;
}
