package com.example.quizdepartementsfrance

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizdepartementsfrance.data.DepartementsData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val departements = DepartementsData.getAllDepartements()
        Log.d("QuizApp", "Nombre total de départements: ${departements.size}")

        departements.take(5).forEach { dept ->
            Log.d("QuizApp", "${dept.numero} - ${dept.nom} (${dept.region})")
        }
    }
}