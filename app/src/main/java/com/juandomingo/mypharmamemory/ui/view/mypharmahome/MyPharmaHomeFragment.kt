package com.juandomingo.mypharmamemory.ui.view.mypharmahome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.databinding.FragmentMyPharmaHomeBinding

class MyPharmaHomeFragment : Fragment() {
    private var _binding: FragmentMyPharmaHomeBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MyPharmaHomeFragment()
    }
    private lateinit var viewModel: MyPharmaHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyPharmaHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyPharmaHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}