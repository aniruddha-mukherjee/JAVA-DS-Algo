package com.example.helloworld;

import java.lang.annotation.Documented;

@Documented
@interface sample {
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	// Note use of array
	String[] reviewers();
}

