package com.example.telegram.ui.screens

import android.view.View
import androidx.fragment.app.Fragment
import com.example.telegram.utilits.APP_ACTIVITY

open class BaseFragment(layout: Int) : Fragment(layout) {

    private lateinit var mRootView: View

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}
