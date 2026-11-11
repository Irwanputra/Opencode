package com.balsikandar.crashreporter.ui;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TimeZone;
import java.util.UUID;
import p131.p150.p151.C2079;
import p131.p150.p151.C2086;
import p131.p150.p151.C2087;
import p131.p150.p151.C2088;
import p131.p150.p151.p154.C2097;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LogMessageActivity extends AppCompatActivity {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public TextView f2008;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2086.activity_log_message);
        this.f2008 = (TextView) findViewById(C2088.appInfo);
        Intent intent = getIntent();
        if (intent != null) {
            File file = new File(intent.getStringExtra("LogMessage"));
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                bufferedReader.close();
            } catch (IOException unused) {
            }
            ((TextView) findViewById(C2088.logMessage)).setText(sb.toString());
        }
        Toolbar toolbar = (Toolbar) findViewById(C2088.toolbar);
        toolbar.setTitle(getString(C2079.crash_reporter));
        m79().mo2980(toolbar);
        m72().mo55(true);
        TextView textView = this.f2008;
        StringBuilder m4207 = C2098.m4207("DEVICE INFORMATION:\n\nDEVICE.ID : ");
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        if (string == null || string.toLowerCase().equals("9774d56d682e549c")) {
            string = null;
        }
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        m4207.append(string);
        m4207.append("\nAPP : ");
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            StringBuilder sb2 = new StringBuilder();
            ApplicationInfo applicationInfo = getApplicationInfo();
            int i = applicationInfo.labelRes;
            sb2.append(i == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i));
            sb2.append(" (");
            sb2.append(packageInfo.packageName);
            sb2.append(")");
            m4207.append(sb2.toString());
            m4207.append("\nAPP.VERSION : ");
            try {
                PackageInfo packageInfo2 = getPackageManager().getPackageInfo(getPackageName(), 0);
                m4207.append(packageInfo2.versionName + " (" + packageInfo2.versionCode + ")");
                m4207.append("\nTIMEZONE : ");
                m4207.append(TimeZone.getDefault().getID());
                m4207.append("\nVERSION.RELEASE : ");
                m4207.append(Build.VERSION.RELEASE);
                m4207.append("\nVERSION.INCREMENTAL : ");
                m4207.append(Build.VERSION.INCREMENTAL);
                m4207.append("\nVERSION.SDK.NUMBER : ");
                m4207.append(Build.VERSION.SDK_INT);
                m4207.append("\nBOARD : ");
                m4207.append(Build.BOARD);
                m4207.append("\nBOOTLOADER : ");
                m4207.append(Build.BOOTLOADER);
                m4207.append("\nBRAND : ");
                m4207.append(Build.BRAND);
                m4207.append("\nCPU_ABI : ");
                m4207.append(Build.CPU_ABI);
                m4207.append("\nCPU_ABI2 : ");
                m4207.append(Build.CPU_ABI2);
                m4207.append("\nDISPLAY : ");
                m4207.append(Build.DISPLAY);
                m4207.append("\nFINGERPRINT : ");
                m4207.append(Build.FINGERPRINT);
                m4207.append("\nHARDWARE : ");
                m4207.append(Build.HARDWARE);
                m4207.append("\nHOST : ");
                m4207.append(Build.HOST);
                m4207.append("\nID : ");
                m4207.append(Build.ID);
                m4207.append("\nMANUFACTURER : ");
                m4207.append(Build.MANUFACTURER);
                m4207.append("\nMODEL : ");
                m4207.append(Build.MODEL);
                m4207.append("\nPRODUCT : ");
                m4207.append(Build.PRODUCT);
                m4207.append("\nSERIAL : ");
                m4207.append(Build.SERIAL);
                m4207.append("\nTAGS : ");
                m4207.append(Build.TAGS);
                m4207.append("\nTIME : ");
                m4207.append(Build.TIME);
                m4207.append("\nTYPE : ");
                m4207.append(Build.TYPE);
                m4207.append("\nUNKNOWN : ");
                m4207.append("unknown");
                m4207.append("\nUSER : ");
                m4207.append(Build.USER);
                textView.setText(m4207.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Could not get package name: " + e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Could not get package name: " + e2);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C2087.crash_detail_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("LogMessage") : null;
        if (menuItem.getItemId() == C2088.delete_log) {
            if (TextUtils.isEmpty(stringExtra) ? false : C2097.m4174(new File(stringExtra))) {
                finish();
            }
            return true;
        }
        if (menuItem.getItemId() != C2088.share_crash_log) {
            return super.onOptionsItemSelected(menuItem);
        }
        Uri mo391 = FileProvider.m390(this, getPackageName() + ".CrashReporterInitProvider").mo391(new File(stringExtra));
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("*/*");
        intent2.putExtra("android.intent.extra.TEXT", this.f2008.getText().toString());
        intent2.putExtra("android.intent.extra.STREAM", mo391);
        startActivity(Intent.createChooser(intent2, "Share via"));
        return true;
    }
}
