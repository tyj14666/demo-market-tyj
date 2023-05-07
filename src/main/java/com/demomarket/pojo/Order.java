package com.demomarket.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName p_order
 */
@TableName(value ="p_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = "handler")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order implements Serializable {
    /**
     * 序号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 删除时间
     */
    private Date deletedAt;

    /**
     * 用户id
     */
//    private Integer userId;

    /**
     * iPhone14
     */
    private String productName;

    /**
     * 6800
     */
    private String totalPrice;

    /**
     * 1
     */
    private Integer count;

    /**
     * 6800
     */
    private String unitPrice;

    /**
     * 0 未支付，1已支付
     */
    private Integer status;

    /**
     * 1 支付宝 2微信
     */
    private Integer payType;


    @TableField(exist = false)
    private User user;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}