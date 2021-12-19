package leadspace.ua.test.model

import lombok.Data
import lombok.EqualsAndHashCode
import lombok.experimental.Accessors
import org.hibernate.annotations.DynamicUpdate
import java.util.*
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.PrePersist

@Data
@Accessors(chain = true)
@EqualsAndHashCode(exclude = ["originTimestamp", "updateTimestamp"])
@MappedSuperclass
@DynamicUpdate
abstract class AbstractModel {

    @Id
    @Column(name = "id", length = 36)
    private var id: String? = null

    @Column(name = "origin_timestamp", updatable = false)
    private val originTimestamp: Date? = null

    @Column(name = "update_timestamp")
    private val updateTimestamp: Date? = null

    @PrePersist
    private fun prePersist() {
        if (id == null) {
            id = UUID.randomUUID().toString()
        }
    }
}