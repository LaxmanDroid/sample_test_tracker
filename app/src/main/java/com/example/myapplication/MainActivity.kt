package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                Log.d("TAG","Testing Instant apps")
        }

        fun sampleFunction(a: Array<IntArray>, b: Array<IntArray>): Array<IntArray>? {
                val n = a[0].size
                val m = a.size
                val p = b[0].size
                val result = Array(m) { IntArray(p) }
                for (i in 0 until m) {
                        for (j in 0 until p) {
                                for (k in 0 until n) {
                                        result[i][j] += a[i][k] * b[k][j]
                                }
                        }
                }
                return result
        }
}