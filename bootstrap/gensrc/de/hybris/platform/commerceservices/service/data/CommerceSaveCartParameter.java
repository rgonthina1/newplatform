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
package de.hybris.platform.commerceservices.service.data;

import de.hybris.platform.core.model.order.CartModel;

public class CommerceSaveCartParameter  implements java.io.Serializable 
{

	/** Should the method hooks be executed<br/><br/><i>Generated property</i> for <code>CommerceSaveCartParameter.enableHooks</code> property defined at extension <code>commerceservices</code>. */
	private boolean enableHooks;
	/** The name of the saved cart provided by user or auto-generated<br/><br/><i>Generated property</i> for <code>CommerceSaveCartParameter.name</code> property defined at extension <code>commerceservices</code>. */
	private String name;
	/** The description of the saved cart provided by user or auto-generated<br/><br/><i>Generated property</i> for <code>CommerceSaveCartParameter.description</code> property defined at extension <code>commerceservices</code>. */
	private String description;
	/** The CartModel to be saved<br/><br/><i>Generated property</i> for <code>CommerceSaveCartParameter.cart</code> property defined at extension <code>commerceservices</code>. */
	private CartModel cart;
		
	public CommerceSaveCartParameter()
	{
		// default constructor
	}
	
		
	public void setEnableHooks(final boolean enableHooks)
	{
		this.enableHooks = enableHooks;
	}
	
		
	public boolean isEnableHooks() 
	{
		return enableHooks;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setCart(final CartModel cart)
	{
		this.cart = cart;
	}
	
		
	public CartModel getCart() 
	{
		return cart;
	}
		
	
}