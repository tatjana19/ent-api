/**
 * Copyright (C) 2018 Asterios Raptis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.alpharogroup.db.entity.name;

import java.io.Serializable;

import de.alpharogroup.db.entity.Identifiable;
import de.alpharogroup.db.entity.version.Versionable;

/**
 * The interface {@link IdentifiableNameableVersionable} is a combination of the
 * interfaces {@link Identifiable}, {@link Nameable} and {@link Versionable}.
 * 
 * @param <PK> the generic type of the identifier
 */
public interface IdentifiableNameableVersionable<PK extends Serializable>
		extends Identifiable<PK>, Nameable, Versionable {
}