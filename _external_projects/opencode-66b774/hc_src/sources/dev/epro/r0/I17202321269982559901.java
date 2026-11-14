package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I17202321269982559901 {
    public static final I17202321269982559901 a;
    public static final Set b;

    static {
        int anwismfmcjcs;
        izmyclvb.dpqpjfpoanwt1(83);
        Object[] objArr = new Object[17];
        while (true) {
            try {
                anwismfmcjcs = anwismfmcjcs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (anwismfmcjcs != 0) {
                switch (anwismfmcjcs) {
                    case 1:
                        a = (I17202321269982559901) objArr[1];
                        continue;
                    case 2:
                        b = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(S791998171526486711 s791998171526486711, String str);

    private static native int anwismfmcjcs(Object[] objArr);

    public static native void b(String str, S791998171526486711 s791998171526486711, String str2, boolean z);

    private native void omnrraflqwou();

    public static final class Z11244019023321623390 {
        public final String a;
        public final int b;
        public final V12160570592803635690 c;
        public final boolean d;

        static {
            izmyclvb.dpqpjfpoanwt1(440);
        }

        private native void lbuqytzidasv(String str, int i, V12160570592803635690 v12160570592803635690, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, int i, V12160570592803635690 v12160570592803635690, boolean z) {
            str.getClass();
            lbuqytzidasv(str, i, v12160570592803635690, z);
        }
    }

    private I17202321269982559901() {
        omnrraflqwou();
    }
}
