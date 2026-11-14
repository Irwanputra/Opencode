package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.A7209497065939201693;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x024f A[Catch: all -> 0x025b, TryCatch #13 {all -> 0x025b, blocks: (B:105:0x0248, B:107:0x024f, B:109:0x0253, B:111:0x0257, B:114:0x025e, B:116:0x0262, B:118:0x0266, B:120:0x026a, B:121:0x026b, B:122:0x0270, B:123:0x0271, B:124:0x0278, B:125:0x0279, B:126:0x0280, B:127:0x0281), top: B:265:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0281 A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #13 {all -> 0x025b, blocks: (B:105:0x0248, B:107:0x024f, B:109:0x0253, B:111:0x0257, B:114:0x025e, B:116:0x0262, B:118:0x0266, B:120:0x026a, B:121:0x026b, B:122:0x0270, B:123:0x0271, B:124:0x0278, B:125:0x0279, B:126:0x0280, B:127:0x0281), top: B:265:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ad A[Catch: all -> 0x02b4, TRY_LEAVE, TryCatch #10 {all -> 0x02b4, blocks: (B:137:0x02a7, B:139:0x02ad), top: B:259:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c7 A[Catch: all -> 0x02d3, TryCatch #8 {all -> 0x02d3, blocks: (B:149:0x02c0, B:151:0x02c7, B:153:0x02cb, B:155:0x02cf, B:158:0x02d6, B:160:0x02da, B:162:0x02de, B:164:0x02e2, B:165:0x02e3, B:166:0x02e8, B:167:0x02e9, B:168:0x02f0, B:169:0x02f1, B:170:0x02f8, B:171:0x02f9), top: B:257:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f9 A[Catch: all -> 0x02d3, TRY_LEAVE, TryCatch #8 {all -> 0x02d3, blocks: (B:149:0x02c0, B:151:0x02c7, B:153:0x02cb, B:155:0x02cf, B:158:0x02d6, B:160:0x02da, B:162:0x02de, B:164:0x02e2, B:165:0x02e3, B:166:0x02e8, B:167:0x02e9, B:168:0x02f0, B:169:0x02f1, B:170:0x02f8, B:171:0x02f9), top: B:257:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235 A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #16 {all -> 0x023c, blocks: (B:95:0x022f, B:97:0x0235), top: B:270:0x022f }] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1008
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
