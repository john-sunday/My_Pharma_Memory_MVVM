package com.juandomingo.mypharmamemory

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
// 1er paso Dagger Hilt -> crear esta clase y la etiqueta:
@HiltAndroidApp
class MvvmAplication: Application()
/*  Una clase Application es la que extiende de la propia aplicación
    de Android, o sea que va a ser la primera en llamarse cuando se inicie
    la app.
    Hay que declararla en el 'AndroidManifest.xml'.
    Dentro de la clase se implementaría todo el código, como el método
    'onCreate()', pero no hace falta, porque usaremos la etiqueta
    '@HiltAndroidApp'.
    Ahora tenemos que preparar nuestras Activities y nuestro ViewModel. */
