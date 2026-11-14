package dev.epro.r0;

import ads_mobile_sdk.jp0;
import ads_mobile_sdk.vv1;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U9077732032884938013 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ boolean v;
    public Object w;
    public Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9077732032884938013(A8284336046188466534 a8284336046188466534, J7128855986599981135 j7128855986599981135, Object obj, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.x = a8284336046188466534;
        this.A = j7128855986599981135;
        this.z = obj;
        this.v = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                U9077732032884938013 u9077732032884938013 = new U9077732032884938013((A8284336046188466534) this.x, (J7128855986599981135) obj3, this.z, this.v, r4833348786910499294);
                u9077732032884938013.y = obj;
                return u9077732032884938013;
            case 1:
                return new U9077732032884938013((jp0) this.y, (vv1) obj2, (String) obj3, this.v, r4833348786910499294, (byte) 1);
            default:
                return new U9077732032884938013((jp0) this.y, (vv1) obj2, (String) obj3, this.v, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((U9077732032884938013) create((R4833348786910499294) obj2, (G6679190287479383402) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((U9077732032884938013) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((U9077732032884938013) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x040b, code lost:
    
        if (r7 == r6) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033e A[Catch: all -> 0x01f7, TRY_LEAVE, TryCatch #11 {all -> 0x01f7, blocks: (B:129:0x01ee, B:131:0x0338, B:133:0x033e), top: B:128:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0356 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:141:0x034f, B:143:0x0356, B:145:0x035a, B:147:0x035e, B:148:0x0365, B:150:0x0369, B:152:0x036d, B:154:0x0371, B:155:0x0372, B:156:0x0377, B:157:0x0378, B:158:0x037f, B:159:0x0380, B:160:0x0387, B:161:0x0388), top: B:140:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0186 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #15 {all -> 0x003f, blocks: (B:10:0x0036, B:12:0x0180, B:14:0x0186), top: B:9:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0388 A[Catch: all -> 0x0362, TRY_LEAVE, TryCatch #0 {all -> 0x0362, blocks: (B:141:0x034f, B:143:0x0356, B:145:0x035a, B:147:0x035e, B:148:0x0365, B:150:0x0369, B:152:0x036d, B:154:0x0371, B:155:0x0372, B:156:0x0377, B:157:0x0378, B:158:0x037f, B:159:0x0380, B:160:0x0387, B:161:0x0388), top: B:140:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c5 A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #5 {all -> 0x0212, blocks: (B:174:0x0209, B:176:0x02bf, B:178:0x02c5), top: B:173:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02df A[Catch: all -> 0x02eb, TryCatch #3 {all -> 0x02eb, blocks: (B:184:0x02d8, B:186:0x02df, B:188:0x02e3, B:190:0x02e7, B:191:0x02ee, B:193:0x02f2, B:195:0x02f6, B:197:0x02fa, B:198:0x02fb, B:199:0x0300, B:200:0x0301, B:201:0x0308, B:202:0x0309, B:203:0x0310, B:204:0x0311), top: B:183:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0311 A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #3 {all -> 0x02eb, blocks: (B:184:0x02d8, B:186:0x02df, B:188:0x02e3, B:190:0x02e7, B:191:0x02ee, B:193:0x02f2, B:195:0x02f6, B:197:0x02fa, B:198:0x02fb, B:199:0x0300, B:200:0x0301, B:201:0x0308, B:202:0x0309, B:203:0x0310, B:204:0x0311), top: B:183:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019e A[Catch: all -> 0x01aa, TryCatch #2 {all -> 0x01aa, blocks: (B:23:0x0197, B:25:0x019e, B:27:0x01a2, B:29:0x01a6, B:30:0x01ad, B:32:0x01b1, B:34:0x01b5, B:36:0x01b9, B:37:0x01ba, B:38:0x01bf, B:39:0x01c0, B:40:0x01c7, B:41:0x01c8, B:42:0x01cf, B:43:0x01d0), top: B:22:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0 A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #2 {all -> 0x01aa, blocks: (B:23:0x0197, B:25:0x019e, B:27:0x01a2, B:29:0x01a6, B:30:0x01ad, B:32:0x01b1, B:34:0x01b5, B:36:0x01b9, B:37:0x01ba, B:38:0x01bf, B:39:0x01c0, B:40:0x01c7, B:41:0x01c8, B:42:0x01cf, B:43:0x01d0), top: B:22:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #12 {all -> 0x005a, blocks: (B:56:0x0051, B:58:0x0107, B:60:0x010d), top: B:55:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[Catch: all -> 0x0133, TryCatch #8 {all -> 0x0133, blocks: (B:66:0x0120, B:68:0x0127, B:70:0x012b, B:72:0x012f, B:73:0x0136, B:75:0x013a, B:77:0x013e, B:79:0x0142, B:80:0x0143, B:81:0x0148, B:82:0x0149, B:83:0x0150, B:84:0x0151, B:85:0x0158, B:86:0x0159), top: B:65:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #8 {all -> 0x0133, blocks: (B:66:0x0120, B:68:0x0127, B:70:0x012b, B:72:0x012f, B:73:0x0136, B:75:0x013a, B:77:0x013e, B:79:0x0142, B:80:0x0143, B:81:0x0148, B:82:0x0149, B:83:0x0150, B:84:0x0151, B:85:0x0158, B:86:0x0159), top: B:65:0x0120 }] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U9077732032884938013.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U9077732032884938013(jp0 jp0Var, vv1 vv1Var, String str, boolean z, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.y = jp0Var;
        this.z = vv1Var;
        this.A = str;
        this.v = z;
    }
}
