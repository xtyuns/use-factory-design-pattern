package io.github.xtyuns.usefactorydesignpattern.sms.provider

import io.github.xtyuns.usefactorydesignpattern.sms.SmsService

class TencentSmsService(
    private val apiKey: String,
) : SmsService {
    override fun sendSms(message: String, phoneNumber: String) {
        println(
            "[${javaClass.simpleName}] Sending sms to $phoneNumber: $message, using auth: {" +
                    "${TencentSmsService::apiKey.name}: $apiKey" +
                    "}"
        )
    }
}