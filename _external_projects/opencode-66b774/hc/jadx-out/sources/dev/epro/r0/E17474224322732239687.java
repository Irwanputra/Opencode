package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class E17474224322732239687 {
    public static final Class a;
    public static final Q17537606732352760497 b;
    public static final Q17537606732352760497 c;
    public static final Q17537606732352760497 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = a(false);
        c = a(true);
        d = new Q17537606732352760497();
    }

    public static Q17537606732352760497 a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (Q17537606732352760497) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void b(Q17537606732352760497 q17537606732352760497, Object obj, Object obj2) {
        q17537606732352760497.getClass();
        K17275736824900228431 k17275736824900228431 = (K17275736824900228431) obj;
        G7436022029974605191 g7436022029974605191 = k17275736824900228431.c;
        G7436022029974605191 g74360220299746051912 = ((K17275736824900228431) obj2).c;
        G7436022029974605191 g74360220299746051913 = G7436022029974605191.e;
        if (!g74360220299746051913.equals(g74360220299746051912)) {
            if (g74360220299746051913.equals(g7436022029974605191)) {
                int i = g7436022029974605191.a + g74360220299746051912.a;
                int[] iArrCopyOf = Arrays.copyOf(g7436022029974605191.b, i);
                System.arraycopy(g74360220299746051912.b, 0, iArrCopyOf, g7436022029974605191.a, g74360220299746051912.a);
                Object[] objArrCopyOf = Arrays.copyOf(g7436022029974605191.c, i);
                System.arraycopy(g74360220299746051912.c, 0, objArrCopyOf, g7436022029974605191.a, g74360220299746051912.a);
                g7436022029974605191 = new G7436022029974605191(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                g7436022029974605191.getClass();
                if (!g74360220299746051912.equals(g74360220299746051913)) {
                    if (!g7436022029974605191.d) {
                        Z3383101362411723454.t();
                        return;
                    }
                    int i2 = g7436022029974605191.a + g74360220299746051912.a;
                    g7436022029974605191.a(i2);
                    System.arraycopy(g74360220299746051912.b, 0, g7436022029974605191.b, g7436022029974605191.a, g74360220299746051912.a);
                    System.arraycopy(g74360220299746051912.c, 0, g7436022029974605191.c, g7436022029974605191.a, g74360220299746051912.a);
                    g7436022029974605191.a = i2;
                }
            }
        }
        k17275736824900228431.c = g7436022029974605191;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
