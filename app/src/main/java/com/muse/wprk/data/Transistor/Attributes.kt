package com.muse.wprk.data.Transistor

import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    val amazon_music: String?,
    val apple_podcasts: String?,
    val author: String,
    val breaker: String?,
    val castbox: String?,
    val castro: String?,
    val category: String?,
    val copyright: String,
    val created_at: String,
    val deezer: String?,
    val description: String?,
    val email_notifications: Boolean,
    val explicit: Boolean,
    val feed_url: String,
    val google_podcasts: String?,
    val iHeartRadio: String?,
    val image_url: String,
    val keywords: String,
    val language: String,
    val multiple_seasons: Boolean,
    val overcast: String?,
    val owner_email: String,
    val pandora: String?,
    val password_protected_feed: Boolean,
    val player_FM: String,
    val playlist_limit: Int,
    val pocket_casts: String?,
    val podcast_addict: String,
    val `private`: Boolean,
    val radioPublic: String?,
    val secondary_category: String,
    val show_type: String,
    val slug: String,
    val soundcloud: String?,
    val spotify: String?,
    val stitcher: String?,
    val time_zone: String,
    val title: String,
    val tuneIn: String?,
    val updated_at: String,
    val website: String?
)