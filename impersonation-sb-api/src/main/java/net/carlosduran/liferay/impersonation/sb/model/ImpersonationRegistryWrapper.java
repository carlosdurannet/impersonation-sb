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

package net.carlosduran.liferay.impersonation.sb.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ImpersonationRegistry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ImpersonationRegistry
 * @generated
 */
public class ImpersonationRegistryWrapper
	extends BaseModelWrapper<ImpersonationRegistry>
	implements ImpersonationRegistry, ModelWrapper<ImpersonationRegistry> {

	public ImpersonationRegistryWrapper(
		ImpersonationRegistry impersonationRegistry) {

		super(impersonationRegistry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("impersonationRegistryId", getImpersonationRegistryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("screenName", getScreenName());
		attributes.put("impersonatedUserId", getImpersonatedUserId());
		attributes.put("impersonatedScreenName", getImpersonatedScreenName());
		attributes.put("operationDate", getOperationDate());
		attributes.put("operationResult", getOperationResult());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long impersonationRegistryId = (Long)attributes.get(
			"impersonationRegistryId");

		if (impersonationRegistryId != null) {
			setImpersonationRegistryId(impersonationRegistryId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Long impersonatedUserId = (Long)attributes.get("impersonatedUserId");

		if (impersonatedUserId != null) {
			setImpersonatedUserId(impersonatedUserId);
		}

		String impersonatedScreenName = (String)attributes.get(
			"impersonatedScreenName");

		if (impersonatedScreenName != null) {
			setImpersonatedScreenName(impersonatedScreenName);
		}

		Date operationDate = (Date)attributes.get("operationDate");

		if (operationDate != null) {
			setOperationDate(operationDate);
		}

		Integer operationResult = (Integer)attributes.get("operationResult");

		if (operationResult != null) {
			setOperationResult(operationResult);
		}
	}

	/**
	 * Returns the company ID of this impersonation registry.
	 *
	 * @return the company ID of this impersonation registry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the impersonated screen name of this impersonation registry.
	 *
	 * @return the impersonated screen name of this impersonation registry
	 */
	@Override
	public String getImpersonatedScreenName() {
		return model.getImpersonatedScreenName();
	}

	/**
	 * Returns the impersonated user ID of this impersonation registry.
	 *
	 * @return the impersonated user ID of this impersonation registry
	 */
	@Override
	public long getImpersonatedUserId() {
		return model.getImpersonatedUserId();
	}

	/**
	 * Returns the impersonated user uuid of this impersonation registry.
	 *
	 * @return the impersonated user uuid of this impersonation registry
	 */
	@Override
	public String getImpersonatedUserUuid() {
		return model.getImpersonatedUserUuid();
	}

	/**
	 * Returns the impersonation registry ID of this impersonation registry.
	 *
	 * @return the impersonation registry ID of this impersonation registry
	 */
	@Override
	public long getImpersonationRegistryId() {
		return model.getImpersonationRegistryId();
	}

	/**
	 * Returns the operation date of this impersonation registry.
	 *
	 * @return the operation date of this impersonation registry
	 */
	@Override
	public Date getOperationDate() {
		return model.getOperationDate();
	}

	/**
	 * Returns the operation result of this impersonation registry.
	 *
	 * @return the operation result of this impersonation registry
	 */
	@Override
	public int getOperationResult() {
		return model.getOperationResult();
	}

	/**
	 * Returns the primary key of this impersonation registry.
	 *
	 * @return the primary key of this impersonation registry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the screen name of this impersonation registry.
	 *
	 * @return the screen name of this impersonation registry
	 */
	@Override
	public String getScreenName() {
		return model.getScreenName();
	}

	/**
	 * Returns the user ID of this impersonation registry.
	 *
	 * @return the user ID of this impersonation registry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this impersonation registry.
	 *
	 * @return the user uuid of this impersonation registry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this impersonation registry.
	 *
	 * @return the uuid of this impersonation registry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this impersonation registry.
	 *
	 * @param companyId the company ID of this impersonation registry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the impersonated screen name of this impersonation registry.
	 *
	 * @param impersonatedScreenName the impersonated screen name of this impersonation registry
	 */
	@Override
	public void setImpersonatedScreenName(String impersonatedScreenName) {
		model.setImpersonatedScreenName(impersonatedScreenName);
	}

	/**
	 * Sets the impersonated user ID of this impersonation registry.
	 *
	 * @param impersonatedUserId the impersonated user ID of this impersonation registry
	 */
	@Override
	public void setImpersonatedUserId(long impersonatedUserId) {
		model.setImpersonatedUserId(impersonatedUserId);
	}

	/**
	 * Sets the impersonated user uuid of this impersonation registry.
	 *
	 * @param impersonatedUserUuid the impersonated user uuid of this impersonation registry
	 */
	@Override
	public void setImpersonatedUserUuid(String impersonatedUserUuid) {
		model.setImpersonatedUserUuid(impersonatedUserUuid);
	}

	/**
	 * Sets the impersonation registry ID of this impersonation registry.
	 *
	 * @param impersonationRegistryId the impersonation registry ID of this impersonation registry
	 */
	@Override
	public void setImpersonationRegistryId(long impersonationRegistryId) {
		model.setImpersonationRegistryId(impersonationRegistryId);
	}

	/**
	 * Sets the operation date of this impersonation registry.
	 *
	 * @param operationDate the operation date of this impersonation registry
	 */
	@Override
	public void setOperationDate(Date operationDate) {
		model.setOperationDate(operationDate);
	}

	/**
	 * Sets the operation result of this impersonation registry.
	 *
	 * @param operationResult the operation result of this impersonation registry
	 */
	@Override
	public void setOperationResult(int operationResult) {
		model.setOperationResult(operationResult);
	}

	/**
	 * Sets the primary key of this impersonation registry.
	 *
	 * @param primaryKey the primary key of this impersonation registry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the screen name of this impersonation registry.
	 *
	 * @param screenName the screen name of this impersonation registry
	 */
	@Override
	public void setScreenName(String screenName) {
		model.setScreenName(screenName);
	}

	/**
	 * Sets the user ID of this impersonation registry.
	 *
	 * @param userId the user ID of this impersonation registry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this impersonation registry.
	 *
	 * @param userUuid the user uuid of this impersonation registry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this impersonation registry.
	 *
	 * @param uuid the uuid of this impersonation registry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ImpersonationRegistryWrapper wrap(
		ImpersonationRegistry impersonationRegistry) {

		return new ImpersonationRegistryWrapper(impersonationRegistry);
	}

}