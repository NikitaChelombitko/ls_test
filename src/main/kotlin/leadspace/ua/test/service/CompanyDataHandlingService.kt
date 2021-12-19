package leadspace.ua.test.service

import leadspace.ua.test.dto.CompanyDto

interface CompanyDataHandlingService {

    fun handleCompanyData(companyDto: CompanyDto)

    fun getNumberOfCompaniesHandled(): Long
}