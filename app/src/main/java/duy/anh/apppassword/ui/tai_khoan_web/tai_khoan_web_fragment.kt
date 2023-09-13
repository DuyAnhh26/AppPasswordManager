package duy.anh.apppassword.ui.tai_khoan_web

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import duy.anh.apppassword.databinding.FragmentTaikhoanwebBinding

class tai_khoan_web_fragment : Fragment() {

    private var _binding: FragmentTaikhoanwebBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(tai_khoan_web_view_model::class.java)

        _binding = FragmentTaikhoanwebBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTaikhoanweb
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}