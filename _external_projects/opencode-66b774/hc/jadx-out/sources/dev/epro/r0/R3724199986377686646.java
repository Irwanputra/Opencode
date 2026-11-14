package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class R3724199986377686646 implements AutoCloseable {
    public static final Z11244019023321623390 b;
    public final G9962891503274545270 a;

    static {
        int iKkdvdnlxyegi;
        izmyclvb.qgayjvbiagej2(2208);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iKkdvdnlxyegi = kkdvdnlxyegi(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iKkdvdnlxyegi != 0) {
                switch (iKkdvdnlxyegi) {
                    case 1:
                        b = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void jqhcwhrhhagv(G9962891503274545270 g9962891503274545270);

    private static native int kkdvdnlxyegi(Object[] objArr);

    private native void nylnxwmokiuc(G9962891503274545270 g9962891503274545270, O18369580107802500074 o18369580107802500074);

    public final native String b(String str);

    public final native synchronized Object c(Q5120342697613929281 q5120342697613929281);

    @Override // java.lang.AutoCloseable
    public final native synchronized void close();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1413);
        }

        public static native R3724199986377686646 a(String str, Z12395694190652584839 z12395694190652584839);

        private native void razwtpghlgkk(O18369580107802500074 o18369580107802500074);

        private native void wuhfybmqffsv();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            razwtpghlgkk(o18369580107802500074);
        }

        private Z11244019023321623390() {
            wuhfybmqffsv();
        }
    }

    private R3724199986377686646(G9962891503274545270 g9962891503274545270) {
        jqhcwhrhhagv(g9962891503274545270);
    }

    public /* synthetic */ R3724199986377686646(G9962891503274545270 g9962891503274545270, O18369580107802500074 o18369580107802500074) {
        this(g9962891503274545270);
        nylnxwmokiuc(g9962891503274545270, o18369580107802500074);
    }
}
