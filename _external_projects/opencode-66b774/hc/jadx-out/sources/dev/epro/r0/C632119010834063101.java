package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class C632119010834063101 {
    public static final List a;
    public static final List b;
    public static final List c;

    static {
        int iGqjmbnybluha;
        izmyclvb.oeynnivvrnts0(884);
        Object[] objArr = new Object[14];
        while (true) {
            try {
                iGqjmbnybluha = gqjmbnybluha(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGqjmbnybluha != 0) {
                switch (iGqjmbnybluha) {
                    case 1:
                        a = (List) objArr[1];
                        continue;
                    case 2:
                        b = (List) objArr[1];
                        continue;
                    case 3:
                        c = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(int i, M3727281027331139839 m3727281027331139839, Q7430090668634766253 q7430090668634766253, T12100831175298321930 t12100831175298321930);

    public static final native void b(Q7430090668634766253 q7430090668634766253, T12100831175298321930 t12100831175298321930, int i, M3727281027331139839 m3727281027331139839, int i2);

    private static native int gqjmbnybluha(Object[] objArr);
}
