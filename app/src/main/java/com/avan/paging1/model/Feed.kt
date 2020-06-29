package com.avan.paging1.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Feed(
    @PrimaryKey
    val id: Long = 0,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("results")
    val totalResults: Long = 0

)