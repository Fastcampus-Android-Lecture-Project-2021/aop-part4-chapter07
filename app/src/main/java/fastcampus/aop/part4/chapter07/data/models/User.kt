package fastcampus.aop.part4.chapter07.data.models


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("bio")
    val bio: String? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("instagram_username")
    val instagramUsername: String? = null,
    @SerializedName("links")
    val links: LinksX? = null,
    @SerializedName("location")
    val location: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("portfolio_url")
    val portfolioUrl: String? = null,
    @SerializedName("total_collections")
    val totalCollections: Int? = null,
    @SerializedName("total_likes")
    val totalLikes: Int? = null,
    @SerializedName("total_photos")
    val totalPhotos: Int? = null,
    @SerializedName("twitter_username")
    val twitterUsername: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("username")
    val username: String? = null,
    @SerializedName("profile_image")
    val profileImageUrls: ProfileImageUrls? = null
)
