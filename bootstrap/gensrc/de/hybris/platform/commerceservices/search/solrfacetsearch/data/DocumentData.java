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
package de.hybris.platform.commerceservices.search.solrfacetsearch.data;

public class DocumentData<SEARCH_QUERY_TYPE, DOCUMENT_TYPE>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>DocumentData<SEARCH_QUERY_TYPE, DOCUMENT_TYPE>.searchQuery</code> property defined at extension <code>commerceservices</code>. */
	private SEARCH_QUERY_TYPE searchQuery;
	/** <i>Generated property</i> for <code>DocumentData<SEARCH_QUERY_TYPE, DOCUMENT_TYPE>.document</code> property defined at extension <code>commerceservices</code>. */
	private DOCUMENT_TYPE document;
		
	public DocumentData()
	{
		// default constructor
	}
	
		
	public void setSearchQuery(final SEARCH_QUERY_TYPE searchQuery)
	{
		this.searchQuery = searchQuery;
	}
	
		
	public SEARCH_QUERY_TYPE getSearchQuery() 
	{
		return searchQuery;
	}
		
		
	public void setDocument(final DOCUMENT_TYPE document)
	{
		this.document = document;
	}
	
		
	public DOCUMENT_TYPE getDocument() 
	{
		return document;
	}
		
	
}