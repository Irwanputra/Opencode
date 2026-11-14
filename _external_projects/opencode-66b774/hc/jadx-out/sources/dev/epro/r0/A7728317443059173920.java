package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A7728317443059173920 extends H18172316468146598624 {
    public final W15255462148861058153 f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7728317443059173920(Context context, Q13914734507241918864 q13914734507241918864, byte b) {
        super(context, q13914734507241918864);
        this.g = b;
        this.f = new W15255462148861058153(this, (byte) 1);
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final Object c() {
        byte b = this.g;
        Object obj = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                Intent intentRegisterReceiver = ((Context) obj).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                    int i = E7856967994397430734.a;
                    b14824868959299866349N.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) obj).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
                    int i2 = T11524986218876621286.a;
                    b14824868959299866349N2.getClass();
                    return Boolean.FALSE;
                }
                float intExtra2 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intentRegisterReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = ((Context) obj).registerReceiver(null, g());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
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
                return Boolean.valueOf(z);
        }
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final void e() {
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        int i = V11157196790895867036.a;
        b14824868959299866349N.getClass();
        ((Context) this.b).registerReceiver(this.f, g());
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final void f() {
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        int i = V11157196790895867036.a;
        b14824868959299866349N.getClass();
        ((Context) this.b).unregisterReceiver(this.f);
    }

    public final IntentFilter g() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
