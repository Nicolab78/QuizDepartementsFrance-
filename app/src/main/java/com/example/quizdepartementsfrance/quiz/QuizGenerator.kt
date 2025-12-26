package com.example.quizdepartementsfrance.quiz

import com.example.quizdepartementsfrance.data.DepartementsData
import com.example.quizdepartementsfrance.models.Departement

class QuizGenerator(private val quizType: QuizType = QuizType.NUMERO_TO_NOM) {

    private val allDepartements = DepartementsData.getAllDepartements()
    private val usedDepartements = mutableSetOf<Departement>()

    fun generateQuestion(): Question {
        val availableDepartements = allDepartements.filter { it !in usedDepartements }

        if (availableDepartements.isEmpty()) {
            usedDepartements.clear()
        }

        val correctDepartement = availableDepartements.random()
        usedDepartements.add(correctDepartement)

        return when (quizType) {
            QuizType.NUMERO_TO_NOM -> generateNumeroToNomQuestion(correctDepartement)
            QuizType.NOM_TO_NUMERO -> generateNomToNumeroQuestion(correctDepartement)
            QuizType.DEPARTEMENT_TO_REGION -> generateDepartementToRegionQuestion(correctDepartement)
            QuizType.DEPARTEMENT_TO_PREFECTURE -> generateDepartementToPrefectureQuestion(correctDepartement)
        }
    }

    private fun generateNumeroToNomQuestion(correctDept: Departement): Question {
        val wrongAnswers = allDepartements
            .filter { it != correctDept }
            .shuffled()
            .take(3)
            .map { it.nom }

        val allAnswers = (wrongAnswers + correctDept.nom).shuffled()

        return Question(
            questionText = "Quel est le département n° ${correctDept.numero} ?",
            correctAnswer = correctDept.nom,
            options = allAnswers
        )
    }

    private fun generateNomToNumeroQuestion(correctDept: Departement): Question {
        val wrongAnswers = allDepartements
            .filter { it != correctDept }
            .shuffled()
            .take(3)
            .map { it.numero }

        val allAnswers = (wrongAnswers + correctDept.numero).shuffled()

        return Question(
            questionText = "Quel est le numéro du département ${correctDept.nom} ?",
            correctAnswer = correctDept.numero,
            options = allAnswers
        )
    }

    private fun generateDepartementToRegionQuestion(correctDept: Departement): Question {
        val wrongAnswers = allDepartements
            .map { it.region }
            .distinct()
            .filter { it != correctDept.region }
            .shuffled()
            .take(3)

        val allAnswers = (wrongAnswers + correctDept.region).shuffled()

        return Question(
            questionText = "Dans quelle région se trouve ${correctDept.nom} (${correctDept.numero}) ?",
            correctAnswer = correctDept.region,
            options = allAnswers
        )
    }

    private fun generateDepartementToPrefectureQuestion(correctDept: Departement): Question {
        val wrongAnswers = allDepartements
            .filter { it != correctDept }
            .shuffled()
            .take(3)
            .map { it.prefecture }

        val allAnswers = (wrongAnswers + correctDept.prefecture).shuffled()

        return Question(
            questionText = "Quelle est la préfecture de ${correctDept.nom} (${correctDept.numero}) ?",
            correctAnswer = correctDept.prefecture,
            options = allAnswers
        )
    }

    fun reset() {
        usedDepartements.clear()
    }
}

data class Question(
    val questionText: String,
    val correctAnswer: String,
    val options: List<String>
)