/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20 Jun, 2016 7:36:24 PM                     ---
 * ----------------------------------------------------------------
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
package de.hybris.platform.ticket.events.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEntryModel;

/**
 * Generated model class for type CsTicketChangeEventStringEntry first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketChangeEventStringEntryModel extends CsTicketChangeEventEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CsTicketChangeEventStringEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventStringEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String OLDVALUE = "oldValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventStringEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String NEWVALUE = "newValue";
	
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventStringEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _oldValue;
	
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventStringEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. */
	private String _newValue;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketChangeEventStringEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketChangeEventStringEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CsTicketChangeEventStringEntryModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventStringEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the newValue
	 */
	@Accessor(qualifier = "newValue", type = Accessor.Type.GETTER)
	public String getNewValue()
	{
		if (this._newValue!=null)
		{
			return _newValue;
		}
		return _newValue = getPersistenceContext().getValue(NEWVALUE, _newValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventStringEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the oldValue
	 */
	@Accessor(qualifier = "oldValue", type = Accessor.Type.GETTER)
	public String getOldValue()
	{
		if (this._oldValue!=null)
		{
			return _oldValue;
		}
		return _oldValue = getPersistenceContext().getValue(OLDVALUE, _oldValue);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventStringEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the newValue
	 */
	@Accessor(qualifier = "newValue", type = Accessor.Type.SETTER)
	public void setNewValue(final String value)
	{
		_newValue = getPersistenceContext().setValue(NEWVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventStringEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the oldValue
	 */
	@Accessor(qualifier = "oldValue", type = Accessor.Type.SETTER)
	public void setOldValue(final String value)
	{
		_oldValue = getPersistenceContext().setValue(OLDVALUE, value);
	}
	
}
