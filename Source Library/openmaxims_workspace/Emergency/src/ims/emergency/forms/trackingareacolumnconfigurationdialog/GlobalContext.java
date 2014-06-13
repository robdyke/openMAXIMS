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

package ims.emergency.forms.trackingareacolumnconfigurationdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Emergency = new EmergencyContext(context);
	}
	public final class EmergencyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private EmergencyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getTrackingAreaColumnsIsNotNull()
		{
			return !cx_EmergencyTrackingAreaColumns.getValueIsNull(context);
		}
		public ims.emergency.vo.ColumnDetailVoCollection getTrackingAreaColumns()
		{
			return (ims.emergency.vo.ColumnDetailVoCollection)cx_EmergencyTrackingAreaColumns.getValue(context);
		}
		public void setTrackingAreaColumns(ims.emergency.vo.ColumnDetailVoCollection value)
		{
			cx_EmergencyTrackingAreaColumns.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyTrackingAreaColumns = new ims.framework.ContextVariable("Emergency.TrackingAreaColumns", "_cv_Emergency.TrackingAreaColumns");
		public boolean getAreaColumnIsNotNull()
		{
			return !cx_EmergencyAreaColumn.getValueIsNull(context);
		}
		public ims.emergency.vo.ColumnDetailVo getAreaColumn()
		{
			return (ims.emergency.vo.ColumnDetailVo)cx_EmergencyAreaColumn.getValue(context);
		}
		public void setAreaColumn(ims.emergency.vo.ColumnDetailVo value)
		{
			cx_EmergencyAreaColumn.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyAreaColumn = new ims.framework.ContextVariable("Emergency.AreaColumn", "_cv_Emergency.AreaColumn");
		public boolean getTrackingAreaWorkspaceIsNotNull()
		{
			return !cx_EmergencyTrackingAreaWorkspace.getValueIsNull(context);
		}
		public ims.emergency.vo.TrackingAreaVo getTrackingAreaWorkspace()
		{
			return (ims.emergency.vo.TrackingAreaVo)cx_EmergencyTrackingAreaWorkspace.getValue(context);
		}
		public void setTrackingAreaWorkspace(ims.emergency.vo.TrackingAreaVo value)
		{
			cx_EmergencyTrackingAreaWorkspace.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyTrackingAreaWorkspace = new ims.framework.ContextVariable("Emergency.TrackingAreaWorkspace", "_cv_Emergency.TrackingAreaWorkspace");

		private ims.framework.Context context;
	}

	public EmergencyContext Emergency;
}