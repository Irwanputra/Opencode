.class public final Lcom/google/android/gms/internal/zzamd;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzama;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzdgr:Lcom/google/android/gms/internal/zzamp;

.field private final zzdgs:Landroid/widget/FrameLayout;

.field private final zzdgt:Lcom/google/android/gms/internal/zznu;

.field private final zzdgu:Lcom/google/android/gms/internal/zzamr;

.field private final zzdgv:J

.field private zzdgw:Lcom/google/android/gms/internal/zzamb;

.field private zzdgx:Z

.field private zzdgy:Z

.field private zzdgz:Z

.field private zzdha:Z

.field private zzdhb:J

.field private zzdhc:J

.field private zzdhd:Ljava/lang/String;

.field private zzdhe:Landroid/graphics/Bitmap;

.field private zzdhf:Landroid/widget/ImageView;

.field private zzdhg:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzamp;IZLcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzamo;)V
    .registers 19

    move-object v0, p0

    move-object v8, p1

    move-object/from16 v9, p5

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    move-object v3, p2

    iput-object v3, v0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    iput-object v9, v0, Lcom/google/android/gms/internal/zzamd;->zzdgt:Lcom/google/android/gms/internal/zznu;

    new-instance v10, Landroid/widget/FrameLayout;

    invoke-direct {v10, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v10, v0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v11, -0x1

    invoke-direct {v1, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v10, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzamp;->zzbq()Lcom/google/android/gms/ads/internal/zzv;

    move-result-object v1

    if-eqz v1, :cond_ab

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzamp;->zzbq()Lcom/google/android/gms/ads/internal/zzv;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzv;->zzaom:Lcom/google/android/gms/internal/zzamc;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/zzamc;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzamp;IZLcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzamo;)Lcom/google/android/gms/internal/zzamb;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-eqz v1, :cond_58

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    invoke-direct {v2, v11, v11, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v10, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbin:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_58

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzamd;->zzrw()V

    :cond_58
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbir:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdgv:J

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbip:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdha:Z

    if-eqz v9, :cond_91

    if-eqz v1, :cond_8a

    const-string v1, "1"

    goto :goto_8c

    :cond_8a
    const-string v1, "0"

    :goto_8c
    const-string v2, "spinner_used"

    invoke-virtual {v9, v2, v1}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_91
    new-instance v1, Lcom/google/android/gms/internal/zzamr;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzamr;-><init>(Lcom/google/android/gms/internal/zzamd;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdgu:Lcom/google/android/gms/internal/zzamr;

    iget-object v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-eqz v1, :cond_9f

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzama;)V

    :cond_9f
    iget-object v1, v0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v1, :cond_aa

    const-string v1, "AdVideoUnderlay Error"

    const-string v2, "Allocating player failed."

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/zzamd;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    :cond_aa
    return-void

    .line 1
    :cond_ab
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "null reference"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzamd;Ljava/lang/String;[Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzamp;)V
    .registers 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "no_video_view"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onVideoEvent"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/internal/zzamp;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzamp;Ljava/lang/String;)V
    .registers 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "decoderProps"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "error"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onVideoEvent"

    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/zzamp;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzamp;Ljava/util/Map;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzamp;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "decoderProps"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "mimeTypes"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onVideoEvent"

    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/zzamp;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final varargs zza(Ljava/lang/String;[Ljava/lang/String;)V
    .registers 8

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length p1, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_e
    if-ge v2, p1, :cond_1d

    aget-object v4, p2, v2

    if-nez v3, :cond_16

    move-object v3, v4

    goto :goto_1a

    :cond_16
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v1

    :goto_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_1d
    iget-object p1, p0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    const-string p2, "onVideoEvent"

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/zzamp;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final zzry()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    return v0

    :cond_a
    const/4 v0, 0x0

    return v0
.end method

.method private final zzrz()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzamp;->zzsi()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgy:Z

    if-eqz v0, :cond_23

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgz:Z

    if-nez v0, :cond_23

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzamp;->zzsi()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgy:Z

    :cond_23
    return-void
.end method


# virtual methods
.method public final destroy()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgu:Lcom/google/android/gms/internal/zzamr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamr;->pause()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->stop()V

    :cond_c
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;->zzrz()V

    return-void
.end method

.method public final onPaused()V
    .registers 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "pause"

    invoke-direct {p0, v2, v1}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;->zzrz()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgx:Z

    return-void
.end method

.method public final pause()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->pause()V

    return-void
.end method

.method public final play()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->play()V

    return-void
.end method

.method public final seekTo(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzamb;->seekTo(I)V

    return-void
.end method

.method public final zza(FF)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzamb;->zza(FF)V

    :cond_7
    return-void
.end method

.method public final zzb(F)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/zzamb;->zzdgq:Lcom/google/android/gms/internal/zzams;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzams;->zzb(F)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->zzrm()V

    return-void
.end method

.method public final zzcv(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhd:Ljava/lang/String;

    return-void
.end method

.method public final zzd(IIII)V
    .registers 6

    if-eqz p3, :cond_16

    if-nez p4, :cond_5

    goto :goto_16

    :cond_5
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, p3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 p3, 0x0

    invoke-virtual {v0, p1, p2, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    :cond_16
    :goto_16
    return-void
.end method

.method public final zzf(II)V
    .registers 6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdha:Z

    if-eqz v0, :cond_4a

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbiq:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    div-int/2addr p1, v1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    div-int/2addr p2, v0

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-ne v0, p1, :cond_3f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eq v0, p2, :cond_4a

    :cond_3f
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhg:Z

    :cond_4a
    return-void
.end method

.method public final zzf(Landroid/view/MotionEvent;)V
    .registers 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0, p1}, Landroid/view/TextureView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public final zzg(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "what"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 p1, 0x2

    const-string v1, "extra"

    aput-object v1, v0, p1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    const-string p1, "error"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final zzrn()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgu:Lcom/google/android/gms/internal/zzamr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamr;->resume()V

    sget-object v0, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzame;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzame;-><init>(Lcom/google/android/gms/internal/zzamd;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzro()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-wide v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhc:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_4d

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzamb;->getVideoWidth()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamb;->getVideoHeight()I

    move-result v2

    const/4 v3, 0x6

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "duration"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x2

    const-string v4, "videoWidth"

    aput-object v4, v3, v0

    const/4 v0, 0x3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v0

    const/4 v0, 0x4

    const-string v1, "videoHeight"

    aput-object v1, v3, v0

    const/4 v0, 0x5

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v0

    const-string v0, "canplaythrough"

    invoke-direct {p0, v0, v3}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_4d
    return-void
.end method

.method public final zzrp()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzamp;->zzsi()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_38

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgy:Z

    if-nez v0, :cond_38

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzamp;->zzsi()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-eqz v0, :cond_24

    const/4 v0, 0x1

    goto :goto_25

    :cond_24
    const/4 v0, 0x0

    :goto_25
    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgz:Z

    if-nez v0, :cond_38

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgr:Lcom/google/android/gms/internal/zzamp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzamp;->zzsi()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdgy:Z

    :cond_38
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdgx:Z

    return-void
.end method

.method public final zzrq()V
    .registers 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "ended"

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;->zzrz()V

    return-void
.end method

.method public final zzrr()V
    .registers 5

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhg:Z

    if-eqz v0, :cond_2e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2e

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;->zzry()Z

    move-result v0

    if-nez v0, :cond_2e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->invalidate()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->bringChildToFront(Landroid/view/View;)V

    :cond_2e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgu:Lcom/google/android/gms/internal/zzamr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamr;->pause()V

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhb:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhc:J

    sget-object v0, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzamf;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzamf;-><init>(Lcom/google/android/gms/internal/zzamd;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzrs()V
    .registers 6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgx:Z

    if-eqz v0, :cond_11

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;->zzry()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhf:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7c

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v3}, Landroid/view/TextureView;->getBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_2f

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzamd;->zzdhg:Z

    :cond_2f
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/zzagf;->zzpz()Z

    move-result v0

    if-eqz v0, :cond_5e

    const/16 v0, 0x2e

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Spinner frame grab took "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "ms"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    :cond_5e
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgv:J

    cmp-long v4, v2, v0

    if-lez v4, :cond_7c

    const-string v0, "Spinner frame grab crossed jank threshold! Suspending spinner."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdha:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhe:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgt:Lcom/google/android/gms/internal/zznu;

    if-eqz v0, :cond_7c

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "spinner_jank"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7c
    return-void
.end method

.method public final zzrt()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhd:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamd;->zzdhd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzamb;->setVideoPath(Ljava/lang/String;)V

    return-void

    :cond_15
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "no_src"

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final zzru()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/zzamb;->zzdgq:Lcom/google/android/gms/internal/zzams;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzams;->setMuted(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->zzrm()V

    return-void
.end method

.method public final zzrv()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/zzamb;->zzdgq:Lcom/google/android/gms/internal/zzams;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzams;->setMuted(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->zzrm()V

    return-void
.end method

.method public final zzrw()V
    .registers 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v0, "AdMob - "

    iget-object v2, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamb;->zzri()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_25

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2b

    :cond_25
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_2b
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v0, -0x10000

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v0, -0x100

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    const/4 v4, -0x2

    invoke-direct {v2, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgs:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->bringChildToFront(Landroid/view/View;)V

    return-void
.end method

.method public final zzrx()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdgw:Lcom/google/android/gms/internal/zzamb;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->getCurrentPosition()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzamd;->zzdhb:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_30

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_30

    long-to-float v2, v0

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "time"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v4

    const-string v2, "timeupdate"

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/zzamd;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzamd;->zzdhb:J

    :cond_30
    return-void
.end method
