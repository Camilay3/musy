package com.example.musy.ui.biblioteca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.musy.R
import com.example.musy.databinding.FragmentBibliotecaBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class BibliotecaFragment : Fragment() {

private var _binding: FragmentBibliotecaBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    val bibliotecaViewModel =
            ViewModelProvider(this).get(BibliotecaViewModel::class.java)

    _binding = FragmentBibliotecaBinding.inflate(inflater, container, false)
    val root: View = binding.root

<<<<<<< Updated upstream
    val textView: TextView = binding.textBiblioteca
    bibliotecaViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    return root
=======
      binding.novaPlaylist.setOnClickListener{
          val bottomSheetDialog = BottomSheetDialog(
              context!!, R.style.BottomSheetDialogTheme
          )

          val bottomSheetView = LayoutInflater.from(context!!).inflate(
              R.layout.bottom_add_playlist, binding.root.findViewById<LinearLayout>(R.id.bottomSheet)
          )

          bottomSheetView.findViewById<View>(R.id.savePButton).setOnClickListener {
              Toast.makeText(context!!, "Playlist salva!", Toast.LENGTH_SHORT).show()
              bottomSheetDialog.dismiss()
          }

          bottomSheetDialog.setContentView(bottomSheetView)
          bottomSheetDialog.show()
      }


      return root
>>>>>>> Stashed changes
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}