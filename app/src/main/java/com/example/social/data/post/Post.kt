package com.example.social.data.post

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
    val reactions: Reactions,
    val mediaURL: String,
    val timestamp: String,
    val privacyLevel: PrivacyLevel = PrivacyLevel.FRIENDS,
    val comments: List<Comment>,
    val mentions: List<User>,
) {
}


//todo Type converter
data class Reactions(
    val like: Like,
    val dislike: Dislike,
    val laugh: Laugh,
    val cry: Cry,
    val rage: Rage,
    val hug: Hug
)

data class Like(val count: Int)
data class Dislike(val count: Int)
data class Laugh(val count: Int)
data class Cry(val count: Int)
data class Rage(val count: Int)
data class Hug(val count: Int)


enum class PrivacyLevel {
    PUBLIC, FRIENDS, ME, CUSTOM
}