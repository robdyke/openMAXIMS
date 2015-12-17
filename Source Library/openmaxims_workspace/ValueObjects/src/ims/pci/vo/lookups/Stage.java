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

package ims.pci.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class Stage extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public Stage()
	{
		super();
	}
	public Stage(int id)
	{
		super(id, "", true);
	}
	public Stage(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public Stage(int id, String text, boolean active, Stage parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public Stage(int id, String text, boolean active, Stage parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public Stage(int id, String text, boolean active, Stage parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static Stage buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new Stage(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (Stage)super.getParentInstance();
	}
	public Stage getParent()
	{
		return (Stage)super.getParentInstance();
	}
	public void setParent(Stage parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		Stage[] typedChildren = new Stage[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (Stage)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof Stage)
		{
			super.addChild((Stage)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof Stage)
		{
			super.removeChild((Stage)child);
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
		StageCollection result = new StageCollection();
		result.add(BIRTH);
		result.add(STAGE1);
		result.add(STAGE2);
		result.add(STAGE3);
		result.add(STAGE4);
		result.add(STAGE5);
		return result;
	}
	public static Stage[] getNegativeInstances()
	{
		Stage[] instances = new Stage[6];
		instances[0] = BIRTH;
		instances[1] = STAGE1;
		instances[2] = STAGE2;
		instances[3] = STAGE3;
		instances[4] = STAGE4;
		instances[5] = STAGE5;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[6];
		negativeInstances[0] = "BIRTH";
		negativeInstances[1] = "STAGE1";
		negativeInstances[2] = "STAGE2";
		negativeInstances[3] = "STAGE3";
		negativeInstances[4] = "STAGE4";
		negativeInstances[5] = "STAGE5";
		return negativeInstances;
	}
	public static Stage getNegativeInstance(String name)
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
	public static Stage getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		Stage[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1331004;
	public static final Stage BIRTH = new Stage(-1412, "Birth", true, null, null, Color.Default);
	public static final Stage STAGE1 = new Stage(-1413, "Stage 1", true, null, null, Color.Default);
	public static final Stage STAGE2 = new Stage(-1414, "Stage 2", true, null, null, Color.Default);
	public static final Stage STAGE3 = new Stage(-1415, "Stage 3", true, null, null, Color.Default);
	public static final Stage STAGE4 = new Stage(-1416, "Stage 4", true, null, null, Color.Default);
	public static final Stage STAGE5 = new Stage(-1417, "Stage 5", true, null, null, Color.Default);
}