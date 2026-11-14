package ads_mobile_sdk;

import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import java.io.Closeable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ry1 extends R14062301455140331524 implements F4096073349764486348 {
    public Object a;
    public Closeable b;
    public Closeable c;
    public Object d;
    public Object e;
    public th3 f;
    public byte g;
    public final /* synthetic */ I16631908410500040363 h;
    public final /* synthetic */ xy1 i;
    public final /* synthetic */ eg2 j;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry1(eg2 eg2Var, xy1 xy1Var, I16631908410500040363 i16631908410500040363, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.h = i16631908410500040363;
        this.i = xy1Var;
        this.j = eg2Var;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return new ry1(this.j, this.i, this.h, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                I16631908410500040363 i16631908410500040363 = this.h;
                return new ry1(this.j, this.i, i16631908410500040363, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e1 A[Catch: all -> 0x03ed, TryCatch #12 {all -> 0x03ed, blocks: (B:167:0x03da, B:169:0x03e1, B:171:0x03e5, B:173:0x03e9, B:174:0x03f0, B:176:0x03f4, B:178:0x03f8, B:180:0x03fc, B:181:0x03fd, B:182:0x0402, B:183:0x0403, B:184:0x040a, B:185:0x040b, B:186:0x0412, B:187:0x0413), top: B:166:0x03da }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0413 A[Catch: all -> 0x03ed, TRY_LEAVE, TryCatch #12 {all -> 0x03ed, blocks: (B:167:0x03da, B:169:0x03e1, B:171:0x03e5, B:173:0x03e9, B:174:0x03f0, B:176:0x03f4, B:178:0x03f8, B:180:0x03fc, B:181:0x03fd, B:182:0x0402, B:183:0x0403, B:184:0x040a, B:185:0x040b, B:186:0x0412, B:187:0x0413), top: B:166:0x03da }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033d A[Catch: all -> 0x0345, TRY_LEAVE, TryCatch #5 {all -> 0x0345, blocks: (B:203:0x0337, B:205:0x033d), top: B:202:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x034f A[Catch: all -> 0x0276, TryCatch #20 {all -> 0x0276, blocks: (B:208:0x0348, B:210:0x034f, B:211:0x0366, B:256:0x026b), top: B:255:0x026b }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0366 A[Catch: all -> 0x0276, TRY_LEAVE, TryCatch #20 {all -> 0x0276, blocks: (B:208:0x0348, B:210:0x034f, B:211:0x0366, B:256:0x026b), top: B:255:0x026b }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0393 A[Catch: all -> 0x039f, TryCatch #23 {all -> 0x039f, blocks: (B:218:0x038c, B:220:0x0393, B:222:0x0397, B:224:0x039b, B:225:0x03a2, B:227:0x03a6, B:229:0x03aa, B:231:0x03ae, B:232:0x03af, B:233:0x03b4, B:234:0x03b5, B:235:0x03bc, B:236:0x03bd, B:237:0x03c4, B:238:0x03c5), top: B:217:0x038c }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c5 A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #23 {all -> 0x039f, blocks: (B:218:0x038c, B:220:0x0393, B:222:0x0397, B:224:0x039b, B:225:0x03a2, B:227:0x03a6, B:229:0x03aa, B:231:0x03ae, B:232:0x03af, B:233:0x03b4, B:234:0x03b5, B:235:0x03bc, B:236:0x03bd, B:237:0x03c4, B:238:0x03c5), top: B:217:0x038c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d9 A[Catch: all -> 0x01e5, TryCatch #6 {all -> 0x01e5, blocks: (B:21:0x01d2, B:23:0x01d9, B:25:0x01dd, B:27:0x01e1, B:28:0x01e8, B:30:0x01ec, B:32:0x01f0, B:34:0x01f4, B:35:0x01f5, B:36:0x01fa, B:37:0x01fb, B:38:0x0202, B:39:0x0203, B:40:0x020a, B:41:0x020b), top: B:20:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020b A[Catch: all -> 0x01e5, TRY_LEAVE, TryCatch #6 {all -> 0x01e5, blocks: (B:21:0x01d2, B:23:0x01d9, B:25:0x01dd, B:27:0x01e1, B:28:0x01e8, B:30:0x01ec, B:32:0x01f0, B:34:0x01f4, B:35:0x01f5, B:36:0x01fa, B:37:0x01fb, B:38:0x0202, B:39:0x0203, B:40:0x020a, B:41:0x020b), top: B:20:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #16 {all -> 0x0130, blocks: (B:57:0x0122, B:59:0x0128), top: B:56:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:63:0x0137, B:65:0x013e, B:66:0x0162), top: B:62:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:63:0x0137, B:65:0x013e, B:66:0x0162), top: B:62:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d A[Catch: all -> 0x0199, TryCatch #22 {all -> 0x0199, blocks: (B:76:0x0186, B:78:0x018d, B:80:0x0191, B:82:0x0195, B:83:0x019c, B:85:0x01a0, B:87:0x01a4, B:89:0x01a8, B:90:0x01a9, B:91:0x01ae, B:92:0x01af, B:93:0x01b6, B:94:0x01b7, B:95:0x01be, B:96:0x01bf), top: B:75:0x0186, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bf A[Catch: all -> 0x0199, TRY_LEAVE, TryCatch #22 {all -> 0x0199, blocks: (B:76:0x0186, B:78:0x018d, B:80:0x0191, B:82:0x0195, B:83:0x019c, B:85:0x01a0, B:87:0x01a4, B:89:0x01a8, B:90:0x01a9, B:91:0x01ae, B:92:0x01af, B:93:0x01b6, B:94:0x01b7, B:95:0x01be, B:96:0x01bf), top: B:75:0x0186, outer: #8 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.Closeable] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ry1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
