package dev.epro.r0;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B2326601621622224214 implements P14826151584039718691, F18341548724281518495 {
    public final /* synthetic */ L6644189956008555542 a;
    public I1283052979100930176 b;
    public V10300877997588547986 c;

    public B2326601621622224214(L6644189956008555542 l6644189956008555542) {
        this.a = l6644189956008555542;
        Object e = l6644189956008555542.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = e instanceof Bundle ? (Bundle) e : null;
        if (bundle != null && this.c == null) {
            V10300877997588547986 v10300877997588547986 = new V10300877997588547986(new U8000365519789522238(this, new N8306548196372912291(this, (byte) 14)));
            this.c = v10300877997588547986;
            v10300877997588547986.v(bundle);
        }
        l6644189956008555542.f("androidx.savedstate.SavedStateRegistry", new N8306548196372912291(this, (byte) 12));
    }

    @Override // dev.epro.r0.F18341548724281518495
    public final V10300877997588547986 b() {
        V10300877997588547986 v10300877997588547986 = this.c;
        if (v10300877997588547986 == null) {
            V10300877997588547986 v103008779975885479862 = new V10300877997588547986(new U8000365519789522238(this, new N8306548196372912291(this, (byte) 14)));
            this.c = v103008779975885479862;
            v103008779975885479862.v(null);
            v10300877997588547986 = v103008779975885479862;
        }
        return (V10300877997588547986) v10300877997588547986.c;
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final Map d() {
        return this.a.d();
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final R11800251031747375035 f(String str, B13729205492206812220 b13729205492206812220) {
        return this.a.f(str, b13729205492206812220);
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        I1283052979100930176 i1283052979100930176 = this.b;
        if (i1283052979100930176 != null) {
            return i1283052979100930176;
        }
        I1283052979100930176 i12830529791009301762 = new I1283052979100930176(this, false);
        this.b = i12830529791009301762;
        return i12830529791009301762;
    }
}
