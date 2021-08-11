package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

/*Hello*/

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var print = StringBuilder()
    companion object {
        var symbols:String=" "
        var left=""
        var right=""
        var result=" "
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btn1.setOnClickListener {
            appendingVal1()
        }
        binding.btn2.setOnClickListener {
            appendingVal2()
        }
        binding.btn3.setOnClickListener {
            appendingVal3()
        }
        binding.btn4.setOnClickListener {
            appendingVal4()
        }
        binding.btn5.setOnClickListener {
            appendingVal5()
        }
        binding.btn6.setOnClickListener {
            appendingVal6()
        }
        binding.btn7.setOnClickListener {
            appendingVal7()
        }
        binding.btn8.setOnClickListener {
            appendingVal8()
        }
        binding.btn9.setOnClickListener {
            appendingVal9()
        }
        binding.btn10.setOnClickListener {
            appendingVal10()
        }
        binding.btn11.setOnClickListener {
            appendingVal11()
        }
        binding.btn12.setOnClickListener {
            appendingVal12()
        }
        binding.btn13.setOnClickListener {
            appendingVal13()
        }
        binding.btn14.setOnClickListener {
            appendingVal14()
        }
        binding.btn15.setOnClickListener {
            appendingVal15()
        }
        binding.btn16.setOnClickListener {
            appendingVal16()
        }
        binding.btn17.setOnClickListener {
            appendingVal17()
        }
        binding.btn18.setOnClickListener {
            appendingVal18()
        }


    }
    private fun appendingVal1(){
           print.append(binding.btn1.text)
        binding.textView.text=print.toString()
if(symbols==" "){
    left=left+binding.btn1.text
}
        else{
            right=right+binding.btn1.text
        }
    }
    private fun appendingVal2(){
        print.append(binding.btn2.text)
        binding.textView.text=print.toString()
        if(symbols==" "){
            left=left+binding.btn2.text
        }
        else{
            right=right+binding.btn2.text
        }
    }

    private fun appendingVal3(){
        print.append(binding.btn3.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn3.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn3.text
        }
    }

    private fun appendingVal4(){
        print.append(binding.btn4.text)
        binding.textView.text=print.toString()

        if(symbols!=" ") {
            left = when (symbols) {
                "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                else -> " "
            }
            right=""
            print.clear()
            print.append(left)
            print.append(binding.btn4.text.toString())
            binding.textView.text=print.toString()
            symbols=binding.btn4.text.toString()
        }


        symbols=binding.btn4.text.toString()
    }

    private fun appendingVal5(){
        print.append(binding.btn5.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn5.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn5.text
        }
    }

private fun appendingVal6(){
        print.append(binding.btn6.text)
        binding.textView.text=print.toString()
    if(MainActivity.symbols ==" "){
        MainActivity.left = MainActivity.left +binding.btn6.text
    }
    else{
        MainActivity.right = MainActivity.right +binding.btn6.text
    }
}

    private fun appendingVal7(){
        print.append(binding.btn7.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn7.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn7.text
        }
    }
    private fun appendingVal8(){
        print.append(binding.btn8.text)
        binding.textView.text=print.toString()
        if(symbols!=" ") {
            left = when (symbols) {
                "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                else -> " "
            }
            right=""
            print.clear()
            print.append(left)
            print.append(binding.btn8.text.toString())
            binding.textView.text=print.toString()
            symbols=binding.btn8.text.toString()
        }

        symbols=binding.btn8.text.toString()
    }

    private fun appendingVal9(){
        print.append(binding.btn9.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn9.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn9.text
        }
    }
    private fun appendingVal10(){
        print.append(binding.btn10.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn10.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn10.text
        }
    }
    private fun appendingVal11(){
        print.append(binding.btn11.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn11.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn11.text
        }
    }
    private fun appendingVal12(){
        print.append(binding.btn12.text)
        binding.textView.text=print.toString()
        if(symbols!=" ") {
            left = when (symbols) {
                "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                else -> " "
            }
            right=""
            print.clear()
            print.append(left)
            print.append(binding.btn12.text.toString())
            binding.textView.text=print.toString()
            symbols=binding.btn12.text.toString()
        }

        symbols=binding.btn12.text.toString()
    }
    private fun appendingVal17(){
        binding.textView.text=binding.textView.text.dropLast(1)
        print.clear()
        print.append(binding.textView.text)
    }
    private fun appendingVal14(){
        print.append(binding.btn14.text)
        binding.textView.text=print.toString()
        if(MainActivity.symbols ==" "){
            MainActivity.left = MainActivity.left +binding.btn14.text
        }
        else{
            MainActivity.right = MainActivity.right +binding.btn14.text
        }
    }
    private fun appendingVal15(){
        binding.textView.text=""
        binding.textView.text=when(symbols){
            "+" -> ((left.toFloat())+(right.toFloat())).toString()
            "-" -> ((left.toFloat())-(right.toFloat())).toString()
                "*" -> ((left.toFloat())*(right.toFloat())).toString()
                "/" -> ((left.toFloat())/(right.toFloat())).toString()
            else -> " "
        }
        print.clear()
        print.append(binding.textView.text)

        symbols=" "
        left=" "
        right=" "
    }
    private fun appendingVal16(){
        print.append(binding.btn16.text)
        binding.textView.text=print.toString()
        if(symbols!=" ") {
            left = when (symbols) {
                "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                else -> " "
            }
            right=""
            print.clear()
            print.append(left)
            print.append(binding.btn16.text.toString())
            binding.textView.text=print.toString()

        }

        symbols=binding.btn16.text.toString()
    }
    private fun appendingVal18() {
        binding.textView.text = ""
        print.clear()
    }

    private fun appendingVal13() {

        print.append(binding.btn13.text)
        binding.textView.text = print.toString()
        if (MainActivity.symbols == " ") {
            MainActivity.left = MainActivity.left + binding.btn13.text
        } else {
            MainActivity.right = MainActivity.right + binding.btn13.text
        }
    }
}