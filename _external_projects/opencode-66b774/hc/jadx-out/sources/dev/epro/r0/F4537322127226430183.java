package dev.epro.r0;

import java.io.PrintStream;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class F4537322127226430183 {
    public static final PrintStream a;
    public static final PrintStream b;

    static {
        int iUkuhxkebcpqj;
        izmyclvb.dpqpjfpoanwt1(1013);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iUkuhxkebcpqj = ukuhxkebcpqj(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iUkuhxkebcpqj != 0) {
                switch (iUkuhxkebcpqj) {
                    case 1:
                        a = (PrintStream) objArr[1];
                        continue;
                    case 2:
                        b = (PrintStream) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int ukuhxkebcpqj(Object[] objArr);

    private native void vjrhaowhhryg();

    private F4537322127226430183() {
        vjrhaowhhryg();
    }
}
