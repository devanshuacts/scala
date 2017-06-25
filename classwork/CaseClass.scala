package com.cdac.scala

object CaseClass {
  def main(args:Array[String]){
    var alice = new Person("Alice", 25)
    var bob = Person("Bob", 32)
    var charlie = Person("Charlie", 32)
    
    for(person <- List(alice, bob, charlie)){
      person match {
        case Person("Alice", 25) => println("Hi Alice!, how is the wonderland?")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println(
          "Age: "+ age + " year, name: " + name + "?"     
        )
      }
    }
  }

  case class Person(name: String, age: Int)
}