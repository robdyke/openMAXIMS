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
// This code was generated by Aidan Mc Donnell using IMS Development Environment (version 1.62 build 3147.24045)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.admin.forms.referralstatusadmin;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import ims.admin.forms.activity.GenForm.ContextMenus;
import ims.RefMan.vo.ReferralStatusConfigVo;
import ims.RefMan.vo.ReferralStatusConfigVoCollection;
import ims.RefMan.vo.lookups.LookupHelper;
import ims.RefMan.vo.lookups.ReferralApptStatus;
import ims.RefMan.vo.lookups.ReferralApptStatusCollection;
import ims.configuration.gen.ConfigFlag;
import ims.core.resource.people.vo.GpRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.vo.lookups.LocationType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.Control;
import ims.framework.controls.ComboBox;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridCellCollection;
import ims.framework.controls.DynamicGridCellItem;
import ims.framework.controls.DynamicGridCellOptions;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.controls.DynamicGridRowCollection;
import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;

public class Logic extends BaseLogic
{
	private static final long	serialVersionUID	= 1L;

	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{

		open();
		populateScreenFromData();
		form.getLocalContext().setusedParents(getAllParentNodes());
		
		form.getLocalContext().getusedParents();
	
	
	
	}

	private void createGrid()
	{

		//form.dyngrdStatus().setHeaderHeight(10);
		form.dyngrdStatus().getColumns().newColumn("");
		form.dyngrdStatus().getColumns().get(0).setWidth(400);

		form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setText("Add referral status");
		form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setText("Remove");
		form.getContextMenus().Admin.getTreeMenuItemsaddParentItem().setText("New");

		DynamicGridRow blankRow = form.dyngrdStatus().getRows().newRow();
		DynamicGridCell cell = blankRow.getCells().newCell(form.dyngrdStatus().getColumns().get(0), DynamicCellType.LABEL);
		cell.setValue("Referral Status Links");

		//form.dyngrdStatus().setHeaderMaxHeight(10);
		//form.dyngrdStatus().setHeaderValue("Referral Status Links");
		
		
		
		
		
		blankRow.setBackColor(Color.Beige);
		blankRow.setSelectable(false);
		blankRow.setBold(true);
	
	}

	private void populateScreenFromData()
	{
		form.dyngrdStatus().clear();
		createGrid();
		ReferralStatusConfigVoCollection coll;
		if (form.getLocalContext().getreferralStatusCollIsNotNull())
		{
			coll = form.getLocalContext().getreferralStatusColl();
			for (int i = 0; i < coll.size(); i++)
			{
				ReferralStatusConfigVo parentRefStatus = coll.get(i);
				populateLink(parentRefStatus);
			}
		}
	}

	private void populateLink(ReferralStatusConfigVo parentRefStatus)
	{
		DynamicGridRow row = createParent(parentRefStatus.getReferralStatus());
		createChildren(row, parentRefStatus.getLinkedReferralStatus());
	}

	private DynamicGridRow createParent(ReferralApptStatus referralStatus)
	{
		ReferralApptStatusCollection refStatusColl = getStatusList();
		refStatusColl.sort();
		ReferralApptStatusCollection refColl = form.getLocalContext().getusedParents();

		if (refColl != null)
		{
			refColl.sort();

			for (int j = 0; j < refColl.size(); j++)
			{
				if (refStatusColl.contains(refColl.get(j)))
				{
					refStatusColl.remove(refColl.get(j));
				}
			}
		}
		refStatusColl.add(referralStatus);
		refStatusColl.sort();
		DynamicGridRow row = form.dyngrdStatus().getRows().newRow();
		DynamicGridCell cell = row.getCells().newCell(form.dyngrdStatus().getColumns().get(0), DynamicCellType.ENUMERATION);
		row.setExpanded(true);
		populateCell(refStatusColl, cell, row);
		cell.setIdentifier(referralStatus.getIItemText());
		cell.setValue(referralStatus);
		row.setValue(referralStatus);

		return row;
	}

	private void createChildren(DynamicGridRow row, ReferralApptStatusCollection linkedReferralStatus)
	{
		ReferralApptStatusCollection refStatusColl = getStatusList();
		refStatusColl.sort();

		if (linkedReferralStatus != null)
		{
			linkedReferralStatus.sort();

			for (int j = 0; j < linkedReferralStatus.size(); j++)
			{
				if (refStatusColl.contains(linkedReferralStatus.get(j)))
				{
					refStatusColl.remove(linkedReferralStatus.get(j));
				}
			}
		
			for (int i = 0; i < linkedReferralStatus.size(); i++)
			{
				DynamicGridRow childrow = row.getRows().newRow();

				refStatusColl.remove((ReferralApptStatus) row.getValue());
				refStatusColl.add(linkedReferralStatus.get(i));
				refStatusColl.sort();
				
				DynamicGridCell cell = childrow.getCells().newCell(form.dyngrdStatus().getColumns().get(0), DynamicCellType.ENUMERATION);
				populateCell(refStatusColl, cell, row);
				cell.setIdentifier(linkedReferralStatus.get(i).getIItemText());
				cell.setValue(linkedReferralStatus.get(i));
				childrow.setCollapsedImage(form.getImages().Core.Link);
				childrow.setValue(linkedReferralStatus.get(i));

			}
		}

	}

	private ReferralApptStatusCollection getStatusList()
	{
		ReferralApptStatusCollection statusColl = LookupHelper.getReferralApptStatus(domain.getLookupService());
		return statusColl;

	}

	private void open()
	{
		ReferralStatusConfigVoCollection referralStatusColl = domain.getReferralStatus();

		if (referralStatusColl != null)
		{
			form.getLocalContext().setreferralStatusColl(referralStatusColl);
		}

		form.getContextMenus().Admin.hideAllTreeMenuItemsMenuItems();
		form.setMode(FormMode.VIEW);

	}

	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateScreenFromData();
		form.getLocalContext().setusedParents(getAllParentNodes());
		form.setMode(FormMode.VIEW);
	}

	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		ReferralStatusConfigVoCollection referralStatusConfigColl = new ReferralStatusConfigVoCollection();
		
		
		String[] errors = null;
		ReferralStatusConfigVo referStatusConfig = null;
		ReferralApptStatusCollection referStatusColl = null;
		DynamicGridColumn column = form.dyngrdStatus().getColumns().get(0);
		DynamicGridCell[] cellArray = column.getCellArray();
		for (int i = 1; i < cellArray.length; i++)
		{
			if (cellArray[i].getValue() != null)
			{
				if (cellArray[i].getRow().getParent() == null)
				{
					if (cellArray[i].getValue() instanceof ReferralApptStatus)
					{

						referStatusConfig = new ReferralStatusConfigVo();
						referStatusConfig.setReferralStatus((ReferralApptStatus) cellArray[i].getValue());
						DynamicGridRowCollection children = cellArray[i].getRow().getRows();
						referStatusColl = new ReferralApptStatusCollection();
						for (int j = 0; j < children.size(); j++)
						{
							DynamicGridCell[] childCells = children.get(j).getCellArray();
							for (int k = 0; k < childCells.length; k++)
							{
								if (cellArray[i].getValue() instanceof ReferralApptStatus)
								{
									if (childCells[k].getValue() != null)
										referStatusColl.add((ReferralApptStatus) childCells[k].getValue());
								}
							}
							referStatusConfig.setLinkedReferralStatus(referStatusColl);
						}
					}
					referralStatusConfigColl.add(referStatusConfig);
				}
			}

		}

		String[] error = referralStatusConfigColl.validate(errors);

		if (error != null)
		{
			engine.showErrors(error);
			return;

		}
		try
		{

			domain.saveReferralStatusConfig(referralStatusConfigColl);
			form.getLocalContext().setreferralStatusColl(referralStatusConfigColl);
			form.getLocalContext().setusedParents(getAllParentNodes());

		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage("An error has occured while saving this link " + e.getMessage());
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return;
		}
		catch (ForeignKeyViolationException e)
		{
			engine.showMessage("An error has occured while saving this link " + e.getMessage());
		}

		form.dyngrdStatus().setSelectedRow(null);
		form.setMode(FormMode.VIEW);
		populateScreenFromData();
	}

	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		form.dyngrdStatus().setSelectable(true);
	}

	private void createNewParent()
	{
		ReferralApptStatusCollection refStatusColl = getStatusList();
		refStatusColl.sort();
		ReferralApptStatusCollection refColl = form.getLocalContext().getusedParents();
		refColl.sort();
		for (int j = 0; j < refColl.size(); j++)
		{
			if (refStatusColl.contains(refColl.get(j)))
			{
				refStatusColl.remove(refColl.get(j));
			}
		}
		DynamicGridRow row = form.dyngrdStatus().getRows().newRow();
		DynamicGridCell cell = row.getCells().newCell(form.dyngrdStatus().getColumns().get(0), DynamicCellType.ENUMERATION);
		row.setExpanded(true);
		populateCell(refStatusColl, cell, row);
		form.dyngrdStatus().setSelectedRow(row);
	}

	private void populateCell(ReferralApptStatusCollection refStatusColl, DynamicGridCell cell, DynamicGridRow row)
	{
		cell.getItems().clear();
		for (int i = 0; i < refStatusColl.size(); i++)
		{
			DynamicGridCellItem item = cell.getItems().newItem(refStatusColl.get(i));
			item.setIdentifier(refStatusColl.get(i).getIItemText());
			item.setValue(refStatusColl.get(i));
		}
	}

	private ReferralApptStatusCollection getAllParentNodes()
	{
		DynamicGridColumn column = form.dyngrdStatus().getColumns().get(0);
		DynamicGridCell[] cellArray = column.getCellArray();
		ReferralApptStatusCollection refAppStatus = new ReferralApptStatusCollection();
		for (int i = 1; i < cellArray.length; i++)
		{
			if (cellArray[i].getRow().getParent() == null)
			{
				refAppStatus.add((ReferralApptStatus) cellArray[i].getValue());
			}
		}
		return refAppStatus;
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{

		if (sender.equals(form.dyngrdStatus()))
		{
			switch (menuItemID)
			{
				case ims.admin.forms.referralstatusadmin.GenForm.ContextMenus.AdminNamespace.TreeMenuItems.addChild :
					DynamicGridColumn col = form.dyngrdStatus().getColumns().get(0);
					createNewChild(form.dyngrdStatus().getSelectedRow().getCells().get(col).getValue(),form.dyngrdStatus().getSelectedRow());

				break;

				case ims.admin.forms.referralstatusadmin.GenForm.ContextMenus.AdminNamespace.TreeMenuItems.removeChild :

					if (form.dyngrdStatus().getSelectedRow().getParent() == null)
						form.getLocalContext().getusedParents().remove((ReferralApptStatus) form.dyngrdStatus().getSelectedRow().getValue());

					form.dyngrdStatus().getRows().remove(form.dyngrdStatus().getSelectedRow());
					if (form.dyngrdStatus().getRows().size() == 1)
					{
						form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setVisible(false);
						form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setVisible(false);
					}

					if (form.dyngrdStatus().getSelectedRow() == null)
					{
						form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setVisible(false);
						form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setVisible(false);
						form.getContextMenus().Admin.getTreeMenuItemsaddParentItem().setVisible(true);

					}

				break;

				case ims.admin.forms.referralstatusadmin.GenForm.ContextMenus.AdminNamespace.TreeMenuItems.addParent :

					createNewParent();

				break;

				default :
			}
		}

	}

	private void createNewChild(Object object, DynamicGridRow selectedRow)
	{
		ReferralApptStatusCollection refAppStatusColl = getStatusList();
		ReferralApptStatusCollection usedrefAppStatusColl = getChildNodes(selectedRow);
		for (int i = 0; i < usedrefAppStatusColl.size(); i++)
		{
			if (refAppStatusColl.contains(usedrefAppStatusColl.get(i)))
			{
				refAppStatusColl.remove(usedrefAppStatusColl.get(i));
			}
		}

		if (object instanceof ReferralApptStatus)
		{

			refAppStatusColl.remove((ReferralApptStatus)object);

		}
		else if( selectedRow.getParent() != null)
		{
			
			refAppStatusColl.remove((ReferralApptStatus)object);
		}
		
		
		
		DynamicGridRow row = selectedRow.getRows().newRow();
		row.setCollapsedImage(form.getImages().Core.Link);
		DynamicGridCell cell = row.getCells().newCell(form.dyngrdStatus().getColumns().get(0), DynamicCellType.ENUMERATION);
		populateCell(refAppStatusColl, cell, row);

		
		
		
	}

	private ReferralApptStatusCollection getChildNodes(DynamicGridRow selectedRow)
	{
		ReferralApptStatusCollection refColl = new ReferralApptStatusCollection();
		DynamicGridColumn col = form.dyngrdStatus().getColumns().get(0);
		DynamicGridCell[] cells = col.getCellArray();
		DynamicGridRowCollection rows = selectedRow.getRows();
		
					for (int i = 0; i <rows.size(); i++)
					{
						refColl.add((ReferralApptStatus) rows.get(i).getCells().get(col).getValue());
					}
		return refColl;
	}

	@Override
	protected void onStatusGridRowSelectionChanged(DynamicGridRow row)
	{

		if (form.getMode().equals(FormMode.EDIT))
		{
			if (form.dyngrdStatus().getSelectedRow().getParent() == null && form.dyngrdStatus().getSelectedRow().getValue() != null && form.dyngrdStatus().getSelectedRow().getRows().size() > 0)
			{
				form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setVisible(true);
				form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setVisible(true);

			}
			else if (form.dyngrdStatus().getSelectedRow().getParent() != null)
			{
				form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setVisible(false);
				form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setVisible(true);
			}
			else if (form.dyngrdStatus().getSelectedRow().getRows().size() == 0)
			{
				form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setVisible(true);
				form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setVisible(true);
			}
			else
			{
				form.getContextMenus().Admin.getTreeMenuItemsremoveChildItem().setVisible(true);
				form.getContextMenus().Admin.getTreeMenuItemsaddChildItem().setVisible(true);
			}
		}
		else
		{
			form.getContextMenus().Admin.hideAllTreeMenuItemsMenuItems();

		}

	}

	@Override
	protected void onCellValueChanged(DynamicGridCell cell)
	{

		if(form.dyngrdStatus().getSelectedRow() != null)  //wdev-15678
		{
			form.dyngrdStatus().getSelectedRow().setValue(cell.getValue());
	
			if (form.dyngrdStatus().getSelectedRow().getParent() == null)
				form.getLocalContext().getusedParents().add((ReferralApptStatus) form.dyngrdStatus().getSelectedRow().getValue());
		}		
		
		form.getLocalContext().getusedParents();

	}

	@Override
	protected void onFormModeChanged()
	{

		if (form.getMode().equals(FormMode.VIEW))
		{

			form.getContextMenus().Admin.hideAllTreeMenuItemsMenuItems();

		}

		if (form.getMode().equals(FormMode.EDIT))
		{

			form.getContextMenus().Admin.getTreeMenuItemsaddParentItem().setVisible(true);
			form.getContextMenus().Admin.getTreeMenuItemsremoveParentItem().setVisible(false);

		}

	}
}
