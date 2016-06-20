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
package de.hybris.platform.variants.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type VariantValueCategory first defined at extension basecommerce.
 * <p>
 * Value category for variant types (it defines the dimensions).
 */
@SuppressWarnings("all")
public class VariantValueCategoryModel extends CategoryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "VariantValueCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>VariantValueCategory.sequence</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String SEQUENCE = "sequence";
	
	
	/** <i>Generated variable</i> - Variable of <code>VariantValueCategory.sequence</code> attribute defined at extension <code>basecommerce</code>. */
	private Integer _sequence;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public VariantValueCategoryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public VariantValueCategoryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Category</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Category</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public VariantValueCategoryModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Category</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Category</code> at extension <code>catalog</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public VariantValueCategoryModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VariantValueCategory.sequence</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the sequence
	 */
	@Accessor(qualifier = "sequence", type = Accessor.Type.GETTER)
	public Integer getSequence()
	{
		if (this._sequence!=null)
		{
			return _sequence;
		}
		return _sequence = getPersistenceContext().getValue(SEQUENCE, _sequence);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>VariantValueCategory.sequence</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the sequence
	 */
	@Accessor(qualifier = "sequence", type = Accessor.Type.SETTER)
	public void setSequence(final Integer value)
	{
		_sequence = getPersistenceContext().setValue(SEQUENCE, value);
	}
	
}
