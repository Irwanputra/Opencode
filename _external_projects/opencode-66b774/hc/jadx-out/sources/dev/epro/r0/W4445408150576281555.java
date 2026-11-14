package dev.epro.r0;

import com.trilead.ssh2.Connection;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W4445408150576281555 extends Connection {
    public static final Field i;
    public static final Field j;
    public static final Field k;
    public static final Field l;

    static {
        Field declaredField = Connection.class.getDeclaredField("tm");
        declaredField.setAccessible(true);
        i = declaredField;
        Field declaredField2 = Connection.class.getDeclaredField("authenticated");
        declaredField2.setAccessible(true);
        j = declaredField2;
        Field declaredField3 = Connection.class.getDeclaredField("cm");
        declaredField3.setAccessible(true);
        k = declaredField3;
        Field declaredField4 = Connection.class.getDeclaredField("proxyData");
        declaredField4.setAccessible(true);
        l = declaredField4;
    }

    public W4445408150576281555(String str, int i2) {
        super(str, i2);
    }
}
