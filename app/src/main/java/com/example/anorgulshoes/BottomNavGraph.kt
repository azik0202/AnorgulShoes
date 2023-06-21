package com.example.anorgulshoes

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.anorgulshoes.screens.HomeScreen
import com.example.anorgulshoes.screens.ProfileScreen
import com.example.anorgulshoes.screens.SearchScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Search.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            SearchScreen()
        }
    }

}
