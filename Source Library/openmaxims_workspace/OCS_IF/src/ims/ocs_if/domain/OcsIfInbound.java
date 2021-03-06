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

package ims.ocs_if.domain;

// Generated from form domain impl
public interface OcsIfInbound extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public void savePathResult(ims.ocs_if.vo.IfOrderSpecimenVo specimenVo, String placerNum, String fillerNum, String hl7App, Boolean statusChecked, ims.ocs_if.vo.IfResultDetailsVoCollection historicResultDetails, ims.ocs_if.vo.IfOrderInvestigationVo orderInvestigation) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public ims.ocs_if.vo.IfOcsOrderVo getOrder(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo ocsOrder) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.ocs_if.vo.IfAnalyteVo getAnalyte(String extCode, String extTxt, ims.ocs_if.vo.IfProviderInvSearchVo providerInvSearch, ims.ocrr.vo.lookups.ResultUnitOfMeasure unitOfMeasure, Boolean doAnalyteCheck) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Gets order by either placer order number or filler order number.  If placer order number is not null, we placed it, so the order should exist.  Otherwise, it will check to see if it exists by filler order number
	*/
	public ims.ocs_if.vo.IfOcsOrderVo getOrderByPlacerOrFiller(String placerOrdNum, String fillerOrdNum, ims.ocrr.vo.lookups.Category category) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* Saves the given order
	*/
	public ims.ocs_if.vo.IfOcsOrderVo saveOrder(ims.ocs_if.vo.IfOcsOrderVo order) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Gets the investigation based on the provider system and inv code supplied
	*/
	public ims.ocs_if.vo.IfInvestigationLiteVo getInvestigationByHl7AppInvAndService(ims.ocs_if.vo.IfProviderInvSearchVo searchCriteria);

	// Generated from form domain interface definition
	public void saveRadResult(ims.ocs_if.vo.IfOrdInvResultVo ordInvResultVo, String placerNum, String fillerNum, String hl7App) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Returns a service for the given external code and taxonomy type
	*/
	public ims.core.vo.ServiceShortVo getServiceByTaxonomy(String externalCode, ims.core.vo.lookups.TaxonomyType taxonomy);

	// Generated from form domain interface definition
	public ims.ocs_if.vo.IfOrderSpecimenVo getSpecimenByPlacerOrFiller(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo order, String placerNum, String fillerNum, ims.ocs_if.vo.IfOrderInvestigationVo orderInv);

	// Generated from form domain interface definition
	public ims.ocs_if.vo.IfOrderInvestigationVo getOrderInvestigation(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo order, ims.ocs_if.vo.IfInvestigationLiteVo investigation, ims.ocrr.vo.lookups.SpecimenSite specimenSite, ims.ocrr.orderingresults.vo.OrderSpecimenRefVo orderSpecimen, String placerNum, String fillerNum);

	// Generated from form domain interface definition
	/**
	* Lists all services that have an AlternateServiceCode matching the given parameter
	*/
	public ims.core.vo.ServiceShortVoCollection listServicesWithAlternateCode(String alternateCode);

	// Generated from form domain interface definition
	public void updateInvestigationStatus(ims.ocrr.orderingresults.vo.OrderInvestigationRefVo invRef, ims.ocs_if.vo.IfOrderInvCurrentStatusVo newStatus) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.ocs_if.vo.IfOrderInvestigationVo saveOrderInvestigation(ims.ocs_if.vo.IfOrderInvestigationVo ordInv) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* If the save is the result of a change investigation message we need to handle the Status history differently by adding it to the XOChange history as well.
	*/
	public ims.ocs_if.vo.IfOrderInvestigationVo saveOrderInvestigation(ims.ocs_if.vo.IfOrderInvestigationVo ordInv, Boolean isChangeInv, ims.core.admin.vo.ProviderSystemRefVo providerSystem) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void saveOrderSpecimen(ims.ocs_if.vo.IfOrderSpecimenVo ordSpec) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.ocs_if.vo.IfLocParentVo getLocParentByTaxType(String extId, ims.core.vo.lookups.TaxonomyType taxType);

	// Generated from form domain interface definition
	/**
	* Save Location
	*/
	public void saveLocation(ims.ocs_if.vo.IfLocParentVo location) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Saves the order as provided to the parameter and does not update any investigation or specimen information
	*/
	public ims.ocs_if.vo.IfOcsOrderVo saveOrderLevelItems(ims.ocs_if.vo.IfOcsOrderShortVo order) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Update all the specimen's investigations date and time to the value collection date time filler from the specimen"
	*/
	public ims.ocs_if.vo.IfOrderSpecimenVo updateInvDisplayDateTime(ims.ocs_if.vo.IfOrderSpecimenVo specimen) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* wdev-2748 Will update non-resultable investigations to accepted if they are currently at sent
	*/
	public ims.ocs_if.vo.IfOrderSpecimenVo updateNonResultableInvestigations(ims.ocrr.orderingresults.vo.OrderSpecimenRefVo specimen) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* get the Order from an Investigation
	*/
	public ims.ocs_if.vo.IfOutOcsOrderVo getOrderFromInv(ims.ocrr.orderingresults.vo.OrderInvestigationRefVo inv) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* getFirstSpecimenTypeForResultSpecimenType
	*/
	public ims.ocrr.vo.lookups.SpecimenType getFirstSpecimenTypeForResultSpecimenType(ims.ocrr.vo.lookups.ResultSpecimenTypes resultSpecimenType);

	// Generated from form domain interface definition
	/**
	* Returns a datetime value if expected turnaround values configured for the investigation.  Otherwise it returns null
	*/
	public ims.framework.utils.DateTime calculateExpectedDateTime(ims.ocrr.configuration.vo.InvestigationRefVo investigation, ims.framework.utils.DateTime dateTimeReceived);

	// Generated from form domain interface definition
	/**
	* Saves the OCSOrderSession as unprocessesd
	*/
	public ims.ocs_if.vo.IfOcsOrderVo saveOrderAsUnprocessed(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo orderSession) throws ims.domain.exceptions.StaleObjectException;
}
