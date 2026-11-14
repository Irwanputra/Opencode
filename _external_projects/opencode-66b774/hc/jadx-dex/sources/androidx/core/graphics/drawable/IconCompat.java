package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode k = android.graphics.PorterDuff.Mode.SRC_IN;
    public int a;
    public java.lang.Object b;
    public byte[] c;
    public android.os.Parcelable d;
    public int e;
    public int f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public java.lang.String i;
    public java.lang.String j;

    public static androidx.core.graphics.drawable.IconCompat a(int i) {
        if (i == 0) {
            dev.epro.r0.S10973172697741180971.j("Drawable resource ID must not be 0");
            return null;
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
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
            dev.epro.r0.Q11088980322693754445.m("called getResId() on ", this);
            return 0;
        }
        java.lang.Object obj = this.b;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return dev.epro.r0.C15025379344307230271.j(obj);
        }
        try {
            return ((java.lang.Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return 0;
        }
    }

    public final android.net.Uri c() {
        int i = this.a;
        if (i == -1) {
            java.lang.Object obj = this.b;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return dev.epro.r0.C15025379344307230271.s(obj);
            }
            try {
                return (android.net.Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return android.net.Uri.parse((java.lang.String) this.b);
        }
        dev.epro.r0.Q11088980322693754445.m("called getUri() on ", this);
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (this.a == -1) {
            return java.lang.String.valueOf(this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
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
                sb.append(((android.graphics.Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(b())));
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
