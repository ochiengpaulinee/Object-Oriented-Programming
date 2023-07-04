fun main(){
    var car1 = Car("Nissan","KDD 608W","Blue",12)
    car1.drive()
    car1.speed(20)
    println(car1.model)

    var victor = Human("victoria",10,34.7)
    victor.eat(2)
    println(victor.weight)
    victor.speak(" I am Pauline and I love coding")
    victor.birthday(1)
    println(victor.age)

    var person = people("Pauline","Ochieng","ochipakth@gmail.com","0711360954",217316)
    person.run(300.0)
    person.lock(7)
    println(person.password)
    person.shock()

    var gari = Vehicle("Anderson","BMW",2020,"Blue",6)
    gari.drives()
    var d = Cars("Furgeson","Toyota",2021,"Black",4,4,true)
    d.honk()


    var cycle = Motorcycle("Bajaj","10W",2013,"Red",2,false)
    cycle.wheelie()


}
class Car(var model:String,var plate:String,var color:String,var capacity:Int){
    fun drive(){
        println("vroooooom vroooooom")
    }
    fun speed(speeds:Int){
        println(speeds)
    }
}

class Human(var name:String,var age:Int,var weight:Double){
  //  eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
    //and increments the human’s weight by the weight of the food eaten
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
      weight+=foodWeight

    }
    //speak(speech: String) :Prints the string passed to it
    fun speak(speech:String){
        println(speech)
    }

    //birthday( ) :Increments the human’s age by 1
    fun birthday(bd:Int){
        age+=bd
    }
}

data class people(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int){
    fun run(distance:Double){
        println("I will run for $distance metres tomorrow")
    }
    fun lock(pw:Int){
        password+=pw
    }
    fun shock(){
        println("huh!")
    }
}


//Create a class called Vehicle that has the following properties:
//
//manufacturer: a string representing the name of the manufacturer
//model: a string representing the model name
//year: an integer representing the year the vehicle was made
//color: a string representing the color of the vehicle
//wheels: an integer representing the number of wheels on the vehicle
//The Vehicle class should also have a method called drive that prints the message "The vehicle is now driving."

 open class Vehicle(var manufacturer:String,var model:String,var year:Int,var color:String,var wheels:Int){
    fun drives(){
        println("the vehicle is now driving")
    }


     //Create a subclass of Vehicle called Cars that has the additional properties:
     //
     //seats: an integer representing the number of seats in the car
     //hasTrunk: a boolean representing whether or not the car has a trunk
     //The Car class should also have a method called honk that prints the message "Beep beep!"
}
class Cars(manufacturer: String,model: String,year: Int,color: String,wheels: Int,var seats:Int,var hasTrunk:Boolean):Vehicle(manufacturer,model,year,color,wheels){
    fun honk(){
        println("Beep beep")
    }
}

//Create a subclass of Vehicle called Motorcycle that has the additional properties:
//
//hasWindshield: a boolean representing whether or not the motorcycle has a windshield
//The Motorcycle class should also have a method called wheelie that prints the message "Wheeeeee!"

class Motorcycle(manufacturer: String,model: String,year: Int,color: String,wheels: Int,var hasWindshield:Boolean):Vehicle(manufacturer,model,year,color,wheels){
    fun wheelie(){
        println("Wheeeeeeeeeeeeeeeeeeeeeeeeeeee")
    }
}