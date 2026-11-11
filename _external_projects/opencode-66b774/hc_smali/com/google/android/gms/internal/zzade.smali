.class public final Lcom/google/android/gms/internal/zzade;
.super Lcom/google/android/gms/ads/internal/zzd;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaef;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static zzcuy:Lcom/google/android/gms/internal/zzade;

.field private static final zzcuz:Lcom/google/android/gms/internal/zzuw;


# instance fields
.field private zzaqg:Z

.field private zzaqh:Lcom/google/android/gms/internal/zzafe;

.field private final zzcva:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzael;",
            ">;"
        }
    .end annotation
.end field

.field private zzcvb:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zzuw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzuw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzade;->zzcuz:Lcom/google/android/gms/internal/zzuw;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzv;Lcom/google/android/gms/internal/zzjn;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzakd;)V
    .registers 13

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/zzd;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/ads/internal/zzv;)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    sput-object p0, Lcom/google/android/gms/internal/zzade;->zzcuy:Lcom/google/android/gms/internal/zzade;

    new-instance p2, Lcom/google/android/gms/internal/zzafe;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/zzafe;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzade;->zzaqh:Lcom/google/android/gms/internal/zzafe;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzade;I)V
    .registers 2

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzi(I)V

    return-void
.end method

.method private static zzc(Lcom/google/android/gms/internal/zzafp;)Lcom/google/android/gms/internal/zzafp;
    .registers 46

    move-object/from16 v1, p0

    const-string v0, "Creating mediation ad response for non-mediated rewarded ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    :try_start_7
    iget-object v0, v1, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzacg;->zzb(Lcom/google/android/gms/internal/zzaax;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "pubid"

    iget-object v4, v1, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzaat;->zzatw:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11
    :try_end_23
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_23} :catch_d0

    new-instance v0, Lcom/google/android/gms/internal/zzuh;

    move-object v2, v0

    const/4 v4, 0x0

    const/4 v15, 0x1

    new-array v5, v15, [Ljava/lang/String;

    const-string v6, "com.google.ads.mediation.admob.AdMobAdapter"

    const/16 v24, 0x0

    aput-object v6, v5, v24

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v10

    const/4 v12, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v13

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v14

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v20

    const/16 v21, 0x0

    const-wide/16 v22, -0x1

    invoke-direct/range {v2 .. v23}, Lcom/google/android/gms/internal/zzuh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;J)V

    new-instance v2, Lcom/google/android/gms/internal/zzui;

    move-object/from16 v25, v2

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/internal/zzuh;

    aput-object v0, v3, v24

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v26

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbnj:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v27

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v29

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v30

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v31

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v32

    const/16 v33, 0x0

    const-wide/16 v35, -0x1

    const/16 v37, 0x0

    const/16 v38, 0x1

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, -0x1

    const-wide/16 v42, -0x1

    const/16 v44, 0x0

    const-string v34, ""

    invoke-direct/range {v25 .. v44}, Lcom/google/android/gms/internal/zzui;-><init>(Ljava/util/List;JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;JIILjava/lang/String;IIJZ)V

    new-instance v0, Lcom/google/android/gms/internal/zzafp;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v4, v1, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    iget-object v5, v1, Lcom/google/android/gms/internal/zzafp;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget v6, v1, Lcom/google/android/gms/internal/zzafp;->errorCode:I

    iget-wide v7, v1, Lcom/google/android/gms/internal/zzafp;->zzcxp:J

    iget-wide v9, v1, Lcom/google/android/gms/internal/zzafp;->zzcxq:J

    iget-object v11, v1, Lcom/google/android/gms/internal/zzafp;->zzcxj:Lorg/json/JSONObject;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafp;->zzcxw:Lcom/google/android/gms/internal/zzis;

    const/16 v37, 0x0

    move-object/from16 v25, v0

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    move-object/from16 v28, v2

    move-object/from16 v29, v5

    move/from16 v30, v6

    move-wide/from16 v31, v7

    move-wide/from16 v33, v9

    move-object/from16 v35, v11

    move-object/from16 v36, v1

    invoke-direct/range {v25 .. v37}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaax;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/zzis;Ljava/lang/Boolean;)V

    return-object v0

    :catch_d0
    move-exception v0

    const-string v2, "Unable to generate ad state for non-mediated rewarded video."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/google/android/gms/internal/zzafp;

    iget-object v4, v1, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v5, v1, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    const/4 v6, 0x0

    iget-object v7, v1, Lcom/google/android/gms/internal/zzafp;->zzauc:Lcom/google/android/gms/internal/zzjn;

    const/4 v8, 0x0

    iget-wide v9, v1, Lcom/google/android/gms/internal/zzafp;->zzcxp:J

    iget-wide v11, v1, Lcom/google/android/gms/internal/zzafp;->zzcxq:J

    iget-object v13, v1, Lcom/google/android/gms/internal/zzafp;->zzcxj:Lorg/json/JSONObject;

    iget-object v14, v1, Lcom/google/android/gms/internal/zzafp;->zzcxw:Lcom/google/android/gms/internal/zzis;

    const/4 v15, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v15}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaax;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/zzis;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static zzoa()Lcom/google/android/gms/internal/zzade;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzade;->zzcuy:Lcom/google/android/gms/internal/zzade;

    return-object v0
.end method


# virtual methods
.method public final destroy()V
    .registers 5

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_1b
    iget-object v2, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzael;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzva;->destroy()V
    :try_end_32
    .catch Landroid/os/RemoteException; {:try_start_1b .. :try_end_32} :catch_33

    goto :goto_f

    :catch_33
    nop

    const-string v2, "Fail to destroy adapter: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_45

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4a

    :cond_45
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4a
    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_f

    :cond_4e
    return-void
.end method

.method public final isLoaded()Z
    .registers 3

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaua:Lcom/google/android/gms/internal/zzagb;

    if-nez v1, :cond_19

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaub:Lcom/google/android/gms/internal/zzaif;

    if-nez v1, :cond_19

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    if-eqz v0, :cond_19

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzade;->zzcvb:Z

    if-nez v0, :cond_19

    const/4 v0, 0x1

    return v0

    :cond_19
    const/4 v0, 0x0

    return v0
.end method

.method public final onContextChanged(Landroid/content/Context;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzael;

    :try_start_16
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v1

    .line 1
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzva;->zzg(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    :try_end_22
    .catch Landroid/os/RemoteException; {:try_start_16 .. :try_end_22} :catch_23

    goto :goto_a

    :catch_23
    move-exception v1

    const-string v2, "Unable to call Adapter.onContextChanged."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_2a
    return-void
.end method

.method public final onRewardedVideoAdClosed()V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaff;->zzu(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzaqh:Lcom/google/android/gms/internal/zzafe;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafe;->zzu(Z)V

    :cond_14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzade;->zzbv()V

    return-void
.end method

.method public final onRewardedVideoAdLeftApplication()V
    .registers 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbw()V

    return-void
.end method

.method public final onRewardedVideoAdOpened()V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaff;->zzu(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzaqh:Lcom/google/android/gms/internal/zzafe;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafe;->zzu(Z)V

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/internal/zzafo;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbx()V

    return-void
.end method

.method public final onRewardedVideoStarted()V
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    if-eqz v0, :cond_21

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafo;->zzces:Lcom/google/android/gms/internal/zzuh;

    if-eqz v0, :cond_21

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzez()Lcom/google/android/gms/internal/zzuq;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzatw:Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v0, v3, Lcom/google/android/gms/internal/zzafo;->zzces:Lcom/google/android/gms/internal/zzuh;

    iget-object v6, v0, Lcom/google/android/gms/internal/zzuh;->zzcda:Ljava/util/List;

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/zzuq;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzafo;Ljava/lang/String;ZLjava/util/List;)V

    :cond_21
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzcb()V

    return-void
.end method

.method public final pause()V
    .registers 5

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_1b
    iget-object v2, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzael;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzva;->pause()V
    :try_end_32
    .catch Landroid/os/RemoteException; {:try_start_1b .. :try_end_32} :catch_33

    goto :goto_f

    :catch_33
    nop

    const-string v2, "Fail to pause adapter: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_45

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4a

    :cond_45
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4a
    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_f

    :cond_4e
    return-void
.end method

.method public final resume()V
    .registers 5

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_1b
    iget-object v2, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzael;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzva;->resume()V
    :try_end_32
    .catch Landroid/os/RemoteException; {:try_start_1b .. :try_end_32} :catch_33

    goto :goto_f

    :catch_33
    nop

    const-string v2, "Fail to resume adapter: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_45

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4a

    :cond_45
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4a
    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_f

    :cond_4e
    return-void
.end method

.method public final setImmersiveMode(Z)V
    .registers 3

    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzade;->zzaqg:Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzadv;)V
    .registers 4

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/zzadv;->zzatw:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-string p1, "Invalid ad unit id. Aborting."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/zzadf;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzadf;-><init>(Lcom/google/android/gms/internal/zzade;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1d
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzade;->zzcvb:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzadv;->zzatw:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzatw:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzaqh:Lcom/google/android/gms/internal/zzafe;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafe;->setAdUnitId(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/zzadv;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zznu;)V
    .registers 6

    iget p2, p1, Lcom/google/android/gms/internal/zzafp;->errorCode:I

    const/4 v0, -0x2

    if-eq p2, v0, :cond_10

    sget-object p2, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/zzadg;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzadg;-><init>(Lcom/google/android/gms/internal/zzade;Lcom/google/android/gms/internal/zzafp;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_10
    iget-object p2, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iput-object p1, p2, Lcom/google/android/gms/ads/internal/zzbt;->zzaue:Lcom/google/android/gms/internal/zzafp;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzafp;->zzcxl:Lcom/google/android/gms/internal/zzui;

    if-nez v0, :cond_1e

    invoke-static {p1}, Lcom/google/android/gms/internal/zzade;->zzc(Lcom/google/android/gms/internal/zzafp;)Lcom/google/android/gms/internal/zzafp;

    move-result-object p1

    iput-object p1, p2, Lcom/google/android/gms/ads/internal/zzbt;->zzaue:Lcom/google/android/gms/internal/zzafp;

    :cond_1e
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    const/4 p2, 0x0

    iput p2, p1, Lcom/google/android/gms/ads/internal/zzbt;->zzauz:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeh()Lcom/google/android/gms/internal/zzya;

    iget-object p2, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, p2, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    iget-object p2, p2, Lcom/google/android/gms/ads/internal/zzbt;->zzaue:Lcom/google/android/gms/internal/zzafp;

    new-instance v1, Lcom/google/android/gms/internal/zzaei;

    invoke-direct {v1, v0, p2, p0}, Lcom/google/android/gms/internal/zzaei;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zzade;)V

    const-string p2, "AdRenderer: "

    const-class v0, Lcom/google/android/gms/internal/zzaei;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_44

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_4a

    :cond_44
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p2, v0

    :goto_4a
    invoke-static {p2}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaif;->zznd()Ljava/lang/Object;

    iput-object v1, p1, Lcom/google/android/gms/ads/internal/zzbt;->zzaub:Lcom/google/android/gms/internal/zzaif;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzafo;Lcom/google/android/gms/internal/zzafo;)Z
    .registers 3

    const/4 p1, 0x1

    return p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzjj;Lcom/google/android/gms/internal/zzafo;Z)Z
    .registers 4

    const/4 p1, 0x0

    return p1
.end method

.method public final zzbq(Ljava/lang/String;)Lcom/google/android/gms/internal/zzael;
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzael;

    if-nez v0, :cond_43

    :try_start_a
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzd;->zzanw:Lcom/google/android/gms/internal/zzux;

    const-string v2, "com.google.ads.mediation.admob.AdMobAdapter"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    sget-object v1, Lcom/google/android/gms/internal/zzade;->zzcuz:Lcom/google/android/gms/internal/zzuw;

    :cond_16
    new-instance v2, Lcom/google/android/gms/internal/zzael;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzux;->zzbg(Ljava/lang/String;)Lcom/google/android/gms/internal/zzva;

    move-result-object v1

    invoke-direct {v2, v1, p0}, Lcom/google/android/gms/internal/zzael;-><init>(Lcom/google/android/gms/internal/zzva;Lcom/google/android/gms/internal/zzaef;)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_1f} :catch_29

    :try_start_1f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzcva:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_24} :catch_26

    move-object v0, v2

    goto :goto_43

    :catch_26
    move-exception v1

    move-object v0, v2

    goto :goto_2a

    :catch_29
    move-exception v1

    :goto_2a
    const-string v2, "Fail to instantiate adapter "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3b

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_40

    :cond_3b
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_40
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_43
    :goto_43
    return-object v0
.end method

.method public final zzbv()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbv()V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/zzaeq;)V
    .registers 9

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    if-eqz v0, :cond_21

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafo;->zzcxl:Lcom/google/android/gms/internal/zzui;

    if-eqz v0, :cond_21

    iget-object v0, v0, Lcom/google/android/gms/internal/zzui;->zzcdr:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_21

    new-instance p1, Lcom/google/android/gms/internal/zzaeq;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafo;->zzcxl:Lcom/google/android/gms/internal/zzui;

    iget-object v1, v0, Lcom/google/android/gms/internal/zzui;->zzcdr:Ljava/lang/String;

    iget v0, v0, Lcom/google/android/gms/internal/zzui;->zzcds:I

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/zzaeq;-><init>(Ljava/lang/String;I)V

    :cond_21
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    if-eqz v0, :cond_41

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafo;->zzces:Lcom/google/android/gms/internal/zzuh;

    if-eqz v0, :cond_41

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzez()Lcom/google/android/gms/internal/zzuq;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzafo;->zzces:Lcom/google/android/gms/internal/zzuh;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzuh;->zzcdb:Ljava/util/List;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzauv:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0, p1}, Lcom/google/android/gms/internal/zzuq;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/zzaeq;)V

    :cond_41
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaff;->zzu(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_70

    if-eqz p1, :cond_70

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbt;->zzair:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzaff;->zzy(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzatw:Ljava/lang/String;

    iget-object v5, p1, Lcom/google/android/gms/internal/zzaeq;->type:Ljava/lang/String;

    iget v6, p1, Lcom/google/android/gms/internal/zzaeq;->zzcwd:I

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzaff;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_70
    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/zzaeq;)V

    return-void
.end method

.method public final zzob()V
    .registers 4

    const-string v0, "showAd must be called on the main UI thread."

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のかまじえ(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzade;->isLoaded()Z

    move-result v0

    if-nez v0, :cond_11

    const-string v0, "The reward video has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_11
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzade;->zzcvb:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zza;->zzano:Lcom/google/android/gms/ads/internal/zzbt;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbt;->zzaud:Lcom/google/android/gms/internal/zzafo;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafo;->zzceu:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzade;->zzbq(Ljava/lang/String;)Lcom/google/android/gms/internal/zzael;

    move-result-object v0

    if-eqz v0, :cond_3d

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v1

    if-eqz v1, :cond_3d

    :try_start_26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzade;->zzaqg:Z

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzva;->setImmersiveMode(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzael;->zzoi()Lcom/google/android/gms/internal/zzva;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzva;->showVideo()V
    :try_end_36
    .catch Landroid/os/RemoteException; {:try_start_26 .. :try_end_36} :catch_37

    return-void

    :catch_37
    move-exception v0

    const-string v1, "Could not call showVideo."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3d
    return-void
.end method

.method public final zzoc()V
    .registers 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzd;->onAdClicked()V

    return-void
.end method
