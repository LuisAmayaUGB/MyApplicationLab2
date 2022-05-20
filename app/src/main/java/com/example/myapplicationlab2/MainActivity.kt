package com.example.myapplicationlab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mapa.setOnClickListener {

            val intento1 = Intent(this, MapsActivity::class.java)
            startActivity(intento1)
        }


        setupViewPager2()


    }




    private fun setupViewPager2() {
        val list: MutableList<String> = ArrayList()
        list.add("This is your First Screen")
        list.add("This is your Second Screen")
        list.add("This is your Third Screen")
        list.add("This is your Fourth Screen")
        list.add("La Quinta Pantalla")

        val colorList: MutableList<String> = ArrayList()
        colorList.add("#00ff00")
        colorList.add("#ff0000")
        colorList.add("#0000ff")
        colorList.add("#f0f0f0")
        colorList.add("#fAffff")

        // Set adapter to viewPager.
        viewPager.adapter = ViewPagerAdapter(this, list, colorList)
    }

}