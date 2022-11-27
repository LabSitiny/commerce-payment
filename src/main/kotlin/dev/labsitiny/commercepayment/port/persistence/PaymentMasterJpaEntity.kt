package dev.labsitiny.commercepayment.port.persistence

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Data
class PaymentMasterJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0L
}