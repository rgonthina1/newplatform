/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 20 Jun, 2016 7:36:28 PM
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
import de.hybris.platform.commercewebservicescommons.dto.catalog.CatalogVersionWsDTO;
import java.util.Collection;

public class CatalogWsDTO extends AbstractCatalogItemWsDTO 
{

	/** <i>Generated property</i> for <code>CatalogWsDTO.catalogVersions</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<CatalogVersionWsDTO> catalogVersions;
		
	public CatalogWsDTO()
	{
		// default constructor
	}
	
		
	public void setCatalogVersions(final Collection<CatalogVersionWsDTO> catalogVersions)
	{
		this.catalogVersions = catalogVersions;
	}
	
		
	public Collection<CatalogVersionWsDTO> getCatalogVersions() 
	{
		return catalogVersions;
	}
		
	
}