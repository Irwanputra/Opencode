package dev.epro.r0;

import android.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;
import net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T17032536773975598836 {
    public int a;
    public Object b;

    public T17032536773975598836(Context context) {
        int i = B9683044498301182575.i(context, 0);
        this.b = new V4825737980590471194(new ContextThemeWrapper(context, B9683044498301182575.i(context, i)));
        this.a = i;
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = S10823041268949770285.z(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public void a(long j) {
        if (c(j)) {
            return;
        }
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.b = jArr;
        }
        jArr[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public int b() {
        int i = 2048 - this.a;
        if (i > 0) {
            return i;
        }
        W8455343525638953052 w8455343525638953052 = (W8455343525638953052) this.b;
        W8455343525638953052 w84553435256389530522 = (W8455343525638953052) w8455343525638953052.c;
        if (w84553435256389530522 == null) {
            w84553435256389530522 = new W8455343525638953052((byte) 26);
            w8455343525638953052.c = w84553435256389530522;
        }
        this.b = w84553435256389530522;
        this.a = 0;
        return 2048;
    }

    public boolean c(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public B9683044498301182575 d() {
        V4825737980590471194 v4825737980590471194 = (V4825737980590471194) this.b;
        ContextThemeWrapper contextThemeWrapper = v4825737980590471194.a;
        B9683044498301182575 b9683044498301182575 = new B9683044498301182575(contextThemeWrapper, this.a);
        View view = v4825737980590471194.e;
        O8953140192291099683 o8953140192291099683 = b9683044498301182575.g;
        if (view != null) {
            o8953140192291099683.n = view;
        } else {
            CharSequence charSequence = v4825737980590471194.d;
            if (charSequence != null) {
                o8953140192291099683.d = charSequence;
                TextView textView = o8953140192291099683.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                o8953140192291099683.c.setTitle(charSequence);
            }
            Drawable drawable = v4825737980590471194.c;
            if (drawable != null) {
                o8953140192291099683.j = drawable;
                ImageView imageView = o8953140192291099683.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    o8953140192291099683.k.setImageDrawable(drawable);
                }
            }
        }
        if (v4825737980590471194.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) v4825737980590471194.b.inflate(o8953140192291099683.r, (ViewGroup) null);
            int i = v4825737980590471194.i ? o8953140192291099683.s : o8953140192291099683.t;
            ListAdapter listAdapter = v4825737980590471194.g;
            if (listAdapter == null) {
                listAdapter = new E12108995282925276516(contextThemeWrapper, i, R.id.text1, null);
            }
            o8953140192291099683.f418o = listAdapter;
            o8953140192291099683.p = v4825737980590471194.j;
            if (v4825737980590471194.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C17043661415424084515(v4825737980590471194, o8953140192291099683));
            }
            if (v4825737980590471194.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            o8953140192291099683.e = alertController$RecycleListView;
        }
        b9683044498301182575.setCancelable(true);
        b9683044498301182575.setCanceledOnTouchOutside(true);
        b9683044498301182575.setOnCancelListener(null);
        b9683044498301182575.setOnDismissListener(null);
        B13570233856821118719 b13570233856821118719 = v4825737980590471194.f;
        if (b13570233856821118719 != null) {
            b9683044498301182575.setOnKeyListener(b13570233856821118719);
        }
        return b9683044498301182575;
    }

    public byte[] f() {
        int i = this.a;
        byte[] bArr = new byte[i];
        System.arraycopy((byte[]) this.b, 0, bArr, 0, i);
        return bArr;
    }

    public void g(int i, Y7327269104420830054 y7327269104420830054) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            Y7327269104420830054 y73272691044208300542 = ((Y7327269104420830054[]) this.b)[i2];
            y73272691044208300542.getClass();
            if (S10823041268949770285.A(0L, y7327269104420830054.g - y73272691044208300542.g) <= 0) {
                break;
            }
            y73272691044208300542.f = i;
            ((Y7327269104420830054[]) this.b)[i] = y73272691044208300542;
            i = i2;
        }
        ((Y7327269104420830054[]) this.b)[i] = y7327269104420830054;
        y7327269104420830054.f = i;
    }

    public void h(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        ((R3533078172067811153) this.b).c(new K9419718790619213063(supportSQLiteDatabase));
    }

    public void i(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        supportSQLiteDatabase.getClass();
        k(supportSQLiteDatabase, i, i2);
    }

    public void j(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        R3533078172067811153 r3533078172067811153 = (R3533078172067811153) this.b;
        r3533078172067811153.e(new K9419718790619213063(supportSQLiteDatabase));
        r3533078172067811153.h = supportSQLiteDatabase;
    }

    public void k(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        supportSQLiteDatabase.getClass();
        ((R3533078172067811153) this.b).d(new K9419718790619213063(supportSQLiteDatabase), i, i2);
    }

    public void l(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public void m(Y7327269104420830054 y7327269104420830054) {
        Y7327269104420830054 y73272691044208300542;
        int i = y7327269104420830054.f;
        if (i == -1) {
            S10973172697741180971.j("Failed requirement.");
            return;
        }
        int i2 = this.a;
        Y7327269104420830054 y73272691044208300543 = ((Y7327269104420830054[]) this.b)[i2];
        y73272691044208300543.getClass();
        y7327269104420830054.f = -1;
        ((Y7327269104420830054[]) this.b)[i2] = null;
        this.a = i2 - 1;
        if (y7327269104420830054 == y73272691044208300543) {
            return;
        }
        int A = S10823041268949770285.A(0L, y73272691044208300543.g - y7327269104420830054.g);
        if (A == 0) {
            ((Y7327269104420830054[]) this.b)[i] = y73272691044208300543;
            y73272691044208300543.f = i;
            return;
        }
        if (A >= 0) {
            g(i, y73272691044208300543);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                y73272691044208300542 = ((Y7327269104420830054[]) this.b)[i3];
                y73272691044208300542.getClass();
            } else {
                y73272691044208300542 = ((Y7327269104420830054[]) this.b)[i3];
                y73272691044208300542.getClass();
                Y7327269104420830054 y73272691044208300544 = ((Y7327269104420830054[]) this.b)[i4];
                y73272691044208300544.getClass();
                if (S10823041268949770285.A(0L, y73272691044208300544.g - y73272691044208300542.g) >= 0) {
                    y73272691044208300542 = y73272691044208300544;
                }
            }
            if (S10823041268949770285.A(0L, y73272691044208300542.g - y73272691044208300543.g) <= 0) {
                break;
            }
            int i6 = y73272691044208300542.f;
            y73272691044208300542.f = i;
            ((Y7327269104420830054[]) this.b)[i] = y73272691044208300542;
            i = i6;
        }
        ((Y7327269104420830054[]) this.b)[i] = y73272691044208300543;
        y73272691044208300543.f = i;
    }

    public void n(boolean z) {
        int i = this.a + 1;
        byte[] bArr = (byte[]) this.b;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.b = bArr2;
            bArr = bArr2;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        bArr[i2] = z ? (byte) 1 : (byte) 0;
    }

    public void o(int i) {
        int i2 = this.a;
        int i3 = i2 + 1;
        byte[] bArr = (byte[]) this.b;
        if (i3 > bArr.length) {
            byte[] bArr2 = new byte[i2 + 32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.b = bArr2;
            bArr = bArr2;
        }
        bArr[i2] = (byte) i;
        this.a++;
    }

    public void p(int i, byte[] bArr, int i2) {
        int i3 = this.a + i2;
        byte[] bArr2 = (byte[]) this.b;
        if (i3 > bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length + i2 + 32];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.b = bArr3;
            bArr2 = bArr3;
        }
        System.arraycopy(bArr, i, bArr2, this.a, i2);
        this.a += i2;
    }

    public void q(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 && byteArray[0] == 0) {
            u(0);
        } else {
            s(0, byteArray, byteArray.length);
        }
    }

    public void r(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(',');
            }
            stringBuffer.append(strArr[i]);
        }
        t(stringBuffer.toString());
    }

    public void s(int i, byte[] bArr, int i2) {
        u(i2);
        p(i, bArr, i2);
    }

    public void t(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        u(bytes.length);
        p(0, bytes, bytes.length);
    }

    public void u(int i) {
        int i2 = this.a;
        int i3 = i2 + 4;
        byte[] bArr = (byte[]) this.b;
        if (i3 > bArr.length) {
            byte[] bArr2 = new byte[i2 + 32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.b = bArr2;
            bArr = bArr2;
        }
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
        this.a += 4;
    }

    public T17032536773975598836() {
        this.b = new byte[256];
        this.a = 0;
    }

    public T17032536773975598836(R11747310517775341069 r11747310517775341069, W8455343525638953052 w8455343525638953052) {
        this.b = w8455343525638953052;
        this.a = 0;
    }

    public T17032536773975598836(R3533078172067811153 r3533078172067811153, int i) {
        this.b = r3533078172067811153;
        this.a = i;
    }

    public T17032536773975598836(B6867906687934285025 b6867906687934285025, int i) {
        M18113111391818111737.v(b6867906687934285025);
        this.b = b6867906687934285025;
        this.a = i;
    }
}
