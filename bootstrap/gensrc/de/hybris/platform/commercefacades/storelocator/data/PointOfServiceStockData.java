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
package de.hybris.platform.commercefacades.storelocator.data;

import de.hybris.platform.commercefacades.product.data.StockData;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;

public class PointOfServiceStockData extends PointOfServiceData 
{

	/** <i>Generated property</i> for <code>PointOfServiceStockData.stockData</code> property defined at extension <code>commercefacades</code>. */
	private StockData stockData;
		
	public PointOfServiceStockData()
	{
		// default constructor
	}
	
		
	public void setStockData(final StockData stockData)
	{
		this.stockData = stockData;
	}
	
		
	public StockData getStockData() 
	{
		return stockData;
	}
		
	
}