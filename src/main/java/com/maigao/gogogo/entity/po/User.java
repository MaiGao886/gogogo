package com.maigao.gogogo.entity.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {

    @Id
    private String id;//主键ID，使用字符串类型（30）
    private String name;//名字，字符串（50）
    private Integer age;//年龄，integer
    private Boolean sex;//性别

}
