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

package nl.adaptivity.xmlutil.util

import org.w3c.dom.NamedNodeMap
import org.w3c.dom.NodeList
import org.w3c.dom.Node
import kotlin.jvm.JvmName

public operator fun NodeList.iterator(): Iterator<Node> = object : Iterator<Node> {
    private var idx = 0

    override fun hasNext(): Boolean = idx < length

    override fun next(): Node {
        return item(idx)!!.also { idx++ }
    }
}

public operator fun NamedNodeMap.iterator(): Iterator<Node> = object : Iterator<Node> {
    private var idx = 0

    override fun hasNext(): Boolean = idx < length

    override fun next(): Node {
        return (item(idx) as Node).also { idx++ }
    }
}
