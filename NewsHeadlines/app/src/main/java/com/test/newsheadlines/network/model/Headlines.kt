package com.test.newsheadlines.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by amresh on 24/05/2019
 */
data class Headlines(

    @SerializedName("status")
    @Expose
    var status : String? = null,
    @SerializedName("totalResults")
    @Expose
    var totalResults : Int? = null,
    @SerializedName("articles")
    @Expose
    var articles: List<Article>? = null

)