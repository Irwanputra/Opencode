package com.balsikandar.crashreporter.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import p131.p150.p151.C2077;
import p131.p150.p151.C2079;
import p131.p150.p151.C2086;
import p131.p150.p151.C2087;
import p131.p150.p151.C2088;
import p131.p150.p151.p152.C2082;
import p131.p150.p151.p152.RunnableC2080;
import p131.p150.p151.p153.C2091;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CrashReporterActivity extends AppCompatActivity {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public C2091 f2006;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f2007 = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C2077.CrashReporter_Theme_NoActionBar);
        super.onCreate(bundle);
        setContentView(C2086.crash_reporter_activity);
        Toolbar toolbar = (Toolbar) findViewById(C2088.toolbar);
        toolbar.setTitle(getString(C2079.crash_reporter));
        m79().mo2980(toolbar);
        ViewPager viewPager = (ViewPager) findViewById(C2088.viewpager);
        if (viewPager != null) {
            C2091 c2091 = new C2091(m535(), new String[]{getString(C2079.crashes), getString(C2079.exceptions)});
            this.f2006 = c2091;
            viewPager.setAdapter(c2091);
            viewPager.m1064(new C2082(this));
            Intent intent = getIntent();
            if (intent != null && !intent.getBooleanExtra("landing", false)) {
                this.f2007 = 1;
            }
            viewPager.setCurrentItem(this.f2007);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C2087.log_main_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C2088.delete_crash_logs) {
            return super.onOptionsItemSelected(menuItem);
        }
        new Thread(new RunnableC2080(this)).start();
        return true;
    }
}
