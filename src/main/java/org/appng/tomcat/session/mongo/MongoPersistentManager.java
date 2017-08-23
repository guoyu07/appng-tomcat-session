/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.appng.tomcat.session.mongo;

import org.apache.catalina.Manager;
import org.apache.catalina.session.PersistentManagerBase;

/**
 * A {@link Manager} implementation that uses a {@link MongoStore}
 */
public final class MongoPersistentManager extends PersistentManagerBase {

	/**
	 * The descriptive information about this implementation.
	 */
	private static final String info = "MongoPersistentManager/1.0";

	/**
	 * The descriptive name of this Manager implementation (for logging).
	 */
	protected static String name = "MongoPersistentManager";

	/**
	 * Return descriptive information about this Manager implementation and the corresponding version number, in the
	 * format <code>&lt;description&gt;/&lt;version&gt;</code>.
	 */
	public String getInfo() {
		return (info);
	}

	/**
	 * Return the descriptive short name of this Manager implementation.
	 */
	@Override
	public String getName() {
		return (name);
	}

	@Override
	public MongoStore getStore() {
		return (MongoStore) super.getStore();
	}

}
