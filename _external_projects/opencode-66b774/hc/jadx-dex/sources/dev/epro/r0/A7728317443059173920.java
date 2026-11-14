package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A7728317443059173920 extends dev.epro.r0.H18172316468146598624 {
    public final dev.epro.r0.W15255462148861058153 f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7728317443059173920(android.content.Context context, dev.epro.r0.Q13914734507241918864 q13914734507241918864, byte b) {
        super(context, q13914734507241918864);
        this.g = b;
        this.f = new dev.epro.r0.W15255462148861058153(this, (byte) 1);
    }

    public final java.lang.Object c() {
        byte b = this.g;
        java.lang.Object obj = ((dev.epro.r0.H18172316468146598624) this).b;
        boolean z = true;
        switch (b) {
            case 0:
                android.content.Intent intentRegisterReceiver = ((android.content.Context) obj).registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
                    int i = dev.epro.r0.E7856967994397430734.a;
                    b14824868959299866349N.getClass();
                    return java.lang.Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                android.content.Intent intentRegisterReceiver2 = ((android.content.Context) obj).registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    dev.epro.r0.B14824868959299866349 b14824868959299866349N2 = dev.epro.r0.B14824868959299866349.n();
                    int i2 = dev.epro.r0.T11524986218876621286.a;
                    b14824868959299866349N2.getClass();
                    return java.lang.Boolean.FALSE;
                }
                float intExtra2 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intentRegisterReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            default:
                android.content.Intent intentRegisterReceiver3 = ((android.content.Context) obj).registerReceiver(null, g());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    java.lang.String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    public final void e() {
        dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
        int i = dev.epro.r0.V11157196790895867036.a;
        b14824868959299866349N.getClass();
        ((android.content.Context) ((dev.epro.r0.H18172316468146598624) this).b).registerReceiver(this.f, g());
    }

    public final void f() {
        dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
        int i = dev.epro.r0.V11157196790895867036.a;
        b14824868959299866349N.getClass();
        ((android.content.Context) ((dev.epro.r0.H18172316468146598624) this).b).unregisterReceiver(this.f);
    }

    public final android.content.IntentFilter g() {
        switch (this.g) {
            case 0:
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                android.content.IntentFilter intentFilter3 = new android.content.IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
