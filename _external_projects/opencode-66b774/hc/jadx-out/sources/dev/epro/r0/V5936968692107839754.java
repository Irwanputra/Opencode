package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class V5936968692107839754 {
    public static final V5936968692107839754 a;
    public static final V5936968692107839754 b;
    public static final /* synthetic */ V5936968692107839754[] c;

    static {
        int iUhpcbfxfflut;
        izmyclvb.qgayjvbiagej2(2043);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iUhpcbfxfflut = uhpcbfxfflut(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iUhpcbfxfflut != 0) {
                switch (iUhpcbfxfflut) {
                    case 1:
                        a = (V5936968692107839754) objArr[1];
                        continue;
                    case 2:
                        b = (V5936968692107839754) objArr[1];
                        continue;
                    case 3:
                        c = (V5936968692107839754[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void ddiwziwfmxeh(String str, int i);

    private static native int uhpcbfxfflut(Object[] objArr);

    public static native V5936968692107839754 valueOf(String str);

    public static native V5936968692107839754[] values();

    private V5936968692107839754(String str, int i) {
        ddiwziwfmxeh(str, i);
    }
}
