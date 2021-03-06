/*
 * (c) Copyright 2016 Hewlett Packard Enterprise Development LP
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
 */

package org.apache.spark.offheapstore.impl

import org.apache.spark.unsafe.Platform


class UnsafeArray() {
  var addr: Long = 0L
  var size: Int = 0
  var count: Int = 1
  var memsize: Int = 0
  val HEADER_SIZE = 8

  def setHeader(size: Int, count: Int): Unit = {

  }
  def free(): Unit = {
    Platform.freeMemory(addr)
  }

  def nextPos(pos: Int): Int = {
    pos + memsize + HEADER_SIZE
  }
}
