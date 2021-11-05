package com.juandomingo.mypharmamemory.data

import com.juandomingo.mypharmamemory.data.model.PharmaProvider
import com.juandomingo.mypharmamemory.data.model.PharmacoModel
import com.juandomingo.mypharmamemory.data.network.PharmaService

class PharmaRepository {
    /*  La primera vez que llamemos al repositorio -> this.class, desde aquí, llamaremos
    *   a la clase 'data/network/PharmaService.kt', que llamará al
    *   'data/network/PharmaApiClient.kt.getAllPharma()', y la lista de fármacos serán
    *   enviados de vuelta al Service, y a su vez, devueltos al Repository, y esta clase
    *   PharmaRepository.kt le dirá a la variable pharma del Provider, que guarde
    *   la response, que contiene la lista de todos los fármacos. Finálmente el método
    *   'this.class.getAllPharma()' retornará 'List<Pharmaco>'.
    *   */
    private val api = PharmaService()
    suspend fun getAllPharma(): List<PharmacoModel> {
        val response: List<PharmacoModel> = api.getPharma()
        /*  Guardaremos, DE MOMENTO, la respuesta en PharmaProvider, simulando a
            la clase Provider como una ddbb.    */
        PharmaProvider.pharmas = response
        return response
    }
}