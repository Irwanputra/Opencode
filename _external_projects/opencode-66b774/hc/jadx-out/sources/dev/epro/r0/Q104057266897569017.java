package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class Q104057266897569017 {
    public static final Q104057266897569017 a;
    public static final Q104057266897569017 b;
    public static final Q104057266897569017 c;
    public static final Q104057266897569017 d;
    public static final /* synthetic */ Q104057266897569017[] e;

    static {
        int iDbvkxefrjraw;
        izmyclvb.qgayjvbiagej2(2038);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iDbvkxefrjraw = dbvkxefrjraw(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iDbvkxefrjraw != 0) {
                switch (iDbvkxefrjraw) {
                    case 1:
                        a = (Q104057266897569017) objArr[1];
                        continue;
                    case 2:
                        b = (Q104057266897569017) objArr[1];
                        continue;
                    case 3:
                        c = (Q104057266897569017) objArr[1];
                        continue;
                    case 4:
                        d = (Q104057266897569017) objArr[1];
                        continue;
                    case 5:
                        e = (Q104057266897569017[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int dbvkxefrjraw(Object[] objArr);

    private native void evdrgozveejf(String str, int i);

    public static native Q104057266897569017 valueOf(String str);

    public static native Q104057266897569017[] values();

    private Q104057266897569017(String str, int i) {
        evdrgozveejf(str, i);
    }
}
