package com.catalyst.springboot;

public @interface CustomAnnotation {
String[] value();
int count() default 0;

}
