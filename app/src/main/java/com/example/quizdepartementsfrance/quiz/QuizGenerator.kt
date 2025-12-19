package com.example.quizdepartementsfrance.quiz

import com.example.quizdepartementsfrance.data.DepartementsData
import com.example.quizdepartementsfrance.models.Departement


data class Question(
    val departementNumero: String,
    val correctAnswer: String,
    val options: List<String>
)

class QuizGenerator {

    private val allDepartements = DepartementsData.getAllDepartements()
    private val usedDepartements = mutableSetOf<Departement>()

    fun generateQuestion(): Question {
        val availableDepartements = allDepartements.filter { it !in usedDepartements }

        if (availableDepartements.isEmpty()) {
            usedDepartements.clear()
        }

        val correctDepartement = availableDepartements.random()
        usedDepartements.add(correctDepartement)

        val wrongAnswers = allDepartements
            .filter { it != correctDepartement }
            .shuffled()
            .take(3)
            .map { it.nom }

        val allAnswers = (wrongAnswers + correctDepartement.nom).shuffled()

        return Question(
            departementNumero = correctDepartement.numero,
            correctAnswer = correctDepartement.nom,
            options = allAnswers
        )
    }

    fun reset() {
        usedDepartements.clear()
    }


}