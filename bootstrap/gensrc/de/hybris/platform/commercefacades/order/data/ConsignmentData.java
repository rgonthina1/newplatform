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

import de.hybris.platform.basecommerce.enums.ConsignmentStatus;
import de.hybris.platform.commercefacades.order.data.ConsignmentEntryData;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import java.util.Date;
import java.util.List;

public class ConsignmentData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ConsignmentData.statusDate</code> property defined at extension <code>commercefacades</code>. */
	private Date statusDate;
	/** <i>Generated property</i> for <code>ConsignmentData.entries</code> property defined at extension <code>commercefacades</code>. */
	private List<ConsignmentEntryData> entries;
	/** <i>Generated property</i> for <code>ConsignmentData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>ConsignmentData.statusDisplay</code> property defined at extension <code>acceleratorfacades</code>. */
	private String statusDisplay;
	/** <i>Generated property</i> for <code>ConsignmentData.deliveryPointOfService</code> property defined at extension <code>commercefacades</code>. */
	private PointOfServiceData deliveryPointOfService;
	/** <i>Generated property</i> for <code>ConsignmentData.shippingAddress</code> property defined at extension <code>commercefacades</code>. */
	private AddressData shippingAddress;
	/** <i>Generated property</i> for <code>ConsignmentData.trackingID</code> property defined at extension <code>commercefacades</code>. */
	private String trackingID;
	/** <i>Generated property</i> for <code>ConsignmentData.status</code> property defined at extension <code>commercefacades</code>. */
	private ConsignmentStatus status;
		
	public ConsignmentData()
	{
		// default constructor
	}
	
		
	public void setStatusDate(final Date statusDate)
	{
		this.statusDate = statusDate;
	}
	
		
	public Date getStatusDate() 
	{
		return statusDate;
	}
		
		
	public void setEntries(final List<ConsignmentEntryData> entries)
	{
		this.entries = entries;
	}
	
		
	public List<ConsignmentEntryData> getEntries() 
	{
		return entries;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setStatusDisplay(final String statusDisplay)
	{
		this.statusDisplay = statusDisplay;
	}
	
		
	public String getStatusDisplay() 
	{
		return statusDisplay;
	}
		
		
	public void setDeliveryPointOfService(final PointOfServiceData deliveryPointOfService)
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}
	
		
	public PointOfServiceData getDeliveryPointOfService() 
	{
		return deliveryPointOfService;
	}
		
		
	public void setShippingAddress(final AddressData shippingAddress)
	{
		this.shippingAddress = shippingAddress;
	}
	
		
	public AddressData getShippingAddress() 
	{
		return shippingAddress;
	}
		
		
	public void setTrackingID(final String trackingID)
	{
		this.trackingID = trackingID;
	}
	
		
	public String getTrackingID() 
	{
		return trackingID;
	}
		
		
	public void setStatus(final ConsignmentStatus status)
	{
		this.status = status;
	}
	
		
	public ConsignmentStatus getStatus() 
	{
		return status;
	}
		
	
}