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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.DeliveryModeData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;
import java.util.List;

public class OrderEntryData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderEntryData.updateable</code> property defined at extension <code>commercefacades</code>. */
	private boolean updateable;
	/** <i>Generated property</i> for <code>OrderEntryData.product</code> property defined at extension <code>commercefacades</code>. */
	private ProductData product;
	/** <i>Generated property</i> for <code>OrderEntryData.entries</code> property defined at extension <code>commercefacades</code>. */
	private List<OrderEntryData> entries;
	/** <i>Generated property</i> for <code>OrderEntryData.quantity</code> property defined at extension <code>commercefacades</code>. */
	private Long quantity;
	/** <i>Generated property</i> for <code>OrderEntryData.totalPrice</code> property defined at extension <code>commercefacades</code>. */
	private PriceData totalPrice;
	/** <i>Generated property</i> for <code>OrderEntryData.deliveryMode</code> property defined at extension <code>commercefacades</code>. */
	private DeliveryModeData deliveryMode;
	/** <i>Generated property</i> for <code>OrderEntryData.deliveryPointOfService</code> property defined at extension <code>commercefacades</code>. */
	private PointOfServiceData deliveryPointOfService;
	/** <i>Generated property</i> for <code>OrderEntryData.entryNumber</code> property defined at extension <code>commercefacades</code>. */
	private Integer entryNumber;
	/** <i>Generated property</i> for <code>OrderEntryData.basePrice</code> property defined at extension <code>commercefacades</code>. */
	private PriceData basePrice;
		
	public OrderEntryData()
	{
		// default constructor
	}
	
		
	public void setUpdateable(final boolean updateable)
	{
		this.updateable = updateable;
	}
	
		
	public boolean isUpdateable() 
	{
		return updateable;
	}
		
		
	public void setProduct(final ProductData product)
	{
		this.product = product;
	}
	
		
	public ProductData getProduct() 
	{
		return product;
	}
		
		
	public void setEntries(final List<OrderEntryData> entries)
	{
		this.entries = entries;
	}
	
		
	public List<OrderEntryData> getEntries() 
	{
		return entries;
	}
		
		
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Long getQuantity() 
	{
		return quantity;
	}
		
		
	public void setTotalPrice(final PriceData totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	
		
	public PriceData getTotalPrice() 
	{
		return totalPrice;
	}
		
		
	public void setDeliveryMode(final DeliveryModeData deliveryMode)
	{
		this.deliveryMode = deliveryMode;
	}
	
		
	public DeliveryModeData getDeliveryMode() 
	{
		return deliveryMode;
	}
		
		
	public void setDeliveryPointOfService(final PointOfServiceData deliveryPointOfService)
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}
	
		
	public PointOfServiceData getDeliveryPointOfService() 
	{
		return deliveryPointOfService;
	}
		
		
	public void setEntryNumber(final Integer entryNumber)
	{
		this.entryNumber = entryNumber;
	}
	
		
	public Integer getEntryNumber() 
	{
		return entryNumber;
	}
		
		
	public void setBasePrice(final PriceData basePrice)
	{
		this.basePrice = basePrice;
	}
	
		
	public PriceData getBasePrice() 
	{
		return basePrice;
	}
		
	
}