package com.juandomingo.mypharmamemory.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
/*  El 95% de las veces nos funcionará el '@Injected constructor()', para el otro
*   5% tenemos a esta, Retrofit, y como no podemos convertir esta clase en
*   inyectable, crearemos módulos que se provéan.
* */
object RetrofitHelper {
    // O hacemos un Object(más limpio -> AristiDevs), o un 'companion object'
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}