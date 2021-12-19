package leadspace.ua.test.dto

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Data
import lombok.experimental.Accessors

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
data class CompanyDto(
        val name: String
)
