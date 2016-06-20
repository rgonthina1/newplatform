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
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.SearchConfig;
import de.hybris.platform.solrfacetsearch.config.SolrConfig;

public class FacetSearchConfig  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FacetSearchConfig.solrConfig</code> property defined at extension <code>solrfacetsearch</code>. */
	private SolrConfig solrConfig;
	/** <i>Generated property</i> for <code>FacetSearchConfig.name</code> property defined at extension <code>solrfacetsearch</code>. */
	private String name;
	/** <i>Generated property</i> for <code>FacetSearchConfig.description</code> property defined at extension <code>solrfacetsearch</code>. */
	private String description;
	/** <i>Generated property</i> for <code>FacetSearchConfig.indexConfig</code> property defined at extension <code>solrfacetsearch</code>. */
	private IndexConfig indexConfig;
	/** <i>Generated property</i> for <code>FacetSearchConfig.searchConfig</code> property defined at extension <code>solrfacetsearch</code>. */
	private SearchConfig searchConfig;
		
	public FacetSearchConfig()
	{
		// default constructor
	}
	
		
	public void setSolrConfig(final SolrConfig solrConfig)
	{
		this.solrConfig = solrConfig;
	}
	
		
	public SolrConfig getSolrConfig() 
	{
		return solrConfig;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setIndexConfig(final IndexConfig indexConfig)
	{
		this.indexConfig = indexConfig;
	}
	
		
	public IndexConfig getIndexConfig() 
	{
		return indexConfig;
	}
		
		
	public void setSearchConfig(final SearchConfig searchConfig)
	{
		this.searchConfig = searchConfig;
	}
	
		
	public SearchConfig getSearchConfig() 
	{
		return searchConfig;
	}
		
	
}