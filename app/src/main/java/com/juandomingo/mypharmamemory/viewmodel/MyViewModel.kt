package com.juandomingo.mypharmamemory.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juandomingo.mypharmamemory.domain.PharmaUseCase
import com.juandomingo.mypharmamemory.ui.model.Pharmaco

class MyViewModel: ViewModel() {
    /***
     *  IMPORTANTE
     *  La instancia de PharmaUseCase no debe crearse en la clase MyViewModel
     *  sino pasarse como parámetro de la clase 'MyViewModel' quedando asi:
     *  'MyViewModel(PharmaUseCase): ViewModel(){
     *      ************
     *      ************
     *  }'.
     * */
    private val pharmaUseCase = PharmaUseCase()
    private val listData = MutableLiveData<List<Pharmaco>>()
    // Al instanciar 'MyViewModel', inicio el proceso de obtener la lista de fármacos.
    /*init {
        getPharmaList()
    } -> accedemos a la lista de fármacos desde la ui/MainActivity.kt   */
    // Método que setea de la lista la información que vamos a buscar al repo.
    private fun setListData(pharmaList: List<Pharmaco>) { // 2º
        listData.value = pharmaList
    }
    //  *** Podemos usar CORRUTINAS para solicitar información que sea asíncronas.
    fun getPharmaList() { // 1º
        // Seteamos al 'MutableLiveData' una lista de fármacos.
        setListData(pharmaUseCase.getPharmaList())
    }
    /*  Mutable Live Data -> mira por el valor de MutableLiveData
        si cambió o no, y si lo hizo, nos retorna la lista.
        Este método está escuchando, mediante 'LiveData' si 'listData'
        se solicita y retorna o se modifica.  */
    fun getPharmaListLiveData(): LiveData<List<Pharmaco>> { /*  3º -  'LiveData' trabaja en conjunción
                                                                con 'MutableLiveData'.  */
        return listData
    }

}