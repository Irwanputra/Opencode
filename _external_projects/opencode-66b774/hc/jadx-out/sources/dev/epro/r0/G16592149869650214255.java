package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class G16592149869650214255 implements V5566771124704147141 {
    public static final G16592149869650214255 a;
    public static final Q1741002393366009330 b;

    static {
        int iHusaitrekzwu;
        izmyclvb.dpqpjfpoanwt1(858);
        Object[] objArr = new Object[11];
        while (true) {
            try {
                iHusaitrekzwu = husaitrekzwu(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHusaitrekzwu != 0) {
                switch (iHusaitrekzwu) {
                    case 1:
                        a = (G16592149869650214255) objArr[1];
                        continue;
                    case 2:
                        b = (Q1741002393366009330) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int husaitrekzwu(Object[] objArr);

    private native void kmgbdzqmongi();

    @Override // dev.epro.r0.V5566771124704147141
    public final native U5098391714541788053 a(byte[] bArr);

    @Override // dev.epro.r0.V5566771124704147141
    public final native byte[] b(U5098391714541788053 u5098391714541788053);

    @Override // dev.epro.r0.V5566771124704147141
    public final native Object c(B13729205492206812220 b13729205492206812220);

    @Override // dev.epro.r0.V5566771124704147141
    public final native Object d(B13729205492206812220 b13729205492206812220);

    private G16592149869650214255() {
        kmgbdzqmongi();
    }
}
