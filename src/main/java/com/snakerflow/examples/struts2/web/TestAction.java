package com.snakerflow.examples.struts2.web;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.snakerflow.examples.struts2.web.flow.LeaveAction;

@Results( { @Result(name = LeaveAction.RESULT_RELOAD, location = "leave.action", type = "redirect"),
	@Result(name = LeaveAction.RESULT_APPLY, location = "/WEB-INF/content/flow/leave/apply.jsp")})
public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8438477164246557295L;
	public String execute() throws Exception {
		System.out.println("execute");
		return test();
	}
	
	public String test() throws Exception {
		System.out.println("test");
		return LeaveAction.RESULT_APPLY;
	}
}
