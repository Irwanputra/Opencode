package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C4265577456082395953 implements dev.epro.r0.S7370861580758580261 {
    public final dev.epro.r0.P10208541982779414550 a;
    public final dev.epro.r0.A11740628756173341578 b;
    public boolean c;
    public final /* synthetic */ dev.epro.r0.V13312380994896612392 d;

    public C4265577456082395953(dev.epro.r0.V13312380994896612392 v13312380994896612392, dev.epro.r0.P10208541982779414550 p10208541982779414550) {
        p10208541982779414550.getClass();
        this.d = v13312380994896612392;
        this.a = p10208541982779414550;
        this.b = new dev.epro.r0.A11740628756173341578(((dev.epro.r0.T13344602445187831655) v13312380994896612392.c.c).a.a());
    }

    public final dev.epro.r0.O12329764647113144543 a() {
        return this.b;
    }

    public final void b(dev.epro.r0.F12902864952249894497 f12902864952249894497) {
        dev.epro.r0.K5458285210510848811 k5458285210510848811;
        dev.epro.r0.P2382941533350862833 p2382941533350862833;
        f12902864952249894497.getClass();
        dev.epro.r0.V13312380994896612392 v13312380994896612392 = this.d;
        byte b = v13312380994896612392.d;
        if (b == 6) {
            return;
        }
        if (b != 5) {
            throw new java.lang.IllegalStateException("state: " + ((int) v13312380994896612392.d));
        }
        dev.epro.r0.A11740628756173341578 a11740628756173341578 = this.b;
        dev.epro.r0.O12329764647113144543 o12329764647113144543 = a11740628756173341578.e;
        a11740628756173341578.e = dev.epro.r0.O12329764647113144543.d;
        o12329764647113144543.a();
        o12329764647113144543.b();
        v13312380994896612392.d = (byte) 6;
        if (f12902864952249894497.size() <= 0 || (k5458285210510848811 = v13312380994896612392.a) == null || (p2382941533350862833 = k5458285210510848811.j) == null) {
            return;
        }
        dev.epro.r0.J4204243423487919855.b(p2382941533350862833, this.a, f12902864952249894497);
    }

    public long m(dev.epro.r0.P5176232750190581838 p5176232750190581838, long j) throws java.io.IOException {
        dev.epro.r0.V13312380994896612392 v13312380994896612392 = this.d;
        p5176232750190581838.getClass();
        try {
            return ((dev.epro.r0.T13344602445187831655) v13312380994896612392.c.c).m(p5176232750190581838, j);
        } catch (java.io.IOException e) {
            v13312380994896612392.b.h();
            this.b(dev.epro.r0.V13312380994896612392.f);
            throw e;
        }
    }
}
