package dev.epro.r0;

import ads_mobile_sdk.jp0;
import ads_mobile_sdk.vv1;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:232:0x040b, code lost:
    
        if (r7 == r6) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d0 A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #2 {all -> 0x01aa, blocks: (B:81:0x0197, B:83:0x019e, B:85:0x01a2, B:87:0x01a6, B:90:0x01ad, B:92:0x01b1, B:94:0x01b5, B:96:0x01b9, B:97:0x01ba, B:98:0x01bf, B:99:0x01c0, B:100:0x01c7, B:101:0x01c8, B:102:0x01cf, B:103:0x01d0), top: B:247:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c5 A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #5 {all -> 0x0212, blocks: (B:121:0x0209, B:138:0x02bf, B:140:0x02c5), top: B:251:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02df A[Catch: all -> 0x02eb, TryCatch #3 {all -> 0x02eb, blocks: (B:146:0x02d8, B:148:0x02df, B:150:0x02e3, B:152:0x02e7, B:155:0x02ee, B:157:0x02f2, B:159:0x02f6, B:161:0x02fa, B:162:0x02fb, B:163:0x0300, B:164:0x0301, B:165:0x0308, B:166:0x0309, B:167:0x0310, B:168:0x0311), top: B:248:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0311 A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #3 {all -> 0x02eb, blocks: (B:146:0x02d8, B:148:0x02df, B:150:0x02e3, B:152:0x02e7, B:155:0x02ee, B:157:0x02f2, B:159:0x02f6, B:161:0x02fa, B:162:0x02fb, B:163:0x0300, B:164:0x0301, B:165:0x0308, B:166:0x0309, B:167:0x0310, B:168:0x0311), top: B:248:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033e A[Catch: all -> 0x01f7, TRY_LEAVE, TryCatch #11 {all -> 0x01f7, blocks: (B:115:0x01ee, B:178:0x0338, B:180:0x033e), top: B:262:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0356 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:186:0x034f, B:188:0x0356, B:190:0x035a, B:192:0x035e, B:195:0x0365, B:197:0x0369, B:199:0x036d, B:201:0x0371, B:202:0x0372, B:203:0x0377, B:204:0x0378, B:205:0x037f, B:206:0x0380, B:207:0x0387, B:208:0x0388), top: B:244:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0388 A[Catch: all -> 0x0362, TRY_LEAVE, TryCatch #0 {all -> 0x0362, blocks: (B:186:0x034f, B:188:0x0356, B:190:0x035a, B:192:0x035e, B:195:0x0365, B:197:0x0369, B:199:0x036d, B:201:0x0371, B:202:0x0372, B:203:0x0377, B:204:0x0378, B:205:0x037f, B:206:0x0380, B:207:0x0387, B:208:0x0388), top: B:244:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #12 {all -> 0x005a, blocks: (B:16:0x0051, B:33:0x0107, B:35:0x010d), top: B:264:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127 A[Catch: all -> 0x0133, TryCatch #8 {all -> 0x0133, blocks: (B:41:0x0120, B:43:0x0127, B:45:0x012b, B:47:0x012f, B:50:0x0136, B:52:0x013a, B:54:0x013e, B:56:0x0142, B:57:0x0143, B:58:0x0148, B:59:0x0149, B:60:0x0150, B:61:0x0151, B:62:0x0158, B:63:0x0159), top: B:257:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #8 {all -> 0x0133, blocks: (B:41:0x0120, B:43:0x0127, B:45:0x012b, B:47:0x012f, B:50:0x0136, B:52:0x013a, B:54:0x013e, B:56:0x0142, B:57:0x0143, B:58:0x0148, B:59:0x0149, B:60:0x0150, B:61:0x0151, B:62:0x0158, B:63:0x0159), top: B:257:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #15 {all -> 0x003f, blocks: (B:10:0x0036, B:73:0x0180, B:75:0x0186), top: B:270:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e A[Catch: all -> 0x01aa, TryCatch #2 {all -> 0x01aa, blocks: (B:81:0x0197, B:83:0x019e, B:85:0x01a2, B:87:0x01a6, B:90:0x01ad, B:92:0x01b1, B:94:0x01b5, B:96:0x01b9, B:97:0x01ba, B:98:0x01bf, B:99:0x01c0, B:100:0x01c7, B:101:0x01c8, B:102:0x01cf, B:103:0x01d0), top: B:247:0x0197 }] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1080
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
