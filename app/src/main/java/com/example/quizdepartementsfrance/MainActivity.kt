package com.example.quizdepartementsfrance

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizdepartementsfrance.data.DepartementsData
import com.example.quizdepartementsfrance.quiz.QuizGenerator
import com.example.quizdepartementsfrance.quiz.QuizManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Test initial : afficher les départements
        //val departements = DepartementsData.getAllDepartements()
        //Log.d("QuizApp", "Nombre total de départements: ${departements.size}")
        //departements.take(5).forEach { dept ->
        //    Log.d("QuizApp", "${dept.numero} - ${dept.nom} (${dept.region})")
        //}

        // Test du générateur de quiz :)
        //val quizGenerator = QuizGenerator()

        // Génère 3 questions pour tester
        //repeat(3) { i ->
        //    val question = quizGenerator.generateQuestion()
        //    Log.d("QuizApp", "Question ${i + 1}:")
        //    Log.d("QuizApp", "Quel est le département numéro ${question.departementNumero} ?")
        //    Log.d("QuizApp", "Options: ${question.options}")
        //    Log.d("QuizApp", "Réponse correcte: ${question.correctAnswer}")
        //    Log.d("QuizApp", "---")
        //}

        val quizManager = QuizManager(totalQuestions = 5)

        repeat(5) {
            val question = quizManager.getNextQuestion()
            if (question != null) {
                Log.d("QuizApp", "Question ${quizManager.getCurrentQuestionNumber()}/${quizManager.getTotalQuestions()}")
                Log.d("QuizApp", "Département n°${question.departementNumero}")

                val userAnswer = question.options[0]
                val isCorrect = quizManager.checkAnswer(userAnswer, question.correctAnswer)

                Log.d("QuizApp", "Réponse: $userAnswer - ${if (isCorrect) "✓ Correct" else "✗ Faux"}")
                Log.d("QuizApp", "Score: ${quizManager.getScore()}/${quizManager.getCurrentQuestionNumber()} (${quizManager.getScorePercentage()}%)")
                Log.d("QuizApp", "---")
            }
        }

        Log.d("QuizApp", "QUIZ TERMINÉ!")
        Log.d("QuizApp", "Score final: ${quizManager.getCorrectAnswers()}/${quizManager.getTotalQuestions()}")
    }
}