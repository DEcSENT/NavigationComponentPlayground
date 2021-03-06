package com.dvinc.navigationcomponentplayground.fragments.a

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.dvinc.navigationcomponentplayground.R
import com.dvinc.navigationcomponentplayground.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_a1.*

class FragmentA1 : BaseFragment() {

    override fun getFragmentLayoutId() = R.layout.fragment_a1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_A1_button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.fragmentA2))
    }
}
