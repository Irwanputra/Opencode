package p131.p225.p226.p232;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2766 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10402;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f10403;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f10404;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f10405;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2767 f10406;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2767 f10407;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f10408;

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public class C2767 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f10409;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2768 f10411;

        public C2767(C2768 c2768, int i) {
            this.f10411 = c2768;
            this.f10409 = i;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int m4751() {
            int i = C2766.this.f10408;
            int i2 = i - this.f10409;
            if (i2 > 0) {
                return i2;
            }
            C2768 c2768 = this.f10411;
            C2768 c27682 = c2768.f10412;
            if (c27682 == null) {
                c27682 = new C2768(i);
                c2768.f10412 = c27682;
            }
            this.f10411 = c27682;
            this.f10409 = 0;
            return C2766.this.f10408;
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C2768 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2768 f10412;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final byte[] f10413;

        public C2768(int i) {
            this.f10413 = new byte[i];
        }
    }

    public C2766(Object obj, int i, int i2) {
        this.f10405 = obj == null ? this : obj;
        this.f10404 = i2;
        this.f10408 = i;
        C2768 c2768 = new C2768(i);
        this.f10406 = new C2767(c2768, 0);
        this.f10407 = new C2767(c2768, 0);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4749(byte[] bArr, int i, int i2) {
        int min;
        while (i2 > 0) {
            synchronized (this.f10405) {
                while (true) {
                    min = Math.min(i2, Math.max(0, this.f10404 - m4750()));
                    if (min != 0) {
                        break;
                    } else {
                        this.f10405.wait();
                    }
                }
                C2767 c2767 = this.f10407;
                c2767.getClass();
                int i3 = i;
                int i4 = min;
                while (i4 > 0) {
                    int min2 = Math.min(i4, c2767.m4751());
                    System.arraycopy(bArr, i3, c2767.f10411.f10413, c2767.f10409, min2);
                    c2767.f10409 += min2;
                    i4 -= min2;
                    i3 += min2;
                }
                i += min;
                i2 -= min;
                this.f10402 += min;
                this.f10405.notifyAll();
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m4750() {
        int i;
        synchronized (this.f10405) {
            i = this.f10402;
        }
        return i;
    }
}
