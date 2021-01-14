package com.example.social.data.post

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.social.data.comment.Comment
import com.example.social.data.user.User
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "post_table")
@Parcelize
data class Post(
    @PrimaryKey val id: String,
    val createdBy: User,
    val text: String,
    val reactions: List<Reactions>,
    val mediaURL: String,
    val timestamp: String,
    val privacyLevel: PrivacyLevel = PrivacyLevel.FRIENDS,
    val comments: List<Comment>,
    val mentions: List<User>,
) : Parcelable {
}


//todo Type converter
@Parcelize
enum class Reactions(val count: Int): Parcelable {
    LIKE(0), DISLIKE(0), LAUGH(0),
    CRY(0), RAGE(0), HUG(0)
}

//data class Like(val count: Int) : Reactions()
//data class Dislike(val count: Int) : Reactions()
//data class Laugh(val count: Int): Reactions()
//data class Cry(val count: Int) : Reactions()
//data class Rage(val count: Int) : Reactions()
//data class Hug(val count: Int) : Reactions()


enum class PrivacyLevel {
    PUBLIC, FRIENDS, ME, CUSTOM
}