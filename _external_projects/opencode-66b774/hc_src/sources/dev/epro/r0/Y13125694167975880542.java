package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class Y13125694167975880542 {
    public static final long a;
    public static final X354568553596380848 b;
    public static final X354568553596380848 c;

    static {
        int riqegnhycvnr;
        izmyclvb.qgayjvbiagej2(1707);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                riqegnhycvnr = riqegnhycvnr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (riqegnhycvnr != 0) {
                switch (riqegnhycvnr) {
                    case 1:
                        a = ((Long) objArr[1]).longValue();
                        continue;
                    case 2:
                        b = (X354568553596380848) objArr[1];
                        continue;
                    case 3:
                        c = (X354568553596380848) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(int i, int i2, boolean z, U10174709222559481877 u10174709222559481877, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i3);

    private static native int riqegnhycvnr(Object[] objArr);
}
