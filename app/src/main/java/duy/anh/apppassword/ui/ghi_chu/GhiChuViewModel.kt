package duy.anh.apppassword.ui.ghi_chu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GhiChuViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Danh sách tất cả ghi chú"
    }
    val text: LiveData<String> = _text
}