package com.example.firstappcourse

class Collections {
}

fun main() {
    var mutableMap: MutableMap<String,String> = mutableMapOf()
    var map: Map<Int, Int> = mapOf(Pair(5,10))

    println(mutableMap.contains("tomaz"))
    mutableMap["tomaz"] = "professor"
    println(mutableMap.contains("tomaz"))
    mutableMap.put("tomaz","professor ebac")

    println(mutableMap.get("tomaz"))
    println(mutableMap["joao"])


}