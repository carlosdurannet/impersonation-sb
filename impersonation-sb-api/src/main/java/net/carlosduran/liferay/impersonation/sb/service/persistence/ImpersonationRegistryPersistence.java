/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package net.carlosduran.liferay.impersonation.sb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import net.carlosduran.liferay.impersonation.sb.exception.NoSuchImpersonationRegistryException;
import net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry;

/**
 * The persistence interface for the impersonation registry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Carlos Durán
 * @see ImpersonationRegistryUtil
 * @generated
 */
@ProviderType
public interface ImpersonationRegistryPersistence
	extends BasePersistence<ImpersonationRegistry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ImpersonationRegistryUtil} to access the impersonation registry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, ImpersonationRegistry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Caches the impersonation registry in the entity cache if it is enabled.
	 *
	 * @param impersonationRegistry the impersonation registry
	 */
	public void cacheResult(ImpersonationRegistry impersonationRegistry);

	/**
	 * Caches the impersonation registries in the entity cache if it is enabled.
	 *
	 * @param impersonationRegistries the impersonation registries
	 */
	public void cacheResult(
		java.util.List<ImpersonationRegistry> impersonationRegistries);

	/**
	 * Creates a new impersonation registry with the primary key. Does not add the impersonation registry to the database.
	 *
	 * @param impersonationRegistryId the primary key for the new impersonation registry
	 * @return the new impersonation registry
	 */
	public ImpersonationRegistry create(long impersonationRegistryId);

	/**
	 * Removes the impersonation registry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry that was removed
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	public ImpersonationRegistry remove(long impersonationRegistryId)
		throws NoSuchImpersonationRegistryException;

	public ImpersonationRegistry updateImpl(
		ImpersonationRegistry impersonationRegistry);

	/**
	 * Returns the impersonation registry with the primary key or throws a <code>NoSuchImpersonationRegistryException</code> if it could not be found.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	public ImpersonationRegistry findByPrimaryKey(long impersonationRegistryId)
		throws NoSuchImpersonationRegistryException;

	/**
	 * Returns the impersonation registry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry, or <code>null</code> if a impersonation registry with the primary key could not be found
	 */
	public ImpersonationRegistry fetchByPrimaryKey(
		long impersonationRegistryId);

	/**
	 * Returns all the impersonation registries.
	 *
	 * @return the impersonation registries
	 */
	public java.util.List<ImpersonationRegistry> findAll();

	/**
	 * Returns a range of all the impersonation registries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @return the range of impersonation registries
	 */
	public java.util.List<ImpersonationRegistry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the impersonation registries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of impersonation registries
	 */
	public java.util.List<ImpersonationRegistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImpersonationRegistry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the impersonation registries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of impersonation registries
	 */
	public java.util.List<ImpersonationRegistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImpersonationRegistry>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the impersonation registries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of impersonation registries.
	 *
	 * @return the number of impersonation registries
	 */
	public int countAll();

}