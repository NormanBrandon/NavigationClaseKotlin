package com.nprmanbrandons11.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.nprmanbrandons11.navigation.ui.FragmentNumer3

class MainActivity : AppCompatActivity() {
    private val navHost :NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        if(getCurrentFragment() == FragmentNumer3::class.java.simpleName){
            navHost.findNavController().popBackStack(R.id.fragmentNumber1,false)
        }
        else {
            super.onBackPressed()
        }
    }

    fun getCurrentFragment():String?{
        return navHost.childFragmentManager.fragments[0]::class.simpleName
    }
}