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

package ims.pathways.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class JourneyStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public JourneyStatus()
	{
		super();
	}
	public JourneyStatus(int id)
	{
		super(id, "", true);
	}
	public JourneyStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public JourneyStatus(int id, String text, boolean active, JourneyStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public JourneyStatus(int id, String text, boolean active, JourneyStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public JourneyStatus(int id, String text, boolean active, JourneyStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static JourneyStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new JourneyStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (JourneyStatus)super.getParentInstance();
	}
	public JourneyStatus getParent()
	{
		return (JourneyStatus)super.getParentInstance();
	}
	public void setParent(JourneyStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		JourneyStatus[] typedChildren = new JourneyStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (JourneyStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof JourneyStatus)
		{
			super.addChild((JourneyStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof JourneyStatus)
		{
			super.removeChild((JourneyStatus)child);
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
		JourneyStatusCollection result = new JourneyStatusCollection();
		result.add(STARTCLOCK);
		result.add(STOPCLOCK);
		result.add(UNDOSTOPCLOCK);
		result.add(ENDPATHWAYJOURNEY);
		result.add(PAUSE);
		result.add(UNPAUSE);
		return result;
	}
	public static JourneyStatus[] getNegativeInstances()
	{
		JourneyStatus[] instances = new JourneyStatus[6];
		instances[0] = STARTCLOCK;
		instances[1] = STOPCLOCK;
		instances[2] = UNDOSTOPCLOCK;
		instances[3] = ENDPATHWAYJOURNEY;
		instances[4] = PAUSE;
		instances[5] = UNPAUSE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[6];
		negativeInstances[0] = "STARTCLOCK";
		negativeInstances[1] = "STOPCLOCK";
		negativeInstances[2] = "UNDOSTOPCLOCK";
		negativeInstances[3] = "ENDPATHWAYJOURNEY";
		negativeInstances[4] = "PAUSE";
		negativeInstances[5] = "UNPAUSE";
		return negativeInstances;
	}
	public static JourneyStatus getNegativeInstance(String name)
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
	public static JourneyStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		JourneyStatus[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1321005;
	public static final JourneyStatus STARTCLOCK = new JourneyStatus(-1313, "Start Clock", true, null, null, Color.Default);
	public static final JourneyStatus STOPCLOCK = new JourneyStatus(-1314, "Stop Clock", true, null, null, Color.Default);
	public static final JourneyStatus UNDOSTOPCLOCK = new JourneyStatus(-1315, " Undo Stop Clock", true, null, null, Color.Default);
	public static final JourneyStatus ENDPATHWAYJOURNEY = new JourneyStatus(-1316, "End Pathway Journey", true, null, null, Color.Default);
	public static final JourneyStatus PAUSE = new JourneyStatus(-1629, "Journey Paused", true, null, null, Color.Default);
	public static final JourneyStatus UNPAUSE = new JourneyStatus(-1630, "Journey Unpaused", true, null, null, Color.Default);
}
