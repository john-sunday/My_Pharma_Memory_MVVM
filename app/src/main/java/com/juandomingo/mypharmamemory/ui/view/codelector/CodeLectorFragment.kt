package com.juandomingo.mypharmamemory.ui.view.codelector

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentCodeLectorBinding

class CodeLectorFragment : Fragment() {
    private var _binding: FragmentCodeLectorBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = CodeLectorFragment()
    }
    private lateinit var viewModel: CodeLectorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCodeLectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CodeLectorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}