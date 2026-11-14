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

/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public R1119249027005566153 f575o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final AtomicReference r;

    static {
        int iAzphexssyqdt;
        izmyclvb.qgayjvbiagej2(2177);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iAzphexssyqdt = azphexssyqdt(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iAzphexssyqdt != 0) {
                switch (iAzphexssyqdt) {
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
    public /* synthetic */ X7686107134543279385(M15405369037958785483 m15405369037958785483, B12153340152765236416 b12153340152765236416, boolean z, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, S5790556442212423769 s5790556442212423769, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrDbxmdmdsgwew = dbxmdmdsgwew(m15405369037958785483, b12153340152765236416, z, l12639328004344855510, f4096073349764486348, f40960733497644863482, s5790556442212423769, i, o18369580107802500074);
        this((M15405369037958785483) objArrDbxmdmdsgwew[0], (B12153340152765236416) objArrDbxmdmdsgwew[1], ((Integer) objArrDbxmdmdsgwew[2]).intValue(), (L12639328004344855510) objArrDbxmdmdsgwew[3], (F4096073349764486348) objArrDbxmdmdsgwew[4], (F4096073349764486348) objArrDbxmdmdsgwew[5], (S5790556442212423769) objArrDbxmdmdsgwew[6]);
        mkmaaoxkpozq();
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
