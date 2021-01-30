/**
 * 
 */
package com.nareshit.medilab.department.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * @author nsanda
 *
 */
@Data
public class DepartmentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	private String status;

}
