package dev.epro.r0;

import ads_mobile_sdk.bs1;
import ads_mobile_sdk.cs1;
import ads_mobile_sdk.fq1;
import ads_mobile_sdk.tx0;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class L1916971333294664386 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ L1916971333294664386(cs1 cs1Var, String str, String str2, String str3, Activity activity, tx0 tx0Var) {
        this.e = cs1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = activity;
        this.g = tx0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                Long l = (Long) obj3;
                Long l2 = (Long) obj2;
                fq1 fq1Var = (fq1) obj;
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.getClass();
                data.putExtra("title", this.b);
                data.putExtra("eventLocation", this.c);
                data.putExtra("description", this.d);
                if (l != null) {
                    data.putExtra("beginTime", l.longValue());
                }
                if (l2 != null) {
                    data.putExtra("endTime", l2.longValue());
                }
                data.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                fq1Var.c.a(data);
                break;
            default:
                cs1 cs1Var = (cs1) obj3;
                W5797197595347441198 w5797197595347441198 = cs1Var.d;
                String str = this.b;
                R7033599853981556291.E(w5797197595347441198, null, null, new bs1(cs1Var, str, (tx0) obj, this.c, this.d, (Activity) obj2, null), 3);
                break;
        }
    }

    public /* synthetic */ L1916971333294664386(String str, String str2, String str3, Long l, Long l2, fq1 fq1Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = l2;
        this.g = fq1Var;
    }
}
