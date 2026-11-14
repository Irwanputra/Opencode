package dev.epro.r0;

import java.net.Socket;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class X8195653235079688712 implements E13046209274714950185 {
    public final String a;
    public final int b;
    public final int c;
    public final B13729205492206812220 d;
    public final int e;
    public final M14901764965811017490 f;
    public final B13729205492206812220 g;
    public final O8409066218305708966 h;
    public final C11673820590516852519 i;

    public static final /* synthetic */ class Z11244019023321623390 extends H4611829575853284164 implements B13729205492206812220 {
        public static final Z11244019023321623390 h;

        static {
            int iBfwfictcycqs;
            izmyclvb.qgayjvbiagej2(1061);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    iBfwfictcycqs = bfwfictcycqs(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (iBfwfictcycqs != 0) {
                    switch (iBfwfictcycqs) {
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

        private static native int bfwfictcycqs(Object[] objArr);

        private native void ttlcysveojld();

        @Override // dev.epro.r0.B13729205492206812220
        public final native Object invoke();

        public Z11244019023321623390() {
            super(0, Socket.class, izmyclvb.sb250e956f549(324), izmyclvb.sb250e956f549(325), 0);
            ttlcysveojld();
        }
    }

    static {
        izmyclvb.qgayjvbiagej2(1483);
        lddkyodlmnlh();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ X8195653235079688712(String str, int i, int i2, B13729205492206812220 b13729205492206812220, int i3, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, O8409066218305708966 o8409066218305708966, int i4, O18369580107802500074 o18369580107802500074) {
        Object[] objArrVpbhgvedjroy = vpbhgvedjroy(str, i, i2, b13729205492206812220, i3, m14901764965811017490, b137292054922068122202, o8409066218305708966, i4, o18369580107802500074);
        this((String) objArrVpbhgvedjroy[0], ((Integer) objArrVpbhgvedjroy[1]).intValue(), ((Integer) objArrVpbhgvedjroy[2]).intValue(), (B13729205492206812220) objArrVpbhgvedjroy[3], ((Integer) objArrVpbhgvedjroy[4]).intValue(), (M14901764965811017490) objArrVpbhgvedjroy[5], (B13729205492206812220) objArrVpbhgvedjroy[6], (O8409066218305708966) objArrVpbhgvedjroy[7]);
        kxjznwfgvgyg();
    }

    private native void kxjznwfgvgyg();

    private static native void lddkyodlmnlh();

    private native void viefnqawzwcz(String str, int i, int i2, B13729205492206812220 b13729205492206812220, int i3, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, O8409066218305708966 o8409066218305708966);

    private static native Object[] vpbhgvedjroy(String str, int i, int i2, B13729205492206812220 b13729205492206812220, int i3, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, O8409066218305708966 o8409066218305708966, int i4, O18369580107802500074 o18369580107802500074);

    public final native L1776201576658992480 b(C17200701318093115733 c17200701318093115733, R10697907419429218602 r10697907419429218602);

    @Override // java.lang.AutoCloseable
    public final native void close();

    @Override // dev.epro.r0.E13046209274714950185
    public final native L1776201576658992480 f(C17200701318093115733 c17200701318093115733, long j);

    @Override // dev.epro.r0.E13046209274714950185
    public final native void n(long j, byte[] bArr);

    @Override // dev.epro.r0.E13046209274714950185
    public final native void r(X7661261485523370262 x7661261485523370262);

    public X8195653235079688712(String str, int i, int i2, B13729205492206812220 b13729205492206812220, int i3, M14901764965811017490 m14901764965811017490, B13729205492206812220 b137292054922068122202, O8409066218305708966 o8409066218305708966) {
        str.getClass();
        b13729205492206812220.getClass();
        m14901764965811017490.getClass();
        b137292054922068122202.getClass();
        viefnqawzwcz(str, i, i2, b13729205492206812220, i3, m14901764965811017490, b137292054922068122202, o8409066218305708966);
    }
}
