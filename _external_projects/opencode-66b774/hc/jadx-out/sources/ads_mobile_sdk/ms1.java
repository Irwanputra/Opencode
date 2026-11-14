package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.T18397286815848089648;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ms1 implements T18397286815848089648 {
    public final InternalNativeAd a;

    public ms1(InternalNativeAd internalNativeAd) {
        this.a = internalNativeAd;
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final mi3 a() {
        return this.a.a();
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final z1 b() {
        return this.a.b();
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final void destroy() {
        this.a.destroy();
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final I16631908410500040363 g() {
        return this.a.a.w;
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final F11004654978627682545 getResponseInfo() {
        return this.a.getResponseInfo();
    }

    @Override // dev.epro.r0.T18397286815848089648
    /* JADX INFO: renamed from: a */
    public final void mo6a(fo2 fo2Var) {
        this.a.mo6a(fo2Var);
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final Object a(fo2 fo2Var) {
        return this.a.a(fo2Var);
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final void a(F11004654978627682545 f11004654978627682545) {
        this.a.k = f11004654978627682545;
    }
}
