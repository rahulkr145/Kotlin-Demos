@file:JvmName("First")

import java.util.*

//Teluso Kotlin tutorial
fun main(args: Array<String>) {
    //Hello World
    println("Hello World")
    var rahul = Rahul()
    val kumar = Rahul()
    rahul.name = "Name is Rahul"
    kumar.name = "Rahul Kumar"
    println("Here ${rahul.name} ${rahul.lastName}")
    rahul = Rahul()
    println("Here ${rahul.name} ${rahul.lastName}")
    println("Here ${kumar.name} ${kumar.lastName}")
    var alien = Alien()
    alien.name = "Alien"
    println(alien.name)

    //Sum of 2 numbers
    var num1: Int = 5
    var num2: Int = 7
    println("Sum of $num1 and $num2 is ${num1 + num2}")

    //If else
    var num1: Int = 5
    val num2: Int = 7
    var greater: String
    greater = if(num1 > num2)
        num1.toString()
    else if(num2 > num1)
        num2.toString()
    else
        "equal"
    println("Greater is : $greater")

    //String Comparison
    var str1: String = "Rahul"
    var str2: String = "rahul"
    var str3: String = "rahul"
    val same = str3 == str2;
    val notSame = str1 == str2;
    println(same)
    print(notSame)

    //When expression (similar to switch)
    val num: Int = 5
    var number = when(num){
        1 -> "one"
        5 -> "five"
        7 -> "seven"
        else -> "Give proper input"
    }
    print(number)

    //Loops & Range (1:15:00)
    var nums = 0..15  //range
    val nums2 = 15 downTo 0
    var nums3 = 0 until 15
    var alphabets = 'a'..'z'
    for(num in nums step 3){
        println(num)
    }
    for(num in nums2 step 3){
        println(num)
    }
    for(num in nums3 step 3){
        println(num)
    }
    for(num in nums2.reversed() step 3){
        println(num)
    }
    println(alphabets.count())

    //List & Map
    var nums = listOf<Int>(1,2,3,4,5)
    for ((i,e) in nums.withIndex()){
        println(" $i : $e")
    }

    var users = TreeMap<String, Int>()
    users["Rahul"] = 24
    users["Kumar"] = 25
    for((name,age) in users){
        println(" $name : $age")
    }

    //Function Expression
    var sum = add(5,7)
    var sum2 = add2(5,7)
    println("$sum & $sum2")
    println("max is ${max(5,7)}")

    //Default & Named Parameter(1:51:00)
    calcAmount(amt = 50)

    //String to Integer
    var str = "5"
    var num: Int = str.toInt()
    println(num)

    //Try Expression
    // Same as Java + Used as Expression

    //Extension Function
    var rahul = Rahul()
    rahul.name = "Rahul"
    rahul.show()

    var telusko = Rahul()
    telusko.name = "Telusko"
    telusko.show()

    var alien = rahul.plus(telusko)
    alien.show()

    //Infix and Operator Overloading
    var alien = rahul plus telusko
    //add 'infix' as prefix to function and it should have only one input parameter
    var alien = rahul + telusko
    //add 'operator' as prefix to function to override the operator

    //Tail Recursion
    //'tailrec' keyword is used to optimize the stack overflow

    //Constructors
    var human = Human(25,"Rahul")
    human.think()

    //Locale
    var locale: Locale = Locale.getDefault()
    println("Locale English ${locale}")

    //Inheritance
    var rahul = Alien(25)
    rahul.think()

    //Abstract Class
    var rahul = Alien()
    rahul.talk()
    rahul.think()

    //Interfaces
    var c = C()
    c.show()
    c.display()
    c.abc()

    //Data Class
    var lap1 = Laptop("HP", 50000)
    var lap2 = Laptop("Dell", 50000)
    println(lap1)
    var lap3 = lap1.copy()
    var lap4 = lap3.copy(price = 60000)
    println(lap3.brand)
    println(lap4)
    println(lap1.equals(lap2))
    println(lap3 == lap1)

    //Object Keyword
    BookShelf.books.add(Book("Java", 50))
    BookShelf.books.add(Book("Angular", 70))
    BookShelf.books.add(Book("Kotlin", 85))
    BookShelf.showBooks()

    //Anonymous Inner Class (object keyword)
    var programmer : Human = object : Human {
        override fun think() {
            println("Think Virtually")
        }
    }
    programmer.think()

    //Companion Object
    A.show() //Used as static

    //Companion Object Factory Pattern(3:59:00)
    var a = A.create()
    a.show()

    //Backtick As Escape Character
    System.`in`

    //User Input in Kotlin
    var num1 = readLine() //use BufferedReader
    println(num1)

    //Array
    var nums = intArrayOf(1,3,5)
    nums[1] = 4
    println(nums.get(1))
    nums.set(1, 2)
    for(num in nums)
        println(num)

    var nums = DoubleArray(4)
    nums.set(1, 2.0)
    for(num in nums)
        println(num)
    var str = arrayOfNulls<String>(5)

    //List(4:22:00)
    var values = listOf<Int>(10,11,20) //listOf is immutable
    for(value in values){
        println(value)
    }
    var values2 = mutableListOf("Rahul", "Alien")
    values2.add(1,"Arif")
    for(value in values2){
        println(value)
    }

    //Higher Order function
    var values = listOf(1,2,3,4,5,6,7,8,9)
    var con = Consumer<Int> { p0 -> println(p0) }
//    var con = object : Consumer<Int>{
//        override fun accept(p0: Int) {
//            println(p0)
//        }
//    }
    values.forEach(con)
    values.forEach({println(it)})
    values.forEach(::println)

    //Filter and Map
    var values = listOf(0,1,2,3,4,5,6,7,8,9,10)
    var evens = values.filter { it % 2 == 0 }
    var doublevalues = evens.map { it * 2 }
    var result = values.filter { it % 2 == 0 }.map { it * 2 }
    evens.forEach(::print)
    doublevalues.forEach(::print)
    result.forEach(::print)
}

//Function Expression
fun add(a: Int, b: Int): Int{
    return a+b
}

//Above function in one line
fun add2(a: Int, b: Int): Int = a+b

fun max(a: Int, b: Int): Int = if (a>b) a else b


//Default & Named Parameter
fun calcAmount(amt: Int, interest: Double = 0.04) : Double {
    return amt + amt*interest
}

//Extension Function
fun Rahul.plus(human: Rahul) : Rahul{
    var newHuman = Rahul()
    newHuman.name = this.name + " " + human.name
    return newHuman
}

//Infix Function
operator infix fun Rahul.plus(human: Rahul) : Rahul{
    var newHuman = Rahul()
    newHuman.name = this.name + " " + human.name
    return newHuman
}


//Constructor
//Primary Constructor -> constructor keyword is optional
class Human constructor(var naam: String){
    var name: String = naam
    var age: Int = 0
    //Secondary Constructor
    constructor(age: Int, name: String): this(name){
        this.age = age
    }
    fun think(){
        println("Kotlin is Awesome.. $name")
    }
}

//Inheritance
open class Human(age: Int){
    init {
        println("In Human $age")
    }
    open fun think(){
        println("Real Thinking")
    }
}
class Alien(age: Int): Human(age) {
    init {
        println("In Alien")
    }
    override fun think(){
        println("Virtual Thinking")
    }
}

//Abstract Class
abstract class Human(){
    abstract fun think()
    fun talk(){
        println("Talking")
    }
}
class Doctor: Human(){
    override fun think() {
        println("Critical Thinking")
    }
}
class Alien(): Human() {
    override fun think(){
        println("Virtual Thinking")
    }
}

//Interfaces
interface A{
    fun show()
    fun display(){
        println("In A display")
    }
    fun abc(){
        println("In A abc")
    }
}
interface B{
    fun display()
    fun abc(){
        println("In B abc")
    }
}
class C: A,B{
    override fun abc() {
        super<A>.abc()
        super<B>.abc()
        println("In C abc")
    }

    override fun display() {
        super.display()
        println("In C display")
    }

    override fun show() {
        println("In C show")
    }

}

//Data Class (1. toString(); 2. equals & hashCode method; 3. copy())
data class Laptop(val brand: String, val price: Int){
    fun show(){
        println("Awesome Machine")
    }
}

//Object Keyword
data class Book(var name: String, var price: Int)
//Singleton Design pattern
object BookShelf{
    var books = arrayListOf<Book>()
    fun showBooks(){
        for (book in books){
            println(book)
        }
    }
}

//Anonymous Inner Class
interface Human{
    fun think()
}

//Companion Object
class A{
    companion object{
        @JvmStatic //To use as static in Java code
        fun show(){
            println("Hello Companion")
        }
    }
}

//Companion Object Factory Pattern
class A{
    //Factory Method
    companion object{
        fun create() : A = A()
    }
    fun show(){
        println("In show")
    }
}


/*Notes:*/
//Classes and methods are by default 'final' in Kotlin
//static keyword -> companion object
//Higher Order function!
//Filter and Map!