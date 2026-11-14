package ads_mobile_sdk;

import dev.epro.r0.O17574792317020433029;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tn3 extends O17574792317020433029 {
    public static final Method a;

    static {
        Method method;
        try {
            method = String.class.getMethod("encodedLength", Charset.class);
        } catch (ReflectiveOperationException unused) {
            method = null;
        }
        a = method;
    }

    @Override // dev.epro.r0.O17574792317020433029
    public final int a(String str) {
        try {
            return ((Integer) a.invoke(str, StandardCharsets.UTF_8)).intValue();
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
