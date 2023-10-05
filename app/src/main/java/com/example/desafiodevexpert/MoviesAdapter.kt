package com.example.desafiodevexpert

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiodevexpert.data.model.Movie

class MoviesAdapter(movies: List<Movie>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val movies: List<Movie> = movies

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
