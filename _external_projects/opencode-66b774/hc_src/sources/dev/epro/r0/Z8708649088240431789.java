package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final /* synthetic */ class Z8708649088240431789 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ O16937597380326035176 b;

    public /* synthetic */ Z8708649088240431789(O16937597380326035176 o16937597380326035176, byte b) {
        this.a = b;
        this.b = o16937597380326035176;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        O16937597380326035176 o16937597380326035176 = this.b;
        switch (b) {
            case 0:
                if (o16937597380326035176.v != null) {
                    return o9245300239821758723;
                }
                throw G11450220448113054352.f("Font resolution state is not set.");
            default:
                if (o16937597380326035176.v != null) {
                    return o9245300239821758723;
                }
                throw G11450220448113054352.f("Font resolution state is not set.");
        }
    }
}
