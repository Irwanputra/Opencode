package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class D9957392468432150353 {
    public static final byte[] a;
    public static final byte[] b;

    static {
        int iKsrdocmedjvo;
        izmyclvb.oeynnivvrnts0(1138);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iKsrdocmedjvo = ksrdocmedjvo(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iKsrdocmedjvo != 0) {
                switch (iKsrdocmedjvo) {
                    case 1:
                        a = (byte[]) objArr[1];
                        continue;
                    case 2:
                        b = (byte[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int ksrdocmedjvo(Object[] objArr);
}
