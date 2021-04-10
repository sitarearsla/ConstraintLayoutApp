package com.sitare.constraintlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.sitare.constraintlayoutapp.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User(
            "Android User",
            "https://www.flaticon.com/svg/vstatic/svg/3790/3790849.svg?token=exp=1618065082~hmac=c1c3e7fbd5b55b787b3cb78e1e14010d"
        )

        binding.userTextView.text = user.username
        binding.userImageView.load(user.photoURL)

    }



}