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
package de.hybris.platform.commercewebservicescommons.dto.store;

import de.hybris.platform.commercewebservicescommons.dto.store.SpecialOpeningDayWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.WeekdayOpeningDayWsDTO;
import java.util.List;

public class OpeningScheduleWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>OpeningScheduleWsDTO.code</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String code;
	/** <i>Generated property</i> for <code>OpeningScheduleWsDTO.specialDayOpeningList</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<SpecialOpeningDayWsDTO> specialDayOpeningList;
	/** <i>Generated property</i> for <code>OpeningScheduleWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String name;
	/** <i>Generated property</i> for <code>OpeningScheduleWsDTO.weekDayOpeningList</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<WeekdayOpeningDayWsDTO> weekDayOpeningList;
		
	public OpeningScheduleWsDTO()
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
		
		
	public void setSpecialDayOpeningList(final List<SpecialOpeningDayWsDTO> specialDayOpeningList)
	{
		this.specialDayOpeningList = specialDayOpeningList;
	}
	
		
	public List<SpecialOpeningDayWsDTO> getSpecialDayOpeningList() 
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
		
		
	public void setWeekDayOpeningList(final List<WeekdayOpeningDayWsDTO> weekDayOpeningList)
	{
		this.weekDayOpeningList = weekDayOpeningList;
	}
	
		
	public List<WeekdayOpeningDayWsDTO> getWeekDayOpeningList() 
	{
		return weekDayOpeningList;
	}
		
	
}