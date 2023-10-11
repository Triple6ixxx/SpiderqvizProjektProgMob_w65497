package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // KROK 1: Utwórz  zmienne,  wymagane na ekranie wyników.
    // START
    const val USER_NAME: String = "Twoje imię"
    const val TOTAL_QUESTIONS: String = "Wszystkie pytania"
    const val CORRECT_ANSWERS: String = "Poprawne odpowiedzi"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Dlaczego ptasznik jest nazywany ptasznikiem?",
            R.drawable.quest1,
            "Ponieważ żerują główenie na ptakach.", "Ponieważ tworzą pajęczyny w opuszczonych ptasich gniazdach.",
            "Ponieważ gdy europejscy osadnicy w Ameryce Południowej po raz pierwszy zobaczyli ptasznika, jadł on małego ptaka.", "Żadna z powyższych.", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Ile jest gatunków  ptaszników?",
            R.drawable.quest2,
            "250>", "335",
            "564", "800<", 4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Czy ptaszniki w hodowlach mają usunięte gruczoły z jadem?",
            R.drawable.quest3,
            "Tak", "Tak, ale tylko w hodowlach profesjonalnych",
            "Tak, ale tylko w hodowlach amatorskich", "Nie", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Jaki gatunek ptasznika jest na zdjęciu ?",
            R.drawable.quest4,
            "Caribena versicolor (Ptasznik wielobarwny)", "Poecilotheria ornata (Ptasznik zdobiony)",
            "Brachypelma boehmei (Ptasznik czerwononogi )", "Cyriopagopus lividus ( Ptasznik kobaltowy)", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Który gatunek ptasznika uważany jest za największy (wielkość pająka)?",
            R.drawable.quest5,
            "Teraphosa blondi", "Lasiodora parahybana",
            "Tliltocatl albopilosus", "Brachypelma albiceps", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Jaki gatunek ptasznika jest uważany za najłagodniejszego?",
            R.drawable.quest6,
            "Haplopelma lividum", "Pterimochilus lugardi",
            "Brachypelma albopilosum", "Psalmopoeus pulcher", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Jak długo może żyć ptasznik?",
            R.drawable.quest7,
            "Do 5 lat", "Do 10 lat",
            "Ponad 10 lat", "Ponad 20 lat", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Ukąszenie którego z podanych gatunków może okazać się śmiertelne dla człowieka? ",
            R.drawable.quest8,
            "Atrax robustus ( Ptasznik australijski) ", "Acanthoscurria geniculata (Ptasznik białokolanowy)",
            "Pterinochilus murinus (Ptasznik słoneczny) ", "Davus fasciatus (Ptasznik tygrysi)", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Czy ptaszniki tkają sieć?",
            R.drawable.quest9,
            "Tak, wszystkie gatunki", "Większość gatunków",
            "Mniejsza część gatunków", "Tylko jeden gatunek", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "U którego z gatunków możemy zauważyć na odwłoku charakterystyczną plamkę kształtem przypominającą serce?",
            R.drawable.quest10,
            "Psalmopeus irminia", "Cyriocosmus elegans",
            "Brachypelma albiceps", "Nhandu chromatus", 2
        )

        questionsList.add(que10)

        return questionsList
    }
}