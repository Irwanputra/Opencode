package p000.p001.p008;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p000.AbstractC0592;
import p000.C0595;
import p000.C0597;
import p000.C0706;
import p000.C0712;
import p000.EnumC0721;
import p000.InterfaceC0717;
import p000.p001.AbstractC0631;
import p000.p001.C0629;
import p000.p001.p003.C0611;
import p000.p001.p003.C0614;
import p000.p001.p003.C0615;
import p000.p001.p003.C0618;
import p000.p001.p003.InterfaceC0612;
import p000.p001.p007.C0643;
import p000.p001.p008.C0663;
import p034.p095.C1687;
import p243.AbstractC2806;
import p243.C2801;
import p243.C2810;
import p243.C2817;
import p243.C2819;
import p243.InterfaceC2822;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0679 implements InterfaceC0612 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C2801 f4543;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final C2801 f4544;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final C2801 f4545;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C2801 f4546;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final C2801 f4547;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C2801 f4548;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final List<C2801> f4549;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final List<C2801> f4550;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final C2801 f4551;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final C2801 f4552;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0643 f4553;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0654 f4554;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC0717.InterfaceC0718 f4555;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C0663 f4556;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0680 extends AbstractC2806 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f4557;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public long f4559;

        public C0680(InterfaceC2827 interfaceC2827) {
            super(interfaceC2827);
            this.f4557 = false;
            this.f4559 = 0L;
        }

        @Override // p243.AbstractC2806, p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10474.close();
            m1922(null);
        }

        @Override // p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            try {
                long mo1762 = this.f10474.mo1762(c2819, j);
                if (mo1762 > 0) {
                    this.f4559 += mo1762;
                }
                return mo1762;
            } catch (IOException e) {
                m1922(e);
                throw e;
            }
        }

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public final void m1922(IOException iOException) {
            if (this.f4557) {
                return;
            }
            this.f4557 = true;
            C0679 c0679 = C0679.this;
            c0679.f4553.m1855(false, c0679, this.f4559, iOException);
        }
    }

    static {
        C2801 m4843 = C2801.m4843("connection");
        f4546 = m4843;
        C2801 m48432 = C2801.m4843("host");
        f4548 = m48432;
        C2801 m48433 = C2801.m4843("keep-alive");
        f4544 = m48433;
        C2801 m48434 = C2801.m4843("proxy-connection");
        f4543 = m48434;
        C2801 m48435 = C2801.m4843("transfer-encoding");
        f4551 = m48435;
        C2801 m48436 = C2801.m4843("te");
        f4545 = m48436;
        C2801 m48437 = C2801.m4843("encoding");
        f4552 = m48437;
        C2801 m48438 = C2801.m4843("upgrade");
        f4547 = m48438;
        f4549 = C0629.m1808(m4843, m48432, m48433, m48434, m48436, m48435, m48437, m48438, C0671.f4521, C0671.f4519, C0671.f4518, C0671.f4523);
        f4550 = C0629.m1808(m4843, m48432, m48433, m48434, m48436, m48435, m48437, m48438);
    }

    public C0679(C0706 c0706, InterfaceC0717.InterfaceC0718 interfaceC0718, C0643 c0643, C0654 c0654) {
        this.f4555 = interfaceC0718;
        this.f4553 = c0643;
        this.f4554 = c0654;
    }

    @Override // p000.p001.p003.InterfaceC0612
    public void cancel() {
        C0663 c0663 = this.f4556;
        if (c0663 != null) {
            c0663.m1888(EnumC0653.CANCEL);
        }
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: 〺つふすそ */
    public void mo1751(C0595 c0595) {
        int i;
        C0663 c0663;
        boolean z;
        if (this.f4556 != null) {
            return;
        }
        boolean z2 = c0595.f4251 != null;
        C0597 c0597 = c0595.f4247;
        ArrayList arrayList = new ArrayList(c0597.m1744() + 4);
        arrayList.add(new C0671(C0671.f4521, c0595.f4246));
        arrayList.add(new C0671(C0671.f4519, C1687.m3727(c0595.f4248)));
        String m1743 = c0595.f4247.m1743("Host");
        if (m1743 != null) {
            arrayList.add(new C0671(C0671.f4523, m1743));
        }
        arrayList.add(new C0671(C0671.f4518, c0595.f4248.f4647));
        int m1744 = c0597.m1744();
        for (int i2 = 0; i2 < m1744; i2++) {
            C2801 m4843 = C2801.m4843(c0597.m1741(i2).toLowerCase(Locale.US));
            if (!f4549.contains(m4843)) {
                arrayList.add(new C0671(m4843, c0597.m1745(i2)));
            }
        }
        C0654 c0654 = this.f4554;
        boolean z3 = !z2;
        synchronized (c0654.f4448) {
            synchronized (c0654) {
                if (c0654.f4435 > 1073741823) {
                    c0654.m1876(EnumC0653.REFUSED_STREAM);
                }
                if (c0654.f4433) {
                    throw new C0672();
                }
                i = c0654.f4435;
                c0654.f4435 = i + 2;
                c0663 = new C0663(i, c0654, z3, false, arrayList);
                z = !z2 || c0654.f4450 == 0 || c0663.f4478 == 0;
                if (c0663.m1882()) {
                    c0654.f4449.put(Integer.valueOf(i), c0663);
                }
            }
            C0667 c0667 = c0654.f4448;
            synchronized (c0667) {
                if (c0667.f4505) {
                    throw new IOException("closed");
                }
                c0667.m1904(z3, i, arrayList);
            }
        }
        if (z) {
            c0654.f4448.flush();
        }
        this.f4556 = c0663;
        C0663.C0665 c0665 = c0663.f4480;
        long j = ((C0615) this.f4555).f4297;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0665.mo4857(j, timeUnit);
        this.f4556.f4488.mo4857(((C0615) this.f4555).f4305, timeUnit);
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: くし〴〺ぅ */
    public AbstractC0592 mo1754(C0712 c0712) {
        this.f4553.f4379.getClass();
        String m1743 = c0712.f4754.m1743("Content-Type");
        if (m1743 == null) {
            m1743 = null;
        }
        long m1773 = C0614.m1773(c0712);
        C0680 c0680 = new C0680(this.f4556.f4477);
        Logger logger = C2810.f10480;
        return new C0611(m1743, m1773, new C2817(c0680));
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: げつ〴ぬぐ */
    public void mo1755() {
        ((C0663.C0666) this.f4556.m1889()).close();
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: づざかべべ */
    public InterfaceC2822 mo1756(C0595 c0595, long j) {
        return this.f4556.m1889();
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: なぎぱいぢぎ */
    public C0712.C0713 mo1757(boolean z) {
        List<C0671> list;
        C0663 c0663 = this.f4556;
        synchronized (c0663) {
            if (!c0663.m1884()) {
                throw new IllegalStateException("servers cannot read response headers");
            }
            c0663.f4480.m4899();
            while (c0663.f4485 == null && c0663.f4484 == null) {
                try {
                    c0663.m1885();
                } catch (Throwable th) {
                    c0663.f4480.m1895();
                    throw th;
                }
            }
            c0663.f4480.m1895();
            list = c0663.f4485;
            if (list == null) {
                throw new C0674(c0663.f4484);
            }
            c0663.f4485 = null;
        }
        C0597.C0598 c0598 = new C0597.C0598();
        int size = list.size();
        C0618 c0618 = null;
        for (int i = 0; i < size; i++) {
            C0671 c0671 = list.get(i);
            if (c0671 != null) {
                C2801 c2801 = c0671.f4526;
                String mo4847 = c0671.f4524.mo4847();
                if (c2801.equals(C0671.f4520)) {
                    c0618 = C0618.m1779("HTTP/1.1 " + mo4847);
                } else if (!f4550.contains(c2801)) {
                    AbstractC0631.f4356.mo1829(c0598, c2801.mo4847(), mo4847);
                }
            } else if (c0618 != null && c0618.f4309 == 100) {
                c0598 = new C0597.C0598();
                c0618 = null;
            }
        }
        if (c0618 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0712.C0713 c0713 = new C0712.C0713();
        c0713.f4766 = EnumC0721.HTTP_2;
        c0713.f4769 = c0618.f4309;
        c0713.f4774 = c0618.f4310;
        List<String> list2 = c0598.f4258;
        String[] strArr = (String[]) list2.toArray(new String[list2.size()]);
        C0597.C0598 c05982 = new C0597.C0598();
        Collections.addAll(c05982.f4258, strArr);
        c0713.f4773 = c05982;
        if (z) {
            ((C0706.C0708) AbstractC0631.f4356).getClass();
            if (c0713.f4769 == 100) {
                return null;
            }
        }
        return c0713;
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: びぐびあび */
    public void mo1758() {
        this.f4554.f4448.flush();
    }
}
