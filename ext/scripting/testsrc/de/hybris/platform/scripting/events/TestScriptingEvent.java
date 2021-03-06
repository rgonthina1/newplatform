/*
 * 
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package de.hybris.platform.scripting.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * Test event for scripted event listeners
 */
public class TestScriptingEvent extends AbstractEvent
{
	private final String eventName;

	public TestScriptingEvent(final String eventName)
	{
		super();
		this.eventName = eventName;
	}

	public String getEventName()
	{
		return eventName;
	}

}
