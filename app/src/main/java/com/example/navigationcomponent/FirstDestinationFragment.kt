package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first_destination.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FirstDestinationFragment : Fragment(R.layout.fragment_first_destination) {

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
        setupNavigation()

    }

    private fun setupNavigation(){
        firstScreen.setOnClickListener{
            findNavController().navigate(R.id.firstDestinationToSecondDestination)
        }
        // here is define the action of the textView, when click the navigation to another fragment
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstDestinationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}