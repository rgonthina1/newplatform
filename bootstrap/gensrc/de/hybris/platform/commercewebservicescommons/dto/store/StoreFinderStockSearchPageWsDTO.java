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
package de.hybris.platform.commercewebservicescommons.dto.store;

import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.pagedata.PaginationWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.pagedata.SortWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.PointOfServiceStockWsDTO;
import java.util.List;

public class StoreFinderStockSearchPageWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.sourceLatitude</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double sourceLatitude;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.sourceLongitude</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double sourceLongitude;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.product</code> property defined at extension <code>commercewebservicescommons</code>. */
	private ProductWsDTO product;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.pagination</code> property defined at extension <code>commercewebservicescommons</code>. */
	private PaginationWsDTO pagination;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.locationText</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String locationText;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.boundWestLongitude</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double boundWestLongitude;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.stores</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<PointOfServiceStockWsDTO> stores;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.boundNorthLatitude</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double boundNorthLatitude;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.sorts</code> property defined at extension <code>commercewebservicescommons</code>. */
	private List<SortWsDTO> sorts;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.boundSouthLatitude</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double boundSouthLatitude;
	/** <i>Generated property</i> for <code>StoreFinderStockSearchPageWsDTO.boundEastLongitude</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Double boundEastLongitude;
		
	public StoreFinderStockSearchPageWsDTO()
	{
		// default constructor
	}
	
		
	public void setSourceLatitude(final Double sourceLatitude)
	{
		this.sourceLatitude = sourceLatitude;
	}
	
		
	public Double getSourceLatitude() 
	{
		return sourceLatitude;
	}
		
		
	public void setSourceLongitude(final Double sourceLongitude)
	{
		this.sourceLongitude = sourceLongitude;
	}
	
		
	public Double getSourceLongitude() 
	{
		return sourceLongitude;
	}
		
		
	public void setProduct(final ProductWsDTO product)
	{
		this.product = product;
	}
	
		
	public ProductWsDTO getProduct() 
	{
		return product;
	}
		
		
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}
	
		
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
		
		
	public void setLocationText(final String locationText)
	{
		this.locationText = locationText;
	}
	
		
	public String getLocationText() 
	{
		return locationText;
	}
		
		
	public void setBoundWestLongitude(final Double boundWestLongitude)
	{
		this.boundWestLongitude = boundWestLongitude;
	}
	
		
	public Double getBoundWestLongitude() 
	{
		return boundWestLongitude;
	}
		
		
	public void setStores(final List<PointOfServiceStockWsDTO> stores)
	{
		this.stores = stores;
	}
	
		
	public List<PointOfServiceStockWsDTO> getStores() 
	{
		return stores;
	}
		
		
	public void setBoundNorthLatitude(final Double boundNorthLatitude)
	{
		this.boundNorthLatitude = boundNorthLatitude;
	}
	
		
	public Double getBoundNorthLatitude() 
	{
		return boundNorthLatitude;
	}
		
		
	public void setSorts(final List<SortWsDTO> sorts)
	{
		this.sorts = sorts;
	}
	
		
	public List<SortWsDTO> getSorts() 
	{
		return sorts;
	}
		
		
	public void setBoundSouthLatitude(final Double boundSouthLatitude)
	{
		this.boundSouthLatitude = boundSouthLatitude;
	}
	
		
	public Double getBoundSouthLatitude() 
	{
		return boundSouthLatitude;
	}
		
		
	public void setBoundEastLongitude(final Double boundEastLongitude)
	{
		this.boundEastLongitude = boundEastLongitude;
	}
	
		
	public Double getBoundEastLongitude() 
	{
		return boundEastLongitude;
	}
		
	
}