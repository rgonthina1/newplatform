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
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.product.data.VariantCategoryData;
import java.util.Collection;

public class VariantValueCategoryData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VariantValueCategoryData.superCategories</code> property defined at extension <code>commercefacades</code>. */
	private Collection<VariantCategoryData> superCategories;
	/** <i>Generated property</i> for <code>VariantValueCategoryData.sequence</code> property defined at extension <code>commercefacades</code>. */
	private int sequence;
	/** <i>Generated property</i> for <code>VariantValueCategoryData.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
		
	public VariantValueCategoryData()
	{
		// default constructor
	}
	
		
	public void setSuperCategories(final Collection<VariantCategoryData> superCategories)
	{
		this.superCategories = superCategories;
	}
	
		
	public Collection<VariantCategoryData> getSuperCategories() 
	{
		return superCategories;
	}
		
		
	public void setSequence(final int sequence)
	{
		this.sequence = sequence;
	}
	
		
	public int getSequence() 
	{
		return sequence;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
	
}