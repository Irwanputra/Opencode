package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.A7209497065939201693;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class u72 extends R14062301455140331524 implements L12639328004344855510 {
    public Object a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ byte t = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u72(i82 i82Var, tx0 tx0Var, String str, A7209497065939201693 a7209497065939201693, q31 q31Var, A7209497065939201693 a72094970659392016932, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.c = i82Var;
        this.d = tx0Var;
        this.e = str;
        this.f = a7209497065939201693;
        this.g = q31Var;
        this.h = a72094970659392016932;
        this.i = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.g;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                boolean z = this.i;
                return new u72((i82) this.c, (tx0) obj5, this.e, (A7209497065939201693) obj4, (q31) obj2, (A7209497065939201693) obj3, z, r4833348786910499294);
            default:
                boolean z2 = this.i;
                return new u72((jp0) obj5, (vv1) obj4, (I16631908410500040363) obj3, this.e, (View) obj2, z2, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((u72) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((u72) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02ad A[Catch: all -> 0x02b4, TRY_LEAVE, TryCatch #10 {all -> 0x02b4, blocks: (B:12:0x02a7, B:14:0x02ad), top: B:11:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02c7 A[Catch: all -> 0x02d3, TryCatch #8 {all -> 0x02d3, blocks: (B:25:0x02c0, B:27:0x02c7, B:29:0x02cb, B:31:0x02cf, B:32:0x02d6, B:34:0x02da, B:36:0x02de, B:38:0x02e2, B:39:0x02e3, B:40:0x02e8, B:41:0x02e9, B:42:0x02f0, B:43:0x02f1, B:44:0x02f8, B:45:0x02f9), top: B:24:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f9 A[Catch: all -> 0x02d3, TRY_LEAVE, TryCatch #8 {all -> 0x02d3, blocks: (B:25:0x02c0, B:27:0x02c7, B:29:0x02cb, B:31:0x02cf, B:32:0x02d6, B:34:0x02da, B:36:0x02de, B:38:0x02e2, B:39:0x02e3, B:40:0x02e8, B:41:0x02e9, B:42:0x02f0, B:43:0x02f1, B:44:0x02f8, B:45:0x02f9), top: B:24:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0235 A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #16 {all -> 0x023c, blocks: (B:63:0x022f, B:65:0x0235), top: B:62:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024f A[Catch: all -> 0x025b, TryCatch #13 {all -> 0x025b, blocks: (B:73:0x0248, B:75:0x024f, B:77:0x0253, B:79:0x0257, B:80:0x025e, B:82:0x0262, B:84:0x0266, B:86:0x026a, B:87:0x026b, B:88:0x0270, B:89:0x0271, B:90:0x0278, B:91:0x0279, B:92:0x0280, B:93:0x0281), top: B:72:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0281 A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #13 {all -> 0x025b, blocks: (B:73:0x0248, B:75:0x024f, B:77:0x0253, B:79:0x0257, B:80:0x025e, B:82:0x0262, B:84:0x0266, B:86:0x026a, B:87:0x026b, B:88:0x0270, B:89:0x0271, B:90:0x0278, B:91:0x0279, B:92:0x0280, B:93:0x0281), top: B:72:0x0248 }] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v55, types: [ads_mobile_sdk.th3] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.u72.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u72(jp0 jp0Var, vv1 vv1Var, I16631908410500040363 i16631908410500040363, String str, View view, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.d = jp0Var;
        this.f = vv1Var;
        this.h = i16631908410500040363;
        this.e = str;
        this.g = view;
        this.i = z;
    }
}
