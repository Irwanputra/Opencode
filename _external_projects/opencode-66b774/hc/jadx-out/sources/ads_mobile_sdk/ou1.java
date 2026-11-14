package ads_mobile_sdk;

import dev.epro.r0.A2558500182237595544;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 extends R14062301455140331524 implements L12639328004344855510 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public th3 e;
    public Closeable f;
    public Object g;
    public Object h;
    public byte i;
    public final /* synthetic */ su1 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ P16422848101170923038 m;
    public final /* synthetic */ A2558500182237595544 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou1(su1 su1Var, int i, int i2, P16422848101170923038 p16422848101170923038, A2558500182237595544 a2558500182237595544, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.j = su1Var;
        this.k = i;
        this.l = i2;
        this.m = p16422848101170923038;
        this.n = a2558500182237595544;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new ou1(this.j, this.k, this.l, this.m, this.n, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((ou1) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0314, code lost:
    
        if (((dev.epro.r0.J17843656891628349757) r9).d.r(r17, (ads_mobile_sdk.pu0) r5) == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b6, code lost:
    
        if (((dev.epro.r0.J17843656891628349757) r12).d.r(r17, r4) == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d2, code lost:
    
        if (((dev.epro.r0.J17843656891628349757) r10).d.r(r17, (ads_mobile_sdk.pu0) r6) == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0270, code lost:
    
        if (((dev.epro.r0.J17843656891628349757) r12).d.r(r17, r4) == r2) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x010b: MOVE (r3 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:268), block:B:46:0x010b */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0399: MOVE (r3 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:922), block:B:157:0x0399 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x010c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:269), block:B:46:0x010b */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x039a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:923), block:B:157:0x0399 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1 A[Catch: all -> 0x028b, TRY_LEAVE, TryCatch #4 {all -> 0x028b, blocks: (B:97:0x0278, B:99:0x027f, B:101:0x0283, B:103:0x0287, B:106:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029b, B:114:0x02a0, B:115:0x02a1, B:116:0x02a8, B:117:0x02a9, B:118:0x02b0, B:119:0x02b1), top: B:198:0x0278 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4 A[Catch: all -> 0x0318, TRY_LEAVE, TryCatch #14 {all -> 0x0318, blocks: (B:134:0x02ee, B:136:0x02f4), top: B:216:0x02ee }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0379 A[Catch: all -> 0x0394, PHI: r3 r4 r6 r8
      0x0379: PHI (r3v44 java.lang.Object) = (r3v40 java.lang.Object), (r3v49 java.lang.Object) binds: [B:147:0x0376, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r4v41 ??) = (r4v44 ??), (r4v45 ??) binds: [B:147:0x0376, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r6v37 dev.epro.r0.A2558500182237595544) = (r6v34 dev.epro.r0.A2558500182237595544), (r6v40 dev.epro.r0.A2558500182237595544) binds: [B:147:0x0376, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r8v28 ??) = (r8v30 ??), (r8v29 ??) binds: [B:147:0x0376, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #12 {all -> 0x0394, blocks: (B:149:0x0379, B:146:0x035b), top: B:212:0x035b }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c4 A[Catch: all -> 0x03d0, TryCatch #9 {all -> 0x03d0, blocks: (B:165:0x03bd, B:167:0x03c4, B:169:0x03c8, B:171:0x03cc, B:174:0x03d3, B:176:0x03d7, B:178:0x03db, B:180:0x03df, B:181:0x03e0, B:182:0x03e5, B:183:0x03e6, B:184:0x03ed, B:185:0x03ee, B:186:0x03f5, B:187:0x03f6), top: B:207:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f6 A[Catch: all -> 0x03d0, TRY_LEAVE, TryCatch #9 {all -> 0x03d0, blocks: (B:165:0x03bd, B:167:0x03c4, B:169:0x03c8, B:171:0x03cc, B:174:0x03d3, B:176:0x03d7, B:178:0x03db, B:180:0x03df, B:181:0x03e0, B:182:0x03e5, B:183:0x03e6, B:184:0x03ed, B:185:0x03ee, B:186:0x03f5, B:187:0x03f6), top: B:207:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b3 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #13 {all -> 0x01d6, blocks: (B:67:0x01ac, B:69:0x01b3), top: B:214:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0235 A[Catch: all -> 0x0250, PHI: r3 r4 r6 r8
      0x0235: PHI (r3v22 java.lang.Object) = (r3v18 java.lang.Object), (r3v27 java.lang.Object) binds: [B:80:0x0231, B:39:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r4v22 ??) = (r4v46 ??), (r4v47 ??) binds: [B:80:0x0231, B:39:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r6v21 dev.epro.r0.A2558500182237595544) = (r6v17 dev.epro.r0.A2558500182237595544), (r6v24 dev.epro.r0.A2558500182237595544) binds: [B:80:0x0231, B:39:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r8v14 ??) = (r8v32 ??), (r8v15 ??) binds: [B:80:0x0231, B:39:0x00dd] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x0250, blocks: (B:82:0x0235, B:79:0x0217), top: B:205:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027f A[Catch: all -> 0x028b, TryCatch #4 {all -> 0x028b, blocks: (B:97:0x0278, B:99:0x027f, B:101:0x0283, B:103:0x0287, B:106:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029b, B:114:0x02a0, B:115:0x02a1, B:116:0x02a8, B:117:0x02a9, B:118:0x02b0, B:119:0x02b1), top: B:198:0x0278 }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6, types: [ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [ads_mobile_sdk.em2, ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v10, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r9v11, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ou1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
