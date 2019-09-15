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

import aQute.bnd.annotation.ProviderType;

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
 * @author Carlos Durán
 * @see ImpersonationRegistryLocalService
 * @generated
 */
@ProviderType
public class ImpersonationRegistryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>net.carlosduran.liferay.impersonation.sb.service.impl.ImpersonationRegistryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the impersonation registry to the database. Also notifies the appropriate model listeners.
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
	 * Deletes the impersonation registry from the database. Also notifies the appropriate model listeners.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the impersonation registries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the impersonation registry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
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