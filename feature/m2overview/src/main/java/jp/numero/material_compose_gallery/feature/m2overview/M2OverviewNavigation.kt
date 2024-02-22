package jp.numero.material_compose_gallery.feature.m2overview

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val m2OverviewRoute = "m2/overview"

fun NavController.navigateToM2Overview(navOptions: NavOptions? = null) {
    navigate(m2OverviewRoute, navOptions)
}

fun NavGraphBuilder.m2OverviewScreen(
    onBack: () -> Unit,
) {
    composable(route = m2OverviewRoute) {
        Material2Overview(
            onBack = onBack
        )
    }
}
