package dev.epro.r0;

import ads_mobile_sdk.bs3;
import ads_mobile_sdk.ci3;
import ads_mobile_sdk.et0;
import ads_mobile_sdk.of1;
import ads_mobile_sdk.rg2;
import ads_mobile_sdk.w81;
import ads_mobile_sdk.wj;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N12893830608069839869 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N12893830608069839869(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new N12893830608069839869((D2717688760023469083) obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new N12893830608069839869((ci3) obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new N12893830608069839869((w81) obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new N12893830608069839869((wj) obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new N12893830608069839869((bs3) obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new N12893830608069839869((rg2) obj2, r4833348786910499294, (byte) 5);
            case 6:
                return new N12893830608069839869((et0) obj2, r4833348786910499294, (byte) 6);
            case 7:
                return new N12893830608069839869((of1) obj2, r4833348786910499294, (byte) 7);
            case 8:
                return new N12893830608069839869((W10506740848038723587) obj2, r4833348786910499294, (byte) 8);
            case 9:
                return new N12893830608069839869((K14640285359526119410) obj2, r4833348786910499294, (byte) 9);
            default:
                return new N12893830608069839869((P9733793856018248168) obj2, r4833348786910499294, (byte) 10);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                long j = ((L2216691091636065972) obj).a;
                return new N12893830608069839869((D2717688760023469083) obj3, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new N12893830608069839869((ci3) obj3, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new N12893830608069839869((w81) obj3, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new N12893830608069839869((wj) obj3, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new N12893830608069839869((bs3) obj3, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new N12893830608069839869((rg2) obj3, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                return new N12893830608069839869((et0) obj3, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
            case 7:
                return new N12893830608069839869((of1) obj3, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            case 8:
                ((N12893830608069839869) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return Z3437138737604933638.a;
            case 9:
                return ((N12893830608069839869) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((N12893830608069839869) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x008a -> B:38:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00a5 -> B:48:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N12893830608069839869.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
