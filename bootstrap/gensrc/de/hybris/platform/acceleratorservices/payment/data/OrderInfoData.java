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
package de.hybris.platform.acceleratorservices.payment.data;

public class OrderInfoData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OrderInfoData.orderPageRequestToken</code> property defined at extension <code>acceleratorservices</code>. */
	private String orderPageRequestToken;
	/** <i>Generated property</i> for <code>OrderInfoData.orderPageIgnoreAVS</code> property defined at extension <code>acceleratorservices</code>. */
	private Boolean orderPageIgnoreAVS;
	/** <i>Generated property</i> for <code>OrderInfoData.orderPageIgnoreCVN</code> property defined at extension <code>acceleratorservices</code>. */
	private Boolean orderPageIgnoreCVN;
	/** <i>Generated property</i> for <code>OrderInfoData.comments</code> property defined at extension <code>acceleratorservices</code>. */
	private String comments;
	/** <i>Generated property</i> for <code>OrderInfoData.orderNumber</code> property defined at extension <code>acceleratorservices</code>. */
	private String orderNumber;
	/** <i>Generated property</i> for <code>OrderInfoData.orderPageTransactionType</code> property defined at extension <code>acceleratorservices</code>. */
	private String orderPageTransactionType;
	/** <i>Generated property</i> for <code>OrderInfoData.subscriptionTitle</code> property defined at extension <code>acceleratorservices</code>. */
	private String subscriptionTitle;
	/** <i>Generated property</i> for <code>OrderInfoData.taxAmount</code> property defined at extension <code>acceleratorservices</code>. */
	private String taxAmount;
	/** <i>Generated property</i> for <code>OrderInfoData.recurringSubscriptionInfoPublicSignature</code> property defined at extension <code>acceleratorservices</code>. */
	private String recurringSubscriptionInfoPublicSignature;
		
	public OrderInfoData()
	{
		// default constructor
	}
	
		
	public void setOrderPageRequestToken(final String orderPageRequestToken)
	{
		this.orderPageRequestToken = orderPageRequestToken;
	}
	
		
	public String getOrderPageRequestToken() 
	{
		return orderPageRequestToken;
	}
		
		
	public void setOrderPageIgnoreAVS(final Boolean orderPageIgnoreAVS)
	{
		this.orderPageIgnoreAVS = orderPageIgnoreAVS;
	}
	
		
	public Boolean getOrderPageIgnoreAVS() 
	{
		return orderPageIgnoreAVS;
	}
		
		
	public void setOrderPageIgnoreCVN(final Boolean orderPageIgnoreCVN)
	{
		this.orderPageIgnoreCVN = orderPageIgnoreCVN;
	}
	
		
	public Boolean getOrderPageIgnoreCVN() 
	{
		return orderPageIgnoreCVN;
	}
		
		
	public void setComments(final String comments)
	{
		this.comments = comments;
	}
	
		
	public String getComments() 
	{
		return comments;
	}
		
		
	public void setOrderNumber(final String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	
		
	public String getOrderNumber() 
	{
		return orderNumber;
	}
		
		
	public void setOrderPageTransactionType(final String orderPageTransactionType)
	{
		this.orderPageTransactionType = orderPageTransactionType;
	}
	
		
	public String getOrderPageTransactionType() 
	{
		return orderPageTransactionType;
	}
		
		
	public void setSubscriptionTitle(final String subscriptionTitle)
	{
		this.subscriptionTitle = subscriptionTitle;
	}
	
		
	public String getSubscriptionTitle() 
	{
		return subscriptionTitle;
	}
		
		
	public void setTaxAmount(final String taxAmount)
	{
		this.taxAmount = taxAmount;
	}
	
		
	public String getTaxAmount() 
	{
		return taxAmount;
	}
		
		
	public void setRecurringSubscriptionInfoPublicSignature(final String recurringSubscriptionInfoPublicSignature)
	{
		this.recurringSubscriptionInfoPublicSignature = recurringSubscriptionInfoPublicSignature;
	}
	
		
	public String getRecurringSubscriptionInfoPublicSignature() 
	{
		return recurringSubscriptionInfoPublicSignature;
	}
		
	
}