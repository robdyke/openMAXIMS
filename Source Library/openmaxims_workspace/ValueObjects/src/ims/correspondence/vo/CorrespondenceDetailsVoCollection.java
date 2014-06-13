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

package ims.correspondence.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to correspondence.CorrespondenceDetails business object (ID: 1052100001).
 */
public class CorrespondenceDetailsVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<CorrespondenceDetailsVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<CorrespondenceDetailsVo> col = new ArrayList<CorrespondenceDetailsVo>();
	public String getBoClassName()
	{
		return "ims.correspondence.domain.objects.CorrespondenceDetails";
	}
	public boolean add(CorrespondenceDetailsVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, CorrespondenceDetailsVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(CorrespondenceDetailsVo instance)
	{
		return col.indexOf(instance);
	}
	public CorrespondenceDetailsVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, CorrespondenceDetailsVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(CorrespondenceDetailsVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(CorrespondenceDetailsVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		CorrespondenceDetailsVoCollection clone = new CorrespondenceDetailsVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((CorrespondenceDetailsVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public CorrespondenceDetailsVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public CorrespondenceDetailsVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public CorrespondenceDetailsVoCollection sort(SortOrder order)
	{
		return sort(new CorrespondenceDetailsVoComparator(order));
	}
	public CorrespondenceDetailsVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new CorrespondenceDetailsVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public CorrespondenceDetailsVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.correspondence.vo.CorrespondenceDetailsRefVoCollection toRefVoCollection()
	{
		ims.correspondence.vo.CorrespondenceDetailsRefVoCollection result = new ims.correspondence.vo.CorrespondenceDetailsRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public CorrespondenceDetailsVo[] toArray()
	{
		CorrespondenceDetailsVo[] arr = new CorrespondenceDetailsVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<CorrespondenceDetailsVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class CorrespondenceDetailsVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public CorrespondenceDetailsVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public CorrespondenceDetailsVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public CorrespondenceDetailsVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			CorrespondenceDetailsVo voObj1 = (CorrespondenceDetailsVo)obj1;
			CorrespondenceDetailsVo voObj2 = (CorrespondenceDetailsVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.correspondence.vo.beans.CorrespondenceDetailsVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.correspondence.vo.beans.CorrespondenceDetailsVoBean[] getBeanCollectionArray()
	{
		ims.correspondence.vo.beans.CorrespondenceDetailsVoBean[] result = new ims.correspondence.vo.beans.CorrespondenceDetailsVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			CorrespondenceDetailsVo vo = ((CorrespondenceDetailsVo)col.get(i));
			result[i] = (ims.correspondence.vo.beans.CorrespondenceDetailsVoBean)vo.getBean();
		}
		return result;
	}
	public static CorrespondenceDetailsVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		CorrespondenceDetailsVoCollection coll = new CorrespondenceDetailsVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.correspondence.vo.beans.CorrespondenceDetailsVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static CorrespondenceDetailsVoCollection buildFromBeanCollection(ims.correspondence.vo.beans.CorrespondenceDetailsVoBean[] beans)
	{
		CorrespondenceDetailsVoCollection coll = new CorrespondenceDetailsVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}