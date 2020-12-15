package com.delet_dis.vusialnovel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_welcome)

    textHeader.text = getString(
      R.string.catWelcomeTextNamed,
      intent.getStringExtra("playerName")
    )

  }
}