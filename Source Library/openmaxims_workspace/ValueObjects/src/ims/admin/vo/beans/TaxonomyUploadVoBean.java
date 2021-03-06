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

package ims.admin.vo.beans;

public class TaxonomyUploadVoBean extends ims.vo.ValueObjectBean
{
	public TaxonomyUploadVoBean()
	{
	}
	public TaxonomyUploadVoBean(ims.admin.vo.TaxonomyUploadVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.taxonomycolumnmapfilename = vo.getTaxonomyColumnMapFilename();
		this.taxonomycode = vo.getTaxonomyCode() == null ? null : (ims.vo.LookupInstanceBean)vo.getTaxonomyCode().getBean();
		this.taxonomyfilename = vo.getTaxonomyFilename();
		this.filetype = vo.getFileType() == null ? null : (ims.vo.LookupInstanceBean)vo.getFileType().getBean();
		this.taxonomyelement = vo.getTaxonomyElement() == null ? null : (ims.vo.LookupInstanceBean)vo.getTaxonomyElement().getBean();
		this.delimeter = vo.getDelimeter();
		this.qualifier = vo.getQualifier();
		this.deletefirst = vo.getDeleteFirst();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.TaxonomyUploadVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.taxonomycolumnmapfilename = vo.getTaxonomyColumnMapFilename();
		this.taxonomycode = vo.getTaxonomyCode() == null ? null : (ims.vo.LookupInstanceBean)vo.getTaxonomyCode().getBean();
		this.taxonomyfilename = vo.getTaxonomyFilename();
		this.filetype = vo.getFileType() == null ? null : (ims.vo.LookupInstanceBean)vo.getFileType().getBean();
		this.taxonomyelement = vo.getTaxonomyElement() == null ? null : (ims.vo.LookupInstanceBean)vo.getTaxonomyElement().getBean();
		this.delimeter = vo.getDelimeter();
		this.qualifier = vo.getQualifier();
		this.deletefirst = vo.getDeleteFirst();
	}

	public ims.admin.vo.TaxonomyUploadVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.admin.vo.TaxonomyUploadVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.TaxonomyUploadVo vo = null;
		if(map != null)
			vo = (ims.admin.vo.TaxonomyUploadVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.admin.vo.TaxonomyUploadVo();
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
	public String getTaxonomyColumnMapFilename()
	{
		return this.taxonomycolumnmapfilename;
	}
	public void setTaxonomyColumnMapFilename(String value)
	{
		this.taxonomycolumnmapfilename = value;
	}
	public ims.vo.LookupInstanceBean getTaxonomyCode()
	{
		return this.taxonomycode;
	}
	public void setTaxonomyCode(ims.vo.LookupInstanceBean value)
	{
		this.taxonomycode = value;
	}
	public String getTaxonomyFilename()
	{
		return this.taxonomyfilename;
	}
	public void setTaxonomyFilename(String value)
	{
		this.taxonomyfilename = value;
	}
	public ims.vo.LookupInstanceBean getFileType()
	{
		return this.filetype;
	}
	public void setFileType(ims.vo.LookupInstanceBean value)
	{
		this.filetype = value;
	}
	public ims.vo.LookupInstanceBean getTaxonomyElement()
	{
		return this.taxonomyelement;
	}
	public void setTaxonomyElement(ims.vo.LookupInstanceBean value)
	{
		this.taxonomyelement = value;
	}
	public String getDelimeter()
	{
		return this.delimeter;
	}
	public void setDelimeter(String value)
	{
		this.delimeter = value;
	}
	public String getQualifier()
	{
		return this.qualifier;
	}
	public void setQualifier(String value)
	{
		this.qualifier = value;
	}
	public Boolean getDeleteFirst()
	{
		return this.deletefirst;
	}
	public void setDeleteFirst(Boolean value)
	{
		this.deletefirst = value;
	}

	private Integer id;
	private int version;
	private String taxonomycolumnmapfilename;
	private ims.vo.LookupInstanceBean taxonomycode;
	private String taxonomyfilename;
	private ims.vo.LookupInstanceBean filetype;
	private ims.vo.LookupInstanceBean taxonomyelement;
	private String delimeter;
	private String qualifier;
	private Boolean deletefirst;
}
