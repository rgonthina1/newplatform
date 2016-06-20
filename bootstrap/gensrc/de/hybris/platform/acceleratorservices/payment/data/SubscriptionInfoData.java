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
package de.hybris.platform.acceleratorservices.payment.data;

public class SubscriptionInfoData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>SubscriptionInfoData.subscriptionSignedValue</code> property defined at extension <code>acceleratorservices</code>. */
	private String subscriptionSignedValue;
	/** <i>Generated property</i> for <code>SubscriptionInfoData.subscriptionID</code> property defined at extension <code>acceleratorservices</code>. */
	private String subscriptionID;
	/** <i>Generated property</i> for <code>SubscriptionInfoData.subscriptionIDPublicSignature</code> property defined at extension <code>acceleratorservices</code>. */
	private String subscriptionIDPublicSignature;
		
	public SubscriptionInfoData()
	{
		// default constructor
	}
	
		
	public void setSubscriptionSignedValue(final String subscriptionSignedValue)
	{
		this.subscriptionSignedValue = subscriptionSignedValue;
	}
	
		
	public String getSubscriptionSignedValue() 
	{
		return subscriptionSignedValue;
	}
		
		
	public void setSubscriptionID(final String subscriptionID)
	{
		this.subscriptionID = subscriptionID;
	}
	
		
	public String getSubscriptionID() 
	{
		return subscriptionID;
	}
		
		
	public void setSubscriptionIDPublicSignature(final String subscriptionIDPublicSignature)
	{
		this.subscriptionIDPublicSignature = subscriptionIDPublicSignature;
	}
	
		
	public String getSubscriptionIDPublicSignature() 
	{
		return subscriptionIDPublicSignature;
	}
		
	
}