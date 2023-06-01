package com.example.musy.ui.biblioteca

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.musy.R
import com.example.musy.databinding.BottomAddPlaylistBinding

class Playlist(var nome: String, var image: String, var qnt_musicas: Int, var musicas: Array<String>){

    init{
        this.nome = nome
        this.image = image
        this.qnt_musicas = qnt_musicas
        this.musicas = musicas
    }

    fun dados(){
        Log.i("PRINTE", "${this.nome}, ${this.image}, ${this.qnt_musicas}")
        for (x in musicas) Log.i("PRINTE", "${x}")
    }
}

class BottomAddPlaylist : AppCompatActivity() {

    private lateinit var binding: BottomAddPlaylistBinding

    companion object {
        val IMAGE_REQUEST_CODE = 1_000;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BottomAddPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pickImageButton.setOnClickListener {
            pickImageFromGallery()
        }
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
            // binding.imageView.setImageURI(data?.data)
            var p1 = Playlist("Chora agora, ri depois", data?.data.toString(), 2, arrayOf("Oi", "Tchau"))
            p1.dados() // E se o usuário não enviar foto?
//            if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
//                val imageUri = data?.data
//                if (imageUri != null && imageUri.toString().isNotEmpty()) {
//                    // O URI da imagem não é nulo e não está vazio
//                    // Faça algo com o URI da imagem
//                    // binding.imageView.setImageURI(imageUri)
//                    var p1 = Playlist("Chora agora, ri depois", imageUri, 2, arrayOf("Oi", "Tchau"))
//                    p1.dados()
//                } else {
//                    // O URI da imagem é nulo ou está vazio
//                    // Lide com o caso em que o usuário não selecionou uma imagem
//                }
//            }

        }
    }
}


//
// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
///**
// * A simple [Fragment] subclass.
// * Use the [bottomAddPlaylist.newInstance] factory method to
// * create an instance of this fragment.
// */
//class bottomAddPlaylist : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.bottom_add_playlist, container, false)
//    }
//
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment bottomAddPlaylist.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            bottomAddPlaylist().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//}