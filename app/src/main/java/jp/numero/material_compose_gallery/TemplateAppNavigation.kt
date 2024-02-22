package jp.numero.material_compose_gallery

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import jp.numero.material_compose_gallery.feature.home.homeRoute
import jp.numero.material_compose_gallery.feature.home.homeScreen

@Composable
fun TemplateAppNavigation(
    navController: NavHostController,
    windowSizeClass: WindowSizeClass,
) {
    NavHost(
        navController = navController,
        startDestination = homeRoute,
    ) {
        homeScreen()
    }
}