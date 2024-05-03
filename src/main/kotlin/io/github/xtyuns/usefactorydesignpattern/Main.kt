package io.github.xtyuns.usefactorydesignpattern

import io.github.xtyuns.usefactorydesignpattern.sms.SmsServiceFactoryRegistry
import io.github.xtyuns.usefactorydesignpattern.sms.factory.AliSmsServiceFactory
import io.github.xtyuns.usefactorydesignpattern.sms.factory.AliSmsServiceProperties
import io.github.xtyuns.usefactorydesignpattern.sms.factory.TencentSmsServiceFactory
import io.github.xtyuns.usefactorydesignpattern.sms.factory.TencentSmsServiceProperties

fun main() {
    // Use Autowired in spring applications
    SmsServiceFactoryRegistry.register("ali", AliSmsServiceFactory(AliSmsServiceProperties("10001", "123456")))
    SmsServiceFactoryRegistry.register("tencent", TencentSmsServiceFactory(TencentSmsServiceProperties("ak123456")))

    // Use factory
    "ali".let {
        SmsServiceFactoryRegistry.getFactory(it, true)!!.create().sendSms("hi, $it", "123456")
    }

    "tencent".let {
        SmsServiceFactoryRegistry.getFactory(it, true)!!.create().sendSms("hi, $it", "123456")
    }
}