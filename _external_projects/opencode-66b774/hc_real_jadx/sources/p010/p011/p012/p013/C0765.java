package p010.p011.p012.p013;

import android.content.Context;
import android.content.SharedPreferences;
import de.blinkt.openvpn.core.LogItem;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import p010.p011.p012.C0775;
import p034.p095.C1687;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0765 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C0765 f4908;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C0775 f4909;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0775 f4910;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public HashMap<String, C0775> f4911 = new HashMap<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m2058(Context context) {
        if (f4908 == null) {
            C0765 c0765 = new C0765();
            f4908 = c0765;
            c0765.m2066(context);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C0775 m2059(Context context, String str) {
        return m2063(context, str, 0, 10);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C0775 m2060(String str) {
        C0775 c0775 = f4910;
        if (c0775 != null && c0775.m2102().equals(str)) {
            return f4910;
        }
        C0765 c0765 = f4908;
        if (c0765 == null) {
            return null;
        }
        return c0765.f4911.get(str);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static void m2061(Context context) {
        SharedPreferences.Editor edit = C1687.m3670(context).edit();
        edit.putString(Crypt.a(Crypt.xrc("Ljj\u001cdf\u0019ekAegMboNbi\u0019g>Akj\u001c`g\u0019a<KdfO7m\u001efiHboOfj\u001d39Hbj\u001dgi\u001e7gO0:K79A")), null);
        edit.apply();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static synchronized C0765 m2062(Context context) {
        C0765 c0765;
        synchronized (C0765.class) {
            m2058(context);
            c0765 = f4908;
        }
        return c0765;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0775 m2063(Context context, String str, int i, int i2) {
        m2058(context);
        C0775 m2060 = m2060(str);
        int i3 = 0;
        while (true) {
            if (m2060 != null && m2060.f4976 >= i) {
                break;
            }
            int i4 = i3 + 1;
            if (i3 >= i2) {
                i3 = i4;
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            f4908.m2066(context);
            m2060 = m2060(str);
            i3 = i4;
        }
        if (i3 > 5) {
            C0753.m2031(String.format(Locale.US, Crypt.a(Crypt.xrc("Ak<HahLffLjo\u0019gjAk=Kdl\u00190=JdgNc9K1jL0gN0;H`:J7o\u001djiLjnI3:Og>M6l\u001dgf\u001a3m\u001d7<\u001dkl@dn\u001d7i\u001eb<Ic9\u0019b>\u001a3:@`n\u001a69Aei\u0019d:KejJkjNe=Hbi\u001ejiK1oK7gL6f@3")), Integer.valueOf(i3), Integer.valueOf(m2060 == null ? -1 : m2060.f4976), Integer.valueOf(i)));
        }
        return m2060;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static void m2064(Context context, C0775 c0775) {
        SharedPreferences.Editor edit = C1687.m3670(context).edit();
        edit.putString(Crypt.a(Crypt.xrc("Ljj\u001cdf\u0019ekAegMboNbi\u0019g>Akj\u001c`g\u0019a<KdfO7m\u001efiHboOfj\u001d39Hbj\u001dgi\u001e7gO0:K79A")), c0775.m2102());
        edit.apply();
        f4909 = c0775;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m2065(Context context, C0775 c0775) {
        String uuid = c0775.f4984.toString();
        this.f4911.remove(uuid);
        m2067(context);
        context.deleteFile(uuid + Crypt.a(Crypt.xrc("\u001e6lMf9@jh\u001ed=Kaf\u001afo@6hNg:A0iLkl\u0019a")));
        if (f4909 == c0775) {
            f4909 = null;
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m2066(Context context) {
        ObjectInputStream objectInputStream;
        this.f4911 = new HashMap<>();
        ObjectInputStream objectInputStream2 = null;
        Set<String> stringSet = context.getSharedPreferences(Crypt.a(Crypt.xrc("\u001celL`=\u0019`iIg;He=\u001beiO3;\u001e3lJ7<KjjOf")), 4).getStringSet(Crypt.a(Crypt.xrc("H7mH6i\u00196nJ0kI1;K6>\u001bd;K0hLkf\u0019gk\u001dg")), null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        String a = Crypt.a(Crypt.xrc("\u001be:I6l\u001e7:\u001c`;@e>NgmKe>M0:JbiA6o\u001aggN0;M7>J6iM3h\u00193>\u001ebmL1jI6gM09L1l\u001e"));
        stringSet.add(a);
        for (String str : stringSet) {
            try {
                objectInputStream = new ObjectInputStream(context.openFileInput(str + Crypt.a(Crypt.xrc("\u001e6lMf9@jh\u001ed=Kaf\u001afo@6hNg:A0iLkl\u0019a"))));
                try {
                    try {
                        C0775 c0775 = (C0775) objectInputStream.readObject();
                        if (c0775 != null && c0775.f4966 != null && c0775.f4984 != null) {
                            c0775.m2101();
                            if (str.equals(a)) {
                                f4910 = c0775;
                            } else {
                                this.f4911.put(c0775.f4984.toString(), c0775);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException | ClassNotFoundException unused2) {
                    if (!str.equals(a)) {
                        LinkedList<LogItem> linkedList = C0753.f4875;
                    }
                    if (objectInputStream == null) {
                    }
                    objectInputStream.close();
                }
            } catch (IOException | ClassNotFoundException unused3) {
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectInputStream.close();
            } catch (IOException unused4) {
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m2067(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Crypt.a(Crypt.xrc("\u001celL`=\u0019`iIg;He=\u001beiO3;\u001e3lJ7<KjjOf")), 4);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(Crypt.a(Crypt.xrc("H7mH6i\u00196nJ0kI1;K6>\u001bd;K0hLkf\u0019gk\u001dg")), this.f4911.keySet());
        String a = Crypt.a(Crypt.xrc("Jj9K39\u001a4fH`<\u001d69\u001bfg\u001d0jJcj\u0019d;\u001bg<\u0019k"));
        edit.putInt(a, sharedPreferences.getInt(a, 0) + 1);
        edit.apply();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2068(C0775 c0775) {
        this.f4911.put(c0775.f4984.toString(), c0775);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2069(Context context, C0775 c0775) {
        c0775.f4976++;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(c0775.f4984.toString() + Crypt.a(Crypt.xrc("\u001e6lMf9@jh\u001ed=Kaf\u001afo@6hNg:A0iLkl\u0019a")), 0));
            objectOutputStream.writeObject(c0775);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            LinkedList<LogItem> linkedList = C0753.f4875;
            throw new RuntimeException(e);
        }
    }
}
