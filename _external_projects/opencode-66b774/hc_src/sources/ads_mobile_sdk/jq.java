package ads_mobile_sdk;

import dev.epro.r0.L8361547894089146393;
import dev.epro.r0.U1864172318023436692;
import dev.epro.r0.Z3383101362411723454;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class jq extends U1864172318023436692 {
    public int a;
    public final int b;
    public final /* synthetic */ L8361547894089146393 c;

    public jq(L8361547894089146393 l8361547894089146393) {
        super((byte) 2);
        this.c = l8361547894089146393;
        this.a = 0;
        this.b = l8361547894089146393.size();
    }

    @Override // dev.epro.r0.U1864172318023436692
    public final byte a() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.b(i);
        }
        Z3383101362411723454.u();
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
