package com.example.recipesharingapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {

    private lateinit var favoritesRecyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter
    private val favoriteRecipes = listOf<Recipe>()  // Replace with actual favorite recipes list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize RecyclerView
        favoritesRecyclerView = view.findViewById(R.id.favoritesRecyclerView)

        // Initialize RecyclerView adapter
        recipeAdapter = RecipeAdapter(favoriteRecipes)
        favoritesRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        favoritesRecyclerView.adapter = recipeAdapter
    }
}
