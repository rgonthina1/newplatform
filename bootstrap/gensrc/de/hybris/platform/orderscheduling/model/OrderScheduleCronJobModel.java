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
package de.hybris.platform.orderscheduling.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OrderScheduleCronJob first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderScheduleCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderScheduleCronJob";
	
	/**<i>Generated relation code constant for relation <code>Order2OrderScheduleCronJob</code> defining source attribute <code>order</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDER2ORDERSCHEDULECRONJOB = "Order2OrderScheduleCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderScheduleCronJob.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderScheduleCronJob.order</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _order;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderScheduleCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderScheduleCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public OrderScheduleCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public OrderScheduleCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderScheduleCronJob.order</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public OrderModel getOrder()
	{
		if (this._order!=null)
		{
			return _order;
		}
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderScheduleCronJob.order</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
}
