package com.yfbx.resulthelper

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yfbx.helper.request
import com.yfbx.helper.startForResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun testActivity() {
        val intent = Intent()
        startForResult(intent) { resultCode, data ->
            //TODO
        }
    }


    private fun testPermission() {
        request(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            if (it) {
                //TODO
            }
        }
    }
}
