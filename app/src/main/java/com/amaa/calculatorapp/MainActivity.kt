package com.amaa.calculatorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amaa.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.Plusbutton.setOnClickListener {
            adding()
        }

        binding.Minusbutton2.setOnClickListener {
            minus()
        }

        binding.devidebutton3.setOnClickListener {
            divide()
        }

    }

     private fun adding() {

        val stringInTextField1 = binding.num1text.text.toString()
        val num1 = stringInTextField1.toDouble()
        val stringInTextField2 = binding.num2text.text.toString()
        val num2 = stringInTextField2.toDouble()

         var total = num1 + num2

         var stringtotal = total.toString()

         binding.textView.text = getString(R.string.total,stringtotal )



    }


    private fun divide() {



        val stringInTextField1 = binding.num1text.text.toString()
        val num1 = stringInTextField1.toDouble()
        val stringInTextField2 = binding.num2text.text.toString()
        val num2 = stringInTextField2.toDouble()

        var total = num1 / num2
        var stringtotal = total.toString()

        binding.textView.text = getString(R.string.total,stringtotal )





    }

    private fun minus() {


        val stringInTextField1 = binding.num1text.text.toString()
        val num1 = stringInTextField1.toDouble()
        val stringInTextField2 = binding.num2text.text.toString()
        val num2 = stringInTextField2.toDouble()

        var total = num1 - num2
        var stringtotal = total.toString()

        binding.textView.text = getString(R.string.total,stringtotal )



    }


}