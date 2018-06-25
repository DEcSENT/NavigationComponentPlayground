package com.dvinc.navigationcomponentplayground.fragments.a

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.dvinc.navigationcomponentplayground.R
import com.dvinc.navigationcomponentplayground.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_a3.*

class FragmentA3 : BaseFragment() {

    override fun getFragmentLayoutId() = R.layout.fragment_a3

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_A3_button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mainFragment))
    }
}
