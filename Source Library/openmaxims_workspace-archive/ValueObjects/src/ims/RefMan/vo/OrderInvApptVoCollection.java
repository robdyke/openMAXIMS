// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to RefMan.OrderInvAppt business object (ID: 1096100009).
 */
public class OrderInvApptVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<OrderInvApptVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<OrderInvApptVo> col = new ArrayList<OrderInvApptVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.OrderInvAppt";
	}
	public boolean add(OrderInvApptVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, OrderInvApptVo value)
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
	public int indexOf(OrderInvApptVo instance)
	{
		return col.indexOf(instance);
	}
	public OrderInvApptVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, OrderInvApptVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(OrderInvApptVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(OrderInvApptVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		OrderInvApptVoCollection clone = new OrderInvApptVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((OrderInvApptVo)this.col.get(x).clone());
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
	public OrderInvApptVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public OrderInvApptVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public OrderInvApptVoCollection sort(SortOrder order)
	{
		return sort(new OrderInvApptVoComparator(order));
	}
	public OrderInvApptVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new OrderInvApptVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public OrderInvApptVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.OrderInvApptRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.OrderInvApptRefVoCollection result = new ims.RefMan.vo.OrderInvApptRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public OrderInvApptVo[] toArray()
	{
		OrderInvApptVo[] arr = new OrderInvApptVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<OrderInvApptVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class OrderInvApptVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public OrderInvApptVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public OrderInvApptVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public OrderInvApptVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			OrderInvApptVo voObj1 = (OrderInvApptVo)obj1;
			OrderInvApptVo voObj2 = (OrderInvApptVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.OrderInvApptVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.OrderInvApptVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.OrderInvApptVoBean[] result = new ims.RefMan.vo.beans.OrderInvApptVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			OrderInvApptVo vo = ((OrderInvApptVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.OrderInvApptVoBean)vo.getBean();
		}
		return result;
	}
	public static OrderInvApptVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		OrderInvApptVoCollection coll = new OrderInvApptVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.OrderInvApptVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static OrderInvApptVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.OrderInvApptVoBean[] beans)
	{
		OrderInvApptVoCollection coll = new OrderInvApptVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}