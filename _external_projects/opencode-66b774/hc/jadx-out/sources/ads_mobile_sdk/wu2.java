package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 extends K14749510448791472029 {
    public cv2 a;
    public Object b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cv2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu2(cv2 cv2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = cv2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
