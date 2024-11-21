package com.example.navigationwithmvvm

import DetailMahasiswaView
import FormulirMahasiswaView
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationwithmvvm.model.Gender
import com.example.navigationwithmvvm.model.Mahasiswa
import com.example.praktikummvvm.ui.viewmodel.MahasiswaViewModel


enum class Halaman {
    FORMULIR,
    TAMPILDATA
}

@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
) {
    val uiState by viewModel.uistate.collectAsState()

    Scaffold { innerPadding ->
        NavHost(
            modifier = modifier.padding(innerPadding),
            navController = navHost,
            startDestination = Halaman.FORMULIR.name
        ) {
