package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T1560950644986966961 {
    public static final ArrayList a;
    public static final List b;
    public static final Set c;

    static {
        int iVfdrymlbywnq;
        izmyclvb.qgayjvbiagej2(852);
        Object[] objArr = new Object[14];
        while (true) {
            try {
                iVfdrymlbywnq = vfdrymlbywnq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iVfdrymlbywnq != 0) {
                switch (iVfdrymlbywnq) {
                    case 1:
                        a = (ArrayList) objArr[1];
                        continue;
                    case 2:
                        b = (List) objArr[1];
                        continue;
                    case 3:
                        c = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native String a(String str);

    public static final native List b(Collection collection);

    public static final native boolean c(String str);

    public static final native boolean d(String str, V12289395887091091650 v12289395887091091650);

    public static final native boolean e(String str, boolean z);

    public static final native String f(String str);

    public static final native Integer g(H5889618771160323474 h5889618771160323474, String str);

    public static final native ArrayList h(H5889618771160323474 h5889618771160323474, Collection collection, V12289395887091091650 v12289395887091091650);

    public static final native ArrayList i(H5889618771160323474 h5889618771160323474, V12289395887091091650 v12289395887091091650);

    public static final native boolean j(H5889618771160323474 h5889618771160323474, String str);

    private static native int vfdrymlbywnq(Object[] objArr);
}
