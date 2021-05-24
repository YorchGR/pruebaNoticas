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

package prueba.service.service.impl;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;

import prueba.service.model.Foo;
import prueba.service.model.impl.FooImpl;
import prueba.service.service.base.FooLocalServiceBaseImpl;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>prueba.service.service.FooLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=prueba.service.model.Foo",
	service = AopService.class
)
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>prueba.service.service.FooLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>prueba.service.service.FooLocalServiceUtil</code>.
	 */
	
	public Foo getFoo() {	
		return this.createFoo(1L);
	}	
	
	public Foo setFoo() {	
		return this.createFoo(1L);
	}
}