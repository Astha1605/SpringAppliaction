package com.astha.singh.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidItemPriceImpl implements ConstraintValidator<ValidItemPrice,Integer> {

    @Override
    public void initialize(ValidItemPrice constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer price, ConstraintValidatorContext constraintValidatorContext) {
       if(price<0)
       {
           return  false;
       }
       return true;
    }
}
