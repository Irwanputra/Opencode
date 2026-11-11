package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzxe;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzxe f2522;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f2522.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            zzakb.zzc("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean z = true;
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                z = zzxeVar.zzmu();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f2522.zzk(new BinderC2454(configuration));
        } catch (RemoteException e) {
            zzakb.zzc("Failed to wrap configuration.", e);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzxe zzb = zzkb.zzib().zzb(this);
        this.f2522 = zzb;
        if (zzb == null) {
            zzakb.zzcu("Could not create ad overlay.");
        } else {
            try {
                zzb.onCreate(bundle);
                return;
            } catch (RemoteException e) {
                zzakb.zzc("Could not forward onCreate to ad overlay:", e);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onDestroy();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onPause();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onRestart();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onResume();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onStart();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        try {
            zzxe zzxeVar = this.f2522;
            if (zzxeVar != null) {
                zzxeVar.onStop();
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        m1195();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        m1195();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m1195();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1195() {
        zzxe zzxeVar = this.f2522;
        if (zzxeVar != null) {
            try {
                zzxeVar.zzbf();
            } catch (RemoteException e) {
                zzakb.zzc("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }
}
