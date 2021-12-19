package leadspace.ua.test.service.impl

import leadspace.ua.test.dto.CompanyDto
import leadspace.ua.test.messenger.MessengerIntegrationProvider
import leadspace.ua.test.messenger.message.impl.CompanyMessage
import leadspace.ua.test.repository.CompanyRepository
import leadspace.ua.test.service.CompanyDataHandlingService
import org.springframework.stereotype.Service

@Service
class CompanyDataHandlingServiceImpl(
        private val messengerProvider: MessengerIntegrationProvider<CompanyMessage>,
        private val companyRepository: CompanyRepository
) : CompanyDataHandlingService {


    @Override
    override fun handleCompanyData(companyDto: CompanyDto) {
        // TODO:
        // messenger.receive
        // repos.save
    }

    override fun getNumberOfCompaniesHandled(): Long {
        return companyRepository.count()
    }
}