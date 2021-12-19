package leadspace.ua.test.messenger

interface MessengerIntegrationProvider<T> {

    fun send(message: T)

    fun receive(): T
}