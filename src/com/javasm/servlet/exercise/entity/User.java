package com.javasm.servlet.exercise.entity;

import lombok.*;

/**
 * @author:
 * @className: User
 * @description:
 * @date: 2023/5/31 16:19
 * @since: 11
 */

// 有参/无参，set,get,toString方法
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    // 用户编号
    private Integer userId;
    // 用户名
    private String userName;
    // 用户密码
    private String userPassword;
    // 用户年龄
    private Integer userAge;
    // 用户电话
    private String userPhone;
    // 用户邮箱
    private String userEmail;
    // 用户备注
    private String userRemark;

}
