package jp.numero.material_compose_gallery

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import jp.numero.material_compose_gallery.feature.home.homeRoute
import jp.numero.material_compose_gallery.feature.home.homeScreen
import jp.numero.material_compose_gallery.feature.m2overview.m2OverviewScreen
import jp.numero.material_compose_gallery.feature.m2overview.navigateToM2Overview
import jp.numero.material_compose_gallery.feature.m3overview.m3OverviewScreen
import jp.numero.material_compose_gallery.feature.m3overview.navigateToM3Overview

@Composable
fun TemplateAppNavigation(
    navController: NavHostController,
    windowSizeClass: WindowSizeClass,
) {
    NavHost(
        navController = navController,
        startDestination = homeRoute,
    ) {
        homeScreen(
            navigateToM2Overview = {
                navController.navigateToM2Overview()
            },
            navigateToM3Overview = {
                navController.navigateToM3Overview()
            }
        )
        m2OverviewScreen(
            onBack = {
                navController.navigateUp()
            }
        )
        m3OverviewScreen(
            onBack = {
                navController.navigateUp()
            }
        )
    }
}