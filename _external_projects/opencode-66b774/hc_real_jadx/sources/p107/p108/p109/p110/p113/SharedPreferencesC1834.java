package p107.p108.p109.p110.p113;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p107.p108.p109.p110.p113.p115.C1846;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class SharedPreferencesC1834 implements SharedPreferences {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final String f8202 = SharedPreferencesC1834.class.getName();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1846.C1850 f8203;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public SharedPreferences f8204;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public final class SharedPreferencesEditorC1835 implements SharedPreferences.Editor {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public SharedPreferences.Editor f8206;

        public SharedPreferencesEditorC1835(C1836 c1836) {
            this.f8206 = SharedPreferencesC1834.this.f8204.edit();
        }

        @Override // android.content.SharedPreferences.Editor
        @TargetApi(9)
        public void apply() {
            this.f8206.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f8206.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.f8206.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f8206.putString(SharedPreferencesC1834.m3951(str), SharedPreferencesC1834.m3950(SharedPreferencesC1834.this, Boolean.toString(z)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f8206.putString(SharedPreferencesC1834.m3951(str), SharedPreferencesC1834.m3950(SharedPreferencesC1834.this, Float.toString(f)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.f8206.putString(SharedPreferencesC1834.m3951(str), SharedPreferencesC1834.m3950(SharedPreferencesC1834.this, Integer.toString(i)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.f8206.putString(SharedPreferencesC1834.m3951(str), SharedPreferencesC1834.m3950(SharedPreferencesC1834.this, Long.toString(j)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.f8206.putString(SharedPreferencesC1834.m3951(str), SharedPreferencesC1834.m3950(SharedPreferencesC1834.this, str2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @TargetApi(11)
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(SharedPreferencesC1834.m3950(SharedPreferencesC1834.this, it.next()));
            }
            this.f8206.putStringSet(SharedPreferencesC1834.m3951(str), hashSet);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f8206.remove(SharedPreferencesC1834.m3951(str));
            return this;
        }
    }

    public SharedPreferencesC1834(Context context) {
        if (this.f8204 == null) {
            this.f8204 = TextUtils.isEmpty(null) ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(null, 0);
        }
        if (!TextUtils.isEmpty("")) {
            try {
                this.f8203 = C1846.m3968("", m3949(context).getBytes(), 10000);
                return;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            String m3951 = m3951(C1846.m3968(context.getPackageName(), m3949(context).getBytes(), 10000).toString());
            String string = this.f8204.getString(m3951, null);
            if (string == null) {
                this.f8203 = C1846.m3970();
                this.f8204.edit().putString(m3951, this.f8203.toString()).commit();
            } else {
                this.f8203 = C1846.m3969(string);
            }
            if (this.f8203 != null) {
            } else {
                throw new GeneralSecurityException(Crypt.a(Crypt.xrc("JgmH0oJcfI7;\u001dgoM7>\u00193>\u001bfgI3nLdfJ6kJ1lJe<Hjh@emO6g\u00196kMeo\u001cjgMk;\u001bb;O")));
            }
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m3949(Context context) {
        String a = Crypt.a(Crypt.xrc("@bm\u001ebjN`l\u001e`;M3<Ad=@alO3h\u001bgmKdgMk"));
        try {
            String str = (String) Build.class.getField(Crypt.a(Crypt.xrc("L6=K3:Mg>\u001egoI7fK39@6h@7oOalL3=@j"))).get(null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), a) : str;
        } catch (Exception unused) {
            return Settings.Secure.getString(context.getContentResolver(), a);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m3950(SharedPreferencesC1834 sharedPreferencesC1834, String str) {
        sharedPreferencesC1834.getClass();
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return C1846.m3965(str, sharedPreferencesC1834.f8203).toString();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static String m3951(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001edn\u001e`g\u00194l\u001aalI0;\u001ebiO4f\u001b3jAd<Ncj\u001d0")));
            byte[] bytes = str.getBytes(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f8204.contains(m3951(str));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC1835(null);
    }

    @Override // android.content.SharedPreferences
    public Map<String, String> getAll() {
        Map<String, ?> all = this.f8204.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            try {
                Object value = entry.getValue();
                if (value != null && !value.equals(this.f8203.toString())) {
                    hashMap.put(entry.getKey(), m3952(value.toString()));
                }
            } catch (Exception unused) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        String string = this.f8204.getString(m3951(str), null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(m3952(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        String string = this.f8204.getString(m3951(str), null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(m3952(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        String string = this.f8204.getString(m3951(str), null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(m3952(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        String string = this.f8204.getString(m3951(str), null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(m3952(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String string = this.f8204.getString(m3951(str), null);
        return string != null ? m3952(string) : str2;
    }

    @Override // android.content.SharedPreferences
    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.f8204.getStringSet(m3951(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            hashSet.add(m3952(it.next()));
        }
        return hashSet;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f8204.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f8204.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String m3952(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return C1846.m3967(new C1846.C1851(str), this.f8203);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }
}
