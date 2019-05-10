package com.aldana.ejemplo14

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.aldana.ejemplo14.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel
   //private var contA = 0
    //private var contB = 0
    lateinit var binding : ActivityMainBinding
    //val scoreo = Score()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.score = Score(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)

        //binding(contA, contB)
        /*setContentView(R.layout.activity_main)

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        displayScore(
            tv_score_team_a,
            scoreViewModel.scoreTeamA
        )

        displayScore(
            tv_score_team_b,
            scoreViewModel.scoreTeamB
        )*/

        // TODO: El ViewModel es restaurado si ya existía, si no, se crea uno nuevo.
        // TODO: Recuerde que el ViewModel solo sobrevive a cambios de configuración y no a la destrucción de la aplicación

    }


    // TODO: Accediendo y modificando datos almacenados en el ViewModel según el método utilizado

    fun addOneTeamA(v: View) {
        /*displayScore(
            tv_score_team_a,
            ++scoreViewModel.scoreTeamA
        )*/

        binding.score = Score(++scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
        //binding(contA,contB)
    }

    fun addOneTeamB(v: View) {
        binding.score = Score(scoreViewModel.scoreTeamA, ++scoreViewModel.scoreTeamB)
        //binding(contA,contB)

    }

    fun addTwoTeamA(v: View) {
        //contA+=2
        scoreViewModel.scoreTeamA +=2
        binding.score = Score(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
        //binding(contA,contB)
    }

    fun addTwoTeamB(v: View) {
        //contB+=2
        scoreViewModel.scoreTeamB +=2
        binding.score = Score(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
        //binding(contA,contB)
    }

    fun addThreeTeamA(v: View) {
        //contA+=3
        scoreViewModel.scoreTeamA += 3
        binding.score = Score(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
        //binding(contA,contB)
    }

    fun addThreeTeamB(v: View) {
        //contB+=3
        scoreViewModel.scoreTeamB += 3
        binding.score = Score(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
        //binding(contA,contB)
    }

    fun resetScores(v: View) {
        scoreViewModel.scoreTeamA = 0
        scoreViewModel.scoreTeamB = 0
        binding.score = Score(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
       //binding(contA,contB)
    } // TODO: Limpiando datos

   /* fun displayScore(v: TextView, score: Int) {
        v.text = score.toString()
    }*/

    /*fun binding(cA: Int, cB: Int){
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)

        val scoreo = Score(cA,cB)
        binding.score = scoreo
    }*/

}
