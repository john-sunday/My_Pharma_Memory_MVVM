package com.juandomingo.mypharmamemory.ui.view.pharmacimavhtml

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R

class PharmaCimavHtmlFragment : Fragment() {

    companion object {
        fun newInstance() = PharmaCimavHtmlFragment()
    }

    private lateinit var viewModel: PharmaCimavHtmlViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pharma_cimav_html, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PharmaCimavHtmlViewModel::class.java)
        // TODO: Use the ViewModel
    }

}