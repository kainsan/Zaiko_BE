package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.InventoryOutputEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryOutputRepository extends JpaRepository<InventoryOutputEntity, Long> {

    @Query(
        value = """
        SELECT 
            o.inventory_output_id AS inventoryOutputId,
            o.company_id AS companyId,
            o.order_date AS orderDate,
            o.slip_no AS slipNo,
            o.slip_note AS slipNote,
            o.batch_status AS batchStatus,
            o.sum_plan_quantity AS sumPlanQuantity,
            o.sum_actual_quantity AS sumActualQuantity,
            o.output_status AS outputStatus,
            o.is_closed AS isClosed,
            o.checked AS checked,
            
            o.plan_output_date AS planOutputDate,
            o.plan_working_date AS planWorkingDate,
            o.plan_deliver_date AS planDeliverDate,
            o.plan_supplier_slip_no AS planSupplierSlipNo,
            
            o.actual_output_date AS actualOutputDate,
            o.actual_deliver_date AS actualDeliverDate,
            o.actual_supplier_slip_no AS actualSupplierSlipNo,
            
            o.plan_customer_delivery_destination_id AS planCustomerDeliveryDestinationId,
            planDest.destination_code AS planDestinationCode,
            planDest.department_name AS planDestinationName,
            
            o.actual_customer_delivery_destination_id AS actualCustomerDeliveryDestinationId,
            actualDest.destination_code AS actualDestinationCode,
            actualDest.department_name AS actualDestinationName,
            
            o.plan_customer_id AS planCustomerId,
            planCust.customer_code AS planCustomerCode,
            planCust.customer_name AS planCustomerName,
            
            o.actual_customer_id AS actualCustomerId,
            actualCust.customer_code AS actualCustomerCode,
            actualCust.customer_name AS actualCustomerName,
            
            o.plan_repository_id AS planRepositoryId,
            planRepo.repository_code AS planRepositoryCode,
            planRepo.repository_name AS planRepositoryName,
            
            o.actual_repository_id AS actualRepositoryId,
            actualRepo.repository_code AS actualRepositoryCode,
            actualRepo.repository_name AS actualRepositoryName,
            
            s.supplier_code AS supplierCode,
            s.supplier_name AS supplierName,
            
            ow.customer_code AS ownerCode,
            ow.customer_name AS ownerName,
            
            o.create_slip_type AS createSlipType,
            o.free_item1 AS freeItem1,
            o.free_item2 AS freeItem2,
            o.free_item3 AS freeItem3,
            o.route_code AS routeCode,
            o.course_code AS courseCode,
            o.deliver_destination_name AS deliverDestinationName,
            o.phone_number AS phoneNumber,
            o.fax_number AS faxNumber,
            o.post_code AS postCode,
            o.address1 AS address1,
            o.address2 AS address2,
            o.address3 AS address3,
            o.address4 AS address4,
            o.new_destination_name AS newDestinationName
        FROM t_inventory_output o
        LEFT JOIN m_customer_delivery_dest planDest 
            ON o.plan_customer_delivery_destination_id = planDest.delivery_destination_id
        LEFT JOIN m_customer_delivery_dest actualDest 
            ON o.actual_customer_delivery_destination_id = actualDest.delivery_destination_id
        LEFT JOIN m_customer planCust 
            ON o.plan_customer_id = planCust.customer_id
        LEFT JOIN m_customer actualCust 
            ON o.actual_customer_id = actualCust.customer_id
        LEFT JOIN m_repository planRepo 
            ON o.plan_repository_id = planRepo.repository_id AND o.company_id = planRepo.company_id
        LEFT JOIN m_repository actualRepo 
            ON o.actual_repository_id = actualRepo.repository_id AND o.company_id = actualRepo.company_id
        LEFT JOIN m_supplier s 
            ON s.supplier_id = (
                SELECT opd.supplier_id 
                FROM t_inventory_plan_output_detail opd 
                WHERE opd.inventory_output_id = o.inventory_output_id 
                LIMIT 1
            )
        LEFT JOIN m_customer ow 
            ON ow.customer_id = (
                SELECT opd.product_owner_id 
                FROM t_inventory_plan_output_detail opd 
                WHERE opd.inventory_output_id = o.inventory_output_id 
                LIMIT 1
            )
        WHERE o.del_flg = '0'

        AND (:orderDateFrom IS NULL OR o.order_date >= :orderDateFrom)
        AND (:orderDateTo IS NULL OR o.order_date <= :orderDateTo)

        AND (:planOutputDateFrom IS NULL OR o.plan_output_date >= :planOutputDateFrom)
        AND (:planOutputDateTo IS NULL OR o.plan_output_date <= :planOutputDateTo)

        AND (:planOutputWorkingDateFrom IS NULL OR o.plan_working_date >= :planOutputWorkingDateFrom)
        AND (:planOutputWorkingDateTo IS NULL OR o.plan_working_date <= :planOutputWorkingDateTo)

        AND (:planOutputDeliveryDateFrom IS NULL OR o.plan_deliver_date >= :planOutputDeliveryDateFrom)
        AND (:planOutputDeliveryDateTo IS NULL OR o.plan_deliver_date <= :planOutputDeliveryDateTo)

        AND (
            (:supplierSlipNoFrom IS NULL AND :supplierSlipNoTo IS NULL)
            OR (
                :supplierSlipNoFrom IS NOT NULL AND :supplierSlipNoTo IS NULL
                AND (
                    o.plan_supplier_slip_no >= :supplierSlipNoFrom 
                    OR o.actual_supplier_slip_no >= :supplierSlipNoFrom
                )
            )
            OR (
                :supplierSlipNoFrom IS NULL AND :supplierSlipNoTo IS NOT NULL
                AND (
                    o.plan_supplier_slip_no <= :supplierSlipNoTo 
                    OR o.actual_supplier_slip_no <= :supplierSlipNoTo
                )
            )
            OR (
                :supplierSlipNoFrom IS NOT NULL AND :supplierSlipNoTo IS NOT NULL
                AND (
                    (o.plan_supplier_slip_no >= :supplierSlipNoFrom AND o.plan_supplier_slip_no <= :supplierSlipNoTo)
                    OR (o.actual_supplier_slip_no >= :supplierSlipNoFrom AND o.actual_supplier_slip_no <= :supplierSlipNoTo)
                    OR (o.plan_supplier_slip_no >= :supplierSlipNoFrom AND o.actual_supplier_slip_no <= :supplierSlipNoTo)
                    OR (o.actual_supplier_slip_no >= :supplierSlipNoFrom AND o.plan_supplier_slip_no <= :supplierSlipNoTo)
                )
            )
        )

        AND (:slipNoFrom IS NULL OR o.slip_no >= :slipNoFrom)
        AND (:slipNoTo IS NULL OR o.slip_no <= :slipNoTo)

        AND (:customerIdFrom IS NULL OR planCust.customer_code >= :customerIdFrom)
        AND (:customerIdTo IS NULL OR planCust.customer_code <= :customerIdTo)
        AND (:customerName IS NULL OR planCust.customer_name LIKE CONCAT('%', :customerName, '%'))

        AND (:deliveryDestinationIdFrom IS NULL OR planDest.destination_code >= :deliveryDestinationIdFrom)
        AND (:deliveryDestinationIdTo IS NULL OR planDest.destination_code <= :deliveryDestinationIdTo)
        AND (:deliveryDestinationName IS NULL OR planDest.department_name LIKE CONCAT('%', :deliveryDestinationName, '%'))

        AND (:supplierIdFrom IS NULL OR s.supplier_code >= :supplierIdFrom)
        AND (:supplierIdTo IS NULL OR s.supplier_code <= :supplierIdTo)
        AND (:supplierName IS NULL OR s.supplier_name LIKE CONCAT('%', :supplierName, '%'))

        AND (:ownerIdFrom IS NULL OR ow.customer_code >= :ownerIdFrom)
        AND (:ownerIdTo IS NULL OR ow.customer_code <= :ownerIdTo)
        AND (:ownerName IS NULL OR ow.customer_name LIKE CONCAT('%', :ownerName, '%'))

        AND (
            :productIdFrom IS NULL OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                JOIN m_product p ON p.product_id = opd.product_id
                WHERE opd.inventory_output_id = o.inventory_output_id
                AND p.product_code >= :productIdFrom
                AND opd.del_flg = '0'
            )
        )
        AND (
            :productIdTo IS NULL OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                JOIN m_product p ON p.product_id = opd.product_id
                WHERE opd.inventory_output_id = o.inventory_output_id
                AND p.product_code <= :productIdTo
                AND opd.del_flg = '0'
            )
        )
        AND (
            :productName IS NULL OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                JOIN m_product p ON p.product_id = opd.product_id
                WHERE opd.inventory_output_id = o.inventory_output_id
                AND p.name1 LIKE CONCAT('%', :productName, '%')
                AND opd.del_flg = '0'
            )
        )

        AND (:planRepositoryIdFrom IS NULL OR planRepo.repository_code >= :planRepositoryIdFrom)
        AND (:planRepositoryIdTo IS NULL OR planRepo.repository_code <= :planRepositoryIdTo)

        AND (
            :batchNumber = 0 OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                WHERE opd.inventory_output_id = o.inventory_output_id
                  AND opd.batch_no = CAST(:batchNumber AS CHAR)
            )
        )

        AND (
            :deliveryType = 'ALL' COLLATE utf8mb4_unicode_ci
            OR (
                :deliveryType = 'PLAN' COLLATE utf8mb4_unicode_ci
                AND o.plan_output_date IS NOT NULL
                AND o.actual_output_date IS NULL
            )
            OR (
                :deliveryType = 'ACTUAL' COLLATE utf8mb4_unicode_ci
                AND o.actual_output_date IS NOT NULL
            )
        )

        AND (
            :deliveryStatus = 'ALL' COLLATE utf8mb4_unicode_ci
            OR (
                :deliveryStatus = 'NOT_YET' COLLATE utf8mb4_unicode_ci
                AND o.sum_plan_quantity IS NOT NULL
                AND (o.sum_actual_quantity IS NULL OR o.sum_actual_quantity = 0)
            )
            OR (
                :deliveryStatus = 'REMAINING' COLLATE utf8mb4_unicode_ci
                AND o.sum_actual_quantity IS NOT NULL
                AND o.sum_actual_quantity < o.sum_plan_quantity
            )
            OR (
                :deliveryStatus = 'DONE' COLLATE utf8mb4_unicode_ci
                AND o.sum_actual_quantity IS NOT NULL
                AND o.sum_actual_quantity >= o.sum_plan_quantity
            )
        )

        AND (
            :isClosed = 'ALL' COLLATE utf8mb4_unicode_ci
            OR (:isClosed = 'UNCLOSED' COLLATE utf8mb4_unicode_ci AND o.is_closed = '0')
            OR (:isClosed = 'CLOSED' COLLATE utf8mb4_unicode_ci AND o.is_closed = '1')
        )

        AND (:actualOutputDateFrom IS NULL OR o.actual_output_date >= :actualOutputDateFrom)
        AND (:actualOutputDateTo IS NULL OR o.actual_output_date <= :actualOutputDateTo)

        AND (:actualDeliveryDateFrom IS NULL OR o.actual_deliver_date >= :actualDeliveryDateFrom)
        AND (:actualDeliveryDateTo IS NULL OR o.actual_deliver_date <= :actualDeliveryDateTo)
        """,

        countQuery = """
        SELECT COUNT(o.inventory_output_id)
        FROM t_inventory_output o
        LEFT JOIN m_customer_delivery_dest planDest 
            ON o.plan_customer_delivery_destination_id = planDest.delivery_destination_id
        LEFT JOIN m_customer planCust 
            ON o.plan_customer_id = planCust.customer_id
        LEFT JOIN m_repository planRepo 
            ON o.plan_repository_id = planRepo.repository_id AND o.company_id = planRepo.company_id
        LEFT JOIN m_supplier s 
            ON s.supplier_id = (
                SELECT opd.supplier_id 
                FROM t_inventory_plan_output_detail opd 
                WHERE opd.inventory_output_id = o.inventory_output_id 
                LIMIT 1
            )
        LEFT JOIN m_customer ow 
            ON ow.customer_id = (
                SELECT opd.product_owner_id 
                FROM t_inventory_plan_output_detail opd 
                WHERE opd.inventory_output_id = o.inventory_output_id 
                LIMIT 1
            )
        WHERE o.del_flg = '0'

        AND (:orderDateFrom IS NULL OR o.order_date >= :orderDateFrom)
        AND (:orderDateTo IS NULL OR o.order_date <= :orderDateTo)

        AND (:planOutputDateFrom IS NULL OR o.plan_output_date >= :planOutputDateFrom)
        AND (:planOutputDateTo IS NULL OR o.plan_output_date <= :planOutputDateTo)

        AND (:planOutputWorkingDateFrom IS NULL OR o.plan_working_date >= :planOutputWorkingDateFrom)
        AND (:planOutputWorkingDateTo IS NULL OR o.plan_working_date <= :planOutputWorkingDateTo)

        AND (:planOutputDeliveryDateFrom IS NULL OR o.plan_deliver_date >= :planOutputDeliveryDateFrom)
        AND (:planOutputDeliveryDateTo IS NULL OR o.plan_deliver_date <= :planOutputDeliveryDateTo)

        AND (
            (:supplierSlipNoFrom IS NULL AND :supplierSlipNoTo IS NULL)
            OR (
                :supplierSlipNoFrom IS NOT NULL AND :supplierSlipNoTo IS NULL
                AND (
                    o.plan_supplier_slip_no >= :supplierSlipNoFrom 
                    OR o.actual_supplier_slip_no >= :supplierSlipNoFrom
                )
            )
            OR (
                :supplierSlipNoFrom IS NULL AND :supplierSlipNoTo IS NOT NULL
                AND (
                    o.plan_supplier_slip_no <= :supplierSlipNoTo 
                    OR o.actual_supplier_slip_no <= :supplierSlipNoTo
                )
            )
            OR (
                :supplierSlipNoFrom IS NOT NULL AND :supplierSlipNoTo IS NOT NULL
                AND (
                    (o.plan_supplier_slip_no >= :supplierSlipNoFrom AND o.plan_supplier_slip_no <= :supplierSlipNoTo)
                    OR (o.actual_supplier_slip_no >= :supplierSlipNoFrom AND o.actual_supplier_slip_no <= :supplierSlipNoTo)
                    OR (o.plan_supplier_slip_no >= :supplierSlipNoFrom AND o.actual_supplier_slip_no <= :supplierSlipNoTo)
                    OR (o.actual_supplier_slip_no >= :supplierSlipNoFrom AND o.plan_supplier_slip_no <= :supplierSlipNoTo)
                )
            )
        )

        AND (:slipNoFrom IS NULL OR o.slip_no >= :slipNoFrom)
        AND (:slipNoTo IS NULL OR o.slip_no <= :slipNoTo)

        AND (:customerIdFrom IS NULL OR planCust.customer_code >= :customerIdFrom)
        AND (:customerIdTo IS NULL OR planCust.customer_code <= :customerIdTo)
        AND (:customerName IS NULL OR planCust.customer_name LIKE CONCAT('%', :customerName, '%'))

        AND (:deliveryDestinationIdFrom IS NULL OR planDest.destination_code >= :deliveryDestinationIdFrom)
        AND (:deliveryDestinationIdTo IS NULL OR planDest.destination_code <= :deliveryDestinationIdTo)
        AND (:deliveryDestinationName IS NULL OR planDest.department_name LIKE CONCAT('%', :deliveryDestinationName, '%'))

        AND (:supplierIdFrom IS NULL OR s.supplier_code >= :supplierIdFrom)
        AND (:supplierIdTo IS NULL OR s.supplier_code <= :supplierIdTo)
        AND (:supplierName IS NULL OR s.supplier_name LIKE CONCAT('%', :supplierName, '%'))

        AND (:ownerIdFrom IS NULL OR ow.customer_code >= :ownerIdFrom)
        AND (:ownerIdTo IS NULL OR ow.customer_code <= :ownerIdTo)
        AND (:ownerName IS NULL OR ow.customer_name LIKE CONCAT('%', :ownerName, '%'))

        AND (
            :productIdFrom IS NULL OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                JOIN m_product p ON p.product_id = opd.product_id
                WHERE opd.inventory_output_id = o.inventory_output_id
                AND p.product_code >= :productIdFrom
                AND opd.del_flg = '0'
            )
        )
        AND (
            :productIdTo IS NULL OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                JOIN m_product p ON p.product_id = opd.product_id
                WHERE opd.inventory_output_id = o.inventory_output_id
                AND p.product_code <= :productIdTo
                AND opd.del_flg = '0'
            )
        )
        AND (
            :productName IS NULL OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                JOIN m_product p ON p.product_id = opd.product_id
                WHERE opd.inventory_output_id = o.inventory_output_id
                  AND p.name1 LIKE CONCAT('%', :productName, '%')
            )
        )

        AND (:planRepositoryIdFrom IS NULL OR planRepo.repository_code >= :planRepositoryIdFrom)
        AND (:planRepositoryIdTo IS NULL OR planRepo.repository_code <= :planRepositoryIdTo)

        AND (
            :batchNumber = 0 OR EXISTS (
                SELECT 1
                FROM t_inventory_plan_output_detail opd
                WHERE opd.inventory_output_id = o.inventory_output_id
                  AND opd.batch_no = CAST(:batchNumber AS CHAR)
            )
        )

        AND (
            :deliveryType = 'ALL' COLLATE utf8mb4_unicode_ci
            OR (
                :deliveryType = 'PLAN' COLLATE utf8mb4_unicode_ci
                AND o.plan_output_date IS NOT NULL
                AND o.actual_output_date IS NULL
            )
            OR (
                :deliveryType = 'ACTUAL' COLLATE utf8mb4_unicode_ci
                AND o.actual_output_date IS NOT NULL
            )
        )

        AND (
            :deliveryStatus = 'ALL' COLLATE utf8mb4_unicode_ci
            OR (
                :deliveryStatus = 'NOT_YET' COLLATE utf8mb4_unicode_ci
                AND o.sum_plan_quantity IS NOT NULL
                AND (o.sum_actual_quantity IS NULL OR o.sum_actual_quantity = 0)
            )
            OR (
                :deliveryStatus = 'REMAINING' COLLATE utf8mb4_unicode_ci
                AND o.sum_actual_quantity IS NOT NULL
                AND o.sum_actual_quantity < o.sum_plan_quantity
            )
            OR (
                :deliveryStatus = 'DONE' COLLATE utf8mb4_unicode_ci
                AND o.sum_actual_quantity IS NOT NULL
                AND o.sum_actual_quantity >= o.sum_plan_quantity
            )
        )

        AND (
            :isClosed = 'ALL' COLLATE utf8mb4_unicode_ci
            OR (:isClosed = 'UNCLOSED' COLLATE utf8mb4_unicode_ci AND o.is_closed = '0')
            OR (:isClosed = 'CLOSED' COLLATE utf8mb4_unicode_ci AND o.is_closed = '1')
        )

        AND (:actualOutputDateFrom IS NULL OR o.actual_output_date >= :actualOutputDateFrom)
        AND (:actualOutputDateTo IS NULL OR o.actual_output_date <= :actualOutputDateTo)

        AND (:actualDeliveryDateFrom IS NULL OR o.actual_deliver_date >= :actualDeliveryDateFrom)
        AND (:actualDeliveryDateTo IS NULL OR o.actual_deliver_date <= :actualDeliveryDateTo)
        """,
        nativeQuery = true
    )
    Page<InventoryOutputSummary> searchInventoryOutputs(
        @Param("orderDateFrom") String orderDateFrom,
        @Param("orderDateTo") String orderDateTo,
        @Param("planOutputDateFrom") String planOutputDateFrom,
        @Param("planOutputDateTo") String planOutputDateTo,
        @Param("planOutputWorkingDateFrom") String planOutputWorkingDateFrom,
        @Param("planOutputWorkingDateTo") String planOutputWorkingDateTo,
        @Param("planOutputDeliveryDateFrom") String planOutputDeliveryDateFrom,
        @Param("planOutputDeliveryDateTo") String planOutputDeliveryDateTo,
        @Param("supplierSlipNoFrom") String supplierSlipNoFrom,
        @Param("supplierSlipNoTo") String supplierSlipNoTo,
        @Param("slipNoFrom") String slipNoFrom,
        @Param("slipNoTo") String slipNoTo,
        @Param("customerIdFrom") String customerIdFrom,
        @Param("customerIdTo") String customerIdTo,
        @Param("customerName") String customerName,
        @Param("deliveryDestinationIdFrom") String deliveryDestinationIdFrom,
        @Param("deliveryDestinationIdTo") String deliveryDestinationIdTo,
        @Param("deliveryDestinationName") String deliveryDestinationName,
        @Param("supplierIdFrom") String supplierIdFrom,
        @Param("supplierIdTo") String supplierIdTo,
        @Param("supplierName") String supplierName,
        @Param("ownerIdFrom") String ownerIdFrom,
        @Param("ownerIdTo") String ownerIdTo,
        @Param("ownerName") String ownerName,
        @Param("productIdFrom") String productIdFrom,
        @Param("productIdTo") String productIdTo,
        @Param("productName") String productName,
        @Param("planRepositoryIdFrom") String planRepositoryIdFrom,
        @Param("planRepositoryIdTo") String planRepositoryIdTo,
        @Param("batchNumber") Long batchNumber,
        @Param("deliveryType") String deliveryType,
        @Param("deliveryStatus") String deliveryStatus,
        @Param("isClosed") String isClosed,
        @Param("actualOutputDateFrom") String actualOutputDateFrom,
        @Param("actualOutputDateTo") String actualOutputDateTo,
        @Param("actualDeliveryDateFrom") String actualDeliveryDateFrom,
        @Param("actualDeliveryDateTo") String actualDeliveryDateTo,
        Pageable pageable
    );
}
