package leadspace.ua.test.model

import lombok.Data
import lombok.experimental.Accessors
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "company")
@Data
@Accessors(chain = true)
@DynamicUpdate
@DynamicInsert
data class Company(

        @Column(name = "name", length = 128)
        val name: String

) : AbstractModel()
