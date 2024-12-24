package com.example.storyapp_submission.utils

import com.example.storyapp_submission.data.response.ErrorResponse
import com.google.gson.Gson
import retrofit2.HttpException

fun parseErrorMessage(e: HttpException): String {
    return try {
        val errorBody = e.response()?.errorBody()?.string()
        val errorResponse = Gson().fromJson(errorBody, ErrorResponse::class.java)
        errorResponse.message ?: "Terjadi kesalahan"
    } catch (exception: Exception) {
        "Terjadi kesalahan"
    }
}