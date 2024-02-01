package com.astha.singh.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidOrdersImpl implements ConstraintValidator<ValidOrders,String> {
    @Override
    public void initialize(ValidOrders constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String summary, ConstraintValidatorContext constraintValidatorContext) {
        if(summary.contains("@"))
        {
            return  false;
        }
        return true;
    }
}
