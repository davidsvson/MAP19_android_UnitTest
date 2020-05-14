package com.example.map19_unittest

class TwoStrings(private val strOne : String, private val strTwo: String)
{
    fun add() = strOne +  strTwo

    fun subtract() : String {
        return if (strTwo.length < strOne.length)
            strOne.substring(strTwo.length)
        else
            ""
    }




}