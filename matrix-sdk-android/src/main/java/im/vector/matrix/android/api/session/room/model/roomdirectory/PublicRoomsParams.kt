/*
 * Copyright 2016 OpenMarket Ltd
 * Copyright 2017 Vector Creations Ltd
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
package im.vector.matrix.android.api.session.room.model.roomdirectory

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Class to pass parameters to get the public rooms list
 */
@JsonClass(generateAdapter = true)
data class PublicRoomsParams(
        /**
         * Limit the number of results returned.
         */
        @Json(name = "limit")
        var limit: Int? = null,

        /**
         * A pagination token from a previous request, allowing clients to get the next (or previous) batch of rooms.
         * The direction of pagination is specified solely by which token is supplied, rather than via an explicit flag.
         */
        @Json(name = "since")
        var since: String? = null,

        /**
         * Filter to apply to the results.
         */
        @Json(name = "filter")
        var filter: PublicRoomsFilter? = null,

        /**
         * Whether or not to include all known networks/protocols from application services on the homeserver. Defaults to false.
         */
        @Json(name = "includeAllNetworks")
        var includeAllNetworks: Boolean = false,

        /**
         * The specific third party network/protocol to request from the homeserver. Can only be used if include_all_networks is false.
         */
        @Json(name = "thirdPartyInstanceId")
        var thirdPartyInstanceId: String? = null
)
