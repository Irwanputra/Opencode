.class public final synthetic Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzakg;


# instance fields
.field public final げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzac;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzac;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/づざかべべ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzac;

    return-void
.end method


# virtual methods
.method public final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzakv;
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/づざかべべ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzac;

    check-cast p1, Lorg/json/JSONObject;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const-string v2, "isSuccessful"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_21

    const-string v1, "appSettingsJson"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzac;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/zzaft;->zzk(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    goto :goto_26

    :cond_21
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    :goto_26
    return-object p1
.end method
