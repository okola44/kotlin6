fun main() {
    var gari = Car("subaru", "legacy", "white", 30)
    println(gari.capacity)
    gari.carry(50)
    gari.identity()
    println(gari.calculateParkingFees(3))

    var motor=Bus("Benz","rav4","blue",20)
    println(motor.calculateParkingFees(3))
    println(motor.calculateParkingFees(5))
   println( motor.MaxTripFare(1000.0))


}
open class Van(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var excess = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("over capacity by $excess passengers")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }

}
        class Car(make: String, model: String, color: String, capacity: Int) : Van(make, model, color, capacity){


        }

        class Bus(make: String, model: String, color: String, capacity: Int) : Van(make, model, color, capacity) {
            fun MaxTripFare(fare: Double): Double {
                return fare*capacity

            }

            override fun calculateParkingFees(hours: Int): Int {
                return hours*capacity





            }




    }