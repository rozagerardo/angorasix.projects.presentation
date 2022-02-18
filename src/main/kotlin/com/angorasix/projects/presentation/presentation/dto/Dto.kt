package com.angorasix.projects.presentation.presentation.dto

/**
 *
 *
 * @author rozagerardo
 */
data class ProjectPresentationDto(
        val projectId: String,
        val title: String,
        val objective: String?,
        val media: Collection<PresentationMediaDto> = emptyList(),
        val id: String? = null,
)

data class PresentationMediaDto(
        val mediaType: String,
        val url: String,
        val thumbnailUrl: String,
        val resourceId: String
)
