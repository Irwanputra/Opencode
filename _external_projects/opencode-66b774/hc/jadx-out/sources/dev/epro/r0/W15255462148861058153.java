package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W15255462148861058153 extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ W15255462148861058153(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((R4239627874707364917) obj).n();
                break;
            default:
                context.getClass();
                intent.getClass();
                A7728317443059173920 a7728317443059173920 = (A7728317443059173920) obj;
                switch (a7728317443059173920.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                            int i = E7856967994397430734.a;
                            b14824868959299866349N.getClass();
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        a7728317443059173920.d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        a7728317443059173920.d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        a7728317443059173920.d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        a7728317443059173920.d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
                            int i2 = T11524986218876621286.a;
                            intent.getAction();
                            b14824868959299866349N2.getClass();
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        a7728317443059173920.d(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    a7728317443059173920.d(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            B14824868959299866349 b14824868959299866349N3 = B14824868959299866349.n();
                            int i3 = Z17211689218074360498.a;
                            intent.getAction();
                            b14824868959299866349N3.getClass();
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        a7728317443059173920.d(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    a7728317443059173920.d(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
        }
    }
}
