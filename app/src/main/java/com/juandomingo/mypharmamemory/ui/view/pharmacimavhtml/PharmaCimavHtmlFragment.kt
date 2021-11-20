package com.juandomingo.mypharmamemory.ui.view.pharmacimavhtml

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentPharmaCimavHtmlBinding

class PharmaCimavHtmlFragment : Fragment() {
    private var _binding: FragmentPharmaCimavHtmlBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = PharmaCimavHtmlFragment()
    }
    private lateinit var viewModel: PharmaCimavHtmlViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPharmaCimavHtmlBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PharmaCimavHtmlViewModel::class.java)
        // TODO: Use the ViewModel
    }

}