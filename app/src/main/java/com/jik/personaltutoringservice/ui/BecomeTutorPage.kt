package com.jik.personaltutoringservice.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController


object Experience
{
    const val beginner= "Beginner"
    const val intermediate = "Intermediate"
    const val advanced = "Advanced"
    const val professional = "Professional"
}

object Distance
{
    const val lessThanFiveMiles= "Less than 5 miles"
    const val fiveToTenMiles = "5-10 miles"
    const val tenToTwentyMiles = "10-20 miles"
    const val moreThanFiftyMiles = "More than 50 miles, therefore, no preference"
}
@Composable
fun BecomeTutorPage(
    onSubmit: () -> Unit
) {

    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item{

                Text("Tutoring Application", modifier = Modifier.padding(16.dp), fontSize = 50.sp)
                Text("Please fill in all the fields of the application", fontSize = 25.sp)

                val experienceRadio = remember {
                    mutableStateOf("")
                }

                val locationRadio = remember {
                    mutableStateOf("")
                }

                var monday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }

                var tuesday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }
                var wednesday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }
                var thursday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }
                var friday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }
                var saturday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }
                var sunday by remember {
                    mutableStateOf("Write in the time frame you're available. eg: 9am-5pm")
                }
                var hourlyPrice by remember {
                    mutableStateOf("")
                }

                Spacer(modifier = Modifier.size(16.dp))

                Text("What is your level of experience on your specialty?")
                Column {

                    Row{
                        RadioButton(
                            selected = experienceRadio.value == Experience.beginner,
                            onClick = { experienceRadio.value = Experience.beginner },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Experience.beginner)

                    }

                    Row {
                        RadioButton(
                            selected = experienceRadio.value == Experience.intermediate,
                            onClick = { experienceRadio.value = Experience.intermediate },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Experience.intermediate)
                    }

                    Row {
                        RadioButton(
                            selected = experienceRadio.value == Experience.advanced,
                            onClick = { experienceRadio.value = Experience.advanced },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Experience.advanced)
                    }

                    Row {
                        RadioButton(
                            selected = experienceRadio.value == Experience.professional,
                            onClick = { experienceRadio.value = Experience.professional },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Experience.professional)
                    }

                    Spacer(modifier = Modifier.size(16.dp))

                    Text("What is your availability during the week?")

                    Spacer(modifier = Modifier.size(16.dp))
                    Row {

                        Text("Monday")
                        TextField(value = monday, onValueChange = {
                            newText -> monday = newText
                        })
                    }

                    Row {

                        Text("Tuesday")
                        TextField(value = tuesday, onValueChange = {
                                newText -> tuesday = newText
                        })
                    }

                    Row {

                        Text("Wednesday")
                        TextField(value = wednesday, onValueChange = {
                                newText -> wednesday = newText
                        })
                    }

                    Row {

                        Text("Thursday")
                        TextField(value = thursday, onValueChange = {
                                newText -> thursday = newText
                        })
                    }

                    Row {

                        Text("Friday")
                        TextField(value = friday, onValueChange = {
                                newText -> friday = newText
                        })
                    }

                    Row {

                        Text("Saturday")
                        TextField(value = saturday, onValueChange = {
                                newText -> saturday = newText
                        })
                    }

                    Row {

                        Text("Sunday")
                        TextField(value = sunday, onValueChange = {
                                newText -> sunday = newText
                        })
                    }

                    Spacer(modifier = Modifier.size(16.dp))


                    Text("How much do you charge per hour? ")

                    TextField(value = hourlyPrice, onValueChange = {
                            newText -> hourlyPrice = newText
                    })

                    Spacer(modifier = Modifier.size(16.dp))

                    Text("How far do you prefer tutoring at?")

                    Row{
                        RadioButton(
                            selected = locationRadio.value == Distance.lessThanFiveMiles,
                            onClick = { locationRadio.value == Distance.lessThanFiveMiles },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Distance.lessThanFiveMiles)

                    }

                    Row {
                        RadioButton(
                            selected = locationRadio.value == Distance.fiveToTenMiles,
                            onClick = { locationRadio.value == Distance.fiveToTenMiles },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Distance.fiveToTenMiles)
                    }

                    Row {
                        RadioButton(
                            selected = experienceRadio.value == Experience.advanced,
                            onClick = { experienceRadio.value = Experience.advanced },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Experience.advanced)
                    }

                    Row {
                        RadioButton(
                            selected = locationRadio.value == Distance.tenToTwentyMiles,
                            onClick = { locationRadio.value == Distance.tenToTwentyMiles },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Distance.tenToTwentyMiles)
                    }

                    Row {
                        RadioButton(
                            selected = locationRadio.value == Distance.moreThanFiftyMiles,
                            onClick = { locationRadio.value == Distance.moreThanFiftyMiles },
                            colors = RadioButtonDefaults.colors(Color.Blue)
                        )
                        Text(Distance.moreThanFiftyMiles)
                    }

                    Button(onClick = onSubmit ,
                        modifier = Modifier
                            .fillMaxWidth()
                        ){
                        Text("Submit",fontSize = 30.sp)
                    }
                }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BecomeTutorPagePreview(){
    BecomeTutorPage(onSubmit = {})
}
