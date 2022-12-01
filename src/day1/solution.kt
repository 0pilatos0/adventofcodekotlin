fun main(){
    fun part1(input:List<String>): Int{
        var mostCalories = 0
        var currentCalories = 0

        for (calorie in input){
            try{
                currentCalories += calorie.toInt()
                if (currentCalories > mostCalories){
                    mostCalories = currentCalories
                }
            } catch (e: NumberFormatException){
                currentCalories = 0
            }
        }
        return mostCalories
    }

    fun part2(input: List<String>) : Int{
        var mostCalories = arrayOf(0, 0, 0)
        var currentCalories = 0

        for (calorie in input + ""){
            try{
                currentCalories += calorie.toInt()
            } catch (e: NumberFormatException){
                var lowest = mostCalories.indexOf(mostCalories.min())
                if (currentCalories > mostCalories[lowest]) {
                    mostCalories[lowest] = currentCalories
                }
                currentCalories = 0
            }
        }

        var sum = 0
        for (i in mostCalories){
            sum += i
        }
        return sum

    }

//    val input = readInput("day1/input")      //SUBMITTING
    val input = readInput("day1/testInput")  //TESTING

    println("Part 1 result " + part1(input))
    println("Part 2 result " + part2(input))
}