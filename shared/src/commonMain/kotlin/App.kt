import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import data.Photo
import ui.PhotosGrid

@Composable
fun App() {
    MaterialTheme {
        val photos: List<Photo> = List(100) { Photo(id = it) }
        val selectedIds: MutableState<Set<Int>> = rememberSaveable { mutableStateOf(emptySet()) }

        PhotosGrid(photos = photos, selectedIds = selectedIds)
    }
}
