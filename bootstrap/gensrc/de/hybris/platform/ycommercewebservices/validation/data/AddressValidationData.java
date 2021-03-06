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
package de.hybris.platform.ycommercewebservices.validation.data;

import de.hybris.platform.commercewebservicescommons.dto.error.ErrorListWsDTO;
import de.hybris.platform.ycommercewebservices.user.data.AddressDataList;

public class AddressValidationData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>AddressValidationData.decision</code> property defined at extension <code>ycommercewebservices</code>. */
	private String decision;
	/** <i>Generated property</i> for <code>AddressValidationData.suggestedAddressesList</code> property defined at extension <code>ycommercewebservices</code>. */
	private AddressDataList suggestedAddressesList;
	/** <i>Generated property</i> for <code>AddressValidationData.errors</code> property defined at extension <code>ycommercewebservices</code>. */
	private ErrorListWsDTO errors;
		
	public AddressValidationData()
	{
		// default constructor
	}
	
		
	public void setDecision(final String decision)
	{
		this.decision = decision;
	}
	
		
	public String getDecision() 
	{
		return decision;
	}
		
		
	public void setSuggestedAddressesList(final AddressDataList suggestedAddressesList)
	{
		this.suggestedAddressesList = suggestedAddressesList;
	}
	
		
	public AddressDataList getSuggestedAddressesList() 
	{
		return suggestedAddressesList;
	}
		
		
	public void setErrors(final ErrorListWsDTO errors)
	{
		this.errors = errors;
	}
	
		
	public ErrorListWsDTO getErrors() 
	{
		return errors;
	}
		
	
}