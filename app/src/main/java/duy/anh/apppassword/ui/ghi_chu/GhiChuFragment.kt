package duy.anh.apppassword.ui.ghi_chu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import duy.anh.apppassword.databinding.FragmentGhichuBinding

class GhiChuFragment : Fragment() {

    private var _binding: FragmentGhichuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GhiChuViewModel::class.java)

        _binding = FragmentGhichuBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGhichu
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}