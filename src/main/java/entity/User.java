package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2002-2018
 * *
 *
 * @author Zhang Ling
 * @date 2018-11-30
 * @desc
 */
@Data
public class User implements Serializable {



	private Long id;

	private String userName;

	private String age;
}
