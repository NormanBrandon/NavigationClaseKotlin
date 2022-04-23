package com.nprmanbrandons11.navigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nprmanbrandons11.navigation.R
import com.nprmanbrandons11.navigation.databinding.FragmentNumber1Binding

//https://developer.android.com/guide/navigation/navigation-navigate
//https://developer.android.com/guide/navigation/navigation-getting-started


class FragmentNumber1 : Fragment() {

    lateinit var binding : FragmentNumber1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumber1Binding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeners()

    }

    private fun listeners(){
        binding.btnNavigateFragment2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentNumber1_to_fragmentNumber2)
        }
        binding.popBackStack.setOnClickListener {
            if (!findNavController().popBackStack()) {
                requireActivity().finish()
            }
        }
    }
}