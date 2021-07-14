package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        var list = mutableListOf<Int>()

        for(i in 0..n){
            if( factorial(n)/m == factorial(i)*factorial(n-i)){
                list.add(i)
            }
        }

        if(list.isEmpty()) return null
        else return list.min()
    }

    fun factorial(number: Int): Long = if( number < 2) 1 else number * factorial(number - 1)



}
