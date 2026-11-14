package dev.epro.r0;

import android.app.Notification;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y13562572432692301388 {
    public final int a;
    public final int b;
    public final Notification c;

    public Y13562572432692301388(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y13562572432692301388.class != obj.getClass()) {
            return false;
        }
        Y13562572432692301388 y13562572432692301388 = (Y13562572432692301388) obj;
        if (this.a == y13562572432692301388.a && this.b == y13562572432692301388.b) {
            return this.c.equals(y13562572432692301388.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
