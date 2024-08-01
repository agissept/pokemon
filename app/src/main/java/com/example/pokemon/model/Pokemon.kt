package com.example.pokemon.model

data class PokemonResponse(
    val results: List<Pokemon>,
)

data class Pokemon(
    val name: String,
    val url: String,
)
