package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.Phonepay;
import com.webcore.app.easyemi.master.service.PhonepayService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path ="masterphonepay")
public class PhonepayController
{
   @Autowired
	PhonepayService ps;
   @RequestMapping(value="registerPhonepaydata",method = RequestMethod.POST)
   public Phonepay registerPhonepaydata(@RequestBody Phonepay phonepay)
   {
	   ps.registerPhonepay(phonepay);
	   return phonepay;
   }
	
   @RequestMapping(value="getPhonepaydata/{phonepay_Id}",method = RequestMethod.GET)
   public Phonepay fetchPhonepaydata(@PathVariable("phonepay_Id") int phonepayid)
   {
	   Phonepay phonepay=ps.getPhonepaydata(phonepayid);
	   
	   return phonepay;
   }
	
   @RequestMapping(value="getallPhonepaydata",method = RequestMethod.GET)
   public List<Phonepay> fetchallPhonepaydata()
   {
	   List<Phonepay> phonepaylist=ps.getallPhonepaydata();
	   return phonepaylist;
   }
}
