package com.example.musy.ui.biblioteca;

import android.net.Uri;

import java.util.ArrayList;

public class Playlist {
    int Image;
    Uri uri;
    String Nome;
    int Qnt_musicas;
    ArrayList<String> Musicas;

    public Playlist(int image, String nome, int Qnt_musicas, ArrayList<String> Musicas) {
        Image = image;
        Nome = nome;
        Qnt_musicas = Qnt_musicas;
        Musicas = Musicas;
    }

    public Playlist(Uri uri, String nome, int Qnt_musicas, ArrayList<String> Musicas) {
        this.uri = uri;
        Nome = nome;
        Qnt_musicas = Qnt_musicas;
        Musicas = Musicas;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Nome;
    }

    public void setName(String nome) {
        Nome = nome;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getDes(int Qnt_musicas) {
        Qnt_musicas = Qnt_musicas;
        if (Qnt_musicas == 0) {
            return "Nenhuma música";
        }else if(Qnt_musicas == 1) {
            return "1 música";
        }
        return Qnt_musicas + " músicas";
    }
}

// Adicionar pré, pré texto e pré quantidade quando o usuário não enviar