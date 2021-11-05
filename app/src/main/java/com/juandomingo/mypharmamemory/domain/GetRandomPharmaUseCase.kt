package com.juandomingo.mypharmamemory.domain

import com.juandomingo.mypharmamemory.data.PharmaRepository
import com.juandomingo.mypharmamemory.data.model.PharmaProvider
import com.juandomingo.mypharmamemory.data.model.PharmacoModel

class GetRandomPharmaUseCase {
    private val repository = PharmaRepository()
    operator fun invoke(): PharmacoModel? {
        val pharmas = PharmaProvider.pharmas
        /*  TODO hacer la val randomNumber global, para tener que
        *   escribir un solo return.    */
        if (!pharmas.isNullOrEmpty()) {
            // .... = (0..pharmas.size - 1).random()
            val randomNumber = (pharmas.indices).random()
            return pharmas[randomNumber]
        }
        return null
    }
}