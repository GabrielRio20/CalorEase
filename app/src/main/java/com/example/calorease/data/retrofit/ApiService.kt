package com.example.calorease.data.retrofit

import com.example.calorease.data.request.PredictionRequest
import com.example.calorease.data.response.PredictionResponse
import com.example.calorease.data.response.UploadResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiService {
    @Multipart
    @POST("upload")
    suspend fun uploadImage(
        @Part file: MultipartBody.Part
    ): UploadResponse


    @POST("prediction")
    fun predictionImage(
        @Body imgPath: PredictionRequest
    ): Call<PredictionResponse>
}