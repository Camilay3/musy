package com.example.musy.ui.biblioteca;

import java.util.ArrayList;

public class Playlist {
    int Image;
    String Nome;
    int Qnt_musicas;
    ArrayList<String> Musicas;

    public Playlist(int image, String nome, int Qnt_musicas, ArrayList<String> Musicas) {
        Image = image;
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

    public String getDes(int Qnt_musicas) {
        Qnt_musicas = Qnt_musicas;
        if (Qnt_musicas == 0) {
            return "Nenhuma música";
        }
        return "música";
    }
}

// Adicionar pré, pré texto e pré quantidade quando o usuário não enviar