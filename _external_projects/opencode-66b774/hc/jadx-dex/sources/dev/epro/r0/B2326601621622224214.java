package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B2326601621622224214 implements dev.epro.r0.P14826151584039718691, dev.epro.r0.F18341548724281518495 {
    public final /* synthetic */ dev.epro.r0.L6644189956008555542 a;
    public dev.epro.r0.I1283052979100930176 b;
    public dev.epro.r0.V10300877997588547986 c;

    public B2326601621622224214(dev.epro.r0.L6644189956008555542 l6644189956008555542) {
        this.a = l6644189956008555542;
        java.lang.Object objE = l6644189956008555542.e("androidx.savedstate.SavedStateRegistry");
        android.os.Bundle bundle = objE instanceof android.os.Bundle ? (android.os.Bundle) objE : null;
        if (bundle != null && this.c == null) {
            dev.epro.r0.V10300877997588547986 v10300877997588547986 = new dev.epro.r0.V10300877997588547986(new dev.epro.r0.U8000365519789522238(this, new dev.epro.r0.N8306548196372912291(this, (byte) 14)));
            this.c = v10300877997588547986;
            v10300877997588547986.v(bundle);
        }
        l6644189956008555542.f("androidx.savedstate.SavedStateRegistry", new dev.epro.r0.N8306548196372912291(this, (byte) 12));
    }

    public final dev.epro.r0.V10300877997588547986 b() {
        dev.epro.r0.V10300877997588547986 v10300877997588547986 = this.c;
        if (v10300877997588547986 == null) {
            dev.epro.r0.V10300877997588547986 v103008779975885479862 = new dev.epro.r0.V10300877997588547986(new dev.epro.r0.U8000365519789522238(this, new dev.epro.r0.N8306548196372912291(this, (byte) 14)));
            this.c = v103008779975885479862;
            v103008779975885479862.v((android.os.Bundle) null);
            v10300877997588547986 = v103008779975885479862;
        }
        return (dev.epro.r0.V10300877997588547986) v10300877997588547986.c;
    }

    public final boolean c(java.lang.Object obj) {
        return this.a.c(obj);
    }

    public final java.util.Map d() {
        return this.a.d();
    }

    public final java.lang.Object e(java.lang.String str) {
        return this.a.e(str);
    }

    public final dev.epro.r0.R11800251031747375035 f(java.lang.String str, dev.epro.r0.B13729205492206812220 b13729205492206812220) {
        return this.a.f(str, b13729205492206812220);
    }

    public final dev.epro.r0.R3192876217964974737 j() {
        dev.epro.r0.I1283052979100930176 i1283052979100930176 = this.b;
        if (i1283052979100930176 != null) {
            return i1283052979100930176;
        }
        dev.epro.r0.I1283052979100930176 i12830529791009301762 = new dev.epro.r0.I1283052979100930176(this, false);
        this.b = i12830529791009301762;
        return i12830529791009301762;
    }
}
