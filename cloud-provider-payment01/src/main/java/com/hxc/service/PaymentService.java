package com.hxc.service;

import com.hxc.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/3/20
 * Time: 20:30
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
