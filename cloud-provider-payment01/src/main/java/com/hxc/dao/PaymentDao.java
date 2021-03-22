package com.hxc.dao;

import com.hxc.entities.Payment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/3/20
 * Time: 20:07
 */
@Mapper
public interface PaymentDao {

    @Insert("insert into learncloud.payment(serial) values(#{serial})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int create(Payment payment);


    @Results(id = "BaseResultMap", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT),
            @Result(column = "serial", property = "serial", jdbcType = JdbcType.VARCHAR)
    })
    @Select("select * from payment where id=#{id}")
    public Payment getPaymentById(@Param("id") Long id);

    @ResultMap("BaseResultMap")
    @Select("select * from payment")
    public List<Payment> getPayment();
}
