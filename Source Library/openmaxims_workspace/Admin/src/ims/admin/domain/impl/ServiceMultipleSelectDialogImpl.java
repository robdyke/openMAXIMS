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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.admin.domain.impl;

import ims.admin.domain.base.impl.BaseServiceMultipleSelectDialogImpl;
import ims.admin.vo.ServiceVoLiteVoCollection;
import ims.admin.vo.domain.ServiceVoLiteVoAssembler;
import ims.core.vo.ServiceLiteVoCollection;
import ims.core.vo.domain.ServiceLiteVoAssembler;
import ims.domain.exceptions.DomainRuntimeException;

import java.util.ArrayList;
import java.util.List;

public class ServiceMultipleSelectDialogImpl extends BaseServiceMultipleSelectDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ServiceLiteVoCollection getServices(String serviceName, ims.core.vo.lookups.ServiceCategory serviceCategory)
	{
		if (serviceName  == null || serviceName.length() == 0 )
		{
			throw new DomainRuntimeException("No search criteria specified");
		}
		
		StringBuilder hqlBuilder = new StringBuilder("select s2_1 from ReferralService as s1_1 left join s1_1.referralServices as s2_1 left join s2_1.serviceCategory as l1_1 where "); //WDEV-20054  now lists from Referral Services
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		String and = "";
				
		if (serviceName!=null && serviceName.length()>0)
		{
			hqlBuilder.append(and);
			hqlBuilder.append(" s2_1.upperName like :cName "); //WDEV-20054
			and = "and ";
			paramNames.add("cName");
			paramValues.add("%" + serviceName.toUpperCase() + "%");
		}
		if (serviceCategory != null)
		{
			hqlBuilder.append(and);
			hqlBuilder.append(" l1_1.id = :cType ");
			and = "and ";
			paramNames.add("cType");
			paramValues.add(serviceCategory.getID());
		}
		
		hqlBuilder.append(and);
		hqlBuilder.append(" s2_1.isActive = :isActive"); //WDEV-20054
		paramNames.add("isActive");
		paramValues.add(new Boolean(true));
				
		List<?> dos = getDomainFactory().find(hqlBuilder.toString(),paramNames,paramValues);
		
		if (dos == null || dos.size() == 0)
			return null;
		
		return ServiceLiteVoAssembler.createServiceLiteVoCollectionFromService(dos); 
		
	}
}
