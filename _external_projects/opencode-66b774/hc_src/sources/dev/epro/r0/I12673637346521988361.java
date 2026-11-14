package dev.epro.r0;

import android.net.Network;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class I12673637346521988361 {
    public static final L15510417080911867038 a;

    static {
        int wxaikjeoekou;
        izmyclvb.dpqpjfpoanwt1(1067);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                wxaikjeoekou = wxaikjeoekou(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (wxaikjeoekou != 0) {
                switch (wxaikjeoekou) {
                    case 1:
                        a = (L15510417080911867038) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native InetAddress a(String str);

    public static final native ArrayList b(List list);

    public static final native List c(Network network, String str);

    private static native int wxaikjeoekou(Object[] objArr);
}
