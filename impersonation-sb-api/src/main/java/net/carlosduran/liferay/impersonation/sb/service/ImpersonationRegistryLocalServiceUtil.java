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

package net.carlosduran.liferay.impersonation.sb.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ImpersonationRegistry. This utility wraps
 * <code>net.carlosduran.liferay.impersonation.sb.service.impl.ImpersonationRegistryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ImpersonationRegistryLocalService
 * @generated
 */
public class ImpersonationRegistryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>net.carlosduran.liferay.impersonation.sb.service.impl.ImpersonationRegistryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the impersonation registry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ImpersonationRegistryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param impersonationRegistry the impersonation registry
	 * @return the impersonation registry that was added
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
			addImpersonationRegistry(
				net.carlosduran.liferay.impersonation.sb.model.
					ImpersonationRegistry impersonationRegistry) {

		return getService().addImpersonationRegistry(impersonationRegistry);
	}

	/**
	 * Creates a new impersonation registry with the primary key. Does not add the impersonation registry to the database.
	 *
	 * @param impersonationRegistryId the primary key for the new impersonation registry
	 * @return the new impersonation registry
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
			createImpersonationRegistry(long impersonationRegistryId) {

		return getService().createImpersonationRegistry(
			impersonationRegistryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the impersonation registry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ImpersonationRegistryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param impersonationRegistry the impersonation registry
	 * @return the impersonation registry that was removed
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
			deleteImpersonationRegistry(
				net.carlosduran.liferay.impersonation.sb.model.
					ImpersonationRegistry impersonationRegistry) {

		return getService().deleteImpersonationRegistry(impersonationRegistry);
	}

	/**
	 * Deletes the impersonation registry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ImpersonationRegistryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry that was removed
	 * @throws PortalException if a impersonation registry with the primary key could not be found
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
				deleteImpersonationRegistry(long impersonationRegistryId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteImpersonationRegistry(
			impersonationRegistryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
			fetchImpersonationRegistry(long impersonationRegistryId) {

		return getService().fetchImpersonationRegistry(impersonationRegistryId);
	}

	/**
	 * Returns the impersonation registry with the matching UUID and company.
	 *
	 * @param uuid the impersonation registry's UUID
	 * @param companyId the primary key of the company
	 * @return the matching impersonation registry, or <code>null</code> if a matching impersonation registry could not be found
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
			fetchImpersonationRegistryByUuidAndCompanyId(
				String uuid, long companyId) {

		return getService().fetchImpersonationRegistryByUuidAndCompanyId(
			uuid, companyId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the impersonation registries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of impersonation registries
	 * @param end the upper bound of the range of impersonation registries (not inclusive)
	 * @return the range of impersonation registries
	 */
	public static java.util.List
		<net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry>
			getImpersonationRegistries(int start, int end) {

		return getService().getImpersonationRegistries(start, end);
	}

	/**
	 * Returns the number of impersonation registries.
	 *
	 * @return the number of impersonation registries
	 */
	public static int getImpersonationRegistriesCount() {
		return getService().getImpersonationRegistriesCount();
	}

	/**
	 * Returns the impersonation registry with the primary key.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry
	 * @throws PortalException if a impersonation registry with the primary key could not be found
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
				getImpersonationRegistry(long impersonationRegistryId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getImpersonationRegistry(impersonationRegistryId);
	}

	/**
	 * Returns the impersonation registry with the matching UUID and company.
	 *
	 * @param uuid the impersonation registry's UUID
	 * @param companyId the primary key of the company
	 * @return the matching impersonation registry
	 * @throws PortalException if a matching impersonation registry could not be found
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
				getImpersonationRegistryByUuidAndCompanyId(
					String uuid, long companyId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getImpersonationRegistryByUuidAndCompanyId(
			uuid, companyId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the impersonation registry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ImpersonationRegistryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param impersonationRegistry the impersonation registry
	 * @return the impersonation registry that was updated
	 */
	public static
		net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry
			updateImpersonationRegistry(
				net.carlosduran.liferay.impersonation.sb.model.
					ImpersonationRegistry impersonationRegistry) {

		return getService().updateImpersonationRegistry(impersonationRegistry);
	}

	public static ImpersonationRegistryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ImpersonationRegistryLocalService, ImpersonationRegistryLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ImpersonationRegistryLocalService.class);

		ServiceTracker
			<ImpersonationRegistryLocalService,
			 ImpersonationRegistryLocalService> serviceTracker =
				new ServiceTracker
					<ImpersonationRegistryLocalService,
					 ImpersonationRegistryLocalService>(
						 bundle.getBundleContext(),
						 ImpersonationRegistryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}