package dev.epro.r0;

import android.app.Application;
import dev.epro.httpcustom.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P498210555524299422 implements A18195026813295081326 {
    public volatile O7815787575694254021 a;
    public final Object b = new Object();
    public final MainActivity c;
    public final D7088593984817477773 d;
    public Q6203700555324584864 e;

    public P498210555524299422(MainActivity mainActivity) {
        this.c = mainActivity;
        this.d = new D7088593984817477773(mainActivity);
    }

    public final O7815787575694254021 a() {
        String str;
        MainActivity mainActivity = this.c;
        if (mainActivity.getApplication() instanceof A18195026813295081326) {
            T9166720469304402137 t9166720469304402137 = (T9166720469304402137) ((Y10498757451082566716) S10823041268949770285.J(this.d, Y10498757451082566716.class));
            return new O7815787575694254021(t9166720469304402137.a, t9166720469304402137.b);
        }
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    @Override // dev.epro.r0.A18195026813295081326
    public final Object d() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
