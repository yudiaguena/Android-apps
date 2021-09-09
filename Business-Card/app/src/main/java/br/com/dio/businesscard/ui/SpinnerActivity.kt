package br.com.dio.businesscard.ui

import android.app.Activity
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import br.com.dio.businesscard.R

class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        val spinner: Spinner = findViewById(R.id.spinner)

    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}