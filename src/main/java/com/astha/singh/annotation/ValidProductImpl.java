package com.astha.singh.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidProductImpl implements ConstraintValidator<ValidProduct,Float> {
    @Override
    public void initialize(ValidProduct constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Float price, ConstraintValidatorContext constraintValidatorContext) {
        if(price==-10)
        {
            return false;
        }
        return true;
    }
}
