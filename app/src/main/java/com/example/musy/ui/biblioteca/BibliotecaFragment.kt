package com.example.musy.ui.biblioteca

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.musy.R
import com.example.musy.databinding.FragmentBibliotecaBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.textfield.TextInputEditText

class BibliotecaFragment : Fragment() {

    private var imageUri: Uri? = null
    private var _binding: FragmentBibliotecaBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        val IMAGE_REQUEST_CODE = 1_000
    }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View {
        val bibliotecaViewModel =
                ViewModelProvider(this).get(BibliotecaViewModel::class.java)

        _binding = FragmentBibliotecaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.novaPlaylist.setOnClickListener{


          val bottomSheetDialog = BottomSheetDialog(
              context!!, R.style.BottomSheetDialogTheme
          )

          val bottomSheetView = LayoutInflater.from(context!!).inflate(
              R.layout.bottom_add_playlist, binding.root.findViewById<LinearLayout>(R.id.bottomSheet)
          )

          bottomSheetView.findViewById<View>(R.id.savePButton).setOnClickListener {
              if(imageUri != null){
                  binding.imPlaylist.setImageURI(imageUri)
              }
              binding.txPlaylist.text = bottomSheetView.findViewById<TextInputEditText>(R.id.nome_env).text

              Toast.makeText(context!!, "Playlist salva!", Toast.LENGTH_SHORT).show()
              bottomSheetDialog.dismiss()
          }

          bottomSheetView.findViewById<View>(R.id.pickImageButton).setOnClickListener {
              pickImageFromGallery()
          }

          bottomSheetDialog.setContentView(bottomSheetView)
          bottomSheetDialog.show()
        }

      return root
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // E se o usuário não enviar foto?
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == AppCompatActivity.RESULT_OK) {
            imageUri = data?.data
            if (imageUri != null && imageUri.toString().isNotEmpty()) {
                // O URI da imagem não é nulo e não está vazio

                //binding.imPlaylist.setImageURI(imageUri)
                var p1 = Playlist("Chora agora, ri depois", imageUri.toString(), 2)
                p1.dados()

            } else {
                val bottomSheetDialog = BottomSheetDialog(
                    context!!, R.style.BottomSheetDialogTheme
                )
                bottomSheetDialog.dismiss()
            }
        }

    }

    override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
    }
}