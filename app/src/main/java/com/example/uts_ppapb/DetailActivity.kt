package com.example.uts_ppapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_ppapb.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var genreList: ArrayList<Genre>
    private lateinit var recyclerGenres: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("Title")
        val desciption = intent.getStringExtra("Description")
        val Director = intent.getStringExtra("Director")
        val image = intent.getIntExtra("Image_Movie", 0)
        val genres = intent.getStringArrayListExtra("Genres")

        with(binding) {



            binding.btnget.setOnClickListener {
                val intent = Intent(this@DetailActivity, PaymentActivity::class.java)
                intent.putExtra("Title", titleMovie.text.toString())
                intent.putExtra("Image", image)
                startActivity(intent)
                finish()
            }

        }

    }
}