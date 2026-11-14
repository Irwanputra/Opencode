package ads_mobile_sdk;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.L1916971333294664386;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.T10953921060779007092;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zr1 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cs1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ tx0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(Activity activity, String str, String str2, String str3, String str4, cs1 cs1Var, String str5, String str6, String str7, tx0 tx0Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = cs1Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = tx0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new zr1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        zr1 zr1Var = (zr1) create((R4833348786910499294) obj2, (W5797197595347441198) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        zr1Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        Activity activity = this.a;
        AlertDialog.Builder message = new AlertDialog.Builder(activity, R.style.Theme.Material.Dialog.Alert).setTitle(this.b).setMessage(this.c);
        cs1 cs1Var = this.f;
        message.setPositiveButton(this.d, new L1916971333294664386(cs1Var, this.g, this.h, this.i, activity, this.j)).setNegativeButton(this.e, new T10953921060779007092(cs1Var, this.j, (byte) 1)).create().show();
        return O9245300239821758723.a;
    }
}
