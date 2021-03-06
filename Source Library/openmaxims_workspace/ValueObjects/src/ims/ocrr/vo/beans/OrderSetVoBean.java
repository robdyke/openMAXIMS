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

package ims.ocrr.vo.beans;

public class OrderSetVoBean extends ims.vo.ValueObjectBean
{
	public OrderSetVoBean()
	{
	}
	public OrderSetVoBean(ims.ocrr.vo.OrderSetVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.commonname = vo.getCommonName();
		this.description = vo.getDescription();
		this.component = vo.getComponent() == null ? null : vo.getComponent().getBeanCollection();
		this.color = vo.getColor() == null ? null : (ims.framework.utils.beans.ColorBean)vo.getColor().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.OrderSetVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.commonname = vo.getCommonName();
		this.description = vo.getDescription();
		this.component = vo.getComponent() == null ? null : vo.getComponent().getBeanCollection();
		this.color = vo.getColor() == null ? null : (ims.framework.utils.beans.ColorBean)vo.getColor().getBean();
	}

	public ims.ocrr.vo.OrderSetVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.OrderSetVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.OrderSetVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.OrderSetVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.OrderSetVo();
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
	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public String getCommonName()
	{
		return this.commonname;
	}
	public void setCommonName(String value)
	{
		this.commonname = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public ims.ocrr.vo.beans.OrderSetComponentVoBean[] getComponent()
	{
		return this.component;
	}
	public void setComponent(ims.ocrr.vo.beans.OrderSetComponentVoBean[] value)
	{
		this.component = value;
	}
	public ims.framework.utils.beans.ColorBean getColor()
	{
		return this.color;
	}
	public void setColor(ims.framework.utils.beans.ColorBean value)
	{
		this.color = value;
	}

	private Integer id;
	private int version;
	private String name;
	private String commonname;
	private String description;
	private ims.ocrr.vo.beans.OrderSetComponentVoBean[] component;
	private ims.framework.utils.beans.ColorBean color;
}
