package com.sabran.mapskotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mapskotlin.Adapter.AdapterWisata
import com.sabran.mapskotlin.Model.ModelWisata

class ListWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_wisata)

        val listWisata = listOf<ModelWisata>(
            ModelWisata(
                "Lembah Harau",
                "Payakumbuh",
                R.drawable.lembah_harau,
                "Wisata Lembah Harau tempat yang menyenangkan, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau,Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.117435,
                100.694656
                ),
            ModelWisata(
                "Istano Basa Pagaruyuang",
                "Tanah Datar",
                R.drawable.istana_pagaruyuang,
                "Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.471293,
                100.621407
            ),
            ModelWisata(
                "Mesjid Raya Sumbar",
                "Padang",
                R.drawable.mesjid_raya_sumbar,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.924532,
                100.366771
            )


        )
        // panggil adapter
        val adapterWisata = AdapterWisata(listWisata)
        //recycler view
        val rvWisata = findViewById<RecyclerView>(R.id.rv_wisata)
        rvWisata.adapter = adapterWisata
        // set layout untuk recycler view
        rvWisata.apply {
            layoutManager = LinearLayoutManager(this@ListWisataActivity)
        }
        rvWisata.setHasFixedSize(true)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}