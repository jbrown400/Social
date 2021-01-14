package com.example.social.data.group

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.social.data.post.PrivacyLevel
import com.example.social.data.user.User
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "group_table")
@Parcelize
data class Group(
    @PrimaryKey val title: String,
    val bannerImgURL: String,
    val members: List<User>,
    val privacyLevel: PrivacyLevel = PrivacyLevel.PUBLIC,
) : Parcelable {

}