package dev.epro.r0;

import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K5681489269626107017 implements E13046209274714950185 {
    public static final List m;
    public final String a;
    public final int b;
    public final int c;
    public final B13729205492206812220 d;
    public final boolean e;
    public final int f;
    public final SSLSocketFactory g;
    public final M14901764965811017490 h;
    public final B13729205492206812220 i;
    public final int j;
    public final O8409066218305708966 k;
    public final C11673820590516852519 l;

    public static final /* synthetic */ class Z11244019023321623390 extends H4611829575853284164 implements B13729205492206812220 {
        public static final Z11244019023321623390 h;

        static {
            int iQdpyvbqhphrx;
            izmyclvb.dpqpjfpoanwt1(362);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    iQdpyvbqhphrx = qdpyvbqhphrx(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (iQdpyvbqhphrx != 0) {
                    switch (iQdpyvbqhphrx) {
                        case 1:
                            h = (Z11244019023321623390) objArr[1];
                            break;
                        default:
                            throw null;
                    }
                    Arrays.fill(objArr, (Object) null);
                }
                return;
            }
        }

        private native void cgyqvbiurhad();

        private static native int qdpyvbqhphrx(Object[] objArr);

        @Override // dev.epro.r0.B13729205492206812220
        public final native Object invoke();

        public Z11244019023321623390() {
            super(0, Socket.class, izmyclvb.sb250e956f549(324), izmyclvb.sb250e956f549(325), 0);
            cgyqvbiurhad();
        }
    }

    static {
        int iLyeatjdiwhyr;
        izmyclvb.dpqpjfpoanwt1(264);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iLyeatjdiwhyr = lyeatjdiwhyr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iLyeatjdiwhyr != 0) {
                switch (iLyeatjdiwhyr) {
                    case 1:
                        m = (List) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, int] */
    public K5681489269626107017(String str, int i, int i2, B13729205492206812220 b13729205492206812220, boolean z, int i3, SSLSocketFactory sSLSocketFactory, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, int i4, O8409066218305708966 o8409066218305708966, int i5, O18369580107802500074 o18369580107802500074) {
        Object[] objArrQfdnjahlzlxv = qfdnjahlzlxv(str, i, i2, b13729205492206812220, z, i3, sSLSocketFactory, m14901764965811017490, b137292054922068122202, i4, o8409066218305708966, i5, o18369580107802500074);
        this((String) objArrQfdnjahlzlxv[0], ((Integer) objArrQfdnjahlzlxv[1]).intValue(), ((Integer) objArrQfdnjahlzlxv[2]).intValue(), (B13729205492206812220) objArrQfdnjahlzlxv[3], ((Integer) objArrQfdnjahlzlxv[4]).intValue(), ((Integer) objArrQfdnjahlzlxv[5]).intValue(), (SSLSocketFactory) objArrQfdnjahlzlxv[6], (M14901764965811017490) objArrQfdnjahlzlxv[7], (B13729205492206812220) objArrQfdnjahlzlxv[8], ((Integer) objArrQfdnjahlzlxv[9]).intValue(), (O8409066218305708966) objArrQfdnjahlzlxv[10]);
        dfexccfodwjt();
    }

    private native void dfexccfodwjt();

    private static native int lyeatjdiwhyr(Object[] objArr);

    private static native Object[] qfdnjahlzlxv(String str, int i, int i2, B13729205492206812220 b13729205492206812220, boolean z, int i3, SSLSocketFactory sSLSocketFactory, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, int i4, O8409066218305708966 o8409066218305708966, int i5, O18369580107802500074 o18369580107802500074);

    private native void tltklkhunamb(String str, int i, int i2, B13729205492206812220 b13729205492206812220, boolean z, int i3, SSLSocketFactory sSLSocketFactory, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, int i4, O8409066218305708966 o8409066218305708966);

    public final native void b(SSLSocket sSLSocket, int i);

    public final native L1776201576658992480 c(C17200701318093115733 c17200701318093115733, R10697907419429218602 r10697907419429218602);

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native void d(SSLSocket sSLSocket);

    @Override // dev.epro.r0.E13046209274714950185
    public final native L1776201576658992480 f(C17200701318093115733 c17200701318093115733, long j);

    @Override // dev.epro.r0.E13046209274714950185
    public final native void n(long j, byte[] bArr);

    @Override // dev.epro.r0.E13046209274714950185
    public final native void r(X7661261485523370262 x7661261485523370262);

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.dpqpjfpoanwt1(1442);
        }

        private native void lygkmlineghc();

        private native void nhoumqexvsrk(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            nhoumqexvsrk(o18369580107802500074);
        }

        private Y6921797927338498306() {
            lygkmlineghc();
        }
    }

    public K5681489269626107017(String str, int i, int i2, B13729205492206812220 b13729205492206812220, boolean z, int i3, SSLSocketFactory sSLSocketFactory, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, int i4, O8409066218305708966 o8409066218305708966) {
        str.getClass();
        b13729205492206812220.getClass();
        sSLSocketFactory.getClass();
        m14901764965811017490.getClass();
        b137292054922068122202.getClass();
        tltklkhunamb(str, i, i2, b13729205492206812220, z, i3, sSLSocketFactory, m14901764965811017490, b137292054922068122202, i4, o8409066218305708966);
    }
}
