package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P6459795353910001516 {
    public static final Z17301329922361444493 d = Z17301329922361444493.a(P6459795353910001516.class);
    public final String a;
    public final String b;
    public final List c;

    public P6459795353910001516(String str, List list) {
        new ArrayList();
        this.c = list;
        this.a = str.concat(".enabled");
        this.b = str.concat(".algorithms");
    }

    public final String[] a(String[] strArr) {
        String[] strArr2 = (String[]) Collections.EMPTY_SET.toArray(new String[0]);
        Z17301329922361444493 z17301329922361444493 = d;
        if (strArr == null) {
            z17301329922361444493.getClass();
            return strArr2;
        }
        if (Boolean.parseBoolean(System.getProperty(this.a, "true"))) {
            return (String[]) Arrays.stream(strArr).filter(new Predicate() { // from class: dev.epro.r0.H13706318143380739575
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str = (String) obj;
                    new ArrayList();
                    String str2 = P6459795353910001516.this.b;
                    return !((System.getProperty(str2) == null || System.getProperty(str2).isEmpty()) ? r2.c : Arrays.asList(System.getProperty(str2).split(","))).contains(str);
                }
            }).toArray(new Q10266329388235177869());
        }
        z17301329922361444493.getClass();
        return strArr;
    }
}
