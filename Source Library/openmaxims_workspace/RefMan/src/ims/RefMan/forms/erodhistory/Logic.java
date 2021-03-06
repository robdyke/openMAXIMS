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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4972.23166)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.erodhistory;

import ims.RefMan.forms.erodhistory.GenForm.grdERODHistoryRow;
import ims.RefMan.vo.ReferralERODHistoryVo;
import ims.RefMan.vo.ReferralERODHistoryVoCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	public void initialise(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
		ReferralERODHistoryVoCollection referralERODHistory = domain.listERODHistory(catsReferral);
		
		populateHistoryGrid(referralERODHistory);
	}

	private void populateHistoryGrid(ReferralERODHistoryVoCollection referralERODHistory)
	{
		form.grdERODHistory().getRows().clear();
		
		if(referralERODHistory == null)
			return;
		
		for(ReferralERODHistoryVo erod : referralERODHistory)
		{
			grdERODHistoryRow row = form.grdERODHistory().getRows().newRow();
			
			row.setColERODDate1(erod.getERODDate1() != null ? erod.getERODDate1().toString() : null);
			row.setCellColERODDate1Tooltip(row.getColERODDate1());
			row.setColERODDate2(erod.getERODDate2() != null ? erod.getERODDate2().toString() : null);
			row.setCellColERODDate2Tooltip(row.getColERODDate2());
			row.setColAvailability(erod.getPatAvailFromDate() != null ? erod.getPatAvailFromDate().toString() : null);
			row.setCellColAvailabilityTooltip(row.getColAvailability());
			//WDEV-19616 
			row.setColDelayReason(erod.getERODReason() != null ? erod.getERODReason().getIItemText() : null);
			row.setCellColDelayReasonTooltip(row.getColDelayReason());
			row.setColDelayedComment(erod.getERODReasonComment());
			row.setCellColDelayedCommentTooltip(row.getColDelayedComment());
			row.setValue(erod);
		}
	}
}
