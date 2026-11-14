package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jr extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ android.content.Intent a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr(android.content.Intent intent, byte b) {
        super(1);
        this.i = b;
        this.a = intent;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.i;
        android.content.Intent intent = this.a;
        switch (b) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                return intent.setData(android.net.Uri.parse(str));
            case 1:
                java.lang.String str2 = (java.lang.String) obj;
                str2.getClass();
                return intent.setAction(str2);
            case 2:
                java.lang.String str3 = (java.lang.String) obj;
                str3.getClass();
                return intent.setType(str3);
            case 3:
                java.lang.String str4 = (java.lang.String) obj;
                str4.getClass();
                return intent.setPackage(str4);
            default:
                java.lang.String str5 = (java.lang.String) obj;
                str5.getClass();
                java.lang.String[] strArr = (java.lang.String[]) new dev.epro.r0.H5336160545165318150("/").i(2, str5).toArray(new java.lang.String[0]);
                if (strArr.length == 2) {
                    intent.setComponent(new android.content.ComponentName(strArr[0], strArr[1]));
                }
                return dev.epro.r0.O9245300239821758723.a;
        }
    }
}
