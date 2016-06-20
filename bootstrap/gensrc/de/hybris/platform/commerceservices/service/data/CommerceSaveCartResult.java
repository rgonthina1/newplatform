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
package de.hybris.platform.commerceservices.service.data;

import de.hybris.platform.core.model.order.CartModel;

public class CommerceSaveCartResult  implements java.io.Serializable 
{

	/** The CartModel that was saved<br/><br/><i>Generated property</i> for <code>CommerceSaveCartResult.savedCart</code> property defined at extension <code>commerceservices</code>. */
	private CartModel savedCart;
		
	public CommerceSaveCartResult()
	{
		// default constructor
	}
	
		
	public void setSavedCart(final CartModel savedCart)
	{
		this.savedCart = savedCart;
	}
	
		
	public CartModel getSavedCart() 
	{
		return savedCart;
	}
		
	
}