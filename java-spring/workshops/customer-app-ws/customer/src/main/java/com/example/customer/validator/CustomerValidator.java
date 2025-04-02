package com.example.customer.validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.customer.model.Customer;

@Component 
public class CustomerValidator implements Validator {
  @Override 
  public boolean supports(Class<?> clazz) {
    return Customer.class.isAssignableFrom(clazz);
  }

  @Override 
  public void validate(Object obj, Errors errors) {
    Customer customer = (Customer) obj;
    String gender = customer.getGender().toLowerCase();
    String creditCardNo = customer.getCreditCardNumber();
    String creditCardExpiry = customer.getCreditCardExpiration();
    String creditCardCVV = customer.getCreditCardCVV();

    boolean isValidGender = gender.compareTo("male") == 0 || gender.compareTo("female") == 0 || gender.compareTo("other") == 0;
    boolean hasCreditCard = !creditCardNo.isBlank() || !creditCardExpiry.isBlank() || !creditCardCVV.isBlank();

    if(!isValidGender) errors.rejectValue("gender", "errors.customer.gender", "Customer's gender must only be either male, female or other");
    if(hasCreditCard) {
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"errors.customer", "creditCardNumber", "Credit Card Number is required");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"errors.customer", "creditCardExpiration", "Credit Card Expiry is required");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors,"errors.customer", "creditCardCVV", "Credit Card CVV is required");
    }
  }
}     
