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
package de.hybris.platform.commerceservices.search.solrfacetsearch.data;

public class IndexedPropertyValueData<INDEXED_PROPERTY_TYPE>  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexedPropertyValueData<INDEXED_PROPERTY_TYPE>.indexedProperty</code> property defined at extension <code>commerceservices</code>. */
	private INDEXED_PROPERTY_TYPE indexedProperty;
	/** <i>Generated property</i> for <code>IndexedPropertyValueData<INDEXED_PROPERTY_TYPE>.value</code> property defined at extension <code>commerceservices</code>. */
	private String value;
		
	public IndexedPropertyValueData()
	{
		// default constructor
	}
	
		
	public void setIndexedProperty(final INDEXED_PROPERTY_TYPE indexedProperty)
	{
		this.indexedProperty = indexedProperty;
	}
	
		
	public INDEXED_PROPERTY_TYPE getIndexedProperty() 
	{
		return indexedProperty;
	}
		
		
	public void setValue(final String value)
	{
		this.value = value;
	}
	
		
	public String getValue() 
	{
		return value;
	}
		
	
}