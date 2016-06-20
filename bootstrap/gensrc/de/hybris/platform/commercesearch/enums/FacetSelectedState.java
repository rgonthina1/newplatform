/*
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.commercesearch.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum FacetSelectedState declared at extension commercesearch.
 */
@SuppressWarnings("PMD")
public enum FacetSelectedState implements HybrisEnumValue
{
	/**
	 * Generated enum value for FacetSelectedState.SELECTED declared at extension commercesearch.
	 */
	SELECTED("SELECTED"),
	/**
	 * Generated enum value for FacetSelectedState.UNSELECTED declared at extension commercesearch.
	 */
	UNSELECTED("UNSELECTED");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FacetSelectedState";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "FacetSelectedState";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FacetSelectedState(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
