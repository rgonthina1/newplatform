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
package de.hybris.platform.commerceservices.search.pagedata;

/**
 * POJO representation of search query pagination.
 */
public class PageableData  implements java.io.Serializable 
{

	/** The number of results per page. A page may have less results if there are less than a full page of results, only on the last page in the results.<br/><br/><i>Generated property</i> for <code>PageableData.pageSize</code> property defined at extension <code>commerceservices</code>. */
	private int pageSize;
	/** The selected sort code.<br/><br/><i>Generated property</i> for <code>PageableData.sort</code> property defined at extension <code>commerceservices</code>. */
	private String sort;
	/** The current page number. The first page is number zero (0), the second page is number one (1), and so on.<br/><br/><i>Generated property</i> for <code>PageableData.currentPage</code> property defined at extension <code>commerceservices</code>. */
	private int currentPage;
		
	public PageableData()
	{
		// default constructor
	}
	
		
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}
	
		
	public int getPageSize() 
	{
		return pageSize;
	}
		
		
	public void setSort(final String sort)
	{
		this.sort = sort;
	}
	
		
	public String getSort() 
	{
		return sort;
	}
		
		
	public void setCurrentPage(final int currentPage)
	{
		this.currentPage = currentPage;
	}
	
		
	public int getCurrentPage() 
	{
		return currentPage;
	}
		
	
}