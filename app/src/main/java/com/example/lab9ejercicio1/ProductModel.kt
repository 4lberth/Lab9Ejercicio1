package com.example.lab9ejercicio1

import com.google.gson.annotations.SerializedName
import retrofit2.http.Path

data class ProductModel(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("price") val price: Double,
    @SerializedName("description") val description: String,
    @SerializedName("thumbnail") val thumbnail: String
)

data class ProductResponse(
    @SerializedName("products") val products: List<ProductModel>
)
