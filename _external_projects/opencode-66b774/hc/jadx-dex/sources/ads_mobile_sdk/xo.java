package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xo extends ads_mobile_sdk.dr {
    public final android.os.BatteryManager l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(ads_mobile_sdk.jr0 jr0Var, android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.g0 g0Var) {
        super(o16637889491137121389, w5797197595347441198, kz2Var, jr0Var, g0Var);
        jr0Var.getClass();
        context.getClass();
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        kz2Var.getClass();
        g0Var.getClass();
        this.l = (android.os.BatteryManager) context.getSystemService(android.os.BatteryManager.class);
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.BATTERY;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        android.os.BatteryManager batteryManager = this.l;
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.wo(((double) batteryManager.getIntProperty(4)) / 100.0d, batteryManager.isCharging()));
    }
}
