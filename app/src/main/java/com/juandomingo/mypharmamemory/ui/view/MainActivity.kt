package com.juandomingo.mypharmamemory.ui.view

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.juandomingo.mypharmamemory.R
import com.juandomingo.mypharmamemory.databinding.ActivityMainBinding
import com.juandomingo.mypharmamemory.ui.viewmodel.PharmaViewModel

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    /*  Con el '...by viewModels()' nos va a hacer toda la lógica,
    *   toda la conexión entre el viewmodel(PharmaViewModel)
    *   y la view(MainActivity), el ciclo de vida y lo demás, estará
    *   automatizado.    */
    private val pharmaViewModel: PharmaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        /*  El establecimiento del tema tiene que ir en primer lugar, para
        *   que no se solapen la 'splashscreen.xml' y el 'activity_main.xml  */
        setTheme(R.style.Theme_MyPharmaMemory2)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // TODO Cuando tenga varias 'activity_.....xml' probar con 'binding.root', a ver si toma por defecto la main.xml
        val view = binding.activityMain
        setContentView(view)
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)

        pharmaViewModel.onCreate()

        pharmaViewModel.pharmaModel.observe(this, Observer {
            /*  Todo lo que esté dentro del Observer, estará enganchado al
            *   LiveData, y cuando el LiveData tenga un cambio, se ejecutará
            *   todo lo que esté aquí dentro.   */
            binding.tvQuote.text = it[0].quote
            binding.tvAuthor.text = it[0].author
            for (pharma in it) {
                Log.d("Pharmaceuticals", pharma.quote)
            }
            for ((index, value ) in it.withIndex()) {
                Log.d("Pharmaceuticals $index", value.author)
            }
        })
        pharmaViewModel.isLoading.observe(this, Observer {
            binding.progressBarCircle.isVisible = it
        })
        pharmaViewModel.isLoading.observe(this, Observer {
            binding.progressBarHor.isVisible = it
        })
        binding.getListPharmaBtn.setOnClickListener {
            //pharmaViewModel.getPharmaList()

        }
    }

}

