package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I8945912791264407237 {
    public static final Set a;

    static {
        int iLykjhkkhabvk;
        izmyclvb.dpqpjfpoanwt1(903);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iLykjhkkhabvk = lykjhkkhabvk(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iLykjhkkhabvk != 0) {
                switch (iLykjhkkhabvk) {
                    case 1:
                        a = (Set) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native N14388098974769733379 a(SSLSocket sSLSocket, byte[] bArr, F1826332872484833634 f1826332872484833634);

    private static native int lykjhkkhabvk(Object[] objArr);
}
