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

import de.hybris.platform.acceleratorservices.payment.data.HostedOrderPageResult;

public class AbstractPaymentResult extends HostedOrderPageResult 
{

	/** <i>Generated property</i> for <code>AbstractPaymentResult.transactionSignatureVerified</code> property defined at extension <code>acceleratorservices</code>. */
	private Boolean transactionSignatureVerified;
	/** <i>Generated property</i> for <code>AbstractPaymentResult.decision</code> property defined at extension <code>acceleratorservices</code>. */
	private String decision;
	/** <i>Generated property</i> for <code>AbstractPaymentResult.decisionPublicSignature</code> property defined at extension <code>acceleratorservices</code>. */
	private String decisionPublicSignature;
		
	public AbstractPaymentResult()
	{
		// default constructor
	}
	
		
	public void setTransactionSignatureVerified(final Boolean transactionSignatureVerified)
	{
		this.transactionSignatureVerified = transactionSignatureVerified;
	}
	
		
	public Boolean getTransactionSignatureVerified() 
	{
		return transactionSignatureVerified;
	}
		
		
	public void setDecision(final String decision)
	{
		this.decision = decision;
	}
	
		
	public String getDecision() 
	{
		return decision;
	}
		
		
	public void setDecisionPublicSignature(final String decisionPublicSignature)
	{
		this.decisionPublicSignature = decisionPublicSignature;
	}
	
		
	public String getDecisionPublicSignature() 
	{
		return decisionPublicSignature;
	}
		
	
}