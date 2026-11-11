package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.List;
import p237.p238.p239.p241.p242.C2785;
import p237.p238.p239.p241.p242.C2792;
import p237.p238.p239.p241.p242.C2793;
import p237.p238.p239.p241.p242.InterfaceC2794;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0193 extends MediaBrowserCompat.C0002 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Context f1320;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final BroadcastReceiver.PendingResult f1321;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public MediaBrowserCompat f1322;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Intent f1323;

        public C0193(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f1320 = context;
            this.f1323 = intent;
            this.f1321 = pendingResult;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final void m590() {
            this.f1322.f1.mo11();
            this.f1321.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0002
        /* renamed from: げつ〴ぬぐ */
        public void mo5() {
            Context context;
            MediaSessionCompat.Token mo8;
            try {
                context = this.f1320;
                mo8 = this.f1322.f1.mo8();
                new HashSet();
            } catch (RemoteException unused) {
            }
            if (mo8 == null) {
                throw new IllegalArgumentException("sessionToken must not be null");
            }
            int i = Build.VERSION.SDK_INT;
            InterfaceC2794 c2793 = i >= 24 ? new C2793(context, mo8) : i >= 23 ? new C2792(context, mo8) : i >= 21 ? new MediaControllerCompat$MediaControllerImplApi21(context, mo8) : new C2785(mo8);
            KeyEvent keyEvent = (KeyEvent) this.f1323.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            c2793.mo24(keyEvent);
            m590();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static ComponentName m589(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            String str = "Ignore unsupported intent: " + intent;
            return;
        }
        ComponentName m589 = m589(context, "android.intent.action.MEDIA_BUTTON");
        if (m589 != null) {
            intent.setComponent(m589);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
                return;
            } else {
                context.startService(intent);
                return;
            }
        }
        ComponentName m5892 = m589(context, "android.media.browse.MediaBrowserService");
        if (m5892 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0193 c0193 = new C0193(applicationContext, intent, goAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, m5892, c0193, null);
        c0193.f1322 = mediaBrowserCompat;
        mediaBrowserCompat.f1.mo12();
    }
}
