/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20 Jun, 2016 7:36:24 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.storelocator.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.basecommerce.enums.PointOfServiceTypeEnum;
import de.hybris.platform.commerceservices.model.storelocator.StoreLocatorFeatureModel;
import de.hybris.platform.commerceservices.model.user.StoreEmployeeGroupModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.storelocator.model.OpeningScheduleModel;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * Generated model class for type PointOfService first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class PointOfServiceModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PointOfService";
	
	/**<i>Generated relation code constant for relation <code>BaseStore2PointOfServiceRelation</code> defining source attribute <code>baseStore</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _BASESTORE2POINTOFSERVICERELATION = "BaseStore2PointOfServiceRelation";
	
	/**<i>Generated relation code constant for relation <code>StoreEmplGroup2POSRel</code> defining source attribute <code>storeEmployeeGroups</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _STOREEMPLGROUP2POSREL = "StoreEmplGroup2POSRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.name</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.address</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ADDRESS = "address";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.description</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.type</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.mapIcon</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MAPICON = "mapIcon";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.latitude</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String LATITUDE = "latitude";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.longitude</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String LONGITUDE = "longitude";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.geocodeTimestamp</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String GEOCODETIMESTAMP = "geocodeTimestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String OPENINGSCHEDULE = "openingSchedule";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.storeContent</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STORECONTENT = "storeContent";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.storeImage</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STOREIMAGE = "storeImage";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.baseStore</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String BASESTORE = "baseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.displayName</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DISPLAYNAME = "displayName";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.nearbyStoreRadius</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String NEARBYSTORERADIUS = "nearbyStoreRadius";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.features</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String FEATURES = "features";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.warehouses</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String WAREHOUSES = "warehouses";
	
	/** <i>Generated constant</i> - Attribute key of <code>PointOfService.storeEmployeeGroups</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String STOREEMPLOYEEGROUPS = "storeEmployeeGroups";
	
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.name</code> attribute defined at extension <code>basecommerce</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.address</code> attribute defined at extension <code>basecommerce</code>. */
	private AddressModel _address;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.description</code> attribute defined at extension <code>basecommerce</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.type</code> attribute defined at extension <code>basecommerce</code>. */
	private PointOfServiceTypeEnum _type;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.mapIcon</code> attribute defined at extension <code>basecommerce</code>. */
	private MediaModel _mapIcon;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.latitude</code> attribute defined at extension <code>basecommerce</code>. */
	private Double _latitude;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.longitude</code> attribute defined at extension <code>basecommerce</code>. */
	private Double _longitude;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.geocodeTimestamp</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _geocodeTimestamp;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. */
	private OpeningScheduleModel _openingSchedule;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.storeImage</code> attribute defined at extension <code>basecommerce</code>. */
	private MediaContainerModel _storeImage;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.baseStore</code> attribute defined at extension <code>basecommerce</code>. */
	private BaseStoreModel _baseStore;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.displayName</code> attribute defined at extension <code>commerceservices</code>. */
	private String _displayName;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.nearbyStoreRadius</code> attribute defined at extension <code>commerceservices</code>. */
	private Double _nearbyStoreRadius;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.features</code> attribute defined at extension <code>commerceservices</code>. */
	private Set<StoreLocatorFeatureModel> _features;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.warehouses</code> attribute defined at extension <code>commerceservices</code>. */
	private List<WarehouseModel> _warehouses;
	
	/** <i>Generated variable</i> - Variable of <code>PointOfService.storeEmployeeGroups</code> attribute defined at extension <code>commerceservices</code>. */
	private Set<StoreEmployeeGroupModel> _storeEmployeeGroups;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PointOfServiceModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PointOfServiceModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>PointOfService</code> at extension <code>basecommerce</code>
	 * @param _type initial attribute declared by type <code>PointOfService</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public PointOfServiceModel(final String _name, final PointOfServiceTypeEnum _type)
	{
		super();
		setName(_name);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>PointOfService</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _type initial attribute declared by type <code>PointOfService</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public PointOfServiceModel(final String _name, final ItemModel _owner, final PointOfServiceTypeEnum _type)
	{
		super();
		setName(_name);
		setOwner(_owner);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.address</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the address
	 */
	@Accessor(qualifier = "address", type = Accessor.Type.GETTER)
	public AddressModel getAddress()
	{
		if (this._address!=null)
		{
			return _address;
		}
		return _address = getPersistenceContext().getValue(ADDRESS, _address);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.baseStore</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.GETTER)
	public BaseStoreModel getBaseStore()
	{
		if (this._baseStore!=null)
		{
			return _baseStore;
		}
		return _baseStore = getPersistenceContext().getValue(BASESTORE, _baseStore);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.description</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.displayName</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the displayName - Used as the display name for search results etc.
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.GETTER)
	public String getDisplayName()
	{
		if (this._displayName!=null)
		{
			return _displayName;
		}
		return _displayName = getPersistenceContext().getValue(DISPLAYNAME, _displayName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.features</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the features
	 */
	@Accessor(qualifier = "features", type = Accessor.Type.GETTER)
	public Set<StoreLocatorFeatureModel> getFeatures()
	{
		if (this._features!=null)
		{
			return _features;
		}
		return _features = getPersistenceContext().getValue(FEATURES, _features);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.geocodeTimestamp</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the geocodeTimestamp
	 */
	@Accessor(qualifier = "geocodeTimestamp", type = Accessor.Type.GETTER)
	public Date getGeocodeTimestamp()
	{
		if (this._geocodeTimestamp!=null)
		{
			return _geocodeTimestamp;
		}
		return _geocodeTimestamp = getPersistenceContext().getValue(GEOCODETIMESTAMP, _geocodeTimestamp);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.latitude</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the latitude
	 */
	@Accessor(qualifier = "latitude", type = Accessor.Type.GETTER)
	public Double getLatitude()
	{
		if (this._latitude!=null)
		{
			return _latitude;
		}
		return _latitude = getPersistenceContext().getValue(LATITUDE, _latitude);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.longitude</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the longitude
	 */
	@Accessor(qualifier = "longitude", type = Accessor.Type.GETTER)
	public Double getLongitude()
	{
		if (this._longitude!=null)
		{
			return _longitude;
		}
		return _longitude = getPersistenceContext().getValue(LONGITUDE, _longitude);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.mapIcon</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the mapIcon
	 */
	@Accessor(qualifier = "mapIcon", type = Accessor.Type.GETTER)
	public MediaModel getMapIcon()
	{
		if (this._mapIcon!=null)
		{
			return _mapIcon;
		}
		return _mapIcon = getPersistenceContext().getValue(MAPICON, _mapIcon);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.name</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.nearbyStoreRadius</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the nearbyStoreRadius - Overrides the default search radius when performing a search for nearby PoS from this PoS. 
	 * 							Unit is BaseStore's StorelocatorDistanceUnit.
	 */
	@Accessor(qualifier = "nearbyStoreRadius", type = Accessor.Type.GETTER)
	public Double getNearbyStoreRadius()
	{
		if (this._nearbyStoreRadius!=null)
		{
			return _nearbyStoreRadius;
		}
		return _nearbyStoreRadius = getPersistenceContext().getValue(NEARBYSTORERADIUS, _nearbyStoreRadius);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the openingSchedule - It is property representing a schedule of opening hours of this point of service.
	 */
	@Accessor(qualifier = "openingSchedule", type = Accessor.Type.GETTER)
	public OpeningScheduleModel getOpeningSchedule()
	{
		if (this._openingSchedule!=null)
		{
			return _openingSchedule;
		}
		return _openingSchedule = getPersistenceContext().getValue(OPENINGSCHEDULE, _openingSchedule);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.storeContent</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the storeContent - It is a localized attribute that contains informational store content text.
	 */
	@Accessor(qualifier = "storeContent", type = Accessor.Type.GETTER)
	public String getStoreContent()
	{
		return getStoreContent(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.storeContent</code> attribute defined at extension <code>basecommerce</code>. 
	 * @param loc the value localization key 
	 * @return the storeContent - It is a localized attribute that contains informational store content text.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "storeContent", type = Accessor.Type.GETTER)
	public String getStoreContent(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(STORECONTENT, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.storeEmployeeGroups</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the storeEmployeeGroups
	 */
	@Accessor(qualifier = "storeEmployeeGroups", type = Accessor.Type.GETTER)
	public Set<StoreEmployeeGroupModel> getStoreEmployeeGroups()
	{
		if (this._storeEmployeeGroups!=null)
		{
			return _storeEmployeeGroups;
		}
		return _storeEmployeeGroups = getPersistenceContext().getValue(STOREEMPLOYEEGROUPS, _storeEmployeeGroups);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.storeImage</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the storeImage - It is a media container with additional images of the store.
	 */
	@Accessor(qualifier = "storeImage", type = Accessor.Type.GETTER)
	public MediaContainerModel getStoreImage()
	{
		if (this._storeImage!=null)
		{
			return _storeImage;
		}
		return _storeImage = getPersistenceContext().getValue(STOREIMAGE, _storeImage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.type</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public PointOfServiceTypeEnum getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfService.warehouses</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the warehouses
	 */
	@Accessor(qualifier = "warehouses", type = Accessor.Type.GETTER)
	public List<WarehouseModel> getWarehouses()
	{
		if (this._warehouses!=null)
		{
			return _warehouses;
		}
		return _warehouses = getPersistenceContext().getValue(WAREHOUSES, _warehouses);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.address</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the address
	 */
	@Accessor(qualifier = "address", type = Accessor.Type.SETTER)
	public void setAddress(final AddressModel value)
	{
		_address = getPersistenceContext().setValue(ADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.baseStore</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.SETTER)
	public void setBaseStore(final BaseStoreModel value)
	{
		_baseStore = getPersistenceContext().setValue(BASESTORE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.description</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.displayName</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the displayName - Used as the display name for search results etc.
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.SETTER)
	public void setDisplayName(final String value)
	{
		_displayName = getPersistenceContext().setValue(DISPLAYNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.features</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the features
	 */
	@Accessor(qualifier = "features", type = Accessor.Type.SETTER)
	public void setFeatures(final Set<StoreLocatorFeatureModel> value)
	{
		_features = getPersistenceContext().setValue(FEATURES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.geocodeTimestamp</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the geocodeTimestamp
	 */
	@Accessor(qualifier = "geocodeTimestamp", type = Accessor.Type.SETTER)
	public void setGeocodeTimestamp(final Date value)
	{
		_geocodeTimestamp = getPersistenceContext().setValue(GEOCODETIMESTAMP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.latitude</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the latitude
	 */
	@Accessor(qualifier = "latitude", type = Accessor.Type.SETTER)
	public void setLatitude(final Double value)
	{
		_latitude = getPersistenceContext().setValue(LATITUDE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.longitude</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the longitude
	 */
	@Accessor(qualifier = "longitude", type = Accessor.Type.SETTER)
	public void setLongitude(final Double value)
	{
		_longitude = getPersistenceContext().setValue(LONGITUDE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.mapIcon</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the mapIcon
	 */
	@Accessor(qualifier = "mapIcon", type = Accessor.Type.SETTER)
	public void setMapIcon(final MediaModel value)
	{
		_mapIcon = getPersistenceContext().setValue(MAPICON, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PointOfService.name</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.nearbyStoreRadius</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the nearbyStoreRadius - Overrides the default search radius when performing a search for nearby PoS from this PoS. 
	 * 							Unit is BaseStore's StorelocatorDistanceUnit.
	 */
	@Accessor(qualifier = "nearbyStoreRadius", type = Accessor.Type.SETTER)
	public void setNearbyStoreRadius(final Double value)
	{
		_nearbyStoreRadius = getPersistenceContext().setValue(NEARBYSTORERADIUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.openingSchedule</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the openingSchedule - It is property representing a schedule of opening hours of this point of service.
	 */
	@Accessor(qualifier = "openingSchedule", type = Accessor.Type.SETTER)
	public void setOpeningSchedule(final OpeningScheduleModel value)
	{
		_openingSchedule = getPersistenceContext().setValue(OPENINGSCHEDULE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.storeContent</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the storeContent - It is a localized attribute that contains informational store content text.
	 */
	@Accessor(qualifier = "storeContent", type = Accessor.Type.SETTER)
	public void setStoreContent(final String value)
	{
		setStoreContent(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.storeContent</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the storeContent - It is a localized attribute that contains informational store content text.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "storeContent", type = Accessor.Type.SETTER)
	public void setStoreContent(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(STORECONTENT, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.storeEmployeeGroups</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the storeEmployeeGroups
	 */
	@Accessor(qualifier = "storeEmployeeGroups", type = Accessor.Type.SETTER)
	public void setStoreEmployeeGroups(final Set<StoreEmployeeGroupModel> value)
	{
		_storeEmployeeGroups = getPersistenceContext().setValue(STOREEMPLOYEEGROUPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.storeImage</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the storeImage - It is a media container with additional images of the store.
	 */
	@Accessor(qualifier = "storeImage", type = Accessor.Type.SETTER)
	public void setStoreImage(final MediaContainerModel value)
	{
		_storeImage = getPersistenceContext().setValue(STOREIMAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.type</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.SETTER)
	public void setType(final PointOfServiceTypeEnum value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PointOfService.warehouses</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the warehouses
	 */
	@Accessor(qualifier = "warehouses", type = Accessor.Type.SETTER)
	public void setWarehouses(final List<WarehouseModel> value)
	{
		_warehouses = getPersistenceContext().setValue(WAREHOUSES, value);
	}
	
}
