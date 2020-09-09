object Singleton{

    init {
        println("Singleton class ")
    }
    var variableName = "I am samar"
    fun printVarName(){
        println(variableName)
    }

}

fun main() {
    Singleton.printVarName()
    Singleton.variableName = "Ahmed"

    var a = A()
}

class A {

    init {
        println("Class init method. Singleton variableName property : ${Singleton.variableName}")
        Singleton.printVarName()
    }
}