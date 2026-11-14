package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O2460937933054358257 {
    public static final O12494175665883759871 a;

    static {
        int iJjecutsrujrd;
        izmyclvb.dpqpjfpoanwt1(464);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iJjecutsrujrd = jjecutsrujrd(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iJjecutsrujrd != 0) {
                switch (iJjecutsrujrd) {
                    case 1:
                        a = (O12494175665883759871) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(byte[] bArr, byte[] bArr2, X7661261485523370262 x7661261485523370262, long j, boolean z);

    private static native int jjecutsrujrd(Object[] objArr);
}
