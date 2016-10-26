package com.pilotojsf.validator.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PrimoValidator implements ConstraintValidator<Primo, Long> {

	@Override
	public void initialize(Primo constraintAnnotation) {
	}

	@Override
	public boolean isValid(Long value, ConstraintValidatorContext context) {
		if(value != null){
			if (value <= 1) {
				return false;
			}
			double raizQuadrada = Math.sqrt((double) value);
			for (long i = 2; i <= raizQuadrada; i++) {
				if (value % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
