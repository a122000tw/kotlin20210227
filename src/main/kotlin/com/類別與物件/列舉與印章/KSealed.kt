package com.類別與物件.列舉與印章

/*
* enum 在意的是數據資料
* sealed(印章/密封) 在意的是類型
 */

sealed class Employee {
    abstract fun job()
    class Developer(): Employee() {
        override fun job() {
            println("寫程式")
        }
    }
    class Manager(): Employee() {
        override fun job() {
            println("管人事")
        }
    }
}
// Employee 類別透過 sealed 告知 Employee 物件的建立只能透過 Developer 與 Manager 來建立
fun main() {
    val emp1 = Employee.Developer()
    emp1.job()
    val emp2 = Employee.Manager()
    emp2.job()
    val emp3 = Salses() // 不在 Employee 中
    emp3.job()
}


class Salses(): Employee() {
    override fun job() {
        println("搶人事")
    }
}