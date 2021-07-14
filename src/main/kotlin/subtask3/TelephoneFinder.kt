package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.toInt()<0) return null

        val neighbours = hashMapOf(
            '0' to arrayListOf('8'),
            '1' to arrayListOf('2', '4'),
            '2' to arrayListOf('1', '3', '5'),
            '3' to arrayListOf('2', '6'),
            '4' to arrayListOf('1', '5', '7'),
            '5' to arrayListOf('2', '4', '6', '8'),
            '6' to arrayListOf('3', '5', '9'),
            '7' to arrayListOf('4', '8'),
            '8' to arrayListOf('0', '5', '7', '9'),
            '9' to arrayListOf('6', '8')
        )

        val allNumbers = mutableListOf<String>()
        number.forEach {
            var elem = it
            neighbours[elem]?.forEach {
                allNumbers.add(number.substring(0,number.indexOf(elem)) + it + number.substring(number.indexOf(elem)+1))
            }
        }
        return allNumbers.toTypedArray()
    }
}
