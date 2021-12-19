package leadspace.ua.test.messenger.message.impl

import com.fasterxml.jackson.annotation.JsonInclude
import leadspace.ua.test.messenger.message.Message
import lombok.Data
import lombok.experimental.Accessors

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
data class CompanyMessage(
        val name: String
) : Message