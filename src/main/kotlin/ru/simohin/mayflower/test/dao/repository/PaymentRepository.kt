package ru.simohin.mayflower.test.dao.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import ru.simohin.mayflower.test.dao.entity.PaymentEntity
import ru.simohin.mayflower.test.model.PaymentStatus

@Repository
interface PaymentRepository : JpaRepository<PaymentEntity, String> {

    @Modifying
    @Query("update PaymentEntity set status = :newStatus where id = :id")
    fun updateStatus(@Param("id") id: String, @Param("newStatus") newStatus: PaymentStatus): Int
}