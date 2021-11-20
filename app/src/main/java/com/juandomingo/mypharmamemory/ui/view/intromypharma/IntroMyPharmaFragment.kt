package com.juandomingo.mypharmamemory.ui.view.intromypharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentIntroMyPharmaBinding

class IntroMyPharmaFragment : Fragment() {
    private var _binding: FragmentIntroMyPharmaBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = IntroMyPharmaFragment()
    }
    private lateinit var viewModel: IntroMyPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIntroMyPharmaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IntroMyPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}