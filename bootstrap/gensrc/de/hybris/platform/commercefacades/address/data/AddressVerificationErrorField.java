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
package de.hybris.platform.commercefacades.address.data;

public class AddressVerificationErrorField  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AddressVerificationErrorField.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>AddressVerificationErrorField.missing</code> property defined at extension <code>commercefacades</code>. */
	private boolean missing;
	/** <i>Generated property</i> for <code>AddressVerificationErrorField.invalid</code> property defined at extension <code>commercefacades</code>. */
	private boolean invalid;
		
	public AddressVerificationErrorField()
	{
		// default constructor
	}
	
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setMissing(final boolean missing)
	{
		this.missing = missing;
	}
	
		
	public boolean isMissing() 
	{
		return missing;
	}
		
		
	public void setInvalid(final boolean invalid)
	{
		this.invalid = invalid;
	}
	
		
	public boolean isInvalid() 
	{
		return invalid;
	}
		
	
}