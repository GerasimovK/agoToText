package ru.cifrium
fun main (){
    var seconds = 310000
    var finalText = timeToText(seconds)

    println ("Пользователь был в сети $finalText")
}
fun timeToText(seconds: Int): String{
    var agoToText: String
    when(seconds){
         in 0..60 -> agoToText = "только что"
         in 61..59*60+59 -> agoToText = minToText(seconds)
         in 60*60..24*60*60 -> agoToText = hoursToText(seconds)
         in 24*60*60+1..48*60*60 -> agoToText = "сегодня"
         in 48*60*60+1..72*60*60 -> agoToText = "вчера"
        else -> agoToText = "давно"
    }
    return agoToText
}
fun minToText(seconds: Int): String {
    var minutes = seconds / 60
    var lastnumber1: Int = minutes % 10
    var lastnumber2: Int = minutes % 100
    var nameMinuta = "$minutes минут назад"
    if (lastnumber1 == 1 && lastnumber2 != 11) {
        nameMinuta = "$minutes минуту назад"
    } else if (lastnumber1 == 2 && lastnumber2 != 12) {
        nameMinuta = "$minutes минуты назад"
    }
    return nameMinuta
}

    fun hoursToText(seconds: Int): String {
        var hours = seconds / 3600
        var lastnumber1: Int = hours % 10
        var lastnumber2: Int = hours % 100
        var nameHours = "$hours часов назад"
        if (lastnumber1 == 1 && lastnumber2 != 11) {
            nameHours = "$hours час назад"
        }
        else if (lastnumber1 == 2 && lastnumber1 == 3 && lastnumber1 == 4 && lastnumber2 != 12) {
            nameHours = "$hours часа назад"
        }
        return nameHours
}