package com.enessahin.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.enessahin.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val eiffel = Landmark("Eiffel", "France", R.drawable.pisa)
        val colesium = Landmark("Colesium", "Italy", R.drawable.pisa)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.pisa)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colesium)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}