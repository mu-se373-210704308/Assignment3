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

        // defined button,text and counter
        val buttonClick = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView2) as TextView
        var counter = 0

        // set on-click listener
        buttonClick.setOnClickListener {
            // in the next line, increases the value by 1 each time when the button is clicked.
            counter = counter + 1

            // the next line makes the counter appear on the screen
            myTextView.text = counter.toString()
        }

    }
}