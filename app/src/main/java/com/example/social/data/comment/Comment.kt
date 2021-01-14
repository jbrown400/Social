package com.example.social.data.comment

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.social.data.post.Reactions
import com.example.social.data.user.User
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "comment_table")
@Parcelize
class Comment(
    val text: String,
    val reactions: List<Reactions>,
    val mentions: List<User>,
    val replies: List<Comment>,
    @PrimaryKey val id: String,
) : Parcelable {

}