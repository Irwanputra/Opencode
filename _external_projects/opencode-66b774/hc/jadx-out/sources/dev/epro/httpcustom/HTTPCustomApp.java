package dev.epro.httpcustom;

import android.app.Application;
import android.content.Context;
import dev.epro.httpcustom.core.util.CatalogRefreshReceiver;
import dev.epro.r0.A18195026813295081326;
import dev.epro.r0.A2789795882633926065;
import dev.epro.r0.I6453388557760166973;
import dev.epro.r0.L12602321637077960189;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.T6366323384730309747;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public class HTTPCustomApp extends Application implements A18195026813295081326 {
    public static final /* synthetic */ int k = 0;
    public boolean a;
    public final I6453388557760166973 b;
    public final O12494175665883759871 c;
    public final AtomicBoolean d;
    public final CatalogRefreshReceiver e;
    public final O12494175665883759871 f;
    public final A2789795882633926065 g;
    public L12602321637077960189 h;
    public T6366323384730309747 i;
    public T6366323384730309747 j;

    static {
        izmyclvb.oeynnivvrnts0(23);
    }

    private native void hapcdlnwojeh();

    public final native void a();

    @Override // android.content.ContextWrapper
    public native void attachBaseContext(Context context);

    public final native void b();

    @Override // dev.epro.r0.A18195026813295081326
    public final native Object d();

    @Override // android.app.Application
    public final native void onCreate();

    public HTTPCustomApp() {
        hapcdlnwojeh();
    }
}
