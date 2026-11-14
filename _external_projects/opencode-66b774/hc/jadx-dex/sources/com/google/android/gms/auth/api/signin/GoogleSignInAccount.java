package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class GoogleSignInAccount extends dev.epro.r0.X9848659370812859730 implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 21);
    public final int d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final android.net.Uri i;
    public java.lang.String j;
    public final long k;
    public final java.lang.String l;
    public final java.util.List m;
    public final java.lang.String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f144o;
    public final java.util.HashSet p = new java.util.HashSet();

    public GoogleSignInAccount(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.ArrayList arrayList, java.lang.String str7, java.lang.String str8) {
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

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount a(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("photoUrl");
        android.net.Uri uri = !android.text.TextUtils.isEmpty(strOptString) ? android.net.Uri.parse(strOptString) : null;
        long j = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(1, jSONArray.getString(i)));
        }
        java.lang.String strOptString2 = jSONObject.optString("id");
        java.lang.String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        java.lang.String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        java.lang.String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        java.lang.String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        java.lang.String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        java.lang.String string = jSONObject.getString("obfuscatedIdentifier");
        if (android.text.TextUtils.isEmpty(string)) {
            dev.epro.r0.S10973172697741180971.j("Given String is empty or null");
            return null;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new java.util.ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.j = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        if (!googleSignInAccount.l.equals(this.l)) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet(googleSignInAccount.m);
        hashSet.addAll(googleSignInAccount.p);
        java.util.HashSet hashSet2 = new java.util.HashSet(this.m);
        hashSet2.addAll(this.p);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iH = dev.epro.r0.E12098517352909843120.h(527, 31, this.l);
        java.util.HashSet hashSet = new java.util.HashSet(this.m);
        hashSet.addAll(this.p);
        return hashSet.hashCode() + iH;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        dev.epro.r0.C468629748621011703.v(parcel, this.e, 2);
        dev.epro.r0.C468629748621011703.v(parcel, this.f, 3);
        dev.epro.r0.C468629748621011703.v(parcel, this.g, 4);
        dev.epro.r0.C468629748621011703.v(parcel, this.h, 5);
        dev.epro.r0.C468629748621011703.u(parcel, 6, this.i, i);
        dev.epro.r0.C468629748621011703.v(parcel, this.j, 7);
        dev.epro.r0.C468629748621011703.z(parcel, 8, 8);
        parcel.writeLong(this.k);
        dev.epro.r0.C468629748621011703.v(parcel, this.l, 9);
        dev.epro.r0.C468629748621011703.x(parcel, 10, this.m);
        dev.epro.r0.C468629748621011703.v(parcel, this.n, 11);
        dev.epro.r0.C468629748621011703.v(parcel, this.f144o, 12);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
