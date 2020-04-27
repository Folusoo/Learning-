
class Person (val firstName: String ="Foluso", val lastName: String = "Ojo") {

    var nickName: String? = null
    set(value) {
        field = value
        println("the new nickname is $value")
    }
    get() {
        println("The returned value is $field")
        return field

            }
    fun printInfo (){
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickName) $lastName")
    }
}