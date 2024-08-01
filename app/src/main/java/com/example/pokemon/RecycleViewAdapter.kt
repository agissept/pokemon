package com.example.pokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemon.databinding.PokeRowItemBinding
import com.example.pokemon.model.DetailPokemon

class RecycleViewAdapter(private val pokemons: MutableList<DetailPokemon>) :
    RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = PokeRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemons = pokemons[position]
        Glide.with(holder.itemView.context)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${pokemons.id}.png")
            .into(holder.binding.ivPokemon)
        holder.binding.tvName.text = pokemons.name
        holder.binding.tvHeight.text = pokemons.height
        holder.binding.tvWeight.text = pokemons.weight
    }

    inner class ViewHolder(val binding: PokeRowItemBinding) : RecyclerView.ViewHolder(binding.root)
}