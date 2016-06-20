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
package de.hybris.platform.ycommercewebservices.voucher.data;

import de.hybris.platform.commercefacades.voucher.data.VoucherData;
import java.util.List;

public class VoucherDataList  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VoucherDataList.vouchers</code> property defined at extension <code>ycommercewebservices</code>. */
	private List<VoucherData> vouchers;
		
	public VoucherDataList()
	{
		// default constructor
	}
	
		
	public void setVouchers(final List<VoucherData> vouchers)
	{
		this.vouchers = vouchers;
	}
	
		
	public List<VoucherData> getVouchers() 
	{
		return vouchers;
	}
		
	
}