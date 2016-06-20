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
import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Generated model class for type SolrIndexedType first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexedTypeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexedType";
	
	/**<i>Generated relation code constant for relation <code>SolrFacetSearchConfig2SolrIndexedType</code> defining source attribute <code>solrFacetSearchConfig</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRFACETSEARCHCONFIG2SOLRINDEXEDTYPE = "SolrFacetSearchConfig2SolrIndexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IDENTIFIER = "identifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VARIANT = "variant";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IDENTITYPROVIDER = "identityProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MODELLOADER = "modelLoader";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.defaultFieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String DEFAULTFIELDVALUEPROVIDER = "defaultFieldValueProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VALUESPROVIDER = "valuesProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXNAME = "indexName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRRESULTCONVERTER = "solrResultConverter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.group</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String GROUP = "group";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.groupFieldName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String GROUPFIELDNAME = "groupFieldName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.groupLimit</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String GROUPLIMIT = "groupLimit";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.groupFacets</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String GROUPFACETS = "groupFacets";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.listeners</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LISTENERS = "listeners";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.configSet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CONFIGSET = "configSet";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.ftsQueryBuilder</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSQUERYBUILDER = "ftsQueryBuilder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.ftsQueryBuilderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSQUERYBUILDERPARAMETERS = "ftsQueryBuilderParameters";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXERQUERIES = "solrIndexerQueries";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXEDPROPERTIES = "solrIndexedProperties";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRFACETSEARCHCONFIG = "solrFacetSearchConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SORTS = "sorts";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _identifier;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private ComposedTypeModel _type;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _variant;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _identityProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _modelLoader;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.defaultFieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _defaultFieldValueProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _valuesProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _indexName;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _solrResultConverter;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.group</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _group;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.groupFieldName</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _groupFieldName;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.groupLimit</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _groupLimit;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.groupFacets</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _groupFacets;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.listeners</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Collection<String> _listeners;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.configSet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _configSet;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.ftsQueryBuilder</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _ftsQueryBuilder;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.ftsQueryBuilderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Map<String,String> _ftsQueryBuilderParameters;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexerQueryModel> _solrIndexerQueries;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrIndexedPropertyModel> _solrIndexedProperties;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrFacetSearchConfigModel _solrFacetSearchConfig;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. */
	private List<SolrSortModel> _sorts;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexedTypeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexedTypeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _identifier initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 * @param _type initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedTypeModel(final String _identifier, final ComposedTypeModel _type)
	{
		super();
		setIdentifier(_identifier);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _identifier initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _type initial attribute declared by type <code>SolrIndexedType</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedTypeModel(final String _identifier, final ItemModel _owner, final ComposedTypeModel _type)
	{
		super();
		setIdentifier(_identifier);
		setOwner(_owner);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.configSet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the configSet - configSet defining configuration for core in solr
	 */
	@Accessor(qualifier = "configSet", type = Accessor.Type.GETTER)
	public String getConfigSet()
	{
		if (this._configSet!=null)
		{
			return _configSet;
		}
		return _configSet = getPersistenceContext().getValue(CONFIGSET, _configSet);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.defaultFieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the defaultFieldValueProvider - default fieldValueProvider to be used by the indexed properties
	 */
	@Accessor(qualifier = "defaultFieldValueProvider", type = Accessor.Type.GETTER)
	public String getDefaultFieldValueProvider()
	{
		if (this._defaultFieldValueProvider!=null)
		{
			return _defaultFieldValueProvider;
		}
		return _defaultFieldValueProvider = getPersistenceContext().getValue(DEFAULTFIELDVALUEPROVIDER, _defaultFieldValueProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.ftsQueryBuilder</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsQueryBuilder
	 */
	@Accessor(qualifier = "ftsQueryBuilder", type = Accessor.Type.GETTER)
	public String getFtsQueryBuilder()
	{
		if (this._ftsQueryBuilder!=null)
		{
			return _ftsQueryBuilder;
		}
		return _ftsQueryBuilder = getPersistenceContext().getValue(FTSQUERYBUILDER, _ftsQueryBuilder);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.ftsQueryBuilderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsQueryBuilderParameters
	 */
	@Accessor(qualifier = "ftsQueryBuilderParameters", type = Accessor.Type.GETTER)
	public Map<String,String> getFtsQueryBuilderParameters()
	{
		if (this._ftsQueryBuilderParameters!=null)
		{
			return _ftsQueryBuilderParameters;
		}
		return _ftsQueryBuilderParameters = getPersistenceContext().getValue(FTSQUERYBUILDERPARAMETERS, _ftsQueryBuilderParameters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.groupFieldName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the groupFieldName
	 */
	@Accessor(qualifier = "groupFieldName", type = Accessor.Type.GETTER)
	public String getGroupFieldName()
	{
		if (this._groupFieldName!=null)
		{
			return _groupFieldName;
		}
		return _groupFieldName = getPersistenceContext().getValue(GROUPFIELDNAME, _groupFieldName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.groupLimit</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the groupLimit
	 */
	@Accessor(qualifier = "groupLimit", type = Accessor.Type.GETTER)
	public Integer getGroupLimit()
	{
		if (this._groupLimit!=null)
		{
			return _groupLimit;
		}
		return _groupLimit = getPersistenceContext().getValue(GROUPLIMIT, _groupLimit);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the identifier - name of the Indexed Type
	 */
	@Accessor(qualifier = "identifier", type = Accessor.Type.GETTER)
	public String getIdentifier()
	{
		if (this._identifier!=null)
		{
			return _identifier;
		}
		return _identifier = getPersistenceContext().getValue(IDENTIFIER, _identifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the identityProvider
	 */
	@Accessor(qualifier = "identityProvider", type = Accessor.Type.GETTER)
	public String getIdentityProvider()
	{
		if (this._identityProvider!=null)
		{
			return _identityProvider;
		}
		return _identityProvider = getPersistenceContext().getValue(IDENTITYPROVIDER, _identityProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexName
	 */
	@Accessor(qualifier = "indexName", type = Accessor.Type.GETTER)
	public String getIndexName()
	{
		if (this._indexName!=null)
		{
			return _indexName;
		}
		return _indexName = getPersistenceContext().getValue(INDEXNAME, _indexName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.listeners</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the listeners
	 */
	@Accessor(qualifier = "listeners", type = Accessor.Type.GETTER)
	public Collection<String> getListeners()
	{
		if (this._listeners!=null)
		{
			return _listeners;
		}
		return _listeners = getPersistenceContext().getValue(LISTENERS, _listeners);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the modelLoader
	 */
	@Accessor(qualifier = "modelLoader", type = Accessor.Type.GETTER)
	public String getModelLoader()
	{
		if (this._modelLoader!=null)
		{
			return _modelLoader;
		}
		return _modelLoader = getPersistenceContext().getValue(MODELLOADER, _modelLoader);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrFacetSearchConfig
	 */
	@Accessor(qualifier = "solrFacetSearchConfig", type = Accessor.Type.GETTER)
	public SolrFacetSearchConfigModel getSolrFacetSearchConfig()
	{
		if (this._solrFacetSearchConfig!=null)
		{
			return _solrFacetSearchConfig;
		}
		return _solrFacetSearchConfig = getPersistenceContext().getValue(SOLRFACETSEARCHCONFIG, _solrFacetSearchConfig);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexedProperties
	 */
	@Accessor(qualifier = "solrIndexedProperties", type = Accessor.Type.GETTER)
	public List<SolrIndexedPropertyModel> getSolrIndexedProperties()
	{
		if (this._solrIndexedProperties!=null)
		{
			return _solrIndexedProperties;
		}
		return _solrIndexedProperties = getPersistenceContext().getValue(SOLRINDEXEDPROPERTIES, _solrIndexedProperties);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrIndexerQueries
	 */
	@Accessor(qualifier = "solrIndexerQueries", type = Accessor.Type.GETTER)
	public List<SolrIndexerQueryModel> getSolrIndexerQueries()
	{
		if (this._solrIndexerQueries!=null)
		{
			return _solrIndexerQueries;
		}
		return _solrIndexerQueries = getPersistenceContext().getValue(SOLRINDEXERQUERIES, _solrIndexerQueries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrResultConverter
	 */
	@Accessor(qualifier = "solrResultConverter", type = Accessor.Type.GETTER)
	public String getSolrResultConverter()
	{
		if (this._solrResultConverter!=null)
		{
			return _solrResultConverter;
		}
		return _solrResultConverter = getPersistenceContext().getValue(SOLRRESULTCONVERTER, _solrResultConverter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sorts
	 */
	@Accessor(qualifier = "sorts", type = Accessor.Type.GETTER)
	public List<SolrSortModel> getSorts()
	{
		if (this._sorts!=null)
		{
			return _sorts;
		}
		return _sorts = getPersistenceContext().getValue(SORTS, _sorts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the type - enclosing type of the Indexed Type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public ComposedTypeModel getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the valuesProvider
	 */
	@Accessor(qualifier = "valuesProvider", type = Accessor.Type.GETTER)
	public String getValuesProvider()
	{
		if (this._valuesProvider!=null)
		{
			return _valuesProvider;
		}
		return _valuesProvider = getPersistenceContext().getValue(VALUESPROVIDER, _valuesProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.group</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the group
	 */
	@Accessor(qualifier = "group", type = Accessor.Type.GETTER)
	public boolean isGroup()
	{
		return toPrimitive( _group = getPersistenceContext().getValue(GROUP, _group));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.groupFacets</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the groupFacets
	 */
	@Accessor(qualifier = "groupFacets", type = Accessor.Type.GETTER)
	public boolean isGroupFacets()
	{
		return toPrimitive( _groupFacets = getPersistenceContext().getValue(GROUPFACETS, _groupFacets));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the variant
	 */
	@Accessor(qualifier = "variant", type = Accessor.Type.GETTER)
	public boolean isVariant()
	{
		return toPrimitive( _variant = getPersistenceContext().getValue(VARIANT, _variant));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.configSet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the configSet - configSet defining configuration for core in solr
	 */
	@Accessor(qualifier = "configSet", type = Accessor.Type.SETTER)
	public void setConfigSet(final String value)
	{
		_configSet = getPersistenceContext().setValue(CONFIGSET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.defaultFieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the defaultFieldValueProvider - default fieldValueProvider to be used by the indexed properties
	 */
	@Accessor(qualifier = "defaultFieldValueProvider", type = Accessor.Type.SETTER)
	public void setDefaultFieldValueProvider(final String value)
	{
		_defaultFieldValueProvider = getPersistenceContext().setValue(DEFAULTFIELDVALUEPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.ftsQueryBuilder</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsQueryBuilder
	 */
	@Accessor(qualifier = "ftsQueryBuilder", type = Accessor.Type.SETTER)
	public void setFtsQueryBuilder(final String value)
	{
		_ftsQueryBuilder = getPersistenceContext().setValue(FTSQUERYBUILDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.ftsQueryBuilderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsQueryBuilderParameters
	 */
	@Accessor(qualifier = "ftsQueryBuilderParameters", type = Accessor.Type.SETTER)
	public void setFtsQueryBuilderParameters(final Map<String,String> value)
	{
		_ftsQueryBuilderParameters = getPersistenceContext().setValue(FTSQUERYBUILDERPARAMETERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.group</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the group
	 */
	@Accessor(qualifier = "group", type = Accessor.Type.SETTER)
	public void setGroup(final boolean value)
	{
		_group = getPersistenceContext().setValue(GROUP, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.groupFacets</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the groupFacets
	 */
	@Accessor(qualifier = "groupFacets", type = Accessor.Type.SETTER)
	public void setGroupFacets(final boolean value)
	{
		_groupFacets = getPersistenceContext().setValue(GROUPFACETS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.groupFieldName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the groupFieldName
	 */
	@Accessor(qualifier = "groupFieldName", type = Accessor.Type.SETTER)
	public void setGroupFieldName(final String value)
	{
		_groupFieldName = getPersistenceContext().setValue(GROUPFIELDNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.groupLimit</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the groupLimit
	 */
	@Accessor(qualifier = "groupLimit", type = Accessor.Type.SETTER)
	public void setGroupLimit(final Integer value)
	{
		_groupLimit = getPersistenceContext().setValue(GROUPLIMIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexedType.identifier</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the identifier - name of the Indexed Type
	 */
	@Accessor(qualifier = "identifier", type = Accessor.Type.SETTER)
	public void setIdentifier(final String value)
	{
		_identifier = getPersistenceContext().setValue(IDENTIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the identityProvider
	 */
	@Accessor(qualifier = "identityProvider", type = Accessor.Type.SETTER)
	public void setIdentityProvider(final String value)
	{
		_identityProvider = getPersistenceContext().setValue(IDENTITYPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.indexName</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexName
	 */
	@Accessor(qualifier = "indexName", type = Accessor.Type.SETTER)
	public void setIndexName(final String value)
	{
		_indexName = getPersistenceContext().setValue(INDEXNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.listeners</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the listeners
	 */
	@Accessor(qualifier = "listeners", type = Accessor.Type.SETTER)
	public void setListeners(final Collection<String> value)
	{
		_listeners = getPersistenceContext().setValue(LISTENERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the modelLoader
	 */
	@Accessor(qualifier = "modelLoader", type = Accessor.Type.SETTER)
	public void setModelLoader(final String value)
	{
		_modelLoader = getPersistenceContext().setValue(MODELLOADER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrFacetSearchConfig
	 */
	@Accessor(qualifier = "solrFacetSearchConfig", type = Accessor.Type.SETTER)
	public void setSolrFacetSearchConfig(final SolrFacetSearchConfigModel value)
	{
		_solrFacetSearchConfig = getPersistenceContext().setValue(SOLRFACETSEARCHCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexedProperties
	 */
	@Accessor(qualifier = "solrIndexedProperties", type = Accessor.Type.SETTER)
	public void setSolrIndexedProperties(final List<SolrIndexedPropertyModel> value)
	{
		_solrIndexedProperties = getPersistenceContext().setValue(SOLRINDEXEDPROPERTIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexerQueries
	 */
	@Accessor(qualifier = "solrIndexerQueries", type = Accessor.Type.SETTER)
	public void setSolrIndexerQueries(final List<SolrIndexerQueryModel> value)
	{
		_solrIndexerQueries = getPersistenceContext().setValue(SOLRINDEXERQUERIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrResultConverter
	 */
	@Accessor(qualifier = "solrResultConverter", type = Accessor.Type.SETTER)
	public void setSolrResultConverter(final String value)
	{
		_solrResultConverter = getPersistenceContext().setValue(SOLRRESULTCONVERTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.sorts</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the sorts
	 */
	@Accessor(qualifier = "sorts", type = Accessor.Type.SETTER)
	public void setSorts(final List<SolrSortModel> value)
	{
		_sorts = getPersistenceContext().setValue(SORTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the type - enclosing type of the Indexed Type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.SETTER)
	public void setType(final ComposedTypeModel value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the valuesProvider
	 */
	@Accessor(qualifier = "valuesProvider", type = Accessor.Type.SETTER)
	public void setValuesProvider(final String value)
	{
		_valuesProvider = getPersistenceContext().setValue(VALUESPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedType.variant</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the variant
	 */
	@Accessor(qualifier = "variant", type = Accessor.Type.SETTER)
	public void setVariant(final boolean value)
	{
		_variant = getPersistenceContext().setValue(VARIANT, toObject(value));
	}
	
}
