package baekjoon.DrunkenSangBum

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()

        val answer = IntArray(n)
        for (i in 0 until n) {
            answer[i] = sc.nextInt()
        }

        for (i in 0 until n) {
            println(getAnswer(answer[i]))
        }

    }

    fun getAnswer(n: Int): Int {
        var k = 0
        val room = IntArray(n)
        for (i in 0 until n) {
            for (j in 1 until n) {
                if (i % j == 0)
                    room[i] = 1 - room[i]
            }
        }
        for (i in 0 until n) {
            if (room[i] == 1)
                k++
        }
        return k
    }
}
