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
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;

public class ReferenceWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ReferenceWsDTO.quantity</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer quantity;
	/** <i>Generated property</i> for <code>ReferenceWsDTO.referenceType</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String referenceType;
	/** <i>Generated property</i> for <code>ReferenceWsDTO.description</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String description;
	/** <i>Generated property</i> for <code>ReferenceWsDTO.target</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ProductWsDTO target;
		
	public ReferenceWsDTO()
	{
		// default constructor
	}
	
		
	public void setQuantity(final Integer quantity)
	{
		this.quantity = quantity;
	}
	
		
	public Integer getQuantity() 
	{
		return quantity;
	}
		
		
	public void setReferenceType(final String referenceType)
	{
		this.referenceType = referenceType;
	}
	
		
	public String getReferenceType() 
	{
		return referenceType;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setTarget(final ProductWsDTO target)
	{
		this.target = target;
	}
	
		
	public ProductWsDTO getTarget() 
	{
		return target;
	}
		
	
}