package ads_mobile_sdk;

import dev.epro.r0.B699768225374366618;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W12857842498428870907;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Y5584543079932758380;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bf extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf(String str, Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = str;
        this.a = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        String str = this.b;
        switch (b) {
            case 0:
                bf bfVar = new bf(str, r4833348786910499294, (byte) 0);
                bfVar.a = obj;
                return bfVar;
            case 1:
                bf bfVar2 = new bf(str, r4833348786910499294, (byte) 1);
                bfVar2.a = obj;
                return bfVar2;
            case 2:
                return new bf(str, this.a, r4833348786910499294, (byte) 2);
            case 3:
                return new bf(str, this.a, r4833348786910499294, (byte) 3);
            case 4:
                return new bf(str, this.a, r4833348786910499294, (byte) 4);
            case 5:
                return new bf(str, this.a, r4833348786910499294, (byte) 5);
            case 6:
                return new bf(str, this.a, r4833348786910499294, (byte) 6);
            case 7:
                return new bf(str, this.a, r4833348786910499294, (byte) 7);
            case 8:
                return new bf(str, this.a, r4833348786910499294, (byte) 8);
            default:
                return new bf(str, this.a, r4833348786910499294, (byte) 9);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        String str = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                bf bfVar = new bf(str, (R4833348786910499294) obj2, (byte) 0);
                bfVar.a = (ze) obj;
                break;
            case 1:
                bf bfVar2 = new bf(str, (R4833348786910499294) obj2, (byte) 1);
                bfVar2.a = (cq0) obj;
                break;
            case 2:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 5:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 6:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 7:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 8:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            default:
                ((bf) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        String str = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                W12857842498428870907 w12857842498428870907 = (W12857842498428870907) ((ze) this.a).n();
                Collections.unmodifiableMap(Collections.unmodifiableMap(((ze) w12857842498428870907.b).logs_)).getClass();
                str.getClass();
                w12857842498428870907.b();
                ze zeVar = (ze) w12857842498428870907.b;
                gn1 gn1Var = zeVar.logs_;
                if (!gn1Var.a) {
                    zeVar.logs_ = gn1Var.b();
                }
                zeVar.logs_.remove(str);
                break;
            case 1:
                E17665849472693074628.k(obj);
                Y5584543079932758380 y5584543079932758380 = (Y5584543079932758380) ((cq0) this.a).n();
                str.getClass();
                y5584543079932758380.b();
                ((cq0) y5584543079932758380.b).b(str);
                break;
            case 2:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).d();
                break;
            case 3:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).onDestroy();
                break;
            case 4:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).onPause();
                break;
            case 5:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).c();
                break;
            case 6:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).onResume();
                break;
            case 7:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).a$1();
                break;
            case 8:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).onStop();
                break;
            default:
                E17665849472693074628.k(obj);
                ((B699768225374366618) this.a).b$1();
                break;
        }
        return o9245300239821758723;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf(String str, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = str;
    }
}
