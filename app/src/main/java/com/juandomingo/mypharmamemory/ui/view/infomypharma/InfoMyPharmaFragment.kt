package com.juandomingo.mypharmamemory.ui.view.infomypharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R

class InfoMyPharmaFragment : Fragment() {

    companion object {
        fun newInstance() = InfoMyPharmaFragment()
    }

    private lateinit var viewModel: InfoMyPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info_my_pharma, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoMyPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}