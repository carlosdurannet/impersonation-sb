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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the impersonation registry service. This utility wraps <code>net.carlosduran.liferay.impersonation.sb.service.persistence.impl.ImpersonationRegistryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Carlos Durán
 * @see ImpersonationRegistryPersistence
 * @generated
 */
@ProviderType
public class ImpersonationRegistryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ImpersonationRegistry impersonationRegistry) {
		getPersistence().clearCache(impersonationRegistry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ImpersonationRegistry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ImpersonationRegistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ImpersonationRegistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ImpersonationRegistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ImpersonationRegistry update(
		ImpersonationRegistry impersonationRegistry) {

		return getPersistence().update(impersonationRegistry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ImpersonationRegistry update(
		ImpersonationRegistry impersonationRegistry,
		ServiceContext serviceContext) {

		return getPersistence().update(impersonationRegistry, serviceContext);
	}

	/**
	 * Returns all the impersonation registries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching impersonation registries
	 */
	public static List<ImpersonationRegistry> findBycompanyId(long companyId) {
		return getPersistence().findBycompanyId(companyId);
	}

	/**
	 * Returns a range of all the impersonation registries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @return the range of matching impersonation registries
	 */
	public static List<ImpersonationRegistry> findBycompanyId(
		long companyId, int start, int end) {

		return getPersistence().findBycompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the impersonation registries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching impersonation registries
	 */
	public static List<ImpersonationRegistry> findBycompanyId(
		long companyId, int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator) {

		return getPersistence().findBycompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the impersonation registries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching impersonation registries
	 */
	public static List<ImpersonationRegistry> findBycompanyId(
		long companyId, int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findBycompanyId(
			companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first impersonation registry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a matching impersonation registry could not be found
	 */
	public static ImpersonationRegistry findBycompanyId_First(
			long companyId,
			OrderByComparator<ImpersonationRegistry> orderByComparator)
		throws net.carlosduran.liferay.impersonation.sb.exception.
			NoSuchImpersonationRegistryException {

		return getPersistence().findBycompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first impersonation registry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching impersonation registry, or <code>null</code> if a matching impersonation registry could not be found
	 */
	public static ImpersonationRegistry fetchBycompanyId_First(
		long companyId,
		OrderByComparator<ImpersonationRegistry> orderByComparator) {

		return getPersistence().fetchBycompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last impersonation registry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a matching impersonation registry could not be found
	 */
	public static ImpersonationRegistry findBycompanyId_Last(
			long companyId,
			OrderByComparator<ImpersonationRegistry> orderByComparator)
		throws net.carlosduran.liferay.impersonation.sb.exception.
			NoSuchImpersonationRegistryException {

		return getPersistence().findBycompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last impersonation registry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching impersonation registry, or <code>null</code> if a matching impersonation registry could not be found
	 */
	public static ImpersonationRegistry fetchBycompanyId_Last(
		long companyId,
		OrderByComparator<ImpersonationRegistry> orderByComparator) {

		return getPersistence().fetchBycompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the impersonation registries before and after the current impersonation registry in the ordered set where companyId = &#63;.
	 *
	 * @param impersonationRegistryId the primary key of the current impersonation registry
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	public static ImpersonationRegistry[] findBycompanyId_PrevAndNext(
			long impersonationRegistryId, long companyId,
			OrderByComparator<ImpersonationRegistry> orderByComparator)
		throws net.carlosduran.liferay.impersonation.sb.exception.
			NoSuchImpersonationRegistryException {

		return getPersistence().findBycompanyId_PrevAndNext(
			impersonationRegistryId, companyId, orderByComparator);
	}

	/**
	 * Removes all the impersonation registries where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeBycompanyId(long companyId) {
		getPersistence().removeBycompanyId(companyId);
	}

	/**
	 * Returns the number of impersonation registries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching impersonation registries
	 */
	public static int countBycompanyId(long companyId) {
		return getPersistence().countBycompanyId(companyId);
	}

	/**
	 * Caches the impersonation registry in the entity cache if it is enabled.
	 *
	 * @param impersonationRegistry the impersonation registry
	 */
	public static void cacheResult(
		ImpersonationRegistry impersonationRegistry) {

		getPersistence().cacheResult(impersonationRegistry);
	}

	/**
	 * Caches the impersonation registries in the entity cache if it is enabled.
	 *
	 * @param impersonationRegistries the impersonation registries
	 */
	public static void cacheResult(
		List<ImpersonationRegistry> impersonationRegistries) {

		getPersistence().cacheResult(impersonationRegistries);
	}

	/**
	 * Creates a new impersonation registry with the primary key. Does not add the impersonation registry to the database.
	 *
	 * @param impersonationRegistryId the primary key for the new impersonation registry
	 * @return the new impersonation registry
	 */
	public static ImpersonationRegistry create(long impersonationRegistryId) {
		return getPersistence().create(impersonationRegistryId);
	}

	/**
	 * Removes the impersonation registry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry that was removed
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	public static ImpersonationRegistry remove(long impersonationRegistryId)
		throws net.carlosduran.liferay.impersonation.sb.exception.
			NoSuchImpersonationRegistryException {

		return getPersistence().remove(impersonationRegistryId);
	}

	public static ImpersonationRegistry updateImpl(
		ImpersonationRegistry impersonationRegistry) {

		return getPersistence().updateImpl(impersonationRegistry);
	}

	/**
	 * Returns the impersonation registry with the primary key or throws a <code>NoSuchImpersonationRegistryException</code> if it could not be found.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	public static ImpersonationRegistry findByPrimaryKey(
			long impersonationRegistryId)
		throws net.carlosduran.liferay.impersonation.sb.exception.
			NoSuchImpersonationRegistryException {

		return getPersistence().findByPrimaryKey(impersonationRegistryId);
	}

	/**
	 * Returns the impersonation registry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry, or <code>null</code> if a impersonation registry with the primary key could not be found
	 */
	public static ImpersonationRegistry fetchByPrimaryKey(
		long impersonationRegistryId) {

		return getPersistence().fetchByPrimaryKey(impersonationRegistryId);
	}

	/**
	 * Returns all the impersonation registries.
	 *
	 * @return the impersonation registries
	 */
	public static List<ImpersonationRegistry> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ImpersonationRegistry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ImpersonationRegistry> findAll(
		int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ImpersonationRegistry> findAll(
		int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the impersonation registries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of impersonation registries.
	 *
	 * @return the number of impersonation registries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ImpersonationRegistryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ImpersonationRegistryPersistence, ImpersonationRegistryPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ImpersonationRegistryPersistence.class);

		ServiceTracker
			<ImpersonationRegistryPersistence, ImpersonationRegistryPersistence>
				serviceTracker =
					new ServiceTracker
						<ImpersonationRegistryPersistence,
						 ImpersonationRegistryPersistence>(
							 bundle.getBundleContext(),
							 ImpersonationRegistryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}