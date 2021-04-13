package com.sitare.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sitare.databinding.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User(
            "Android User",
            "https://www.shareicon.net/data/512x512/2017/01/06/868320_people_512x512.png",
            true
        )
        //https://www.flaticon.com/svg/vstatic/svg/3790/3790849.svg?token=exp=1618065082~hmac=c1c3e7fbd5b55b787b3cb78e1e14010d
        //https://www.shareicon.net/data/512x512/2017/01/06/868320_people_512x512.png

        //DATA BINDING OLMADAN
        /*binding.userTextView.text = user.username
        binding.userImageView.load(user.photoURL) {
            crossfade(750)
            scale(Scale.FILL)
        } */

        binding.user = user

    }
}