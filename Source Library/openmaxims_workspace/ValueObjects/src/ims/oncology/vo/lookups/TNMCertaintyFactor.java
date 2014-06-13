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

package ims.oncology.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class TNMCertaintyFactor extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public TNMCertaintyFactor()
	{
		super();
	}
	public TNMCertaintyFactor(int id)
	{
		super(id, "", true);
	}
	public TNMCertaintyFactor(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public TNMCertaintyFactor(int id, String text, boolean active, TNMCertaintyFactor parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public TNMCertaintyFactor(int id, String text, boolean active, TNMCertaintyFactor parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public TNMCertaintyFactor(int id, String text, boolean active, TNMCertaintyFactor parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static TNMCertaintyFactor buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new TNMCertaintyFactor(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (TNMCertaintyFactor)super.getParentInstance();
	}
	public TNMCertaintyFactor getParent()
	{
		return (TNMCertaintyFactor)super.getParentInstance();
	}
	public void setParent(TNMCertaintyFactor parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		TNMCertaintyFactor[] typedChildren = new TNMCertaintyFactor[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (TNMCertaintyFactor)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof TNMCertaintyFactor)
		{
			super.addChild((TNMCertaintyFactor)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof TNMCertaintyFactor)
		{
			super.removeChild((TNMCertaintyFactor)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		TNMCertaintyFactorCollection result = new TNMCertaintyFactorCollection();
		result.add(CLINICAL);
		result.add(PATHOLOGICAL);
		result.add(RADIOLOGICAL);
		return result;
	}
	public static TNMCertaintyFactor[] getNegativeInstances()
	{
		TNMCertaintyFactor[] instances = new TNMCertaintyFactor[3];
		instances[0] = CLINICAL;
		instances[1] = PATHOLOGICAL;
		instances[2] = RADIOLOGICAL;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "CLINICAL";
		negativeInstances[1] = "PATHOLOGICAL";
		negativeInstances[2] = "RADIOLOGICAL";
		return negativeInstances;
	}
	public static TNMCertaintyFactor getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static TNMCertaintyFactor getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		TNMCertaintyFactor[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1251035;
	public static final TNMCertaintyFactor CLINICAL = new TNMCertaintyFactor(-1972, "Clinical", true, null, null, Color.Default);
	public static final TNMCertaintyFactor PATHOLOGICAL = new TNMCertaintyFactor(-1973, "Pathological", true, null, null, Color.Default);
	public static final TNMCertaintyFactor RADIOLOGICAL = new TNMCertaintyFactor(-1974, "Radiological", true, null, null, Color.Default);
}