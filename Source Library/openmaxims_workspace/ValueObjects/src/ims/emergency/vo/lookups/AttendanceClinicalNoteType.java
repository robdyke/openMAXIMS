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

package ims.emergency.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AttendanceClinicalNoteType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AttendanceClinicalNoteType()
	{
		super();
	}
	public AttendanceClinicalNoteType(int id)
	{
		super(id, "", true);
	}
	public AttendanceClinicalNoteType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AttendanceClinicalNoteType(int id, String text, boolean active, AttendanceClinicalNoteType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AttendanceClinicalNoteType(int id, String text, boolean active, AttendanceClinicalNoteType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AttendanceClinicalNoteType(int id, String text, boolean active, AttendanceClinicalNoteType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AttendanceClinicalNoteType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AttendanceClinicalNoteType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AttendanceClinicalNoteType)super.getParentInstance();
	}
	public AttendanceClinicalNoteType getParent()
	{
		return (AttendanceClinicalNoteType)super.getParentInstance();
	}
	public void setParent(AttendanceClinicalNoteType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AttendanceClinicalNoteType[] typedChildren = new AttendanceClinicalNoteType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AttendanceClinicalNoteType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AttendanceClinicalNoteType)
		{
			super.addChild((AttendanceClinicalNoteType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AttendanceClinicalNoteType)
		{
			super.removeChild((AttendanceClinicalNoteType)child);
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
		AttendanceClinicalNoteTypeCollection result = new AttendanceClinicalNoteTypeCollection();
		result.add(TRIAGE);
		result.add(MEDIC);
		result.add(REFERRAL_TO_SPECIALTY);
		result.add(ALLOCATION);
		result.add(NURSE);
		result.add(INVESTIGATION);
		result.add(TREATMENT);
		result.add(WHITEBOARD_COMMENT);
		result.add(HPC);
		return result;
	}
	public static AttendanceClinicalNoteType[] getNegativeInstances()
	{
		AttendanceClinicalNoteType[] instances = new AttendanceClinicalNoteType[9];
		instances[0] = TRIAGE;
		instances[1] = MEDIC;
		instances[2] = REFERRAL_TO_SPECIALTY;
		instances[3] = ALLOCATION;
		instances[4] = NURSE;
		instances[5] = INVESTIGATION;
		instances[6] = TREATMENT;
		instances[7] = WHITEBOARD_COMMENT;
		instances[8] = HPC;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[9];
		negativeInstances[0] = "TRIAGE";
		negativeInstances[1] = "MEDIC";
		negativeInstances[2] = "REFERRAL_TO_SPECIALTY";
		negativeInstances[3] = "ALLOCATION";
		negativeInstances[4] = "NURSE";
		negativeInstances[5] = "INVESTIGATION";
		negativeInstances[6] = "TREATMENT";
		negativeInstances[7] = "WHITEBOARD_COMMENT";
		negativeInstances[8] = "HPC";
		return negativeInstances;
	}
	public static AttendanceClinicalNoteType getNegativeInstance(String name)
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
	public static AttendanceClinicalNoteType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AttendanceClinicalNoteType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1291045;
	public static final AttendanceClinicalNoteType TRIAGE = new AttendanceClinicalNoteType(-2519, "Triage", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType MEDIC = new AttendanceClinicalNoteType(-2520, "Medic", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType REFERRAL_TO_SPECIALTY = new AttendanceClinicalNoteType(-2521, "Referral To Specialty", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType ALLOCATION = new AttendanceClinicalNoteType(-2522, "Allocation", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType NURSE = new AttendanceClinicalNoteType(-2565, "Nurse", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType INVESTIGATION = new AttendanceClinicalNoteType(-2806, "Investigation Clinical Interpretation", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType TREATMENT = new AttendanceClinicalNoteType(-2807, "Treatment Note", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType WHITEBOARD_COMMENT = new AttendanceClinicalNoteType(-2851, "WhiteBoard Comment", true, null, null, Color.Default);
	public static final AttendanceClinicalNoteType HPC = new AttendanceClinicalNoteType(-3121, "History of Presenting Condition", true, null, null, Color.Default);
}
