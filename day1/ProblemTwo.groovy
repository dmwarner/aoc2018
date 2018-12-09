


class ProblemTwo {

    static void main(String[] args) {

        def input = new File(
            'C:\\Users\\Dave\\dev\\aoc2018\\day1',
            'input.txt'
        ).collect {it} as int[]

        println "input: ${input.size()}"

        def subTotal = 0
        List subTotals = []

        def flag = true
        def iteration = 0

        while (flag) {

            input.each {
                subTotal = subTotal + it
                if (subTotals.contains(subTotal)) {
                    println "found: $subTotal"
                    flag = false
                    return
                }
                subTotals << subTotal
            }

            println "iteration: $iteration subtotals size: ${subTotals.size()}"
            iteration++
        }
    }

}

