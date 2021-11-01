package com.juandomingo.mypharmamemory.data

import com.juandomingo.mypharmamemory.ui.model.Pharmaco

class PharmaDataSet {

    fun createPharmaList(): List<Pharmaco> {
        return listOf(
            Pharmaco("Ibuprofeno(Arginina) Normon", listOf("Ibuprofeno"), 2.50F, 600F),
            Pharmaco("Aspirina C", listOf( "Ácido acetilsalicílico", "")  , 4.5F, 1000F),
            Pharmaco("Amoxicilina", listOf("Amoxicilina", "Ácido clavulánico"), 2.69F, 550F),
            Pharmaco("Paracetaemol Normon", listOf("Paracetamol"), 1.58F, 500F)
        )
    }
}