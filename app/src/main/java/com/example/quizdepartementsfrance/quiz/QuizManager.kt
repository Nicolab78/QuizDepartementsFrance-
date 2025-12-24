package com.example.quizdepartementsfrance.quiz

class QuizManager(private val totalQuestions: Int = 10) {

    private val quizGenerator = QuizGenerator()
    private var currentQuestionNumber = 0
    private var correctAnswers = 0
    private var wrongAnswers = 0

    fun getNextQuestion(): Question? {
        if (currentQuestionNumber >= totalQuestions){
            return null
        }

        currentQuestionNumber++
        return quizGenerator.generateQuestion()
    }

    fun checkAnswer(userAnswer: String, correctAnswer: String): Boolean {
        val isCorrect = userAnswer == correctAnswer

        if(isCorrect){
            correctAnswers++
        }else{
            wrongAnswers++
        }

        return isCorrect
    }

    fun getScore(): Int = correctAnswers

    fun getCorrectAnswers(): Int = correctAnswers

    fun getCurrentQuestionNumber(): Int = currentQuestionNumber

    fun getTotalQuestions(): Int = totalQuestions

    fun getScorePercentage(): Int {
        if (currentQuestionNumber == 0) return 0
        return (correctAnswers * 100) / currentQuestionNumber

    }

    fun isQuizFinished(): Boolean = currentQuestionNumber >= totalQuestions

    fun reset() {
        currentQuestionNumber = 0
        correctAnswers = 0
        wrongAnswers = 0
        quizGenerator.reset()
    }


}