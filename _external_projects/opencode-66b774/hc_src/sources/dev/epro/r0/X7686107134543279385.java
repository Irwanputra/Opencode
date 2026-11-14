package dev.epro.r0;

import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import dev.epro.litevpn.LiteVpnSession;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class X7686107134543279385 implements E4004945083490752337 {
    public static final Z11244019023321623390 s;
    public static final AtomicReference t;
    public final M15405369037958785483 a;
    public final B12153340152765236416 b;
    public final boolean c;
    public final L12639328004344855510 d;
    public final F4096073349764486348 e;
    public final F4096073349764486348 f;
    public final S5790556442212423769 g;
    public final Object h;
    public LiteVpnSession i;
    public ParcelFileDescriptor j;
    public FileInputStream k;
    public FileOutputStream l;
    public I8191527233909550595 m;
    public Thread n;

    /* renamed from: o, reason: collision with root package name */
    public R1119249027005566153 f575o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final AtomicReference r;

    static {
        int azphexssyqdt;
        izmyclvb.qgayjvbiagej2(2177);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                azphexssyqdt = azphexssyqdt(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (azphexssyqdt != 0) {
                switch (azphexssyqdt) {
                    case 1:
                        s = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        t = (AtomicReference) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ X7686107134543279385(dev.epro.r0.M15405369037958785483 r35, dev.epro.r0.B12153340152765236416 r36, boolean r37, dev.epro.r0.L12639328004344855510 r38, dev.epro.r0.F4096073349764486348 r39, dev.epro.r0.F4096073349764486348 r40, dev.epro.r0.S5790556442212423769 r41, int r42, dev.epro.r0.O18369580107802500074 r43) {
        /*
            r34 = this;
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r13
            java.lang.Object[] r0 = dbxmdmdsgwew(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = 0
            r2 = r0[r1]
            dev.epro.r0.M15405369037958785483 r2 = (dev.epro.r0.M15405369037958785483) r2
            r6 = r2
            r1 = 1
            r2 = r0[r1]
            dev.epro.r0.B12153340152765236416 r2 = (dev.epro.r0.B12153340152765236416) r2
            r7 = r2
            r1 = 2
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8 = r2
            r1 = 3
            r2 = r0[r1]
            dev.epro.r0.L12639328004344855510 r2 = (dev.epro.r0.L12639328004344855510) r2
            r9 = r2
            r1 = 4
            r2 = r0[r1]
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            r10 = r2
            r1 = 5
            r2 = r0[r1]
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            r11 = r2
            r1 = 6
            r2 = r0[r1]
            dev.epro.r0.S5790556442212423769 r2 = (dev.epro.r0.S5790556442212423769) r2
            r12 = r2
            r5 = r23
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r24 = r5
            r24.mkmaaoxkpozq()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7686107134543279385.<init>(dev.epro.r0.M15405369037958785483, dev.epro.r0.B12153340152765236416, boolean, dev.epro.r0.L12639328004344855510, dev.epro.r0.F4096073349764486348, dev.epro.r0.F4096073349764486348, dev.epro.r0.S5790556442212423769, int, dev.epro.r0.O18369580107802500074):void");
    }

    private static native int azphexssyqdt(Object[] objArr);

    private static native Object[] dbxmdmdsgwew(M15405369037958785483 m15405369037958785483, B12153340152765236416 b12153340152765236416, boolean z, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, S5790556442212423769 s5790556442212423769, int i, O18369580107802500074 o18369580107802500074);

    private native void fboxhjexiasy(M15405369037958785483 m15405369037958785483, B12153340152765236416 b12153340152765236416, boolean z, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, S5790556442212423769 s5790556442212423769);

    private native void mkmaaoxkpozq();

    public final native void a(VpnService.Builder builder);

    public final native void b();

    public final native boolean c(FileInputStream fileInputStream);

    public final native void d(C526924999522076141 c526924999522076141, L2851435820281061698 l2851435820281061698);

    public final native void e();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(889);
        }

        private native void jdivzjrqenow(O18369580107802500074 o18369580107802500074);

        private native void lmfyhddybobn();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            jdivzjrqenow(o18369580107802500074);
        }

        private Z11244019023321623390() {
            lmfyhddybobn();
        }
    }

    public X7686107134543279385(M15405369037958785483 m15405369037958785483, B12153340152765236416 b12153340152765236416, boolean z, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, S5790556442212423769 s5790556442212423769) {
        m15405369037958785483.getClass();
        b12153340152765236416.getClass();
        l12639328004344855510.getClass();
        f4096073349764486348.getClass();
        f40960733497644863482.getClass();
        fboxhjexiasy(m15405369037958785483, b12153340152765236416, z, l12639328004344855510, f4096073349764486348, f40960733497644863482, s5790556442212423769);
    }
}
