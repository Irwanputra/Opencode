package dev.epro.r0;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class R14776647425038466172 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ C4341747165502163559 b;

    public /* synthetic */ R14776647425038466172(C4341747165502163559 c4341747165502163559, byte b) {
        this.a = b;
        this.b = c4341747165502163559;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        C4341747165502163559 c4341747165502163559 = this.b;
        switch (b) {
            case 0:
                ((Executor) c4341747165502163559.d).execute(new R14776647425038466172(c4341747165502163559, (byte) 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                Application application = (Application) c4341747165502163559.a;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String str = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", str);
                    JSONObject jSONObject2 = new JSONObject();
                    G5446205426701161097 g5446205426701161097 = (G5446205426701161097) c4341747165502163559.h;
                    for (String str2 : g5446205426701161097.a().keySet()) {
                        jSONObject2.put(str2, g5446205426701161097.a().get(str2));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((X17123927029532314696) c4341747165502163559.g).h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
