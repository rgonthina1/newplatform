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
package de.hybris.platform.commercewebservicescommons.dto.user;

import de.hybris.platform.commercewebservicescommons.dto.user.UserGroupWsDTO;
import java.util.List;

public class UserGroupListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>UserGroupListWsDTO.userGroups</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<UserGroupWsDTO> userGroups;
	/** <i>Generated property</i> for <code>UserGroupListWsDTO.totalNumber</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer totalNumber;
	/** <i>Generated property</i> for <code>UserGroupListWsDTO.numberOfPages</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer numberOfPages;
	/** <i>Generated property</i> for <code>UserGroupListWsDTO.pageSize</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer pageSize;
	/** <i>Generated property</i> for <code>UserGroupListWsDTO.currentPage</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer currentPage;
		
	public UserGroupListWsDTO()
	{
		// default constructor
	}
	
		
	public void setUserGroups(final List<UserGroupWsDTO> userGroups)
	{
		this.userGroups = userGroups;
	}
	
		
	public List<UserGroupWsDTO> getUserGroups() 
	{
		return userGroups;
	}
		
		
	public void setTotalNumber(final Integer totalNumber)
	{
		this.totalNumber = totalNumber;
	}
	
		
	public Integer getTotalNumber() 
	{
		return totalNumber;
	}
		
		
	public void setNumberOfPages(final Integer numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
		
	public Integer getNumberOfPages() 
	{
		return numberOfPages;
	}
		
		
	public void setPageSize(final Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	
		
	public Integer getPageSize() 
	{
		return pageSize;
	}
		
		
	public void setCurrentPage(final Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	
		
	public Integer getCurrentPage() 
	{
		return currentPage;
	}
		
	
}