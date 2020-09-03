package com.example.telegram.ui.screens

import androidx.fragment.app.Fragment

import com.example.telegram.R
import com.example.telegram.database.*
import kotlinx.android.synthetic.main.fragment_change_bio.*

/**
 * A simple [Fragment] subclass.
 */
class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_change_bio) {
    override fun onResume() {
        super.onResume()
        settings_input_bio.setText(Usermodel.bio)
    }

    override fun change() {
        super.change()
        val newBio = settings_input_bio.text.toString()
        setBioToDatabase(newBio)
    }
}
