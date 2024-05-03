package io.github.xtyuns.usefactorydesignpattern.sms.factory

import io.github.xtyuns.usefactorydesignpattern.sms.SmsService
import io.github.xtyuns.usefactorydesignpattern.sms.SmsServiceFactory
import io.github.xtyuns.usefactorydesignpattern.sms.provider.TencentSmsService

class TencentSmsServiceFactory(private val config: TencentSmsServiceProperties) : SmsServiceFactory {
    override fun create(): SmsService {
        return TencentSmsService(config.apiKey)
    }
}

class TencentSmsServiceProperties(
    val apiKey: String,
)