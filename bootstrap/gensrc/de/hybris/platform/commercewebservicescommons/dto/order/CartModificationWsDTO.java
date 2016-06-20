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

public class CartModificationWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CartModificationWsDTO.entry</code> property defined at extension <code>commercewebservicescommons</code>. */
	private OrderEntryWsDTO entry;
	/** <i>Generated property</i> for <code>CartModificationWsDTO.quantity</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long quantity;
	/** <i>Generated property</i> for <code>CartModificationWsDTO.deliveryModeChanged</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Boolean deliveryModeChanged;
	/** <i>Generated property</i> for <code>CartModificationWsDTO.statusMessage</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String statusMessage;
	/** <i>Generated property</i> for <code>CartModificationWsDTO.statusCode</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String statusCode;
	/** <i>Generated property</i> for <code>CartModificationWsDTO.quantityAdded</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Long quantityAdded;
		
	public CartModificationWsDTO()
	{
		// default constructor
	}
	
		
	public void setEntry(final OrderEntryWsDTO entry)
	{
		this.entry = entry;
	}
	
		
	public OrderEntryWsDTO getEntry() 
	{
		return entry;
	}
		
		
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setDeliveryModeChanged(final Boolean deliveryModeChanged)
	{
		this.deliveryModeChanged = deliveryModeChanged;
	}
	
		
	public Boolean getDeliveryModeChanged() 
	{
		return deliveryModeChanged;
	}
		
		
	public void setStatusMessage(final String statusMessage)
	{
		this.statusMessage = statusMessage;
	}
	
		
	public String getStatusMessage() 
	{
		return statusMessage;
	}
		
		
	public void setStatusCode(final String statusCode)
	{
		this.statusCode = statusCode;
	}
	
		
	public String getStatusCode() 
	{
		return statusCode;
	}
		
		
	public void setQuantityAdded(final Long quantityAdded)
	{
		this.quantityAdded = quantityAdded;
	}
	
		
	public Long getQuantityAdded() 
	{
		return quantityAdded;
	}
		
	
}