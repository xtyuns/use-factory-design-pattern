package io.github.xtyuns.usefactorydesignpattern.sms

interface SmsService {
    fun sendSms(message: String, phoneNumber: String)
}