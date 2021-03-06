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
package de.hybris.platform.btg.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ScriptMedia first defined at extension btg.
 */
@SuppressWarnings("all")
public class ScriptMediaModel extends MediaModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ScriptMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>ScriptMedia.scriptLanguage</code> attribute defined at extension <code>btg</code>. */
	public static final String SCRIPTLANGUAGE = "scriptLanguage";
	
	
	/** <i>Generated variable</i> - Variable of <code>ScriptMedia.scriptLanguage</code> attribute defined at extension <code>btg</code>. */
	private String _scriptLanguage;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ScriptMediaModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ScriptMediaModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Media</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _scriptLanguage initial attribute declared by type <code>ScriptMedia</code> at extension <code>btg</code>
	 */
	@Deprecated
	public ScriptMediaModel(final CatalogVersionModel _catalogVersion, final String _code, final String _scriptLanguage)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setScriptLanguage(_scriptLanguage);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>Media</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Media</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _scriptLanguage initial attribute declared by type <code>ScriptMedia</code> at extension <code>btg</code>
	 */
	@Deprecated
	public ScriptMediaModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner, final String _scriptLanguage)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
		setScriptLanguage(_scriptLanguage);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScriptMedia.scriptLanguage</code> attribute defined at extension <code>btg</code>. 
	 * @return the scriptLanguage
	 */
	@Accessor(qualifier = "scriptLanguage", type = Accessor.Type.GETTER)
	public String getScriptLanguage()
	{
		if (this._scriptLanguage!=null)
		{
			return _scriptLanguage;
		}
		return _scriptLanguage = getPersistenceContext().getValue(SCRIPTLANGUAGE, _scriptLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ScriptMedia.scriptLanguage</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scriptLanguage
	 */
	@Accessor(qualifier = "scriptLanguage", type = Accessor.Type.SETTER)
	public void setScriptLanguage(final String value)
	{
		_scriptLanguage = getPersistenceContext().setValue(SCRIPTLANGUAGE, value);
	}
	
}
