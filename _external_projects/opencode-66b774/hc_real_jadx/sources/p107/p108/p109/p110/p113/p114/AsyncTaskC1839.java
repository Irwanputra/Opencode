package p107.p108.p109.p110.p113.p114;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.おぐぴう〸ず.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class AsyncTaskC1839 extends AsyncTask<Void, Integer, String> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC1838 f8207;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public ProgressDialog f8208;

    public AsyncTaskC1839(InterfaceC1838 interfaceC1838, Context context) {
        this.f8207 = interfaceC1838;
        this.f8208 = new ProgressDialog(context, 2131886321);
    }

    @Override // android.os.AsyncTask
    public String doInBackground(Void[] voidArr) {
        this.f8207.mo1630();
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        this.f8207.mo1631();
        ProgressDialog progressDialog = this.f8208;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f8208.dismiss();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        this.f8208.setMessage(Crypt.a(Crypt.xrc("\u001c1=M`kIj>@a;\u001aeh\u001a4<OdmJaiOe;I1i@j")));
        this.f8208.show();
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Integer[] numArr) {
    }
}
