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

public class PendingElectiveAdmissionListFilterVoBean extends ims.vo.ValueObjectBean
{
	public PendingElectiveAdmissionListFilterVoBean()
	{
	}
	public PendingElectiveAdmissionListFilterVoBean(ims.core.vo.PendingElectiveAdmissionListFilterVo vo)
	{
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.hospnum = vo.getHospNum();
		this.ward = vo.getWard() == null ? null : new ims.vo.RefVoBean(vo.getWard().getBoId(), vo.getWard().getBoVersion());
		this.consultant = vo.getConsultant() == null ? null : new ims.vo.RefVoBean(vo.getConsultant().getBoId(), vo.getConsultant().getBoVersion());
		this.alert = vo.getAlert() == null ? null : (ims.vo.LookupInstanceBean)vo.getAlert().getBean();
		this.hospital = vo.getHospital() == null ? null : new ims.vo.RefVoBean(vo.getHospital().getBoId(), vo.getHospital().getBoVersion());
		this.tci = vo.getTCI() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTCI().getBean();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.tcidateonly = vo.getTCIDateOnly();
		this.idtype = vo.getIDType() == null ? null : (ims.vo.LookupInstanceBean)vo.getIDType().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PendingElectiveAdmissionListFilterVo vo)
	{
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.hospnum = vo.getHospNum();
		this.ward = vo.getWard() == null ? null : new ims.vo.RefVoBean(vo.getWard().getBoId(), vo.getWard().getBoVersion());
		this.consultant = vo.getConsultant() == null ? null : new ims.vo.RefVoBean(vo.getConsultant().getBoId(), vo.getConsultant().getBoVersion());
		this.alert = vo.getAlert() == null ? null : (ims.vo.LookupInstanceBean)vo.getAlert().getBean();
		this.hospital = vo.getHospital() == null ? null : new ims.vo.RefVoBean(vo.getHospital().getBoId(), vo.getHospital().getBoVersion());
		this.tci = vo.getTCI() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTCI().getBean();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.tcidateonly = vo.getTCIDateOnly();
		this.idtype = vo.getIDType() == null ? null : (ims.vo.LookupInstanceBean)vo.getIDType().getBean();
	}

	public ims.core.vo.PendingElectiveAdmissionListFilterVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PendingElectiveAdmissionListFilterVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PendingElectiveAdmissionListFilterVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PendingElectiveAdmissionListFilterVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PendingElectiveAdmissionListFilterVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String value)
	{
		this.surname = value;
	}
	public String getForename()
	{
		return this.forename;
	}
	public void setForename(String value)
	{
		this.forename = value;
	}
	public String getHospNum()
	{
		return this.hospnum;
	}
	public void setHospNum(String value)
	{
		this.hospnum = value;
	}
	public ims.vo.RefVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.vo.RefVoBean value)
	{
		this.ward = value;
	}
	public ims.vo.RefVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.vo.RefVoBean value)
	{
		this.consultant = value;
	}
	public ims.vo.LookupInstanceBean getAlert()
	{
		return this.alert;
	}
	public void setAlert(ims.vo.LookupInstanceBean value)
	{
		this.alert = value;
	}
	public ims.vo.RefVoBean getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.vo.RefVoBean value)
	{
		this.hospital = value;
	}
	public ims.framework.utils.beans.DateBean getTCI()
	{
		return this.tci;
	}
	public void setTCI(ims.framework.utils.beans.DateBean value)
	{
		this.tci = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}
	public Boolean getTCIDateOnly()
	{
		return this.tcidateonly;
	}
	public void setTCIDateOnly(Boolean value)
	{
		this.tcidateonly = value;
	}
	public ims.vo.LookupInstanceBean getIDType()
	{
		return this.idtype;
	}
	public void setIDType(ims.vo.LookupInstanceBean value)
	{
		this.idtype = value;
	}

	private String surname;
	private String forename;
	private String hospnum;
	private ims.vo.RefVoBean ward;
	private ims.vo.RefVoBean consultant;
	private ims.vo.LookupInstanceBean alert;
	private ims.vo.RefVoBean hospital;
	private ims.framework.utils.beans.DateBean tci;
	private ims.vo.LookupInstanceBean specialty;
	private Boolean tcidateonly;
	private ims.vo.LookupInstanceBean idtype;
}
