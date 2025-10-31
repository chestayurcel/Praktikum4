package com.example.praktikum4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum4.ui.theme.Praktikum4Theme

@Composable
fun RegistrationForm() {
    var namaLengkap by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    val jenisKelaminOptions = listOf("Laki-laki", "Perempuan")
    var statusPerkawinan by remember { mutableStateOf("") }
    val statusPerkawinanOptions = listOf("Janda", "Lajang", "Duda")
    var alamat by remember { mutableStateOf("") }

    val lightPurple = Color(0xFFE0D6FF)
    val darkPurple = Color(0xFF6750A4)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(lightPurple)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = darkPurple
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(Color(0xFFF7F2FA)) // Warna latar belakang form yang sedikit keunguan
                .padding(20.dp)
        ) {
            // --- Input Nama Lengkap ---
            Text(
                text = "NAMA LENGKAP",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            OutlinedTextField(
                value = namaLengkap,
                onValueChange = { namaLengkap = it },
                label = { Text("Isian nama lengkap") },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = darkPurple,
                    unfocusedBorderColor = Color.LightGray,
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )

            Spacer(modifier = Modifier.height(16.dp))
        }