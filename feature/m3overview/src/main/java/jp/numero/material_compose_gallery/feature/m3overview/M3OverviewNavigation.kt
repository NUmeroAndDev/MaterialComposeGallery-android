package jp.numero.material_compose_gallery.feature.m3overview

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val m3OverviewRoute = "m3/overview"

fun NavController.navigateToM3Overview(navOptions: NavOptions? = null) {
    navigate(m3OverviewRoute, navOptions)
}

fun NavGraphBuilder.m3OverviewScreen(
    onBack: () -> Unit,
) {
    composable(route = m3OverviewRoute) {
        Material3Overview(
            onBack = onBack
        )
    }
}
