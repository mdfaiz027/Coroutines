package com.example.practicekt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.coroutines.*
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext

private val TAG : String = "KOTLIN FUN"
    lateinit var counterText : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        counterText = findViewById(R.id.TVText)
//        Log.d(TAG, "${Thread.currentThread().name}")

//        CoroutineScope(Dispatchers.IO).launch {
//            printFollowers()
//        }

        GlobalScope.launch() {
            //execute()
            withContext()
        }

//        CoroutineScope(Dispatchers.IO).launch {
//            task1()
//        }
//
//        CoroutineScope(Dispatchers.IO).launch {
//            task2()
//        }
//
//    }
//    suspend fun task1 (){
//        Log.d("TASK 1", "task1: Starting Point")
//        delay(1000)
//        Log.d("TASK 1", "task1: Ending Point")
//    }
//
//    suspend fun task2 (){
//        Log.d("TASK 2", "task2: Starting Point")
//        delay(1000)
//        Log.d("TASK 2", "task2: Ending Point")
//    }
//
//    suspend fun task3 (){
//        Log.d("TASK 3", "task3: Starting Point")
//        delay(1000)
//        Log.d("TASK 3", "task3: Ending Point")
//    }

//    fun updateCounter(view: View){
//        Log.d(TAG, "${Thread.currentThread().name}")
//        counterText.text = "${counterText.text.toString().toInt() + 1}"
//    }

//    fun excuteLongRunningTask(){
//        for(i in 1..100000){
//            Log.d(TAG, "$i")
//        }
//    }

//    fun doAction(view: View){
//        CoroutineScope(Dispatchers.IO).launch{
//            Log.d(TAG, "1 ${Thread.currentThread().name}")
//        }
//        MainScope().launch(Dispatchers.Default){
//            Log.d(TAG, "3 ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.Main){
//            Log.d(TAG, "2 ${Thread.currentThread().name}")
//        }
}

    private suspend fun withContext() {
        Log.d(TAG, "Before")

        withContext(Dispatchers.IO){
            delay(1000)
            Log.d(TAG, "Inside")
        }
        Log.d(TAG, "After")
    }

//    private suspend fun execute() {
//        val parentJob = CoroutineScope(Dispatchers.IO).launch {
//            for(i in 1..10000){
//                if(isActive){
//                    executeLongRunningTask()
//                    Log.d(TAG, i.toString())
//                }
//            }
//        }
//        delay(100)
//        Log.d(TAG, "Cancelling the job")
//        parentJob.cancel()
//        parentJob.join()
//        Log.d(TAG, "Parent completed")
//    }

//    private fun executeLongRunningTask() {
//        for(i in 1..1000000){
//
//        }
//    }

//    private suspend fun printFollowers() {
//        CoroutineScope(Dispatchers.IO).launch {
//            val fb = async { getFbFollowers() }
//            val insta = async { getInstaFollowers() }
//            Log.d(TAG, "Fb: - ${fb.await()}, Insta: - ${insta.await()}")
//        }
//    }
//    private suspend fun getFbFollowers() : Int {
//        delay(1000)
//        return 54
//    }
//
//    private suspend fun getInstaFollowers() : Int {
//        delay(1000)
//        return 115
//    }
    }

