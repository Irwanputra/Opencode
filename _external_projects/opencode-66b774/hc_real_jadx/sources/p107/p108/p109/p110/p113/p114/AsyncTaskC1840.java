package p107.p108.p109.p110.p113.p114;

import android.os.AsyncTask;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.おぐぴう〸ず.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class AsyncTaskC1840 extends AsyncTask<Void, Integer, String> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC1838 f8209;

    public AsyncTaskC1840(InterfaceC1838 interfaceC1838) {
        this.f8209 = interfaceC1838;
    }

    @Override // android.os.AsyncTask
    public String doInBackground(Void[] voidArr) {
        this.f8209.mo1630();
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        this.f8209.mo1631();
    }
}
