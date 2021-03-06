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
package de.hybris.platform.ycommercewebservices.model.expressupdate.cron;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ProductExpressUpdateCleanerCronJob first defined at extension ycommercewebservices.
 */
@SuppressWarnings("all")
public class ProductExpressUpdateCleanerCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductExpressUpdateCleanerCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute defined at extension <code>ycommercewebservices</code>. */
	public static final String QUEUETIMELIMIT = "queueTimeLimit";
	
	
	/** <i>Generated variable</i> - Variable of <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute defined at extension <code>ycommercewebservices</code>. */
	private Integer _queueTimeLimit;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductExpressUpdateCleanerCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductExpressUpdateCleanerCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public ProductExpressUpdateCleanerCronJobModel(final JobModel _job)
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
	public ProductExpressUpdateCleanerCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 * @return the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	@Accessor(qualifier = "queueTimeLimit", type = Accessor.Type.GETTER)
	public Integer getQueueTimeLimit()
	{
		if (this._queueTimeLimit!=null)
		{
			return _queueTimeLimit;
		}
		return _queueTimeLimit = getPersistenceContext().getValue(QUEUETIMELIMIT, _queueTimeLimit);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductExpressUpdateCleanerCronJob.queueTimeLimit</code> attribute defined at extension <code>ycommercewebservices</code>. 
	 *  
	 * @param value the queueTimeLimit - Only elements older than specified value (in minutes) will be removed from the queue
	 */
	@Accessor(qualifier = "queueTimeLimit", type = Accessor.Type.SETTER)
	public void setQueueTimeLimit(final Integer value)
	{
		_queueTimeLimit = getPersistenceContext().setValue(QUEUETIMELIMIT, value);
	}
	
}
