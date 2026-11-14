package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class eq1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ android.app.Activity a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.Long i;
    public final /* synthetic */ java.lang.Long j;
    public final /* synthetic */ ads_mobile_sdk.fq1 k;
    public final /* synthetic */ ads_mobile_sdk.tx0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Long l, java.lang.Long l2, ads_mobile_sdk.fq1 fq1Var, ads_mobile_sdk.tx0 tx0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
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

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.eq1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.eq1 eq1VarCreate = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        eq1VarCreate.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.a, android.R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(this.b);
        builder.setMessage(this.c);
        java.lang.String str = this.f;
        java.lang.String str2 = this.g;
        java.lang.String str3 = this.h;
        java.lang.Long l = this.i;
        java.lang.Long l2 = this.j;
        ads_mobile_sdk.fq1 fq1Var = this.k;
        builder.setPositiveButton((java.lang.CharSequence) this.d, (android.content.DialogInterface.OnClickListener) new dev.epro.r0.L1916971333294664386(str, str2, str3, l, l2, fq1Var));
        builder.setNegativeButton((java.lang.CharSequence) this.e, (android.content.DialogInterface.OnClickListener) new dev.epro.r0.T10953921060779007092(fq1Var, this.l, (byte) 0));
        builder.create().show();
        return dev.epro.r0.O9245300239821758723.a;
    }
}
