package com.example.recipesharingapp

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var searchEditText: EditText
    private lateinit var searchResultsRecyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter
    private val recipeList = listOf<Recipe>()  // Replace with actual list of recipes

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views
        searchEditText = view.findViewById(R.id.searchEditText)
        searchResultsRecyclerView = view.findViewById(R.id.searchResultsRecyclerView)

        // Initialize RecyclerView adapter
        recipeAdapter = RecipeAdapter(recipeList)
        searchResultsRecyclerView.adapter = recipeAdapter

        // Set up search functionality with a basic TextWatcher
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {
                // You can leave this empty if no action is needed before text is changed
            }

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                // Handle the text change, filter recipes here
                val filteredRecipes = recipeList.filter { it.title.contains(charSequence.toString(), ignoreCase = true) }
                recipeAdapter.updateData(filteredRecipes)
            }

            override fun afterTextChanged(editable: Editable?) {
                // You can leave this empty if no action is needed after text is changed
            }
        })
    }
}
