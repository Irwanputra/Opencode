.class public final synthetic Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# static fields
.field public static final げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/びぐびあび;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/びぐびあび;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 5

    check-cast p1, Lcom/google/android/gms/internal/zzaog;

    .line 1
    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbwx:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_14

    const-string p1, "URL missing from httpTrack GMSG."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_28

    :cond_14
    new-instance v0, Lcom/google/android/gms/internal/zzajh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaog;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast p1, Lcom/google/android/gms/internal/zzaox;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaox;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/gms/internal/zzajh;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagb;->zzpy()Lcom/google/android/gms/internal/zzakv;

    :goto_28
    return-void
.end method
