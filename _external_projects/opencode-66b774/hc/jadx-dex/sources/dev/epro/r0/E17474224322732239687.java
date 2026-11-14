package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E17474224322732239687 {
    public static final java.lang.Class a;
    public static final dev.epro.r0.Q17537606732352760497 b;
    public static final dev.epro.r0.Q17537606732352760497 c;
    public static final dev.epro.r0.Q17537606732352760497 d;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        a = cls;
        b = a(false);
        c = a(true);
        d = new dev.epro.r0.Q17537606732352760497();
    }

    public static dev.epro.r0.Q17537606732352760497 a(boolean z) {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (dev.epro.r0.Q17537606732352760497) cls.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z));
            } catch (java.lang.Throwable unused2) {
            }
        }
        return null;
    }

    public static void b(dev.epro.r0.Q17537606732352760497 q17537606732352760497, java.lang.Object obj, java.lang.Object obj2) {
        q17537606732352760497.getClass();
        dev.epro.r0.K17275736824900228431 k17275736824900228431 = (dev.epro.r0.K17275736824900228431) obj;
        dev.epro.r0.G7436022029974605191 g7436022029974605191 = k17275736824900228431.c;
        dev.epro.r0.G7436022029974605191 g74360220299746051912 = ((dev.epro.r0.K17275736824900228431) obj2).c;
        dev.epro.r0.G7436022029974605191 g74360220299746051913 = dev.epro.r0.G7436022029974605191.e;
        if (!g74360220299746051913.equals(g74360220299746051912)) {
            if (g74360220299746051913.equals(g7436022029974605191)) {
                int i = g7436022029974605191.a + g74360220299746051912.a;
                int[] iArrCopyOf = java.util.Arrays.copyOf(g7436022029974605191.b, i);
                java.lang.System.arraycopy(g74360220299746051912.b, 0, iArrCopyOf, g7436022029974605191.a, g74360220299746051912.a);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(g7436022029974605191.c, i);
                java.lang.System.arraycopy(g74360220299746051912.c, 0, objArrCopyOf, g7436022029974605191.a, g74360220299746051912.a);
                g7436022029974605191 = new dev.epro.r0.G7436022029974605191(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                g7436022029974605191.getClass();
                if (!g74360220299746051912.equals(g74360220299746051913)) {
                    if (!g7436022029974605191.d) {
                        dev.epro.r0.Z3383101362411723454.t();
                        return;
                    }
                    int i2 = g7436022029974605191.a + g74360220299746051912.a;
                    g7436022029974605191.a(i2);
                    java.lang.System.arraycopy(g74360220299746051912.b, 0, g7436022029974605191.b, g7436022029974605191.a, g74360220299746051912.a);
                    java.lang.System.arraycopy(g74360220299746051912.c, 0, g7436022029974605191.c, g7436022029974605191.a, g74360220299746051912.a);
                    g7436022029974605191.a = i2;
                }
            }
        }
        k17275736824900228431.c = g7436022029974605191;
    }

    public static boolean c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
