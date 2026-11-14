package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R15623402566349216748 implements G13792465322404021864 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ V5656221289452463152 b;

    public /* synthetic */ R15623402566349216748(V5656221289452463152 v5656221289452463152, byte b) {
        this.a = b;
        this.b = v5656221289452463152;
    }

    @Override // dev.epro.r0.G13792465322404021864
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        V5656221289452463152 v5656221289452463152 = this.b;
        switch (b) {
            case 0:
                R3610722646682213723 r3610722646682213723 = (R3610722646682213723) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue = ((Integer) obj3).intValue();
                ((Boolean) obj4).getClass();
                boolean z = v5656221289452463152.c;
                return zBooleanValue ? z ? r3610722646682213723.c(iIntValue, 0) : r3610722646682213723.c(iIntValue, r3610722646682213723.f.a.a.b.length()) : z ? r3610722646682213723.c(r3610722646682213723.f.a.a.b.length(), iIntValue) : r3610722646682213723.c(0, iIntValue);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Integer) obj3).getClass();
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                V5656221289452463152 v5656221289452463152D = ((U5234994727412699525) obj).d();
                if (v5656221289452463152D == null) {
                    return null;
                }
                Z6884774333691094167 z6884774333691094167 = v5656221289452463152D.b;
                Z6884774333691094167 z68847743336910941672 = v5656221289452463152D.a;
                if (zBooleanValue2) {
                    Z6884774333691094167 z68847743336910941673 = v5656221289452463152.a;
                    return zBooleanValue3 ? new V5656221289452463152(z68847743336910941673, z68847743336910941672, true) : new V5656221289452463152(z68847743336910941673, z6884774333691094167, false);
                }
                Z6884774333691094167 z68847743336910941674 = v5656221289452463152.b;
                return zBooleanValue3 ? new V5656221289452463152(z6884774333691094167, z68847743336910941674, true) : new V5656221289452463152(z68847743336910941672, z68847743336910941674, false);
        }
    }
}
