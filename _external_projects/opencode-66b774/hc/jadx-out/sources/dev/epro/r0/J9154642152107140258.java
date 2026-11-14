package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class J9154642152107140258 implements G3816261926188113883 {
    public static final J9154642152107140258 a;

    static {
        int iNjjedfnzavzv;
        izmyclvb.dpqpjfpoanwt1(1842);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iNjjedfnzavzv = njjedfnzavzv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNjjedfnzavzv != 0) {
                switch (iNjjedfnzavzv) {
                    case 1:
                        a = (J9154642152107140258) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void fzvqbsrsikny();

    private static native int njjedfnzavzv(Object[] objArr);

    @Override // dev.epro.r0.G3816261926188113883
    public final native List a();

    private J9154642152107140258() {
        fzvqbsrsikny();
    }
}
