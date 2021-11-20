package com.juandomingo.mypharmamemory.ui.view.apphome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentAppHomeBinding


class AppHomeFragment : Fragment() {
    private var _binding: FragmentAppHomeBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = AppHomeFragment()
    }
    private lateinit var viewModel: AppHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAppHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AppHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}