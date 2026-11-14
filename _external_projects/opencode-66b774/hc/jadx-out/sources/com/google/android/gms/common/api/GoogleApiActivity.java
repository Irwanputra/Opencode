package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import dev.epro.r0.B6867906687934285025;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.R502132765509599220;
import dev.epro.r0.X11123940576545591343;
import dev.epro.r0.X12014589167171900524;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                X12014589167171900524 x12014589167171900524E = X12014589167171900524.e(this);
                if (i2 == -1) {
                    R502132765509599220 r502132765509599220 = x12014589167171900524E.m;
                    r502132765509599220.sendMessage(r502132765509599220.obtainMessage(3));
                } else if (i2 == 0) {
                    x12014589167171900524E.f(new B6867906687934285025(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                M18113111391818111737.v(num);
                X11123940576545591343.d.c(this, num.intValue(), this);
                this.a = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException unused) {
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException unused2) {
                googleApiActivity = this;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
            } catch (ActivityNotFoundException unused3) {
                if (extras.getBoolean("notify_manager", true)) {
                    X12014589167171900524.e(googleApiActivity).f(new B6867906687934285025(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    String strV = G6547577305291411977.v(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strV.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.a = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException unused4) {
                googleApiActivity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
