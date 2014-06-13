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

package ims.scheduling.vo.beans;

public class IfPatientOrderVoBean extends ims.vo.ValueObjectBean
{
	public IfPatientOrderVoBean()
	{
	}
	public IfPatientOrderVoBean(ims.scheduling.vo.IfPatientOrderVo vo)
	{
		this.patientref = vo.getPatientRef() == null ? null : new ims.vo.RefVoBean(vo.getPatientRef().getBoId(), vo.getPatientRef().getBoVersion());
		this.orderref = vo.getOrderRef() == null ? null : new ims.vo.RefVoBean(vo.getOrderRef().getBoId(), vo.getOrderRef().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.IfPatientOrderVo vo)
	{
		this.patientref = vo.getPatientRef() == null ? null : new ims.vo.RefVoBean(vo.getPatientRef().getBoId(), vo.getPatientRef().getBoVersion());
		this.orderref = vo.getOrderRef() == null ? null : new ims.vo.RefVoBean(vo.getOrderRef().getBoId(), vo.getOrderRef().getBoVersion());
	}

	public ims.scheduling.vo.IfPatientOrderVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.IfPatientOrderVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.IfPatientOrderVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.IfPatientOrderVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.IfPatientOrderVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.vo.RefVoBean getPatientRef()
	{
		return this.patientref;
	}
	public void setPatientRef(ims.vo.RefVoBean value)
	{
		this.patientref = value;
	}
	public ims.vo.RefVoBean getOrderRef()
	{
		return this.orderref;
	}
	public void setOrderRef(ims.vo.RefVoBean value)
	{
		this.orderref = value;
	}

	private ims.vo.RefVoBean patientref;
	private ims.vo.RefVoBean orderref;
}