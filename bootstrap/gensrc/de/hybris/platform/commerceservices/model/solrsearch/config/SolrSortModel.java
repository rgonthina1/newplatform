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
package de.hybris.platform.commerceservices.model.solrsearch.config;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortFieldModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import java.util.List;
import java.util.Locale;

/**
 * Generated model class for type SolrSort first defined at extension commerceservices.
 * <p>
 * Extending SolrSort type with additional attributes.
 */
@SuppressWarnings("all")
public class SolrSortModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrSort";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedType2SolrSortRel</code> defining source attribute <code>indexedType</code> in extension <code>commerceservices</code>.</i>*/
	public final static String _SOLRINDEXEDTYPE2SOLRSORTREL = "SolrIndexedType2SolrSortRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSort.code</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSort.name</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSort.useBoost</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String USEBOOST = "useBoost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSort.indexedType</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String INDEXEDTYPE = "indexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSort.fields</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String FIELDS = "fields";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrSort.visible</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String VISIBLE = "visible";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrSort.code</code> attribute defined at extension <code>commerceservices</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSort.useBoost</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _useBoost;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSort.indexedType</code> attribute defined at extension <code>commerceservices</code>. */
	private SolrIndexedTypeModel _indexedType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSort.fields</code> attribute defined at extension <code>commerceservices</code>. */
	private List<SolrSortFieldModel> _fields;
	
	/** <i>Generated variable</i> - Variable of <code>SolrSort.visible</code> attribute defined at extension <code>commercesearch</code>. */
	private Boolean _visible;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrSortModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrSortModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 * @param _indexedType initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 */
	@Deprecated
	public SolrSortModel(final String _code, final SolrIndexedTypeModel _indexedType)
	{
		super();
		setCode(_code);
		setIndexedType(_indexedType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 * @param _indexedType initial attribute declared by type <code>SolrSort</code> at extension <code>commerceservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SolrSortModel(final String _code, final SolrIndexedTypeModel _indexedType, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setIndexedType(_indexedType);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.code</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the code - The unique code used to identify the solr sort.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		if (this._code!=null)
		{
			return _code;
		}
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.fields</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the fields
	 */
	@Accessor(qualifier = "fields", type = Accessor.Type.GETTER)
	public List<SolrSortFieldModel> getFields()
	{
		if (this._fields!=null)
		{
			return _fields;
		}
		return _fields = getPersistenceContext().getValue(FIELDS, _fields);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.indexedType</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the indexedType
	 */
	@Accessor(qualifier = "indexedType", type = Accessor.Type.GETTER)
	public SolrIndexedTypeModel getIndexedType()
	{
		if (this._indexedType!=null)
		{
			return _indexedType;
		}
		return _indexedType = getPersistenceContext().getValue(INDEXEDTYPE, _indexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.name</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the name - The display name for this sort.
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.name</code> attribute defined at extension <code>commerceservices</code>. 
	 * @param loc the value localization key 
	 * @return the name - The display name for this sort.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.visible</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the visible - The property is used to check whether a sort should be visible for front users or not.
	 */
	@Accessor(qualifier = "visible", type = Accessor.Type.GETTER)
	public Boolean getVisible()
	{
		if (this._visible!=null)
		{
			return _visible;
		}
		return _visible = getPersistenceContext().getValue(VISIBLE, _visible);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrSort.useBoost</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the useBoost - The property specifies whether a sort should apply SOLR boost rules.
	 */
	@Accessor(qualifier = "useBoost", type = Accessor.Type.GETTER)
	public boolean isUseBoost()
	{
		return toPrimitive( _useBoost = getPersistenceContext().getValue(USEBOOST, _useBoost));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.code</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the code - The unique code used to identify the solr sort.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.fields</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the fields
	 */
	@Accessor(qualifier = "fields", type = Accessor.Type.SETTER)
	public void setFields(final List<SolrSortFieldModel> value)
	{
		_fields = getPersistenceContext().setValue(FIELDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.indexedType</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the indexedType
	 */
	@Accessor(qualifier = "indexedType", type = Accessor.Type.SETTER)
	public void setIndexedType(final SolrIndexedTypeModel value)
	{
		_indexedType = getPersistenceContext().setValue(INDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.name</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the name - The display name for this sort.
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.name</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the name - The display name for this sort.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.useBoost</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the useBoost - The property specifies whether a sort should apply SOLR boost rules.
	 */
	@Accessor(qualifier = "useBoost", type = Accessor.Type.SETTER)
	public void setUseBoost(final boolean value)
	{
		_useBoost = getPersistenceContext().setValue(USEBOOST, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrSort.visible</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the visible - The property is used to check whether a sort should be visible for front users or not.
	 */
	@Accessor(qualifier = "visible", type = Accessor.Type.SETTER)
	public void setVisible(final Boolean value)
	{
		_visible = getPersistenceContext().setValue(VISIBLE, value);
	}
	
}
