package dev.epro.r0;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q17156477714449498069 {
    public static final AtomicLong a;

    static {
        int iTpuullyeahep;
        izmyclvb.qgayjvbiagej2(1383);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iTpuullyeahep = tpuullyeahep(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iTpuullyeahep != 0) {
                switch (iTpuullyeahep) {
                    case 1:
                        a = (AtomicLong) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native H13181800873099545702 a(C13199856549537327585 c13199856549537327585);

    public static final native C13199856549537327585 b(E9947071562186447382 e9947071562186447382);

    public static final native void c(C13199856549537327585 c13199856549537327585, String str, String str2);

    public static final native String d(Context context, int i, List list, Integer num, Integer num2);

    private static native int tpuullyeahep(Object[] objArr);
}
