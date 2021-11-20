package com.juandomingo.mypharmamemory.ui.view.infomylistpharma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R

class InfoMyListPharmaFragment : Fragment() {

    companion object {
        fun newInstance() = InfoMyListPharmaFragment()
    }

    private lateinit var viewModel: InfoMyListPharmaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info_my_list_pharma, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoMyListPharmaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}