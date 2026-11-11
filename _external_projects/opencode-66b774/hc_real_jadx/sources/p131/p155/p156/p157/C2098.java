package p131.p155.p156.p157;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.widget.CheckBox;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzfjk;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import p010.p011.p012.p013.C0749;
import p010.p011.p012.p013.C0770;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import team.dev.epro.apkcustom.App;

/* compiled from: outline */
/* renamed from: なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2098 {
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static String m4175(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m4176(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static int m4177(Long l, int i, int i2) {
        return zzfjk.zzc(i, l.longValue()) + i2;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static String m4178(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static StringBuilder m4179(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static RemoteException m4180(String str, Throwable th) {
        zzakb.zzc(str, th);
        return new RemoteException();
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static void m4181(C0749 c0749, boolean z, TreeSet treeSet) {
        treeSet.add(new C0770.C0771(c0749, z));
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static void m4182(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static void m4183(C1216 c1216, StringBuilder sb, String str) {
        sb.append(c1216.m2776());
        sb.append(str);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static void m4184(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).commit();
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static String m4185(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static void m4186(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).commit();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m4187(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static float m4188(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static void m4189(C1216 c1216, StringBuilder sb, String str) {
        sb.append(c1216.m2780());
        sb.append(str);
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static void m4190(C1216 c1216, StringBuilder sb, String str) {
        sb.append(c1216.m2727());
        sb.append(str);
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static void m4191(CheckBox checkBox, SharedPreferences.Editor editor, String str) {
        editor.putBoolean(str, checkBox.isChecked()).apply();
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static String m4192(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m744());
        return sb.toString();
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static String m4193(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String m4194(StringBuilder sb, String str, char c, char c2) {
        sb.append(str);
        sb.append(c);
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static void m4195(SharedPreferences sharedPreferences, String str, int i) {
        sharedPreferences.edit().putInt(str, i).apply();
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static void m4196(C1216 c1216, StringBuilder sb, String str) {
        sb.append(c1216.m2791());
        sb.append(str);
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static void m4197(SimpleDateFormat simpleDateFormat, StringBuilder sb, String str, String str2) {
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(str);
        C1687.m3666(str2, sb.toString());
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static String m4198(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static void m4199(SimpleDateFormat simpleDateFormat, StringBuilder sb, String str) {
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(str);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static int m4200(Integer num, int i, int i2) {
        return zzfjk.zzad(i, num.intValue()) + i2;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static void m4201(CheckBox checkBox, SharedPreferences.Editor editor, String str) {
        editor.putBoolean(str, checkBox.isChecked()).commit();
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static void m4202(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static String m4203(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static void m4204(C1216 c1216, StringBuilder sb, String str) {
        sb.append(c1216.m2735());
        sb.append(str);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static String m4205(String str, String str2) {
        return str + str2;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static void m4206(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).apply();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static StringBuilder m4207(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static String m4208(String str, int i) {
        return str + i;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static void m4209(Intent intent, String str, Intent intent2) {
        intent.setAction(str);
        App.f3759.startService(intent2);
    }
}
