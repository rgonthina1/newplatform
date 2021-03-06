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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.OrderEntryGroupData;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;

public class PickupOrderEntryGroupData extends OrderEntryGroupData 
{

	/** <i>Generated property</i> for <code>PickupOrderEntryGroupData.distance</code> property defined at extension <code>commercefacades</code>. */
	private Double distance;
	/** <i>Generated property</i> for <code>PickupOrderEntryGroupData.deliveryPointOfService</code> property defined at extension <code>commercefacades</code>. */
	private PointOfServiceData deliveryPointOfService;
		
	public PickupOrderEntryGroupData()
	{
		// default constructor
	}
	
		
	public void setDistance(final Double distance)
	{
		this.distance = distance;
	}
	
		
	public Double getDistance() 
	{
		return distance;
	}
		
		
	public void setDeliveryPointOfService(final PointOfServiceData deliveryPointOfService)
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}
	
		
	public PointOfServiceData getDeliveryPointOfService() 
	{
		return deliveryPointOfService;
	}
		
	
}