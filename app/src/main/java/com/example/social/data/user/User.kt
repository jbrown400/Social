package com.example.social.data.user

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.social.data.post.Post
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "user_table")
@Parcelize
data class User(
    val firstName: String,
    val lastName: String,
    val birthday: String,
    @PrimaryKey val id: String,
    val biography: UserBio,
    val friends: List<User>,
    val likedPosts: List<Post>
) : Parcelable {
}

//todo going to need to add a Type Converter for this
@Parcelize
data class UserBio(var text: String): Parcelable