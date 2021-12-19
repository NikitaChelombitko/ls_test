package leadspace.ua.test.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaTopicConfig {

    @Value(value = "\${kafka.bootstrap-address}")
    private lateinit var bootstrapAddress: String

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val configProps: MutableMap<String, Any> = HashMap()
        configProps[AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapAddress
        return KafkaAdmin(configProps)
    }

    @Bean
    fun topic1(): NewTopic {
        return NewTopic(COMPANY_KAFKA_TOPIC_NAME, KAFKA_PARTITIONS_NUMBER, 1.toShort())
    }
}