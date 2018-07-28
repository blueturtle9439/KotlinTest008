fun main(args: Array<String>) {
    val car = Car()
    println(car.getBrandName())
}

class Car {

    fun getBrandName() : String {
        return "BMW22222"
    }

}
fun Car.getPrice() : Int {
    return 10000
}

