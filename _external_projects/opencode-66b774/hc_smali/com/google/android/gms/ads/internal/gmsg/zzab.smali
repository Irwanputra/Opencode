.class public final Lcom/google/android/gms/ads/internal/gmsg/zzab;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/android/gms/internal/zzaog;",
        ":",
        "Lcom/google/android/gms/internal/zzaoh;",
        ":",
        "Lcom/google/android/gms/internal/zzaou;",
        ":",
        "Lcom/google/android/gms/internal/zzaow;",
        ":",
        "Lcom/google/android/gms/internal/zzaoy;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lcom/google/android/gms/internal/zzje;

.field public くし〴〺ぅ:Lcom/google/android/gms/ads/internal/overlay/zzn;

.field public げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/overlay/zzq;

.field public づざかべべ:Lcom/google/android/gms/ads/internal/zzw;

.field public なぎぱいぢぎ:Lcom/google/android/gms/internal/zzwr;

.field public びぐびあび:Lcom/google/android/gms/ads/internal/gmsg/zzb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/ads/internal/overlay/zzq;Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/gmsg/zzb;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/zzwr;)V
    .registers 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->〺つふすそ:Lcom/google/android/gms/internal/zzje;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->びぐびあび:Lcom/google/android/gms/ads/internal/gmsg/zzb;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->づざかべべ:Lcom/google/android/gms/ads/internal/zzw;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->なぎぱいぢぎ:Lcom/google/android/gms/internal/zzwr;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/overlay/zzn;

    return-void
.end method

.method public static 〺つふすそ(Ljava/util/Map;)I
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    const-string v0, "o"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_3d

    const-string v0, "p"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaht;->zzqg()I

    move-result p0

    return p0

    :cond_1b
    const-string v0, "l"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaht;->zzqf()I

    move-result p0

    return p0

    :cond_2c
    const-string v0, "c"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3d

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaht;->zzqh()I

    move-result p0

    return p0

    :cond_3d
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 13

    const-string v0, "OpenGmsgHandler.onGmsg"

    check-cast p1, Lcom/google/android/gms/internal/zzaog;

    const-string v1, "u"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzafi;->zzb(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "a"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_24

    const-string p1, "Action missing from an open GMSG."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_24
    iget-object v3, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->づざかべべ:Lcom/google/android/gms/ads/internal/zzw;

    if-eqz v3, :cond_34

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/zzw;->zzda()Z

    move-result v3

    if-nez v3, :cond_34

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->づざかべべ:Lcom/google/android/gms/ads/internal/zzw;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/internal/zzw;->zzt(Ljava/lang/String;)V

    return-void

    :cond_34
    const-string v3, "expand"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "1"

    const-string v5, "custom_close"

    const/4 v6, 0x0

    if-eqz v3, :cond_65

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/zzaoh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaoh;->zztc()Z

    move-result v0

    if-eqz v0, :cond_50

    const-string p1, "Cannot expand WebView that is already expanded."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_50
    invoke-virtual {p0, v6}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->げつ〴ぬぐ(Z)V

    check-cast p1, Lcom/google/android/gms/internal/zzaou;

    .line 1
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->〺つふすそ(Ljava/util/Map;)I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/zzaou;->zza(ZI)V

    return-void

    :cond_65
    const-string v3, "webapp"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a4

    invoke-virtual {p0, v6}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->げつ〴ぬぐ(Z)V

    check-cast p1, Lcom/google/android/gms/internal/zzaou;

    if-eqz v1, :cond_84

    .line 3
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 4
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->〺つふすそ(Ljava/util/Map;)I

    move-result p2

    invoke-interface {p1, v0, p2, v1}, Lcom/google/android/gms/internal/zzaou;->zza(ZILjava/lang/String;)V

    return-void

    .line 5
    :cond_84
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 6
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->〺つふすそ(Ljava/util/Map;)I

    move-result v1

    const-string v2, "html"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "baseurl"

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2, p2}, Lcom/google/android/gms/internal/zzaou;->zza(ZILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_a4
    const-string v3, "app"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_fc

    const-string v2, "system_browser"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "true"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_fc

    invoke-virtual {p0, v3}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->げつ〴ぬぐ(Z)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_cf

    const-string p1, "Destination url cannot be empty."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_cf
    new-instance v0, Lcom/google/android/gms/ads/internal/gmsg/zzac;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/zzaow;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzaow;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/zzaoy;

    check-cast v3, Landroid/view/View;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/gmsg/zzac;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzcv;Landroid/view/View;)V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/gmsg/zzac;->zzm(Ljava/util/Map;)Landroid/content/Intent;

    move-result-object p2

    :try_start_e8
    check-cast p1, Lcom/google/android/gms/internal/zzaou;

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-direct {v0, p2}, Lcom/google/android/gms/ads/internal/overlay/zzc;-><init>(Landroid/content/Intent;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzaou;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V
    :try_end_f2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_e8 .. :try_end_f2} :catch_f3

    return-void

    :catch_f3
    move-exception p1

    invoke-virtual {p1}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_fc
    invoke-virtual {p0, v3}, Lcom/google/android/gms/ads/internal/gmsg/zzab;->げつ〴ぬぐ(Z)V

    const-string v2, "intent_url"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_12d

    :try_start_10e
    invoke-static {v2, v6}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v3
    :try_end_112
    .catch Ljava/net/URISyntaxException; {:try_start_10e .. :try_end_112} :catch_113

    goto :goto_12d

    :catch_113
    move-exception v4

    const-string v5, "Error parsing the url: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_125

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_12a

    :cond_125
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_12a
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12d
    :goto_12d
    if-eqz v3, :cond_195

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_195

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_192

    :try_start_143
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v5

    move-object v6, p1

    check-cast v6, Lcom/google/android/gms/internal/zzaow;

    invoke-interface {v6}, Lcom/google/android/gms/internal/zzaow;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object v6

    move-object v7, p1

    check-cast v7, Lcom/google/android/gms/internal/zzaoy;

    check-cast v7, Landroid/view/View;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->zzsi()Landroid/app/Activity;

    move-result-object v8

    invoke-static {v5, v6, v4, v7, v8}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzcv;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v4
    :try_end_15e
    .catch Ljava/lang/Exception; {:try_start_143 .. :try_end_15e} :catch_15f

    goto :goto_16c

    :catch_15f
    move-exception v5

    const-string v6, "Error occurred while adding signals."

    invoke-static {v6, v5}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v6

    invoke-virtual {v6, v5, v0}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_16c
    :try_start_16c
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2
    :try_end_170
    .catch Ljava/lang/Exception; {:try_start_16c .. :try_end_170} :catch_171

    goto :goto_192

    :catch_171
    move-exception v5

    const-string v6, "Error parsing the uri: "

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_183

    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_188

    :cond_183
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_188
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v4

    invoke-virtual {v4, v5, v0}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_192
    :goto_192
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :cond_195
    if-eqz v3, :cond_1a2

    check-cast p1, Lcom/google/android/gms/internal/zzaou;

    new-instance p2, Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-direct {p2, v3}, Lcom/google/android/gms/ads/internal/overlay/zzc;-><init>(Landroid/content/Intent;)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/zzaou;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V

    return-void

    :cond_1a2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1c3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/zzaow;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzaow;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/zzaoy;

    check-cast v3, Landroid/view/View;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->zzsi()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v0, v2, v1, v3, v4}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzcv;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    :cond_1c3
    move-object v4, v1

    check-cast p1, Lcom/google/android/gms/internal/zzaou;

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzc;

    const-string v1, "i"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    const-string v1, "m"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    const-string v1, "p"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    const-string v1, "c"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    const-string v1, "f"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    const-string v1, "e"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v9, p2

    check-cast v9, Ljava/lang/String;

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/ads/internal/overlay/zzc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzaou;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V

    return-void
.end method

.method public final げつ〴ぬぐ(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/gmsg/zzab;->なぎぱいぢぎ:Lcom/google/android/gms/internal/zzwr;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzwr;->zzl(Z)V

    :cond_7
    return-void
.end method
