package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class Y7729682184936279366 {
    public final int a;
    public final String b;
    public final String c;

    static {
        izmyclvb.qgayjvbiagej2(177);
    }

    public Y7729682184936279366(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public native void a(SQLiteConnection sQLiteConnection);

    public native void b(SQLiteConnection sQLiteConnection);

    public void c(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
    }

    public void d(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void e(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
    }

    public native void f(SQLiteConnection sQLiteConnection);

    public native X7831914847311259349 g(SQLiteConnection sQLiteConnection);
}
