package com.mwkj.mongodb.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String name;

    private Integer age;

}
