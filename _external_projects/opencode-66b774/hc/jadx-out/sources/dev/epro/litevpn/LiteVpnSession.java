package dev.epro.litevpn;

import dev.epro.r0.C526924999522076141;
import dev.epro.r0.E4004945083490752337;
import dev.epro.r0.F5967275151281184700;
import dev.epro.r0.L2851435820281061698;
import dev.epro.r0.M15405369037958785483;
import dev.epro.r0.O10786581066278972601;
import dev.epro.r0.O5378677881740157249;
import dev.epro.r0.R6949869166308759947;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.S5790556442212423769;
import dev.epro.r0.X7686107134543279385;
import dev.epro.r0.Z12395694190652584839;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class LiteVpnSession implements Closeable {
    public static final int e = -1;
    public final E4004945083490752337 a;
    public final R6949869166308759947 b;
    public final AtomicReference c;
    public final long d;

    static {
        izmyclvb.oeynnivvrnts0(611);
    }

    public LiteVpnSession(String str, M15405369037958785483 m15405369037958785483, E4004945083490752337 e4004945083490752337) {
        m15405369037958785483.getClass();
        e4004945083490752337.getClass();
        this.a = e4004945083490752337;
        this.b = new R6949869166308759947((byte) 1);
        this.c = new AtomicReference(null);
        LiteVpnNative liteVpnNative = LiteVpnNative.a;
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        F5967275151281184700 f5967275151281184700 = m15405369037958785483 instanceof F5967275151281184700 ? (F5967275151281184700) m15405369037958785483 : null;
        long jCreate = liteVpnNative.create(bytes, this, f5967275151281184700 != null ? f5967275151281184700.a : 0);
        if (jCreate != 0) {
            this.d = jCreate;
        } else {
            S10973172697741180971.m("Profile OpenVPN ditolak");
            throw null;
        }
    }

    private final boolean onNativeCanReportDestinationV1() {
        S5790556442212423769 s5790556442212423769;
        return (this.b.a.get() & 1073741824) == 0 && (s5790556442212423769 = (S5790556442212423769) this.c.get()) != null && s5790556442212423769.canReportDestination();
    }

    private final native boolean onNativeConfigureTun(int i, String str, int i2, String str2, String str3, int i3, String str4, String[] strArr, int[] iArr, String[] strArr2, int[] iArr2, boolean[] zArr, String[] strArr3, int[] iArr3, boolean[] zArr2, boolean z, boolean z2);

    private final void onNativeDestinationV1(String str, int i) {
        S5790556442212423769 s5790556442212423769;
        if (!onNativeCanReportDestinationV1() || (s5790556442212423769 = (S5790556442212423769) this.c.get()) == null) {
            return;
        }
        s5790556442212423769.onDestination(str, i);
    }

    private final native boolean onNativePacket(byte[] bArr);

    private final native boolean onNativeProtectSocket(int i, String str, boolean z);

    private final native void onNativeRuntimeEvent(int i);

    private final void onNativeStateChanged(int i, int i2) {
        Object obj;
        Object next;
        C526924999522076141.b.getClass();
        Iterator it = C526924999522076141.h.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C526924999522076141) next).a == i) {
                    break;
                }
            }
        }
        C526924999522076141 c526924999522076141 = (C526924999522076141) next;
        if (c526924999522076141 == null) {
            c526924999522076141 = C526924999522076141.f;
        }
        L2851435820281061698.b.getClass();
        Iterator it2 = L2851435820281061698.h.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((L2851435820281061698) next2).a == i2) {
                obj = next2;
                break;
            }
        }
        L2851435820281061698 l2851435820281061698 = (L2851435820281061698) obj;
        if (l2851435820281061698 == null) {
            l2851435820281061698 = L2851435820281061698.e;
        }
        ((X7686107134543279385) this.a).d(c526924999522076141, l2851435820281061698);
    }

    public final boolean b() {
        int iReconnect;
        R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                iReconnect = LiteVpnNative.a.reconnect(this.d, 0);
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
        LiteVpnNative liteVpnNative = LiteVpnNative.a;
        long j = this.d;
        liteVpnNative.stop(j);
        liteVpnNative.destroy(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        this.c.set(null);
        AtomicInteger atomicInteger = this.b.a;
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

    public final void d(S5790556442212423769 s5790556442212423769) {
        R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                if (LiteVpnNative.a.setDestinationObserverV1(this.d, true) == 0) {
                    this.c.set(s5790556442212423769);
                }
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        }
    }

    public final void e(Z12395694190652584839 z12395694190652584839) {
        int iStart;
        R6949869166308759947 r6949869166308759947 = this.b;
        if ((r6949869166308759947.a.get() & 1073741824) != 0) {
            S10973172697741180971.m("Sesi LiteVPN sudah ditutup");
            return;
        }
        String str = z12395694190652584839.a;
        Charset charset = StandardCharsets.UTF_8;
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
                    iStart = LiteVpnNative.a.start(this.d, bytes, bytes2, bytes3, bytes4);
                } finally {
                    if (r6949869166308759947.b()) {
                        c();
                    }
                }
            } else {
                iStart = i;
            }
            if (iStart == i) {
                throw new IllegalStateException("Sesi LiteVPN sudah ditutup");
            }
            if (iStart != 0) {
                throw new IllegalStateException("Sesi LiteVPN gagal dimulai");
            }
            O5378677881740157249.y0(0, bytes, 6);
            O5378677881740157249.y0(0, bytes2, 6);
            O5378677881740157249.y0(0, bytes3, 6);
            O5378677881740157249.y0(0, bytes4, 6);
        } catch (Throwable th) {
            O5378677881740157249.y0(0, bytes, 6);
            O5378677881740157249.y0(0, bytes2, 6);
            O5378677881740157249.y0(0, bytes3, 6);
            O5378677881740157249.y0(0, bytes4, 6);
            throw th;
        }
    }

    public final void g() {
        this.c.set(null);
        R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                LiteVpnNative.a.stop(this.d);
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        }
    }

    public final O10786581066278972601 h(int i, byte[] bArr) {
        int iSubmitPacket;
        Object obj = null;
        if (i < 0 || i > bArr.length) {
            S10973172697741180971.j("Ukuran packet tidak valid");
            return null;
        }
        R6949869166308759947 r6949869166308759947 = this.b;
        if (r6949869166308759947.a()) {
            try {
                iSubmitPacket = LiteVpnNative.a.submitPacket(this.d, bArr, i);
            } finally {
                if (r6949869166308759947.b()) {
                    c();
                }
            }
        } else {
            iSubmitPacket = e;
        }
        O10786581066278972601.b.getClass();
        if (iSubmitPacket == 0) {
            return O10786581066278972601.c;
        }
        Iterator it = O10786581066278972601.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((O10786581066278972601) next).a == iSubmitPacket) {
                obj = next;
                break;
            }
        }
        O10786581066278972601 o10786581066278972601 = (O10786581066278972601) obj;
        return o10786581066278972601 == null ? O10786581066278972601.e : o10786581066278972601;
    }
}
