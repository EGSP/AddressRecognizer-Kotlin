val keywords:List<String> = listOf("квартира","дом","улица","город");

fun main(args: Array<String>) {

    while (true) {
        println("Введите адрес")
        val address: String = readln().lowercase()

        println("Что вы хотите выделить: квартира, дом, улица, город?")
        println("Введите одно из сказанных выше ключевых слов")

        while (true) {
            val keyword: String = readln().lowercase()

            if (keywords.contains(keyword)) {
                val result = getKeywordAddressValue(address, keyword)
                println("Результат: $result")
                break
            } else
                println("Неверное ключевое слово, напишите одно из ранее представленных")
        }
    }
}

fun getKeywordAddressValue(address:String, keyword:String):String{
    val blocks:List<String> = splitAddress(address)
    return blocks.firstOrNull { it.contains(keyword) } ?: "Не найдено"
}

fun splitAddress(adr:String):List<String>{
    return adr.split(',')
}