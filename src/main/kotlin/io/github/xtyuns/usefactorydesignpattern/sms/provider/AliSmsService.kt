package io.github.xtyuns.usefactorydesignpattern.sms.provider

import io.github.xtyuns.usefactorydesignpattern.sms.SmsService

class AliSmsService(
    private val appId: String,
    private val appSecret: String,
) : SmsService {
    override fun sendSms(message: String, phoneNumber: String) {
        println(
            "[${javaClass.simpleName}] Sending sms to $phoneNumber: $message, using auth: {" +
                    "${AliSmsService::appId.name}: $appId," +
                    "${AliSmsService::appSecret.name}: $appSecret" +
                    "}"
        )
    }
}