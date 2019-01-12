package com.nano.annotation;

public @interface ClassPreamble
{
	String author();

	String createdDate();

	int currentRevision() default 1;

	String lastModified() default "N/A";

	String lastMdifiedBy() default "N/A";

	String[] reviewers();
}
