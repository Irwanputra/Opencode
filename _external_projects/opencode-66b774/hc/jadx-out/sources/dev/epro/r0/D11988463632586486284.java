package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D11988463632586486284 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int iPnlgqhnlhare;
        izmyclvb.oeynnivvrnts0(621);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iPnlgqhnlhare = pnlgqhnlhare(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iPnlgqhnlhare != 0) {
                switch (iPnlgqhnlhare) {
                    case 1:
                        a = (int[]) objArr[1];
                        continue;
                    case 2:
                        b = (int[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int pnlgqhnlhare(Object[] objArr);
}
