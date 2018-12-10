

class ProblemTwo {

    static final char[] ALPHA = 'abcdefghijklmnopqrstuvwxyz'.toCharArray()

    static void main(String[] args) {
        def input = loadInput(
            'C:\\Users\\Dave\\dev\\aoc2018\\day2'
        )

        assert input.size() == 250

        //input = input[0..3]

        println "running with $input.size"

        def start = 0
        while (start < input.size()) {

            println "iteration starting with $start"
            for (int index = 1; index < input.size(); index++) {
                def nextPick = start + index
                println "$start  --  ${nextPick}"
                if (nextPick == input.size()) { break }

                println input[start]
                println input[nextPick]
                def result = compare(
                    input[start],
                    input[nextPick]
                )

                println result
                println result.replaceAll(' ', '')
                println "mismatched ${input[start].size() - result.replaceAll(' ', '').size()}"

                if (result.replaceAll(' ', '').size() == (input[start].size() - 1)) {
                    println "found at index $index"
                    println input[index+1]
                    println result
                    return
                }
                println '------------'

            }
            start++
        }
    }

    static def compare(def s1, def s2) {
        def c1 = s1.toCharArray()
        def c2 = s2.toCharArray()

        def common = [ ]
        for (def i = 0; i < c1.size(); i++) {

            //println "comparing $i ${c1[i]} to ${c2[i]}"

            if (c1[i] == c2[i]) {
                common << c1[i]
            } else {
                common << ' '
            }
        }

        common.flatten().join('')
    }

    static def loadInput(def location) {
        new File(
            location,
            'input.txt'
        ).collect {it}
    }

}

