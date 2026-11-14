package dev.epro.r0;

import android.text.Spanned;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N13554879189805203977 {
    public static final H5336160545165318150 a;
    public static final H5336160545165318150 b;
    public static final H5336160545165318150 c;
    public static final H5336160545165318150 d;

    static {
        int iTrrydpylsjex;
        izmyclvb.dpqpjfpoanwt1(2261);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iTrrydpylsjex = trrydpylsjex(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iTrrydpylsjex != 0) {
                switch (iTrrydpylsjex) {
                    case 1:
                        a = (H5336160545165318150) objArr[1];
                        continue;
                    case 2:
                        b = (H5336160545165318150) objArr[1];
                        continue;
                    case 3:
                        c = (H5336160545165318150) objArr[1];
                        continue;
                    case 4:
                        d = (H5336160545165318150) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native String a(String str);

    public static final native H9390398899829886498 b(String str);

    public static final native M11181104712105445833 c(Spanned spanned);

    private static native int trrydpylsjex(Object[] objArr);
}
