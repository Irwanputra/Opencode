package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.Intent;
import android.net.VpnService;

/* loaded from: /tmp/opencode/hc_real.dex */
public class GrantPermissionsActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2);
        finish();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Intent prepare = VpnService.prepare(this);
        if (prepare == null) {
            onActivityResult(0, -1, null);
        } else {
            startActivityForResult(prepare, 0);
        }
    }
}
