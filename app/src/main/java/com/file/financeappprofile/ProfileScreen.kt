package com.file.financeappprofile

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.file.financeappprofile.ui.theme.CustomCyan
import com.file.financeappprofile.ui.theme.CustomDarkGray
import com.file.financeappprofile.ui.theme.CustomGreen
import com.file.financeappprofile.ui.theme.CustomLightGreen
import com.file.financeappprofile.ui.theme.CustomOrange

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        CustomDarkGray, CustomLightGreen
                    )
                )
            )
            .padding(25.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.more),
                    contentDescription = "More",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(
                        width = 1.dp,
                        color = CustomOrange,
                        shape = RoundedCornerShape(20f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.david),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(5.dp))
                )

            }
        }

        Column(

        ) {
            Text(
                text = "Hello Tapan",
                fontSize = 40.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.ubuntu))
            )

            Text(
                text = "Welcome Back",
                fontSize = 22.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.ubuntu))
            )
        }

        ProfileInfoCard(
            heading = "Sales",
            subHeading = "Total Sales Today",
            valueText = "$500",
            percentage = 55,
            color = CustomOrange,
            isIncreasing = true
        )

        ProfileInfoCard(
            heading = "Profit",
            subHeading = "Per day ratio",
            valueText = "$150",
            percentage = 30,
            color = CustomGreen,
            isIncreasing = false
        )

        ProfileInfoCard(
            heading = "Orders",
            subHeading = "Total Order Today",
            valueText = "1250",
            percentage = 80,
            color = CustomCyan,
            isIncreasing = true
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )

            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.wallet),
                    contentDescription = "Wallet",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )

            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.finance),
                    contentDescription = "Finance",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )

            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.user),
                    contentDescription = "User",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )

            }
        }
    }

}


@Composable
fun ProfileInfoCard(
    heading: String,
    subHeading: String,
    valueText: String,
    percentage: Int,
    color: Color,
    isIncreasing: Boolean
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.White.copy(0.1f))
            .padding(
                start = 30.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            ),

    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(7f),
                verticalArrangement = Arrangement.Center

            ) {



                Text(
                    text = heading,
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = Color.White
                )

                Text(
                    text = subHeading,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = Color.LightGray
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = valueText,
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = color
                )

            }

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(3f)

            ) {

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Arrow",
                    tint = color,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .rotate(if(isIncreasing) -45f else 45f)
                )
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "$percentage",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = color
                )

                Canvas(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(70.dp)
                ) {

                    drawArc(
                        color = color,
                        startAngle = -120f,
                        sweepAngle = 360 * percentage / 100f,
                        useCenter = false,
                        style = Stroke(
                            width = 10f,
                            cap = StrokeCap.Round
                        )
                    )
                }

            }

        }
    }

}




@Composable
@Preview(showBackground = true)
fun Preview() {
    ProfileScreen()
}


