package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import dev.epro.r0.C15025379344307230271;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.S10973172697741180971;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    public static IconCompat a(int i) {
        if (i == 0) {
            S10973172697741180971.j("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = k;
        iconCompat.i = null;
        iconCompat.a = 2;
        iconCompat.e = i;
        iconCompat.b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int b() {
        int i = this.a;
        if (i != -1) {
            if (i == 2) {
                return this.e;
            }
            Q11088980322693754445.m("called getResId() on ", this);
            return 0;
        }
        Object obj = this.b;
        if (Build.VERSION.SDK_INT >= 28) {
            return C15025379344307230271.j(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final Uri c() {
        int i = this.a;
        if (i == -1) {
            Object obj = this.b;
            if (Build.VERSION.SDK_INT >= 28) {
                return C15025379344307230271.s(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.b);
        }
        Q11088980322693754445.m("called getUri() on ", this);
        return null;
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
