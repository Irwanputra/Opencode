package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R11747310517775341069 {
    public static final long g = Long.parseLong(System.getProperty(R11747310517775341069.class.getName().concat(".timeout"), "1200000"));
    public final Object a;
    public int b;
    public final int c;
    public T17032536773975598836 d;
    public T17032536773975598836 e;
    public boolean f;

    public R11747310517775341069(C16667689525325095505 c16667689525325095505, int i) {
        this.a = c16667689525325095505;
        this.c = i;
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 26);
        this.d = new T17032536773975598836(this, w8455343525638953052);
        this.e = new T17032536773975598836(this, w8455343525638953052);
    }

    public final int a() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    public final void b(byte[] bArr, int i, int i2) {
        int iMin;
        while (i2 > 0) {
            synchronized (this.a) {
                while (true) {
                    try {
                        iMin = Math.min(i2, Math.max(0, this.c - a()));
                        if (iMin != 0) {
                            break;
                        } else {
                            this.a.wait(g);
                        }
                    } finally {
                    }
                }
                T17032536773975598836 t17032536773975598836 = this.e;
                int i3 = i;
                int i4 = iMin;
                while (i4 > 0) {
                    int iMin2 = Math.min(i4, t17032536773975598836.b());
                    System.arraycopy(bArr, i3, (byte[]) ((W8455343525638953052) t17032536773975598836.b).b, t17032536773975598836.a, iMin2);
                    t17032536773975598836.a += iMin2;
                    i4 -= iMin2;
                    i3 += iMin2;
                }
                t17032536773975598836.getClass();
                i += iMin;
                i2 -= iMin;
                this.b += iMin;
                this.a.notifyAll();
            }
        }
    }
}
