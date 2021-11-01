package com.juandomingo.mypharmamemory.domain

import com.juandomingo.mypharmamemory.data.PharmaDataSet
import com.juandomingo.mypharmamemory.ui.model.Pharmaco

class PharmaUseCase {

    private val pharmaDataSet = PharmaDataSet()

    fun getPharmaList(): List<Pharmaco> {
        return pharmaDataSet.createPharmaList()
    }
}