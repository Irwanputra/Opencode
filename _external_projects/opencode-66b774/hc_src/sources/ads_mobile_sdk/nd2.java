package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class nd2 extends c61 {
    public final j1 c;
    public final c6 d;
    public final Context e;
    public final B7506245556754967052 f;
    public pe2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd2(j1 j1Var, c6 c6Var, Context context, P10813970601447104553 p10813970601447104553, B7506245556754967052 b7506245556754967052) {
        super((wv0) null, false);
        j1Var.getClass();
        c6Var.getClass();
        context.getClass();
        p10813970601447104553.getClass();
        b7506245556754967052.getClass();
        this.c = j1Var;
        this.d = c6Var;
        this.e = context;
        this.f = b7506245556754967052;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.nd2 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ld2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ld2 r0 = (ads_mobile_sdk.ld2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ld2 r0 = new ads_mobile_sdk.ld2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            java.util.LinkedHashSet r5 = r0.b
            ads_mobile_sdk.nd2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L59
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L34:
            dev.epro.r0.E17665849472693074628.k(r6)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            ads_mobile_sdk.j1 r1 = r5.c
            dev.epro.r0.A8094652504661216977 r1 = r1.a
            java.lang.Object r1 = r1.get()
            dev.epro.r0.A5401921815192175371 r1 = (dev.epro.r0.A5401921815192175371) r1
            dev.epro.r0.J12043550928838212009 r1 = r1.getData()
            r0.a = r5
            r0.b = r6
            r0.e = r2
            java.lang.Object r0 = dev.epro.r0.Y582199805280922215.s(r1, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L59
            return r1
        L59:
            ads_mobile_sdk.g1 r0 = (ads_mobile_sdk.g1) r0
            java.util.Map r0 = r0.u()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r0.next()
            ads_mobile_sdk.vr0 r1 = (ads_mobile_sdk.vr0) r1
            java.util.Map r1 = r1.o()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L7f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            ads_mobile_sdk.g6 r2 = (ads_mobile_sdk.g6) r2
            dev.epro.r0.O6641393078261985068 r2 = r2.r()
            java.util.Iterator r2 = r2.iterator()
        L93:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()
            ads_mobile_sdk.b6 r3 = (ads_mobile_sdk.b6) r3
            java.lang.String r3 = r3.q()
            r3.getClass()
            r6.add(r3)
            goto L93
        Laa:
            ads_mobile_sdk.c6 r5 = r5.d
            java.util.List r5 = r5.a()
            java.util.Iterator r5 = r5.iterator()
        Lb4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le2
            java.lang.Object r0 = r5.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getName()
            r1.getClass()
            java.lang.String r2 = ".tmp"
            r3 = 0
            boolean r1 = dev.epro.r0.Z13168519540281190457.z(r1, r2, r3)
            if (r1 == 0) goto Ld4
            r0.delete()
            goto Lb4
        Ld4:
            java.lang.String r1 = r0.getName()
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto Lb4
            r0.delete()
            goto Lb4
        Le2:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nd2.a(ads_mobile_sdk.nd2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(11:12|13|14|15|(1:17)(1:65)|18|19|20|(2:22|23)|63|64)(2:77|78))(10:79|80|81|82|83|84|85|86|(9:89|15|(0)(0)|18|19|20|(0)|63|64)|88))(3:94|95|96))(2:115|(2:117|118)(4:119|120|(1:122)(1:140)|(5:128|129|130|(1:132)|135)(2:125|126)))|97|98|(5:100|20|(0)|63|64)(8:101|(2:103|(7:105|106|107|108|109|(3:111|81|82)|88))|83|84|85|86|(0)|88)))|146|6|7|(0)(0)|97|98|(0)(0)|(2:(0)|(1:55))) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:3|(7:5|6|7|(1:(1:(1:(11:12|13|14|15|(1:17)(1:65)|18|19|20|(2:22|23)|63|64)(2:77|78))(10:79|80|81|82|83|84|85|86|(9:89|15|(0)(0)|18|19|20|(0)|63|64)|88))(3:94|95|96))(2:115|(2:117|118)(4:119|120|(1:122)(1:140)|(5:128|129|130|(1:132)|135)(2:125|126)))|97|98|(5:100|20|(0)|63|64)(8:101|(2:103|(7:105|106|107|108|109|(3:111|81|82)|88))|83|84|85|86|(0)|88)))|97|98|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f7, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00f8, code lost:
    
        r12 = r14;
        r14 = r13;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0125, code lost:
    
        r1 = r14;
        r14 = r13;
        r13 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00d0, code lost:
    
        if (ads_mobile_sdk.pe2.b(r3, r1) == r2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0057, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0054, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00eb A[Catch: all -> 0x00f2, Exception -> 0x00f7, TryCatch #2 {Exception -> 0x00f7, blocks: (B:83:0x012f, B:85:0x0135, B:98:0x00df, B:100:0x00eb, B:101:0x00fc, B:103:0x0104, B:105:0x0108, B:108:0x010e), top: B:97:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fc A[Catch: all -> 0x00f2, Exception -> 0x00f7, TryCatch #2 {Exception -> 0x00f7, blocks: (B:83:0x012f, B:85:0x0135, B:98:0x00df, B:100:0x00eb, B:101:0x00fc, B:103:0x0104, B:105:0x0108, B:108:0x010e), top: B:97:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #9 {all -> 0x00f2, blocks: (B:20:0x0160, B:22:0x0164, B:83:0x012f, B:85:0x0135, B:98:0x00df, B:100:0x00eb, B:101:0x00fc, B:103:0x0104, B:105:0x0108, B:108:0x010e), top: B:97:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017c A[Catch: all -> 0x0188, TryCatch #1 {all -> 0x0188, blocks: (B:29:0x0175, B:31:0x017c, B:33:0x0180, B:35:0x0184, B:36:0x018a, B:38:0x018e, B:40:0x0192, B:42:0x0196, B:44:0x0197, B:45:0x019c, B:46:0x019d, B:47:0x01a4, B:48:0x01a5, B:49:0x01ac, B:50:0x01ad), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad A[Catch: all -> 0x0188, TRY_LEAVE, TryCatch #1 {all -> 0x0188, blocks: (B:29:0x0175, B:31:0x017c, B:33:0x0180, B:35:0x0184, B:36:0x018a, B:38:0x018e, B:40:0x0192, B:42:0x0196, B:44:0x0197, B:45:0x019c, B:46:0x019d, B:47:0x01a4, B:48:0x01a5, B:49:0x01ac, B:50:0x01ad), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c A[Catch: all -> 0x0039, Exception -> 0x003c, TRY_LEAVE, TryCatch #12 {Exception -> 0x003c, all -> 0x0039, blocks: (B:14:0x0034, B:15:0x0145, B:65:0x014c), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r13v47, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v35, types: [ads_mobile_sdk.th3, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v36, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.nd2 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nd2.b(ads_mobile_sdk.nd2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return b(this, (K14749510448791472029) r4833348786910499294);
    }
}
