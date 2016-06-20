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
package de.hybris.liveeditaddon.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum DeviceOrientation declared at extension liveeditaddon.
 */
@SuppressWarnings("PMD")
public enum DeviceOrientation implements HybrisEnumValue
{
	/**
	 * Generated enum value for DeviceOrientation.Horizontal declared at extension liveeditaddon.
	 */
	HORIZONTAL("Horizontal"),
	/**
	 * Generated enum value for DeviceOrientation.Vertical declared at extension liveeditaddon.
	 */
	VERTICAL("Vertical");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DeviceOrientation";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "DeviceOrientation";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private DeviceOrientation(final String code)
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
