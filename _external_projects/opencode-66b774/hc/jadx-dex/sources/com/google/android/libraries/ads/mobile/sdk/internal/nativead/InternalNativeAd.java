package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class InternalNativeAd extends ads_mobile_sdk.vb1 {
    public final ads_mobile_sdk.it1 a;
    public final ads_mobile_sdk.jp0 e;
    private final java.util.Optional<com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext> jsEngineContext;
    public final ads_mobile_sdk.iw1 l;
    private com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext localJsEngineContext;
    public final ads_mobile_sdk.qw1 q;
    public final ads_mobile_sdk.jr0 r;
    public final ads_mobile_sdk.wf0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalNativeAd(dev.epro.r0.W5797197595347441198 w5797197595347441198, java.lang.String str, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.mi3 mi3Var, java.util.Optional optional, ads_mobile_sdk.y2 y2Var, ads_mobile_sdk.ih0 ih0Var, ads_mobile_sdk.it1 it1Var, ads_mobile_sdk.jp0 jp0Var, ads_mobile_sdk.iw1 iw1Var, ads_mobile_sdk.qw1 qw1Var, ads_mobile_sdk.te1 te1Var, java.util.Optional optional2, ads_mobile_sdk.hf2 hf2Var, ads_mobile_sdk.z03 z03Var, dev.epro.r0.F14240031463097426304 f14240031463097426304, ads_mobile_sdk.ci3 ci3Var, ads_mobile_sdk.eg2 eg2Var, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.wf0 wf0Var) {
        super(str, z1Var, hvVar, mi3Var, optional, y2Var, ih0Var, hf2Var, z03Var, eg2Var, u4857089234315512256);
        w5797197595347441198.getClass();
        str.getClass();
        z1Var.getClass();
        hvVar.getClass();
        mi3Var.getClass();
        optional.getClass();
        y2Var.getClass();
        ih0Var.getClass();
        it1Var.getClass();
        jp0Var.getClass();
        iw1Var.getClass();
        qw1Var.getClass();
        te1Var.getClass();
        optional2.getClass();
        hf2Var.getClass();
        z03Var.getClass();
        f14240031463097426304.getClass();
        ci3Var.getClass();
        eg2Var.getClass();
        jr0Var.getClass();
        u4857089234315512256.getClass();
        this.a = it1Var;
        this.e = jp0Var;
        this.l = iw1Var;
        this.q = qw1Var;
        this.jsEngineContext = optional2;
        this.r = jr0Var;
        this.s = wf0Var;
        this.localJsEngineContext = (com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext) optional2.orElse(null);
    }

    @Override // ads_mobile_sdk.vb1
    public final java.lang.Object a(ads_mobile_sdk.fo2 fo2Var) {
        this.localJsEngineContext = (com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext) dev.epro.r0.M18113111391818111737.H(this.jsEngineContext);
        java.lang.Object objA = ads_mobile_sdk.vb1.a(this, fo2Var);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    @Override // ads_mobile_sdk.vb1
    public final void destroy() {
        super.destroy();
        this.e.getClass();
    }

    @Override // ads_mobile_sdk.vb1
    public final dev.epro.r0.I16631908410500040363 g() {
        return this.a.w;
    }
}
