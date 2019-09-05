/*
 * Copyright @ 2018 - present 8x8, Inc.
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

package org.jitsi.jibri.service.impl

private const val YOUTUBE_BASE_URL = "rtmp://a.rtmp.youtube.com/live2"

/**
 * Needed information for the service we'll be streaming to
 */
sealed class StreamingServiceInfo {
    abstract val rtmpUrl: String
}

class YouTube(val streamKey: String, val broadcastId: String? = null) : StreamingServiceInfo() {
    override val rtmpUrl: String = "$YOUTUBE_BASE_URL/$streamKey"
}

class GenericRtmpService(override val rtmpUrl: String) : StreamingServiceInfo()
