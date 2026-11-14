package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class yq extends R14062301455140331524 implements F4096073349764486348 {
    public Object a;
    public th3 b;
    public Object c;
    public Object d;
    public Object e;
    public byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ byte t = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(zk1 zk1Var, Y4798753258822141670 y4798753258822141670, tx0 tx0Var, Uri uri, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.g = zk1Var;
        this.c = y4798753258822141670;
        this.d = tx0Var;
        this.e = uri;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                return new yq((dr) obj2, (R4833348786910499294) obj).invokeSuspend(o9245300239821758723);
            default:
                return new yq((zk1) obj2, (Y4798753258822141670) this.c, (tx0) this.d, (Uri) this.e, (R4833348786910499294) obj).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026a A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #35 {all -> 0x0294, blocks: (B:148:0x0266, B:150:0x026a), top: B:319:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0306 A[Catch: all -> 0x01cd, TRY_LEAVE, TryCatch #27 {all -> 0x01cd, blocks: (B:183:0x0301, B:185:0x0306, B:119:0x01c8, B:159:0x02a1, B:162:0x02a9, B:163:0x02ac), top: B:334:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0321 A[Catch: all -> 0x032d, TryCatch #10 {all -> 0x032d, blocks: (B:193:0x031a, B:195:0x0321, B:197:0x0325, B:199:0x0329, B:202:0x0330, B:204:0x0334, B:206:0x0338, B:208:0x033c, B:209:0x033d, B:210:0x0342, B:211:0x0343, B:212:0x034a, B:213:0x034b, B:214:0x0352, B:215:0x0353), top: B:310:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0353 A[Catch: all -> 0x032d, TRY_LEAVE, TryCatch #10 {all -> 0x032d, blocks: (B:193:0x031a, B:195:0x0321, B:197:0x0325, B:199:0x0329, B:202:0x0330, B:204:0x0334, B:206:0x0338, B:208:0x033c, B:209:0x033d, B:210:0x0342, B:211:0x0343, B:212:0x034a, B:213:0x034b, B:214:0x0352, B:215:0x0353), top: B:310:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a7 A[Catch: all -> 0x03cd, TryCatch #28 {all -> 0x03cd, blocks: (B:230:0x03a3, B:232:0x03a7, B:236:0x03d1), top: B:311:0x03a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0436 A[Catch: all -> 0x043e, TRY_LEAVE, TryCatch #20 {all -> 0x043e, blocks: (B:260:0x0431, B:262:0x0436), top: B:321:0x0431 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x045a A[Catch: all -> 0x0466, TryCatch #4 {all -> 0x0466, blocks: (B:273:0x0453, B:275:0x045a, B:277:0x045e, B:279:0x0462, B:282:0x0469, B:284:0x046d, B:286:0x0471, B:288:0x0475, B:289:0x0476, B:290:0x047b, B:291:0x047c, B:292:0x0483, B:293:0x0484, B:294:0x048b, B:295:0x048c), top: B:303:0x0453 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x048c A[Catch: all -> 0x0466, TRY_LEAVE, TryCatch #4 {all -> 0x0466, blocks: (B:273:0x0453, B:275:0x045a, B:277:0x045e, B:279:0x0462, B:282:0x0469, B:284:0x046d, B:286:0x0471, B:288:0x0475, B:289:0x0476, B:290:0x047b, B:291:0x047c, B:292:0x0483, B:293:0x0484, B:294:0x048b, B:295:0x048c), top: B:303:0x0453 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: all -> 0x009d, TryCatch #37 {all -> 0x009d, blocks: (B:30:0x008a, B:32:0x0091, B:34:0x0095, B:36:0x0099, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:45:0x00ac, B:46:0x00ad, B:47:0x00b2, B:48:0x00b3, B:49:0x00ba, B:50:0x00bb, B:51:0x00c2, B:52:0x00c3), top: B:348:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #37 {all -> 0x009d, blocks: (B:30:0x008a, B:32:0x0091, B:34:0x0095, B:36:0x0099, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:45:0x00ac, B:46:0x00ad, B:47:0x00b2, B:48:0x00b3, B:49:0x00ba, B:50:0x00bb, B:51:0x00c2, B:52:0x00c3), top: B:348:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100 A[Catch: all -> 0x010c, TryCatch #26 {all -> 0x010c, blocks: (B:66:0x00f9, B:68:0x0100, B:70:0x0104, B:72:0x0108, B:75:0x010f, B:77:0x0113, B:79:0x0117, B:81:0x011b, B:82:0x011c, B:83:0x0121, B:84:0x0122, B:85:0x0129, B:86:0x012a, B:87:0x0131, B:88:0x0132), top: B:333:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0132 A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #26 {all -> 0x010c, blocks: (B:66:0x00f9, B:68:0x0100, B:70:0x0104, B:72:0x0108, B:75:0x010f, B:77:0x0113, B:79:0x0117, B:81:0x011b, B:82:0x011c, B:83:0x0121, B:84:0x0122, B:85:0x0129, B:86:0x012a, B:87:0x0131, B:88:0x0132), top: B:333:0x00f9 }] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(dr drVar, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.g = drVar;
    }
}
