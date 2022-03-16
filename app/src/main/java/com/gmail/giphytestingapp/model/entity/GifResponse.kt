package com.gmail.giphytestingapp.model.entity

import com.google.gson.annotations.SerializedName

data class GifResponse(

	@field:SerializedName("pagination")
	val pagination: Pagination,

	@field:SerializedName("data")
	val data: List<DataItem>,

	@field:SerializedName("meta")
	val meta: Meta
)

data class Preview(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("height")
	val height: String
)

data class OriginalMp4(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedWidthSmall(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class PreviewGif(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Looping(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String
)

data class FixedHeightDownsampled(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Onload(

	@field:SerializedName("url")
	val url: String
)

data class Downsized(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedWidth(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Meta(

	@field:SerializedName("msg")
	val msg: String,

	@field:SerializedName("response_id")
	val responseId: String,

	@field:SerializedName("status")
	val status: Int
)

data class FixedHeightSmall(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Onclick(

	@field:SerializedName("url")
	val url: String
)

data class DownsizedMedium(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedHeightSmallStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedWidthSmallStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedHeight(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class User(

	@field:SerializedName("avatar_url")
	val avatarUrl: String,

	@field:SerializedName("instagram_url")
	val instagramUrl: String,

	@field:SerializedName("website_url")
	val websiteUrl: String,

	@field:SerializedName("profile_url")
	val profileUrl: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("banner_url")
	val bannerUrl: String,

	@field:SerializedName("banner_image")
	val bannerImage: String,

	@field:SerializedName("display_name")
	val displayName: String,

	@field:SerializedName("is_verified")
	val isVerified: Boolean,

	@field:SerializedName("username")
	val username: String
)

data class Images(

	@field:SerializedName("preview")
	val preview: Preview,

	@field:SerializedName("original")
	val original: Original,

	@field:SerializedName("preview_gif")
	val previewGif: PreviewGif,

	@field:SerializedName("fixed_height_small")
	val fixedHeightSmall: FixedHeightSmall,

	@field:SerializedName("looping")
	val looping: Looping,

	@field:SerializedName("downsized_still")
	val downsizedStill: DownsizedStill,

	@field:SerializedName("fixed_width")
	val fixedWidth: FixedWidth,

	@field:SerializedName("downsized_large")
	val downsizedLarge: DownsizedLarge,

	@field:SerializedName("fixed_height_downsampled")
	val fixedHeightDownsampled: FixedHeightDownsampled,

	@field:SerializedName("downsized_medium")
	val downsizedMedium: DownsizedMedium,

	@field:SerializedName("fixed_height")
	val fixedHeight: FixedHeight,

	@field:SerializedName("fixed_height_small_still")
	val fixedHeightSmallStill: FixedHeightSmallStill,

	@field:SerializedName("fixed_width_downsampled")
	val fixedWidthDownsampled: FixedWidthDownsampled,

	@field:SerializedName("downsized_small")
	val downsizedSmall: DownsizedSmall,

	@field:SerializedName("fixed_width_small")
	val fixedWidthSmall: FixedWidthSmall,

	@field:SerializedName("original_mp4")
	val originalMp4: OriginalMp4,

	@field:SerializedName("fixed_height_still")
	val fixedHeightStill: FixedHeightStill,

	@field:SerializedName("fixed_width_small_still")
	val fixedWidthSmallStill: FixedWidthSmallStill,

	@field:SerializedName("preview_webp")
	val previewWebp: PreviewWebp,

	@field:SerializedName("480w_still")
	val jsonMember480wStill: JsonMember480wStill,

	@field:SerializedName("fixed_width_still")
	val fixedWidthStill: FixedWidthStill,

	@field:SerializedName("downsized")
	val downsized: Downsized,

	@field:SerializedName("original_still")
	val originalStill: OriginalStill
)

data class DataItem(

	@field:SerializedName("import_datetime")
	val importDatetime: String,

	@field:SerializedName("images")
	val images: Images,

	@field:SerializedName("embed_url")
	val embedUrl: String,

	@field:SerializedName("trending_datetime")
	val trendingDatetime: String,

	@field:SerializedName("bitly_url")
	val bitlyUrl: String,

	@field:SerializedName("rating")
	val rating: String,

	@field:SerializedName("is_sticker")
	val isSticker: Int,

	@field:SerializedName("source")
	val source: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("bitly_gif_url")
	val bitlyGifUrl: String,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("source_tld")
	val sourceTld: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("analytics_response_payload")
	val analyticsResponsePayload: String,

	@field:SerializedName("analytics")
	val analytics: Analytics,

	@field:SerializedName("source_post_url")
	val sourcePostUrl: String,

	@field:SerializedName("content_url")
	val contentUrl: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("user")
	val user: User,

	@field:SerializedName("slug")
	val slug: String,

	@field:SerializedName("username")
	val username: String
)

data class FixedWidthDownsampled(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedHeightStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class OriginalStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Onsent(

	@field:SerializedName("url")
	val url: String
)

data class DownsizedLarge(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Analytics(

	@field:SerializedName("onclick")
	val onclick: Onclick,

	@field:SerializedName("onsent")
	val onsent: Onsent,

	@field:SerializedName("onload")
	val onload: Onload
)

data class DownsizedStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class Original(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("frames")
	val frames: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("webp")
	val webp: String,

	@field:SerializedName("webp_size")
	val webpSize: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("hash")
	val hash: String,

	@field:SerializedName("height")
	val height: String
)

data class Pagination(

	@field:SerializedName("offset")
	val offset: Int,

	@field:SerializedName("total_count")
	val totalCount: Int,

	@field:SerializedName("count")
	val count: Int
)

data class DownsizedSmall(

	@field:SerializedName("mp4")
	val mp4: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("mp4_size")
	val mp4Size: String,

	@field:SerializedName("height")
	val height: String
)

data class JsonMember480wStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class FixedWidthStill(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)

data class PreviewWebp(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("width")
	val width: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("height")
	val height: String
)
