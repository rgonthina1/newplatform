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
package de.hybris.platform.ycommercewebservices.product.data;

import de.hybris.platform.commercefacades.product.data.PromotionResultData;
import java.util.List;

public class PromotionResultDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PromotionResultDataList.promotions</code> property defined at extension <code>ycommercewebservices</code>. */
	private List<PromotionResultData> promotions;
		
	public PromotionResultDataList()
	{
		// default constructor
	}
	
		
	public void setPromotions(final List<PromotionResultData> promotions)
	{
		this.promotions = promotions;
	}
	
		
	public List<PromotionResultData> getPromotions() 
	{
		return promotions;
	}
		
	
}