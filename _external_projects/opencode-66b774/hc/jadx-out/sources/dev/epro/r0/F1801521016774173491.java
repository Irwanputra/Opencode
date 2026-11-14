package dev.epro.r0;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F1801521016774173491 {
    public static final List a;

    static {
        int iDuovdiywlxca;
        izmyclvb.dpqpjfpoanwt1(2115);
        Object[] objArr = new Object[8];
        while (true) {
            try {
                iDuovdiywlxca = duovdiywlxca(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iDuovdiywlxca != 0) {
                switch (iDuovdiywlxca) {
                    case 1:
                        a = (List) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native T13328233054345968915 a(Context context, String str, T13328233054345968915 t13328233054345968915);

    private static native int duovdiywlxca(Object[] objArr);
}
