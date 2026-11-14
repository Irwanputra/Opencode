package dev.epro.litevpn;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class LiteVpnSession implements java.io.Closeable {
    public static final int e = -1;
    public final dev.epro.r0.E4004945083490752337 a;
    public final dev.epro.r0.R6949869166308759947 b;
    public final java.util.concurrent.atomic.AtomicReference c;
    public final long d;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(611);
    }

    public LiteVpnSession(java.lang.String str, dev.epro.r0.M15405369037958785483 m15405369037958785483, dev.epro.r0.E4004945083490752337 e4004945083490752337) {
        m15405369037958785483.getClass();
        e4004945083490752337.getClass();
        this.a = e4004945083490752337;
        this.b = new dev.epro.r0.R6949869166308759947((byte) 1);
        this.c = new java.util.concurrent.atomic.AtomicReference(null);
        dev.epro.litevpn.LiteVpnNative liteVpnNative = dev.epro.litevpn.LiteVpnNative.a;
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        dev.epro.r0.F5967275151281184700 f5967275151281184700 = m15405369037958785483 instanceof dev.epro.r0.F5967275151281184700 ? (dev.epro.r0.F5967275151281184700) m15405369037958785483 : null;
        long jCreate = liteVpnNative.create(bytes, this, f5967275151281184700 != null ? f5967275151281184700.a : 0);
        if (jCreate != 0) {
            this.d = jCreate;
        } else {
            dev.epro.r0.S10973172697741180971.m("Profile OpenVPN ditolak");
            throw null;
        }
    }

    private final boolean onNativeCanReportDestinationV1() {
        dev.epro.r0.S5790556442212423769 s5790556442212423769;
        return (this.b.a.get() & 1073741824) == 0 && (s5790556442212423769 = (dev.epro.r0.S5790556442212423769) this.c.get()) != null && s5790556442212423769.canReportDestination();
    }

    private final native boolean onNativeConfigureTun(int i, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, int i3, java.lang.String str4, java.lang.String[] strArr, int[] iArr, java.lang.String[] strArr2, int[] iArr2, boolean[] zArr, java.lang.String[] strArr3, int[] iArr3, boolean[] zArr2, boolean z, boolean z2);

    private final void onNativeDestinationV1(java.lang.String str, int i) {
        dev.epro.r0.S5790556442212423769 s5790556442212423769;
        if (!onNativeCanReportDestinationV1() || (s5790556442212423769 = (dev.epro.r0.S5790556442212423769) this.c.get()) == null) {
            return;
        }
        s5790556442212423769.onDestination(str, i);
    }

    private final native boolean onNativePacket(byte[] bArr);

    private final native boolean onNativeProtectSocket(int i, java.lang.String str, boolean z);

    private final native void onNativeRuntimeEvent(int i);

    private final void onNativeStateChanged(int i, int i2) {
        java.lang.Object obj;
        java.lang.Object next;
        dev.epro.r0.C526924999522076141.b.getClass();
        java.util.Iterator it = dev.epro.r0.C526924999522076141.h.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((dev.epro.r0.C526924999522076141) next).a == i) {
                    break;
                }
            }
        }
        dev.epro.r0.C526924999522076141 c526924999522076141 = (dev.epro.r0.C526924999522076141) next;
        if (c526924999522076141 == null) {
            c526924999522076141 = dev.epro.r0.C526924999522076141.f;
        }
        dev.epro.r0.L2851435820281061698.b.getClass();
        java.util.Iterator it2 = dev.epro.r0.L2851435820281061698.h.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (((dev.epro.r0.L2851435820281061698) next2).a == i2) {
                obj = next2;
                break;
            }
        }
        dev.epro.r0.L2851435820281061698 l2851435820281061698 = (dev.epro.r0.L2851435820281061698) obj;
        if (l2851435820281061698 == null) {
            l2851435820281061698 = dev.epro.r0.L2851435820281061698.e;
        }
        this.a.d(c526924999522076141, l2851435820281061698);
    }

    public final boolean b() {
        int iReconnect;
        dev.epro.r0.R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                iReconnect = dev.epro.litevpn.LiteVpnNative.a.reconnect(this.d, 0);
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        } else {
            iReconnect = e;
        }
        return iReconnect == 0;
    }

    public final void c() {
        dev.epro.litevpn.LiteVpnNative liteVpnNative = dev.epro.litevpn.LiteVpnNative.a;
        long j = this.d;
        liteVpnNative.stop(j);
        liteVpnNative.destroy(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        this.c.set(null);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.b.a;
        do {
            i = atomicInteger.get();
            if ((i & 1073741824) != 0) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 1073741824 | i));
        if (i == 0) {
            c();
        }
    }

    public final void d(dev.epro.r0.S5790556442212423769 s5790556442212423769) {
        dev.epro.r0.R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                if (dev.epro.litevpn.LiteVpnNative.a.setDestinationObserverV1(this.d, true) == 0) {
                    this.c.set(s5790556442212423769);
                }
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        }
    }

    public final void e(dev.epro.r0.Z12395694190652584839 z12395694190652584839) {
        int iStart;
        dev.epro.r0.R6949869166308759947 r6949869166308759947 = this.b;
        if ((r6949869166308759947.a.get() & 1073741824) != 0) {
            dev.epro.r0.S10973172697741180971.m("Sesi LiteVPN sudah ditutup");
            return;
        }
        java.lang.String str = z12395694190652584839.a;
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        byte[] bytes2 = z12395694190652584839.b.getBytes(charset);
        bytes2.getClass();
        byte[] bytes3 = z12395694190652584839.c.getBytes(charset);
        bytes3.getClass();
        byte[] bytes4 = z12395694190652584839.d.getBytes(charset);
        bytes4.getClass();
        try {
            boolean zA = r6949869166308759947.a();
            int i = e;
            if (zA) {
                try {
                    iStart = dev.epro.litevpn.LiteVpnNative.a.start(this.d, bytes, bytes2, bytes3, bytes4);
                } finally {
                    if (r6949869166308759947.b()) {
                        c();
                    }
                }
            } else {
                iStart = i;
            }
            if (iStart == i) {
                throw new java.lang.IllegalStateException("Sesi LiteVPN sudah ditutup");
            }
            if (iStart != 0) {
                throw new java.lang.IllegalStateException("Sesi LiteVPN gagal dimulai");
            }
            dev.epro.r0.O5378677881740157249.y0(0, bytes, 6);
            dev.epro.r0.O5378677881740157249.y0(0, bytes2, 6);
            dev.epro.r0.O5378677881740157249.y0(0, bytes3, 6);
            dev.epro.r0.O5378677881740157249.y0(0, bytes4, 6);
        } catch (java.lang.Throwable th) {
            dev.epro.r0.O5378677881740157249.y0(0, bytes, 6);
            dev.epro.r0.O5378677881740157249.y0(0, bytes2, 6);
            dev.epro.r0.O5378677881740157249.y0(0, bytes3, 6);
            dev.epro.r0.O5378677881740157249.y0(0, bytes4, 6);
            throw th;
        }
    }

    public final void g() {
        this.c.set(null);
        dev.epro.r0.R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                dev.epro.litevpn.LiteVpnNative.a.stop(this.d);
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        }
    }

    public final dev.epro.r0.O10786581066278972601 h(int i, byte[] bArr) {
        int iSubmitPacket;
        java.lang.Object obj = null;
        if (i < 0 || i > bArr.length) {
            dev.epro.r0.S10973172697741180971.j("Ukuran packet tidak valid");
            return null;
        }
        dev.epro.r0.R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                iSubmitPacket = dev.epro.litevpn.LiteVpnNative.a.submitPacket(this.d, bArr, i);
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        } else {
            iSubmitPacket = e;
        }
        dev.epro.r0.O10786581066278972601.b.getClass();
        if (iSubmitPacket == 0) {
            return dev.epro.r0.O10786581066278972601.c;
        }
        java.util.Iterator it = dev.epro.r0.O10786581066278972601.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((dev.epro.r0.O10786581066278972601) next).a == iSubmitPacket) {
                obj = next;
                break;
            }
        }
        dev.epro.r0.O10786581066278972601 o10786581066278972601 = (dev.epro.r0.O10786581066278972601) obj;
        return o10786581066278972601 == null ? dev.epro.r0.O10786581066278972601.e : o10786581066278972601;
    }
}
