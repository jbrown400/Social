package com.example.social.data.user

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "user_table")
@Parcelize
data class User(
    val firstName: String,
    val lastName: String,
    val birthday: String,
    @PrimaryKey val id: String,
    val biography: UserBio
) {
}

//todo going to need to add a Type Converter for this
data class UserBio(var text: String)