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
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.order.OrderEntryWsDTO;

public class ConsignmentEntryWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ConsignmentEntryWsDTO.orderEntry</code> property defined at extension <code>commercewebservicescommons</code>. */
	private OrderEntryWsDTO orderEntry;
	/** <i>Generated property</i> for <code>ConsignmentEntryWsDTO.quantity</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long quantity;
	/** <i>Generated property</i> for <code>ConsignmentEntryWsDTO.shippedQuantity</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long shippedQuantity;
		
	public ConsignmentEntryWsDTO()
	{
		// default constructor
	}
	
		
	public void setOrderEntry(final OrderEntryWsDTO orderEntry)
	{
		this.orderEntry = orderEntry;
	}
	
		
	public OrderEntryWsDTO getOrderEntry() 
	{
		return orderEntry;
	}
		
		
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setShippedQuantity(final Long shippedQuantity)
	{
		this.shippedQuantity = shippedQuantity;
	}
	
		
	public Long getShippedQuantity() 
	{
		return shippedQuantity;
	}
		
	
}