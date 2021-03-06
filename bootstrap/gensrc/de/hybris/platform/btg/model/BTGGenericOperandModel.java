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
import de.hybris.platform.btg.model.BTGOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGGenericOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGGenericOperandModel extends BTGOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGGenericOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGGenericOperand.beanId</code> attribute defined at extension <code>btg</code>. */
	public static final String BEANID = "beanId";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGGenericOperand.beanId</code> attribute defined at extension <code>btg</code>. */
	private String _beanId;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGGenericOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGGenericOperandModel(final ItemModelContext ctx)
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
	public BTGGenericOperandModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public BTGGenericOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGGenericOperand.beanId</code> attribute defined at extension <code>btg</code>. 
	 * @return the beanId
	 */
	@Accessor(qualifier = "beanId", type = Accessor.Type.GETTER)
	public String getBeanId()
	{
		if (this._beanId!=null)
		{
			return _beanId;
		}
		return _beanId = getPersistenceContext().getValue(BEANID, _beanId);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGGenericOperand.beanId</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the beanId
	 */
	@Accessor(qualifier = "beanId", type = Accessor.Type.SETTER)
	public void setBeanId(final String value)
	{
		_beanId = getPersistenceContext().setValue(BEANID, value);
	}
	
}
