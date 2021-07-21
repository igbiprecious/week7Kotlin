fun main(args: Array<String>) {
    reverseNumber(1234)

}

fun reverseNumber(num : Int): Array<Int> {
    var arr : Array<Int> = arrayOf()
    var nums : Int = num
    var reversed = 0
    while (nums != 0) {
        var digit = nums % 10
        reversed = reversed * 10 + digit
        nums /= 10
        arr.plus(3)


    }
    return arrayOf(reversed)
}