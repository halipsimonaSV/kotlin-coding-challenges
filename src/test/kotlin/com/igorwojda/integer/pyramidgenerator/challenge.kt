package com.igorwojda.integer.pyramidgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun generatePyramid(n: Int): List<String> {
    val listOfHash= mutableListOf<String>()
    val maxHash=n*2-1
    for(i in(1..maxHash) step 2){
        val nrSpaces=maxHash-i
        var str=""
        for(j in 1..maxHash) str+='#'
        var spaces=""
        for(k in 1..nrSpaces/2) spaces+=' '
        val prefix=str.replaceRange(0,nrSpaces/2, spaces)
        val suffix=prefix.replaceRange(prefix.length-nrSpaces/2,prefix.length,spaces)
        listOfHash.add(suffix)
    }
    return listOfHash
}

private class Test {

    @Test
    fun `pyramid n = 2`() {
        generatePyramid(2).also {
            it.size shouldBeEqualTo 2
            it[0] shouldBeEqualTo " # "
            it[1] shouldBeEqualTo "###"
        }
    }

    @Test
    fun `pyramid n = 3`() {
        generatePyramid(3).also {
            it.size shouldBeEqualTo 3
            it[0] shouldBeEqualTo "  #  "
            it[1] shouldBeEqualTo " ### "
            it[2] shouldBeEqualTo "#####"
        }
    }

    @Test
    fun `pyramid n = 4`() {
        generatePyramid(4).also {
            it.size shouldBeEqualTo 4
            it[0] shouldBeEqualTo "   #   "
            it[1] shouldBeEqualTo "  ###  "
            it[2] shouldBeEqualTo " ##### "
            it[3] shouldBeEqualTo "#######"
        }
    }
}
