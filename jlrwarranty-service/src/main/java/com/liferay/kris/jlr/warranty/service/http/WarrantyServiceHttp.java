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

package com.liferay.kris.jlr.warranty.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.jlr.warranty.service.WarrantyServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * {@link WarrantyServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyServiceSoap
 * @see HttpPrincipal
 * @see WarrantyServiceUtil
 * @generated
 */
@ProviderType
public class WarrantyServiceHttp {
	public static java.util.List<com.liferay.kris.jlr.warranty.model.Warranty> getWarranty(
		HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		try {
			MethodKey methodKey = new MethodKey(WarrantyServiceUtil.class,
					"getWarranty", _getWarrantyParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.kris.jlr.warranty.model.Warranty>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String deleteWarranty(HttpPrincipal httpPrincipal,
		long jlrWarrantyId) {
		try {
			MethodKey methodKey = new MethodKey(WarrantyServiceUtil.class,
					"deleteWarranty", _deleteWarrantyParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					jlrWarrantyId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String addWarranty(HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String category, java.lang.String period,
		java.lang.String dealer, java.lang.String partCategory, int actualCost,
		java.lang.String conCode, int percentage) {
		try {
			MethodKey methodKey = new MethodKey(WarrantyServiceUtil.class,
					"addWarranty", _addWarrantyParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					serviceContext, category, period, dealer, partCategory,
					actualCost, conCode, percentage);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(WarrantyServiceHttp.class);
	private static final Class<?>[] _getWarrantyParameterTypes0 = new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteWarrantyParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _addWarrantyParameterTypes2 = new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class,
			java.lang.String.class, int.class
		};
}