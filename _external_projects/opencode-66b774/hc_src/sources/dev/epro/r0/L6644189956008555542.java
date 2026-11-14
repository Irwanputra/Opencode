package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L6644189956008555542 implements P14826151584039718691 {
    public final F4096073349764486348 a;
    public final A4559761392562572984 b;
    public A4559761392562572984 c;

    public L6644189956008555542(Map map, F4096073349764486348 f4096073349764486348) {
        A4559761392562572984 a4559761392562572984;
        this.a = f4096073349764486348;
        if (map == null || map.isEmpty()) {
            a4559761392562572984 = null;
        } else {
            a4559761392562572984 = new A4559761392562572984(map.size());
            for (Map.Entry entry : map.entrySet()) {
                a4559761392562572984.n(entry.getKey(), entry.getValue());
            }
        }
        this.b = a4559761392562572984;
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final boolean c(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // dev.epro.r0.P14826151584039718691
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L6644189956008555542.d():java.util.Map");
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final Object e(String str) {
        A4559761392562572984 a4559761392562572984 = this.b;
        List list = a4559761392562572984 != null ? (List) a4559761392562572984.l(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && a4559761392562572984 != null) {
            List subList = list.subList(1, list.size());
            int f = a4559761392562572984.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = a4559761392562572984.c;
            Object obj = objArr[f];
            a4559761392562572984.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final R11800251031747375035 f(String str, B13729205492206812220 b13729205492206812220) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!M9216324016624295870.K(str.charAt(i))) {
                A4559761392562572984 a4559761392562572984 = this.c;
                if (a4559761392562572984 == null) {
                    long[] jArr = X4026756943680612204.a;
                    a4559761392562572984 = new A4559761392562572984();
                    this.c = a4559761392562572984;
                }
                Object g = a4559761392562572984.g(str);
                if (g == null) {
                    g = new ArrayList();
                    a4559761392562572984.n(str, g);
                }
                ((List) g).add(b13729205492206812220);
                return new I1632105416032993715(a4559761392562572984, str, b13729205492206812220, (byte) 9);
            }
        }
        S10973172697741180971.j("Registered key is empty or blank");
        return null;
    }
}
