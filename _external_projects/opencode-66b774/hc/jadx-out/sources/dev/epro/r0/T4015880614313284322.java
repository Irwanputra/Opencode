package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T4015880614313284322 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ S2460821117650695638 b;

    public /* synthetic */ T4015880614313284322(S2460821117650695638 s2460821117650695638, byte b) {
        this.a = b;
        this.b = s2460821117650695638;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        byte b = this.a;
        boolean z = false;
        Y16443381041276641359 y16443381041276641359 = Y16443381041276641359.b;
        Y16443381041276641359 y164433810412766413592 = Y16443381041276641359.a;
        S2460821117650695638 s2460821117650695638 = this.b;
        switch (b) {
            case 0:
                S16154245747709621665 s16154245747709621665 = (S16154245747709621665) obj;
                s16154245747709621665.getClass();
                D7684223024353934705 d7684223024353934705 = (D7684223024353934705) s16154245747709621665;
                d7684223024353934705.p = true;
                d7684223024353934705.f210o.invoke(s2460821117650695638);
                E10717724117948616506.n(d7684223024353934705);
                return Boolean.FALSE;
            case 1:
                R1411039272204519728 r1411039272204519728 = (R1411039272204519728) obj;
                boolValueOf = r1411039272204519728.a.isToggle() ? Boolean.valueOf(r1411039272204519728.a.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        y16443381041276641359 = y164433810412766413592;
                    }
                    U4676709778812953726.p(s2460821117650695638, y16443381041276641359);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                R1411039272204519728 r14110392722045197282 = (R1411039272204519728) obj;
                boolValueOf = r14110392722045197282.a.isToggle() ? Boolean.valueOf(r14110392722045197282.a.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        y16443381041276641359 = y164433810412766413592;
                    }
                    U4676709778812953726.p(s2460821117650695638, y16443381041276641359);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
