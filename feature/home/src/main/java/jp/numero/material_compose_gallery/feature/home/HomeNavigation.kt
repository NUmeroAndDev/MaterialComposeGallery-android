package jp.numero.material_compose_gallery.feature.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val homeRoute = "home"

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    navigate(homeRoute, navOptions)
}

fun NavGraphBuilder.homeScreen(
    navigateToM2Overview: () -> Unit,
    navigateToM3Overview: () -> Unit,
) {
    composable(route = homeRoute) {
        Home(
            navigateToM2Overview = navigateToM2Overview,
            navigateToM3Overview = navigateToM3Overview,
        )
    }
}
