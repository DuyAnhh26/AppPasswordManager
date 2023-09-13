package duy.anh.apppassword.ui.tai_khoan_web

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class tai_khoan_web_view_model : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Danh sách tất cả tài khoản"
    }
    val text: LiveData<String> = _text
}