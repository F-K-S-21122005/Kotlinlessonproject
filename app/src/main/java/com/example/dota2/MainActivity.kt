package com.example.dota2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.Dota2Theme
import androidx.compose.foundation.layout.Row as Row

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dota2Theme(dynamicColor = true) {

            }
        }
    }
}

@Composable
fun ToolBar(items:List<Any>){
    Surface(modifier = Modifier.fillMaxSize())
    {
        Column(modifier = Modifier.fillMaxSize())
        {

            Row(modifier = Modifier.run {
                fillMaxWidth()
                fillMaxHeight()
                background(color = Color.Blue)
            })
            {
                Button(onClick = { /*TODO*/ }) {
                    Text("Menu")

                }
                Spacer(modifier = Modifier.width(235.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text("Back")

                }
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Yellow)
            ) {
                items(items.size) { i ->
                    SimpleTextItem(items[i].toString())
                }
            }
        }
    }
    
}
@Composable
fun Space(){
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp))
}
@Composable
fun MainList(items:List<Any>){
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Yellow)
    ){
        items(items.size) {i ->
            SimpleTextItem(items[i].toString())
        }
    }
}

@Composable
fun SimpleTextItem(text:String){
    val count = 0
    Text(text =text,
        modifier = Modifier.padding(8.dp))
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Dota2Theme {
        val lst = listOf("1", "2", "3", "4", "5", "6", "7", "8")
        ToolBar(lst)
        Space()
        //MainList(lst)
    }
}