package com.example.storyapp_submission.view.addstory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.storyapp_submission.databinding.ActivityAddStoryBinding

@Suppress("DEPRECATION")
class AddStoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddStoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionbar = supportActionBar
        actionbar!!.title = "New Story"
        actionbar.setDisplayHomeAsUpEnabled(true)

        binding = ActivityAddStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}