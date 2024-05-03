package io.github.xtyuns.usefactorydesignpattern.sms

import java.util.concurrent.ConcurrentHashMap

object SmsServiceFactoryRegistry {
    private val factoryMap = ConcurrentHashMap<String, SmsServiceFactory>()

    fun register(key: String, factory: SmsServiceFactory) {
        val putIfAbsent = factoryMap.putIfAbsent(key, factory)
        if (putIfAbsent != null) {
            throw RuntimeException("$key is already registered!")
        }
    }

    fun getFactory(key: String, notNull: Boolean = false): SmsServiceFactory? {
        val factory = factoryMap[key]
        if (notNull && factory == null) {
            throw RuntimeException("$key is not registered!")
        }
        return factory
    }
}