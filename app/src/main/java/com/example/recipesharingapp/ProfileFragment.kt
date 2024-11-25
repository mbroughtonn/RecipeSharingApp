package com.example.recipesharingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var profileNameTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize TextView to show profile name
        profileNameTextView = view.findViewById(R.id.profileNameTextView)

        // Example: Set some user profile info (this can be dynamic, based on Firebase or database)
        profileNameTextView.text = "User Name"
    }
}
