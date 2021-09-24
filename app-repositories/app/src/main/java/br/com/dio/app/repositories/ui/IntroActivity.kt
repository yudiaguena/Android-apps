package br.com.dio.app.repositories.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import br.com.dio.app.repositories.R


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro)
        val pb = findViewById<View>(R.id.loadingPanel) as RelativeLayout
        pb.visibility = ProgressBar.VISIBLE
        val btn2 = findViewById<Button>(R.id.start_github) as Button

        btn2.setOnClickListener {
            val intent = Intent(this@IntroActivity, MainActivity::class.java)
            startActivity(intent)
        }

        pb.visibility = ProgressBar.INVISIBLE
    }
}