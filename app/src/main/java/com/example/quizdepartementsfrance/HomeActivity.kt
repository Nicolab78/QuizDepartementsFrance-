package com.example.quizdepartementsfrance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quizdepartementsfrance.quiz.QuizType

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNumeroToNom = findViewById<Button>(R.id.btnNumeroToNom)
        val btnNomToNumero = findViewById<Button>(R.id.btnNomToNumero)
        val btnDeptToRegion = findViewById<Button>(R.id.btnDeptToRegion)
        val btnDeptToPrefecture = findViewById<Button>(R.id.btnDeptToPrefecture)

        btnNumeroToNom.setOnClickListener {
            startQuiz(QuizType.NUMERO_TO_NOM)
        }

        btnNomToNumero.setOnClickListener {
            startQuiz(QuizType.NOM_TO_NUMERO)
        }

        btnDeptToRegion.setOnClickListener {
            startQuiz(QuizType.DEPARTEMENT_TO_REGION)
        }

        btnDeptToPrefecture.setOnClickListener {
            startQuiz(QuizType.DEPARTEMENT_TO_PREFECTURE)
        }
    }

    private fun startQuiz(quizType: QuizType) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("QUIZ_TYPE", quizType.name)
        startActivity(intent)
    }
}