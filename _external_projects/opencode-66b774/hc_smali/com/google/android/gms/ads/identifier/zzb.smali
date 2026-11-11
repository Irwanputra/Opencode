.class public final Lcom/google/android/gms/ads/identifier/zzb;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public げつ〴ぬぐ:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    :try_start_4
    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぉざぅち〻;->げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_c

    move-object p1, v0

    goto :goto_13

    :cond_c
    const-string v1, "google_ads_flags"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    :goto_13
    iput-object p1, p0, Lcom/google/android/gms/ads/identifier/zzb;->げつ〴ぬぐ:Landroid/content/SharedPreferences;
    :try_end_15
    .catchall {:try_start_4 .. :try_end_15} :catchall_16

    return-void

    :catchall_16
    iput-object v0, p0, Lcom/google/android/gms/ads/identifier/zzb;->げつ〴ぬぐ:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final getBoolean(Ljava/lang/String;Z)Z
    .registers 4

    const/4 p2, 0x0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/zzb;->げつ〴ぬぐ:Landroid/content/SharedPreferences;

    if-nez v0, :cond_6

    return p2

    :cond_6
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1
    :try_end_a
    .catchall {:try_start_1 .. :try_end_a} :catchall_b

    return p1

    :catchall_b
    return p2
.end method
