package com.opentry.android_storage_samples.scopedstorage

import android.net.Uri
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.opentry.android_storage_samples.R

data class Link(val name: String, val uri: Uri)

data class Demo(
    val route: String,
    @StringRes val name: Int,
    @StringRes val description: Int,
    val icon: ImageVector,
    val links: List<Link>
)

object Demos {
    val AddMediaFile = Demo(
        route = "demo_add_media_file",
        name = R.string.demo_add_media_file_name,
        description = R.string.demo_add_media_file_description,
        icon = Icons.Filled.AddPhotoAlternate,
        links = listOf(
            Link(
                "Add MediaStore item guide",
                Uri.parse("https://developer.android.com/training/data-storage/shared/media#add-item")
            )
        )
    )

    val CaptureMediaFile = Demo(
        route = "demo_capture_media_file",
        name = R.string.demo_capture_media_file_name,
        description = R.string.demo_capture_media_file_description,
        icon = Icons.Filled.AddAPhoto,
        links = listOf(
            Link(
                "Take picture intent",
                Uri.parse("https://developer.android.com/training/camera/photobasics#TaskCaptureIntent")
            ),
            Link(
                "Add MediaStore item guide",
                Uri.parse("https://developer.android.com/training/data-storage/shared/media#add-item")
            )
        )
    )

    val AddFileToDownloads = Demo(
        route = "demo_add_file_to_downloads",
        name = R.string.demo_add_file_to_downloads_name,
        description = R.string.demo_add_file_to_downloads_description,
        icon = Icons.Filled.AddCircle,
        links = emptyList()
    )

    val EditMediaFile = Demo(
        route = "demo_edit_media_file",
        name = R.string.demo_edit_media_file_name,
        description = R.string.demo_edit_media_file_description,
        icon = Icons.Filled.Edit,
        links = emptyList()
    )

    val DeleteMediaFile = Demo(
        route = "demo_download_media_file",
        name = R.string.demo_delete_media_file_name,
        description = R.string.demo_delete_media_file_description,
        icon = Icons.Filled.Delete,
        links = emptyList()
    )

    val ListMediaFiles = Demo(
        route = "demo_list_media_files",
        name = R.string.demo_list_media_files_name,
        description = R.string.demo_list_media_files_description,
        icon = Icons.Filled.ImageSearch,
        links = emptyList()
    )

    val SelectDocumentFile = Demo(
        route = "demo_select_document_file",
        name = R.string.demo_select_document_file_name,
        description = R.string.demo_select_document_file_description,
        icon = Icons.Filled.AttachFile,
        links = emptyList()
    )

    val CreateDocumentFile = Demo(
        route = "demo_create_document_file",
        name = R.string.demo_create_document_file_name,
        description = R.string.demo_create_document_file_description,
        icon = Icons.Filled.NoteAdd,
        links = emptyList()
    )

    val EditDocumentFile = Demo(
        route = "demo_edit_document_file",
        name = R.string.demo_edit_document_file_name,
        description = R.string.demo_edit_document_file_description,
        icon = Icons.Filled.Edit,
        links = emptyList()
    )


    val list = listOf(
        AddMediaFile,
        CaptureMediaFile,
        AddFileToDownloads,
        EditMediaFile,
        DeleteMediaFile,
        ListMediaFiles,
        SelectDocumentFile,
        CreateDocumentFile,
        EditDocumentFile,
    )
}