import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    var result: Any

    val nextInt = Random().nextInt(3);

    if (nextInt==1){
        result = BigDecimal(23)
    } else{
        result = "Hello! Whatzz uppp!"
    }

    println("The result is $result")

    if (result is BigDecimal){
        result = result.add(BigDecimal(34))
    } else{
        val temp = result as String;
        result = temp.toUpperCase()
    }
    println("The result is $result")
}