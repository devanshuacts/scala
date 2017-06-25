package com.cdac.scala

trait Friend{
  val name: String
  def listen() = println("I am " + name + " Listening")
}

class Human(val name: String) extends Friend
class Animal(val name: String)
class Dog(override val name: String) extends Animal(name) with Friend
class Cat(override val name: String) extends Animal(name)

object trait2 {
  def seekHelp(friend:Friend) = {
      friend.listen()
  }
  
  def main(args: Array[String]){
    
    val sameer = new Human("Sameer")
    sameer.listen()
    seekHelp(sameer)
    
    val buddy = new Dog("Buddy")
    buddy.listen()
    
    val tom = new Cat("Tom") with Friend
    tom.listen()
  }
}