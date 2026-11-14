package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class F5009348020292328112 {
    public static final F5009348020292328112 a;
    public static final F5009348020292328112 b;
    public static final /* synthetic */ F5009348020292328112[] c;

    static {
        int iJllulhbmxxrf;
        izmyclvb.dpqpjfpoanwt1(489);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iJllulhbmxxrf = jllulhbmxxrf(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iJllulhbmxxrf != 0) {
                switch (iJllulhbmxxrf) {
                    case 1:
                        a = (F5009348020292328112) objArr[1];
                        continue;
                    case 2:
                        b = (F5009348020292328112) objArr[1];
                        continue;
                    case 3:
                        c = (F5009348020292328112[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int jllulhbmxxrf(Object[] objArr);

    private native void usrndrfmdpop(String str, int i);

    public static native F5009348020292328112 valueOf(String str);

    public static native F5009348020292328112[] values();

    private F5009348020292328112(String str, int i) {
        usrndrfmdpop(str, i);
    }
}
