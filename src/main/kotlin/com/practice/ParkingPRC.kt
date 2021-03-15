package com.practice


import com.lab.toBinary
import kotlin.math.log2
import kotlin.math.pow


class ParkingPRC {
}



var num = 8 // 車位
var p = 0 // 停車狀態 (4號及2號車位有車)
fun main() {
    while (true) {
        println("目前停車狀態: ${p.toBinary(com.lab.num)}")
        print("請選擇停車(1)或牽車(2): ")
        if(readLine()!!.toInt() == 1) {
//            print("請輸入姓名: ")
//            var parker = readLine().toString()
            print("請選擇車位(0~7): ")
            var n = readLine()!!.toInt()
            n = 2.toDouble().pow(n).toInt()
            val isPass: Boolean = (p.and(n) == 0) // P & n
            if (isPass) {
                p += n
                println("最新車位狀態: ${p.toBinary(com.lab.num)}")
            } else {
                n = log2(n.toDouble()).toInt()
                println("$n 號車位無法停車")
            }
        } else if(readLine()!!.toInt() == 2) {

//            print("請輸入姓名: ")
//            var parker = readLine().toString()
            print("請選擇車位(0~7): ")
            var n = readLine()!!.toInt()
            n = 2.toDouble().pow(n).toInt()
            val isPass: Boolean = (p.and(n) == 0) // P & n
            if (isPass) {
                p -= n
                println("最新車位狀態: ${p.toBinary(com.lab.num)}")
            } else {
                n = log2(n.toDouble()).toInt()
                println("$n 號車位無車可移動")
            }
        }

    }

}