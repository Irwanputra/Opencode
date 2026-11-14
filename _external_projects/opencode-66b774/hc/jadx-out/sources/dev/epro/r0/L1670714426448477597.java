package dev.epro.r0;

import android.content.Context;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class L1670714426448477597 {
    public static final L1670714426448477597 a;

    static {
        int iNptbrwxssuiz;
        izmyclvb.dpqpjfpoanwt1(2148);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iNptbrwxssuiz = nptbrwxssuiz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNptbrwxssuiz != 0) {
                switch (iNptbrwxssuiz) {
                    case 1:
                        a = (L1670714426448477597) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native N10074157612675057572 a(Context context, String str, String str2, Integer num, Integer num2, Integer num3);

    public static native /* synthetic */ N10074157612675057572 b(L1670714426448477597 l1670714426448477597, Context context, String str, String str2);

    private native void fcpiqskpxgza();

    private static native int nptbrwxssuiz(Object[] objArr);

    private L1670714426448477597() {
        fcpiqskpxgza();
    }
}
