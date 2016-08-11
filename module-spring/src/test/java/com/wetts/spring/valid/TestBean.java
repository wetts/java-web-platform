package com.wetts.spring.valid;

import com.wetts.base.valid.annotation.Money;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by wetts on 2016/8/11.
 */
public class TestBean {

    // 必须不为 null, 大小是 10
    @NotNull
    @Size(min = 10, max = 10)
    private String orderId;
    // 必须不为空
    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]{5,20}", message = "asdfasdfasdfasfasfsaf")
    private String customer;
    // 必须是一个电子信箱地址
    @Email
    private String email;
    // 必须不为空
    @NotEmpty
    private String address;

    @Money
    private Double aDouble;
    // 必须不为 null
    @NotNull
    private Date createDate;
    // 嵌套验证
    @Valid
    private TestBean2 testBean2;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public TestBean2 getTestBean2() {
        return testBean2;
    }

    public void setTestBean2(TestBean2 testBean2) {
        this.testBean2 = testBean2;
    }
}
