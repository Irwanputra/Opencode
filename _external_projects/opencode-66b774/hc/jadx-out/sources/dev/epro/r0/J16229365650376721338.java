package dev.epro.r0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface J16229365650376721338 {
    Q4387574467995849280 cls() default Q4387574467995849280.c;

    Q9140341247415722307 elementType() default Q9140341247415722307.a;

    int index() default 0;

    boolean optional() default false;

    int tagNumber() default -1;

    R14870022343596685520 tagging() default R14870022343596685520.a;

    Q9140341247415722307 type();
}
