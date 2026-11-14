package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

import ads_mobile_sdk.ci3;
import ads_mobile_sdk.eg2;
import ads_mobile_sdk.fo2;
import ads_mobile_sdk.hf2;
import ads_mobile_sdk.hv;
import ads_mobile_sdk.ih0;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.iw1;
import ads_mobile_sdk.jp0;
import ads_mobile_sdk.jr0;
import ads_mobile_sdk.mi3;
import ads_mobile_sdk.qw1;
import ads_mobile_sdk.te1;
import ads_mobile_sdk.vb1;
import ads_mobile_sdk.wf0;
import ads_mobile_sdk.y2;
import ads_mobile_sdk.z03;
import ads_mobile_sdk.z1;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class InternalNativeAd extends vb1 {
    public final it1 a;
    public final jp0 e;
    private final Optional<PerAdNativeJavscriptEngineJsContext> jsEngineContext;
    public final iw1 l;
    private PerAdNativeJavscriptEngineJsContext localJsEngineContext;
    public final qw1 q;
    public final jr0 r;
    public final wf0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalNativeAd(W5797197595347441198 w5797197595347441198, String str, z1 z1Var, hv hvVar, mi3 mi3Var, Optional optional, y2 y2Var, ih0 ih0Var, it1 it1Var, jp0 jp0Var, iw1 iw1Var, qw1 qw1Var, te1 te1Var, Optional optional2, hf2 hf2Var, z03 z03Var, F14240031463097426304 f14240031463097426304, ci3 ci3Var, eg2 eg2Var, jr0 jr0Var, U4857089234315512256 u4857089234315512256, wf0 wf0Var) {
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
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) optional2.orElse(null);
    }

    @Override // ads_mobile_sdk.vb1, dev.epro.r0.T18397286815848089648
    public final Object a(fo2 fo2Var) {
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) M18113111391818111737.H(this.jsEngineContext);
        Object objA = vb1.a(this, fo2Var);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    @Override // ads_mobile_sdk.vb1, dev.epro.r0.T18397286815848089648
    public final void destroy() {
        super.destroy();
        this.e.getClass();
    }

    @Override // ads_mobile_sdk.vb1, dev.epro.r0.T18397286815848089648
    public final I16631908410500040363 g() {
        return this.a.w;
    }
}
