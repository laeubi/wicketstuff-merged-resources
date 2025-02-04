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

import org.wicketstuff.mergedresources.ResourceSpec;
import org.wicketstuff.mergedresources.preprocess.IResourcePreProcessor;

public class CachedCompressedCssResource extends CompressedMergedCssResource {

	private static final long serialVersionUID = 1L;

	public CachedCompressedCssResource(Class<?> scope, String path, Locale locale, String style, int cacheDuration,
			IResourcePreProcessor preProcessor) {
		super(scope, path, locale, style, new ResourceSpec[] { new ResourceSpec(scope, path) }, cacheDuration,
				preProcessor);
	}

}
