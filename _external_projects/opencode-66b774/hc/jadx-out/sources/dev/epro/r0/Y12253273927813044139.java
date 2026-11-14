package dev.epro.r0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y12253273927813044139 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, N16594346128251165883 n16594346128251165883) {
        try {
            constructor.newInstance(n16594346128251165883).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y12253273927813044139.b(java.lang.Class):int");
    }
}
