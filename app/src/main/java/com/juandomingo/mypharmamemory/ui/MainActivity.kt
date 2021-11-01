package com.juandomingo.mypharmamemory.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.juandomingo.mypharmamemory.R
import com.juandomingo.mypharmamemory.databinding.ActivityMainBinding
import com.juandomingo.mypharmamemory.domain.PharmaUseCase
import com.juandomingo.mypharmamemory.ui.model.Pharmaco
import com.juandomingo.mypharmamemory.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private  lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        /*  El establecimiento del tema tiene que ir en primer lugar, para
        *   que no se solapen la 'splashscreen.xml' y el 'activity_main.xml  */
        setTheme(R.style.Theme_MyPharmaMemory2)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.activityMain
        setContentView(view)
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setupViewModel() // -> inicializamos el viewmodel que estará esperando el evento de pulsar el botón.
        binding.getListPharmaBtn.setOnClickListener {
            viewModel.getPharmaList()
        }
    }

    fun setupViewModel() {
        //viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java) -> deprecated
        //viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        viewModel = ViewModelProvider(
            this)[MyViewModel::class.java]
        /*  Cómo observamos al 'LiveData' (nos suscribimos al LiveData) hasta que cambie
            y me de la información que necesito.    */
        val pharmaObserver = Observer<List<Pharmaco>> {
            for (pharma in it) {
                Log.d("Pharmaceuticals", pharma.pharmaName)
            }
            for ((index, value ) in it.withIndex()) {
                Log.d("Pharmaceuticals $index", value.pharmaName)
            }

        }
        // Observamos el cambio.
        viewModel.getPharmaListLiveData().observe(
            this,
            pharmaObserver
        )
    }
}

