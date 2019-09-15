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

package net.carlosduran.liferay.impersonation.sb.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.carlosduran.liferay.impersonation.sb.exception.NoSuchImpersonationRegistryException;
import net.carlosduran.liferay.impersonation.sb.model.ImpersonationRegistry;
import net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryImpl;
import net.carlosduran.liferay.impersonation.sb.model.impl.ImpersonationRegistryModelImpl;
import net.carlosduran.liferay.impersonation.sb.service.persistence.ImpersonationRegistryPersistence;

/**
 * The persistence implementation for the impersonation registry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Carlos Durán
 * @generated
 */
@ProviderType
public class ImpersonationRegistryPersistenceImpl
	extends BasePersistenceImpl<ImpersonationRegistry>
	implements ImpersonationRegistryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ImpersonationRegistryUtil</code> to access the impersonation registry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ImpersonationRegistryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public ImpersonationRegistryPersistenceImpl() {
		setModelClass(ImpersonationRegistry.class);
	}

	/**
	 * Caches the impersonation registry in the entity cache if it is enabled.
	 *
	 * @param impersonationRegistry the impersonation registry
	 */
	@Override
	public void cacheResult(ImpersonationRegistry impersonationRegistry) {
		entityCache.putResult(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryImpl.class,
			impersonationRegistry.getPrimaryKey(), impersonationRegistry);

		impersonationRegistry.resetOriginalValues();
	}

	/**
	 * Caches the impersonation registries in the entity cache if it is enabled.
	 *
	 * @param impersonationRegistries the impersonation registries
	 */
	@Override
	public void cacheResult(
		List<ImpersonationRegistry> impersonationRegistries) {

		for (ImpersonationRegistry impersonationRegistry :
				impersonationRegistries) {

			if (entityCache.getResult(
					ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
					ImpersonationRegistryImpl.class,
					impersonationRegistry.getPrimaryKey()) == null) {

				cacheResult(impersonationRegistry);
			}
			else {
				impersonationRegistry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all impersonation registries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ImpersonationRegistryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the impersonation registry.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ImpersonationRegistry impersonationRegistry) {
		entityCache.removeResult(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryImpl.class,
			impersonationRegistry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ImpersonationRegistry> impersonationRegistries) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ImpersonationRegistry impersonationRegistry :
				impersonationRegistries) {

			entityCache.removeResult(
				ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
				ImpersonationRegistryImpl.class,
				impersonationRegistry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new impersonation registry with the primary key. Does not add the impersonation registry to the database.
	 *
	 * @param impersonationRegistryId the primary key for the new impersonation registry
	 * @return the new impersonation registry
	 */
	@Override
	public ImpersonationRegistry create(long impersonationRegistryId) {
		ImpersonationRegistry impersonationRegistry =
			new ImpersonationRegistryImpl();

		impersonationRegistry.setNew(true);
		impersonationRegistry.setPrimaryKey(impersonationRegistryId);

		impersonationRegistry.setCompanyId(companyProvider.getCompanyId());

		return impersonationRegistry;
	}

	/**
	 * Removes the impersonation registry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry that was removed
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	@Override
	public ImpersonationRegistry remove(long impersonationRegistryId)
		throws NoSuchImpersonationRegistryException {

		return remove((Serializable)impersonationRegistryId);
	}

	/**
	 * Removes the impersonation registry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the impersonation registry
	 * @return the impersonation registry that was removed
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	@Override
	public ImpersonationRegistry remove(Serializable primaryKey)
		throws NoSuchImpersonationRegistryException {

		Session session = null;

		try {
			session = openSession();

			ImpersonationRegistry impersonationRegistry =
				(ImpersonationRegistry)session.get(
					ImpersonationRegistryImpl.class, primaryKey);

			if (impersonationRegistry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchImpersonationRegistryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(impersonationRegistry);
		}
		catch (NoSuchImpersonationRegistryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ImpersonationRegistry removeImpl(
		ImpersonationRegistry impersonationRegistry) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(impersonationRegistry)) {
				impersonationRegistry = (ImpersonationRegistry)session.get(
					ImpersonationRegistryImpl.class,
					impersonationRegistry.getPrimaryKeyObj());
			}

			if (impersonationRegistry != null) {
				session.delete(impersonationRegistry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (impersonationRegistry != null) {
			clearCache(impersonationRegistry);
		}

		return impersonationRegistry;
	}

	@Override
	public ImpersonationRegistry updateImpl(
		ImpersonationRegistry impersonationRegistry) {

		boolean isNew = impersonationRegistry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (impersonationRegistry.isNew()) {
				session.save(impersonationRegistry);

				impersonationRegistry.setNew(false);
			}
			else {
				impersonationRegistry = (ImpersonationRegistry)session.merge(
					impersonationRegistry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryImpl.class,
			impersonationRegistry.getPrimaryKey(), impersonationRegistry,
			false);

		impersonationRegistry.resetOriginalValues();

		return impersonationRegistry;
	}

	/**
	 * Returns the impersonation registry with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the impersonation registry
	 * @return the impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	@Override
	public ImpersonationRegistry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchImpersonationRegistryException {

		ImpersonationRegistry impersonationRegistry = fetchByPrimaryKey(
			primaryKey);

		if (impersonationRegistry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchImpersonationRegistryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return impersonationRegistry;
	}

	/**
	 * Returns the impersonation registry with the primary key or throws a <code>NoSuchImpersonationRegistryException</code> if it could not be found.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry
	 * @throws NoSuchImpersonationRegistryException if a impersonation registry with the primary key could not be found
	 */
	@Override
	public ImpersonationRegistry findByPrimaryKey(long impersonationRegistryId)
		throws NoSuchImpersonationRegistryException {

		return findByPrimaryKey((Serializable)impersonationRegistryId);
	}

	/**
	 * Returns the impersonation registry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the impersonation registry
	 * @return the impersonation registry, or <code>null</code> if a impersonation registry with the primary key could not be found
	 */
	@Override
	public ImpersonationRegistry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ImpersonationRegistry impersonationRegistry =
			(ImpersonationRegistry)serializable;

		if (impersonationRegistry == null) {
			Session session = null;

			try {
				session = openSession();

				impersonationRegistry = (ImpersonationRegistry)session.get(
					ImpersonationRegistryImpl.class, primaryKey);

				if (impersonationRegistry != null) {
					cacheResult(impersonationRegistry);
				}
				else {
					entityCache.putResult(
						ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
						ImpersonationRegistryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(
					ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
					ImpersonationRegistryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return impersonationRegistry;
	}

	/**
	 * Returns the impersonation registry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param impersonationRegistryId the primary key of the impersonation registry
	 * @return the impersonation registry, or <code>null</code> if a impersonation registry with the primary key could not be found
	 */
	@Override
	public ImpersonationRegistry fetchByPrimaryKey(
		long impersonationRegistryId) {

		return fetchByPrimaryKey((Serializable)impersonationRegistryId);
	}

	@Override
	public Map<Serializable, ImpersonationRegistry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ImpersonationRegistry> map =
			new HashMap<Serializable, ImpersonationRegistry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ImpersonationRegistry impersonationRegistry = fetchByPrimaryKey(
				primaryKey);

			if (impersonationRegistry != null) {
				map.put(primaryKey, impersonationRegistry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
				ImpersonationRegistryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ImpersonationRegistry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_IMPERSONATIONREGISTRY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ImpersonationRegistry impersonationRegistry :
					(List<ImpersonationRegistry>)q.list()) {

				map.put(
					impersonationRegistry.getPrimaryKeyObj(),
					impersonationRegistry);

				cacheResult(impersonationRegistry);

				uncachedPrimaryKeys.remove(
					impersonationRegistry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
					ImpersonationRegistryImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the impersonation registries.
	 *
	 * @return the impersonation registries
	 */
	@Override
	public List<ImpersonationRegistry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ImpersonationRegistry> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ImpersonationRegistry> findAll(
		int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ImpersonationRegistry> findAll(
		int start, int end,
		OrderByComparator<ImpersonationRegistry> orderByComparator,
		boolean retrieveFromCache) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ImpersonationRegistry> list = null;

		if (retrieveFromCache) {
			list = (List<ImpersonationRegistry>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IMPERSONATIONREGISTRY);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IMPERSONATIONREGISTRY;

				if (pagination) {
					sql = sql.concat(
						ImpersonationRegistryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ImpersonationRegistry>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ImpersonationRegistry>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the impersonation registries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ImpersonationRegistry impersonationRegistry : findAll()) {
			remove(impersonationRegistry);
		}
	}

	/**
	 * Returns the number of impersonation registries.
	 *
	 * @return the number of impersonation registries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IMPERSONATIONREGISTRY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ImpersonationRegistryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the impersonation registry persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryModelImpl.FINDER_CACHE_ENABLED,
			ImpersonationRegistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryModelImpl.FINDER_CACHE_ENABLED,
			ImpersonationRegistryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			ImpersonationRegistryModelImpl.ENTITY_CACHE_ENABLED,
			ImpersonationRegistryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	public void destroy() {
		entityCache.removeCache(ImpersonationRegistryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_IMPERSONATIONREGISTRY =
		"SELECT impersonationRegistry FROM ImpersonationRegistry impersonationRegistry";

	private static final String _SQL_SELECT_IMPERSONATIONREGISTRY_WHERE_PKS_IN =
		"SELECT impersonationRegistry FROM ImpersonationRegistry impersonationRegistry WHERE impersonationRegistryId IN (";

	private static final String _SQL_COUNT_IMPERSONATIONREGISTRY =
		"SELECT COUNT(impersonationRegistry) FROM ImpersonationRegistry impersonationRegistry";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"impersonationRegistry.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ImpersonationRegistry exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		ImpersonationRegistryPersistenceImpl.class);

}