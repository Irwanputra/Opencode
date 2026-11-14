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
public final class eq1 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ fq1 k;
    public final /* synthetic */ tx0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, fq1 fq1Var, tx0 tx0Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = l2;
        this.k = fq1Var;
        this.l = tx0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new eq1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        eq1 eq1Var = (eq1) create((R4833348786910499294) obj2, (W5797197595347441198) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        eq1Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a, R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(this.b);
        builder.setMessage(this.c);
        String str = this.f;
        String str2 = this.g;
        String str3 = this.h;
        Long l = this.i;
        Long l2 = this.j;
        fq1 fq1Var = this.k;
        builder.setPositiveButton(this.d, new L1916971333294664386(str, str2, str3, l, l2, fq1Var));
        builder.setNegativeButton(this.e, new T10953921060779007092(fq1Var, this.l, (byte) 0));
        builder.create().show();
        return O9245300239821758723.a;
    }
}
