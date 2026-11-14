package dev.epro.r0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J16704254777695610861 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public byte h;
    public boolean j;
    public V10300877997588547986 k;
    public Bundle m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f308o;
    public final Notification p;
    public final ArrayList q;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = true;
    public boolean l = false;

    public J16704254777695610861(Context context, String str) {
        Notification notification = new Notification();
        this.p = notification;
        this.a = context;
        this.n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = (byte) 0;
        this.q = new ArrayList();
        this.f308o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        I1632105416032993715 i1632105416032993715 = new I1632105416032993715(this);
        Notification.Builder builder = (Notification.Builder) i1632105416032993715.b;
        J16704254777695610861 j16704254777695610861 = (J16704254777695610861) i1632105416032993715.c;
        V10300877997588547986 v10300877997588547986 = j16704254777695610861.k;
        if (v10300877997588547986 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) v10300877997588547986.c);
        }
        Notification build = Build.VERSION.SDK_INT >= 26 ? builder.build() : builder.build();
        if (v10300877997588547986 != null) {
            j16704254777695610861.k.getClass();
        }
        if (v10300877997588547986 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return build;
    }

    public final void c(int i, boolean z) {
        Notification notification = this.p;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(V10300877997588547986 v10300877997588547986) {
        if (this.k != v10300877997588547986) {
            this.k = v10300877997588547986;
            if (((J16704254777695610861) v10300877997588547986.b) != this) {
                v10300877997588547986.b = this;
                d(v10300877997588547986);
            }
        }
    }
}
