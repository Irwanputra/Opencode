package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class H5349957089681979109 {
    public static final H5349957089681979109 a;
    public static final H5336160545165318150 b;
    public static final Set c;
    public static final Set d;
    public static final Set e;
    public static final Set f;
    public static final Set g;
    public static final List h;

    static {
        int jrsbganbhrzg;
        izmyclvb.dpqpjfpoanwt1(1153);
        Object[] objArr = new Object[26];
        while (true) {
            try {
                jrsbganbhrzg = jrsbganbhrzg(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (jrsbganbhrzg != 0) {
                switch (jrsbganbhrzg) {
                    case 1:
                        a = (H5349957089681979109) objArr[1];
                        continue;
                    case 2:
                        b = (H5336160545165318150) objArr[1];
                        continue;
                    case 3:
                        c = (Set) objArr[1];
                        continue;
                    case 4:
                        d = (Set) objArr[1];
                        continue;
                    case 5:
                        e = (Set) objArr[1];
                        continue;
                    case 6:
                        f = (Set) objArr[1];
                        continue;
                    case 7:
                        g = (Set) objArr[1];
                        continue;
                    case 8:
                        h = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(ArrayList arrayList, String str, String str2);

    public static native String b(Z12230432157744414222 z12230432157744414222);

    public static native String c(String str);

    public static native Integer d(String str, String str2);

    public static native Integer e(String str, String str2);

    public static native boolean f(String str, String str2);

    public static native boolean g(String str);

    public static native Z12230432157744414222 h(String str, String str2, boolean z);

    public static native Y6921797927338498306 i(String str);

    public static native String j(String str, String str2);

    private static native int jrsbganbhrzg(Object[] objArr);

    public static native String k(String str);

    public static native String l(String str);

    public static native K4472753555329313235 m(K819625662997154347 k819625662997154347, K819625662997154347 k8196256629971543472, String str, T925642369849438467 t925642369849438467, boolean z);

    public static native String n(K819625662997154347 k819625662997154347, String str, String str2);

    private native void ngcudhcnzegf();

    public static native String o(String str);

    public static final class Y6921797927338498306 {
        public final String a;
        public final String b;

        static {
            izmyclvb.dpqpjfpoanwt1(1649);
        }

        private native void hzkvpuhapekg(String str, String str2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(String str, String str2) {
            str.getClass();
            str2.getClass();
            hzkvpuhapekg(str, str2);
        }
    }

    public static final class Z11244019023321623390 extends Exception {
        public final String a;

        static {
            izmyclvb.dpqpjfpoanwt1(1622);
        }

        private native void vpbtmlamsqub(String str);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        @Override // java.lang.Throwable
        public final native String toString();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Z11244019023321623390(String str) {
            super(str);
            str.getClass();
            vpbtmlamsqub(str);
        }
    }

    private H5349957089681979109() {
        ngcudhcnzegf();
    }
}
