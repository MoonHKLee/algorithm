package baekjoon.Fibonacci

import java.sql.DriverManager.println
import java.util.Scanner

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //입력할 갯수 입력
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()

        //dp 배열 생성
        val fibo0 = IntArray(n + 1)
        val fibo1 = IntArray(n + 1)

        fibo0[0] = 1
        fibo0[1] = 0
        fibo1[0] = 0
        fibo1[1] = 1
        for (i in 2..n) {
            fibo0[i] = fibo0[i - 1] + fibo0[i - 2]
            fibo1[i] = fibo1[i - 1] + fibo1[i - 2]
        }

        //testCase 배열 생성
        val test = IntArray(n)

        //testCase 배열 입력
        for (i in 0 until n) {
            test[i] = sc.nextInt()
        }



        for (i in 0 until n) {
            println(fibo0[test[i]].toString() + " " + fibo1[test[i]])
        }


    }
}

