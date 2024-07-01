package com.example.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var numara1: Double? = null
    var numara2: Double? = null
    var sonuc: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Edge-to-edge display için gerekli ayarları yapabilirsiniz
        // enableEdgeToEdge()

        // WindowInsetsListener ayarı
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }

    fun topla(view: View) {
        numara1 = binding.editText.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! + numara2!!
            binding.textView.text = "Sonuc : ${sonuc}"
        } else {
            binding.textView.text = "Numaraları giriniz!"
        }
    }

    fun bol(view: View) {
        numara1 = binding.editText.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            if (numara2 == 0.0) {
                binding.textView.text = "Bir sayı sıfıra bölünemez!"
            } else {
                sonuc = numara1!! / numara2!!
                binding.textView.text = "Sonuc : ${sonuc}"
            }
        } else {
            binding.textView.text = "Numaraları giriniz!"
        }
    }

    fun carp(view: View) {
        numara1 = binding.editText.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! * numara2!!
            binding.textView.text = "Sonuc : ${sonuc}"
        } else {
            binding.textView.text = "Numaraları giriniz!"
        }
    }

    fun cikar(view: View) {
        numara1 = binding.editText.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! - numara2!!
            binding.textView.text = "Sonuc : ${sonuc}"
        } else {
            binding.textView.text = "Numaraları giriniz!"
        }
    }
}
