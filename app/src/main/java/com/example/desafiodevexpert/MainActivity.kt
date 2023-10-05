package com.example.desafiodevexpert

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiodevexpert.data.RetrofitServiceFactory
import com.example.desafiodevexpert.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val moviesService = RetrofitServiceFactory.makeRetrofitService()


        GlobalScope.launch(Dispatchers.IO) {
            val response = moviesService.getMovies(apiKey = "4a018f728b8ddec8b15b969e1301d3bd", region = "es")
            println(response)
        }
    }
}