package com.nprmanbrandons11.navigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nprmanbrandons11.navigation.R
import com.nprmanbrandons11.navigation.databinding.FragmentNumber2Binding
import com.nprmanbrandons11.navigation.databinding.FragmentNumer3Binding


class FragmentNumer3 : Fragment() {


    lateinit var binding: FragmentNumer3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumer3Binding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeners()
    }

    private fun listeners(){
        binding.btnNavigateFragment3.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentNumer3_to_fragmentNumber1)
        }
        binding.popBackStack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}