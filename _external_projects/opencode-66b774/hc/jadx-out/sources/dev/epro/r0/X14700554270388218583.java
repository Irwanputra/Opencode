package dev.epro.r0;

import ads_mobile_sdk.rg2;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X14700554270388218583 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X14700554270388218583(ContentResolver contentResolver, Uri uri, R15649496231182150652 r15649496231182150652, H17686692708284905246 h17686692708284905246, Context context, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 3;
        this.x = contentResolver;
        this.y = uri;
        this.z = r15649496231182150652;
        this.A = h17686692708284905246;
        this.B = context;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.B;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                X14700554270388218583 x14700554270388218583 = new X14700554270388218583((D6414970586266598845) obj3, (H14327603681095415766) this.z, (F4096073349764486348) obj2, r4833348786910499294, (byte) 0);
                x14700554270388218583.x = obj;
                return x14700554270388218583;
            case 1:
                return new X14700554270388218583((rg2) obj3, (String) obj2, r4833348786910499294);
            case 2:
                X14700554270388218583 x147005542703882185832 = new X14700554270388218583((D6414970586266598845) obj3, (T17817572153526645469) this.z, (F4096073349764486348) obj2, r4833348786910499294, (byte) 2);
                x147005542703882185832.x = obj;
                return x147005542703882185832;
            default:
                X14700554270388218583 x147005542703882185833 = new X14700554270388218583((ContentResolver) this.x, (Uri) this.y, (R15649496231182150652) this.z, (H17686692708284905246) obj3, (Context) obj2, r4833348786910499294);
                x147005542703882185833.w = obj;
                return x147005542703882185833;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((X14700554270388218583) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new X14700554270388218583((rg2) this.A, (String) this.B, (R4833348786910499294) obj2).invokeSuspend(o9245300239821758723);
            case 2:
                return ((X14700554270388218583) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((X14700554270388218583) create((R4833348786910499294) obj2, (S7864201625552763331) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022a A[Catch: all -> 0x0212, TryCatch #11 {all -> 0x0212, blocks: (B:92:0x01f5, B:94:0x01f9, B:97:0x0208, B:100:0x0214, B:102:0x022a, B:103:0x022f, B:105:0x023b, B:106:0x023e), top: B:268:0x01f5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b A[Catch: all -> 0x0212, TryCatch #11 {all -> 0x0212, blocks: (B:92:0x01f5, B:94:0x01f9, B:97:0x0208, B:100:0x0214, B:102:0x022a, B:103:0x022f, B:105:0x023b, B:106:0x023e), top: B:268:0x01f5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0265 A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:115:0x025e, B:117:0x0265, B:119:0x0269, B:121:0x026d, B:124:0x0274, B:126:0x0278, B:128:0x027c, B:130:0x0280, B:131:0x0281, B:132:0x0286, B:133:0x0287, B:134:0x028e, B:135:0x028f, B:136:0x0296, B:137:0x0297), top: B:267:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0297 A[Catch: all -> 0x0271, TRY_LEAVE, TryCatch #10 {all -> 0x0271, blocks: (B:115:0x025e, B:117:0x0265, B:119:0x0269, B:121:0x026d, B:124:0x0274, B:126:0x0278, B:128:0x027c, B:130:0x0280, B:131:0x0281, B:132:0x0286, B:133:0x0287, B:134:0x028e, B:135:0x028f, B:136:0x0296, B:137:0x0297), top: B:267:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c1 A[Catch: all -> 0x02da, TryCatch #14 {all -> 0x02da, blocks: (B:147:0x02bd, B:149:0x02c1, B:152:0x02d0, B:155:0x02dc, B:157:0x02f2, B:158:0x02f7, B:160:0x0303, B:161:0x0306), top: B:273:0x02bd, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f2 A[Catch: all -> 0x02da, TryCatch #14 {all -> 0x02da, blocks: (B:147:0x02bd, B:149:0x02c1, B:152:0x02d0, B:155:0x02dc, B:157:0x02f2, B:158:0x02f7, B:160:0x0303, B:161:0x0306), top: B:273:0x02bd, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0303 A[Catch: all -> 0x02da, TryCatch #14 {all -> 0x02da, blocks: (B:147:0x02bd, B:149:0x02c1, B:152:0x02d0, B:155:0x02dc, B:157:0x02f2, B:158:0x02f7, B:160:0x0303, B:161:0x0306), top: B:273:0x02bd, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x032b A[Catch: all -> 0x0337, TryCatch #12 {all -> 0x0337, blocks: (B:169:0x0324, B:171:0x032b, B:173:0x032f, B:175:0x0333, B:178:0x033a, B:180:0x033e, B:182:0x0342, B:184:0x0346, B:185:0x0347, B:186:0x034c, B:187:0x034d, B:188:0x0354, B:189:0x0355, B:190:0x035c, B:191:0x035d), top: B:270:0x0324 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035d A[Catch: all -> 0x0337, TRY_LEAVE, TryCatch #12 {all -> 0x0337, blocks: (B:169:0x0324, B:171:0x032b, B:173:0x032f, B:175:0x0333, B:178:0x033a, B:180:0x033e, B:182:0x0342, B:184:0x0346, B:185:0x0347, B:186:0x034c, B:187:0x034d, B:188:0x0354, B:189:0x0355, B:190:0x035c, B:191:0x035d), top: B:270:0x0324 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #7 {all -> 0x002c, blocks: (B:9:0x0027, B:19:0x0059, B:22:0x0066, B:24:0x006e, B:15:0x003b, B:18:0x0050), top: B:262:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f9 A[Catch: all -> 0x0212, TryCatch #11 {all -> 0x0212, blocks: (B:92:0x01f5, B:94:0x01f9, B:97:0x0208, B:100:0x0214, B:102:0x022a, B:103:0x022f, B:105:0x023b, B:106:0x023e), top: B:268:0x01f5, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dev.epro.r0.R8015591507171738907, dev.epro.r0.Z3437138737604933638, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [dev.epro.r0.R8015591507171738907, dev.epro.r0.Z3437138737604933638, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:19:0x0059). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X14700554270388218583.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X14700554270388218583(D6414970586266598845 d6414970586266598845, Object obj, F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.A = d6414970586266598845;
        this.z = obj;
        this.B = f4096073349764486348;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X14700554270388218583(rg2 rg2Var, String str, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 1;
        this.A = rg2Var;
        this.B = str;
    }
}
