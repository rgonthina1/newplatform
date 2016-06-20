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
import de.hybris.platform.solrfacetsearch.enums.IndexMode;
import de.hybris.platform.solrfacetsearch.enums.SolrCommitMode;
import de.hybris.platform.solrfacetsearch.enums.SolrOptimizeMode;

/**
 * Generated model class for type SolrIndexConfig first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String BATCHSIZE = "batchSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String EXPORTPATH = "exportPath";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NUMBEROFTHREADS = "numberOfThreads";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INDEXMODE = "indexMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.commitMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String COMMITMODE = "commitMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.optimizeMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String OPTIMIZEMODE = "optimizeMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.ignoreErrors</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String IGNOREERRORS = "ignoreErrors";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LEGACYMODE = "legacyMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.maxRetries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MAXRETRIES = "maxRetries";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexConfig.maxBatchRetries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MAXBATCHRETRIES = "maxBatchRetries";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _batchSize;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _exportPath;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _numberOfThreads;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private IndexMode _indexMode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.commitMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrCommitMode _commitMode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.optimizeMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrOptimizeMode _optimizeMode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.ignoreErrors</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _ignoreErrors;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _legacyMode;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.maxRetries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _maxRetries;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.maxBatchRetries</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _maxBatchRetries;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexConfig</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexConfigModel(final String _name)
	{
		super();
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexConfig</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrIndexConfigModel(final String _name, final ItemModel _owner)
	{
		super();
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the batchSize
	 */
	@Accessor(qualifier = "batchSize", type = Accessor.Type.GETTER)
	public int getBatchSize()
	{
		return toPrimitive( _batchSize = getPersistenceContext().getValue(BATCHSIZE, _batchSize));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.commitMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the commitMode
	 */
	@Accessor(qualifier = "commitMode", type = Accessor.Type.GETTER)
	public SolrCommitMode getCommitMode()
	{
		if (this._commitMode!=null)
		{
			return _commitMode;
		}
		return _commitMode = getPersistenceContext().getValue(COMMITMODE, _commitMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the exportPath
	 */
	@Accessor(qualifier = "exportPath", type = Accessor.Type.GETTER)
	public String getExportPath()
	{
		if (this._exportPath!=null)
		{
			return _exportPath;
		}
		return _exportPath = getPersistenceContext().getValue(EXPORTPATH, _exportPath);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the indexMode
	 */
	@Accessor(qualifier = "indexMode", type = Accessor.Type.GETTER)
	public IndexMode getIndexMode()
	{
		if (this._indexMode!=null)
		{
			return _indexMode;
		}
		return _indexMode = getPersistenceContext().getValue(INDEXMODE, _indexMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.maxBatchRetries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the maxBatchRetries
	 */
	@Accessor(qualifier = "maxBatchRetries", type = Accessor.Type.GETTER)
	public int getMaxBatchRetries()
	{
		return toPrimitive( _maxBatchRetries = getPersistenceContext().getValue(MAXBATCHRETRIES, _maxBatchRetries));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.maxRetries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the maxRetries
	 */
	@Accessor(qualifier = "maxRetries", type = Accessor.Type.GETTER)
	public int getMaxRetries()
	{
		return toPrimitive( _maxRetries = getPersistenceContext().getValue(MAXRETRIES, _maxRetries));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the name - unique identifier of indexer configuration
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		if (this._name!=null)
		{
			return _name;
		}
		return _name = getPersistenceContext().getValue(NAME, _name);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the numberOfThreads
	 */
	@Accessor(qualifier = "numberOfThreads", type = Accessor.Type.GETTER)
	public int getNumberOfThreads()
	{
		return toPrimitive( _numberOfThreads = getPersistenceContext().getValue(NUMBEROFTHREADS, _numberOfThreads));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.optimizeMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the optimizeMode
	 */
	@Accessor(qualifier = "optimizeMode", type = Accessor.Type.GETTER)
	public SolrOptimizeMode getOptimizeMode()
	{
		if (this._optimizeMode!=null)
		{
			return _optimizeMode;
		}
		return _optimizeMode = getPersistenceContext().getValue(OPTIMIZEMODE, _optimizeMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.ignoreErrors</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ignoreErrors
	 */
	@Accessor(qualifier = "ignoreErrors", type = Accessor.Type.GETTER)
	public boolean isIgnoreErrors()
	{
		return toPrimitive( _ignoreErrors = getPersistenceContext().getValue(IGNOREERRORS, _ignoreErrors));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the legacyMode
	 */
	@Accessor(qualifier = "legacyMode", type = Accessor.Type.GETTER)
	public boolean isLegacyMode()
	{
		return toPrimitive( _legacyMode = getPersistenceContext().getValue(LEGACYMODE, _legacyMode));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the batchSize
	 */
	@Accessor(qualifier = "batchSize", type = Accessor.Type.SETTER)
	public void setBatchSize(final int value)
	{
		_batchSize = getPersistenceContext().setValue(BATCHSIZE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.commitMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the commitMode
	 */
	@Accessor(qualifier = "commitMode", type = Accessor.Type.SETTER)
	public void setCommitMode(final SolrCommitMode value)
	{
		_commitMode = getPersistenceContext().setValue(COMMITMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the exportPath
	 */
	@Accessor(qualifier = "exportPath", type = Accessor.Type.SETTER)
	public void setExportPath(final String value)
	{
		_exportPath = getPersistenceContext().setValue(EXPORTPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.ignoreErrors</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ignoreErrors
	 */
	@Accessor(qualifier = "ignoreErrors", type = Accessor.Type.SETTER)
	public void setIgnoreErrors(final boolean value)
	{
		_ignoreErrors = getPersistenceContext().setValue(IGNOREERRORS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the indexMode
	 */
	@Accessor(qualifier = "indexMode", type = Accessor.Type.SETTER)
	public void setIndexMode(final IndexMode value)
	{
		_indexMode = getPersistenceContext().setValue(INDEXMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.legacyMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the legacyMode
	 */
	@Accessor(qualifier = "legacyMode", type = Accessor.Type.SETTER)
	public void setLegacyMode(final boolean value)
	{
		_legacyMode = getPersistenceContext().setValue(LEGACYMODE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.maxBatchRetries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the maxBatchRetries
	 */
	@Accessor(qualifier = "maxBatchRetries", type = Accessor.Type.SETTER)
	public void setMaxBatchRetries(final int value)
	{
		_maxBatchRetries = getPersistenceContext().setValue(MAXBATCHRETRIES, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.maxRetries</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the maxRetries
	 */
	@Accessor(qualifier = "maxRetries", type = Accessor.Type.SETTER)
	public void setMaxRetries(final int value)
	{
		_maxRetries = getPersistenceContext().setValue(MAXRETRIES, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexConfig.name</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name - unique identifier of indexer configuration
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the numberOfThreads
	 */
	@Accessor(qualifier = "numberOfThreads", type = Accessor.Type.SETTER)
	public void setNumberOfThreads(final int value)
	{
		_numberOfThreads = getPersistenceContext().setValue(NUMBEROFTHREADS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexConfig.optimizeMode</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the optimizeMode
	 */
	@Accessor(qualifier = "optimizeMode", type = Accessor.Type.SETTER)
	public void setOptimizeMode(final SolrOptimizeMode value)
	{
		_optimizeMode = getPersistenceContext().setValue(OPTIMIZEMODE, value);
	}
	
}
