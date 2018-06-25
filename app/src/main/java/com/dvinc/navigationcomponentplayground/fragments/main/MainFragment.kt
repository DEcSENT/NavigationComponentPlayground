package com.dvinc.navigationcomponentplayground.fragments.main

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.dvinc.navigationcomponentplayground.MainActivity
import com.dvinc.navigationcomponentplayground.R
import com.dvinc.navigationcomponentplayground.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {

    override fun getFragmentLayoutId() = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_main_button_start_simple_chain
                .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.fragmentA1))
    }
}
