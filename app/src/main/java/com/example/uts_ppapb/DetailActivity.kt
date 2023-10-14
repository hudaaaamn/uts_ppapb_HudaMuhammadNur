package com.example.uts_ppapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_ppapb.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding //Ini adalah deklarasi variabel binding,
    // yang digunakan untuk mengikat tampilan XML ke dalam aktivitas menggunakan data binding
    private lateinit var genreList: ArrayList<Genre> //Ini adalah deklarasi variabel genreList,
    // yang merupakan daftar (list) dari objek Genre. Genre adalah entitas yang mewakili genre-genre film.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("Title")
        val desciption = intent.getStringExtra("Description")
        val Director = intent.getStringExtra("Director")
        val image = intent.getIntExtra("Image_Movie", 0)
        val genres = intent.getStringArrayListExtra("Genres")
        //Mendapat data yg dikirim dari intent

        with(binding) {

            binding.btnget.setOnClickListener {
                val intent = Intent(this@DetailActivity, PaymentActivity::class.java)
                intent.putExtra("Title", titleMovie.text.toString())
                startActivity(intent)
                finish()
                // tindakan yang akan diambil saat tombol dengan ID "btnget" diklik.
            }

        }

    }
}