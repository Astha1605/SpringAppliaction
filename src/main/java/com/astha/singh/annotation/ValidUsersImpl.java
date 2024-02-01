package com.astha.singh.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUsersImpl implements ConstraintValidator<ValidUsers, String> {
    @Override
    public void initialize(ValidUsers constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String mobileNumber, ConstraintValidatorContext constraintValidatorContext) {
        if(mobileNumber.contains("!")|| mobileNumber.contains("@")|| mobileNumber.contains("#"))
        {
            return false;
        }
        return true;
    }
}
