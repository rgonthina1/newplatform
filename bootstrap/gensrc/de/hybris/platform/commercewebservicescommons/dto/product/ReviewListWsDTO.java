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

import de.hybris.platform.commercewebservicescommons.dto.product.ReviewWsDTO;
import java.util.List;

public class ReviewListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>ReviewListWsDTO.reviews</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<ReviewWsDTO> reviews;
		
	public ReviewListWsDTO()
	{
		// default constructor
	}
	
		
	public void setReviews(final List<ReviewWsDTO> reviews)
	{
		this.reviews = reviews;
	}
	
		
	public List<ReviewWsDTO> getReviews() 
	{
		return reviews;
	}
		
	
}