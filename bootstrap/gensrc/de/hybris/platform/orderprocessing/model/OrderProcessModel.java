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
package de.hybris.platform.orderprocessing.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type OrderProcess first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderProcessModel extends BusinessProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "OrderProcess";
	
	/**<i>Generated relation code constant for relation <code>Order2OrderProcess</code> defining source attribute <code>order</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _ORDER2ORDERPROCESS = "Order2OrderProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderProcess.order</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>OrderProcess.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTPROCESSES = "consignmentProcesses";
	
	
	/** <i>Generated variable</i> - Variable of <code>OrderProcess.order</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>OrderProcess.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. */
	private Collection<ConsignmentProcessModel> _consignmentProcesses;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public OrderProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public OrderProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignmentProcesses
	 */
	@Accessor(qualifier = "consignmentProcesses", type = Accessor.Type.GETTER)
	public Collection<ConsignmentProcessModel> getConsignmentProcesses()
	{
		if (this._consignmentProcesses!=null)
		{
			return _consignmentProcesses;
		}
		return _consignmentProcesses = getPersistenceContext().getValue(CONSIGNMENTPROCESSES, _consignmentProcesses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.order</code> attribute defined at extension <code>basecommerce</code>. 
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
	 * <i>Generated method</i> - Setter of <code>OrderProcess.consignmentProcesses</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignmentProcesses
	 */
	@Accessor(qualifier = "consignmentProcesses", type = Accessor.Type.SETTER)
	public void setConsignmentProcesses(final Collection<ConsignmentProcessModel> value)
	{
		_consignmentProcesses = getPersistenceContext().setValue(CONSIGNMENTPROCESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>OrderProcess.order</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final OrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
}
