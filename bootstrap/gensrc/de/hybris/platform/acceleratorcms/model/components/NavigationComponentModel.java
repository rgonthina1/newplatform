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
package de.hybris.platform.acceleratorcms.model.components;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type NavigationComponent first defined at extension acceleratorcms.
 * <p>
 * It represents navigation component that contains cms navigation node. Nodes structure can be built in a hierarchical way.
 */
@SuppressWarnings("all")
public class NavigationComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "NavigationComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String NAVIGATIONNODE = "navigationNode";
	
	/** <i>Generated constant</i> - Attribute key of <code>NavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String STYLECLASS = "styleClass";
	
	
	/** <i>Generated variable</i> - Variable of <code>NavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CMSNavigationNodeModel _navigationNode;
	
	/** <i>Generated variable</i> - Variable of <code>NavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _styleClass;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public NavigationComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public NavigationComponentModel(final ItemModelContext ctx)
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
	public NavigationComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public NavigationComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the navigationNode - The cms navigation node of this navigation component.
	 */
	@Accessor(qualifier = "navigationNode", type = Accessor.Type.GETTER)
	public CMSNavigationNodeModel getNavigationNode()
	{
		if (this._navigationNode!=null)
		{
			return _navigationNode;
		}
		return _navigationNode = getPersistenceContext().getValue(NAVIGATIONNODE, _navigationNode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the styleClass - CSS style class of this navigation component.
	 */
	@Accessor(qualifier = "styleClass", type = Accessor.Type.GETTER)
	public String getStyleClass()
	{
		if (this._styleClass!=null)
		{
			return _styleClass;
		}
		return _styleClass = getPersistenceContext().getValue(STYLECLASS, _styleClass);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationComponent.navigationNode</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the navigationNode - The cms navigation node of this navigation component.
	 */
	@Accessor(qualifier = "navigationNode", type = Accessor.Type.SETTER)
	public void setNavigationNode(final CMSNavigationNodeModel value)
	{
		_navigationNode = getPersistenceContext().setValue(NAVIGATIONNODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>NavigationComponent.styleClass</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the styleClass - CSS style class of this navigation component.
	 */
	@Accessor(qualifier = "styleClass", type = Accessor.Type.SETTER)
	public void setStyleClass(final String value)
	{
		_styleClass = getPersistenceContext().setValue(STYLECLASS, value);
	}
	
}
