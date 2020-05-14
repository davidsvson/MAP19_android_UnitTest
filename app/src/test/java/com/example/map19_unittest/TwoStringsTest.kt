package com.example.map19_unittest

import org.junit.Test

import org.junit.Assert.*

class TwoStringsTest {

    @Test
    fun canAdd() {
        // given
        val twoStr1 = TwoStrings("David","Per")
        val twoStr2 = TwoStrings("David", "")

        // when
        val result1 = twoStr1.add()
        val result2 = twoStr2.add()

        // then
        assertEquals("DavidPer", result1)
        assertEquals("David", result2)

    }

    @Test
    fun canSubtract() {
        //given
        val twoStr = TwoStrings("David", "Per")
        val twoStr2 = TwoStrings("Per", "David")
        val twoStr3 = TwoStrings("David", "David")

        //when
        val result = twoStr.subtract()
        val result2 = twoStr2.subtract()
        val result3 = twoStr3.subtract()

        //then
        assertEquals("id", result)
        assertEquals("", result2)
        assertEquals("", result3)
    }


}