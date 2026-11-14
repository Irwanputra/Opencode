package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Queue;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X7555133151306842378 extends L6855102173777462404 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ J6457333644812339360 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X7555133151306842378(J6457333644812339360 j6457333644812339360, f01 f01Var, Activity activity, String str, String str2, Map map) {
        super(f01Var);
        this.b = activity;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = j6457333644812339360;
    }

    @Override // dev.epro.r0.L6855102173777462404, dev.epro.r0.B18329032920392634747
    public final void onDismissed(Bundle bundle) {
        this.b.runOnUiThread(new E568711261265390047(this, (byte) 1));
        super.onDismissed(bundle);
    }

    @Override // dev.epro.r0.L6855102173777462404, dev.epro.r0.B18329032920392634747
    public final void onError(Bundle bundle) {
        final Map map = this.e;
        final byte b = 0;
        final Activity activity = this.b;
        final String str = this.c;
        final String str2 = this.d;
        activity.runOnUiThread(new Runnable() { // from class: dev.epro.r0.P17980599222370475303
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                byte b2 = b;
                final byte b3 = 0;
                Object obj = map;
                Object obj2 = str2;
                Object obj3 = str;
                Activity activity2 = activity;
                Object obj4 = this;
                switch (b2) {
                    case 0:
                        ((X7555133151306842378) obj4).f.c();
                        activity2.startActivityForResult(C468629748621011703.y((String) obj3, (String) obj2, (Map) obj), 0);
                        return;
                    default:
                        O11692414993408430441 o11692414993408430441 = (O11692414993408430441) obj4;
                        Handler handler = (Handler) o11692414993408430441.b;
                        A7202329723792933819 a7202329723792933819 = (A7202329723792933819) o11692414993408430441.i;
                        E17149812035295265804 e17149812035295265804 = (E17149812035295265804) obj3;
                        O16666702949169506062 o16666702949169506062 = (O16666702949169506062) obj2;
                        final F14447823481384242167 f14447823481384242167 = (F14447823481384242167) obj;
                        final byte b4 = 1;
                        try {
                            D15913187640519482289.O((Application) o11692414993408430441.a);
                            Y16414919402539525744 b0 = ((J15730374346044043770) o11692414993408430441.g).b0(o11692414993408430441.c(((F6353700998356592239) o11692414993408430441.f).j(activity2, e17149812035295265804)));
                            G5446205426701161097 g5446205426701161097 = (G5446205426701161097) o11692414993408430441.d;
                            g5446205426701161097.b.edit().putInt("consent_status", b0.a).commit();
                            int i = b0.b;
                            SharedPreferences.Editor edit = g5446205426701161097.b.edit();
                            if (i == 1) {
                                str3 = "UNKNOWN";
                            } else if (i == 2) {
                                str3 = "NOT_REQUIRED";
                            } else {
                                if (i != 3) {
                                    throw null;
                                }
                                str3 = "REQUIRED";
                            }
                            edit.putString("privacy_options_requirement_status", str3).commit();
                            G15068739404623149094 g15068739404623149094 = (G15068739404623149094) o11692414993408430441.e;
                            g15068739404623149094.c.set((O3923701449542713850) b0.c);
                            a7202329723792933819.a((Queue) a7202329723792933819.f.get(), 8, 9, null);
                            ((Y15841630011871852334) o11692414993408430441.h).a.execute(new F16393152783805540385(o11692414993408430441, o16666702949169506062, b0, (byte) 5));
                            return;
                        } catch (I10210771329789820200 e) {
                            a7202329723792933819.a((Queue) a7202329723792933819.f.get(), 8, 9, G6547577305291411977.t("RequestConsentUpdate exception. Error: ", e.getMessage(), ", cause: ", String.valueOf(e.getCause())));
                            handler.post(new Runnable() { // from class: dev.epro.r0.J12259062304417362894
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b3;
                                    I10210771329789820200 i10210771329789820200 = e;
                                    F14447823481384242167 f144478234813842421672 = f14447823481384242167;
                                    switch (b5) {
                                        case 0:
                                            i10210771329789820200.a();
                                            f144478234813842421672.a();
                                            break;
                                        default:
                                            i10210771329789820200.a();
                                            f144478234813842421672.a();
                                            break;
                                    }
                                }
                            });
                            return;
                        } catch (RuntimeException e2) {
                            a7202329723792933819.a((Queue) a7202329723792933819.f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e2.getMessage())));
                            final I10210771329789820200 i10210771329789820200 = new I10210771329789820200(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
                            handler.post(new Runnable() { // from class: dev.epro.r0.J12259062304417362894
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    I10210771329789820200 i102107713297898202002 = i10210771329789820200;
                                    F14447823481384242167 f144478234813842421672 = f14447823481384242167;
                                    switch (b5) {
                                        case 0:
                                            i102107713297898202002.a();
                                            f144478234813842421672.a();
                                            break;
                                        default:
                                            i102107713297898202002.a();
                                            f144478234813842421672.a();
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                }
            }
        });
        super.onError(bundle);
    }

    @Override // dev.epro.r0.L6855102173777462404, dev.epro.r0.B18329032920392634747
    public final void onShown(Bundle bundle) {
        this.b.runOnUiThread(new E568711261265390047(this, (byte) 0));
        super.onShown(bundle);
    }
}
