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
package de.hybris.platform.commercewebservicescommons.dto.storesession;

import de.hybris.platform.commercewebservicescommons.dto.storesession.CurrencyWsDTO;
import java.util.List;

public class CurrencyListWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>CurrencyListWsDTO.currencies</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<CurrencyWsDTO> currencies;
		
	public CurrencyListWsDTO()
	{
		// default constructor
	}
	
		
	public void setCurrencies(final List<CurrencyWsDTO> currencies)
	{
		this.currencies = currencies;
	}
	
		
	public List<CurrencyWsDTO> getCurrencies() 
	{
		return currencies;
	}
		
	
}