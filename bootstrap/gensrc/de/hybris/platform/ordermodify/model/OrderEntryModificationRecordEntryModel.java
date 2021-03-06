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
package de.hybris.platform.ordermodify.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OrderEntryModificationRecordEntry first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderEntryModificationRecordEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderEntryModificationRecordEntry";
	
	/**<i>Generated relation code constant for relation <code>OrderModificationRecordEntry2OrderEntryModificationRecordEntry</code> defining source attribute <code>modificationRecordEntry</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDERMODIFICATIONRECORDENTRY2ORDERENTRYMODIFICATIONRECORDENTRY = "OrderModificationRecordEntry2OrderEntryModificationRecordEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NOTES = "notes";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryModificationRecordEntry.originalOrderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORIGINALORDERENTRY = "originalOrderEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryModificationRecordEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERENTRY = "orderEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderEntryModificationRecordEntry.modificationRecordEntry</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MODIFICATIONRECORDENTRY = "modificationRecordEntry";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. */
	private String _notes;
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.originalOrderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderEntryModel _originalOrderEntry;
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderEntryModel _orderEntry;
	
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.modificationRecordEntry</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModificationRecordEntryModel _modificationRecordEntry;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderEntryModificationRecordEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderEntryModificationRecordEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _modificationRecordEntry initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 */
	@Deprecated
	public OrderEntryModificationRecordEntryModel(final String _code, final OrderModificationRecordEntryModel _modificationRecordEntry)
	{
		super();
		setCode(_code);
		setModificationRecordEntry(_modificationRecordEntry);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _modificationRecordEntry initial attribute declared by type <code>OrderEntryModificationRecordEntry</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OrderEntryModificationRecordEntryModel(final String _code, final OrderModificationRecordEntryModel _modificationRecordEntry, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setModificationRecordEntry(_modificationRecordEntry);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryModificationRecordEntry.modificationRecordEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the modificationRecordEntry
	 */
	@Accessor(qualifier = "modificationRecordEntry", type = Accessor.Type.GETTER)
	public OrderModificationRecordEntryModel getModificationRecordEntry()
	{
		if (this._modificationRecordEntry!=null)
		{
			return _modificationRecordEntry;
		}
		return _modificationRecordEntry = getPersistenceContext().getValue(MODIFICATIONRECORDENTRY, _modificationRecordEntry);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the notes
	 */
	@Accessor(qualifier = "notes", type = Accessor.Type.GETTER)
	public String getNotes()
	{
		if (this._notes!=null)
		{
			return _notes;
		}
		return _notes = getPersistenceContext().getValue(NOTES, _notes);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryModificationRecordEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the orderEntry
	 */
	@Accessor(qualifier = "orderEntry", type = Accessor.Type.GETTER)
	public OrderEntryModel getOrderEntry()
	{
		if (this._orderEntry!=null)
		{
			return _orderEntry;
		}
		return _orderEntry = getPersistenceContext().getValue(ORDERENTRY, _orderEntry);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntryModificationRecordEntry.originalOrderEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the originalOrderEntry
	 */
	@Accessor(qualifier = "originalOrderEntry", type = Accessor.Type.GETTER)
	public OrderEntryModel getOriginalOrderEntry()
	{
		if (this._originalOrderEntry!=null)
		{
			return _originalOrderEntry;
		}
		return _originalOrderEntry = getPersistenceContext().getValue(ORIGINALORDERENTRY, _originalOrderEntry);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>OrderEntryModificationRecordEntry.code</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryModificationRecordEntry.modificationRecordEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the modificationRecordEntry
	 */
	@Accessor(qualifier = "modificationRecordEntry", type = Accessor.Type.SETTER)
	public void setModificationRecordEntry(final OrderModificationRecordEntryModel value)
	{
		_modificationRecordEntry = getPersistenceContext().setValue(MODIFICATIONRECORDENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryModificationRecordEntry.notes</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the notes
	 */
	@Accessor(qualifier = "notes", type = Accessor.Type.SETTER)
	public void setNotes(final String value)
	{
		_notes = getPersistenceContext().setValue(NOTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryModificationRecordEntry.orderEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderEntry
	 */
	@Accessor(qualifier = "orderEntry", type = Accessor.Type.SETTER)
	public void setOrderEntry(final OrderEntryModel value)
	{
		_orderEntry = getPersistenceContext().setValue(ORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderEntryModificationRecordEntry.originalOrderEntry</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the originalOrderEntry
	 */
	@Accessor(qualifier = "originalOrderEntry", type = Accessor.Type.SETTER)
	public void setOriginalOrderEntry(final OrderEntryModel value)
	{
		_originalOrderEntry = getPersistenceContext().setValue(ORIGINALORDERENTRY, value);
	}
	
}
