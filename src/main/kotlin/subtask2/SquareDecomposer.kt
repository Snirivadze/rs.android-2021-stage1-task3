package subtask2

import kotlin.collections.ArrayList
import kotlin.math.sqrt

class SquareDecomposer {

        fun decomposeNumber(number: Int): Array<Int>? {
            return if (number < 3) null
            else combination(number * number, number - 1)?.toTypedArray()
        }

        private fun combination(number: Int, position: Int): ArrayList<Int>? {
            for (i in position downTo 1) {
                val ost = number - i * i
                if (ost == 0) return arrayListOf(i)
                if (ost < 0) return null
                var root = sqrt(ost.toDouble()).toInt()
                if (root >= i) root = i - 1
                val result = combination(ost, root)
                if (result != null) {
                    result.add(i)
                    return result
                }
            }
            return null
        }

    }