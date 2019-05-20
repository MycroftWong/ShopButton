package com.esthetics.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mycroft.shopbutton.ShopButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        shopButton.setMax(5)
        shopButton.setMin(2)
        shopButton.countChangedListener = object: ShopButton.OnCountChangedListener {
            override fun onCountChanged(count: Int) {
                Toast.makeText(this@MainActivity, "count: $count", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
