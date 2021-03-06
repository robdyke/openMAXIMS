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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class PatientAllergyAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientAllergy copy(ims.core.vo.PatientAllergy valueObjectDest, ims.core.vo.PatientAllergy valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAllergy(valueObjectSrc.getID_PatientAllergy());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Allergen
		valueObjectDest.setAllergen(valueObjectSrc.getAllergen());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// WhenIdentified
		valueObjectDest.setWhenIdentified(valueObjectSrc.getWhenIdentified());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// IsCurrentlyActiveAllergy
		valueObjectDest.setIsCurrentlyActiveAllergy(valueObjectSrc.getIsCurrentlyActiveAllergy());
		// Reactions
		valueObjectDest.setReactions(valueObjectSrc.getReactions());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// AllergenDescription
		valueObjectDest.setAllergenDescription(valueObjectSrc.getAllergenDescription());
		// AllergenType
		valueObjectDest.setAllergenType(valueObjectSrc.getAllergenType());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// InactivationAuthoringInfo
		valueObjectDest.setInactivationAuthoringInfo(valueObjectSrc.getInactivationAuthoringInfo());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientAllergyCollectionFromPatientAllergy(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyCollection createPatientAllergyCollectionFromPatientAllergy(java.util.Set domainObjectSet)	
	{
		return createPatientAllergyCollectionFromPatientAllergy(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyCollection createPatientAllergyCollectionFromPatientAllergy(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientAllergyCollection voList = new ims.core.vo.PatientAllergyCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientAllergy domainObject = (ims.core.clinical.domain.objects.PatientAllergy) iterator.next();
			ims.core.vo.PatientAllergy vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyCollection createPatientAllergyCollectionFromPatientAllergy(java.util.List domainObjectList) 
	{
		return createPatientAllergyCollectionFromPatientAllergy(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyCollection createPatientAllergyCollectionFromPatientAllergy(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientAllergyCollection voList = new ims.core.vo.PatientAllergyCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientAllergy domainObject = (ims.core.clinical.domain.objects.PatientAllergy) domainObjectList.get(i);
			ims.core.vo.PatientAllergy vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.core.clinical.domain.objects.PatientAllergy set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientAllergySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyCollection voCollection) 
	 {
	 	return extractPatientAllergySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAllergySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientAllergy vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientAllergy domainObject = PatientAllergyAssembler.extractPatientAllergy(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.core.clinical.domain.objects.PatientAllergy list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientAllergyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyCollection voCollection) 
	 {
	 	return extractPatientAllergyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAllergyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientAllergy vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientAllergy domainObject = PatientAllergyAssembler.extractPatientAllergy(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientAllergy object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientAllergy
	 */
	 public static ims.core.vo.PatientAllergy create(ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientAllergy object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientAllergy create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientAllergy valueObject = (ims.core.vo.PatientAllergy) map.getValueObject(domainObject, ims.core.vo.PatientAllergy.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientAllergy(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientAllergy
	 */
	 public static ims.core.vo.PatientAllergy insert(ims.core.vo.PatientAllergy valueObject, ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientAllergy
	 */
	 public static ims.core.vo.PatientAllergy insert(DomainObjectMap map, ims.core.vo.PatientAllergy valueObject, ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientAllergy(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Allergen
		valueObject.setAllergen(ims.core.vo.domain.AllergenVoAssembler.create(map, domainObject.getAllergen()) );
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSourceofInformation();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup2 = new ims.core.vo.lookups.SourceofInformation(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.SourceofInformation(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSourceofInformation(voLookup2);
		}
				// WhenIdentified
		Integer WhenIdentified = domainObject.getWhenIdentified();
		if ( null != WhenIdentified ) 
		{
			valueObject.setWhenIdentified(new ims.framework.utils.PartialDate(WhenIdentified) );
		}
		// Comments
		valueObject.setComments(domainObject.getComments());
		// IsCurrentlyActiveAllergy
		valueObject.setIsCurrentlyActiveAllergy( domainObject.isIsCurrentlyActiveAllergy() );
		// Reactions
		valueObject.setReactions(ims.core.vo.domain.PatientAllergyReactionVoAssembler.createPatientAllergyReactionVoCollectionFromPatientAllergyReaction(map, domainObject.getAllergenReactions()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// AllergenDescription
		valueObject.setAllergenDescription(domainObject.getAllergenDescription());
		// AllergenType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAllergenType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.AllergenType voLookup9 = new ims.core.vo.lookups.AllergenType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.AllergenType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.AllergenType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setAllergenType(voLookup9);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// InactivationAuthoringInfo
		valueObject.setInactivationAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getInactivationAuthoringInfo()) );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientAllergy extractPatientAllergy(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergy valueObject) 
	{
		return 	extractPatientAllergy(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientAllergy extractPatientAllergy(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergy valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientAllergy();
		ims.core.clinical.domain.objects.PatientAllergy domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientAllergy)domMap.get(valueObject);
			}
			// ims.core.vo.PatientAllergy ID_PatientAllergy field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientAllergy();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientAllergy());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientAllergy)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientAllergy) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientAllergy.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientAllergy());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Allergen value1 = null;
		if ( null != valueObject.getAllergen() ) 
		{
			if (valueObject.getAllergen().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllergen()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Allergen)domMap.get(valueObject.getAllergen());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Allergen)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Allergen.class, valueObject.getAllergen().getBoId());
			}
		}
		domainObject.setAllergen(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value2);
		ims.framework.utils.PartialDate WhenIdentified = valueObject.getWhenIdentified();
		Integer value3 = null;
		if ( null != WhenIdentified ) 
		{
			value3 = WhenIdentified.toInteger();
		}
		domainObject.setWhenIdentified(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setIsCurrentlyActiveAllergy(valueObject.getIsCurrentlyActiveAllergy());
		domainObject.setAllergenReactions(ims.core.vo.domain.PatientAllergyReactionVoAssembler.extractPatientAllergyReactionSet(domainFactory, valueObject.getReactions(), domainObject.getAllergenReactions(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAllergenDescription() != null && valueObject.getAllergenDescription().equals(""))
		{
			valueObject.setAllergenDescription(null);
		}
		domainObject.setAllergenDescription(valueObject.getAllergenDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAllergenType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAllergenType().getID());
		}
		domainObject.setAllergenType(value9);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.patient.domain.objects.Patient value11 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value11 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getPatient();	
			}
			else
			{
				value11 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value11);
		domainObject.setInactivationAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getInactivationAuthoringInfo(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));

		return domainObject;
	}

}
