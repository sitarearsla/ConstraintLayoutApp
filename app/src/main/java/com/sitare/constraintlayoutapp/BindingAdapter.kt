package com.sitare.constraintlayoutapp

import android.widget.*
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("imageURL")
fun ImageView.loadUrl(url:String){
    load(url)
}
