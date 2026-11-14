package ads_mobile_sdk;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class a62 extends AsyncTask {
    public r6 a;
    public final ii b;

    public a62(ii iiVar) {
        this.b = iiVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        r6 r6Var = this.a;
        if (r6Var != null) {
            r6Var.c = null;
            a62 a62Var = (a62) ((ArrayDeque) r6Var.b).poll();
            r6Var.c = a62Var;
            if (a62Var != null) {
                a62Var.executeOnExecutor((ThreadPoolExecutor) r6Var.a, new Object[0]);
            }
        }
    }
}
