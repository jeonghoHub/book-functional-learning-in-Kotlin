data class MutablePerson(var name: String, var age: Int)

data class ImMutablePerson(val name: String, val age: Int)

fun addAge(person: MutablePerson, num: Int) {
    person.age += num;
}

fun newAddAge(person: ImMutablePerson, num: Int): ImMutablePerson {
    return ImMutablePerson(person.name, person.age + num)
}