package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import p034.p050.p060.DialogInterfaceC1343;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public DialogInterfaceC1343 f3756;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f3757;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f3757);
            startActivityForResult(data, 7534);
        } else {
            if (i != -2) {
                throw new IllegalStateException(C2098.m4208("Unknown button type: ", i));
            }
            setResult(0);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) getIntent().getParcelableExtra("extra_app_settings");
        appSettingsDialog.getClass();
        appSettingsDialog.f3755 = this;
        this.f3757 = appSettingsDialog.f3748;
        int i = appSettingsDialog.f3749;
        DialogInterfaceC1343.C1344 c1344 = i != -1 ? new DialogInterfaceC1343.C1344(this, i) : new DialogInterfaceC1343.C1344(this);
        AlertController.C0038 c0038 = c1344.f6452;
        c0038.f177 = false;
        c0038.f174 = appSettingsDialog.f3754;
        c0038.f172 = appSettingsDialog.f3751;
        c1344.m3030(appSettingsDialog.f3752, this);
        c1344.m3029(appSettingsDialog.f3753, this);
        this.f3756 = c1344.m3032();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DialogInterfaceC1343 dialogInterfaceC1343 = this.f3756;
        if (dialogInterfaceC1343 == null || !dialogInterfaceC1343.isShowing()) {
            return;
        }
        this.f3756.dismiss();
    }
}
