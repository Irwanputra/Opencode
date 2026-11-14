package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import dev.epro.r0.J15730374346044043770;
import dev.epro.r0.R2847330884077978889;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.S9286526287894964911;
import dev.epro.r0.T13998044911588922055;
import dev.epro.r0.V11923105316530470448;
import dev.epro.r0.Z860808776098365610;
import java.util.HashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class HsdpShimActivity extends Activity {
    public String a = null;
    public boolean b = false;

    public final void a(boolean z) {
        HashMap map;
        S9286526287894964911 s9286526287894964911;
        IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            S10973172697741180971.m("windowToken is null");
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("target_package_name");
        if (stringExtra == null) {
            S10973172697741180971.m("targetPackageName is null");
            return;
        }
        V11923105316530470448 v11923105316530470448V = Z860808776098365610.V(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        if (z || !stringExtra.equals(this.a) || (s9286526287894964911 = (S9286526287894964911) ((R2847330884077978889) v11923105316530470448V).c.get(stringExtra)) == null || s9286526287894964911.a != 2) {
            this.a = stringExtra;
            this.b = false;
            String stringExtra2 = intent.getStringExtra("referrer");
            if (stringExtra2 == null) {
                S10973172697741180971.m("referrer is null");
                return;
            }
            String stringExtra3 = intent.getStringExtra("deeplink_url");
            if (stringExtra3 == null) {
                S10973172697741180971.m("deeplinkUrl is null");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
            Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
            if (bundleExtra != null) {
                map = new HashMap();
                for (String str : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    map.put(str, string);
                }
            } else {
                map = null;
            }
            ((R2847330884077978889) v11923105316530470448V).a(stringExtra, stringExtra3, windowToken, T13998044911588922055.o(this, getResources().getConfiguration().screenWidthDp), T13998044911588922055.p(this), booleanExtra, new J15730374346044043770(this, stringExtra, stringExtra2, map));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(true);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hsdp_shim_activity);
        Window window = getWindow();
        window.setLayout(-1, -1);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(false);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
