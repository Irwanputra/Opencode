package p131.p161.p211.p212;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぅみぱぎぎ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public @interface InterfaceC2526 {
    boolean nullSafe() default true;

    Class<?> value();
}
