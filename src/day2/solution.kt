package day2

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var points = 0

        for (line in input) {
            val (opponent, me) = line.split(' ')
            when (me) {
                "X" -> points += 1
                "Y" -> points += 2
                "Z" -> points += 3
            }

            when (me) {
                "X" -> {
                    if (opponent == "A") points += 3
                    if (opponent == "B") points += 0
                    if (opponent == "C") points += 6
                }

                "Y" -> {
                    if (opponent == "A") points += 6
                    if (opponent == "B") points += 3
                    if (opponent == "C") points += 0
                }

                "Z" -> {
                    if (opponent == "A") points += 0
                    if (opponent == "B") points += 6
                    if (opponent == "C") points += 3
                }
            }
        }
        return points
    }

    fun part2(input: List<String>): Int {
        var points = 0

        for (line in input) {
            val (winCondition, me) = line.split(' ')

            when (me) {
                "X" -> points += 0
                "Y" -> points += 3
                "Z" -> points += 6
            }

            when (me) {
                "X" -> {
                    if (winCondition == "A") points += 3
                    if (winCondition == "B") points += 1
                    if (winCondition == "C") points += 2
                }
                "Y" -> {
                    if (winCondition == "A") points += 1
                    if (winCondition == "B") points += 2
                    if (winCondition == "C") points += 3
                }
                "Z" -> {
                    if (winCondition == "A") points += 2
                    if (winCondition == "B") points += 3
                    if (winCondition == "C") points += 1
                }
            }
        }
        return points
    }

//    val input = readInput("day2/input")      //SUBMITTING
    val input = readInput("day2/testInput")  //TESTING

    println("Part 1 result " + part1(input))
    println("Part 2 result " + part2(input))
}