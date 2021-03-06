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

package ims.emergency.vo.beans;

public class TrackingMovementTimesVoBean extends ims.vo.ValueObjectBean
{
	public TrackingMovementTimesVoBean()
	{
	}
	public TrackingMovementTimesVoBean(ims.emergency.vo.TrackingMovementTimesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.attendance = vo.getAttendance() == null ? null : new ims.vo.RefVoBean(vo.getAttendance().getBoId(), vo.getAttendance().getBoVersion());
		this.areamovedto = vo.getAreaMovedTo() == null ? null : new ims.vo.RefVoBean(vo.getAreaMovedTo().getBoId(), vo.getAreaMovedTo().getBoVersion());
		this.moveddatetime = vo.getMovedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getMovedDateTime().getBean();
		this.movedby = vo.getMovedBy() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getMovedBy().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.TrackingMovementTimesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.attendance = vo.getAttendance() == null ? null : new ims.vo.RefVoBean(vo.getAttendance().getBoId(), vo.getAttendance().getBoVersion());
		this.areamovedto = vo.getAreaMovedTo() == null ? null : new ims.vo.RefVoBean(vo.getAreaMovedTo().getBoId(), vo.getAreaMovedTo().getBoVersion());
		this.moveddatetime = vo.getMovedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getMovedDateTime().getBean();
		this.movedby = vo.getMovedBy() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getMovedBy().getBean(map);
	}

	public ims.emergency.vo.TrackingMovementTimesVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.TrackingMovementTimesVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.TrackingMovementTimesVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.TrackingMovementTimesVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.TrackingMovementTimesVo();
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
	public ims.vo.RefVoBean getEpisode()
	{
		return this.episode;
	}
	public void setEpisode(ims.vo.RefVoBean value)
	{
		this.episode = value;
	}
	public ims.vo.RefVoBean getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.vo.RefVoBean value)
	{
		this.attendance = value;
	}
	public ims.vo.RefVoBean getAreaMovedTo()
	{
		return this.areamovedto;
	}
	public void setAreaMovedTo(ims.vo.RefVoBean value)
	{
		this.areamovedto = value;
	}
	public ims.framework.utils.beans.DateTimeBean getMovedDateTime()
	{
		return this.moveddatetime;
	}
	public void setMovedDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.moveddatetime = value;
	}
	public ims.core.vo.beans.MemberOfStaffLiteVoBean getMovedBy()
	{
		return this.movedby;
	}
	public void setMovedBy(ims.core.vo.beans.MemberOfStaffLiteVoBean value)
	{
		this.movedby = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean episode;
	private ims.vo.RefVoBean attendance;
	private ims.vo.RefVoBean areamovedto;
	private ims.framework.utils.beans.DateTimeBean moveddatetime;
	private ims.core.vo.beans.MemberOfStaffLiteVoBean movedby;
}
