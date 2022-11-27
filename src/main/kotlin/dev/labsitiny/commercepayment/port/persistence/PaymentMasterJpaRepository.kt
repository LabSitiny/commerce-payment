package dev.labsitiny.commercepayment.port.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentMasterJpaRepository : JpaRepository<PaymentMasterJpaEntity, Long> {
}