package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class P5471614879790718 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L7222411163342326563 b;

    public /* synthetic */ P5471614879790718(L7222411163342326563 l7222411163342326563, byte b) {
        this.a = b;
        this.b = l7222411163342326563;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        L7222411163342326563 l7222411163342326563 = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(l7222411163342326563.p.b());
            case 1:
                return Float.valueOf(l7222411163342326563.p.f());
            default:
                return Float.valueOf(l7222411163342326563.p.a() - l7222411163342326563.p.e());
        }
    }
}
