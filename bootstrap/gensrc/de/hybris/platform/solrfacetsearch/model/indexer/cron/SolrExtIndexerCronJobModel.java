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
package de.hybris.platform.solrfacetsearch.model.indexer.cron;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.indexer.cron.SolrIndexerCronJobModel;
import java.util.Collection;

/**
 * Generated model class for type SolrExtIndexerCronJob first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrExtIndexerCronJobModel extends SolrIndexerCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrExtIndexerCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrExtIndexerCronJob.indexedType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXEDTYPE = "indexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrExtIndexerCronJob.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXEDPROPERTIES = "indexedProperties";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrExtIndexerCronJob.query</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String QUERY = "query";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrExtIndexerCronJob.queryParameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String QUERYPARAMETERPROVIDER = "queryParameterProvider";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrExtIndexerCronJob.indexedType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _indexedType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrExtIndexerCronJob.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Collection<String> _indexedProperties;
	
	/** <i>Generated variable</i> - Variable of <code>SolrExtIndexerCronJob.query</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _query;
	
	/** <i>Generated variable</i> - Variable of <code>SolrExtIndexerCronJob.queryParameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _queryParameterProvider;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrExtIndexerCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrExtIndexerCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _facetSearchConfig initial attribute declared by type <code>SolrIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 * @param _indexedType initial attribute declared by type <code>SolrExtIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _query initial attribute declared by type <code>SolrExtIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrExtIndexerCronJobModel(final SolrFacetSearchConfigModel _facetSearchConfig, final String _indexedType, final JobModel _job, final String _query)
	{
		super();
		setFacetSearchConfig(_facetSearchConfig);
		setIndexedType(_indexedType);
		setJob(_job);
		setQuery(_query);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _facetSearchConfig initial attribute declared by type <code>SolrIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 * @param _indexedType initial attribute declared by type <code>SolrExtIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _query initial attribute declared by type <code>SolrExtIndexerCronJob</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrExtIndexerCronJobModel(final SolrFacetSearchConfigModel _facetSearchConfig, final String _indexedType, final JobModel _job, final ItemModel _owner, final String _query)
	{
		super();
		setFacetSearchConfig(_facetSearchConfig);
		setIndexedType(_indexedType);
		setJob(_job);
		setOwner(_owner);
		setQuery(_query);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrExtIndexerCronJob.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the indexedProperties
	 */
	@Accessor(qualifier = "indexedProperties", type = Accessor.Type.GETTER)
	public Collection<String> getIndexedProperties()
	{
		if (this._indexedProperties!=null)
		{
			return _indexedProperties;
		}
		return _indexedProperties = getPersistenceContext().getValue(INDEXEDPROPERTIES, _indexedProperties);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrExtIndexerCronJob.indexedType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexedType
	 */
	@Accessor(qualifier = "indexedType", type = Accessor.Type.GETTER)
	public String getIndexedType()
	{
		if (this._indexedType!=null)
		{
			return _indexedType;
		}
		return _indexedType = getPersistenceContext().getValue(INDEXEDTYPE, _indexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrExtIndexerCronJob.query</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the query
	 */
	@Accessor(qualifier = "query", type = Accessor.Type.GETTER)
	public String getQuery()
	{
		if (this._query!=null)
		{
			return _query;
		}
		return _query = getPersistenceContext().getValue(QUERY, _query);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrExtIndexerCronJob.queryParameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the queryParameterProvider
	 */
	@Accessor(qualifier = "queryParameterProvider", type = Accessor.Type.GETTER)
	public String getQueryParameterProvider()
	{
		if (this._queryParameterProvider!=null)
		{
			return _queryParameterProvider;
		}
		return _queryParameterProvider = getPersistenceContext().getValue(QUERYPARAMETERPROVIDER, _queryParameterProvider);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrExtIndexerCronJob.indexedProperties</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexedProperties
	 */
	@Accessor(qualifier = "indexedProperties", type = Accessor.Type.SETTER)
	public void setIndexedProperties(final Collection<String> value)
	{
		_indexedProperties = getPersistenceContext().setValue(INDEXEDPROPERTIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrExtIndexerCronJob.indexedType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexedType
	 */
	@Accessor(qualifier = "indexedType", type = Accessor.Type.SETTER)
	public void setIndexedType(final String value)
	{
		_indexedType = getPersistenceContext().setValue(INDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrExtIndexerCronJob.query</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the query
	 */
	@Accessor(qualifier = "query", type = Accessor.Type.SETTER)
	public void setQuery(final String value)
	{
		_query = getPersistenceContext().setValue(QUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrExtIndexerCronJob.queryParameterProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the queryParameterProvider
	 */
	@Accessor(qualifier = "queryParameterProvider", type = Accessor.Type.SETTER)
	public void setQueryParameterProvider(final String value)
	{
		_queryParameterProvider = getPersistenceContext().setValue(QUERYPARAMETERPROVIDER, value);
	}
	
}
