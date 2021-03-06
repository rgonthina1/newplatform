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
import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.commercesearch.model.AbstractSolrFacetVisibilityRuleModel;
import de.hybris.platform.commercesearch.model.SolrBoostRuleModel;
import de.hybris.platform.commercesearch.model.SolrFacetReconfigurationModel;
import de.hybris.platform.commerceservices.enums.SolrIndexedPropertyFacetSort;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.enums.SolrIndexedPropertyFacetType;
import de.hybris.platform.solrfacetsearch.enums.SolrPropertiesTypes;
import de.hybris.platform.solrfacetsearch.enums.SolrWildcardType;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeSetModel;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Generated model class for type SolrIndexedProperty first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrIndexedPropertyModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrIndexedProperty";
	
	/**<i>Generated relation code constant for relation <code>SolrIndexedType2SolrIndexedProperty</code> defining source attribute <code>solrIndexedType</code> in extension <code>solrfacetsearch</code>.</i>*/
	public final static String _SOLRINDEXEDTYPE2SOLRINDEXEDPROPERTY = "SolrIndexedType2SolrIndexedProperty";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.sortableType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SORTABLETYPE = "sortableType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.facet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACET = "facet";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.localized</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String LOCALIZED = "localized";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.currency</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CURRENCY = "currency";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.multiValue</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String MULTIVALUE = "multiValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.rangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String RANGESET = "rangeSet";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.facetDisplayNameProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETDISPLAYNAMEPROVIDER = "facetDisplayNameProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.facetType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FACETTYPE = "facetType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.fieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FIELDVALUEPROVIDER = "fieldValueProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.valueProviderParameter</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VALUEPROVIDERPARAMETER = "valueProviderParameter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.valueProviderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String VALUEPROVIDERPARAMETERS = "valueProviderParameters";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.exportId</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String EXPORTID = "exportId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.useForSpellchecking</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String USEFORSPELLCHECKING = "useForSpellchecking";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.useForAutocomplete</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String USEFORAUTOCOMPLETE = "useForAutocomplete";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.priority</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String PRIORITY = "priority";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.includeInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String INCLUDEINRESPONSE = "includeInResponse";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.customFacetSortProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String CUSTOMFACETSORTPROVIDER = "customFacetSortProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSQUERY = "ftsQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSQUERYMINTERMLENGTH = "ftsQueryMinTermLength";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSQUERYBOOST = "ftsQueryBoost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsFuzzyQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSFUZZYQUERY = "ftsFuzzyQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsFuzzyQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSFUZZYQUERYMINTERMLENGTH = "ftsFuzzyQueryMinTermLength";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsFuzzyQueryFuzziness</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSFUZZYQUERYFUZZINESS = "ftsFuzzyQueryFuzziness";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsFuzzyQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSFUZZYQUERYBOOST = "ftsFuzzyQueryBoost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsWildcardQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSWILDCARDQUERY = "ftsWildcardQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsWildcardQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSWILDCARDQUERYMINTERMLENGTH = "ftsWildcardQueryMinTermLength";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsWildcardQueryType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSWILDCARDQUERYTYPE = "ftsWildcardQueryType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsWildcardQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSWILDCARDQUERYBOOST = "ftsWildcardQueryBoost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsPhraseQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSPHRASEQUERY = "ftsPhraseQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsPhraseQuerySlop</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSPHRASEQUERYSLOP = "ftsPhraseQuerySlop";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.ftsPhraseQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String FTSPHRASEQUERYBOOST = "ftsPhraseQueryBoost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String SOLRINDEXEDTYPE = "solrIndexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.rangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String RANGESETS = "rangeSets";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.classAttributeAssignment</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CLASSATTRIBUTEASSIGNMENT = "classAttributeAssignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.categoryField</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CATEGORYFIELD = "categoryField";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.displayName</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DISPLAYNAME = "displayName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.facetSort</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String FACETSORT = "facetSort";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.topValuesProvider</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TOPVALUESPROVIDER = "topValuesProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.visible</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String VISIBLE = "visible";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.facetVisibilityRules</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String FACETVISIBILITYRULES = "facetVisibilityRules";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String SOLRFACETRECONFIGURATIONS = "solrFacetReconfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrIndexedProperty.boostRules</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String BOOSTRULES = "boostRules";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.name</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _name;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.type</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrPropertiesTypes _type;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.sortableType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrPropertiesTypes _sortableType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _facet;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.localized</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _localized;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.currency</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _currency;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.multiValue</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _multiValue;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.rangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrValueRangeSetModel _rangeSet;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetDisplayNameProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _facetDisplayNameProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexedPropertyFacetType _facetType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.fieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _fieldValueProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.valueProviderParameter</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _valueProviderParameter;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.valueProviderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Map<String,String> _valueProviderParameters;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.exportId</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _exportId;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.useForSpellchecking</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _useForSpellchecking;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.useForAutocomplete</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _useForAutocomplete;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.priority</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _priority;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.includeInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _includeInResponse;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.customFacetSortProvider</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private String _customFacetSortProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _ftsQuery;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _ftsQueryMinTermLength;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Float _ftsQueryBoost;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsFuzzyQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _ftsFuzzyQuery;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsFuzzyQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _ftsFuzzyQueryMinTermLength;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsFuzzyQueryFuzziness</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _ftsFuzzyQueryFuzziness;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsFuzzyQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Float _ftsFuzzyQueryBoost;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsWildcardQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _ftsWildcardQuery;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsWildcardQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Integer _ftsWildcardQueryMinTermLength;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsWildcardQueryType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrWildcardType _ftsWildcardQueryType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsWildcardQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Float _ftsWildcardQueryBoost;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsPhraseQuery</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Boolean _ftsPhraseQuery;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsPhraseQuerySlop</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Float _ftsPhraseQuerySlop;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.ftsPhraseQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private Float _ftsPhraseQueryBoost;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private SolrIndexedTypeModel _solrIndexedType;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.rangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private List<SolrValueRangeSetModel> _rangeSets;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.classAttributeAssignment</code> attribute defined at extension <code>commerceservices</code>. */
	private ClassAttributeAssignmentModel _classAttributeAssignment;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.categoryField</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _categoryField;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetSort</code> attribute defined at extension <code>commerceservices</code>. */
	private SolrIndexedPropertyFacetSort _facetSort;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.topValuesProvider</code> attribute defined at extension <code>commerceservices</code>. */
	private String _topValuesProvider;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.visible</code> attribute defined at extension <code>commerceservices</code>. */
	private Boolean _visible;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetVisibilityRules</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<AbstractSolrFacetVisibilityRuleModel> _facetVisibilityRules;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. */
	private Collection<SolrFacetReconfigurationModel> _solrFacetReconfigurations;
	
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.boostRules</code> attribute defined at extension <code>commercesearch</code>. */
	private List<SolrBoostRuleModel> _boostRules;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrIndexedPropertyModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrIndexedPropertyModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexedProperty</code> at extension <code>solrfacetsearch</code>
	 * @param _type initial attribute declared by type <code>SolrIndexedProperty</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedPropertyModel(final String _name, final SolrPropertiesTypes _type)
	{
		super();
		setName(_name);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _name initial attribute declared by type <code>SolrIndexedProperty</code> at extension <code>solrfacetsearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _type initial attribute declared by type <code>SolrIndexedProperty</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrIndexedPropertyModel(final String _name, final ItemModel _owner, final SolrPropertiesTypes _type)
	{
		super();
		setName(_name);
		setOwner(_owner);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.boostRules</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the boostRules
	 */
	@Accessor(qualifier = "boostRules", type = Accessor.Type.GETTER)
	public List<SolrBoostRuleModel> getBoostRules()
	{
		if (this._boostRules!=null)
		{
			return _boostRules;
		}
		return _boostRules = getPersistenceContext().getValue(BOOSTRULES, _boostRules);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.classAttributeAssignment</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the classAttributeAssignment - The classification system category feature for this property.
	 */
	@Accessor(qualifier = "classAttributeAssignment", type = Accessor.Type.GETTER)
	public ClassAttributeAssignmentModel getClassAttributeAssignment()
	{
		if (this._classAttributeAssignment!=null)
		{
			return _classAttributeAssignment;
		}
		return _classAttributeAssignment = getPersistenceContext().getValue(CLASSATTRIBUTEASSIGNMENT, _classAttributeAssignment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.customFacetSortProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the customFacetSortProvider - The custom sort provider for the facet values, only used if facetSort is set to Custom.
	 */
	@Accessor(qualifier = "customFacetSortProvider", type = Accessor.Type.GETTER)
	public String getCustomFacetSortProvider()
	{
		if (this._customFacetSortProvider!=null)
		{
			return _customFacetSortProvider;
		}
		return _customFacetSortProvider = getPersistenceContext().getValue(CUSTOMFACETSORTPROVIDER, _customFacetSortProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.displayName</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the displayName - The display name for this property in the list of facet.
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.GETTER)
	public String getDisplayName()
	{
		return getDisplayName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.displayName</code> attribute defined at extension <code>commerceservices</code>. 
	 * @param loc the value localization key 
	 * @return the displayName - The display name for this property in the list of facet.
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.GETTER)
	public String getDisplayName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DISPLAYNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.exportId</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the exportId - exportId used by this property
	 */
	@Accessor(qualifier = "exportId", type = Accessor.Type.GETTER)
	public String getExportId()
	{
		if (this._exportId!=null)
		{
			return _exportId;
		}
		return _exportId = getPersistenceContext().getValue(EXPORTID, _exportId);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.facetDisplayNameProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the facetDisplayNameProvider - facetDisplayNameProvider used by this property
	 */
	@Accessor(qualifier = "facetDisplayNameProvider", type = Accessor.Type.GETTER)
	public String getFacetDisplayNameProvider()
	{
		if (this._facetDisplayNameProvider!=null)
		{
			return _facetDisplayNameProvider;
		}
		return _facetDisplayNameProvider = getPersistenceContext().getValue(FACETDISPLAYNAMEPROVIDER, _facetDisplayNameProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.facetSort</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the facetSort - Deprecated - please use custom sort providers. The sort option to use to order the
	 * 							facet values.
	 */
	@Deprecated
	@Accessor(qualifier = "facetSort", type = Accessor.Type.GETTER)
	public SolrIndexedPropertyFacetSort getFacetSort()
	{
		if (this._facetSort!=null)
		{
			return _facetSort;
		}
		return _facetSort = getPersistenceContext().getValue(FACETSORT, _facetSort);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.facetType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the facetType - The facet type, if this is a facet property.
	 */
	@Accessor(qualifier = "facetType", type = Accessor.Type.GETTER)
	public SolrIndexedPropertyFacetType getFacetType()
	{
		if (this._facetType!=null)
		{
			return _facetType;
		}
		return _facetType = getPersistenceContext().getValue(FACETTYPE, _facetType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.facetVisibilityRules</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the facetVisibilityRules
	 */
	@Accessor(qualifier = "facetVisibilityRules", type = Accessor.Type.GETTER)
	public Collection<AbstractSolrFacetVisibilityRuleModel> getFacetVisibilityRules()
	{
		if (this._facetVisibilityRules!=null)
		{
			return _facetVisibilityRules;
		}
		return _facetVisibilityRules = getPersistenceContext().getValue(FACETVISIBILITYRULES, _facetVisibilityRules);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.fieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the fieldValueProvider - fieldValueProvider used by this property
	 */
	@Accessor(qualifier = "fieldValueProvider", type = Accessor.Type.GETTER)
	public String getFieldValueProvider()
	{
		if (this._fieldValueProvider!=null)
		{
			return _fieldValueProvider;
		}
		return _fieldValueProvider = getPersistenceContext().getValue(FIELDVALUEPROVIDER, _fieldValueProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsFuzzyQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsFuzzyQueryBoost
	 */
	@Accessor(qualifier = "ftsFuzzyQueryBoost", type = Accessor.Type.GETTER)
	public Float getFtsFuzzyQueryBoost()
	{
		if (this._ftsFuzzyQueryBoost!=null)
		{
			return _ftsFuzzyQueryBoost;
		}
		return _ftsFuzzyQueryBoost = getPersistenceContext().getValue(FTSFUZZYQUERYBOOST, _ftsFuzzyQueryBoost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsFuzzyQueryFuzziness</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsFuzzyQueryFuzziness
	 */
	@Accessor(qualifier = "ftsFuzzyQueryFuzziness", type = Accessor.Type.GETTER)
	public Integer getFtsFuzzyQueryFuzziness()
	{
		if (this._ftsFuzzyQueryFuzziness!=null)
		{
			return _ftsFuzzyQueryFuzziness;
		}
		return _ftsFuzzyQueryFuzziness = getPersistenceContext().getValue(FTSFUZZYQUERYFUZZINESS, _ftsFuzzyQueryFuzziness);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsFuzzyQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsFuzzyQueryMinTermLength
	 */
	@Accessor(qualifier = "ftsFuzzyQueryMinTermLength", type = Accessor.Type.GETTER)
	public Integer getFtsFuzzyQueryMinTermLength()
	{
		if (this._ftsFuzzyQueryMinTermLength!=null)
		{
			return _ftsFuzzyQueryMinTermLength;
		}
		return _ftsFuzzyQueryMinTermLength = getPersistenceContext().getValue(FTSFUZZYQUERYMINTERMLENGTH, _ftsFuzzyQueryMinTermLength);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsPhraseQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsPhraseQueryBoost
	 */
	@Accessor(qualifier = "ftsPhraseQueryBoost", type = Accessor.Type.GETTER)
	public Float getFtsPhraseQueryBoost()
	{
		if (this._ftsPhraseQueryBoost!=null)
		{
			return _ftsPhraseQueryBoost;
		}
		return _ftsPhraseQueryBoost = getPersistenceContext().getValue(FTSPHRASEQUERYBOOST, _ftsPhraseQueryBoost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsPhraseQuerySlop</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsPhraseQuerySlop
	 */
	@Accessor(qualifier = "ftsPhraseQuerySlop", type = Accessor.Type.GETTER)
	public Float getFtsPhraseQuerySlop()
	{
		if (this._ftsPhraseQuerySlop!=null)
		{
			return _ftsPhraseQuerySlop;
		}
		return _ftsPhraseQuerySlop = getPersistenceContext().getValue(FTSPHRASEQUERYSLOP, _ftsPhraseQuerySlop);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsQueryBoost
	 */
	@Accessor(qualifier = "ftsQueryBoost", type = Accessor.Type.GETTER)
	public Float getFtsQueryBoost()
	{
		if (this._ftsQueryBoost!=null)
		{
			return _ftsQueryBoost;
		}
		return _ftsQueryBoost = getPersistenceContext().getValue(FTSQUERYBOOST, _ftsQueryBoost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsQueryMinTermLength
	 */
	@Accessor(qualifier = "ftsQueryMinTermLength", type = Accessor.Type.GETTER)
	public Integer getFtsQueryMinTermLength()
	{
		if (this._ftsQueryMinTermLength!=null)
		{
			return _ftsQueryMinTermLength;
		}
		return _ftsQueryMinTermLength = getPersistenceContext().getValue(FTSQUERYMINTERMLENGTH, _ftsQueryMinTermLength);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsWildcardQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsWildcardQueryBoost
	 */
	@Accessor(qualifier = "ftsWildcardQueryBoost", type = Accessor.Type.GETTER)
	public Float getFtsWildcardQueryBoost()
	{
		if (this._ftsWildcardQueryBoost!=null)
		{
			return _ftsWildcardQueryBoost;
		}
		return _ftsWildcardQueryBoost = getPersistenceContext().getValue(FTSWILDCARDQUERYBOOST, _ftsWildcardQueryBoost);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsWildcardQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsWildcardQueryMinTermLength
	 */
	@Accessor(qualifier = "ftsWildcardQueryMinTermLength", type = Accessor.Type.GETTER)
	public Integer getFtsWildcardQueryMinTermLength()
	{
		if (this._ftsWildcardQueryMinTermLength!=null)
		{
			return _ftsWildcardQueryMinTermLength;
		}
		return _ftsWildcardQueryMinTermLength = getPersistenceContext().getValue(FTSWILDCARDQUERYMINTERMLENGTH, _ftsWildcardQueryMinTermLength);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsWildcardQueryType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsWildcardQueryType
	 */
	@Accessor(qualifier = "ftsWildcardQueryType", type = Accessor.Type.GETTER)
	public SolrWildcardType getFtsWildcardQueryType()
	{
		if (this._ftsWildcardQueryType!=null)
		{
			return _ftsWildcardQueryType;
		}
		return _ftsWildcardQueryType = getPersistenceContext().getValue(FTSWILDCARDQUERYTYPE, _ftsWildcardQueryType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.name</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the name - name of the property
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
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.priority</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the priority - The ordering of this property in the list of facets. Higher number ordered first.
	 */
	@Accessor(qualifier = "priority", type = Accessor.Type.GETTER)
	public int getPriority()
	{
		return toPrimitive( _priority = getPersistenceContext().getValue(PRIORITY, _priority));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.rangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the rangeSet - range set used by this property
	 */
	@Accessor(qualifier = "rangeSet", type = Accessor.Type.GETTER)
	public SolrValueRangeSetModel getRangeSet()
	{
		if (this._rangeSet!=null)
		{
			return _rangeSet;
		}
		return _rangeSet = getPersistenceContext().getValue(RANGESET, _rangeSet);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.rangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rangeSets
	 */
	@Accessor(qualifier = "rangeSets", type = Accessor.Type.GETTER)
	public List<SolrValueRangeSetModel> getRangeSets()
	{
		if (this._rangeSets!=null)
		{
			return _rangeSets;
		}
		return _rangeSets = getPersistenceContext().getValue(RANGESETS, _rangeSets);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the solrFacetReconfigurations
	 */
	@Accessor(qualifier = "solrFacetReconfigurations", type = Accessor.Type.GETTER)
	public Collection<SolrFacetReconfigurationModel> getSolrFacetReconfigurations()
	{
		if (this._solrFacetReconfigurations!=null)
		{
			return _solrFacetReconfigurations;
		}
		return _solrFacetReconfigurations = getPersistenceContext().getValue(SOLRFACETRECONFIGURATIONS, _solrFacetReconfigurations);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the solrIndexedType
	 */
	@Accessor(qualifier = "solrIndexedType", type = Accessor.Type.GETTER)
	public SolrIndexedTypeModel getSolrIndexedType()
	{
		if (this._solrIndexedType!=null)
		{
			return _solrIndexedType;
		}
		return _solrIndexedType = getPersistenceContext().getValue(SOLRINDEXEDTYPE, _solrIndexedType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.sortableType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the sortableType - sortable type of the property
	 */
	@Accessor(qualifier = "sortableType", type = Accessor.Type.GETTER)
	public SolrPropertiesTypes getSortableType()
	{
		if (this._sortableType!=null)
		{
			return _sortableType;
		}
		return _sortableType = getPersistenceContext().getValue(SORTABLETYPE, _sortableType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.topValuesProvider</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the topValuesProvider - topValuesProvider used by this property
	 */
	@Accessor(qualifier = "topValuesProvider", type = Accessor.Type.GETTER)
	public String getTopValuesProvider()
	{
		if (this._topValuesProvider!=null)
		{
			return _topValuesProvider;
		}
		return _topValuesProvider = getPersistenceContext().getValue(TOPVALUESPROVIDER, _topValuesProvider);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the type - type of the property
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public SolrPropertiesTypes getType()
	{
		if (this._type!=null)
		{
			return _type;
		}
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.useForAutocomplete</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the useForAutocomplete - Determines if this property will be part of for solr's auto-complete dictionary
	 */
	@Accessor(qualifier = "useForAutocomplete", type = Accessor.Type.GETTER)
	public Boolean getUseForAutocomplete()
	{
		if (this._useForAutocomplete!=null)
		{
			return _useForAutocomplete;
		}
		return _useForAutocomplete = getPersistenceContext().getValue(USEFORAUTOCOMPLETE, _useForAutocomplete);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.useForSpellchecking</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the useForSpellchecking - Determines if this property will be part of for solr's spell checking dictionary
	 */
	@Accessor(qualifier = "useForSpellchecking", type = Accessor.Type.GETTER)
	public Boolean getUseForSpellchecking()
	{
		if (this._useForSpellchecking!=null)
		{
			return _useForSpellchecking;
		}
		return _useForSpellchecking = getPersistenceContext().getValue(USEFORSPELLCHECKING, _useForSpellchecking);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.valueProviderParameter</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the valueProviderParameter - Parameter for Field Value Provider (used e.g. by springELvalueProvider)
	 */
	@Accessor(qualifier = "valueProviderParameter", type = Accessor.Type.GETTER)
	public String getValueProviderParameter()
	{
		if (this._valueProviderParameter!=null)
		{
			return _valueProviderParameter;
		}
		return _valueProviderParameter = getPersistenceContext().getValue(VALUEPROVIDERPARAMETER, _valueProviderParameter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.valueProviderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the valueProviderParameters
	 */
	@Accessor(qualifier = "valueProviderParameters", type = Accessor.Type.GETTER)
	public Map<String,String> getValueProviderParameters()
	{
		if (this._valueProviderParameters!=null)
		{
			return _valueProviderParameters;
		}
		return _valueProviderParameters = getPersistenceContext().getValue(VALUEPROVIDERPARAMETERS, _valueProviderParameters);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.categoryField</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the categoryField - True if this is a category field.
	 */
	@Accessor(qualifier = "categoryField", type = Accessor.Type.GETTER)
	public boolean isCategoryField()
	{
		return toPrimitive( _categoryField = getPersistenceContext().getValue(CATEGORYFIELD, _categoryField));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.currency</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the currency
	 */
	@Accessor(qualifier = "currency", type = Accessor.Type.GETTER)
	public boolean isCurrency()
	{
		return toPrimitive( _currency = getPersistenceContext().getValue(CURRENCY, _currency));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.facet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the facet
	 */
	@Accessor(qualifier = "facet", type = Accessor.Type.GETTER)
	public boolean isFacet()
	{
		return toPrimitive( _facet = getPersistenceContext().getValue(FACET, _facet));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsFuzzyQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsFuzzyQuery
	 */
	@Accessor(qualifier = "ftsFuzzyQuery", type = Accessor.Type.GETTER)
	public boolean isFtsFuzzyQuery()
	{
		return toPrimitive( _ftsFuzzyQuery = getPersistenceContext().getValue(FTSFUZZYQUERY, _ftsFuzzyQuery));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsPhraseQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsPhraseQuery
	 */
	@Accessor(qualifier = "ftsPhraseQuery", type = Accessor.Type.GETTER)
	public boolean isFtsPhraseQuery()
	{
		return toPrimitive( _ftsPhraseQuery = getPersistenceContext().getValue(FTSPHRASEQUERY, _ftsPhraseQuery));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsQuery
	 */
	@Accessor(qualifier = "ftsQuery", type = Accessor.Type.GETTER)
	public boolean isFtsQuery()
	{
		return toPrimitive( _ftsQuery = getPersistenceContext().getValue(FTSQUERY, _ftsQuery));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.ftsWildcardQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the ftsWildcardQuery
	 */
	@Accessor(qualifier = "ftsWildcardQuery", type = Accessor.Type.GETTER)
	public boolean isFtsWildcardQuery()
	{
		return toPrimitive( _ftsWildcardQuery = getPersistenceContext().getValue(FTSWILDCARDQUERY, _ftsWildcardQuery));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.includeInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the includeInResponse
	 */
	@Accessor(qualifier = "includeInResponse", type = Accessor.Type.GETTER)
	public boolean isIncludeInResponse()
	{
		return toPrimitive( _includeInResponse = getPersistenceContext().getValue(INCLUDEINRESPONSE, _includeInResponse));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.localized</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the localized
	 */
	@Accessor(qualifier = "localized", type = Accessor.Type.GETTER)
	public boolean isLocalized()
	{
		return toPrimitive( _localized = getPersistenceContext().getValue(LOCALIZED, _localized));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.multiValue</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the multiValue
	 */
	@Accessor(qualifier = "multiValue", type = Accessor.Type.GETTER)
	public boolean isMultiValue()
	{
		return toPrimitive( _multiValue = getPersistenceContext().getValue(MULTIVALUE, _multiValue));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrIndexedProperty.visible</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the visible - This property is used to define whether a facet should be visible for frontend users or not.
	 */
	@Accessor(qualifier = "visible", type = Accessor.Type.GETTER)
	public boolean isVisible()
	{
		return toPrimitive( _visible = getPersistenceContext().getValue(VISIBLE, _visible));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.boostRules</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the boostRules
	 */
	@Accessor(qualifier = "boostRules", type = Accessor.Type.SETTER)
	public void setBoostRules(final List<SolrBoostRuleModel> value)
	{
		_boostRules = getPersistenceContext().setValue(BOOSTRULES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.categoryField</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the categoryField - True if this is a category field.
	 */
	@Accessor(qualifier = "categoryField", type = Accessor.Type.SETTER)
	public void setCategoryField(final boolean value)
	{
		_categoryField = getPersistenceContext().setValue(CATEGORYFIELD, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.classAttributeAssignment</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the classAttributeAssignment - The classification system category feature for this property.
	 */
	@Accessor(qualifier = "classAttributeAssignment", type = Accessor.Type.SETTER)
	public void setClassAttributeAssignment(final ClassAttributeAssignmentModel value)
	{
		_classAttributeAssignment = getPersistenceContext().setValue(CLASSATTRIBUTEASSIGNMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.currency</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the currency
	 */
	@Accessor(qualifier = "currency", type = Accessor.Type.SETTER)
	public void setCurrency(final boolean value)
	{
		_currency = getPersistenceContext().setValue(CURRENCY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.customFacetSortProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the customFacetSortProvider - The custom sort provider for the facet values, only used if facetSort is set to Custom.
	 */
	@Accessor(qualifier = "customFacetSortProvider", type = Accessor.Type.SETTER)
	public void setCustomFacetSortProvider(final String value)
	{
		_customFacetSortProvider = getPersistenceContext().setValue(CUSTOMFACETSORTPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.displayName</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the displayName - The display name for this property in the list of facet.
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.SETTER)
	public void setDisplayName(final String value)
	{
		setDisplayName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.displayName</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the displayName - The display name for this property in the list of facet.
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "displayName", type = Accessor.Type.SETTER)
	public void setDisplayName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DISPLAYNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.exportId</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the exportId - exportId used by this property
	 */
	@Accessor(qualifier = "exportId", type = Accessor.Type.SETTER)
	public void setExportId(final String value)
	{
		_exportId = getPersistenceContext().setValue(EXPORTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.facet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facet
	 */
	@Accessor(qualifier = "facet", type = Accessor.Type.SETTER)
	public void setFacet(final boolean value)
	{
		_facet = getPersistenceContext().setValue(FACET, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.facetDisplayNameProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetDisplayNameProvider - facetDisplayNameProvider used by this property
	 */
	@Accessor(qualifier = "facetDisplayNameProvider", type = Accessor.Type.SETTER)
	public void setFacetDisplayNameProvider(final String value)
	{
		_facetDisplayNameProvider = getPersistenceContext().setValue(FACETDISPLAYNAMEPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.facetSort</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the facetSort - Deprecated - please use custom sort providers. The sort option to use to order the
	 * 							facet values.
	 */
	@Deprecated
	@Accessor(qualifier = "facetSort", type = Accessor.Type.SETTER)
	public void setFacetSort(final SolrIndexedPropertyFacetSort value)
	{
		_facetSort = getPersistenceContext().setValue(FACETSORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.facetType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the facetType - The facet type, if this is a facet property.
	 */
	@Accessor(qualifier = "facetType", type = Accessor.Type.SETTER)
	public void setFacetType(final SolrIndexedPropertyFacetType value)
	{
		_facetType = getPersistenceContext().setValue(FACETTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.facetVisibilityRules</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the facetVisibilityRules
	 */
	@Accessor(qualifier = "facetVisibilityRules", type = Accessor.Type.SETTER)
	public void setFacetVisibilityRules(final Collection<AbstractSolrFacetVisibilityRuleModel> value)
	{
		_facetVisibilityRules = getPersistenceContext().setValue(FACETVISIBILITYRULES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.fieldValueProvider</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the fieldValueProvider - fieldValueProvider used by this property
	 */
	@Accessor(qualifier = "fieldValueProvider", type = Accessor.Type.SETTER)
	public void setFieldValueProvider(final String value)
	{
		_fieldValueProvider = getPersistenceContext().setValue(FIELDVALUEPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsFuzzyQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsFuzzyQuery
	 */
	@Accessor(qualifier = "ftsFuzzyQuery", type = Accessor.Type.SETTER)
	public void setFtsFuzzyQuery(final boolean value)
	{
		_ftsFuzzyQuery = getPersistenceContext().setValue(FTSFUZZYQUERY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsFuzzyQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsFuzzyQueryBoost
	 */
	@Accessor(qualifier = "ftsFuzzyQueryBoost", type = Accessor.Type.SETTER)
	public void setFtsFuzzyQueryBoost(final Float value)
	{
		_ftsFuzzyQueryBoost = getPersistenceContext().setValue(FTSFUZZYQUERYBOOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsFuzzyQueryFuzziness</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsFuzzyQueryFuzziness
	 */
	@Accessor(qualifier = "ftsFuzzyQueryFuzziness", type = Accessor.Type.SETTER)
	public void setFtsFuzzyQueryFuzziness(final Integer value)
	{
		_ftsFuzzyQueryFuzziness = getPersistenceContext().setValue(FTSFUZZYQUERYFUZZINESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsFuzzyQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsFuzzyQueryMinTermLength
	 */
	@Accessor(qualifier = "ftsFuzzyQueryMinTermLength", type = Accessor.Type.SETTER)
	public void setFtsFuzzyQueryMinTermLength(final Integer value)
	{
		_ftsFuzzyQueryMinTermLength = getPersistenceContext().setValue(FTSFUZZYQUERYMINTERMLENGTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsPhraseQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsPhraseQuery
	 */
	@Accessor(qualifier = "ftsPhraseQuery", type = Accessor.Type.SETTER)
	public void setFtsPhraseQuery(final boolean value)
	{
		_ftsPhraseQuery = getPersistenceContext().setValue(FTSPHRASEQUERY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsPhraseQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsPhraseQueryBoost
	 */
	@Accessor(qualifier = "ftsPhraseQueryBoost", type = Accessor.Type.SETTER)
	public void setFtsPhraseQueryBoost(final Float value)
	{
		_ftsPhraseQueryBoost = getPersistenceContext().setValue(FTSPHRASEQUERYBOOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsPhraseQuerySlop</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsPhraseQuerySlop
	 */
	@Accessor(qualifier = "ftsPhraseQuerySlop", type = Accessor.Type.SETTER)
	public void setFtsPhraseQuerySlop(final Float value)
	{
		_ftsPhraseQuerySlop = getPersistenceContext().setValue(FTSPHRASEQUERYSLOP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsQuery
	 */
	@Accessor(qualifier = "ftsQuery", type = Accessor.Type.SETTER)
	public void setFtsQuery(final boolean value)
	{
		_ftsQuery = getPersistenceContext().setValue(FTSQUERY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsQueryBoost
	 */
	@Accessor(qualifier = "ftsQueryBoost", type = Accessor.Type.SETTER)
	public void setFtsQueryBoost(final Float value)
	{
		_ftsQueryBoost = getPersistenceContext().setValue(FTSQUERYBOOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsQueryMinTermLength
	 */
	@Accessor(qualifier = "ftsQueryMinTermLength", type = Accessor.Type.SETTER)
	public void setFtsQueryMinTermLength(final Integer value)
	{
		_ftsQueryMinTermLength = getPersistenceContext().setValue(FTSQUERYMINTERMLENGTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsWildcardQuery</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsWildcardQuery
	 */
	@Accessor(qualifier = "ftsWildcardQuery", type = Accessor.Type.SETTER)
	public void setFtsWildcardQuery(final boolean value)
	{
		_ftsWildcardQuery = getPersistenceContext().setValue(FTSWILDCARDQUERY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsWildcardQueryBoost</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsWildcardQueryBoost
	 */
	@Accessor(qualifier = "ftsWildcardQueryBoost", type = Accessor.Type.SETTER)
	public void setFtsWildcardQueryBoost(final Float value)
	{
		_ftsWildcardQueryBoost = getPersistenceContext().setValue(FTSWILDCARDQUERYBOOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsWildcardQueryMinTermLength</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsWildcardQueryMinTermLength
	 */
	@Accessor(qualifier = "ftsWildcardQueryMinTermLength", type = Accessor.Type.SETTER)
	public void setFtsWildcardQueryMinTermLength(final Integer value)
	{
		_ftsWildcardQueryMinTermLength = getPersistenceContext().setValue(FTSWILDCARDQUERYMINTERMLENGTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.ftsWildcardQueryType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the ftsWildcardQueryType
	 */
	@Accessor(qualifier = "ftsWildcardQueryType", type = Accessor.Type.SETTER)
	public void setFtsWildcardQueryType(final SolrWildcardType value)
	{
		_ftsWildcardQueryType = getPersistenceContext().setValue(FTSWILDCARDQUERYTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.includeInResponse</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the includeInResponse
	 */
	@Accessor(qualifier = "includeInResponse", type = Accessor.Type.SETTER)
	public void setIncludeInResponse(final boolean value)
	{
		_includeInResponse = getPersistenceContext().setValue(INCLUDEINRESPONSE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.localized</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the localized
	 */
	@Accessor(qualifier = "localized", type = Accessor.Type.SETTER)
	public void setLocalized(final boolean value)
	{
		_localized = getPersistenceContext().setValue(LOCALIZED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.multiValue</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the multiValue
	 */
	@Accessor(qualifier = "multiValue", type = Accessor.Type.SETTER)
	public void setMultiValue(final boolean value)
	{
		_multiValue = getPersistenceContext().setValue(MULTIVALUE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SolrIndexedProperty.name</code> attribute defined at extension <code>solrfacetsearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the name - name of the property
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		_name = getPersistenceContext().setValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.priority</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the priority - The ordering of this property in the list of facets. Higher number ordered first.
	 */
	@Accessor(qualifier = "priority", type = Accessor.Type.SETTER)
	public void setPriority(final int value)
	{
		_priority = getPersistenceContext().setValue(PRIORITY, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.rangeSet</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the rangeSet - range set used by this property
	 */
	@Accessor(qualifier = "rangeSet", type = Accessor.Type.SETTER)
	public void setRangeSet(final SolrValueRangeSetModel value)
	{
		_rangeSet = getPersistenceContext().setValue(RANGESET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.rangeSets</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the rangeSets
	 */
	@Accessor(qualifier = "rangeSets", type = Accessor.Type.SETTER)
	public void setRangeSets(final List<SolrValueRangeSetModel> value)
	{
		_rangeSets = getPersistenceContext().setValue(RANGESETS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.solrFacetReconfigurations</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the solrFacetReconfigurations
	 */
	@Accessor(qualifier = "solrFacetReconfigurations", type = Accessor.Type.SETTER)
	public void setSolrFacetReconfigurations(final Collection<SolrFacetReconfigurationModel> value)
	{
		_solrFacetReconfigurations = getPersistenceContext().setValue(SOLRFACETRECONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.solrIndexedType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the solrIndexedType
	 */
	@Accessor(qualifier = "solrIndexedType", type = Accessor.Type.SETTER)
	public void setSolrIndexedType(final SolrIndexedTypeModel value)
	{
		_solrIndexedType = getPersistenceContext().setValue(SOLRINDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.sortableType</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the sortableType - sortable type of the property
	 */
	@Accessor(qualifier = "sortableType", type = Accessor.Type.SETTER)
	public void setSortableType(final SolrPropertiesTypes value)
	{
		_sortableType = getPersistenceContext().setValue(SORTABLETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.topValuesProvider</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the topValuesProvider - topValuesProvider used by this property
	 */
	@Accessor(qualifier = "topValuesProvider", type = Accessor.Type.SETTER)
	public void setTopValuesProvider(final String value)
	{
		_topValuesProvider = getPersistenceContext().setValue(TOPVALUESPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.type</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the type - type of the property
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.SETTER)
	public void setType(final SolrPropertiesTypes value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.useForAutocomplete</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the useForAutocomplete - Determines if this property will be part of for solr's auto-complete dictionary
	 */
	@Accessor(qualifier = "useForAutocomplete", type = Accessor.Type.SETTER)
	public void setUseForAutocomplete(final Boolean value)
	{
		_useForAutocomplete = getPersistenceContext().setValue(USEFORAUTOCOMPLETE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.useForSpellchecking</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the useForSpellchecking - Determines if this property will be part of for solr's spell checking dictionary
	 */
	@Accessor(qualifier = "useForSpellchecking", type = Accessor.Type.SETTER)
	public void setUseForSpellchecking(final Boolean value)
	{
		_useForSpellchecking = getPersistenceContext().setValue(USEFORSPELLCHECKING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.valueProviderParameter</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the valueProviderParameter - Parameter for Field Value Provider (used e.g. by springELvalueProvider)
	 */
	@Accessor(qualifier = "valueProviderParameter", type = Accessor.Type.SETTER)
	public void setValueProviderParameter(final String value)
	{
		_valueProviderParameter = getPersistenceContext().setValue(VALUEPROVIDERPARAMETER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.valueProviderParameters</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the valueProviderParameters
	 */
	@Accessor(qualifier = "valueProviderParameters", type = Accessor.Type.SETTER)
	public void setValueProviderParameters(final Map<String,String> value)
	{
		_valueProviderParameters = getPersistenceContext().setValue(VALUEPROVIDERPARAMETERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrIndexedProperty.visible</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the visible - This property is used to define whether a facet should be visible for frontend users or not.
	 */
	@Accessor(qualifier = "visible", type = Accessor.Type.SETTER)
	public void setVisible(final boolean value)
	{
		_visible = getPersistenceContext().setValue(VISIBLE, toObject(value));
	}
	
}
