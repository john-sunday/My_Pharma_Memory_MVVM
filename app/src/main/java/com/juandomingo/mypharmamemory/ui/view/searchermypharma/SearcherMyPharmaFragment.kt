package com.juandomingo.mypharmamemory.ui.view.searchermypharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R

class SearcherMyPharmaFragment : Fragment() {

    companion object {
        fun newInstance() = SearcherMyPharmaFragment()
    }

    private lateinit var viewModel: SearcherMyPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_searcher_my_pharma, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearcherMyPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}