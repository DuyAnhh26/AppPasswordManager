package duy.anh.apppassword

import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ScreenLogin : AppCompatActivity() {

    private lateinit var nhapMatKhauEditText: EditText
    private lateinit var nhapLaiMatKhauEditText: EditText
    private lateinit var hienThiMatKhauCheckBox: CheckBox
    private lateinit var nutLoginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_screen_login)

        nhapMatKhauEditText = findViewById(R.id.NhapMatKhau)
        nhapLaiMatKhauEditText = findViewById(R.id.NhapLaiMatKhau)
        hienThiMatKhauCheckBox = findViewById(R.id.HienThiMatKhau)
        nutLoginButton = findViewById(R.id.NutLogin)

        nutLoginButton.setOnClickListener {
            val matKhau = nhapMatKhauEditText.text.toString()
            val nhapLaiMatKhau = nhapLaiMatKhauEditText.text.toString()

            if (matKhau.isEmpty() || nhapLaiMatKhau.isEmpty()) {
                // Hiển thị thông báo lỗi nếu trường mật khẩu hoặc nhập lại mật khẩu trống
                // Ví dụ: Toast.makeText(this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            } else if (matKhau != nhapLaiMatKhau) {
                // Hiển thị thông báo lỗi nếu mật khẩu và nhập lại mật khẩu không khớp
                // Ví dụ: Toast.makeText(this, "Mật khẩu không khớp", Toast.LENGTH_SHORT).show()
            } else {
                // Thực hiện đăng nhập thành công
                // Ví dụ: Chuyển sang màn hình chính
            }
        }

        hienThiMatKhauCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Hiển thị mật khẩu
                nhapMatKhauEditText.transformationMethod = null
                nhapLaiMatKhauEditText.transformationMethod = null
            } else {
                // Ẩn mật khẩu
                nhapMatKhauEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                nhapLaiMatKhauEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
    }
}