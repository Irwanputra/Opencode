package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ul2 implements dev.epro.r0.K17751841687800543607 {
    public final dev.epro.r0.A8094652504661216977 a;
    public final dev.epro.r0.A8094652504661216977 b;
    public final dev.epro.r0.A8094652504661216977 c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public ul2(dev.epro.r0.A8094652504661216977 a8094652504661216977, dev.epro.r0.A8094652504661216977 a80946525046612169772, dev.epro.r0.A8094652504661216977 a80946525046612169773, boolean z, long j, boolean z2, boolean z3) {
        this.a = a8094652504661216977;
        this.b = a80946525046612169772;
        this.c = a80946525046612169773;
        this.d = z;
        this.e = j;
        this.f = z2;
        this.g = z3;
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        int iC = ((dev.epro.r0.A4779768452142520513) this.b.get()).c();
        dev.epro.r0.A8094652504661216977 a8094652504661216977 = this.c;
        java.util.concurrent.Executor executor = dev.epro.r0.Z886113521968091188.a;
        if (iC == 4 && this.f && this.g) {
            return dev.epro.r0.B11509606741455062017.r(dev.epro.r0.I13152720973475179368.q(((dev.epro.r0.Z15337348271744322997) a8094652504661216977.get()).c()).p(java.lang.Throwable.class, new dev.epro.r0.A14169635274474290551((byte) 4), executor), new dev.epro.r0.U18309416299087417705(this, (byte) 0), executor);
        }
        if (this.d) {
            return dev.epro.r0.B11509606741455062017.r(dev.epro.r0.B11509606741455062017.r(dev.epro.r0.I13152720973475179368.q(((ads_mobile_sdk.zm3) this.a.get()).a()).p(java.lang.Throwable.class, new dev.epro.r0.A14169635274474290551((byte) 5), executor), new dev.epro.r0.U18309416299087417705(this, (byte) 1), executor), new dev.epro.r0.U18309416299087417705(this, (byte) 2), executor);
        }
        dev.epro.r0.V9379369092627242728 v9379369092627242728R = dev.epro.r0.B11509606741455062017.r(dev.epro.r0.I13152720973475179368.q(((dev.epro.r0.Z15337348271744322997) a8094652504661216977.get()).c()).p(java.lang.Throwable.class, new dev.epro.r0.A14169635274474290551((byte) 6), executor), new dev.epro.r0.U18309416299087417705(this, (byte) 3), executor);
        v9379369092627242728R.a(new dev.epro.r0.C439001677970731857(this, (byte) 3), executor);
        return v9379369092627242728R;
    }

    public final dev.epro.r0.D16915945238461757356 b(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return ((dev.epro.r0.A4779768452142520513) this.b.get()).b(context, str, view, activity);
    }

    public final java.lang.String b() {
        return ((dev.epro.r0.A4779768452142520513) this.b.get()).b();
    }

    public final dev.epro.r0.D16915945238461757356 a(android.content.Context context) {
        return ((dev.epro.r0.A4779768452142520513) this.b.get()).a(context);
    }

    public final dev.epro.r0.D16915945238461757356 a(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return ((dev.epro.r0.A4779768452142520513) this.b.get()).a(context, str, view, activity);
    }

    public final void a(android.view.MotionEvent motionEvent) {
        ((dev.epro.r0.A4779768452142520513) this.b.get()).a(motionEvent);
    }
}
