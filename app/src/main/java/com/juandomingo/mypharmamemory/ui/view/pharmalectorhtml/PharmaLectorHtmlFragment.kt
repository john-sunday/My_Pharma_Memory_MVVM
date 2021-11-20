package com.juandomingo.mypharmamemory.ui.view.pharmalectorhtml

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R

class PharmaLectorHtmlFragment : Fragment() {

    companion object {
        fun newInstance() = PharmaLectorHtmlFragment()
    }

    private lateinit var viewModel: PharmaLectorHtmlViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pharma_lector_html, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PharmaLectorHtmlViewModel::class.java)
        // TODO: Use the ViewModel
    }

}