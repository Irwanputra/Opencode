.class public final synthetic Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# static fields
.field public static final げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 8

    check-cast p1, Lcom/google/android/gms/ads/internal/js/zza;

    .line 1
    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbwx:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_15

    const-string p1, "URL missing from click GMSG."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto/16 :goto_c7

    :cond_15
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :try_start_19
    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/zzaow;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaow;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object v1

    if-eqz v1, :cond_59

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzcv;->zzb(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_59

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/zzaog;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/zzaoy;
    :try_end_32
    .catch Lcom/google/android/gms/internal/zzcw; {:try_start_19 .. :try_end_32} :catch_43

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_35
    check-cast v3, Landroid/view/View;

    move-object v4, p1

    check-cast v4, Lcom/google/android/gms/internal/zzaog;

    invoke-interface {v4}, Lcom/google/android/gms/internal/zzaog;->zzsi()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/google/android/gms/internal/zzcv;->zza(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object v0
    :try_end_42
    .catch Lcom/google/android/gms/internal/zzcw; {:try_start_35 .. :try_end_42} :catch_43

    goto :goto_59

    :catch_43
    nop

    const-string v1, "Unable to append parameter to URL: "

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_51

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_56

    :cond_51
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_56
    invoke-static {p2}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :cond_59
    :goto_59
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object p2

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/zzaog;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/zznh;->zzbku:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_7e

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/zzaff;->zzq(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_7e

    const/4 p2, 0x1

    goto :goto_7f

    :cond_7e
    const/4 p2, 0x0

    :goto_7f
    if-eqz p2, :cond_af

    const-string p2, "fbs_aeid"

    invoke-virtual {v0, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_af

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v2

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzaff;->zzy(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2, v2}, Lcom/google/android/gms/internal/zzahn;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object p2

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p2, v3, v2}, Lcom/google/android/gms/internal/zzaff;->zze(Landroid/content/Context;Ljava/lang/String;)V

    :cond_af
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/zzajh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast p1, Lcom/google/android/gms/internal/zzaox;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaox;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/gms/internal/zzajh;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagb;->zzpy()Lcom/google/android/gms/internal/zzakv;

    :goto_c7
    return-void
.end method
