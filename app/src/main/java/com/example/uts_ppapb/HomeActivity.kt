package com.example.uts_ppapb

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.uts_ppapb.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE)

        // Mendapatkan data dari SharedPreferences
        val username = sharedPreferences.getString("username", "")

        // Mendapatkan referensi ke elemen TextView
        val usernameTextView = binding.tvUsername

        // Menampilkan data di TextView
        usernameTextView.text = "$username"

        // mendapatkan referensi ke elemen ImageView dengan ID "film1"
        val imageView = binding.film1
        imageView.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

    }
}