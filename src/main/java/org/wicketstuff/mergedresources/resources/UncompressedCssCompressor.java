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

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.wicket.WicketRuntimeException;

public class UncompressedCssCompressor implements ICssCompressor {

	public byte[] compress(byte[] original, Charset charset) {
		if (!ICssCompressor.EXPECTED_CHARSET.equals(charset)) {
			try {
				return new String(original, charset.name()).getBytes(ICssCompressor.UTF_8.name());
			} catch (UnsupportedEncodingException e) {
				throw new WicketRuntimeException("unexpected encoding from Charset.name()?", e);
			}
		} else {
			return original;
		}
	}
}
