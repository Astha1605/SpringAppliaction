package com.astha.singh.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryImpl implements ConstraintValidator<ValidCategory, String> {
    @Override
    public void initialize(ValidCategory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String type, ConstraintValidatorContext constraintValidatorContext) {
        if(type.contains("@")||type.contains("!"))
        {
            return  false;
        }
        return true;
    }
}
