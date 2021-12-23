package dev.ivanqueiroz.gsrestmongodb.model

data class Person(
    var id: String? = "",
    var firstName: String = "",
    var lastName: String = ""
) {
    constructor() : this(firstName = "")
}


