package com.juandomingo.mypharmamemory.ui.view.infomylistpharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentInfoMyListPharmaBinding


class InfoMyListPharmaFragment : Fragment() {
    private var _binding: FragmentInfoMyListPharmaBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = InfoMyListPharmaFragment()
    }
    private lateinit var viewModel: InfoMyListPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoMyListPharmaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoMyListPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}