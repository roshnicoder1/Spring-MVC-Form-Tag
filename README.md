# Spring-MVC-Form-Tag

# Annotations used


* @RequestMapping("/reservation")  
* @Controller  
* @ModelAttribute binds form data to the object 
Note - The value passed with the @ModelAttribute annotation should be the same to the modelAttribute value present in the view page.
 ``` 
  @RequestMapping("/submitForm")  
    public String submitForm(@ModelAttribute("reservation") Reservation res)  
{  
    return "confirmation-page";  
} 
```
in the view page

 <form:form action="submitForm" modelAttribute="reservation">  
 </form>
 
 
