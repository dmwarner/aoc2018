


class ProblemOne {

    static void main(String[] args) {
        println 'hello'

        def input = new File(

            'C:\\Users\\Dave\\dev\\aoc2018\\day1',
            'input.txt').collect {it} as int[]

        println "input: ${input.size()}"
        println "sum: ${input.sum()}"
    }

}

