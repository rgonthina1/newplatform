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
package de.hybris.platform.commerceservices.search.facetdata;

/**
 * POJO representing a facet value.
 */
public class FacetValueData<STATE>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FacetValueData<STATE>.code</code> property defined at extension <code>commerceservices</code>. */
	private String code;
	/** <i>Generated property</i> for <code>FacetValueData<STATE>.query</code> property defined at extension <code>commerceservices</code>. */
	private STATE query;
	/** <i>Generated property</i> for <code>FacetValueData<STATE>.name</code> property defined at extension <code>commerceservices</code>. */
	private String name;
	/** <i>Generated property</i> for <code>FacetValueData<STATE>.count</code> property defined at extension <code>commerceservices</code>. */
	private long count;
	/** <i>Generated property</i> for <code>FacetValueData<STATE>.selected</code> property defined at extension <code>commerceservices</code>. */
	private boolean selected;
		
	public FacetValueData()
	{
		// default constructor
	}
	
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setQuery(final STATE query)
	{
		this.query = query;
	}
	
		
	public STATE getQuery() 
	{
		return query;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setCount(final long count)
	{
		this.count = count;
	}
	
		
	public long getCount() 
	{
		return count;
	}
		
		
	public void setSelected(final boolean selected)
	{
		this.selected = selected;
	}
	
		
	public boolean isSelected() 
	{
		return selected;
	}
		
	
}