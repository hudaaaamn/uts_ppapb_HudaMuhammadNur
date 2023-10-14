package com.example.uts_ppapb

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uts_ppapb.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding
    private lateinit var sharedPreferences: SharedPreferences
    // Simulated static credentials
    private val CORRECT_USERNAME = "Huda Muhammad Nur"
    private val CORRECT_PASSWORD = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE)


        binding.btnLogin.setOnClickListener {
            val username = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            // Simpan data ke SharedPreferences
            val editor = sharedPreferences.edit()
            editor.putString("username", username)
            editor.apply()


            if (username == CORRECT_USERNAME && password == CORRECT_PASSWORD) {
                val intentToItemsActivity = Intent(this@LoginActivity,HomeActivity::class.java)
                startActivity(intentToItemsActivity)
            } else {
                showToast("Login failed. Please check your credentials.")
            }
        }

    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
