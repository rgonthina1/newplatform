/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 20 Jun, 2016 7:36:27 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercewebservicescommons.dto.catalog;

import de.hybris.platform.commercewebservicescommons.dto.catalog.AbstractCatalogItemWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.catalog.CategoryHierarchyWsDTO;
import java.util.Collection;

public class CatalogVersionWsDTO extends AbstractCatalogItemWsDTO 
{

	/** <i>Generated property</i> for <code>CatalogVersionWsDTO.categories</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<CategoryHierarchyWsDTO> categories;
		
	public CatalogVersionWsDTO()
	{
		// default constructor
	}
	
		
	public void setCategories(final Collection<CategoryHierarchyWsDTO> categories)
	{
		this.categories = categories;
	}
	
		
	public Collection<CategoryHierarchyWsDTO> getCategories() 
	{
		return categories;
	}
		
	
}