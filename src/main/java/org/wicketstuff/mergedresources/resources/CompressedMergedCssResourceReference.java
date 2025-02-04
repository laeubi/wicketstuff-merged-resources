/**
 * Copyright 2010 Molindo GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wicketstuff.mergedresources.resources;

import java.util.Locale;

import org.apache.wicket.Resource;
import org.wicketstuff.mergedresources.ResourceSpec;
import org.wicketstuff.mergedresources.preprocess.IResourcePreProcessor;

public class CompressedMergedCssResourceReference extends MergedResourceReference {

	private static final long serialVersionUID = 1L;

	/**
	 * @deprecated use ResourceSpec[] instead of scopes[] and files[]
	 */
	@Deprecated
	public CompressedMergedCssResourceReference(String path, Locale locale, String style, Class<?>[] scopes,
			String[] files, int cacheDuration) {
		this(path, locale, style, ResourceSpec.toResourceSpecs(scopes, files), cacheDuration, null);
	}

	public CompressedMergedCssResourceReference(String name, Locale locale, String style, ResourceSpec[] specs,
			int cacheDuration, IResourcePreProcessor preProcessor) {
		super(CompressedMergedCssResourceReference.class, name, locale, style, specs, cacheDuration, preProcessor);
	}

	@Override
	protected Resource newResource() {
		return new CompressedMergedCssResource(getScope(), getName(), getLocale(), getStyle(), getMergedSpecs(),
				getCacheDuration(), getPreProcessor());
	}
}