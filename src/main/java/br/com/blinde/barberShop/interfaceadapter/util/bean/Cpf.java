package br.com.blinde.barberShop.interfaceadapter.util.bean;

import br.com.blinde.barberShop.interfaceadapter.util.CpfValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {CpfValidator.class})
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD, ElementType.TYPE_PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface Cpf {
    String message() default "CPF/CNPJ inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}