import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("a:")
var a = scanner.nextDouble()
    println("+-*/")
    var c= scanner.next()
    println("b:")
var b = scanner.nextDouble()

Calculator(a,b,c)


}

fun Calculator(a:Double, b:Double, c: String) {
var res = 0
    when(c){
       "+"->{
            res= (a+b).toInt()
    println("$a+$b=$res")
        }
        "-"->{
            res= (a-b).toInt()
            println("$a-$b=$res")
        }
        "*"->{
            res= (a*b).toInt()
            println("$a*$b=$res")

        }
        "/"->{
            res= (a/b).toInt()
            println("$a/$b=$res")
        }









    }










}