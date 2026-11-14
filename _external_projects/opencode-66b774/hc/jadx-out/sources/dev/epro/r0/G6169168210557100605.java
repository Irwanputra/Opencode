package dev.epro.r0;

import ads_mobile_sdk.d33;
import ads_mobile_sdk.hd2;
import ads_mobile_sdk.jy0;
import ads_mobile_sdk.pk3;
import ads_mobile_sdk.rr1;
import ads_mobile_sdk.uw2;
import ads_mobile_sdk.z1;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G6169168210557100605 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6169168210557100605(String str, Object obj, R4833348786910499294 r4833348786910499294, d33 d33Var, z1 z1Var, F11004654978627682545 f11004654978627682545) {
        super(2, r4833348786910499294);
        this.t = (byte) 5;
        this.w = str;
        this.v = obj;
        this.x = d33Var;
        this.y = z1Var;
        this.z = f11004654978627682545;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                G6169168210557100605 g6169168210557100605 = new G6169168210557100605(this.w, (F4096073349764486348) this.x, obj3, obj2, r4833348786910499294, (byte) 0);
                g6169168210557100605.v = obj;
                return g6169168210557100605;
            case 1:
                return new G6169168210557100605((hd2) obj3, (H9390398899829886498) obj2, r4833348786910499294);
            case 2:
                return new G6169168210557100605(this.x, obj3, obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new G6169168210557100605((pk3) this.v, (jy0) this.w, (String) this.x, (String) obj3, (String) obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new G6169168210557100605((rr1) this.v, (ViewGroup) this.w, (uw2) this.x, (Activity) obj3, (Window) obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new G6169168210557100605((String) this.w, this.v, r4833348786910499294, (d33) this.x, (z1) obj3, (F11004654978627682545) obj2);
            case 6:
                return new G6169168210557100605((I2076339260272013590) this.v, (W1972671267364756056) this.w, (Z1884745115210481769) this.x, (L9852841107405549527) obj3, (T8337309744439716006) obj2, r4833348786910499294, (byte) 6);
            case 7:
                return new G6169168210557100605((N18033783269298797248) this.v, (F13241018602672925865) this.w, (I2076339260272013590) this.x, (N17980339148608222959) obj3, (R17143752899285419206) obj2, r4833348786910499294, (byte) 7);
            case 8:
                G6169168210557100605 g61691682105571006052 = new G6169168210557100605(this.x, obj3, obj2, r4833348786910499294, (byte) 8);
                g61691682105571006052.v = obj;
                return g61691682105571006052;
            case 9:
                G6169168210557100605 g61691682105571006053 = new G6169168210557100605((S14157914735975478504) this.w, (J12078565427869724451) obj3, (F4096073349764486348) this.x, (H16689892403409870979) obj2, r4833348786910499294);
                g61691682105571006053.v = obj;
                return g61691682105571006053;
            case 10:
                G6169168210557100605 g61691682105571006054 = new G6169168210557100605(this.w, (F4096073349764486348) this.x, obj3, obj2, r4833348786910499294, (byte) 10);
                g61691682105571006054.v = obj;
                return g61691682105571006054;
            default:
                G6169168210557100605 g61691682105571006055 = new G6169168210557100605(this.x, obj3, obj2, r4833348786910499294, (byte) 11);
                g61691682105571006055.v = obj;
                return g61691682105571006055;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return Z3437138737604933638.a;
            case 1:
                return new G6169168210557100605((hd2) this.y, (H9390398899829886498) this.z, (R4833348786910499294) obj2).invokeSuspend(o9245300239821758723);
            case 2:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 3:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 4:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 5:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 6:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 7:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 8:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 9:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 10:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((G6169168210557100605) create((R4833348786910499294) obj2, (G3869673327990687150) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:221|(4:224|(1:358)(3:355|228|359)|356|222)|354|229|(8:232|(1:(2:234|(1:360)(1:361)))|240|(1:242)|243|(1:245)(1:246)|(4:258|(1:(2:260|(1:366)(1:367))(2:365|263))|264|(4:266|(1:(2:268|(1:369)(1:370))(2:368|271))|272|(1:274)(1:275))(1:276))(3:251|(1:(2:253|(1:363)(1:364))(2:362|256))|257)|(2:278|(2:280|389)(6:281|282|(0)(0)|(0)|289|390))(2:290|220))|333|237|(1:239)|240|(0)|243|(0)(0)|(1:248)|258|(2:(0)(0)|367)|264|(0)(0)|(0)(0)) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x031c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G6169168210557100605.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G6169168210557100605(Object obj, F4096073349764486348 f4096073349764486348, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.x = f4096073349764486348;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G6169168210557100605(Object obj, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G6169168210557100605(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6169168210557100605(hd2 hd2Var, H9390398899829886498 h9390398899829886498, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 1;
        this.y = hd2Var;
        this.z = h9390398899829886498;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6169168210557100605(S14157914735975478504 s14157914735975478504, J12078565427869724451 j12078565427869724451, F4096073349764486348 f4096073349764486348, H16689892403409870979 h16689892403409870979, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 9;
        this.w = s14157914735975478504;
        this.y = j12078565427869724451;
        this.x = f4096073349764486348;
        this.z = h16689892403409870979;
    }
}
