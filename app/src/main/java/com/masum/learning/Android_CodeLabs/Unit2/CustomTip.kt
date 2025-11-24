package com.masum.learning.Android_CodeLabs.Unit2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import java.text.NumberFormat
import com.masum.learning.R

@Composable
fun TipTimeLayout() {
    // A state variable to hold the user input of amount
    var amountInput by remember { mutableStateOf("") }
    // Convert the user input to a Double, defaulting to 0.0 if conversion fails
    val amount = amountInput.toDoubleOrNull() ?: 0.0
    // Calculate the tip based on the amount
    val tip = calculateTip(amount)
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        EditNumber(
            value = amountInput, // The current value of the input field, taken from the state variable
            onValueChange = { amountInput = it }, // Update the state variable when the input changes
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth())
        Text(
            text = stringResource(R.string.tip_amount, tip), // Display the calculated tip
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

// Function to calculate the tip based on the amount and tip percentage
private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Composable
fun EditNumber(
    value: String, // The current value of the input field, the parameter is here because it's a stateless composable
    onValueChange: (String) -> Unit, // Lambda function to handle changes in the input field
    modifier: Modifier = Modifier
) {

    TextField(
        value = value, // value = value because it's a stateless composable
        onValueChange = onValueChange, // onValueChange = onValueChange because it's a stateless composable
        label = { // Label for the TextField
            Text(stringResource(R.string.bill_amount))
        },
        singleLine = true, // Make the TextField single line
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number), // Set the keyboard type to Number
        modifier = modifier
    )
}

// Now what the hell is a stateless composable?
// First of all, we can't use state in another composable directly. That's why we need to pass the state as parameters.

// A stateless composable is a composable function that does not hold any state of its own.
// Instead, it relies on the parameters passed to it to render its UI.
// This makes stateless composables more reusable and easier to test, as they do not depend on any external state.
// In the example above, EditNumber is a stateless composable because it does not hold any state of its own.
// It takes the current value of the input field and a lambda function to handle changes in the input field as parameters.
// This allows EditNumber to be reused in different contexts with different state management strategies.


// In our current case, why and how we are using a stateless composable in easier language?
// In our current case, we are using a stateless composable (EditNumber) to separate the UI logic from the state management logic.
// The TipTimeLayout composable is responsible for managing the state of the input field (amountInput) and calculating the tip based on that state.
// The EditNumber composable is responsible for rendering the input field UI based on the state passed to it as parameters.
// This separation of concerns makes our code more modular and easier to maintain.
// If we need to change the UI of the input field, we can do so in the EditNumber composable without affecting the state management logic in the TipTimeLayout composable.
// Similarly, if we need to change the state management logic, we can do so in the TipTimeLayout composable without affecting the UI of the input field.

// This is a great practice in Jetpack Compose, as it promotes reusability and maintainability of code.