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
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.20 build 40824.905)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.coe.domain.impl;

import ims.coe.domain.AssessEating;
import ims.core.vo.ClinicalContactShortVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.nursing.domain.impl.MNAInputImpl;
import ims.nursing.vo.AssessmentComponent;
import ims.nursing.vo.AssessmentHeaderInfo;

public class MNAInputCoeImpl extends MNAInputImpl  implements ims.nursing.domain.MNAInput, ims.domain.impl.Transactional
{
	public AssessmentHeaderInfo saveEatingAssessmentComponent(AssessmentHeaderInfo assessment, AssessmentComponent component, ClinicalContactShortVo clinicalContactShortVo) throws StaleObjectException, UniqueKeyViolationException,DomainInterfaceException
	{
		AssessEating componentImpl = (AssessEating)getDomainImpl(AssessmentComponentImpl.class);
		return (componentImpl.saveComponent(assessment, component));
	}
}