.class public Lcom/google/android/gms/ads/internal/gmsg/HttpClient;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Lcom/google/android/gms/common/annotation/KeepName;
.end annotation

.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;,
        Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;,
        Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;,
        Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
        "Lcom/google/android/gms/ads/internal/js/zza;",
        ">;"
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzapr:Lcom/google/android/gms/internal/zzakd;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->zzapr:Lcom/google/android/gms/internal/zzakd;

    return-void
.end method

.method private final zza(Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;)Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;
    .registers 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :try_start_2
    iget-object v2, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;->〺つふすそ:Ljava/net/URL;

    .line 2
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_a} :catch_d7
    .catchall {:try_start_2 .. :try_end_a} :catchall_d5

    :try_start_a
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->mContext:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-virtual {v3, v4, v5, v0, v2}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V

    .line 3
    iget-object v3, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;->くし〴〺ぅ:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1e
    if-ge v5, v4, :cond_30

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    check-cast v6, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;

    .line 5
    iget-object v7, v6, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 6
    iget-object v6, v6, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    .line 7
    invoke-virtual {v2, v7, v6}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1e

    .line 8
    :cond_30
    iget-object v3, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;->びぐびあび:Ljava/lang/String;

    .line 9
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_56

    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 10
    iget-object v3, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;->びぐびあび:Ljava/lang/String;

    .line 11
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v5, v3

    invoke-virtual {v2, v5}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    new-instance v5, Ljava/io/BufferedOutputStream;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v5, v3}, Ljava/io/BufferedOutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V

    goto :goto_57

    :cond_56
    move-object v3, v1

    :goto_57
    new-instance v5, Lcom/google/android/gms/internal/zzajv;

    invoke-direct {v5}, Lcom/google/android/gms/internal/zzajv;-><init>()V

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/net/HttpURLConnection;[B)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v6

    if-eqz v6, :cond_a7

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_76
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_76

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    new-instance v10, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-direct {v10, v11, v9}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8c

    :cond_a7
    new-instance v6, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;

    .line 12
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 13
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    new-instance v8, Ljava/io/InputStreamReader;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v8}, Lcom/google/android/gms/internal/zzahn;->zza(Ljava/io/InputStreamReader;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, p1, v7, v3, v8}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V

    invoke-virtual {v5, v2, v7}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/net/HttpURLConnection;I)V

    .line 14
    iget-object p1, v6, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;->びぐびあび:Ljava/lang/String;

    .line 15
    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/zzajv;->zzcr(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;

    invoke-direct {p1, v4, v6, v1}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;-><init>(ZLcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;Ljava/lang/String;)V
    :try_end_cf
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_cf} :catch_d3
    .catchall {:try_start_a .. :try_end_cf} :catchall_e8

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object p1

    :catch_d3
    move-exception p1

    goto :goto_d9

    :catchall_d5
    move-exception p1

    goto :goto_ea

    :catch_d7
    move-exception p1

    move-object v2, v1

    :goto_d9
    :try_start_d9
    new-instance v3, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v0, v1, p1}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;-><init>(ZLcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;Ljava/lang/String;)V
    :try_end_e2
    .catchall {:try_start_d9 .. :try_end_e2} :catchall_e8

    if-eqz v2, :cond_e7

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_e7
    return-object v3

    :catchall_e8
    move-exception p1

    move-object v1, v2

    :goto_ea
    if-eqz v1, :cond_ef

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_ef
    goto :goto_f1

    :goto_f0
    throw p1

    :goto_f1
    goto :goto_f0
.end method

.method private static zza(Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;)Lorg/json/JSONObject;
    .registers 8

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_5
    const-string v1, "http_request_id"

    .line 16
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;->びぐびあび:Ljava/lang/String;

    if-eqz v1, :cond_15

    const-string v2, "body"

    .line 19
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_15
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 20
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;->くし〴〺ぅ:Ljava/util/List;

    .line 21
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_45

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "key"

    .line 22
    iget-object v6, v3, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 23
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "value"

    .line 24
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    .line 25
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_20

    :cond_45
    const-string v2, "headers"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "response_code"

    .line 26
    iget p0, p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;->〺つふすそ:I

    .line 27
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_51
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_51} :catch_52

    goto :goto_58

    :catch_52
    move-exception p0

    const-string v1, "Error constructing JSON for http response."

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_58
    return-object v0
.end method

.method private static zzd(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;
    .registers 9

    const-string v0, "http_request_id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "post_body"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_13
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_18
    .catch Ljava/net/MalformedURLException; {:try_start_13 .. :try_end_18} :catch_1a

    move-object v3, v4

    goto :goto_20

    :catch_1a
    move-exception v1

    const-string v4, "Error constructing http request."

    invoke-static {v4, v1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "headers"

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_32

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    :cond_32
    const/4 v4, 0x0

    :goto_33
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_56

    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_53

    const-string v6, "key"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "value"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;

    invoke-direct {v7, v6, v5}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_53
    add-int/lit8 v4, v4, 0x1

    goto :goto_33

    :cond_56
    new-instance p0, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;

    invoke-direct {p0, v0, v3, v1, v2}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;-><init>(Ljava/lang/String;Ljava/net/URL;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public send(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .registers 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    const-string v0, "reason"

    const-string v1, "success"

    const-string v2, "response"

    const-string v3, "http_request_id"

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, ""

    const/4 v6, 0x0

    :try_start_10
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->zzd(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->zza(Lcom/google/android/gms/ads/internal/gmsg/HttpClient$〺つふすそ;)Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;

    move-result-object p1

    .line 1
    iget-boolean v7, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;->〺つふすそ:Z

    if-eqz v7, :cond_2e

    .line 2
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;->zza(Lcom/google/android/gms/ads/internal/gmsg/HttpClient$びぐびあび;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v4, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 p1, 0x1

    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_64

    :cond_2e
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v7, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v7

    invoke-virtual {v4, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v4, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 4
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/gmsg/HttpClient$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/String;

    .line 5
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_42
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_42} :catch_43

    goto :goto_64

    :catch_43
    move-exception p1

    const-string v7, "Error executing http request."

    invoke-static {v7, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :try_start_49
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v8, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v4, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5f
    .catch Lorg/json/JSONException; {:try_start_49 .. :try_end_5f} :catch_60

    goto :goto_64

    :catch_60
    move-exception p1

    invoke-static {v7, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_64
    return-object v4
.end method

.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 4

    check-cast p1, Lcom/google/android/gms/ads/internal/js/zza;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;

    invoke-direct {v0, p0, p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;-><init>(Lcom/google/android/gms/ads/internal/gmsg/HttpClient;Ljava/util/Map;Lcom/google/android/gms/ads/internal/js/zza;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahh;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/zzakv;

    return-void
.end method
