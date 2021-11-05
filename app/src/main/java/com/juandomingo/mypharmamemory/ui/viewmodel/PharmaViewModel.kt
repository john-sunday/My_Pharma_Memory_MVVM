package com.juandomingo.mypharmamemory.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.juandomingo.mypharmamemory.data.model.PharmacoModel
import com.juandomingo.mypharmamemory.domain.GetListPharmaUseCase
import com.juandomingo.mypharmamemory.domain.GetRandomPharmaUseCase
import kotlinx.coroutines.launch

class PharmaViewModel: ViewModel() {
    /*  'LiveData' permite suscribirse a un modelo de datos, avisando automáticamente
        cuando se realiza un cambio en el modelo de datos.*/
    val pharmaModel = MutableLiveData<List<PharmacoModel>>()
    var getListPharmaUseCase = GetListPharmaUseCase()
    val isLoading = MutableLiveData<Boolean>()
    val isLoadingHor = MutableLiveData<Boolean>()
    var getRandomPharmaUseCase = GetRandomPharmaUseCase()
    /*  En 'onCreate()' haremos la llamada al caso de uso que necesitemos, en este caso
    *   todas las quotes, para que todas esas quotes que recibe, las almacene en memoria.   */
    fun onCreate() {
        /*  Para llamar a la corrutina de class.PharmaUseCase(), usaremos 'viewModelScope'
        *   que nos permite crear las corrutinas, y se gestiona automaticamente.  */
        viewModelScope.launch {
            val result = getListPharmaUseCase()
            isLoading.postValue(true)
            isLoadingHor.postValue(true)
            if (!result.isNullOrEmpty()) {
                pharmaModel.postValue(listOf(result[0]))
                /*  El problema de meter aquí el false(fin del progressBar)
                *   es que si la primera llamada al servidor falla, el flujo
                *   no entra en este 'if', y el progressBar, nunca desaparece.  */
                /****  No se ven las ProgressBar, las tapa la SplashScreen ******/
                isLoading.postValue(false)
                isLoadingHor.postValue(false)
            }
        }
    }
    fun randomPharma() {
        isLoading.postValue(true)
        /*  Llamamos a un nuevo caso de uso.    */
        val pharma = getRandomPharmaUseCase()
        if (pharma != null) {
            pharmaModel.postValue(listOf(pharma!!))
        }
        isLoading.postValue(false)
    }
}