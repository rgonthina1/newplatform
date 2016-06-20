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

import de.hybris.platform.commercefacades.storelocator.data.SpecialOpeningDayData;
import de.hybris.platform.commercefacades.storelocator.data.WeekdayOpeningDayData;
import java.util.List;

public class OpeningScheduleData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OpeningScheduleData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>OpeningScheduleData.specialDayOpeningList</code> property defined at extension <code>commercefacades</code>. */
	private List<SpecialOpeningDayData> specialDayOpeningList;
	/** <i>Generated property</i> for <code>OpeningScheduleData.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>OpeningScheduleData.weekDayOpeningList</code> property defined at extension <code>commercefacades</code>. */
	private List<WeekdayOpeningDayData> weekDayOpeningList;
		
	public OpeningScheduleData()
	{
		// default constructor
	}
	
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setSpecialDayOpeningList(final List<SpecialOpeningDayData> specialDayOpeningList)
	{
		this.specialDayOpeningList = specialDayOpeningList;
	}
	
		
	public List<SpecialOpeningDayData> getSpecialDayOpeningList() 
	{
		return specialDayOpeningList;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setWeekDayOpeningList(final List<WeekdayOpeningDayData> weekDayOpeningList)
	{
		this.weekDayOpeningList = weekDayOpeningList;
	}
	
		
	public List<WeekdayOpeningDayData> getWeekDayOpeningList() 
	{
		return weekDayOpeningList;
	}
		
	
}