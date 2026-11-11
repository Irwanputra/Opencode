package p244.p245.p246.p247;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2834<T> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public T f10524;

    public AbstractC2834(T t) {
        this.f10524 = t;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static AbstractC2834<? extends Activity> m4943(Activity activity) {
        return Build.VERSION.SDK_INT < 23 ? new C2836(activity) : activity instanceof AppCompatActivity ? new C2831((AppCompatActivity) activity) : new C2833(activity);
    }

    /* renamed from: 〺つふすそ */
    public abstract Context mo4938();

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo4939(int i, String... strArr);

    /* renamed from: づざかべべ */
    public abstract void mo4942(String str, String str2, String str3, int i, int i2, String... strArr);

    /* renamed from: びぐびあび */
    public abstract boolean mo4941(String str);
}
