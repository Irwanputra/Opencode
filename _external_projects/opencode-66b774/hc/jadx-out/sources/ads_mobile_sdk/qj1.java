package ads_mobile_sdk;

import dev.epro.r0.A7209497065939201693;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends R14062301455140331524 implements L12639328004344855510 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public int e;
    public byte f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ zj1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ A7209497065939201693 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj1(String str, boolean z, zj1 zj1Var, boolean z2, A7209497065939201693 a7209497065939201693, String str2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.g = str;
        this.h = z;
        this.i = zj1Var;
        this.j = z2;
        this.k = a7209497065939201693;
        this.l = str2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new qj1(this.g, this.h, this.i, this.j, this.k, this.l, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((qj1) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c9 A[Catch: all -> 0x02d5, TryCatch #5 {all -> 0x02d5, blocks: (B:98:0x02c2, B:100:0x02c9, B:102:0x02cd, B:104:0x02d1, B:107:0x02d8, B:109:0x02dc, B:111:0x02e0, B:113:0x02e4, B:114:0x02e5, B:115:0x02ea, B:116:0x02eb, B:117:0x02f2, B:118:0x02f3, B:119:0x02fa, B:120:0x02fb), top: B:221:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fb A[Catch: all -> 0x02d5, TRY_LEAVE, TryCatch #5 {all -> 0x02d5, blocks: (B:98:0x02c2, B:100:0x02c9, B:102:0x02cd, B:104:0x02d1, B:107:0x02d8, B:109:0x02dc, B:111:0x02e0, B:113:0x02e4, B:114:0x02e5, B:115:0x02ea, B:116:0x02eb, B:117:0x02f2, B:118:0x02f3, B:119:0x02fa, B:120:0x02fb), top: B:221:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0327 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #1 {all -> 0x0071, blocks: (B:17:0x0068, B:130:0x0321, B:132:0x0327), top: B:213:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ba A[Catch: all -> 0x03c6, TryCatch #8 {all -> 0x03c6, blocks: (B:154:0x03b3, B:156:0x03ba, B:158:0x03be, B:160:0x03c2, B:163:0x03c9, B:165:0x03cd, B:167:0x03d1, B:169:0x03d5, B:170:0x03d6, B:171:0x03db, B:172:0x03dc, B:173:0x03e3, B:174:0x03e4, B:175:0x03eb, B:176:0x03ec), top: B:226:0x03b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ec A[Catch: all -> 0x03c6, TRY_LEAVE, TryCatch #8 {all -> 0x03c6, blocks: (B:154:0x03b3, B:156:0x03ba, B:158:0x03be, B:160:0x03c2, B:163:0x03c9, B:165:0x03cd, B:167:0x03d1, B:169:0x03d5, B:170:0x03d6, B:171:0x03db, B:172:0x03dc, B:173:0x03e3, B:174:0x03e4, B:175:0x03eb, B:176:0x03ec), top: B:226:0x03b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ff A[Catch: all -> 0x040b, TryCatch #9 {all -> 0x040b, blocks: (B:184:0x03f8, B:186:0x03ff, B:188:0x0403, B:190:0x0407, B:193:0x040e, B:195:0x0412, B:197:0x0416, B:199:0x041a, B:200:0x041b, B:201:0x0420, B:202:0x0421, B:203:0x0428, B:204:0x0429, B:205:0x0430, B:206:0x0431), top: B:227:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0431 A[Catch: all -> 0x040b, TRY_LEAVE, TryCatch #9 {all -> 0x040b, blocks: (B:184:0x03f8, B:186:0x03ff, B:188:0x0403, B:190:0x0407, B:193:0x040e, B:195:0x0412, B:197:0x0416, B:199:0x041a, B:200:0x041b, B:201:0x0420, B:202:0x0421, B:203:0x0428, B:204:0x0429, B:205:0x0430, B:206:0x0431), top: B:227:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b1 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #4 {all -> 0x0053, blocks: (B:12:0x004a, B:91:0x02ab, B:93:0x02b1), top: B:219:0x004a }] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [dev.epro.r0.L856869997670741194, dev.epro.r0.R4833348786910499294, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v21, types: [ads_mobile_sdk.th3] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
