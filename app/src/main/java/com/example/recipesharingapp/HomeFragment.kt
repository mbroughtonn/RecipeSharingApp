package com.example.recipesharingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var recipeRecyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter
    private val recipeList = listOf(
        Recipe("Pasta", "Delicious Italian pasta recipe"),
        Recipe("Salad", "Healthy vegetable salad"),
        Recipe("Chocolate Cake", "Rich chocolate cake"),
        Recipe("Chicken Parm", "Perfectly fried chicken parm")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recipeRecyclerView = view.findViewById(R.id.recipeRecyclerView)
        recipeRecyclerView.layoutManager = LinearLayoutManager(activity)
        recipeAdapter = RecipeAdapter(recipeList)
        recipeRecyclerView.adapter = recipeAdapter

        return view
    }
}
