package ads_mobile_sdk;

import android.webkit.WebView;
import dev.epro.r0.Q16850748603044648552;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Q16850748603044648552 {
    public static final p f = new p(new zj());
    public Date b;
    public boolean c;
    public final zj d;
    public boolean e;

    public p(zj zjVar) {
        this.d = zjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.Q16850748603044648552
    public final void a(boolean z) {
        if (!this.e && z) {
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(n6.c.b).iterator();
                    while (it.hasNext()) {
                        o6 o6Var = ((m6) it.next()).d;
                        Date date3 = this.b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        o6Var.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            c72.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            d62.a.a((WebView) o6Var.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.e = z;
    }
}
