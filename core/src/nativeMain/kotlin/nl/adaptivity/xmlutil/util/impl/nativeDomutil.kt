/*
 * Copyright (c) 2022.
 *
 * This file is part of xmlutil.
 *
 * This file is licenced to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You should have received a copy of the license with the source distribution.
 * Alternatively, you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package nl.adaptivity.xmlutil.util.impl

import nl.adaptivity.xmlutil.QName
import nl.adaptivity.xmlutil.XmlUtilInternal
import nl.adaptivity.xmlutil.core.impl.dom.SimpleDOMImplementation
import nl.adaptivity.xmlutil.toCName
import org.w3c.dom.Document

@XmlUtilInternal
public actual fun createDocument(rootElementName: QName): Document {
    return SimpleDOMImplementation.createDocument(rootElementName.getNamespaceURI(), rootElementName.toCName())
}
