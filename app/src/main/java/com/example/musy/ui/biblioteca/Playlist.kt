package com.example.musy.ui.biblioteca

import android.util.Log

// Adicionar pré, pré texto e pré quantidade quando o usuário não enviar
class Playlist(var nome: String = "Sem nome", var image: String, var qnt_musicas: Int = 0, var musicas: Array<String> = emptyArray()) {

    init {
        this.nome = nome
        this.image = image
        this.qnt_musicas = qnt_musicas
        this.musicas = musicas
    }

    fun dados() {
        Log.i("PRINTE", "${this.nome}, ${this.image}, ${this.qnt_musicas}")
        for (x in musicas) Log.i("PRINTE", "${x}")
    }
}