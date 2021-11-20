package com.juandomingo.mypharmamemory.ui.view.searchermypharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentSearcherMyPharmaBinding

class SearcherMyPharmaFragment : Fragment() {
    private var _binding: FragmentSearcherMyPharmaBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = SearcherMyPharmaFragment()
    }
    private lateinit var viewModel: SearcherMyPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearcherMyPharmaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearcherMyPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}