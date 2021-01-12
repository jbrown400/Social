package com.example.social.data.group

import androidx.room.PrimaryKey
import com.example.social.data.post.PrivacyLevel
import com.example.social.data.user.User

class Group(
    @PrimaryKey val title: String,
    val bannerImgURL: String,
    val members: List<User>,
    val privacyLevel: PrivacyLevel = PrivacyLevel.PUBLIC,
) {

}