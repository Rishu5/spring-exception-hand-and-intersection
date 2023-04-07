package com.rishu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class Exceptionclass {

	@ResponseStatus(value = HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
	@ExceptionHandler({ NullPointerException.class })
	public String exceptionhandler(Model m) {
		m.addAttribute("msg", "Execption parent harircy is calling ");
		
		return "Exception";
	}

	@ControllerAdvice
	public class All_Exceptionclass {

		@ResponseStatus(value = HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
		@ExceptionHandler({ Exception.class })
		public String exceptionhandler(Model m) {
			m.addAttribute("msg", "Execption parent harircy is calling ");
			
			
			return "Exception";
		}
	}

}
