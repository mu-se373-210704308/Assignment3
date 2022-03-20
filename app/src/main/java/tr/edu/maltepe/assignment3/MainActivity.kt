package tr.edu.maltepe.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView2) as TextView
        var timesClicked = 0
        // set on-click listener
        btn_click_me.setOnClickListener {
            timesClicked = timesClicked + 1
            myTextView.text = timesClicked.toString()
        }

    }
}