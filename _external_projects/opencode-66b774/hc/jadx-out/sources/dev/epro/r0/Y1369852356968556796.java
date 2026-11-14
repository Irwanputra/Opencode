package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class Y1369852356968556796 {
    public static final Y1369852356968556796 a;
    public static final /* synthetic */ Y1369852356968556796[] b;

    static {
        int iKbstrcjwtvto;
        izmyclvb.qgayjvbiagej2(52);
        Object[] objArr = new Object[9];
        while (true) {
            try {
                iKbstrcjwtvto = kbstrcjwtvto(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iKbstrcjwtvto != 0) {
                switch (iKbstrcjwtvto) {
                    case 1:
                        a = (Y1369852356968556796) objArr[1];
                        continue;
                    case 2:
                        b = (Y1369852356968556796[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void dgydxoineoql(String str, int i, String str2);

    private static native int kbstrcjwtvto(Object[] objArr);

    public static native Y1369852356968556796 valueOf(String str);

    public static native Y1369852356968556796[] values();

    private Y1369852356968556796(String str, int i, String str2) {
        dgydxoineoql(str, i, str2);
    }
}
