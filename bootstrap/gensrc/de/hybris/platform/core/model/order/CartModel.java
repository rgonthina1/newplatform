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
package de.hybris.platform.core.model.order;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type Cart first defined at extension core.
 */
@SuppressWarnings("all")
public class CartModel extends AbstractOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Cart";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.sessionId</code> attribute defined at extension <code>core</code>. */
	public static final String SESSIONID = "sessionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CARTTOORDERCRONJOB = "cartToOrderCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.expirationTime</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String EXPIRATIONTIME = "expirationTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.saveTime</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SAVETIME = "saveTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.name</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.description</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>Cart.savedBy</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SAVEDBY = "savedBy";
	
	
	/** <i>Generated variable</i> - Variable of <code>Cart.sessionId</code> attribute defined at extension <code>core</code>. */
	private String _sessionId;
	
	/** <i>Generated variable</i> - Variable of <code>Cart.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<CartToOrderCronJobModel> _cartToOrderCronJob;
	
	/** <i>Generated variable</i> - Variable of <code>Cart.expirationTime</code> attribute defined at extension <code>commerceservices</code>. */
	private Date _expirationTime;
	
	/** <i>Generated variable</i> - Variable of <code>Cart.saveTime</code> attribute defined at extension <code>commerceservices</code>. */
	private Date _saveTime;
	
	/** <i>Generated variable</i> - Variable of <code>Cart.name</code> attribute defined at extension <code>commerceservices</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>Cart.description</code> attribute defined at extension <code>commerceservices</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>Cart.savedBy</code> attribute defined at extension <code>commerceservices</code>. */
	private UserModel _savedBy;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CartModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CartModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 */
	@Deprecated
	public CartModel(final CurrencyModel _currency, final Date _date, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setUser(_user);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 */
	@Deprecated
	public CartModel(final CurrencyModel _currency, final Date _date, final ItemModel _owner, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOwner(_owner);
		setUser(_user);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cartToOrderCronJob
	 */
	@Accessor(qualifier = "cartToOrderCronJob", type = Accessor.Type.GETTER)
	public Collection<CartToOrderCronJobModel> getCartToOrderCronJob()
	{
		if (this._cartToOrderCronJob!=null)
		{
			return _cartToOrderCronJob;
		}
		return _cartToOrderCronJob = getPersistenceContext().getValue(CARTTOORDERCRONJOB, _cartToOrderCronJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.description</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the description - The description of the saved cart provided by user or auto-generated.
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription()
	{
		if (this._description!=null)
		{
			return _description;
		}
		return _description = getPersistenceContext().getValue(DESCRIPTION, _description);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.expirationTime</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the expirationTime - The date/time when the saved cart will expire
	 */
	@Accessor(qualifier = "expirationTime", type = Accessor.Type.GETTER)
	public Date getExpirationTime()
	{
		if (this._expirationTime!=null)
		{
			return _expirationTime;
		}
		return _expirationTime = getPersistenceContext().getValue(EXPIRATIONTIME, _expirationTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.name</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the name - The name of the saved cart provided by user or auto-generated.
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.savedBy</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the savedBy - The user who saved the cart.
	 */
	@Accessor(qualifier = "savedBy", type = Accessor.Type.GETTER)
	public UserModel getSavedBy()
	{
		if (this._savedBy!=null)
		{
			return _savedBy;
		}
		return _savedBy = getPersistenceContext().getValue(SAVEDBY, _savedBy);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.saveTime</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the saveTime - The date/time when the cart was saved.
	 */
	@Accessor(qualifier = "saveTime", type = Accessor.Type.GETTER)
	public Date getSaveTime()
	{
		if (this._saveTime!=null)
		{
			return _saveTime;
		}
		return _saveTime = getPersistenceContext().getValue(SAVETIME, _saveTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.sessionId</code> attribute defined at extension <code>core</code>. 
	 * @return the sessionId
	 */
	@Accessor(qualifier = "sessionId", type = Accessor.Type.GETTER)
	public String getSessionId()
	{
		if (this._sessionId!=null)
		{
			return _sessionId;
		}
		return _sessionId = getPersistenceContext().getValue(SESSIONID, _sessionId);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.cartToOrderCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the cartToOrderCronJob
	 */
	@Accessor(qualifier = "cartToOrderCronJob", type = Accessor.Type.SETTER)
	public void setCartToOrderCronJob(final Collection<CartToOrderCronJobModel> value)
	{
		_cartToOrderCronJob = getPersistenceContext().setValue(CARTTOORDERCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.description</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the description - The description of the saved cart provided by user or auto-generated.
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.expirationTime</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the expirationTime - The date/time when the saved cart will expire
	 */
	@Accessor(qualifier = "expirationTime", type = Accessor.Type.SETTER)
	public void setExpirationTime(final Date value)
	{
		_expirationTime = getPersistenceContext().setValue(EXPIRATIONTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.name</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the name - The name of the saved cart provided by user or auto-generated.
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.savedBy</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the savedBy - The user who saved the cart.
	 */
	@Accessor(qualifier = "savedBy", type = Accessor.Type.SETTER)
	public void setSavedBy(final UserModel value)
	{
		_savedBy = getPersistenceContext().setValue(SAVEDBY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.saveTime</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the saveTime - The date/time when the cart was saved.
	 */
	@Accessor(qualifier = "saveTime", type = Accessor.Type.SETTER)
	public void setSaveTime(final Date value)
	{
		_saveTime = getPersistenceContext().setValue(SAVETIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Cart.sessionId</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the sessionId
	 */
	@Accessor(qualifier = "sessionId", type = Accessor.Type.SETTER)
	public void setSessionId(final String value)
	{
		_sessionId = getPersistenceContext().setValue(SESSIONID, value);
	}
	
}
