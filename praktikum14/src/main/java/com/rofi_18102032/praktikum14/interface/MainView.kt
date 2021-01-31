package com.rofi_18102032.praktikum14.`interface`

import com.rofi_18102032.praktikum14.model.Login
import com.rofi_18102032.praktikum14.model.Quote


interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login) }
