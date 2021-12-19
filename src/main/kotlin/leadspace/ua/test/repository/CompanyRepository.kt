package leadspace.ua.test.repository

import leadspace.ua.test.model.Company
import org.springframework.data.repository.CrudRepository

interface CompanyRepository : CrudRepository<Company, String> {

}