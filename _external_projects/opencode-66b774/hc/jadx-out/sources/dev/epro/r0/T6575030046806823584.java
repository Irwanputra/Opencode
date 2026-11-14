package dev.epro.r0;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T6575030046806823584 {
    public static final Set a;

    static {
        int iCyorpfmapsnu;
        izmyclvb.qgayjvbiagej2(1871);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iCyorpfmapsnu = cyorpfmapsnu(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iCyorpfmapsnu != 0) {
                switch (iCyorpfmapsnu) {
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

    public static final native boolean a(String str);

    public static final native ArrayList b(SpannableStringBuilder spannableStringBuilder);

    private static native int cyorpfmapsnu(Object[] objArr);
}
