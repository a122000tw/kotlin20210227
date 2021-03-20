package com.進階控制.網路資源存取

import org.json.JSONObject
import java.net.URL


val jsonPath = "https://data.tycg.gov.tw/api/v1/rest/datastore/0daad6e6-0632-44f5-bd25-5e1de1e9146f?format=json&limit=200"

fun main() {
    val url = URL(jsonPath)
    val jsonText = url.readText()
    println(jsonText)
    // 將 Json 字串轉為 Json 物件, 以利日後分析 (結構化)
    val root = JSONObject(jsonText)
    val result = root.getJSONObject("result")
    val records = result.getJSONArray("records")
    for(jo in records) {
        jo as JSONObject
        if(jo.get("surplusSpace").toString().toInt() > 500) {
            println(jo)
        }

    }

}