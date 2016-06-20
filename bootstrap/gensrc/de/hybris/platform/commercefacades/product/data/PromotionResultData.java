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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.order.data.PromotionOrderEntryConsumedData;
import de.hybris.platform.commercefacades.product.data.PromotionData;
import java.util.List;

public class PromotionResultData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PromotionResultData.consumedEntries</code> property defined at extension <code>commercefacades</code>. */
	private List<PromotionOrderEntryConsumedData> consumedEntries;
	/** <i>Generated property</i> for <code>PromotionResultData.promotionData</code> property defined at extension <code>commercefacades</code>. */
	private PromotionData promotionData;
	/** <i>Generated property</i> for <code>PromotionResultData.description</code> property defined at extension <code>commercefacades</code>. */
	private String description;
		
	public PromotionResultData()
	{
		// default constructor
	}
	
		
	public void setConsumedEntries(final List<PromotionOrderEntryConsumedData> consumedEntries)
	{
		this.consumedEntries = consumedEntries;
	}
	
		
	public List<PromotionOrderEntryConsumedData> getConsumedEntries() 
	{
		return consumedEntries;
	}
		
		
	public void setPromotionData(final PromotionData promotionData)
	{
		this.promotionData = promotionData;
	}
	
		
	public PromotionData getPromotionData() 
	{
		return promotionData;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
	
}