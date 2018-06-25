package com.dvinc.navigationcomponentplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navigationController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationController = Navigation.findNavController(this, R.id.nav_host_fragment)
        //Works only with theme with toolbar
        //setupActionBarWithNavController(this, navigationController)
    }
}
