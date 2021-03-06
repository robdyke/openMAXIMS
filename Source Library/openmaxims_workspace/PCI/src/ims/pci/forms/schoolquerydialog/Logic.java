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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.71 build 3594.20535)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.pci.forms.schoolquerydialog;

import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.SchoolShortVo;
import ims.core.vo.SchoolShortVoCollection;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
	}
	private void initialize() 
	{
		form.setMode(FormMode.VIEW);
		form.getLocalContext().setCanSearch(false);
		
		if(form.getGlobalContext().PCI.getCurrentSectorIsNotNull())
		{
			form.qmbSector().newRow(form.getGlobalContext().PCI.getCurrentSector(), form.getGlobalContext().PCI.getCurrentSector().getName());
			form.qmbSector().setValue(form.getGlobalContext().PCI.getCurrentSector());
		}
		
		updateControlsState();
	}
	
	private void updateControlsState() 
	{
		form.btnOk().setEnabled(form.grdSchool().getValue() instanceof SchoolShortVo);
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	@Override
	protected void onBtnOkClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.grdSchool().getValue() instanceof SchoolShortVo)
		{
			form.getGlobalContext().PCI.setSchool(form.grdSchool().getValue());
			engine.close(DialogResult.OK);
		}
	}
	
	@Override
	protected void onGrdSchoolSelectionChanged()
	{
		updateControlsState();
	}
	
	@Override
	protected void onQmbSectorTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		listSectors(value);
	}
	
	private void listSectors(String value) 
	{
		if (value == null || value.length() < 3)
		{
			engine.showMessage("Please enter at least 3 characters for search criteria");
			return;
		}

		LocationLiteVoCollection coll = null;
		
		coll = domain.listSectors(value); 
		
		form.qmbSector().setValue(null);
		form.qmbSector().clear();
		if (coll != null)
		{
			for (int i = 0; i < coll.size(); i++)
			{
				LocationLiteVo vo = coll.get(i);
				form.qmbSector().newRow(vo, vo.getName());
			}
		}

		if (coll.size() > 0)
		{
			form.qmbSector().showOpened();
		}
	}
	
	@Override
	protected void onImbCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearSearch();
		updateControlsState();
	}
	
	private void clearSearch() 
	{
		form.txtSchool().setValue(null);
		form.qmbSector().setValue(null);
		form.grdSchool().getRows().clear();
		form.getLocalContext().setCanSearch(false);
	}
	
	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCanSearch(true);
		search();
		updateControlsState();
	}
	
	private void search() 
	{
		form.grdSchool().getRows().clear();
		if(form.getLocalContext().getCanSearchIsNotNull() && form.getLocalContext().getCanSearch())
		{
			if(canSearch())
			{
				SchoolShortVoCollection listSchools = domain.list(form.txtSchool().getValue(), form.qmbSector().getValue());
				
				if (listSchools == null || listSchools.size() == 0)
				{
					engine.showMessage("No results found.");
				}
				
				populateGrid(listSchools);
			}
		}
	}
	
	/**
	 * WDEV-10956 - Added tool tips to cells & improved readability
	 * Function used to populate grid with schools from collection
	 */
	private void populateGrid(SchoolShortVoCollection listSchools) 
	{
		if(listSchools == null)
			return;

		for(SchoolShortVo school : listSchools)
		{
			GenForm.grdSchoolRow row = form.grdSchool().getRows().newRow();

			//  Set cells values & tooltips
			row.setColSchool(school.getSchoolName());
			row.setTooltipForColSchool(school.getSchoolName());

			row.setColSector(school.getSector() != null ? school.getSector().getName() : null);
			row.setTooltipForColSector(school.getSector() != null ? school.getSector().getName() : null);

			row.setColLocation(school.getLocation());
			row.setTooltipForColLocation(school.getLocation());

			row.setColPhone(school.getPhoneNumber());
			row.setTooltipForColPhone(school.getPhoneNumber());

			// Set row value
			row.setValue(school);
		}
	}
	
	private boolean canSearch() 
	{
		if(form.txtSchool().getValue() == null && form.qmbSector().getValue() == null)
		{
			engine.showMessage("Please enter at least one search criteria.");
			form.getLocalContext().setCanSearch(false);
			return false;
		}
		
		return true;
	}
}
