package com.masum.dessertclicker.data

import androidx.annotation.DrawableRes
import com.masum.dessertclickerviewmodel.data.Datasource.dessertList

data class DessertUiState( // Holds the Ui State of the Dessert Clicker App
    val currentDessertIndex: Int = 0, // Index of the current dessert being displayed
    val dessertsSold: Int = 0, // Total number of desserts sold
    val revenue: Int = 0, // Total revenue generated
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price, // Price of the current dessert
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId // Image resource ID of the current dessert
)