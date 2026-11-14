package dev.epro.r0;

import ads_mobile_sdk.w13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B13379005111179728343 extends BroadcastReceiver {
    public final /* synthetic */ byte a;

    public /* synthetic */ B13379005111179728343(byte b) {
        this.a = b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        E2166724654553415323.b = (byte) 1;
                    } else if (intExtra == 1) {
                        E2166724654553415323.b = (byte) 2;
                    }
                }
                break;
            default:
                w13 w13Var = w13.d;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    w13Var.a(true, w13Var.c);
                    w13Var.b = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    w13Var.a(false, w13Var.c);
                    w13Var.b = false;
                }
                break;
        }
    }
}
