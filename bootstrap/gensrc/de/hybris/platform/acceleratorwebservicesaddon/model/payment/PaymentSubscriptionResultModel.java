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
package de.hybris.platform.acceleratorwebservicesaddon.model.payment;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PaymentSubscriptionResult first defined at extension acceleratorwebservicesaddon.
 * <p>
 * Used for storing subscription result.
 */
@SuppressWarnings("all")
public class PaymentSubscriptionResultModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PaymentSubscriptionResult";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentSubscriptionResult.cartId</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. */
	public static final String CARTID = "cartId";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentSubscriptionResult.success</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. */
	public static final String SUCCESS = "success";
	
	/** <i>Generated constant</i> - Attribute key of <code>PaymentSubscriptionResult.result</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. */
	public static final String RESULT = "result";
	
	
	/** <i>Generated variable</i> - Variable of <code>PaymentSubscriptionResult.cartId</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. */
	private String _cartId;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentSubscriptionResult.success</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. */
	private Boolean _success;
	
	/** <i>Generated variable</i> - Variable of <code>PaymentSubscriptionResult.result</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. */
	private Object _result;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PaymentSubscriptionResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PaymentSubscriptionResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cartId initial attribute declared by type <code>PaymentSubscriptionResult</code> at extension <code>acceleratorwebservicesaddon</code>
	 */
	@Deprecated
	public PaymentSubscriptionResultModel(final String _cartId)
	{
		super();
		setCartId(_cartId);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cartId initial attribute declared by type <code>PaymentSubscriptionResult</code> at extension <code>acceleratorwebservicesaddon</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PaymentSubscriptionResultModel(final String _cartId, final ItemModel _owner)
	{
		super();
		setCartId(_cartId);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSubscriptionResult.cartId</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. 
	 * @return the cartId
	 */
	@Accessor(qualifier = "cartId", type = Accessor.Type.GETTER)
	public String getCartId()
	{
		if (this._cartId!=null)
		{
			return _cartId;
		}
		return _cartId = getPersistenceContext().getValue(CARTID, _cartId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSubscriptionResult.result</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. 
	 * @return the result - Serialized result object
	 */
	@Accessor(qualifier = "result", type = Accessor.Type.GETTER)
	public Object getResult()
	{
		if (this._result!=null)
		{
			return _result;
		}
		return _result = getPersistenceContext().getValue(RESULT, _result);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSubscriptionResult.success</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. 
	 * @return the success - Define if subscription was successful.
	 */
	@Accessor(qualifier = "success", type = Accessor.Type.GETTER)
	public boolean isSuccess()
	{
		return toPrimitive( _success = getPersistenceContext().getValue(SUCCESS, _success));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentSubscriptionResult.cartId</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. 
	 *  
	 * @param value the cartId
	 */
	@Accessor(qualifier = "cartId", type = Accessor.Type.SETTER)
	public void setCartId(final String value)
	{
		_cartId = getPersistenceContext().setValue(CARTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentSubscriptionResult.result</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. 
	 *  
	 * @param value the result - Serialized result object
	 */
	@Accessor(qualifier = "result", type = Accessor.Type.SETTER)
	public void setResult(final Object value)
	{
		_result = getPersistenceContext().setValue(RESULT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PaymentSubscriptionResult.success</code> attribute defined at extension <code>acceleratorwebservicesaddon</code>. 
	 *  
	 * @param value the success - Define if subscription was successful.
	 */
	@Accessor(qualifier = "success", type = Accessor.Type.SETTER)
	public void setSuccess(final boolean value)
	{
		_success = getPersistenceContext().setValue(SUCCESS, toObject(value));
	}
	
}
