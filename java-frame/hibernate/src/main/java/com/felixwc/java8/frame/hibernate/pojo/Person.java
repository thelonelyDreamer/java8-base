package com.felixwc.java8.frame.hibernate.pojo;

import javax.persistence.*;

/**
 * in order to learn java!
 * created at 2022/1/30 02:56
 *
 * @author wangchao
 */
@Table(name = "tb_person")
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
