package com.juandomingo.mypharmamemory.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juandomingo.mypharmamemory.model.PharmaProvider
import com.juandomingo.mypharmamemory.model.Pharmaco

class PharmaViewModel: ViewModel() {
    /***
     *  Sociedad Androide.
     *  IMPORTANTE
     *  La instancia de PharmaUseCase no debe crearse en la clase ViewModel
     *  sino pasarse como parámetro de la clase 'ViewModel' quedando asi:
     *  'ViewModel(PharmaUseCase): ViewModel(){
     *      ************
     *      ************
     *  }'.
     * */
    /*  'LiveData' permite suscribirse a un modelo de datos, avisando automáticamente
        cuando se realiza un cambio en el modelo de datos.*/
    private val listLiveData = MutableLiveData<List<Pharmaco>>()
    // Al instanciar la clase 'ViewModel', inicio el proceso de obtener la lista de fármacos.
    /*init {
        getPharmaList()
    } -> accedemos a la lista de fármacos desde la ui/MainActivity.kt   */
    // Método que setea de la lista la información que vamos a buscar al repo.
    private fun setListLiveData(pharmaList: List<Pharmaco>) { // 2º
        listLiveData.value = pharmaList
    }
    //  *** Podemos usar CORRUTINAS asícronas para solicitar información.
    fun getPharmaList() { // 1º
        // Seteamos al 'MutableLiveData' una lista de fármacos.
        setListLiveData(PharmaProvider.createPharmaList())
    }
    /*  Mutable Live Data -> mira por el valor de MutableLiveData
        si cambió o no, y si lo hizo, nos retorna la lista.
        Este método está escuchando, mediante 'LiveData' si 'listData'
        se solicita y retorna o se modifica.  */
    fun getPharmaListLiveData(): LiveData<List<Pharmaco>> { //  3º -  'LiveData' trabaja en conjunción con 'MutableLiveData'.
        return listLiveData
    }
}