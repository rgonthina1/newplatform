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
import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGReferenceRegExpListOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceRegExpListOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceRegExpListOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceRegExpListOperand.regularExpressions</code> attribute defined at extension <code>btg</code>. */
	public static final String REGULAREXPRESSIONS = "regularExpressions";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceRegExpListOperand.regularExpressions</code> attribute defined at extension <code>btg</code>. */
	private Collection<String> _regularExpressions;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceRegExpListOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceRegExpListOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _regularExpressions initial attribute declared by type <code>BTGReferenceRegExpListOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceRegExpListOperandModel(final CatalogVersionModel _catalogVersion, final Collection<String> _regularExpressions, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setRegularExpressions(_regularExpressions);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _regularExpressions initial attribute declared by type <code>BTGReferenceRegExpListOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceRegExpListOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final Collection<String> _regularExpressions, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setRegularExpressions(_regularExpressions);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceRegExpListOperand.regularExpressions</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the regularExpressions
	 */
	@Accessor(qualifier = "regularExpressions", type = Accessor.Type.GETTER)
	public Collection<String> getRegularExpressions()
	{
		if (this._regularExpressions!=null)
		{
			return _regularExpressions;
		}
		return _regularExpressions = getPersistenceContext().getValue(REGULAREXPRESSIONS, _regularExpressions);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceRegExpListOperand.regularExpressions</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the regularExpressions
	 */
	@Accessor(qualifier = "regularExpressions", type = Accessor.Type.SETTER)
	public void setRegularExpressions(final Collection<String> value)
	{
		_regularExpressions = getPersistenceContext().setValue(REGULAREXPRESSIONS, value);
	}
	
}
