package data

data class Photo(
    val id: Int,
    val url: String = "https://picsum.photos/seed/${(0..100000).random()}/256/256"
)
