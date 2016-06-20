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
package de.hybris.platform.solrfacetsearch.model.config;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import java.util.Collection;

/**
 * Generated model class for type SolrSearchConfig first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrSearchConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrSearchConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.pageSize</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String PAGESIZE = "pageSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.defaultSortOrder</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String DEFAULTSORTORDER = "defaultSortOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.restrictFieldsInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String RESTRICTFIELDSINRESPONSE = "restrictFieldsInResponse";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.allFacetValuesInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String ALLFACETVALUESINRESPONSE = "allFacetValuesInResponse";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LEGACYMODE = "legacyMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSearchConfig.groupingProperty</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String GROUPINGPROPERTY = "groupingProperty";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.pageSize</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _pageSize;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.defaultSortOrder</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Collection<String> _defaultSortOrder;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _description;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.restrictFieldsInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _restrictFieldsInResponse;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.allFacetValuesInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _allFacetValuesInResponse;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _legacyMode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.groupingProperty</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexedPropertyModel _groupingProperty;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrSearchConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrSearchConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _pageSize initial attribute declared by type <code>SolrSearchConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrSearchConfigModel(final Integer _pageSize)
	{
		super();
		setPageSize(_pageSize);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _pageSize initial attribute declared by type <code>SolrSearchConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrSearchConfigModel(final ItemModel _owner, final Integer _pageSize)
	{
		super();
		setOwner(_owner);
		setPageSize(_pageSize);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.defaultSortOrder</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the defaultSortOrder
	 */
	@Accessor(qualifier = "defaultSortOrder", type = Accessor.Type.GETTER)
	public Collection<String> getDefaultSortOrder()
	{
		if (this._defaultSortOrder!=null)
		{
			return _defaultSortOrder;
		}
		return _defaultSortOrder = getPersistenceContext().getValue(DEFAULTSORTORDER, _defaultSortOrder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the description
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
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.groupingProperty</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the groupingProperty
	 */
	@Accessor(qualifier = "groupingProperty", type = Accessor.Type.GETTER)
	public SolrIndexedPropertyModel getGroupingProperty()
	{
		if (this._groupingProperty!=null)
		{
			return _groupingProperty;
		}
		return _groupingProperty = getPersistenceContext().getValue(GROUPINGPROPERTY, _groupingProperty);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.pageSize</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the pageSize
	 */
	@Accessor(qualifier = "pageSize", type = Accessor.Type.GETTER)
	public Integer getPageSize()
	{
		if (this._pageSize!=null)
		{
			return _pageSize;
		}
		return _pageSize = getPersistenceContext().getValue(PAGESIZE, _pageSize);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.allFacetValuesInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the allFacetValuesInResponse
	 */
	@Accessor(qualifier = "allFacetValuesInResponse", type = Accessor.Type.GETTER)
	public boolean isAllFacetValuesInResponse()
	{
		return toPrimitive( _allFacetValuesInResponse = getPersistenceContext().getValue(ALLFACETVALUESINRESPONSE, _allFacetValuesInResponse));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the legacyMode
	 */
	@Accessor(qualifier = "legacyMode", type = Accessor.Type.GETTER)
	public boolean isLegacyMode()
	{
		return toPrimitive( _legacyMode = getPersistenceContext().getValue(LEGACYMODE, _legacyMode));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSearchConfig.restrictFieldsInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the restrictFieldsInResponse
	 */
	@Accessor(qualifier = "restrictFieldsInResponse", type = Accessor.Type.GETTER)
	public boolean isRestrictFieldsInResponse()
	{
		return toPrimitive( _restrictFieldsInResponse = getPersistenceContext().getValue(RESTRICTFIELDSINRESPONSE, _restrictFieldsInResponse));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.allFacetValuesInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the allFacetValuesInResponse
	 */
	@Accessor(qualifier = "allFacetValuesInResponse", type = Accessor.Type.SETTER)
	public void setAllFacetValuesInResponse(final boolean value)
	{
		_allFacetValuesInResponse = getPersistenceContext().setValue(ALLFACETVALUESINRESPONSE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.defaultSortOrder</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the defaultSortOrder
	 */
	@Accessor(qualifier = "defaultSortOrder", type = Accessor.Type.SETTER)
	public void setDefaultSortOrder(final Collection<String> value)
	{
		_defaultSortOrder = getPersistenceContext().setValue(DEFAULTSORTORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.description</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		_description = getPersistenceContext().setValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.groupingProperty</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the groupingProperty
	 */
	@Accessor(qualifier = "groupingProperty", type = Accessor.Type.SETTER)
	public void setGroupingProperty(final SolrIndexedPropertyModel value)
	{
		_groupingProperty = getPersistenceContext().setValue(GROUPINGPROPERTY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the legacyMode
	 */
	@Accessor(qualifier = "legacyMode", type = Accessor.Type.SETTER)
	public void setLegacyMode(final boolean value)
	{
		_legacyMode = getPersistenceContext().setValue(LEGACYMODE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.pageSize</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the pageSize
	 */
	@Accessor(qualifier = "pageSize", type = Accessor.Type.SETTER)
	public void setPageSize(final Integer value)
	{
		_pageSize = getPersistenceContext().setValue(PAGESIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSearchConfig.restrictFieldsInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the restrictFieldsInResponse
	 */
	@Accessor(qualifier = "restrictFieldsInResponse", type = Accessor.Type.SETTER)
	public void setRestrictFieldsInResponse(final boolean value)
	{
		_restrictFieldsInResponse = getPersistenceContext().setValue(RESTRICTFIELDSINRESPONSE, toObject(value));
	}
	
}
