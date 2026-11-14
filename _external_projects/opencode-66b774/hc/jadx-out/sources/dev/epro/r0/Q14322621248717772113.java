package dev.epro.r0;

import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import dev.epro.httpcustom.service.CustomVpnService;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Q14322621248717772113 {
    public static final Q14322621248717772113 a;
    public static final List b;

    public static final class Z11244019023321623390 {
        public final String a;
        public final String b;
        public final int c;
        public final String d;
        public final String e;
        public final int f;
        public final String g;

        static {
            izmyclvb.qgayjvbiagej2(1027);
        }

        public Z11244019023321623390(String str, String str2, int i, String str3, String str4, int i2, String str5) {
            blkiaucijdbg(str, str2, i, str3, str4, i2, str5);
            blkiaucijdbg1(str, str2, i, str3, str4, i2, str5);
        }

        private static native void blkiaucijdbg(String str, String str2, int i, String str3, String str4, int i2, String str5);

        private native void blkiaucijdbg1(String str, String str2, int i, String str3, String str4, int i2, String str5);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();
    }

    static {
        int iZhpjamimtbkp;
        izmyclvb.qgayjvbiagej2(1754);
        Object[] objArr = new Object[14];
        while (true) {
            try {
                iZhpjamimtbkp = zhpjamimtbkp(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iZhpjamimtbkp != 0) {
                switch (iZhpjamimtbkp) {
                    case 1:
                        a = (Q14322621248717772113) objArr[1];
                        continue;
                    case 2:
                        b = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(VpnService.Builder builder, Z11244019023321623390 z11244019023321623390, String str, String str2, boolean z);

    public static native String b(String str);

    public static native Z11244019023321623390 c(Z11244019023321623390 z11244019023321623390, String str, String str2);

    public static native void d(CustomVpnService customVpnService, Z11244019023321623390 z11244019023321623390, String str, int i, int i2, int i3, boolean z);

    public static native String e(String str);

    public static native String f(String str);

    public static native String g(String str);

    public static native int h(Integer num);

    public static native Z11244019023321623390 i();

    private native void whfbaavefalc();

    private static native int zhpjamimtbkp(Object[] objArr);

    public static final class Y6921797927338498306 {
        public final ParcelFileDescriptor a;
        public final Z11244019023321623390 b;
        public final String c;
        public final boolean d;

        static {
            izmyclvb.qgayjvbiagej2(120);
        }

        private native void wcwvkoztmptv(ParcelFileDescriptor parcelFileDescriptor, Z11244019023321623390 z11244019023321623390, String str, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(ParcelFileDescriptor parcelFileDescriptor, Z11244019023321623390 z11244019023321623390, String str, boolean z) {
            parcelFileDescriptor.getClass();
            z11244019023321623390.getClass();
            str.getClass();
            wcwvkoztmptv(parcelFileDescriptor, z11244019023321623390, str, z);
        }
    }

    private Q14322621248717772113() {
        whfbaavefalc();
    }
}
