package io.github.xtyuns.usefactorydesignpattern.sms.factory

import io.github.xtyuns.usefactorydesignpattern.sms.SmsService
import io.github.xtyuns.usefactorydesignpattern.sms.SmsServiceFactory
import io.github.xtyuns.usefactorydesignpattern.sms.provider.AliSmsService

class AliSmsServiceFactory(private val config: AliSmsServiceProperties) : SmsServiceFactory {
    override fun create(): SmsService {
        return AliSmsService(config.appId, config.appSecret)
    }
}

class AliSmsServiceProperties(
    val appId: String,
    val appSecret: String,
)