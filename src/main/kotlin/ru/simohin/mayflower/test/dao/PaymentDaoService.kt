package ru.simohin.mayflower.test.dao

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import ru.simohin.mayflower.test.dao.entity.PaymentEntity
import ru.simohin.mayflower.test.dao.repository.PaymentRepository
import ru.simohin.mayflower.test.exception.NotFoundException
import ru.simohin.mayflower.test.model.Payment
import ru.simohin.mayflower.test.model.PaymentStatus
import java.util.*

@Service
class PaymentDaoService(
    private val paymentRepository: PaymentRepository
) {

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    fun save(payment: Payment) = paymentRepository.save(PaymentEntity(payment.id.toString(), payment.status))

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    fun setStatus(paymentId: UUID, status: PaymentStatus) =
        paymentRepository.updateStatus(paymentId.toString(), status)
            .let {
                if (it <= 0) {
                    throw NotFoundException("No payment found by id $paymentId")
                }
            }
}