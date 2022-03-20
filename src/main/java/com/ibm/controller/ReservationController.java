package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.model.Reservation;

@RequestMapping("/reservation")  
@Controller  
public class ReservationController {  
    @RequestMapping("/bookingForm")  
public String bookingForm(Model model)  
{  
      //create a reservation object   
    Reservation res=new Reservation();  
      //provide reservation object to the model   
    model.addAttribute("reservation", res);  
    return "reservation-page";  
}  

// @ModelAttribute binds form data to the object 
//Note - The value passed with the @ModelAttribute annotation should be the same to the modelAttribute value present in the view page.
    @RequestMapping("/submitForm")  
    public String submitForm(@ModelAttribute("reservation") Reservation res)  
{  
    return "confirmation-page";  
}  
}