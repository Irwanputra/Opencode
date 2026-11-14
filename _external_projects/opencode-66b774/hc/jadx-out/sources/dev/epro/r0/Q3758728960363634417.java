package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Q3758728960363634417 {
    public static final Z11244019023321623390 c;
    public static final Q3758728960363634417 d;
    public final G5228233348020726252 a;
    public final String b;

    static {
        int iNldpmoampyvf;
        izmyclvb.qgayjvbiagej2(433);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iNldpmoampyvf = nldpmoampyvf(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNldpmoampyvf != 0) {
                switch (iNldpmoampyvf) {
                    case 1:
                        c = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        d = (Q3758728960363634417) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Q3758728960363634417(G5228233348020726252 g5228233348020726252, String str, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrDzipevedkdlo = dzipevedkdlo(g5228233348020726252, str, i, o18369580107802500074);
        this((G5228233348020726252) objArrDzipevedkdlo[0], (String) objArrDzipevedkdlo[1]);
        vdrwpvcwkrjk1();
    }

    private native void bbkkhwoitfsg(G5228233348020726252 g5228233348020726252, String str);

    private static native Object[] dzipevedkdlo(G5228233348020726252 g5228233348020726252, String str, int i, O18369580107802500074 o18369580107802500074);

    private static native int nldpmoampyvf(Object[] objArr);

    private native void vdrwpvcwkrjk();

    private native void vdrwpvcwkrjk1();

    public final native String a(String str);

    public final native boolean b(String str);

    public final native JSONObject c();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1468);
        }

        public static native void a();

        public static native Q3758728960363634417 b(String str, JSONObject jSONObject);

        private native void hvnghywekdqa(O18369580107802500074 o18369580107802500074);

        private native void jzikyxtzhmyi();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            hvnghywekdqa(o18369580107802500074);
        }

        private Z11244019023321623390() {
            jzikyxtzhmyi();
        }
    }

    public Q3758728960363634417(G5228233348020726252 g5228233348020726252, String str) {
        g5228233348020726252.getClass();
        str.getClass();
        bbkkhwoitfsg(g5228233348020726252, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q3758728960363634417() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        vdrwpvcwkrjk();
    }
}
