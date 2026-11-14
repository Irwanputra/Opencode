package ads_mobile_sdk;

import dev.epro.r0.A14169635274474290551;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.I3863025946240164840;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.M15292376008478569006;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N5587541019643124865;
import dev.epro.r0.T7468265282056741718;
import dev.epro.r0.U6389045311587420009;
import dev.epro.r0.V9379369092627242728;
import dev.epro.r0.Z886113521968091188;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ga3 implements L17385865533161060024 {
    public final j7 a;
    public final da3 b;
    public final qm1 c;
    public final ExecutorService d;
    public final vi3 e;
    public final AtomicReference f = new AtomicReference();

    public ga3(j7 j7Var, da3 da3Var, qm1 qm1Var, ExecutorService executorService, vi3 vi3Var) {
        this.a = j7Var;
        this.b = da3Var;
        this.c = qm1Var;
        this.d = executorService;
        this.e = vi3Var;
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        j7 j7Var = this.a;
        int M = j7Var.M();
        boolean o2 = j7Var.o();
        da3 da3Var = this.b;
        da3Var.getClass();
        I13152720973475179368 q = I13152720973475179368.q(M9216324016624295870.X(new N5587541019643124865(da3Var, M), da3Var.e));
        U6389045311587420009 u6389045311587420009 = new U6389045311587420009();
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        V9379369092627242728 r = B11509606741455062017.r(q, u6389045311587420009, z886113521968091188);
        byte b = 1;
        if (o2 && M != da3Var.g) {
            r = B11509606741455062017.r(I13152720973475179368.q(r).p(Throwable.class, new A14169635274474290551(b), z886113521968091188), new ca3(da3Var), z886113521968091188);
        }
        T7468265282056741718 s = B11509606741455062017.s(I13152720973475179368.q(r), new M15292376008478569006(this, b), z886113521968091188);
        s.a(new I3863025946240164840(s, new c7((Object) this, (byte) 8), (byte) 0), this.d);
        return s;
    }
}
