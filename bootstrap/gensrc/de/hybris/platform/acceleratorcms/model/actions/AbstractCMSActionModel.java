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
package de.hybris.platform.acceleratorcms.model.actions;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type AbstractCMSAction first defined at extension acceleratorcms.
 */
@SuppressWarnings("all")
public class AbstractCMSActionModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractCMSAction";
	
	/**<i>Generated relation code constant for relation <code>CmsActionsForCmsComponents</code> defining source attribute <code>components</code> in extension <code>acceleratorcms</code>.</i>*/
	public final static String _CMSACTIONSFORCMSCOMPONENTS = "CmsActionsForCmsComponents";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSAction.url</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String URL = "url";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractCMSAction.components</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String COMPONENTS = "components";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSAction.url</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _url;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSAction.components</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Collection<AbstractCMSComponentModel> _components;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractCMSActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractCMSActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AbstractCMSActionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public AbstractCMSActionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSAction.components</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the components
	 */
	@Accessor(qualifier = "components", type = Accessor.Type.GETTER)
	public Collection<AbstractCMSComponentModel> getComponents()
	{
		if (this._components!=null)
		{
			return _components;
		}
		return _components = getPersistenceContext().getValue(COMPONENTS, _components);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCMSAction.url</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the url
	 */
	@Accessor(qualifier = "url", type = Accessor.Type.GETTER)
	public String getUrl()
	{
		if (this._url!=null)
		{
			return _url;
		}
		return _url = getPersistenceContext().getValue(URL, _url);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSAction.components</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the components
	 */
	@Accessor(qualifier = "components", type = Accessor.Type.SETTER)
	public void setComponents(final Collection<AbstractCMSComponentModel> value)
	{
		_components = getPersistenceContext().setValue(COMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractCMSAction.url</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the url
	 */
	@Accessor(qualifier = "url", type = Accessor.Type.SETTER)
	public void setUrl(final String value)
	{
		_url = getPersistenceContext().setValue(URL, value);
	}
	
}
