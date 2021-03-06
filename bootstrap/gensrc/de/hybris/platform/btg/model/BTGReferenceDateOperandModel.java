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
package de.hybris.platform.btg.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.basecommerce.enums.IntervalResolution;
import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGReferenceDateOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceDateOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceDateOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceDateOperand.value</code> attribute defined at extension <code>btg</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceDateOperand.unit</code> attribute defined at extension <code>btg</code>. */
	public static final String UNIT = "unit";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceDateOperand.value</code> attribute defined at extension <code>btg</code>. */
	private Integer _value;
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceDateOperand.unit</code> attribute defined at extension <code>btg</code>. */
	private IntervalResolution _unit;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceDateOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceDateOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceDateOperandModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceDateOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceDateOperand.unit</code> attribute defined at extension <code>btg</code>. 
	 * @return the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.GETTER)
	public IntervalResolution getUnit()
	{
		if (this._unit!=null)
		{
			return _unit;
		}
		return _unit = getPersistenceContext().getValue(UNIT, _unit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceDateOperand.value</code> attribute defined at extension <code>btg</code>. 
	 * @return the value
	 */
	@Accessor(qualifier = "value", type = Accessor.Type.GETTER)
	public Integer getValue()
	{
		if (this._value!=null)
		{
			return _value;
		}
		return _value = getPersistenceContext().getValue(VALUE, _value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceDateOperand.unit</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.SETTER)
	public void setUnit(final IntervalResolution value)
	{
		_unit = getPersistenceContext().setValue(UNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceDateOperand.value</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the value
	 */
	@Accessor(qualifier = "value", type = Accessor.Type.SETTER)
	public void setValue(final Integer value)
	{
		_value = getPersistenceContext().setValue(VALUE, value);
	}
	
}
