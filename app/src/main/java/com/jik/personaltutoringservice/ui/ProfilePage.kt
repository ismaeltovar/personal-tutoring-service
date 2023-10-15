package com.jik.personaltutoringservice.ui

import android.app.Activity.RESULT_OK
import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult
import com.google.firebase.auth.FirebaseAuth



@Composable
fun ProfilePage(
    modifier : Modifier,
    onLoginClick : () -> Unit
) {

    val user = FirebaseAuth.getInstance().currentUser
    var loggedIn = user != null;
    val name = if (loggedIn) user?.displayName else "Guest";
    val email = if (loggedIn) user?.email else "guest@guest.com";

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            Icons.Rounded.AccountCircle,
            contentDescription = "Profile Image",
            modifier = Modifier.size(100.dp)
        )
        Text("Hello, $name!", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(3.dp))
        if (!loggedIn)
            Button(
                onClick = onLoginClick,
                modifier = Modifier.fillMaxWidth(.5f)
            ) {
                    Text(text = "Login", color = Color.White, fontSize = 10.sp)
            }
    }
}