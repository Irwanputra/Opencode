package p131.p221.p222;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;

/* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2681 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ContentObserver f10146 = new C2682(null);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Vibrator f10147;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f10148;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f10149;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public long f10150;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f10151;

    /* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2682 extends ContentObserver {
        public C2682(Handler handler) {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C2681 c2681 = C2681.this;
            c2681.f10151 = Settings.System.getInt(c2681.f10148.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
        }
    }

    public C2681(Context context) {
        this.f10148 = context;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4651() {
        if (this.f10147 != null && this.f10151 && this.f10149) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f10150 >= 125) {
                this.f10147.vibrate(5L);
                this.f10150 = uptimeMillis;
            }
        }
    }
}
