package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /tmp/opencode/hc_real.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final PorterDuff.Mode f1055 = PorterDuff.Mode.SRC_IN;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public PorterDuff.Mode f1056;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object f1057;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ColorStateList f1058;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public byte[] f1059;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f1060;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f1061;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f1062;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Parcelable f1063;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f1064;

    public IconCompat() {
        this.f1060 = -1;
        this.f1059 = null;
        this.f1063 = null;
        this.f1061 = 0;
        this.f1062 = 0;
        this.f1058 = null;
        this.f1056 = f1055;
        this.f1064 = null;
    }

    public IconCompat(int i) {
        this.f1060 = -1;
        this.f1059 = null;
        this.f1063 = null;
        this.f1061 = 0;
        this.f1062 = 0;
        this.f1058 = null;
        this.f1056 = f1055;
        this.f1064 = null;
        this.f1060 = i;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Bitmap m393(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static String m394(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static IconCompat m395(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1061 = i;
        iconCompat.f1057 = str;
        return iconCompat;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static IconCompat m396(Icon icon) {
        icon.getClass();
        int m398 = m398(icon);
        if (m398 == 2) {
            return m395(null, m394(icon), m397(icon));
        }
        if (m398 == 4) {
            Uri m399 = m399(icon);
            if (m399 == null) {
                throw new IllegalArgumentException("Uri must not be null.");
            }
            String uri = m399.toString();
            if (uri == null) {
                throw new IllegalArgumentException("Uri must not be null.");
            }
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f1057 = uri;
            return iconCompat;
        }
        if (m398 != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f1057 = icon;
            return iconCompat2;
        }
        Uri m3992 = m399(icon);
        if (m3992 == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        String uri2 = m3992.toString();
        if (uri2 == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f1057 = uri2;
        return iconCompat3;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static int m397(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static int m398(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (NoSuchMethodException unused2) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (InvocationTargetException unused3) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static Uri m399(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public String toString() {
        String str;
        int height;
        if (this.f1060 == -1) {
            return String.valueOf(this.f1057);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1060) {
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
        switch (this.f1060) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1057).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1057).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(m403());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m404())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1061);
                if (this.f1062 != 0) {
                    sb.append(" off=");
                    height = this.f1062;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1057);
                break;
        }
        if (this.f1058 != null) {
            sb.append(" tint=");
            sb.append(this.f1058);
        }
        if (this.f1056 != f1055) {
            sb.append(" mode=");
            sb.append(this.f1056);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int m400() {
        int i = this.f1060;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : m398((Icon) this.f1057);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Uri m401() {
        int i = this.f1060;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m399((Icon) this.f1057);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1057);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @java.lang.Deprecated
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Icon m402() {
        /*
            r3 = this;
            int r0 = r3.f1060
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L77;
                case 0: goto L8;
                case 1: goto L5e;
                case 2: goto L53;
                case 3: goto L46;
                case 4: goto L3d;
                case 5: goto L27;
                case 6: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown type"
            r0.<init>(r1)
            throw r0
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r1 = p131.p155.p156.p157.C2098.m4207(r1)
            android.net.Uri r2 = r3.m401()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L27:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L34
            java.lang.Object r0 = r3.f1057
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            goto L66
        L34:
            java.lang.Object r0 = r3.f1057
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = m393(r0, r1)
            goto L62
        L3d:
            java.lang.Object r0 = r3.f1057
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L66
        L46:
            java.lang.Object r0 = r3.f1057
            byte[] r0 = (byte[]) r0
            int r1 = r3.f1061
            int r2 = r3.f1062
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
            goto L66
        L53:
            java.lang.String r0 = r3.m403()
            int r1 = r3.f1061
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
            goto L66
        L5e:
            java.lang.Object r0 = r3.f1057
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L62:
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L66:
            android.content.res.ColorStateList r1 = r3.f1058
            if (r1 == 0) goto L6d
            r0.setTintList(r1)
        L6d:
            android.graphics.PorterDuff$Mode r1 = r3.f1056
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f1055
            if (r1 == r2) goto L7b
            r0.setTintMode(r1)
            goto L7b
        L77:
            java.lang.Object r0 = r3.f1057
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.m402():android.graphics.drawable.Icon");
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m403() {
        int i = this.f1060;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m394((Icon) this.f1057);
        }
        if (i == 2) {
            return ((String) this.f1057).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m404() {
        int i = this.f1060;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m397((Icon) this.f1057);
        }
        if (i == 2) {
            return this.f1061;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }
}
