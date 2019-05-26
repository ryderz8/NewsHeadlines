package com.test.newsheadlines.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.newsheadlines.R


@BindingAdapter("urlToImage")
fun setImageUrl(imageView : ImageView ,url: String) {
    Glide.with(imageView)
            .apply { RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)}
            .load(url)
            .into(imageView)
}