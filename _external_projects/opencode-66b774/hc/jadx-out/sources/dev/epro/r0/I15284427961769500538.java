package dev.epro.r0;

import ads_mobile_sdk.iv2;
import ads_mobile_sdk.iy0;
import ads_mobile_sdk.jc1;
import ads_mobile_sdk.of1;
import ads_mobile_sdk.tx0;
import ads_mobile_sdk.w62;
import android.net.Uri;
import android.webkit.WebResourceRequest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I15284427961769500538 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I15284427961769500538(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new I15284427961769500538((L18111935460025096722) this.v, (U6972183442521542605) obj2, r4833348786910499294, (byte) 0);
            case 1:
                I15284427961769500538 i15284427961769500538 = new I15284427961769500538((iv2) obj2, r4833348786910499294, (byte) 1);
                i15284427961769500538.v = obj;
                return i15284427961769500538;
            case 2:
                return new I15284427961769500538((iy0) this.v, (WebResourceRequest) obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new I15284427961769500538((jc1) obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new I15284427961769500538((tx0) obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new I15284427961769500538((of1) this.v, (F4096073349764486348) obj2, r4833348786910499294, (byte) 5);
            case 6:
                return new I15284427961769500538((w62) obj2, r4833348786910499294, (byte) 6);
            case 7:
                return new I15284427961769500538((iy0) this.v, (Uri) obj2, r4833348786910499294, (byte) 7);
            case 8:
                return new I15284427961769500538((F1048562484897106753) this.v, (W8455343525638953052) obj2, r4833348786910499294, (byte) 8);
            case 9:
                return new I15284427961769500538((Q2423450198286343102) this.v, (W8455343525638953052) obj2, r4833348786910499294, (byte) 9);
            case 10:
                return new I15284427961769500538((Q15035754882231748864) this.v, (T3484731262671441138) obj2, r4833348786910499294, (byte) 10);
            case 11:
                return new I15284427961769500538((J7128855986599981135) this.v, (Y17552568327163695994) obj2, r4833348786910499294, (byte) 11);
            case 12:
                return new I15284427961769500538((J12043550928838212009) this.v, (N14028163092316284073) obj2, r4833348786910499294, (byte) 12);
            case 13:
                I15284427961769500538 i152844279617695005382 = new I15284427961769500538((R11526459248061709572) obj2, r4833348786910499294, (byte) 13);
                i152844279617695005382.v = obj;
                return i152844279617695005382;
            case 14:
                return new I15284427961769500538((J15730374346044043770) obj2, r4833348786910499294, (byte) 14);
            case 15:
                return new I15284427961769500538((Q15035754882231748864) this.v, (H16689892403409870979) obj2, r4833348786910499294, (byte) 15);
            default:
                I15284427961769500538 i152844279617695005383 = new I15284427961769500538((J16088445080955867036) obj2, r4833348786910499294, (byte) 16);
                i152844279617695005383.v = obj;
                return i152844279617695005383;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj3 = this.w;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                I15284427961769500538 i15284427961769500538 = new I15284427961769500538((iv2) obj3, (R4833348786910499294) obj2, (byte) 1);
                i15284427961769500538.v = (W5797197595347441198) obj;
                return i15284427961769500538.invokeSuspend(o9245300239821758723);
            case 2:
                return new I15284427961769500538((iy0) this.v, (WebResourceRequest) obj3, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new I15284427961769500538((jc1) obj3, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new I15284427961769500538((tx0) obj3, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new I15284427961769500538((of1) this.v, (F4096073349764486348) obj3, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                return new I15284427961769500538((w62) obj3, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
            case 7:
                return new I15284427961769500538((iy0) this.v, (Uri) obj3, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            case 8:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 9:
                ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return z3437138737604933638;
            case 10:
                ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return z3437138737604933638;
            case 11:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 12:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 13:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 14:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 15:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((I15284427961769500538) create((R4833348786910499294) obj2, (F6741456026889144139) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f7, code lost:
    
        if (r0 == r3) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023c, code lost:
    
        if (r0 == r3) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02b1, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(500, r5) != r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0306, code lost:
    
        if (r1.collect(r2, r5) == r0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r2 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03b3, code lost:
    
        if (r1.n(r5) == r0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0412, code lost:
    
        if (ads_mobile_sdk.m72.a(r0, r1, r5) == r11) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x046b, code lost:
    
        if (r0.a(r5) != r11) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0478, code lost:
    
        if (r0.a(r5) == r11) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04b1, code lost:
    
        if (r1.invoke(r5) == r0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x051b, code lost:
    
        if (r0 == r12) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05cd, code lost:
    
        if (r1.n(r5) == r0) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r1.d(r5) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        if (r2.invoke(r3, r5) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a8 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:144:0x025c, B:172:0x02b5, B:165:0x029f, B:168:0x02a8, B:149:0x0266, B:150:0x026a, B:151:0x0272, B:161:0x0291, B:163:0x0298), top: B:376:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0 A[PHI: r2 r3
      0x00f0: PHI (r2v56 dev.epro.r0.Y14354959068095823168) = (r2v62 dev.epro.r0.Y14354959068095823168), (r2v68 dev.epro.r0.Y14354959068095823168) binds: [B:50:0x00ed, B:46:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r3v31 java.lang.Object) = (r3v34 java.lang.Object), (r3v35 java.lang.Object) binds: [B:50:0x00ed, B:46:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x02b1 -> B:172:0x02b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:352:0x063d -> B:346:0x05fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f8 -> B:55:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x017a -> B:75:0x0140). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I15284427961769500538.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I15284427961769500538(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
    }
}
