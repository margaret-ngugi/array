import kotlin.math.sqrt

fun main(){
    var friends = arrayOf("rita","BEY","ALLO", "PREETY","humprey","kitty")
    println(friends.contentToString())
    println(friends[3])
    val numbers= arrayOf(32,53,34,76)
    var uganda = arrayOf("uganda",4564738,45,"kampala",true)
println(friends[3])
    println(friends.get(2))
    println(uganda.get(1))
    println(numbers.contentToString())
    friends.set(0,"cain")
    println(friends.contentToString())
    friends.set(3,"diana")
    println( friends.contentToString())
    var friends2023= friends.plus("tabby")
    val morefriends = arrayOf("ghana","katana","afro")
    friends2023 = friends.plus(morefriends)
    println(friends2023.contentToString())
    println(friends.indexOf("ALLO"))
    val friends2 =friends.plus(arrayOf("Bernad","JANE"))
    println(friends2.indexOf("JANE"))
    var digits= arrayOf(34,45,211,32,65,8776,55534,77766)
    println(friends.count())
    println(digits.count())
    println(digits.size)
println(friends.max())
    println(digits.sum())
    println(digits.max())
    println(digits.min())
    friends.forEach { friend -> println(friend.decapitalize()) }
    println(friends)
//    numbers.forEach { num-> println(sqrt(num*num)) }

}






