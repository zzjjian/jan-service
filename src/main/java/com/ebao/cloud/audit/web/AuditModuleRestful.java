package com.ebao.cloud.audit.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/public/audit/module")
public class AuditModuleRestful {
	
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void create(HttpServletRequest request, HttpServletResponse response){
	}
	
	@RequestMapping(value="/{moduleId}", method=RequestMethod.GET)
	public void createaa(HttpServletRequest request, HttpServletResponse response, @PathVariable("moduleId") String moduleId){
		System.out.println(moduleId);
		
	}
	
}
