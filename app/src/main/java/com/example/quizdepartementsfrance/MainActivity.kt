package com.example.quizdepartementsfrance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizdepartementsfrance.quiz.QuizManager
import com.example.quizdepartementsfrance.quiz.Question
import com.example.quizdepartementsfrance.quiz.QuizType

class MainActivity : AppCompatActivity() {

    private lateinit var quizManager: QuizManager
    private var currentQuestion: Question? = null

    private lateinit var tvProgress: TextView
    private lateinit var tvScore: TextView
    private lateinit var tvQuestion: TextView
    private lateinit var btnOption1: Button
    private lateinit var btnOption2: Button
    private lateinit var btnOption3: Button
    private lateinit var btnOption4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quizTypeName = intent.getStringExtra("QUIZ_TYPE") ?: QuizType.NUMERO_TO_NOM.name
        val quizType = QuizType.valueOf(quizTypeName)

        quizManager = QuizManager(totalQuestions = 10, quizType = quizType)

        tvProgress = findViewById(R.id.tvProgress)
        tvScore = findViewById(R.id.tvScore)
        tvQuestion = findViewById(R.id.tvQuestion)
        btnOption1 = findViewById(R.id.btnOption1)
        btnOption2 = findViewById(R.id.btnOption2)
        btnOption3 = findViewById(R.id.btnOption3)
        btnOption4 = findViewById(R.id.btnOption4)

        loadNextQuestion()

        btnOption1.setOnClickListener { checkAnswer(btnOption1.text.toString()) }
        btnOption2.setOnClickListener { checkAnswer(btnOption2.text.toString()) }
        btnOption3.setOnClickListener { checkAnswer(btnOption3.text.toString()) }
        btnOption4.setOnClickListener { checkAnswer(btnOption4.text.toString()) }
    }

    private fun loadNextQuestion() {
        currentQuestion = quizManager.getNextQuestion()

        if (currentQuestion == null) {
            showFinalScore()
            return
        }

        val question = currentQuestion!!

        tvProgress.text = "Question ${quizManager.getCurrentQuestionNumber()}/${quizManager.getTotalQuestions()}"
        tvScore.text = "Score: ${quizManager.getScore()}"
        tvQuestion.text = question.questionText

        btnOption1.text = question.options[0]
        btnOption2.text = question.options[1]
        btnOption3.text = question.options[2]
        btnOption4.text = question.options[3]

        enableButtons()
    }

    private fun checkAnswer(userAnswer: String) {
        val question = currentQuestion ?: return
        val isCorrect = quizManager.checkAnswer(userAnswer, question.correctAnswer)

        if (isCorrect) {
            Toast.makeText(this, "✓ Correct !", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "✗ Faux ! C'était ${question.correctAnswer}", Toast.LENGTH_SHORT).show()
        }

        disableButtons()

        btnOption1.postDelayed({
            loadNextQuestion()
        }, 1500)
    }

    private fun enableButtons() {
        btnOption1.isEnabled = true
        btnOption2.isEnabled = true
        btnOption3.isEnabled = true
        btnOption4.isEnabled = true
    }

    private fun disableButtons() {
        btnOption1.isEnabled = false
        btnOption2.isEnabled = false
        btnOption3.isEnabled = false
        btnOption4.isEnabled = false
    }

    private fun showFinalScore() {
        tvQuestion.text = "Quiz terminé !"
        tvProgress.text = "Résultat final"
        tvScore.text = "Score: ${quizManager.getCorrectAnswers()}/${quizManager.getTotalQuestions()} (${quizManager.getScorePercentage()}%)"

        btnOption1.text = "Retour au menu"
        btnOption2.visibility = Button.GONE
        btnOption3.visibility = Button.GONE
        btnOption4.visibility = Button.GONE

        btnOption1.isEnabled = true

        btnOption1.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}