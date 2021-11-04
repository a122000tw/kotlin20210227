package com.practice

import org.json.JSONObject
import java.net.URL

class Bus {
}

val jsonPath = "https://data.tycg.gov.tw/api/v1/rest/datastore/bf55b21a-2b7c-4ede-8048-f75420344aed?format=json"

fun main() {
    val url = URL(jsonPath)
    val jsonText = url.readText()
    val root = JSONObject(jsonText)
    val result = root.getJSONObject("result")
    val records = result.getJSONArray("records")
    



}