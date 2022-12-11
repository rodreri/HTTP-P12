package mx.erick.http

import com.google.gson.annotations.SerializedName

data class ModeloDog(
    @SerializedName("message") var images:List<String>)