package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import dev.epro.r0.A16739659649845694970;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.X9848659370812859730;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends X9848659370812859730 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new A16739659649845694970((byte) 21);
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Uri i;
    public String j;
    public final long k;
    public final String l;
    public final List m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f144o;
    public final HashSet p = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = uri;
        this.j = str5;
        this.k = j;
        this.l = str6;
        this.m = arrayList;
        this.n = str7;
        this.f144o = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            S10973172697741180971.j("Given String is empty or null");
            return null;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.j = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.l.equals(this.l)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.m);
        hashSet.addAll(googleSignInAccount.p);
        HashSet hashSet2 = new HashSet(this.m);
        hashSet2.addAll(this.p);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iH = E12098517352909843120.h(527, 31, this.l);
        HashSet hashSet = new HashSet(this.m);
        hashSet.addAll(this.p);
        return hashSet.hashCode() + iH;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.v(parcel, this.e, 2);
        C468629748621011703.v(parcel, this.f, 3);
        C468629748621011703.v(parcel, this.g, 4);
        C468629748621011703.v(parcel, this.h, 5);
        C468629748621011703.u(parcel, 6, this.i, i);
        C468629748621011703.v(parcel, this.j, 7);
        C468629748621011703.z(parcel, 8, 8);
        parcel.writeLong(this.k);
        C468629748621011703.v(parcel, this.l, 9);
        C468629748621011703.x(parcel, 10, this.m);
        C468629748621011703.v(parcel, this.n, 11);
        C468629748621011703.v(parcel, this.f144o, 12);
        C468629748621011703.D(parcel, iA);
    }
}
