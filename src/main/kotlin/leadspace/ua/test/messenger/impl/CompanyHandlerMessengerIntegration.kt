package leadspace.ua.test.messenger.impl

import leadspace.ua.test.config.COMPANY_MESSAGE_KEY
import leadspace.ua.test.messenger.MessengerIntegrationProvider
import leadspace.ua.test.messenger.message.impl.CompanyMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service("companyMessenger")
class CompanyHandlerMessengerIntegration(
        val kafkaTemplate: KafkaTemplate<String, String>
) : MessengerIntegrationProvider<CompanyMessage> {

    override fun send(message: CompanyMessage) {
        kafkaTemplate.send(COMPANY_MESSAGE_KEY, message.name);
    }

    override fun receive(): CompanyMessage {
        return CompanyMessage("DUMMY_COMPANY")
    }
}