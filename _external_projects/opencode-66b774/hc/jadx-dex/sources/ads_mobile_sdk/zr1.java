package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zr1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ android.app.Activity a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ ads_mobile_sdk.cs1 f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ ads_mobile_sdk.tx0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ads_mobile_sdk.cs1 cs1Var, java.lang.String str5, java.lang.String str6, java.lang.String str7, ads_mobile_sdk.tx0 tx0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
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

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.zr1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.zr1 zr1VarCreate = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        zr1VarCreate.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        android.app.Activity activity = this.a;
        android.app.AlertDialog.Builder message = new android.app.AlertDialog.Builder(activity, android.R.style.Theme.Material.Dialog.Alert).setTitle(this.b).setMessage(this.c);
        ads_mobile_sdk.cs1 cs1Var = this.f;
        message.setPositiveButton((java.lang.CharSequence) this.d, (android.content.DialogInterface.OnClickListener) new dev.epro.r0.L1916971333294664386(cs1Var, this.g, this.h, this.i, activity, this.j)).setNegativeButton((java.lang.CharSequence) this.e, (android.content.DialogInterface.OnClickListener) new dev.epro.r0.T10953921060779007092(cs1Var, this.j, (byte) 1)).create().show();
        return dev.epro.r0.O9245300239821758723.a;
    }
}
