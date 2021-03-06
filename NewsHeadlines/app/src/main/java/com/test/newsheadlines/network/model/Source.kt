package com.test.newsheadlines.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by amresh on 25/05/2019
 */
data class Source(
    @SerializedName("id")
    @Expose
    var id: Any? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null

)