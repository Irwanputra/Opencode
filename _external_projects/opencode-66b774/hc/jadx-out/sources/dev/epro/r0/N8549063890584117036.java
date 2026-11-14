package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class N8549063890584117036 {
    public static final N8549063890584117036 a;
    public static final N8549063890584117036 b;
    public static final N8549063890584117036 c;
    public static final /* synthetic */ N8549063890584117036[] d;

    static {
        int iAklyjoighyhy;
        izmyclvb.dpqpjfpoanwt1(1136);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                iAklyjoighyhy = aklyjoighyhy(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iAklyjoighyhy != 0) {
                switch (iAklyjoighyhy) {
                    case 1:
                        a = (N8549063890584117036) objArr[1];
                        continue;
                    case 2:
                        b = (N8549063890584117036) objArr[1];
                        continue;
                    case 3:
                        c = (N8549063890584117036) objArr[1];
                        continue;
                    case 4:
                        d = (N8549063890584117036[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int aklyjoighyhy(Object[] objArr);

    private native void obduqdnbvobd(String str, int i);

    public static native N8549063890584117036 valueOf(String str);

    public static native N8549063890584117036[] values();

    private N8549063890584117036(String str, int i) {
        obduqdnbvobd(str, i);
    }
}
