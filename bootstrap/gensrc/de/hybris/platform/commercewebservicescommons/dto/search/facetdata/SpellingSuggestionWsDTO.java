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
package de.hybris.platform.commercewebservicescommons.dto.search.facetdata;

/**
 * POJO representing a spell checker suggestion.
 */
public class SpellingSuggestionWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SpellingSuggestionWsDTO.suggestion</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String suggestion;
	/** <i>Generated property</i> for <code>SpellingSuggestionWsDTO.query</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String query;
		
	public SpellingSuggestionWsDTO()
	{
		// default constructor
	}
	
		
	public void setSuggestion(final String suggestion)
	{
		this.suggestion = suggestion;
	}
	
		
	public String getSuggestion() 
	{
		return suggestion;
	}
		
		
	public void setQuery(final String query)
	{
		this.query = query;
	}
	
		
	public String getQuery() 
	{
		return query;
	}
		
	
}