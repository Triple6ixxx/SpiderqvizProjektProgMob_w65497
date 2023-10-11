package com.quizapp

import android.content.Intent
import android.util.Log
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // KROK 6: Ukryj pasek stanu i pobierz szczegóły z intent , ustaw je w interfejsie użytkownika. Dodaj również zdarzenie kliknięcia do przycisku zakończ.
        // START
        // Ukryj pasek
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        val wynik = (correctAnswers * 10) / totalQuestions
        Log.d("WYNIK", wynik.toString())
        Log.d("DEBUG", "userName: $userName")
        Log.d("DEBUG", "totalQuestions: $totalQuestions")
        Log.d("DEBUG", "correctAnswers: $correctAnswers")
        Log.d("DEBUG", "wynikText: $wynik")

        val komunikatTextView = findViewById<TextView>(R.id.komunikatTextView)

        val wynikText = when (wynik) {
            in 0..3 -> "Słabo"
            in 4..6 -> "Nieźle"
            in 7..10 -> "Super"
            else -> "Niepoprawny wynik"
        }



        tv_score.text = "Twój wynik to  $correctAnswers na $totalQuestions."
        komunikatTextView.text = " $wynikText "

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
        // END
    }
}