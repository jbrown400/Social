package com.example.social.data.comment

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.social.data.post.Reactions
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "comment_table")
@Parcelize
class Comment(
    val text: String,
    val reactions: Reactions,
    val replies: List<Comment>,
    @PrimaryKey val id: String,
) {

}