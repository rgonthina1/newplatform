/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 20 Jun, 2016 7:36:28 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.commercesearch.model.SolrBoostRuleModel;
import de.hybris.platform.solrfacetsearch.config.FacetType;
import de.hybris.platform.solrfacetsearch.config.ValueRangeSet;
import de.hybris.platform.solrfacetsearch.config.WildcardType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class IndexedProperty  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>IndexedProperty.ftsWildcardQueryMinTermLength</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer ftsWildcardQueryMinTermLength;
	/** <i>Generated property</i> for <code>IndexedProperty.fieldValueProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String fieldValueProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.displayName</code> property defined at extension <code>commerceservices</code>. */
	private String displayName;
	/** <i>Generated property</i> for <code>IndexedProperty.localized</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean localized;
	/** <i>Generated property</i> for <code>IndexedProperty.valueRangeSets</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<String,ValueRangeSet> valueRangeSets;
	/** <i>Generated property</i> for <code>IndexedProperty.type</code> property defined at extension <code>solrfacetsearch</code>. */
	private String type;
	/** <i>Generated property</i> for <code>IndexedProperty.multiValue</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean multiValue;
	/** <i>Generated property</i> for <code>IndexedProperty.autoSuggest</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean autoSuggest;
	/** <i>Generated property</i> for <code>IndexedProperty.categoryField</code> property defined at extension <code>commerceservices</code>. */
	private boolean categoryField;
	/** <i>Generated property</i> for <code>IndexedProperty.boostRules</code> property defined at extension <code>commercesearch</code>. */
	private Collection<SolrBoostRuleModel> boostRules;
	/** <i>Generated property</i> for <code>IndexedProperty.spellCheck</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean spellCheck;
	/** <i>Generated property</i> for <code>IndexedProperty.facetType</code> property defined at extension <code>solrfacetsearch</code>. */
	private FacetType facetType;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsQueryMinTermLength</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer ftsQueryMinTermLength;
	/** <i>Generated property</i> for <code>IndexedProperty.classAttributeAssignment</code> property defined at extension <code>commerceservices</code>. */
	private ClassAttributeAssignmentModel classAttributeAssignment;
	/** <i>Generated property</i> for <code>IndexedProperty.valueProviderParameters</code> property defined at extension <code>solrfacetsearch</code>. */
	private Map<String,String> valueProviderParameters;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsQuery</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean ftsQuery;
	/** <i>Generated property</i> for <code>IndexedProperty.currency</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean currency;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsFuzzyQuery</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean ftsFuzzyQuery;
	/** <i>Generated property</i> for <code>IndexedProperty.exportId</code> property defined at extension <code>solrfacetsearch</code>. */
	private String exportId;
	/** <i>Generated property</i> for <code>IndexedProperty.facetDisplayNameProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String facetDisplayNameProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsFuzzyQueryFuzziness</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer ftsFuzzyQueryFuzziness;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsFuzzyQueryBoost</code> property defined at extension <code>solrfacetsearch</code>. */
	private Float ftsFuzzyQueryBoost;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsQueryBoost</code> property defined at extension <code>solrfacetsearch</code>. */
	private Float ftsQueryBoost;
	/** <i>Generated property</i> for <code>IndexedProperty.facetSortProvider</code> property defined at extension <code>solrfacetsearch</code>. */
	private String facetSortProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.topValuesProvider</code> property defined at extension <code>commerceservices</code>. */
	private String topValuesProvider;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsPhraseQuerySlop</code> property defined at extension <code>solrfacetsearch</code>. */
	private Float ftsPhraseQuerySlop;
	/** <i>Generated property</i> for <code>IndexedProperty.visible</code> property defined at extension <code>commerceservices</code>. */
	private boolean visible;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsWildcardQueryBoost</code> property defined at extension <code>solrfacetsearch</code>. */
	private Float ftsWildcardQueryBoost;
	/** <i>Generated property</i> for <code>IndexedProperty.facetVisibilityRules</code> property defined at extension <code>commercesearch</code>. */
	private List<? extends AbstractSolrFacetVisibilityRuleData> facetVisibilityRules;
	/** <i>Generated property</i> for <code>IndexedProperty.priority</code> property defined at extension <code>solrfacetsearch</code>. */
	private int priority;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsFuzzyQueryMinTermLength</code> property defined at extension <code>solrfacetsearch</code>. */
	private Integer ftsFuzzyQueryMinTermLength;
	/** <i>Generated property</i> for <code>IndexedProperty.valueProviderParameter</code> property defined at extension <code>solrfacetsearch</code>. */
	private String valueProviderParameter;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsWildcardQuery</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean ftsWildcardQuery;
	/** <i>Generated property</i> for <code>IndexedProperty.sortableType</code> property defined at extension <code>solrfacetsearch</code>. */
	private String sortableType;
	/** <i>Generated property</i> for <code>IndexedProperty.name</code> property defined at extension <code>solrfacetsearch</code>. */
	private String name;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsPhraseQuery</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean ftsPhraseQuery;
	/** <i>Generated property</i> for <code>IndexedProperty.facet</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean facet;
	/** <i>Generated property</i> for <code>IndexedProperty.includeInResponse</code> property defined at extension <code>solrfacetsearch</code>. */
	private boolean includeInResponse;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsWildcardQueryType</code> property defined at extension <code>solrfacetsearch</code>. */
	private WildcardType ftsWildcardQueryType;
	/** <i>Generated property</i> for <code>IndexedProperty.ftsPhraseQueryBoost</code> property defined at extension <code>solrfacetsearch</code>. */
	private Float ftsPhraseQueryBoost;
	/** <i>Generated property</i> for <code>IndexedProperty.multiSelect</code> property defined at extension <code>commerceservices</code>. */
	private boolean multiSelect;
		
	public IndexedProperty()
	{
		// default constructor
	}
	
		
	public void setFtsWildcardQueryMinTermLength(final Integer ftsWildcardQueryMinTermLength)
	{
		this.ftsWildcardQueryMinTermLength = ftsWildcardQueryMinTermLength;
	}
	
		
	public Integer getFtsWildcardQueryMinTermLength() 
	{
		return ftsWildcardQueryMinTermLength;
	}
		
		
	public void setFieldValueProvider(final String fieldValueProvider)
	{
		this.fieldValueProvider = fieldValueProvider;
	}
	
		
	public String getFieldValueProvider() 
	{
		return fieldValueProvider;
	}
		
		
	public void setDisplayName(final String displayName)
	{
		this.displayName = displayName;
	}
	
		
	public String getDisplayName() 
	{
		return displayName;
	}
		
		
	public void setLocalized(final boolean localized)
	{
		this.localized = localized;
	}
	
		
	public boolean isLocalized() 
	{
		return localized;
	}
		
		
	public void setValueRangeSets(final Map<String,ValueRangeSet> valueRangeSets)
	{
		this.valueRangeSets = valueRangeSets;
	}
	
		
	public Map<String,ValueRangeSet> getValueRangeSets() 
	{
		return valueRangeSets;
	}
		
		
	public void setType(final String type)
	{
		this.type = type;
	}
	
		
	public String getType() 
	{
		return type;
	}
		
		
	public void setMultiValue(final boolean multiValue)
	{
		this.multiValue = multiValue;
	}
	
		
	public boolean isMultiValue() 
	{
		return multiValue;
	}
		
		
	public void setAutoSuggest(final boolean autoSuggest)
	{
		this.autoSuggest = autoSuggest;
	}
	
		
	public boolean isAutoSuggest() 
	{
		return autoSuggest;
	}
		
		
	public void setCategoryField(final boolean categoryField)
	{
		this.categoryField = categoryField;
	}
	
		
	public boolean isCategoryField() 
	{
		return categoryField;
	}
		
		
	public void setBoostRules(final Collection<SolrBoostRuleModel> boostRules)
	{
		this.boostRules = boostRules;
	}
	
		
	public Collection<SolrBoostRuleModel> getBoostRules() 
	{
		return boostRules;
	}
		
		
	public void setSpellCheck(final boolean spellCheck)
	{
		this.spellCheck = spellCheck;
	}
	
		
	public boolean isSpellCheck() 
	{
		return spellCheck;
	}
		
		
	public void setFacetType(final FacetType facetType)
	{
		this.facetType = facetType;
	}
	
		
	public FacetType getFacetType() 
	{
		return facetType;
	}
		
		
	public void setFtsQueryMinTermLength(final Integer ftsQueryMinTermLength)
	{
		this.ftsQueryMinTermLength = ftsQueryMinTermLength;
	}
	
		
	public Integer getFtsQueryMinTermLength() 
	{
		return ftsQueryMinTermLength;
	}
		
		
	public void setClassAttributeAssignment(final ClassAttributeAssignmentModel classAttributeAssignment)
	{
		this.classAttributeAssignment = classAttributeAssignment;
	}
	
		
	public ClassAttributeAssignmentModel getClassAttributeAssignment() 
	{
		return classAttributeAssignment;
	}
		
		
	public void setValueProviderParameters(final Map<String,String> valueProviderParameters)
	{
		this.valueProviderParameters = valueProviderParameters;
	}
	
		
	public Map<String,String> getValueProviderParameters() 
	{
		return valueProviderParameters;
	}
		
		
	public void setFtsQuery(final boolean ftsQuery)
	{
		this.ftsQuery = ftsQuery;
	}
	
		
	public boolean isFtsQuery() 
	{
		return ftsQuery;
	}
		
		
	public void setCurrency(final boolean currency)
	{
		this.currency = currency;
	}
	
		
	public boolean isCurrency() 
	{
		return currency;
	}
		
		
	public void setFtsFuzzyQuery(final boolean ftsFuzzyQuery)
	{
		this.ftsFuzzyQuery = ftsFuzzyQuery;
	}
	
		
	public boolean isFtsFuzzyQuery() 
	{
		return ftsFuzzyQuery;
	}
		
		
	public void setExportId(final String exportId)
	{
		this.exportId = exportId;
	}
	
		
	public String getExportId() 
	{
		return exportId;
	}
		
		
	public void setFacetDisplayNameProvider(final String facetDisplayNameProvider)
	{
		this.facetDisplayNameProvider = facetDisplayNameProvider;
	}
	
		
	public String getFacetDisplayNameProvider() 
	{
		return facetDisplayNameProvider;
	}
		
		
	public void setFtsFuzzyQueryFuzziness(final Integer ftsFuzzyQueryFuzziness)
	{
		this.ftsFuzzyQueryFuzziness = ftsFuzzyQueryFuzziness;
	}
	
		
	public Integer getFtsFuzzyQueryFuzziness() 
	{
		return ftsFuzzyQueryFuzziness;
	}
		
		
	public void setFtsFuzzyQueryBoost(final Float ftsFuzzyQueryBoost)
	{
		this.ftsFuzzyQueryBoost = ftsFuzzyQueryBoost;
	}
	
		
	public Float getFtsFuzzyQueryBoost() 
	{
		return ftsFuzzyQueryBoost;
	}
		
		
	public void setFtsQueryBoost(final Float ftsQueryBoost)
	{
		this.ftsQueryBoost = ftsQueryBoost;
	}
	
		
	public Float getFtsQueryBoost() 
	{
		return ftsQueryBoost;
	}
		
		
	public void setFacetSortProvider(final String facetSortProvider)
	{
		this.facetSortProvider = facetSortProvider;
	}
	
		
	public String getFacetSortProvider() 
	{
		return facetSortProvider;
	}
		
		
	public void setTopValuesProvider(final String topValuesProvider)
	{
		this.topValuesProvider = topValuesProvider;
	}
	
		
	public String getTopValuesProvider() 
	{
		return topValuesProvider;
	}
		
		
	public void setFtsPhraseQuerySlop(final Float ftsPhraseQuerySlop)
	{
		this.ftsPhraseQuerySlop = ftsPhraseQuerySlop;
	}
	
		
	public Float getFtsPhraseQuerySlop() 
	{
		return ftsPhraseQuerySlop;
	}
		
		
	public void setVisible(final boolean visible)
	{
		this.visible = visible;
	}
	
		
	public boolean isVisible() 
	{
		return visible;
	}
		
		
	public void setFtsWildcardQueryBoost(final Float ftsWildcardQueryBoost)
	{
		this.ftsWildcardQueryBoost = ftsWildcardQueryBoost;
	}
	
		
	public Float getFtsWildcardQueryBoost() 
	{
		return ftsWildcardQueryBoost;
	}
		
		
	public void setFacetVisibilityRules(final List<? extends AbstractSolrFacetVisibilityRuleData> facetVisibilityRules)
	{
		this.facetVisibilityRules = facetVisibilityRules;
	}
	
		
	public List<? extends AbstractSolrFacetVisibilityRuleData> getFacetVisibilityRules() 
	{
		return facetVisibilityRules;
	}
		
		
	public void setPriority(final int priority)
	{
		this.priority = priority;
	}
	
		
	public int getPriority() 
	{
		return priority;
	}
		
		
	public void setFtsFuzzyQueryMinTermLength(final Integer ftsFuzzyQueryMinTermLength)
	{
		this.ftsFuzzyQueryMinTermLength = ftsFuzzyQueryMinTermLength;
	}
	
		
	public Integer getFtsFuzzyQueryMinTermLength() 
	{
		return ftsFuzzyQueryMinTermLength;
	}
		
		
	public void setValueProviderParameter(final String valueProviderParameter)
	{
		this.valueProviderParameter = valueProviderParameter;
	}
	
		
	public String getValueProviderParameter() 
	{
		return valueProviderParameter;
	}
		
		
	public void setFtsWildcardQuery(final boolean ftsWildcardQuery)
	{
		this.ftsWildcardQuery = ftsWildcardQuery;
	}
	
		
	public boolean isFtsWildcardQuery() 
	{
		return ftsWildcardQuery;
	}
		
		
	public void setSortableType(final String sortableType)
	{
		this.sortableType = sortableType;
	}
	
		
	public String getSortableType() 
	{
		return sortableType;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setFtsPhraseQuery(final boolean ftsPhraseQuery)
	{
		this.ftsPhraseQuery = ftsPhraseQuery;
	}
	
		
	public boolean isFtsPhraseQuery() 
	{
		return ftsPhraseQuery;
	}
		
		
	public void setFacet(final boolean facet)
	{
		this.facet = facet;
	}
	
		
	public boolean isFacet() 
	{
		return facet;
	}
		
		
	public void setIncludeInResponse(final boolean includeInResponse)
	{
		this.includeInResponse = includeInResponse;
	}
	
		
	public boolean isIncludeInResponse() 
	{
		return includeInResponse;
	}
		
		
	public void setFtsWildcardQueryType(final WildcardType ftsWildcardQueryType)
	{
		this.ftsWildcardQueryType = ftsWildcardQueryType;
	}
	
		
	public WildcardType getFtsWildcardQueryType() 
	{
		return ftsWildcardQueryType;
	}
		
		
	public void setFtsPhraseQueryBoost(final Float ftsPhraseQueryBoost)
	{
		this.ftsPhraseQueryBoost = ftsPhraseQueryBoost;
	}
	
		
	public Float getFtsPhraseQueryBoost() 
	{
		return ftsPhraseQueryBoost;
	}
		
		
	public void setMultiSelect(final boolean multiSelect)
	{
		this.multiSelect = multiSelect;
	}
	
		
	public boolean isMultiSelect() 
	{
		return multiSelect;
	}
		
	
}