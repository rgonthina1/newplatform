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

import de.hybris.platform.commercewebservicescommons.dto.order.DeliveryModeWsDTO;
import java.util.List;

public class DeliveryModeListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>DeliveryModeListWsDTO.deliveryModes</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<DeliveryModeWsDTO> deliveryModes;
		
	public DeliveryModeListWsDTO()
	{
		// default constructor
	}
	
		
	public void setDeliveryModes(final List<DeliveryModeWsDTO> deliveryModes)
	{
		this.deliveryModes = deliveryModes;
	}
	
		
	public List<DeliveryModeWsDTO> getDeliveryModes() 
	{
		return deliveryModes;
	}
		
	
}