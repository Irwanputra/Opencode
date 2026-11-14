package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U10392890513846982133 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final float e;

    static {
        int iTgeritowmpok;
        izmyclvb.qgayjvbiagej2(612);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iTgeritowmpok = tgeritowmpok(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iTgeritowmpok != 0) {
                switch (iTgeritowmpok) {
                    case 1:
                        a = ((Long) objArr[1]).longValue();
                        continue;
                    case 2:
                        b = ((Long) objArr[1]).longValue();
                        continue;
                    case 3:
                        c = ((Long) objArr[1]).longValue();
                        continue;
                    case 4:
                        d = ((Long) objArr[1]).longValue();
                        continue;
                    case 5:
                        e = ((Float) objArr[1]).floatValue();
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native void a(X11638668447546090163 x11638668447546090163, K2746982608131049817 k2746982608131049817, X16042184966849612101 x16042184966849612101, M3727281027331139839 m3727281027331139839, int i);

    public static final native void b(Q12424376437589853585 q12424376437589853585, long j, long j2, M3727281027331139839 m3727281027331139839, int i);

    public static final native void c(Z7022156542152740569 z7022156542152740569, String str, String str2, String str3, long j, long j2, long j3, long j4, I1722681268793429505 i1722681268793429505, String str4, float f, float f2, float f3, K1823399244298350623 k1823399244298350623, M3727281027331139839 m3727281027331139839, int i, int i2, int i3);

    public static final native void d(X11638668447546090163 x11638668447546090163, Long l, X16042184966849612101 x16042184966849612101, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i);

    private static native int tgeritowmpok(Object[] objArr);
}
