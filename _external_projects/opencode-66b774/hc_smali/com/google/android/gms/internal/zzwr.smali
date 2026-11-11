.class public final Lcom/google/android/gms/internal/zzwr;
.super Lcom/google/android/gms/internal/zzxb;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static zzcgk:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private zzalv:I

.field private zzalw:I

.field private final zzbyk:Lcom/google/android/gms/internal/zzanh;

.field private final zzcgb:Landroid/app/Activity;

.field private zzcgl:Ljava/lang/String;

.field private zzcgm:Z

.field private zzcgn:I

.field private zzcgo:I

.field private zzcgp:I

.field private zzcgq:I

.field private zzcgr:Lcom/google/android/gms/internal/zzapa;

.field private zzcgs:Landroid/widget/ImageView;

.field private zzcgt:Landroid/widget/LinearLayout;

.field private zzcgu:Lcom/google/android/gms/internal/zzxc;

.field private zzcgv:Landroid/widget/PopupWindow;

.field private zzcgw:Landroid/widget/RelativeLayout;

.field private zzcgx:Landroid/view/ViewGroup;


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x7

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "top-left"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "top-right"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "top-center"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "center"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "bottom-left"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "bottom-right"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "bottom-center"

    aput-object v3, v1, v2

    .line 1
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ひぞ〴つき(I)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 2
    sput-object v0, Lcom/google/android/gms/internal/zzwr;->zzcgk:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/internal/zzxc;)V
    .registers 5

    const-string v0, "resize"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzxb;-><init>(Lcom/google/android/gms/internal/zzanh;Ljava/lang/String;)V

    const-string v0, "top-right"

    iput-object v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgl:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgm:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgn:I

    iput v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    iput v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    iput v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    iput v1, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzwr;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->zzsi()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgu:Lcom/google/android/gms/internal/zzxc;

    return-void
.end method

.method private final zza(II)V
    .registers 5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahn;->zzh(Landroid/app/Activity;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    sub-int/2addr p2, v0

    iget v0, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    iget v1, p0, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/zzxb;->zzb(IIII)V

    return-void
.end method

.method private final zzmq()[I
    .registers 10

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahn;->zzg(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzahn;->zzh(Landroid/app/Activity;)[I

    move-result-object v1

    const/4 v2, 0x0

    aget v3, v0, v2

    const/4 v4, 0x1

    aget v0, v0, v4

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    const/4 v6, 0x2

    const/16 v7, 0x32

    if-lt v5, v7, :cond_ef

    if-le v5, v3, :cond_25

    goto/16 :goto_ef

    :cond_25
    iget v8, p0, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    if-lt v8, v7, :cond_ec

    if-le v8, v0, :cond_2d

    goto/16 :goto_ec

    :cond_2d
    if-ne v8, v0, :cond_35

    if-ne v5, v3, :cond_35

    const-string v0, "Cannot resize to a full-screen ad."

    goto/16 :goto_f1

    :cond_35
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgm:Z

    if-eqz v0, :cond_ea

    iget-object v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const/4 v5, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_154

    goto :goto_88

    :sswitch_47
    const-string v8, "top-center"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_50

    goto :goto_88

    :cond_50
    const/4 v5, 0x5

    goto :goto_88

    :sswitch_52
    const-string v8, "bottom-center"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5b

    goto :goto_88

    :cond_5b
    const/4 v5, 0x4

    goto :goto_88

    :sswitch_5d
    const-string v8, "bottom-right"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_66

    goto :goto_88

    :cond_66
    const/4 v5, 0x3

    goto :goto_88

    :sswitch_68
    const-string v8, "bottom-left"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_71

    goto :goto_88

    :cond_71
    const/4 v5, 0x2

    goto :goto_88

    :sswitch_73
    const-string v8, "top-left"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7c

    goto :goto_88

    :cond_7c
    const/4 v5, 0x1

    goto :goto_88

    :sswitch_7e
    const-string v8, "center"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_87

    goto :goto_88

    :cond_87
    const/4 v5, 0x0

    :goto_88
    iget v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgn:I

    packed-switch v5, :pswitch_data_16e

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    add-int/2addr v0, v5

    sub-int/2addr v0, v7

    goto :goto_c1

    :pswitch_95
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    div-int/2addr v5, v6

    add-int/2addr v5, v0

    add-int/lit8 v0, v5, -0x19

    goto :goto_c1

    :pswitch_9f
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    div-int/2addr v5, v6

    add-int/2addr v5, v0

    add-int/lit8 v0, v5, -0x19

    goto :goto_b4

    :pswitch_a9
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    add-int/2addr v0, v5

    sub-int/2addr v0, v7

    goto :goto_b4

    :pswitch_b1
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    :goto_b4
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    iget v8, p0, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    add-int/2addr v5, v8

    iget v8, p0, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    add-int/2addr v5, v8

    sub-int/2addr v5, v7

    goto :goto_db

    :pswitch_be
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    :goto_c1
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    iget v8, p0, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    add-int/2addr v5, v8

    goto :goto_db

    :pswitch_c7
    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v0, v5

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    div-int/2addr v5, v6

    add-int/2addr v5, v0

    add-int/lit8 v0, v5, -0x19

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    iget v8, p0, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    add-int/2addr v5, v8

    iget v8, p0, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    div-int/2addr v8, v6

    add-int/2addr v8, v5

    add-int/lit8 v5, v8, -0x19

    :goto_db
    if-ltz v0, :cond_f4

    add-int/2addr v0, v7

    if-gt v0, v3, :cond_f4

    aget v0, v1, v2

    if-lt v5, v0, :cond_f4

    add-int/2addr v5, v7

    aget v0, v1, v4

    if-le v5, v0, :cond_ea

    goto :goto_f4

    :cond_ea
    const/4 v0, 0x1

    goto :goto_f5

    :cond_ec
    :goto_ec
    const-string v0, "Height is too small or too large."

    goto :goto_f1

    :cond_ef
    :goto_ef
    const-string v0, "Width is too small or too large."

    :goto_f1
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :cond_f4
    :goto_f4
    const/4 v0, 0x0

    :goto_f5
    if-nez v0, :cond_f9

    const/4 v0, 0x0

    return-object v0

    :cond_f9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzwr;->zzcgm:Z

    if-eqz v0, :cond_10e

    new-array v0, v6, [I

    iget v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgn:I

    iget v3, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v1, v3

    aput v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    iget v2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    add-int/2addr v1, v2

    aput v1, v0, v4

    return-object v0

    :cond_10e
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahn;->zzg(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/zzahn;->zzh(Landroid/app/Activity;)[I

    move-result-object v1

    aget v0, v0, v2

    iget v3, p0, Lcom/google/android/gms/internal/zzwr;->zzcgn:I

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    add-int/2addr v3, v5

    iget v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    iget v7, p0, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    add-int/2addr v5, v7

    if-gez v3, :cond_132

    const/4 v3, 0x0

    goto :goto_13a

    :cond_132
    iget v7, p0, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    add-int v8, v3, v7

    if-le v8, v0, :cond_13a

    sub-int v3, v0, v7

    :cond_13a
    :goto_13a
    aget v0, v1, v2

    if-ge v5, v0, :cond_141

    aget v5, v1, v2

    goto :goto_14d

    :cond_141
    iget v0, p0, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    add-int v7, v5, v0

    aget v8, v1, v4

    if-le v7, v8, :cond_14d

    aget v1, v1, v4

    sub-int v5, v1, v0

    :cond_14d
    :goto_14d
    new-array v0, v6, [I

    aput v3, v0, v2

    aput v5, v0, v4

    return-object v0

    :sswitch_data_154
    .sparse-switch
        -0x514d33ab -> :sswitch_7e
        -0x3c587281 -> :sswitch_73
        -0x27103597 -> :sswitch_68
        0x455fe3fa -> :sswitch_5d
        0x4ccee637 -> :sswitch_52
        0x68a23bcd -> :sswitch_47
    .end sparse-switch

    :pswitch_data_16e
    .packed-switch 0x0
        :pswitch_c7
        :pswitch_be
        :pswitch_b1
        :pswitch_a9
        :pswitch_9f
        :pswitch_95
    .end packed-switch
.end method


# virtual methods
.method public final execute(Ljava/util/Map;)V
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lcom/google/android/gms/internal/zzwr;->mLock:Ljava/lang/Object;

    monitor-enter v2

    :try_start_7
    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    if-nez v3, :cond_12

    const-string v0, "Not an activity context. Cannot resize."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_12
    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v3

    if-nez v3, :cond_21

    const-string v0, "Webview is not yet available, size is not set."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_21
    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v3

    if-eqz v3, :cond_34

    const-string v0, "Is interstitial. Cannot resize an interstitial."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_34
    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzanh;->zztc()Z

    move-result v3

    if-eqz v3, :cond_43

    const-string v0, "Cannot resize an expanded banner."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_43
    const-string v3, "width"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_62

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    const-string v3, "width"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzahn;->zzce(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    :cond_62
    const-string v3, "height"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_81

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    const-string v3, "height"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzahn;->zzce(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    :cond_81
    const-string v3, "offsetX"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    const-string v3, "offsetX"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzahn;->zzce(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/zzwr;->zzcgp:I

    :cond_a0
    const-string v3, "offsetY"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_bf

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    const-string v3, "offsetY"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzahn;->zzce(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/google/android/gms/internal/zzwr;->zzcgq:I

    :cond_bf
    const-string v3, "allowOffscreen"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_db

    const-string v3, "allowOffscreen"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v1, Lcom/google/android/gms/internal/zzwr;->zzcgm:Z

    :cond_db
    const-string v3, "customClosePosition"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_eb

    iput-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzcgl:Ljava/lang/String;

    :cond_eb
    iget v0, v1, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v0, :cond_f7

    iget v0, v1, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    if-ltz v0, :cond_f7

    const/4 v0, 0x1

    goto :goto_f8

    :cond_f7
    const/4 v0, 0x0

    :goto_f8
    if-nez v0, :cond_101

    const-string v0, "Invalid width and height options. Cannot resize."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_101
    iget-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_31d

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_111

    goto/16 :goto_31d

    :cond_111
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/zzwr;->zzmq()[I

    move-result-object v5

    if-nez v5, :cond_11e

    const-string v0, "Resize location out of screen or close button is not visible."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_11e
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v6, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    iget v7, v1, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v6

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    iget v8, v1, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v7

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_136
    .catchall {:try_start_7 .. :try_end_136} :catchall_324

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_139
    check-cast v8, Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    if-eqz v8, :cond_316

    instance-of v9, v8, Landroid/view/ViewGroup;

    if-eqz v9, :cond_316

    move-object v9, v8

    check-cast v9, Landroid/view/ViewGroup;

    iget-object v10, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_14a
    .catchall {:try_start_139 .. :try_end_14a} :catchall_324

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_14d
    check-cast v10, Landroid/view/View;

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    if-nez v9, :cond_184

    check-cast v8, Landroid/view/ViewGroup;

    iput-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_15f
    .catchall {:try_start_14d .. :try_end_15f} :catchall_324

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_162
    check-cast v8, Landroid/view/View;

    invoke-static {v8}, Lcom/google/android/gms/internal/zzahn;->zzr(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v8

    new-instance v9, Landroid/widget/ImageView;

    iget-object v10, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-direct {v9, v10}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgs:Landroid/widget/ImageView;

    invoke-virtual {v9, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v8}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v8

    iput-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgr:Lcom/google/android/gms/internal/zzapa;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgs:Landroid/widget/ImageView;

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_187

    :cond_184
    invoke-virtual {v9}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_187
    new-instance v8, Landroid/widget/RelativeLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-direct {v8, v9}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    invoke-virtual {v8, v4}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v9, v6, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    invoke-static {v8, v6, v7, v4}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/view/View;IIZ)Landroid/widget/PopupWindow;

    move-result-object v8

    iput-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    invoke-virtual {v8, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    invoke-virtual {v8, v3}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    iget-boolean v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgm:Z

    if-nez v9, :cond_1b8

    const/4 v9, 0x1

    goto :goto_1b9

    :cond_1b8
    const/4 v9, 0x0

    :goto_1b9
    invoke-virtual {v8, v9}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_1c0
    .catchall {:try_start_162 .. :try_end_1c0} :catchall_324

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1c3
    check-cast v9, Landroid/view/View;

    const/4 v10, -0x1

    invoke-virtual {v8, v9, v10, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    new-instance v8, Landroid/widget/LinearLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-direct {v8, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgt:Landroid/widget/LinearLayout;

    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    const/16 v11, 0x32

    invoke-static {v9, v11}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v9

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v12, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    invoke-static {v12, v11}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v11

    invoke-direct {v8, v9, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgl:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v11

    const/4 v12, 0x5

    const/4 v13, 0x4

    const/4 v14, 0x3

    const/4 v15, 0x2

    sparse-switch v11, :sswitch_data_32a

    goto :goto_234

    :sswitch_1f9
    const-string v11, "top-center"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_234

    const/4 v10, 0x1

    goto :goto_234

    :sswitch_203
    const-string v11, "bottom-center"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_234

    const/4 v10, 0x4

    goto :goto_234

    :sswitch_20d
    const-string v11, "bottom-right"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_234

    const/4 v10, 0x5

    goto :goto_234

    :sswitch_217
    const-string v11, "bottom-left"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_234

    const/4 v10, 0x3

    goto :goto_234

    :sswitch_221
    const-string v11, "top-left"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_234

    const/4 v10, 0x0

    goto :goto_234

    :sswitch_22b
    const-string v11, "center"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_234

    const/4 v10, 0x2

    :cond_234
    :goto_234
    const/16 v9, 0x9

    const/16 v11, 0xa

    if-eqz v10, :cond_26a

    const/16 v4, 0xe

    if-eq v10, v3, :cond_266

    if-eq v10, v15, :cond_260

    const/16 v15, 0xc

    if-eq v10, v14, :cond_259

    if-eq v10, v13, :cond_255

    const/16 v4, 0xb

    if-eq v10, v12, :cond_251

    invoke-virtual {v8, v11}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_24d
    invoke-virtual {v8, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_26e

    :cond_251
    invoke-virtual {v8, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_24d

    :cond_255
    invoke-virtual {v8, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_24d

    :cond_259
    invoke-virtual {v8, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_25c
    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_26e

    :cond_260
    const/16 v4, 0xd

    invoke-virtual {v8, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_26e

    :cond_266
    invoke-virtual {v8, v11}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_24d

    :cond_26a
    invoke-virtual {v8, v11}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_25c

    :goto_26e
    iget-object v4, v1, Lcom/google/android/gms/internal/zzwr;->zzcgt:Landroid/widget/LinearLayout;

    new-instance v9, Lcom/google/android/gms/internal/zzws;

    invoke-direct {v9, v1}, Lcom/google/android/gms/internal/zzws;-><init>(Lcom/google/android/gms/internal/zzwr;)V

    invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/zzwr;->zzcgt:Landroid/widget/LinearLayout;

    const-string v9, "Close button"

    invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgt:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v9, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_286
    .catchall {:try_start_1c3 .. :try_end_286} :catchall_324

    :try_start_286
    iget-object v4, v1, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    const/4 v9, 0x0

    aget v10, v5, v9

    invoke-static {v8, v10}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v8

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    aget v10, v5, v3

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v9

    const/4 v10, 0x0

    invoke-virtual {v4, v0, v10, v8, v9}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_2a7
    .catch Ljava/lang/RuntimeException; {:try_start_286 .. :try_end_2a7} :catch_2ce
    .catchall {:try_start_286 .. :try_end_2a7} :catchall_324

    :try_start_2a7
    aget v0, v5, v10

    aget v4, v5, v3

    iget-object v8, v1, Lcom/google/android/gms/internal/zzwr;->zzcgu:Lcom/google/android/gms/internal/zzxc;

    if-eqz v8, :cond_2b6

    iget v9, v1, Lcom/google/android/gms/internal/zzwr;->zzalv:I

    iget v10, v1, Lcom/google/android/gms/internal/zzwr;->zzalw:I

    invoke-interface {v8, v0, v4, v9, v10}, Lcom/google/android/gms/internal/zzxc;->zza(IIII)V

    :cond_2b6
    iget-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/zzapa;->zzi(II)Lcom/google/android/gms/internal/zzapa;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/zzanh;->zza(Lcom/google/android/gms/internal/zzapa;)V

    const/4 v0, 0x0

    aget v0, v5, v0

    aget v3, v5, v3

    invoke-direct {v1, v0, v3}, Lcom/google/android/gms/internal/zzwr;->zza(II)V

    const-string v0, "resized"

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbo(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :catch_2ce
    move-exception v0

    const-string v3, "Cannot show popup window: "

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2e4

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2e9

    :cond_2e4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2e9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_2f0
    .catchall {:try_start_2a7 .. :try_end_2f0} :catchall_324

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2f3
    check-cast v3, Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    if-eqz v0, :cond_314

    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzcgs:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_305
    .catchall {:try_start_2f3 .. :try_end_305} :catchall_324

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_308
    check-cast v3, Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzwr;->zzcgr:Lcom/google/android/gms/internal/zzapa;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzanh;->zza(Lcom/google/android/gms/internal/zzapa;)V

    :cond_314
    monitor-exit v2

    return-void

    :cond_316
    const-string v0, "Webview is detached, probably in the middle of a resize or expand."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_31d
    :goto_31d
    const-string v0, "Activity context is not ready, cannot get window or decor view."

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :catchall_324
    move-exception v0

    monitor-exit v2
    :try_end_326
    .catchall {:try_start_308 .. :try_end_326} :catchall_324

    goto :goto_328

    :goto_327
    throw v0

    :goto_328
    goto :goto_327

    nop

    :sswitch_data_32a
    .sparse-switch
        -0x514d33ab -> :sswitch_22b
        -0x3c587281 -> :sswitch_221
        -0x27103597 -> :sswitch_217
        0x455fe3fa -> :sswitch_20d
        0x4ccee637 -> :sswitch_203
        0x68a23bcd -> :sswitch_1f9
    .end sparse-switch
.end method

.method public final zza(IIZ)V
    .registers 10

    iget-object v0, p0, Lcom/google/android/gms/internal/zzwr;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgn:I

    iput p2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_47

    if-eqz p3, :cond_47

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzwr;->zzmq()[I

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p1, :cond_44

    iget-object p3, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    const/4 v2, 0x0

    aget v3, p1, v2

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzwr;->zzcgb:Landroid/app/Activity;

    aget v4, p1, p2

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v5

    invoke-virtual {p3, v1, v3, v4, v5}, Landroid/widget/PopupWindow;->update(IIII)V

    aget p3, p1, v2

    aget p1, p1, p2

    invoke-direct {p0, p3, p1}, Lcom/google/android/gms/internal/zzwr;->zza(II)V

    goto :goto_47

    :cond_44
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzwr;->zzl(Z)V

    :cond_47
    :goto_47
    monitor-exit v0

    return-void

    :catchall_49
    move-exception p1

    monitor-exit v0
    :try_end_4b
    .catchall {:try_start_3 .. :try_end_4b} :catchall_49

    throw p1
.end method

.method public final zzb(II)V
    .registers 3

    iput p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgn:I

    iput p2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgo:I

    return-void
.end method

.method public final zzl(Z)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzwr;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_49

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_4b

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_11
    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    if-eqz v1, :cond_32

    iget-object v2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgs:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_23
    .catchall {:try_start_11 .. :try_end_23} :catchall_4b

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_26
    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzwr;->zzcgr:Lcom/google/android/gms/internal/zzapa;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzanh;->zza(Lcom/google/android/gms/internal/zzapa;)V

    :cond_32
    if-eqz p1, :cond_40

    const-string p1, "default"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzxb;->zzbo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgu:Lcom/google/android/gms/internal/zzxc;

    if-eqz p1, :cond_40

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzxc;->zzcu()V

    :cond_40
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgw:Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgx:Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgt:Landroid/widget/LinearLayout;

    :cond_49
    monitor-exit v0

    return-void

    :catchall_4b
    move-exception p1

    monitor-exit v0
    :try_end_4d
    .catchall {:try_start_26 .. :try_end_4d} :catchall_4b

    throw p1
.end method

.method public final zzmr()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzwr;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzwr;->zzcgv:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    monitor-exit v0

    return v1

    :catchall_c
    move-exception v1

    monitor-exit v0
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_c

    throw v1
.end method
