package com.igorwojda.string.ispalindrome.permutation

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isPermutationPalindrome(str: String): Boolean {
    return str
        .groupBy { it }
        .filter { it.value.size % 2 == 1 }
        .size <= 1
}

private class Test {
    @Test
    fun `"gikig" is a palindrome`() {
        isPermutationPalindrome("gikig") shouldBeEqualTo true
    }

    @Test
    fun `"okvok" is a palindrome`() {
        isPermutationPalindrome("okvok") shouldBeEqualTo true
    }

    @Test
    fun `"ookvk" is a palindrome`() {
        isPermutationPalindrome("ookvk") shouldBeEqualTo true
    }

    @Test
    fun `"sows" is a palindrome`() {
        isPermutationPalindrome("sows") shouldBeEqualTo false
    }

    @Test
    fun `"tami" is a palindrome`() {
        isPermutationPalindrome("tami") shouldBeEqualTo false
    }
}
