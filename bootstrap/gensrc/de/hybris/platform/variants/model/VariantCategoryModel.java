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
 * Generated model class for type VariantCategory first defined at extension basecommerce.
 * <p>
 * Container category for variant types.
 */
@SuppressWarnings("all")
public class VariantCategoryModel extends CategoryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "VariantCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>VariantCategory.hasImage</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String HASIMAGE = "hasImage";
	
	
	/** <i>Generated variable</i> - Variable of <code>VariantCategory.hasImage</code> attribute defined at extension <code>basecommerce</code>. */
	private Boolean _hasImage;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public VariantCategoryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public VariantCategoryModel(final ItemModelContext ctx)
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
	public VariantCategoryModel(final CatalogVersionModel _catalogVersion, final String _code)
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
	public VariantCategoryModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VariantCategory.hasImage</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the hasImage
	 */
	@Accessor(qualifier = "hasImage", type = Accessor.Type.GETTER)
	public Boolean getHasImage()
	{
		if (this._hasImage!=null)
		{
			return _hasImage;
		}
		return _hasImage = getPersistenceContext().getValue(HASIMAGE, _hasImage);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>VariantCategory.hasImage</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the hasImage
	 */
	@Accessor(qualifier = "hasImage", type = Accessor.Type.SETTER)
	public void setHasImage(final Boolean value)
	{
		_hasImage = getPersistenceContext().setValue(HASIMAGE, value);
	}
	
}
