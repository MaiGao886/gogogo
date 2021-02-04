package com.maigao.gogogo.entity.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
public class User implements Serializable {

    @Id
    private String id;//主键ID，使用字符串类型（64）
    private String username;//用户名，字符串（64）
    private String password;//密码，字符串（64）
    private String nickname;//昵称，字符串（64）
    private Integer age;//年龄，integer
    private Boolean sex;//性别
    private String mobile;//手机号，字符串（20）
    private String email;//邮箱，字符串（64）
    private Date createTime;//创建时间
    private Date loginTime;//登陆时间
    private Date lastLoginTime;//上次登陆时间
    private BigInteger count;//登陆次数

}
