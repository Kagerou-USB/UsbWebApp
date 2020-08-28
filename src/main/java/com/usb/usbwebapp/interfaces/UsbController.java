package com.usb.usbwebapp.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsbController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "こんにちは、USB!!!";
	}
}