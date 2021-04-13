package com.sitare.databinding

import android.graphics.Color
import android.view.View
import android.widget.*
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("imageURL")
fun ImageView.loadUrl(url:String){
    load(url)
}

@BindingAdapter("isPremium")
fun View.setPremiumBackground(premium:Boolean){
    if(premium){
        setBackgroundColor(Color.MAGENTA)
    } else {
        setBackgroundColor(Color.GRAY)
    }
}