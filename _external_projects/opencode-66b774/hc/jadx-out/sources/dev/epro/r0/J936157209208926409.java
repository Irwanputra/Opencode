package dev.epro.r0;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J936157209208926409 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public J936157209208926409(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(2131230852);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompatA;
        if (iconCompatA != null) {
            int iIntValue = iconCompatA.a;
            if (iIntValue == -1) {
                Object obj = iconCompatA.b;
                if (Build.VERSION.SDK_INT >= 28) {
                    iIntValue = C15025379344307230271.r(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException unused) {
                        Objects.toString(obj);
                        iIntValue = -1;
                    } catch (NoSuchMethodException unused2) {
                        Objects.toString(obj);
                        iIntValue = -1;
                    } catch (InvocationTargetException unused3) {
                        Objects.toString(obj);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.e = iconCompatA.b();
            }
        }
        this.f = J16704254777695610861.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
