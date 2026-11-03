// Task 16.2: concrete Car class, inheriting from Vehicle
// copied from guide and edited
class Car(fuel: Int) : Vehicle(fuel) {
    override fun drive() {
        println("Vrooom!")
    }
}