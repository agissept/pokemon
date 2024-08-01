package com.example.pokemon

import com.example.pokemon.model.DetailPokemon
import com.example.pokemon.model.PokemonResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokemonService {
    @GET("pokemon")
    fun getPokemonData(): Call<PokemonResponse>

    @GET(".")
    fun getPokemonDetail(): Call<DetailPokemon>
}
