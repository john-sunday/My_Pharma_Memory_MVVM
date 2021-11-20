package com.juandomingo.mypharmamemory.ui.view.infomypharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentInfoMyPharmaBinding

class InfoMyPharmaFragment : Fragment() {
    private var _binding: FragmentInfoMyPharmaBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = InfoMyPharmaFragment()
    }
    private lateinit var viewModel: InfoMyPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoMyPharmaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoMyPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}