package com.juandomingo.mypharmamemory.ui.model

data class Pharmaco(
    val pharmaName: String = "",
    val pharmaActiveSubstance: List<String> = emptyList(),
    val pharmaPrize: Float = 0F,
    val pharmaWeight: Float = 0F)