package com.juandomingo.mypharmamemory.ui.view.searchercimav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R

class SearcherCimavFragment : Fragment() {

    companion object {
        fun newInstance() = SearcherCimavFragment()
    }

    private lateinit var viewModel: SearcherCimavViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_searcher_cimav, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearcherCimavViewModel::class.java)
        // TODO: Use the ViewModel
    }

}