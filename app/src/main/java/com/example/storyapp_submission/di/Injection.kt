package com.example.storyapp_submission.di

import android.content.Context
import com.example.storyapp_submission.data.api.ApiConfig
import com.example.storyapp_submission.data.pref.UserPreference
import com.example.storyapp_submission.data.pref.dataStore
import com.example.storyapp_submission.data.repository.StoryRepository

object Injection {
    fun provideRepository(context: Context): StoryRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return StoryRepository.getInstance(pref, ApiConfig.getApiService(context))
    }
}