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
// This code was generated by Peter Martin using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.core.forms.privateinsurancecompanies;

import ims.configuration.gen.ConfigFlag;
import ims.core.forms.privateinsurancecompanies.GenForm.grdCompaniesRow;
import ims.core.forms.privateinsurancecompanies.GenForm.ctnDetailsContainer.grdMappingsRow;
import ims.core.vo.AddressVo;
import ims.core.vo.PrivateInsuranceCompanyVo;
import ims.core.vo.PrivateInsuranceCompanyVoCollection;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.TaxonomyMapCollection;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	
	private void open() 
	{
		clear();
		populatePrivateInsuranceCompanyGrid(domain.listPrivateInsuranceCompanyVo(Boolean.FALSE));
		form.getLocalContext().setPrivateInsuranceCompanyVo(domain.getPrivateInsuranceCompanyVo(form.getLocalContext().getPrivateInsuranceCompanyVo()));
		form.grdCompanies().setValue(form.getLocalContext().getPrivateInsuranceCompanyVo());
		populateInstanceControlsFromData(form.getLocalContext().getPrivateInsuranceCompanyVo());
		form.setMode(FormMode.VIEW);
		updateControlsState();
		
	}
	
	private void populateInstanceControlsFromData(PrivateInsuranceCompanyVo privateInsuranceCompanyVo) 
	{
		
		//Clear instance controls
		clearInstanceControls();
		
		// Terminate function on null value parameter
		if (privateInsuranceCompanyVo == null)
			return;
		
		// Set value to instance controls
		form.ctnDetails().txtCompanyName().setValue(privateInsuranceCompanyVo.getName());
		AddressVo addressVo = privateInsuranceCompanyVo.getAddress();
		if(addressVo!=null){
			form.ctnDetails().txtAddress1().setValue(addressVo.getLine1());
			form.ctnDetails().txtAddress2().setValue(addressVo.getLine2());
			form.ctnDetails().txtAddress3().setValue(addressVo.getLine3());
			form.ctnDetails().txtAddress4().setValue(addressVo.getLine4());
			form.ctnDetails().txtAddress5().setValue(addressVo.getLine5());
			form.ctnDetails().txtPostcode().setValue(addressVo.getPostCode());
		}
		
		form.ctnDetails().chkActive().setValue(Boolean.TRUE.equals(privateInsuranceCompanyVo.getIsActive()));
		populateOrgMappingsGrid(privateInsuranceCompanyVo.getCodeMappings());
	}
	
	private void populateOrgMappingsGrid(TaxonomyMapCollection coll)
	{
		form.ctnDetails().grdMappings().getRows().clear();
		if (coll == null) return;
		
		for (int i = 0; i < coll.size(); i++)
		{
			TaxonomyMap map = coll.get(i);
			grdMappingsRow row = form.ctnDetails().grdMappings().getRows().newRow();
			row.setcolExtCodeType(map.getTaxonomyName());
			row.setcolCode(map.getTaxonomyCode());
			row.setTooltipForcolCode(map.getTaxonomyCode());
			row.setValue(map);
		}		
	}
	
	private void clearInstanceControls() 
	{
		form.ctnDetails().txtCompanyName().setValue("");
		form.ctnDetails().txtAddress1().setValue("");
		form.ctnDetails().txtAddress2().setValue("");
		form.ctnDetails().txtAddress3().setValue("");
		form.ctnDetails().txtAddress4().setValue("");
		form.ctnDetails().txtAddress5().setValue("");
		form.ctnDetails().txtPostcode().setValue("");
		form.ctnDetails().chkActive().setValue(false);
		form.ctnDetails().grdMappings().getRows().clear();		
	}
	
	private void populatePrivateInsuranceCompanyGrid(PrivateInsuranceCompanyVoCollection collection) {
		// Clear grid
		form.grdCompanies().getRows().clear();
		
		// Terminate function on null value parameter
		if (collection == null)
			return;
				
		// Iterate through pasconfig collection
		for (PrivateInsuranceCompanyVo voPrivateInsuranceCompany : collection)
		{
			if (voPrivateInsuranceCompany == null)
				continue;
			
			// Add each pasconfig to a grid row
			grdCompaniesRow grdCompanies = form.grdCompanies().getRows().newRow(true);
			
			// Set pasconfigvo row columns
			grdCompanies.setColCompany(voPrivateInsuranceCompany.getName());
			if(voPrivateInsuranceCompany.getAddressIsNotNull())
			{
				grdCompanies.setColAddress(getAddress(voPrivateInsuranceCompany.getAddress()));
				grdCompanies.setColPostcode(voPrivateInsuranceCompany.getAddress().getPostCode());
			}
			
			grdCompanies.setColActive(voPrivateInsuranceCompany.getIsActive());
			
			grdCompanies.setValue(voPrivateInsuranceCompany);
		}
		
	}
	
	//	WDEV-13676
	private String getAddress(AddressVo address) 
	{
		if(address == null)
			return null;
		
		StringBuffer str = new StringBuffer();
		
		if(address.getLine1() != null)
			str.append(address.getLine1());
			
		if(address.getLine2() != null)
		{
			str.append(", ");
			str.append(address.getLine2());
		}
		if(address.getLine3() != null)
		{
			str.append(", ");
			str.append(address.getLine3());
		}
		if(address.getLine4() != null)
		{
			str.append(", ");
			str.append(address.getLine4());
		}

		return str.toString();
	}

	private void updateControlsState() 
	{
		// Update controls for VIEW mode
		if (FormMode.VIEW.equals(form.getMode()))
		{
			// EDIT button
			form.btnUpdate().setEnabled(true);
			form.btnUpdate().setVisible(form.grdCompanies().getValue() != null);
		}
		
		form.ctnDetails().setCollapsed(!(form.grdCompanies().getValue() != null || FormMode.EDIT.equals(form.getMode())));
		
		// Update context menu options
		updateContextMenuState();	
	}
	
	private void clear() 
	{
		form.grdCompanies().getRows().clear();
		clearInstanceControls();		
	}
	
	private void initialize() 
	{
		form.getLocalContext().setPrivateInsuranceCompanyVo(null);
	}
	
	@Override
	protected void onGrdCompaniesSelectionChanged()
	{
		form.getLocalContext().setPrivateInsuranceCompanyVo(domain.getPrivateInsuranceCompanyVo(form.grdCompanies().getValue()));
		// Populate instance controls with selected record
		populateInstanceControlsFromData(form.getLocalContext().getPrivateInsuranceCompanyVo());

		// Update controls state (buttons, context menu options, etc.)
		updateControlsState();
	}
	
	@Override
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		updateInstance();
	}
	
	private void updateInstance() 
	{
		form.setMode(FormMode.EDIT);		
	}
	
	private void updateContextMenuState() 
	{
		form.getContextMenus().Core.getPrivateInsuranceCompaniesMappingsMenuNEWItem().setVisible(FormMode.EDIT.equals(form.getMode()));
		form.getContextMenus().Core.getPrivateInsuranceCompaniesMappingsMenuREMOVEItem().setVisible(FormMode.EDIT.equals(form.getMode()) && form.ctnDetails().grdMappings().getSelectedRow() != null);
	}
	
	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		newInstance();
	}
	
	private void newInstance() 
	{
		//Clear local context selection
		form.getLocalContext().setPrivateInsuranceCompanyVo(null);
		
		// Clear instance controls
		clearInstanceControls();
		// Set form to EDIT mode
		form.ctnDetails().chkActive().setValue(true);
		form.setMode(FormMode.EDIT);		
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			open();
	}
	
	private boolean save() 
	{
		try
		{
			// Populate instance data from screen
			
			PrivateInsuranceCompanyVo  privateInsuranceCompanyVo = populateDataFromInstanceControls(form.getLocalContext().getPrivateInsuranceCompanyVo());

			// Validate instance data
			String[] errors = privateInsuranceCompanyVo.validate();

			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}
			form.getLocalContext().setPrivateInsuranceCompanyVo(privateInsuranceCompanyVo);	
			// Attempt to save
			form.getLocalContext().setPrivateInsuranceCompanyVo(domain.savePrivateInsuranceCompanyVo(form.getLocalContext().getPrivateInsuranceCompanyVo()));
			
			// Save was successful
			return true;
		}
		// Treat exceptions
		catch (StaleObjectException e)
		{
			
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}
		catch (UnqViolationUncheckedException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
	}
	
	private PrivateInsuranceCompanyVo populateDataFromInstanceControls(PrivateInsuranceCompanyVo privateInsuranceCompanyVo) 
	{
		if (privateInsuranceCompanyVo == null)
		{
			privateInsuranceCompanyVo = new PrivateInsuranceCompanyVo();
		}
		
			// Get instance data from screen
		privateInsuranceCompanyVo.setName(form.ctnDetails().txtCompanyName().getValue());
		privateInsuranceCompanyVo.setUpperName(getUpperCompanyName());//WDEV-13676
		
		AddressVo addressVo = privateInsuranceCompanyVo.getAddress();
		if(addressVo==null)
			addressVo = new AddressVo();
		
		addressVo.setLine1(form.ctnDetails().txtAddress1().getValue());
		addressVo.setLine2(form.ctnDetails().txtAddress2().getValue());
		addressVo.setLine3(form.ctnDetails().txtAddress3().getValue());
		addressVo.setLine4(form.ctnDetails().txtAddress4().getValue());
		addressVo.setLine5(form.ctnDetails().txtAddress5().getValue());
		addressVo.setPostCode(form.ctnDetails().txtPostcode().getValue());
		privateInsuranceCompanyVo.setAddress(addressVo);
		
		privateInsuranceCompanyVo.setIsActive(form.ctnDetails().chkActive().getValue());	
		
		privateInsuranceCompanyVo.setCodeMappings(getCodeMappings(privateInsuranceCompanyVo.getCodeMappings()));

		return privateInsuranceCompanyVo;
	}
	
	//WDEV-13676
	private String getUpperCompanyName() 
	{
		String companyName = form.ctnDetails().txtCompanyName().getValue();
		
		if(companyName == null)
			return " ";
		
		companyName = companyName.replaceAll("[^a-zA-Z]", "");
		companyName = companyName.toUpperCase().substring(0, Math.min(PrivateInsuranceCompanyVo.getUpperNameMaxLength(), companyName.length()));
		
		return (companyName != null && companyName.length() > 0) ? companyName : " ";
	}

	private TaxonomyMapCollection getCodeMappings(TaxonomyMapCollection coll)
	{
		if(coll == null)
		{
			coll = new TaxonomyMapCollection();
		}
		
		coll.clear();
		
		for (int i = 0; i < form.ctnDetails().grdMappings().getRows().size(); i++)
		{
			grdMappingsRow row = form.ctnDetails().grdMappings().getRows().get(i);
			if (row.getcolExtCodeType() != null || (row.getcolCode() != null && row.getcolCode().length() > 0))
			{
				TaxonomyMap map = row.getValue();
				
				if(map == null)
				{
					map = new TaxonomyMap();
				}
				
				map.setTaxonomyName(row.getcolExtCodeType());
				map.setTaxonomyCode(row.getcolCode());
				coll.add(map);
			}
		}
		
		return coll;
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	
	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.CoreNamespace.PrivateInsuranceCompaniesMappingsMenu.NEW:
				form.ctnDetails().grdMappings().getRows().newRow();
			break;

			case GenForm.ContextMenus.CoreNamespace.PrivateInsuranceCompaniesMappingsMenu.REMOVE:
				removeTaxonomy();
			break;
			
			default :
			break;
		}
		
		updateControlsState();
	}
	
	private void removeTaxonomy() 
	{
		int index = form.ctnDetails().grdMappings().getSelectedRowIndex();
		if (index < 0)
		{
			engine.showMessage("Please select a Contact Type to remove");
			return;
		}
		form.ctnDetails().grdMappings().getRows().remove(index);
	}
	
	
	@Override
	protected void onGrdMappingsSelectionChanged() throws PresentationLogicException 
	{
		updateControlsState();		
	}

	@Override
	protected void onFormModeChanged() 
	{
		updateControlsState();
	}
}
