package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first_destination.*
import kotlinx.android.synthetic.main.fragment_second_destination.*
import kotlinx.android.synthetic.main.fragment_second_destination.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SecondDestinationFragment : Fragment(R.layout.fragment_second_destination) {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSecondNavigation()

    }

    private fun setupSecondNavigation(){
        secondScreen.setOnClickListener{
            findNavController().navigate(R.id.secondDestinationToFirstDestination)
        }
        // here is define the action of the textView, when click the navigation to another fragment
    }

}