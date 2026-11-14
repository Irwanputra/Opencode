package ads_mobile_sdk;

import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class yu2 extends R14062301455140331524 implements L12639328004344855510 {
    public zm1 a;
    public ArrayList b;
    public d33 c;
    public z1 d;
    public Integer e;
    public byte f;
    public final /* synthetic */ cv2 g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ z1 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(cv2 cv2Var, ArrayList arrayList, z1 z1Var, long j, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.g = cv2Var;
        this.h = arrayList;
        this.i = z1Var;
        this.j = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new yu2(this.g, this.h, this.i, this.j, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((yu2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r11 = r18
            byte r0 = r11.f
            ads_mobile_sdk.z1 r13 = r11.i
            java.lang.String r14 = "serverTransaction"
            r1 = 2
            r2 = 1
            ads_mobile_sdk.cv2 r15 = r11.g
            r3 = 0
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L26
            if (r0 != r1) goto L20
            dev.epro.r0.E17665849472693074628.k(r19)
            r0 = r19
            r16 = r3
            r17 = r13
            goto L99
        L20:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r3
        L26:
            java.lang.Integer r0 = r11.e
            ads_mobile_sdk.z1 r2 = r11.d
            ads_mobile_sdk.d33 r5 = r11.c
            java.util.ArrayList r6 = r11.b
            ads_mobile_sdk.zm1 r7 = r11.a
            dev.epro.r0.E17665849472693074628.k(r19)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r19
            goto L65
        L3a:
            dev.epro.r0.E17665849472693074628.k(r19)
            ads_mobile_sdk.zm1 r7 = r15.d
            ads_mobile_sdk.d33 r5 = r15.i
            if (r5 == 0) goto Lbc
            int r0 = r15.g
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            r11.a = r7
            java.util.ArrayList r0 = r11.h
            r11.b = r0
            r11.c = r5
            r11.d = r13
            r11.e = r6
            r11.f = r2
            java.lang.Object r2 = ads_mobile_sdk.cv2.a(r15, r11)
            if (r2 != r4) goto L60
            r13 = r4
            goto L98
        L60:
            r8 = r7
            r7 = r0
            r0 = r6
            r6 = r5
            r5 = r13
        L65:
            java.lang.String r2 = (java.lang.String) r2
            r9 = r5
            r5 = r2
            r2 = r6
            dev.epro.r0.E17093345031926825464 r6 = new dev.epro.r0.E17093345031926825464
            r19 = r2
            long r1 = r11.j
            r6.<init>(r1)
            r11.a = r3
            r11.b = r3
            r11.c = r3
            r11.d = r3
            r11.e = r3
            r10 = 2
            r11.f = r10
            r10 = 0
            r12 = 960(0x3c0, float:1.345E-42)
            r1 = r7
            r7 = 0
            r2 = r4
            r4 = r0
            r0 = r8
            r8 = 0
            r16 = r3
            r3 = r9
            r9 = 0
            r17 = r13
            r13 = r2
            r2 = r19
            java.lang.Object r0 = ads_mobile_sdk.zm1.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r13) goto L99
        L98:
            return r13
        L99:
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            ads_mobile_sdk.jx2 r1 = r15.c
            if (r17 == 0) goto Lb6
            ads_mobile_sdk.d33 r0 = r15.i
            if (r0 == 0) goto Lb2
            ads_mobile_sdk.z23 r0 = r0.b
            ads_mobile_sdk.hv r4 = r0.b
            r6 = 0
            r7 = 56
            r5 = 0
            r3 = r17
            ads_mobile_sdk.jx2.a(r1, r2, r3, r4, r5, r6, r7)
            goto Lb9
        Lb2:
            dev.epro.r0.S10823041268949770285.b0(r14)
            throw r16
        Lb6:
            r1.a(r2)
        Lb9:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            return r0
        Lbc:
            r16 = r3
            dev.epro.r0.S10823041268949770285.b0(r14)
            throw r16
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
