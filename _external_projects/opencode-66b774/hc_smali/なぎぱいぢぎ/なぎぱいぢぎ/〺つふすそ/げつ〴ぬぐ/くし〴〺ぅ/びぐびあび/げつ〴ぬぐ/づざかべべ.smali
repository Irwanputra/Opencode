.class public final synthetic Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# static fields
.field public static final げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/づざかべべ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/づざかべべ;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 6

    check-cast p1, Lcom/google/android/gms/internal/zzaow;

    .line 1
    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbwx:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v0, "tx"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "ty"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "td"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :try_start_1c
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaow;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object p1

    if-eqz p1, :cond_3b

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzcv;->zzaf()Lcom/google/android/gms/internal/zzcr;

    move-result-object p1

    invoke-interface {p1, v0, v1, p2}, Lcom/google/android/gms/internal/zzcr;->zza(III)V
    :try_end_35
    .catch Ljava/lang/NumberFormatException; {:try_start_1c .. :try_end_35} :catch_36

    goto :goto_3b

    :catch_36
    const-string p1, "Could not parse touch parameters from gmsg."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :cond_3b
    :goto_3b
    return-void
.end method
