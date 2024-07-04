package com.Annotation.org;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//tells when the working perform in compile or runtime 
public @interface SmartTV {

	String os();
	int height() default 56;
	int price();
	
}
