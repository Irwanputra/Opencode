package dev.epro.r0;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I4909713222951731791 implements I4293432593871965076 {
    public static final I4909713222951731791 i = new I4909713222951731791();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final I1283052979100930176 f = new I1283052979100930176(this, true);
    public final W13948953340889349604 g = new W13948953340889349604(this, (byte) 22);
    public final F6942723054099263096 h = new F6942723054099263096((Object) this, (byte) 27);

    public final void c() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.e(P72364327365747079.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return this.f;
    }
}
