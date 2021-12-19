package leadspace.ua.test.controller

import leadspace.ua.test.config.COUNTER_MESSAGE_PATTERN
import leadspace.ua.test.service.CompanyDataHandlingService
import org.springframework.cache.annotation.CacheConfig
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("company")
@CacheConfig(cacheNames = ["company-data-handler-cache"])
class CompanyController(
        private val companyService: CompanyDataHandlingService
) {
    //    @Cacheable
    @GetMapping("counter")
    fun getCompanyCounter(): String {
        return String.format(COUNTER_MESSAGE_PATTERN, companyService.getNumberOfCompaniesHandled())
    }
}