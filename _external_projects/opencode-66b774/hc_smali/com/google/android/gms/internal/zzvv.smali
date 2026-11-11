.class public final Lcom/google/android/gms/internal/zzvv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/mediation/NativeMediationAdRequest;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzapn:Lcom/google/android/gms/internal/zzpe;

.field private final zzapo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbdw:I

.field private final zzbei:Z

.field private final zzcfm:I

.field private final zzcfu:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final zzhh:Ljava/util/Date;

.field private final zzhj:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final zzhk:Z

.field private final zzhl:Landroid/location/Location;


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZILcom/google/android/gms/internal/zzpe;Ljava/util/List;Z)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/location/Location;",
            "ZI",
            "Lcom/google/android/gms/internal/zzpe;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzvv;->zzhh:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/zzvv;->zzbdw:I

    iput-object p3, p0, Lcom/google/android/gms/internal/zzvv;->zzhj:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzvv;->zzhl:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzvv;->zzhk:Z

    iput p6, p0, Lcom/google/android/gms/internal/zzvv;->zzcfm:I

    iput-object p7, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/zzvv;->zzbei:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzvv;->zzapo:Ljava/util/List;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzvv;->zzcfu:Ljava/util/Map;

    if-eqz p8, :cond_72

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_27
    :goto_27
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_72

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string p3, "custom:"

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_6c

    const-string p3, ":"

    const/4 p4, 0x3

    invoke-virtual {p2, p3, p4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    array-length p3, p2

    if-ne p3, p4, :cond_27

    const/4 p3, 0x2

    aget-object p4, p2, p3

    const-string p5, "true"

    invoke-virtual {p5, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    const/4 p5, 0x1

    if-eqz p4, :cond_5b

    iget-object p3, p0, Lcom/google/android/gms/internal/zzvv;->zzcfu:Ljava/util/Map;

    aget-object p2, p2, p5

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_57
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_27

    :cond_5b
    aget-object p3, p2, p3

    const-string p4, "false"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_27

    iget-object p3, p0, Lcom/google/android/gms/internal/zzvv;->zzcfu:Ljava/util/Map;

    aget-object p2, p2, p5

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_57

    :cond_6c
    iget-object p3, p0, Lcom/google/android/gms/internal/zzvv;->zzapo:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_72
    return-void
.end method


# virtual methods
.method public final getAdVolume()F
    .registers 2

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzly;->zzdn()F

    move-result v0

    return v0
.end method

.method public final getBirthday()Ljava/util/Date;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzhh:Ljava/util/Date;

    return-object v0
.end method

.method public final getGender()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzvv;->zzbdw:I

    return v0
.end method

.method public final getKeywords()Ljava/util/Set;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzhj:Ljava/util/Set;

    return-object v0
.end method

.method public final getLocation()Landroid/location/Location;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzhl:Landroid/location/Location;

    return-object v0
.end method

.method public final getNativeAdOptions()Lcom/google/android/gms/ads/formats/NativeAdOptions;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    new-instance v0, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/zzpe;->zzbve:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->setReturnUrlsForImageAssets(Z)Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    iget v1, v1, Lcom/google/android/gms/internal/zzpe;->zzbvf:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->setImageOrientation(I)Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/zzpe;->zzbvg:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->setRequestMultipleImages(Z)Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    iget v2, v1, Lcom/google/android/gms/internal/zzpe;->versionCode:I

    const/4 v3, 0x2

    if-lt v2, v3, :cond_2f

    iget v1, v1, Lcom/google/android/gms/internal/zzpe;->zzbvh:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->setAdChoicesPlacement(I)Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    :cond_2f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzvv;->zzapn:Lcom/google/android/gms/internal/zzpe;

    iget v2, v1, Lcom/google/android/gms/internal/zzpe;->versionCode:I

    const/4 v3, 0x3

    if-lt v2, v3, :cond_42

    iget-object v1, v1, Lcom/google/android/gms/internal/zzpe;->zzbvi:Lcom/google/android/gms/internal/zzmr;

    if-eqz v1, :cond_42

    new-instance v2, Lcom/google/android/gms/ads/VideoOptions;

    invoke-direct {v2, v1}, Lcom/google/android/gms/ads/VideoOptions;-><init>(Lcom/google/android/gms/internal/zzmr;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->setVideoOptions(Lcom/google/android/gms/ads/VideoOptions;)Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    :cond_42
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->build()Lcom/google/android/gms/ads/formats/NativeAdOptions;

    move-result-object v0

    return-object v0
.end method

.method public final isAdMuted()Z
    .registers 2

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzly;->zzdo()Z

    move-result v0

    return v0
.end method

.method public final isAppInstallAdRequested()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzapo:Ljava/util/List;

    if-eqz v0, :cond_e

    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    return v0

    :cond_e
    const/4 v0, 0x0

    return v0
.end method

.method public final isContentAdRequested()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzapo:Ljava/util/List;

    if-eqz v0, :cond_e

    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    return v0

    :cond_e
    const/4 v0, 0x0

    return v0
.end method

.method public final isDesignedForFamilies()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzvv;->zzbei:Z

    return v0
.end method

.method public final isTesting()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzvv;->zzhk:Z

    return v0
.end method

.method public final taggedForChildDirectedTreatment()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzvv;->zzcfm:I

    return v0
.end method

.method public final zzmo()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzapo:Ljava/util/List;

    if-eqz v0, :cond_e

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    return v0

    :cond_e
    const/4 v0, 0x0

    return v0
.end method

.method public final zzmp()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvv;->zzcfu:Ljava/util/Map;

    return-object v0
.end method
