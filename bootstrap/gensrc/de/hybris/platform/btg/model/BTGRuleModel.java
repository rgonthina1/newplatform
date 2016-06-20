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
import de.hybris.platform.btg.enums.BTGRuleType;
import de.hybris.platform.btg.model.BTGConditionModel;
import de.hybris.platform.btg.model.BTGItemModel;
import de.hybris.platform.btg.model.BTGRuleResultModel;
import de.hybris.platform.btg.model.BTGSegmentModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Locale;

/**
 * Generated model class for type BTGRule first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGRuleModel extends BTGItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGRule";
	
	/**<i>Generated relation code constant for relation <code>BTGSegmentToBTGRulesRelation</code> defining source attribute <code>segment</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGSEGMENTTOBTGRULESRELATION = "BTGSegmentToBTGRulesRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRule.code</code> attribute defined at extension <code>btg</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRule.description</code> attribute defined at extension <code>btg</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRule.ruleType</code> attribute defined at extension <code>btg</code>. */
	public static final String RULETYPE = "ruleType";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRule.segment</code> attribute defined at extension <code>btg</code>. */
	public static final String SEGMENT = "segment";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRule.conditions</code> attribute defined at extension <code>btg</code>. */
	public static final String CONDITIONS = "conditions";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGRule.results</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTS = "results";
	
	
	/** <i>Generated variable</i> - Variable of <code>BTGRule.code</code> attribute defined at extension <code>btg</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>BTGRule.ruleType</code> attribute defined at extension <code>btg</code>. */
	private BTGRuleType _ruleType;
	
	/** <i>Generated variable</i> - Variable of <code>BTGRule.segment</code> attribute defined at extension <code>btg</code>. */
	private BTGSegmentModel _segment;
	
	/** <i>Generated variable</i> - Variable of <code>BTGRule.conditions</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGConditionModel> _conditions;
	
	/** <i>Generated variable</i> - Variable of <code>BTGRule.results</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGRuleResultModel> _results;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGRuleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGRuleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>BTGRule</code> at extension <code>btg</code>
	 * @param _ruleType initial attribute declared by type <code>BTGRule</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGRuleModel(final CatalogVersionModel _catalogVersion, final String _code, final BTGRuleType _ruleType, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setRuleType(_ruleType);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>BTGRule</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _ruleType initial attribute declared by type <code>BTGRule</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGRuleModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner, final BTGRuleType _ruleType, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
		setRuleType(_ruleType);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRule.code</code> attribute defined at extension <code>btg</code>. 
	 * @return the code
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
	 * <i>Generated method</i> - Getter of the <code>BTGRule.conditions</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the conditions
	 */
	@Accessor(qualifier = "conditions", type = Accessor.Type.GETTER)
	public Collection<BTGConditionModel> getConditions()
	{
		if (this._conditions!=null)
		{
			return _conditions;
		}
		return _conditions = getPersistenceContext().getValue(CONDITIONS, _conditions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRule.description</code> attribute defined at extension <code>btg</code>. 
	 * @return the description - rule text
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRule.description</code> attribute defined at extension <code>btg</code>. 
	 * @param loc the value localization key 
	 * @return the description - rule text
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRule.results</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the results
	 */
	@Accessor(qualifier = "results", type = Accessor.Type.GETTER)
	public Collection<BTGRuleResultModel> getResults()
	{
		if (this._results!=null)
		{
			return _results;
		}
		return _results = getPersistenceContext().getValue(RESULTS, _results);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRule.ruleType</code> attribute defined at extension <code>btg</code>. 
	 * @return the ruleType
	 */
	@Accessor(qualifier = "ruleType", type = Accessor.Type.GETTER)
	public BTGRuleType getRuleType()
	{
		if (this._ruleType!=null)
		{
			return _ruleType;
		}
		return _ruleType = getPersistenceContext().getValue(RULETYPE, _ruleType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGRule.segment</code> attribute defined at extension <code>btg</code>. 
	 * @return the segment
	 */
	@Accessor(qualifier = "segment", type = Accessor.Type.GETTER)
	public BTGSegmentModel getSegment()
	{
		if (this._segment!=null)
		{
			return _segment;
		}
		return _segment = getPersistenceContext().getValue(SEGMENT, _segment);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.code</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.conditions</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the conditions
	 */
	@Accessor(qualifier = "conditions", type = Accessor.Type.SETTER)
	public void setConditions(final Collection<BTGConditionModel> value)
	{
		_conditions = getPersistenceContext().setValue(CONDITIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.description</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the description - rule text
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.description</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the description - rule text
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.results</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the results
	 */
	@Accessor(qualifier = "results", type = Accessor.Type.SETTER)
	public void setResults(final Collection<BTGRuleResultModel> value)
	{
		_results = getPersistenceContext().setValue(RESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.ruleType</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the ruleType
	 */
	@Accessor(qualifier = "ruleType", type = Accessor.Type.SETTER)
	public void setRuleType(final BTGRuleType value)
	{
		_ruleType = getPersistenceContext().setValue(RULETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGRule.segment</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the segment
	 */
	@Accessor(qualifier = "segment", type = Accessor.Type.SETTER)
	public void setSegment(final BTGSegmentModel value)
	{
		_segment = getPersistenceContext().setValue(SEGMENT, value);
	}
	
}
