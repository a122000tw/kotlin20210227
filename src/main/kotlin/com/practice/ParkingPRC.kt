package com.practice


import com.lab.toBinary
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.log2
import kotlin.math.pow


class ParkingPRC {
}



var num = 8 // 車位
var p = 0 // 停車狀態 (4號及2號車位有車)

val simpleTime: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
var parkPosition = arrayOfNulls<String>(num) // 停車位置

fun main() {
    while (true) {
        var parkDate: Date = Date()
        var moneyCount: String = simpleTime.format(parkDate)
        // 把每個取得的時間 放進停車位置內

        println("目前停車狀態: ${p.toBinary(num)}")
        print("請選擇(1)停車 (2)移車 (3)離開系統: ")
        var sever = readLine()!!.toInt()

        when(sever) {
            // 停車
            1 -> {
                print("請選擇車位(0~7): ")
                var n = readLine()!!.toInt()
                println("停入 $n 號車位 停放時間: $moneyCount")
                // 把 停車時間放入 停車位置的陣列中
                parkPosition [n] = moneyCount
                n = Math.pow(2.toDouble(), n.toDouble()).toInt()
                // 停車進去
                val isPass: Boolean = (p.and(n) == 0) // P & n
                if (isPass) {
                    p += n
                    println("最新車位狀態: ${p.toBinary(num)}")
                } else {
                    n = log2(n.toDouble()).toInt()
                    println("$n 號車位無法停車")
                }
                println()
            }
            // 移車
            2 -> {
                print("請選擇要移車車輛位置(0~7): ")
                var n = readLine()!!.toInt()
                // 檢查是否有車
                n = 2.toDouble().pow(n).toInt()
                val outcar: Boolean = (p.and(n) != 0)
                if(outcar) {
                    p -= n
                    println("移出 ${n-1} 號車輛")
                    println("最新車為狀態: ${p.toBinary(num)}")
                } else {
                    n = log2(n.toDouble()).toInt()
                    println("$n 號車位 沒有車輛")
                }
                println("$n 號車位 停放時間${parkPosition[n]}")



            }
            // 離開系統
            3 -> {
                println("離開系統")
                return
            } else -> println("輸入錯誤 請重新輸入: ")


        }
       }

}