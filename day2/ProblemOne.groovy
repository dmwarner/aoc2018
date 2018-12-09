

class ProblemOne {

    static final char[] ALPHA = 'abcdefghijklmnopqrstuvwxyz'.toCharArray()

    static void main(String[] args) {
        def input = loadInput(
            'C:\\Users\\Dave\\dev\\aoc2018\\day2'
        )

        assert input.size() == 250
        assert ALPHA.size() == 26

        def twoCount = 0
        def threeCount = 0


        input.each { sample ->
            def resultSet = []
            ALPHA.eachWithIndex { letter, index ->
                //println "checking ${ALPHA[index]} ${sample.count(ALPHA[index] as String)}"
                resultSet << sample.count(ALPHA[index] as String)
            }
            println "sample ($sample) result = $resultSet"
            if (resultSet.find { it == 2 }) {
                twoCount++
            }
            if (resultSet.find { it == 3}) {
                threeCount++
            }
        }

        println "2x = $twoCount   3x = $threeCount"

        println "checksum = ${twoCount * threeCount}"


    }

    static def loadInput(def location) {
        new File(
            location,
            'input.txt'
        ).collect {it}
    }

}

