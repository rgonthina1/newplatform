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
import de.hybris.platform.cms2lib.model.components.AbstractBannerComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type DynamicBannerComponent first defined at extension acceleratorcms.
 * <p>
 * Banner component implementation that displays media that code is dynamically evaluated basing on given parameters.
 */
@SuppressWarnings("all")
public class DynamicBannerComponentModel extends AbstractBannerComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DynamicBannerComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>DynamicBannerComponent.mediaCodePattern</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String MEDIACODEPATTERN = "mediaCodePattern";
	
	
	/** <i>Generated variable</i> - Variable of <code>DynamicBannerComponent.mediaCodePattern</code> attribute defined at extension <code>acceleratorcms</code>. */
	private String _mediaCodePattern;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DynamicBannerComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DynamicBannerComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _external initial attribute declared by type <code>AbstractBannerComponent</code> at extension <code>cms2lib</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public DynamicBannerComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _external initial attribute declared by type <code>AbstractBannerComponent</code> at extension <code>cms2lib</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public DynamicBannerComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicBannerComponent.mediaCodePattern</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the mediaCodePattern - Media code pattern that will be used for evaluation.
	 */
	@Accessor(qualifier = "mediaCodePattern", type = Accessor.Type.GETTER)
	public String getMediaCodePattern()
	{
		if (this._mediaCodePattern!=null)
		{
			return _mediaCodePattern;
		}
		return _mediaCodePattern = getPersistenceContext().getValue(MEDIACODEPATTERN, _mediaCodePattern);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DynamicBannerComponent.mediaCodePattern</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the mediaCodePattern - Media code pattern that will be used for evaluation.
	 */
	@Accessor(qualifier = "mediaCodePattern", type = Accessor.Type.SETTER)
	public void setMediaCodePattern(final String value)
	{
		_mediaCodePattern = getPersistenceContext().setValue(MEDIACODEPATTERN, value);
	}
	
}
