package ads_mobile_sdk;

import ads_mobile_sdk.km2;
import android.content.Context;
import dev.epro.r0.A14169635274474290551;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.G17826342324976703097;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.J5800360223679855765;
import dev.epro.r0.J8856184873186011997;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.V9308799180227606465;
import dev.epro.r0.W11349799793478038591;
import dev.epro.r0.W6764693637816104089;
import dev.epro.r0.Z15337348271744322997;
import dev.epro.r0.Z886113521968091188;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class km2 implements W11349799793478038591 {
    public final Context a;
    public final A8094652504661216977 b;
    public final Z15337348271744322997 c;
    public final vi3 d;
    public final ExecutorService e;
    public final xm2 f;
    public final v6 g;

    public km2(Context context, A8094652504661216977 a8094652504661216977, Z15337348271744322997 z15337348271744322997, vi3 vi3Var, ExecutorService executorService, xm2 xm2Var, v6 v6Var) {
        this.a = context;
        this.b = a8094652504661216977;
        this.c = z15337348271744322997;
        this.d = vi3Var;
        this.e = executorService;
        this.f = xm2Var;
        this.g = v6Var;
    }

    @Override // dev.epro.r0.W11349799793478038591
    public final D16915945238461757356 a() {
        yk0 yk0Var = yk0.EVENT_ID_DG_FETCHER_FETCH_PROGRAM;
        A8094652504661216977 a8094652504661216977 = this.b;
        Objects.requireNonNull(a8094652504661216977);
        J5800360223679855765 j5800360223679855765 = new J5800360223679855765(a8094652504661216977, (byte) 6);
        ExecutorService executorService = this.e;
        I13152720973475179368 q = I13152720973475179368.q(M9216324016624295870.X(j5800360223679855765, executorService));
        final byte b = 0;
        W6764693637816104089 w6764693637816104089 = new W6764693637816104089(this) { // from class: dev.epro.r0.O12123424249380946449
            public final /* synthetic */ km2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #2 {all -> 0x0061, blocks: (B:11:0x0049, B:14:0x004f, B:17:0x005a, B:18:0x0071, B:20:0x0078, B:88:0x006d), top: B:10:0x0049 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
            @Override // dev.epro.r0.W6764693637816104089
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r25) {
                /*
                    Method dump skipped, instructions count: 650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O12123424249380946449.apply(java.lang.Object):java.lang.Object");
            }
        };
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        final byte b2 = 1;
        J8856184873186011997 p = B11509606741455062017.s(B11509606741455062017.r(B11509606741455062017.s(q, w6764693637816104089, z886113521968091188), new V9308799180227606465(this, (byte) 0), z886113521968091188), new W6764693637816104089(this) { // from class: dev.epro.r0.O12123424249380946449
            public final /* synthetic */ km2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                /*
                    Method dump skipped, instructions count: 650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O12123424249380946449.apply(java.lang.Object):java.lang.Object");
            }
        }, executorService).p(G17826342324976703097.class, new A14169635274474290551((byte) 3), z886113521968091188);
        this.d.a(yk0Var, (L7743116545240101509) p);
        return p;
    }
}
