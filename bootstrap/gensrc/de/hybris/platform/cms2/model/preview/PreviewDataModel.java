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
package de.hybris.platform.cms2.model.preview;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.liveeditaddon.enums.DeviceOrientation;
import de.hybris.liveeditaddon.model.DeviceSupportModel;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.cmscockpit.enums.LiveEditVariant;
import de.hybris.platform.commerceservices.enums.UiExperienceLevel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type PreviewData first defined at extension cms2.
 */
@SuppressWarnings("all")
public class PreviewDataModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PreviewData";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.user</code> attribute defined at extension <code>cms2</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.userGroup</code> attribute defined at extension <code>cms2</code>. */
	public static final String USERGROUP = "userGroup";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.country</code> attribute defined at extension <code>cms2</code>. */
	public static final String COUNTRY = "country";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.language</code> attribute defined at extension <code>cms2</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.time</code> attribute defined at extension <code>cms2</code>. */
	public static final String TIME = "time";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.liveEdit</code> attribute defined at extension <code>cms2</code>. */
	public static final String LIVEEDIT = "liveEdit";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.editMode</code> attribute defined at extension <code>cms2</code>. */
	public static final String EDITMODE = "editMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.resourcePath</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESOURCEPATH = "resourcePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.page</code> attribute defined at extension <code>cms2</code>. */
	public static final String PAGE = "page";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.previewCategory</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWCATEGORY = "previewCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.previewProduct</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWPRODUCT = "previewProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.previewCatalog</code> attribute defined at extension <code>cms2</code>. */
	public static final String PREVIEWCATALOG = "previewCatalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.activeSite</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVESITE = "activeSite";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.activeCatalogVersion</code> attribute defined at extension <code>cms2</code>. */
	public static final String ACTIVECATALOGVERSION = "activeCatalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.catalogVersions</code> attribute defined at extension <code>cms2</code>. */
	public static final String CATALOGVERSIONS = "catalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.uiExperience</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String UIEXPERIENCE = "uiExperience";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.liveEditVariant</code> attribute defined at extension <code>cmscockpit</code>. */
	public static final String LIVEEDITVARIANT = "liveEditVariant";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.viewport</code> attribute defined at extension <code>liveeditaddon</code>. */
	public static final String VIEWPORT = "viewport";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.deviceSupport</code> attribute defined at extension <code>liveeditaddon</code>. */
	public static final String DEVICESUPPORT = "deviceSupport";
	
	/** <i>Generated constant</i> - Attribute key of <code>PreviewData.deviceOrientation</code> attribute defined at extension <code>liveeditaddon</code>. */
	public static final String DEVICEORIENTATION = "deviceOrientation";
	
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.user</code> attribute defined at extension <code>cms2</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.userGroup</code> attribute defined at extension <code>cms2</code>. */
	private UserGroupModel _userGroup;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.country</code> attribute defined at extension <code>cms2</code>. */
	private CountryModel _country;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.language</code> attribute defined at extension <code>cms2</code>. */
	private LanguageModel _language;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.time</code> attribute defined at extension <code>cms2</code>. */
	private Date _time;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.liveEdit</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _liveEdit;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.editMode</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _editMode;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.resourcePath</code> attribute defined at extension <code>cms2</code>. */
	private String _resourcePath;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.page</code> attribute defined at extension <code>cms2</code>. */
	private AbstractPageModel _page;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.previewCategory</code> attribute defined at extension <code>cms2</code>. */
	private CategoryModel _previewCategory;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.previewProduct</code> attribute defined at extension <code>cms2</code>. */
	private ProductModel _previewProduct;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.previewCatalog</code> attribute defined at extension <code>cms2</code>. */
	private CatalogModel _previewCatalog;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.activeSite</code> attribute defined at extension <code>cms2</code>. */
	private CMSSiteModel _activeSite;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.activeCatalogVersion</code> attribute defined at extension <code>cms2</code>. */
	private CatalogVersionModel _activeCatalogVersion;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.catalogVersions</code> attribute defined at extension <code>cms2</code>. */
	private Collection<CatalogVersionModel> _catalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.uiExperience</code> attribute defined at extension <code>acceleratorcms</code>. */
	private UiExperienceLevel _uiExperience;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.liveEditVariant</code> attribute defined at extension <code>cmscockpit</code>. */
	private LiveEditVariant _liveEditVariant;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.viewport</code> attribute defined at extension <code>liveeditaddon</code>. */
	private String _viewport;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.deviceSupport</code> attribute defined at extension <code>liveeditaddon</code>. */
	private DeviceSupportModel _deviceSupport;
	
	/** <i>Generated variable</i> - Variable of <code>PreviewData.deviceOrientation</code> attribute defined at extension <code>liveeditaddon</code>. */
	private DeviceOrientation _deviceOrientation;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PreviewDataModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PreviewDataModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _liveEdit initial attribute declared by type <code>PreviewData</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PreviewDataModel(final Boolean _liveEdit)
	{
		super();
		setLiveEdit(_liveEdit);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _liveEdit initial attribute declared by type <code>PreviewData</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PreviewDataModel(final Boolean _liveEdit, final ItemModel _owner)
	{
		super();
		setLiveEdit(_liveEdit);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.activeCatalogVersion</code> attribute defined at extension <code>cms2</code>. 
	 * @return the activeCatalogVersion
	 */
	@Accessor(qualifier = "activeCatalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getActiveCatalogVersion()
	{
		if (this._activeCatalogVersion!=null)
		{
			return _activeCatalogVersion;
		}
		return _activeCatalogVersion = getPersistenceContext().getValue(ACTIVECATALOGVERSION, _activeCatalogVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.activeSite</code> attribute defined at extension <code>cms2</code>. 
	 * @return the activeSite
	 */
	@Accessor(qualifier = "activeSite", type = Accessor.Type.GETTER)
	public CMSSiteModel getActiveSite()
	{
		if (this._activeSite!=null)
		{
			return _activeSite;
		}
		return _activeSite = getPersistenceContext().getValue(ACTIVESITE, _activeSite);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.catalogVersions</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the catalogVersions
	 */
	@Accessor(qualifier = "catalogVersions", type = Accessor.Type.GETTER)
	public Collection<CatalogVersionModel> getCatalogVersions()
	{
		if (this._catalogVersions!=null)
		{
			return _catalogVersions;
		}
		return _catalogVersions = getPersistenceContext().getValue(CATALOGVERSIONS, _catalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.country</code> attribute defined at extension <code>cms2</code>. 
	 * @return the country
	 */
	@Accessor(qualifier = "country", type = Accessor.Type.GETTER)
	public CountryModel getCountry()
	{
		if (this._country!=null)
		{
			return _country;
		}
		return _country = getPersistenceContext().getValue(COUNTRY, _country);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.deviceOrientation</code> attribute defined at extension <code>liveeditaddon</code>. 
	 * @return the deviceOrientation
	 */
	@Accessor(qualifier = "deviceOrientation", type = Accessor.Type.GETTER)
	public DeviceOrientation getDeviceOrientation()
	{
		if (this._deviceOrientation!=null)
		{
			return _deviceOrientation;
		}
		return _deviceOrientation = getPersistenceContext().getValue(DEVICEORIENTATION, _deviceOrientation);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.deviceSupport</code> attribute defined at extension <code>liveeditaddon</code>. 
	 * @return the deviceSupport
	 */
	@Accessor(qualifier = "deviceSupport", type = Accessor.Type.GETTER)
	public DeviceSupportModel getDeviceSupport()
	{
		if (this._deviceSupport!=null)
		{
			return _deviceSupport;
		}
		return _deviceSupport = getPersistenceContext().getValue(DEVICESUPPORT, _deviceSupport);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.editMode</code> attribute defined at extension <code>cms2</code>. 
	 * @return the editMode
	 */
	@Accessor(qualifier = "editMode", type = Accessor.Type.GETTER)
	public Boolean getEditMode()
	{
		if (this._editMode!=null)
		{
			return _editMode;
		}
		return _editMode = getPersistenceContext().getValue(EDITMODE, _editMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.language</code> attribute defined at extension <code>cms2</code>. 
	 * @return the language
	 */
	@Accessor(qualifier = "language", type = Accessor.Type.GETTER)
	public LanguageModel getLanguage()
	{
		if (this._language!=null)
		{
			return _language;
		}
		return _language = getPersistenceContext().getValue(LANGUAGE, _language);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.liveEdit</code> attribute defined at extension <code>cms2</code>. 
	 * @return the liveEdit
	 */
	@Accessor(qualifier = "liveEdit", type = Accessor.Type.GETTER)
	public Boolean getLiveEdit()
	{
		if (this._liveEdit!=null)
		{
			return _liveEdit;
		}
		return _liveEdit = getPersistenceContext().getValue(LIVEEDIT, _liveEdit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.liveEditVariant</code> attribute defined at extension <code>cmscockpit</code>. 
	 * @return the liveEditVariant
	 */
	@Accessor(qualifier = "liveEditVariant", type = Accessor.Type.GETTER)
	public LiveEditVariant getLiveEditVariant()
	{
		if (this._liveEditVariant!=null)
		{
			return _liveEditVariant;
		}
		return _liveEditVariant = getPersistenceContext().getValue(LIVEEDITVARIANT, _liveEditVariant);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.page</code> attribute defined at extension <code>cms2</code>. 
	 * @return the page
	 */
	@Accessor(qualifier = "page", type = Accessor.Type.GETTER)
	public AbstractPageModel getPage()
	{
		if (this._page!=null)
		{
			return _page;
		}
		return _page = getPersistenceContext().getValue(PAGE, _page);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.previewCatalog</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewCatalog
	 */
	@Accessor(qualifier = "previewCatalog", type = Accessor.Type.GETTER)
	public CatalogModel getPreviewCatalog()
	{
		if (this._previewCatalog!=null)
		{
			return _previewCatalog;
		}
		return _previewCatalog = getPersistenceContext().getValue(PREVIEWCATALOG, _previewCatalog);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.previewCategory</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewCategory
	 */
	@Accessor(qualifier = "previewCategory", type = Accessor.Type.GETTER)
	public CategoryModel getPreviewCategory()
	{
		if (this._previewCategory!=null)
		{
			return _previewCategory;
		}
		return _previewCategory = getPersistenceContext().getValue(PREVIEWCATEGORY, _previewCategory);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.previewProduct</code> attribute defined at extension <code>cms2</code>. 
	 * @return the previewProduct
	 */
	@Accessor(qualifier = "previewProduct", type = Accessor.Type.GETTER)
	public ProductModel getPreviewProduct()
	{
		if (this._previewProduct!=null)
		{
			return _previewProduct;
		}
		return _previewProduct = getPersistenceContext().getValue(PREVIEWPRODUCT, _previewProduct);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.resourcePath</code> attribute defined at extension <code>cms2</code>. 
	 * @return the resourcePath
	 */
	@Accessor(qualifier = "resourcePath", type = Accessor.Type.GETTER)
	public String getResourcePath()
	{
		if (this._resourcePath!=null)
		{
			return _resourcePath;
		}
		return _resourcePath = getPersistenceContext().getValue(RESOURCEPATH, _resourcePath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.time</code> attribute defined at extension <code>cms2</code>. 
	 * @return the time
	 */
	@Accessor(qualifier = "time", type = Accessor.Type.GETTER)
	public Date getTime()
	{
		if (this._time!=null)
		{
			return _time;
		}
		return _time = getPersistenceContext().getValue(TIME, _time);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.uiExperience</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the uiExperience
	 */
	@Accessor(qualifier = "uiExperience", type = Accessor.Type.GETTER)
	public UiExperienceLevel getUiExperience()
	{
		if (this._uiExperience!=null)
		{
			return _uiExperience;
		}
		return _uiExperience = getPersistenceContext().getValue(UIEXPERIENCE, _uiExperience);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.user</code> attribute defined at extension <code>cms2</code>. 
	 * @return the user
	 */
	@Accessor(qualifier = "user", type = Accessor.Type.GETTER)
	public UserModel getUser()
	{
		if (this._user!=null)
		{
			return _user;
		}
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.userGroup</code> attribute defined at extension <code>cms2</code>. 
	 * @return the userGroup
	 */
	@Accessor(qualifier = "userGroup", type = Accessor.Type.GETTER)
	public UserGroupModel getUserGroup()
	{
		if (this._userGroup!=null)
		{
			return _userGroup;
		}
		return _userGroup = getPersistenceContext().getValue(USERGROUP, _userGroup);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.viewport</code> attribute defined at extension <code>liveeditaddon</code>. 
	 * @return the viewport
	 */
	@Accessor(qualifier = "viewport", type = Accessor.Type.GETTER)
	public String getViewport()
	{
		if (this._viewport!=null)
		{
			return _viewport;
		}
		return _viewport = getPersistenceContext().getValue(VIEWPORT, _viewport);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.activeCatalogVersion</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeCatalogVersion
	 */
	@Accessor(qualifier = "activeCatalogVersion", type = Accessor.Type.SETTER)
	public void setActiveCatalogVersion(final CatalogVersionModel value)
	{
		_activeCatalogVersion = getPersistenceContext().setValue(ACTIVECATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.activeSite</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the activeSite
	 */
	@Accessor(qualifier = "activeSite", type = Accessor.Type.SETTER)
	public void setActiveSite(final CMSSiteModel value)
	{
		_activeSite = getPersistenceContext().setValue(ACTIVESITE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.catalogVersions</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the catalogVersions
	 */
	@Accessor(qualifier = "catalogVersions", type = Accessor.Type.SETTER)
	public void setCatalogVersions(final Collection<CatalogVersionModel> value)
	{
		_catalogVersions = getPersistenceContext().setValue(CATALOGVERSIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.country</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the country
	 */
	@Accessor(qualifier = "country", type = Accessor.Type.SETTER)
	public void setCountry(final CountryModel value)
	{
		_country = getPersistenceContext().setValue(COUNTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.deviceOrientation</code> attribute defined at extension <code>liveeditaddon</code>. 
	 *  
	 * @param value the deviceOrientation
	 */
	@Accessor(qualifier = "deviceOrientation", type = Accessor.Type.SETTER)
	public void setDeviceOrientation(final DeviceOrientation value)
	{
		_deviceOrientation = getPersistenceContext().setValue(DEVICEORIENTATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.deviceSupport</code> attribute defined at extension <code>liveeditaddon</code>. 
	 *  
	 * @param value the deviceSupport
	 */
	@Accessor(qualifier = "deviceSupport", type = Accessor.Type.SETTER)
	public void setDeviceSupport(final DeviceSupportModel value)
	{
		_deviceSupport = getPersistenceContext().setValue(DEVICESUPPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.editMode</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the editMode
	 */
	@Accessor(qualifier = "editMode", type = Accessor.Type.SETTER)
	public void setEditMode(final Boolean value)
	{
		_editMode = getPersistenceContext().setValue(EDITMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.language</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the language
	 */
	@Accessor(qualifier = "language", type = Accessor.Type.SETTER)
	public void setLanguage(final LanguageModel value)
	{
		_language = getPersistenceContext().setValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.liveEdit</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the liveEdit
	 */
	@Accessor(qualifier = "liveEdit", type = Accessor.Type.SETTER)
	public void setLiveEdit(final Boolean value)
	{
		_liveEdit = getPersistenceContext().setValue(LIVEEDIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.liveEditVariant</code> attribute defined at extension <code>cmscockpit</code>. 
	 *  
	 * @param value the liveEditVariant
	 */
	@Accessor(qualifier = "liveEditVariant", type = Accessor.Type.SETTER)
	public void setLiveEditVariant(final LiveEditVariant value)
	{
		_liveEditVariant = getPersistenceContext().setValue(LIVEEDITVARIANT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.page</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the page
	 */
	@Accessor(qualifier = "page", type = Accessor.Type.SETTER)
	public void setPage(final AbstractPageModel value)
	{
		_page = getPersistenceContext().setValue(PAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.previewCatalog</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewCatalog
	 */
	@Accessor(qualifier = "previewCatalog", type = Accessor.Type.SETTER)
	public void setPreviewCatalog(final CatalogModel value)
	{
		_previewCatalog = getPersistenceContext().setValue(PREVIEWCATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.previewCategory</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewCategory
	 */
	@Accessor(qualifier = "previewCategory", type = Accessor.Type.SETTER)
	public void setPreviewCategory(final CategoryModel value)
	{
		_previewCategory = getPersistenceContext().setValue(PREVIEWCATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.previewProduct</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the previewProduct
	 */
	@Accessor(qualifier = "previewProduct", type = Accessor.Type.SETTER)
	public void setPreviewProduct(final ProductModel value)
	{
		_previewProduct = getPersistenceContext().setValue(PREVIEWPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.resourcePath</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the resourcePath
	 */
	@Accessor(qualifier = "resourcePath", type = Accessor.Type.SETTER)
	public void setResourcePath(final String value)
	{
		_resourcePath = getPersistenceContext().setValue(RESOURCEPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.time</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the time
	 */
	@Accessor(qualifier = "time", type = Accessor.Type.SETTER)
	public void setTime(final Date value)
	{
		_time = getPersistenceContext().setValue(TIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.uiExperience</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the uiExperience
	 */
	@Accessor(qualifier = "uiExperience", type = Accessor.Type.SETTER)
	public void setUiExperience(final UiExperienceLevel value)
	{
		_uiExperience = getPersistenceContext().setValue(UIEXPERIENCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.user</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the user
	 */
	@Accessor(qualifier = "user", type = Accessor.Type.SETTER)
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.userGroup</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the userGroup
	 */
	@Accessor(qualifier = "userGroup", type = Accessor.Type.SETTER)
	public void setUserGroup(final UserGroupModel value)
	{
		_userGroup = getPersistenceContext().setValue(USERGROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PreviewData.viewport</code> attribute defined at extension <code>liveeditaddon</code>. 
	 *  
	 * @param value the viewport
	 */
	@Accessor(qualifier = "viewport", type = Accessor.Type.SETTER)
	public void setViewport(final String value)
	{
		_viewport = getPersistenceContext().setValue(VIEWPORT, value);
	}
	
}
