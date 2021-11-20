package com.juandomingo.mypharmamemory.ui.view.searchercimav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentSearcherCimavBinding

class SearcherCimavFragment : Fragment() {
    private var _binding: FragmentSearcherCimavBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = SearcherCimavFragment()
    }
    private lateinit var viewModel: SearcherCimavViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearcherCimavBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearcherCimavViewModel::class.java)
        // TODO: Use the ViewModel
    }

}