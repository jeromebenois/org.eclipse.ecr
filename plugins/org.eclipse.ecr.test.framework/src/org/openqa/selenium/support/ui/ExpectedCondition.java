/* 
 * (C) Copyright 2006-2011 Nuxeo SA (http://nuxeo.com/) and contributors.
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
 * 
 * Contributors:
 */

package org.openqa.selenium.support.ui;

import org.openqa.selenium.WebDriver;
import com.google.common.base.Function;

/**
 * Models a condition that might reasonably be expected to eventually evaluate
 * to something that is neither null nor false. Examples would include
 * determining if a web page has loaded or that an element is visible.
 * <p>
 * Note that it is expected that ExpectedConditions are idempotent. They will
 * be called in a loop by the {@link WebDriverWait} and any modification of the
 * state of the application under test may have unexpected side-effects.
 *
 * @param <T> The return type
 */
public interface ExpectedCondition<T> extends Function<WebDriver, T> {
}
