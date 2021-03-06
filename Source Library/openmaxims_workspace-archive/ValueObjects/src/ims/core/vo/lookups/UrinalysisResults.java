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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class UrinalysisResults extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public UrinalysisResults()
	{
		super();
	}
	public UrinalysisResults(int id)
	{
		super(id, "", true);
	}
	public UrinalysisResults(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public UrinalysisResults(int id, String text, boolean active, UrinalysisResults parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public UrinalysisResults(int id, String text, boolean active, UrinalysisResults parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public UrinalysisResults(int id, String text, boolean active, UrinalysisResults parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static UrinalysisResults buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new UrinalysisResults(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (UrinalysisResults)super.getParentInstance();
	}
	public UrinalysisResults getParent()
	{
		return (UrinalysisResults)super.getParentInstance();
	}
	public void setParent(UrinalysisResults parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		UrinalysisResults[] typedChildren = new UrinalysisResults[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (UrinalysisResults)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof UrinalysisResults)
		{
			super.addChild((UrinalysisResults)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof UrinalysisResults)
		{
			super.removeChild((UrinalysisResults)child);
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
		UrinalysisResultsCollection result = new UrinalysisResultsCollection();
		result.add(NEGATIVE);
		result.add(TRACE);
		result.add(PLUSONE);
		result.add(PLUSTWO);
		result.add(PLUSTHREE);
		result.add(PLUSFOUR);
		return result;
	}
	public static UrinalysisResults[] getNegativeInstances()
	{
		UrinalysisResults[] instances = new UrinalysisResults[6];
		instances[0] = NEGATIVE;
		instances[1] = TRACE;
		instances[2] = PLUSONE;
		instances[3] = PLUSTWO;
		instances[4] = PLUSTHREE;
		instances[5] = PLUSFOUR;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[6];
		negativeInstances[0] = "NEGATIVE";
		negativeInstances[1] = "TRACE";
		negativeInstances[2] = "PLUSONE";
		negativeInstances[3] = "PLUSTWO";
		negativeInstances[4] = "PLUSTHREE";
		negativeInstances[5] = "PLUSFOUR";
		return negativeInstances;
	}
	public static UrinalysisResults getNegativeInstance(String name)
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
	public static UrinalysisResults getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		UrinalysisResults[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021062;
	public static final UrinalysisResults NEGATIVE = new UrinalysisResults(-72, "Negative", true, null, null, Color.Black);
	public static final UrinalysisResults TRACE = new UrinalysisResults(-73, "Trace", true, null, null, Color.Black);
	public static final UrinalysisResults PLUSONE = new UrinalysisResults(-74, "PlusOne", true, null, null, Color.Black);
	public static final UrinalysisResults PLUSTWO = new UrinalysisResults(-75, "PlusTwo", true, null, null, Color.Black);
	public static final UrinalysisResults PLUSTHREE = new UrinalysisResults(-76, "PlusThree", true, null, null, Color.Black);
	public static final UrinalysisResults PLUSFOUR = new UrinalysisResults(-77, "PlusFour", true, null, null, Color.Black);
}
