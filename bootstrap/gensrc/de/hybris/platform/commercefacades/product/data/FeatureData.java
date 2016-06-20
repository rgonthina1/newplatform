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

import de.hybris.platform.commercefacades.product.data.FeatureUnitData;
import de.hybris.platform.commercefacades.product.data.FeatureValueData;
import java.util.Collection;

public class FeatureData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>FeatureData.featureUnit</code> property defined at extension <code>commercefacades</code>. */
	private FeatureUnitData featureUnit;
	/** <i>Generated property</i> for <code>FeatureData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>FeatureData.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>FeatureData.description</code> property defined at extension <code>commercefacades</code>. */
	private String description;
	/** <i>Generated property</i> for <code>FeatureData.range</code> property defined at extension <code>commercefacades</code>. */
	private boolean range;
	/** <i>Generated property</i> for <code>FeatureData.type</code> property defined at extension <code>commercefacades</code>. */
	private String type;
	/** <i>Generated property</i> for <code>FeatureData.comparable</code> property defined at extension <code>commercefacades</code>. */
	private boolean comparable;
	/** <i>Generated property</i> for <code>FeatureData.featureValues</code> property defined at extension <code>commercefacades</code>. */
	private Collection<FeatureValueData> featureValues;
		
	public FeatureData()
	{
		// default constructor
	}
	
		
	public void setFeatureUnit(final FeatureUnitData featureUnit)
	{
		this.featureUnit = featureUnit;
	}
	
		
	public FeatureUnitData getFeatureUnit() 
	{
		return featureUnit;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setRange(final boolean range)
	{
		this.range = range;
	}
	
		
	public boolean isRange() 
	{
		return range;
	}
		
		
	public void setType(final String type)
	{
		this.type = type;
	}
	
		
	public String getType() 
	{
		return type;
	}
		
		
	public void setComparable(final boolean comparable)
	{
		this.comparable = comparable;
	}
	
		
	public boolean isComparable() 
	{
		return comparable;
	}
		
		
	public void setFeatureValues(final Collection<FeatureValueData> featureValues)
	{
		this.featureValues = featureValues;
	}
	
		
	public Collection<FeatureValueData> getFeatureValues() 
	{
		return featureValues;
	}
		
	
}