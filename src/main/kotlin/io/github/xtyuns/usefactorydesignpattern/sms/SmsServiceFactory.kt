package io.github.xtyuns.usefactorydesignpattern.sms

interface SmsServiceFactory {
    fun create(): SmsService
}