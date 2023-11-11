package com.igs.threefixesValidator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.igs.validator.ValidatorClient
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val validatorClient = ValidatorClient()
        val jsonObject = JSONObject()
        jsonObject.put("cvc", "Jack")
        jsonObject.put("exp_month", "3540")
        jsonObject.put("exp_year", "23")
        jsonObject.put("name", "23")
        jsonObject.put("number", "23")

        validatorClient.validator(jsonObject)

    }
}