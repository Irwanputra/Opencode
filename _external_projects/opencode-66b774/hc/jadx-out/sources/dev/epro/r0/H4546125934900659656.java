package dev.epro.r0;

import ads_mobile_sdk.ag;
import ads_mobile_sdk.bs3;
import ads_mobile_sdk.c61;
import ads_mobile_sdk.cq0;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.iz;
import ads_mobile_sdk.wt1;
import android.database.sqlite.SQLiteDatabase;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class H4546125934900659656 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    static {
        izmyclvb.dpqpjfpoanwt1(1571);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4546125934900659656(it1 it1Var, wt1 wt1Var, I16631908410500040363 i16631908410500040363, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 22;
        this.v = wt1Var;
        this.w = i16631908410500040363;
        this.x = it1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 5);
            case 6:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 6);
            case 7:
                H4546125934900659656 h4546125934900659656 = new H4546125934900659656(this.w, obj2, r4833348786910499294, (byte) 7);
                h4546125934900659656.v = obj;
                return h4546125934900659656;
            case 8:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 8);
            case 9:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 9);
            case 10:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 10);
            case 11:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 11);
            case 12:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 12);
            case 13:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 13);
            case 14:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 14);
            case 15:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 15);
            case 16:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 16);
            case 17:
                return new H4546125934900659656((ag) obj2, r4833348786910499294, (byte) 17);
            case 18:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 18);
            case 19:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 19);
            case 20:
                H4546125934900659656 h45461259349006596562 = new H4546125934900659656((iz) obj2, (I16631908410500040363) this.w, r4833348786910499294, this.u);
                h45461259349006596562.v = obj;
                return h45461259349006596562;
            case 21:
                return new H4546125934900659656((bs3) obj2, r4833348786910499294, (byte) 21);
            case 22:
                return new H4546125934900659656((it1) obj2, (wt1) this.v, (I16631908410500040363) this.w, r4833348786910499294);
            case 23:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 23);
            case 24:
                return new H4546125934900659656((String) this.v, this.w, r4833348786910499294, obj2, (byte) 24);
            case 25:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 25);
            case 26:
                return new H4546125934900659656(this.v, this.w, obj2, r4833348786910499294, (byte) 26);
            case 27:
                H4546125934900659656 h45461259349006596563 = new H4546125934900659656(this.w, obj2, r4833348786910499294, (byte) 27);
                h45461259349006596563.v = obj;
                return h45461259349006596563;
            case 28:
                H4546125934900659656 h45461259349006596564 = new H4546125934900659656(this.w, obj2, r4833348786910499294, (byte) 28);
                h45461259349006596564.v = obj;
                return h45461259349006596564;
            default:
                H4546125934900659656 h45461259349006596565 = new H4546125934900659656(this.w, obj2, r4833348786910499294, (byte) 29);
                h45461259349006596565.v = obj;
                return h45461259349006596565;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.x;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 3:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 4:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 5:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 6:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 7:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (SQLiteDatabase) obj)).invokeSuspend(o9245300239821758723);
            case 8:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 9:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 10:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 11:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 12:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 13:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 14:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 15:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 16:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 17:
                return new H4546125934900659656((ag) obj3, (R4833348786910499294) obj2, (byte) 17).invokeSuspend(o9245300239821758723);
            case 18:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 19:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 20:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (cq0) obj)).invokeSuspend(o9245300239821758723);
            case 21:
                return new H4546125934900659656((bs3) obj3, (R4833348786910499294) obj2, (byte) 21).invokeSuspend(o9245300239821758723);
            case 22:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 23:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 24:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 25:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 26:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 27:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (D17840030713596081464) obj)).invokeSuspend(o9245300239821758723);
            case 28:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (V4351601219763732262) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((H4546125934900659656) create((R4833348786910499294) obj2, (H9390398899829886498) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H4546125934900659656(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H4546125934900659656(Object obj, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H4546125934900659656(String str, Object obj, R4833348786910499294 r4833348786910499294, Object obj2, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = str;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H4546125934900659656(c61 c61Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.x = c61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4546125934900659656(iz izVar, I16631908410500040363 i16631908410500040363, R4833348786910499294 r4833348786910499294, boolean z) {
        super(2, r4833348786910499294);
        this.t = (byte) 20;
        this.w = i16631908410500040363;
        this.u = z;
        this.x = izVar;
    }
}
