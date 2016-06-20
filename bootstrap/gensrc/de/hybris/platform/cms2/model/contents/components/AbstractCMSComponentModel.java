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
package de.hybris.platform.cms2.model.contents.components;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.acceleratorcms.model.actions.AbstractCMSActionModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.model.contents.contentslot.ContentSlotModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type AbstractCMSComponent first defined at extension cms2.
 */
@SuppressWarnings("all")
public class AbstractCMSComponentModel extends CMSItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractCMSComponent";
	
	/**<i>Generated relation code constant for relation <code>ElementsForSlot</code> defining source attribute <code>slots</code> in extension <code>cms2</code>.</i>*/
	public final static String _ELEMENTSFORSLOT = "ElementsForSlot";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.visible</code> attribute defined at extension <code>cms2</code>. */
	public static final String VISIBLE = "visible";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. */
	public static final String ONLYONERESTRICTIONMUSTAPPLY = "onlyOneRestrictionMustApply";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.type</code> attribute defined at extension <code>cms2</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.typeCode</code> attribute defined at extension <code>cms2</code>. */
	public static final String TYPECODE = "typeCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.container</code> attribute defined at extension <code>cms2</code>. */
	public static final String CONTAINER = "container";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.restricted</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESTRICTED = "restricted";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.slots</code> attribute defined at extension <code>cms2</code>. */
	public static final String SLOTS = "slots";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.restrictions</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESTRICTIONS = "restrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSComponent.actions</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String ACTIONS = "actions";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.visible</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _visible;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _onlyOneRestrictionMustApply;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.typeCode</code> attribute defined at extension <code>cms2</code>. */
	private String _typeCode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.container</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _container;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.restricted</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _restricted;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.slots</code> attribute defined at extension <code>cms2</code>. */
	private Collection<ContentSlotModel> _slots;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.restrictions</code> attribute defined at extension <code>cms2</code>. */
	private List<AbstractRestrictionModel> _restrictions;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.actions</code> attribute defined at extension <code>acceleratorcms</code>. */
	private List<AbstractCMSActionModel> _actions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractCMSComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractCMSComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AbstractCMSComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AbstractCMSComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.actions</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the actions
	 */
	@Accessor(qualifier = "actions", type = Accessor.Type.GETTER)
	public List<AbstractCMSActionModel> getActions()
	{
		if (this._actions!=null)
		{
			return _actions;
		}
		return _actions = getPersistenceContext().getValue(ACTIONS, _actions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.restrictions</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictions
	 */
	@Accessor(qualifier = "restrictions", type = Accessor.Type.GETTER)
	public List<AbstractRestrictionModel> getRestrictions()
	{
		if (this._restrictions!=null)
		{
			return _restrictions;
		}
		return _restrictions = getPersistenceContext().getValue(RESTRICTIONS, _restrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.slots</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the slots
	 */
	@Accessor(qualifier = "slots", type = Accessor.Type.GETTER)
	public Collection<ContentSlotModel> getSlots()
	{
		if (this._slots!=null)
		{
			return _slots;
		}
		return _slots = getPersistenceContext().getValue(SLOTS, _slots);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.type</code> attribute defined at extension <code>cms2</code>. 
	 * @return the type
	 */
	@Deprecated
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public String getType()
	{
		return getType(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.type</code> attribute defined at extension <code>cms2</code>. 
	 * @param loc the value localization key 
	 * @return the type
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Deprecated
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public String getType(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TYPE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.typeCode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the typeCode
	 */
	@Deprecated
	@Accessor(qualifier = "typeCode", type = Accessor.Type.GETTER)
	public String getTypeCode()
	{
		if (this._typeCode!=null)
		{
			return _typeCode;
		}
		return _typeCode = getPersistenceContext().getValue(TYPECODE, _typeCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.visible</code> attribute defined at extension <code>cms2</code>. 
	 * @return the visible
	 */
	@Accessor(qualifier = "visible", type = Accessor.Type.GETTER)
	public Boolean getVisible()
	{
		if (this._visible!=null)
		{
			return _visible;
		}
		return _visible = getPersistenceContext().getValue(VISIBLE, _visible);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.container</code> attribute defined at extension <code>cms2</code>. 
	 * @return the container
	 */
	@Deprecated
	@Accessor(qualifier = "container", type = Accessor.Type.GETTER)
	public boolean isContainer()
	{
		return toPrimitive( _container = getPersistenceContext().getValue(CONTAINER, _container));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. 
	 * @return the onlyOneRestrictionMustApply
	 */
	@Accessor(qualifier = "onlyOneRestrictionMustApply", type = Accessor.Type.GETTER)
	public boolean isOnlyOneRestrictionMustApply()
	{
		return toPrimitive( _onlyOneRestrictionMustApply = getPersistenceContext().getValue(ONLYONERESTRICTIONMUSTAPPLY, _onlyOneRestrictionMustApply));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSComponent.restricted</code> attribute defined at extension <code>cms2</code>. 
	 * @return the restricted
	 */
	@Deprecated
	@Accessor(qualifier = "restricted", type = Accessor.Type.GETTER)
	public boolean isRestricted()
	{
		return toPrimitive( _restricted = getPersistenceContext().getValue(RESTRICTED, _restricted));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSComponent.actions</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the actions
	 */
	@Accessor(qualifier = "actions", type = Accessor.Type.SETTER)
	public void setActions(final List<AbstractCMSActionModel> value)
	{
		_actions = getPersistenceContext().setValue(ACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSComponent.onlyOneRestrictionMustApply</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the onlyOneRestrictionMustApply
	 */
	@Accessor(qualifier = "onlyOneRestrictionMustApply", type = Accessor.Type.SETTER)
	public void setOnlyOneRestrictionMustApply(final boolean value)
	{
		_onlyOneRestrictionMustApply = getPersistenceContext().setValue(ONLYONERESTRICTIONMUSTAPPLY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSComponent.restrictions</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the restrictions
	 */
	@Accessor(qualifier = "restrictions", type = Accessor.Type.SETTER)
	public void setRestrictions(final List<AbstractRestrictionModel> value)
	{
		_restrictions = getPersistenceContext().setValue(RESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSComponent.slots</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the slots
	 */
	@Accessor(qualifier = "slots", type = Accessor.Type.SETTER)
	public void setSlots(final Collection<ContentSlotModel> value)
	{
		_slots = getPersistenceContext().setValue(SLOTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSComponent.visible</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the visible
	 */
	@Accessor(qualifier = "visible", type = Accessor.Type.SETTER)
	public void setVisible(final Boolean value)
	{
		_visible = getPersistenceContext().setValue(VISIBLE, value);
	}
	
}
