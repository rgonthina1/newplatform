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
package de.hybris.liveeditaddon.admin;

import de.hybris.liveeditaddon.admin.ComponentAdminMenuItemData;
import de.hybris.liveeditaddon.enums.CMSComponentAdminActionGroup;
import java.util.List;

public class ComponentAdminMenuGroupData extends ComponentAdminMenuItemData 
{

	/** <i>Generated property</i> for <code>ComponentAdminMenuGroupData.actionGroupType</code> property defined at extension <code>liveeditaddon</code>. */
	private CMSComponentAdminActionGroup actionGroupType;
	/** <i>Generated property</i> for <code>ComponentAdminMenuGroupData.items</code> property defined at extension <code>liveeditaddon</code>. */
	private List<ComponentAdminMenuItemData> items;
		
	public ComponentAdminMenuGroupData()
	{
		// default constructor
	}
	
		
	public void setActionGroupType(final CMSComponentAdminActionGroup actionGroupType)
	{
		this.actionGroupType = actionGroupType;
	}
	
		
	public CMSComponentAdminActionGroup getActionGroupType() 
	{
		return actionGroupType;
	}
		
		
	public void setItems(final List<ComponentAdminMenuItemData> items)
	{
		this.items = items;
	}
	
		
	public List<ComponentAdminMenuItemData> getItems() 
	{
		return items;
	}
		
	
}