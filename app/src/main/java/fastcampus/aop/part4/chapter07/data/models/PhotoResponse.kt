package fastcampus.aop.part4.chapter07.data.models


import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("blur_hash")
    val blurHash: String? = null,
    @SerializedName("color")
    val color: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("current_user_collections")
    val currentUserCollections: List<Any>? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("downloads")
    val downloads: Int? = null,
    @SerializedName("exif")
    val exif: Exif? = null,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("liked_by_user")
    val likedByUser: Boolean? = null,
    @SerializedName("likes")
    val likes: Int? = null,
    @SerializedName("links")
    val links: Links? = null,
    @SerializedName("location")
    val location: Location? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("urls")
    val urls: Urls? = null,
    @SerializedName("user")
    val user: User? = null,
    @SerializedName("width")
    val width: Int
)
