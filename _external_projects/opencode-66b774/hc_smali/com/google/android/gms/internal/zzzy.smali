.class public final Lcom/google/android/gms/internal/zzzy;
.super Lcom/google/android/gms/internal/zzagb;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaal;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private zzcef:Lcom/google/android/gms/internal/zzui;

.field private zzcey:Lcom/google/android/gms/internal/zzaat;

.field private zzcjl:Lcom/google/android/gms/internal/zzaax;

.field private zzcjm:Ljava/lang/Runnable;

.field private final zzcjn:Ljava/lang/Object;

.field private final zzcmm:Lcom/google/android/gms/internal/zzzx;

.field private final zzcmn:Lcom/google/android/gms/internal/zzaau;

.field private final zzcmo:Lcom/google/android/gms/internal/zzis;

.field private final zzcmp:Lcom/google/android/gms/internal/zzix;

.field public zzcmq:Lcom/google/android/gms/internal/zzaif;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaau;Lcom/google/android/gms/internal/zzzx;Lcom/google/android/gms/internal/zzix;)V
    .registers 6

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagb;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjn:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzzy;->zzcmm:Lcom/google/android/gms/internal/zzzx;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzzy;->zzcmp:Lcom/google/android/gms/internal/zzix;

    new-instance p1, Lcom/google/android/gms/internal/zzis;

    sget-object p3, Lcom/google/android/gms/internal/zznh;->zzbrf:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-direct {p1, p4, p3}, Lcom/google/android/gms/internal/zzis;-><init>(Lcom/google/android/gms/internal/zzix;Z)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcmo:Lcom/google/android/gms/internal/zzis;

    new-instance p3, Lcom/google/android/gms/internal/zzzz;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/zzzz;-><init>(Lcom/google/android/gms/internal/zzzy;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/zzis;->zza(Lcom/google/android/gms/internal/zzit;)V

    new-instance p3, Lcom/google/android/gms/internal/zzjd;

    invoke-direct {p3}, Lcom/google/android/gms/internal/zzjd;-><init>()V

    iget-object p4, p2, Lcom/google/android/gms/internal/zzaau;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget p4, p4, Lcom/google/android/gms/internal/zzakd;->zzdej:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    iput-object p4, p3, Lcom/google/android/gms/internal/zzjd;->zzbda:Ljava/lang/Integer;

    iget-object p4, p2, Lcom/google/android/gms/internal/zzaau;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget p4, p4, Lcom/google/android/gms/internal/zzakd;->zzdek:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    iput-object p4, p3, Lcom/google/android/gms/internal/zzjd;->zzbdb:Ljava/lang/Integer;

    iget-object p4, p2, Lcom/google/android/gms/internal/zzaau;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget-boolean p4, p4, Lcom/google/android/gms/internal/zzakd;->zzdel:Z

    if-eqz p4, :cond_52

    const/4 p4, 0x0

    goto :goto_53

    :cond_52
    const/4 p4, 0x2

    :goto_53
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    iput-object p4, p3, Lcom/google/android/gms/internal/zzjd;->zzbdc:Ljava/lang/Integer;

    new-instance p4, Lcom/google/android/gms/internal/zzaaa;

    invoke-direct {p4, p3}, Lcom/google/android/gms/internal/zzaaa;-><init>(Lcom/google/android/gms/internal/zzjd;)V

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/zzis;->zza(Lcom/google/android/gms/internal/zzit;)V

    iget-object p3, p2, Lcom/google/android/gms/internal/zzaau;->zzcne:Landroid/content/pm/PackageInfo;

    if-eqz p3, :cond_6d

    new-instance p3, Lcom/google/android/gms/internal/zzaab;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/zzaab;-><init>(Lcom/google/android/gms/internal/zzzy;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/zzis;->zza(Lcom/google/android/gms/internal/zzit;)V

    :cond_6d
    iget-object p2, p2, Lcom/google/android/gms/internal/zzaau;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-boolean p3, p2, Lcom/google/android/gms/internal/zzjn;->zzbel:Z

    if-eqz p3, :cond_83

    iget-object p3, p2, Lcom/google/android/gms/internal/zzjn;->zzbek:Ljava/lang/String;

    const-string p4, "interstitial_mb"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_83

    sget-object p2, Lcom/google/android/gms/internal/zzaac;->zzcmt:Lcom/google/android/gms/internal/zzit;

    :goto_7f
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzis;->zza(Lcom/google/android/gms/internal/zzit;)V

    goto :goto_a2

    :cond_83
    iget-boolean p3, p2, Lcom/google/android/gms/internal/zzjn;->zzbel:Z

    if-eqz p3, :cond_94

    iget-object p3, p2, Lcom/google/android/gms/internal/zzjn;->zzbek:Ljava/lang/String;

    const-string p4, "reward_mb"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_94

    sget-object p2, Lcom/google/android/gms/internal/zzaad;->zzcmt:Lcom/google/android/gms/internal/zzit;

    goto :goto_7f

    :cond_94
    iget-boolean p3, p2, Lcom/google/android/gms/internal/zzjn;->zzben:Z

    if-nez p3, :cond_9f

    iget-boolean p2, p2, Lcom/google/android/gms/internal/zzjn;->zzbel:Z

    if-nez p2, :cond_9f

    sget-object p2, Lcom/google/android/gms/internal/zzaae;->zzcmt:Lcom/google/android/gms/internal/zzit;

    goto :goto_7f

    :cond_9f
    sget-object p2, Lcom/google/android/gms/internal/zzaaf;->zzcmt:Lcom/google/android/gms/internal/zzit;

    goto :goto_7f

    :goto_a2
    sget-object p2, Lcom/google/android/gms/internal/zziu$zza$zzb;->zzbbm:Lcom/google/android/gms/internal/zziu$zza$zzb;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzis;->zza(Lcom/google/android/gms/internal/zziu$zza$zzb;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzjn;
    .registers 13

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_12

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaat;->zzaus:Ljava/util/List;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcef:Lcom/google/android/gms/internal/zzui;

    if-eqz v0, :cond_1f

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzui;->zzcea:Z

    if-nez v0, :cond_1f

    const/4 p1, 0x0

    return-object p1

    :cond_1f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzaax;->zzbeo:Z

    if-eqz v0, :cond_40

    iget-object v0, p1, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    array-length v3, v0

    const/4 v4, 0x0

    :goto_2b
    if-ge v4, v3, :cond_40

    aget-object v5, v0, v4

    iget-boolean v6, v5, Lcom/google/android/gms/internal/zzjn;->zzbeo:Z

    if-eqz v6, :cond_3d

    new-instance v0, Lcom/google/android/gms/internal/zzjn;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    invoke-direct {v0, v5, p1}, Lcom/google/android/gms/internal/zzjn;-><init>(Lcom/google/android/gms/internal/zzjn;[Lcom/google/android/gms/internal/zzjn;)V

    return-object v0

    :cond_3d
    add-int/lit8 v4, v4, 0x1

    goto :goto_2b

    :cond_40
    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaax;->zzcoz:Ljava/lang/String;

    if-eqz v0, :cond_ff

    const-string v3, "x"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x2

    if-eq v3, v4, :cond_71

    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    const-string v0, "Invalid ad size format from the ad response: "

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcoz:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_67

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6d

    :cond_67
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_6d
    invoke-direct {p1, v0, v2}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_71
    :try_start_71
    aget-object v3, v0, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_7d
    .catch Ljava/lang/NumberFormatException; {:try_start_71 .. :try_end_7d} :catch_dd

    iget-object v1, p1, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    array-length v4, v1

    const/4 v5, 0x0

    :goto_83
    if-ge v5, v4, :cond_bc

    aget-object v6, v1, v5

    iget-object v7, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    iget v8, v6, Lcom/google/android/gms/internal/zzjn;->width:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_9d

    iget v8, v6, Lcom/google/android/gms/internal/zzjn;->widthPixels:I

    int-to-float v8, v8

    div-float/2addr v8, v7

    float-to-int v8, v8

    :cond_9d
    iget v9, v6, Lcom/google/android/gms/internal/zzjn;->height:I

    const/4 v10, -0x2

    if-ne v9, v10, :cond_a7

    iget v9, v6, Lcom/google/android/gms/internal/zzjn;->heightPixels:I

    int-to-float v9, v9

    div-float/2addr v9, v7

    float-to-int v9, v9

    :cond_a7
    if-ne v3, v8, :cond_b9

    if-ne v0, v9, :cond_b9

    iget-boolean v7, v6, Lcom/google/android/gms/internal/zzjn;->zzbeo:Z

    if-nez v7, :cond_b9

    new-instance v0, Lcom/google/android/gms/internal/zzjn;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    invoke-direct {v0, v6, p1}, Lcom/google/android/gms/internal/zzjn;-><init>(Lcom/google/android/gms/internal/zzjn;[Lcom/google/android/gms/internal/zzjn;)V

    return-object v0

    :cond_b9
    add-int/lit8 v5, v5, 0x1

    goto :goto_83

    :cond_bc
    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    const-string v0, "The ad size from the ad response was not one of the requested sizes: "

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcoz:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_d3

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_d9

    :cond_d3
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_d9
    invoke-direct {p1, v0, v2}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    throw p1

    :catch_dd
    nop

    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    const-string v0, "Invalid ad size number from the ad response: "

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcoz:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_f5

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_fb

    :cond_f5
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_fb
    invoke-direct {p1, v0, v2}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_ff
    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    const-string v0, "The ad response must specify one of the supported ad sizes."

    invoke-direct {p1, v0, v2}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    goto :goto_108

    :goto_107
    throw p1

    :goto_108
    goto :goto_107
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzzy;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjn:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzzy;ILjava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzzy;->zzc(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzzy;)Lcom/google/android/gms/internal/zzaau;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    return-object p0
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzzy;)Ljava/lang/Runnable;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjm:Ljava/lang/Runnable;

    return-object p0
.end method

.method private final zzc(ILjava/lang/String;)V
    .registers 18

    move-object v0, p0

    move/from16 v6, p1

    const/4 v1, 0x3

    if-eq v6, v1, :cond_e

    const/4 v1, -0x1

    if-ne v6, v1, :cond_a

    goto :goto_e

    :cond_a
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_11

    :cond_e
    :goto_e
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    :goto_11
    iget-object v1, v0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    if-nez v1, :cond_1b

    new-instance v1, Lcom/google/android/gms/internal/zzaax;

    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    goto :goto_24

    :cond_1b
    new-instance v1, Lcom/google/android/gms/internal/zzaax;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-wide v2, v2, Lcom/google/android/gms/internal/zzaax;->zzcdq:J

    invoke-direct {v1, v6, v2, v3}, Lcom/google/android/gms/internal/zzaax;-><init>(IJ)V

    :goto_24
    iput-object v1, v0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v1, v0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    if-eqz v1, :cond_2b

    goto :goto_38

    :cond_2b
    new-instance v1, Lcom/google/android/gms/internal/zzaat;

    iget-object v8, v0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/internal/zzaat;-><init>(Lcom/google/android/gms/internal/zzaau;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_38
    move-object v2, v1

    new-instance v14, Lcom/google/android/gms/internal/zzafp;

    iget-object v3, v0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v4, v0, Lcom/google/android/gms/internal/zzzy;->zzcef:Lcom/google/android/gms/internal/zzui;

    const/4 v5, 0x0

    const-wide/16 v7, -0x1

    iget-wide v9, v3, Lcom/google/android/gms/internal/zzaax;->zzcpa:J

    const/4 v11, 0x0

    iget-object v12, v0, Lcom/google/android/gms/internal/zzzy;->zzcmo:Lcom/google/android/gms/internal/zzis;

    const/4 v13, 0x0

    move-object v1, v14

    move/from16 v6, p1

    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaax;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/zzis;Ljava/lang/Boolean;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/zzzy;->zzcmm:Lcom/google/android/gms/internal/zzzx;

    invoke-interface {v1, v14}, Lcom/google/android/gms/internal/zzzx;->zza(Lcom/google/android/gms/internal/zzafp;)V

    return-void
.end method


# virtual methods
.method public final onStop()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjn:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcmq:Lcom/google/android/gms/internal/zzaif;

    if-eqz v1, :cond_a

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzaif;->cancel()V

    :cond_a
    monitor-exit v0

    return-void

    :catchall_c
    move-exception v1

    monitor-exit v0
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_c

    throw v1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzalh;)Lcom/google/android/gms/internal/zzaif;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzakd;",
            "Lcom/google/android/gms/internal/zzalh<",
            "Lcom/google/android/gms/internal/zzaat;",
            ">;)",
            "Lcom/google/android/gms/internal/zzaif;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/zzaak;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzaak;-><init>(Landroid/content/Context;)V

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzaam;->zza(Lcom/google/android/gms/internal/zzakd;)Z

    move-result v1

    if-eqz v1, :cond_1b

    const-string p1, "Fetching ad response from local ad request service."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/zzaaq;

    invoke-direct {p1, v0, p2, p0}, Lcom/google/android/gms/internal/zzaaq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzalh;Lcom/google/android/gms/internal/zzaal;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaan;->zznd()Ljava/lang/Object;

    return-object p1

    :cond_1b
    const-string v1, "Fetching ad response from remote ad request service."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzajr;->zzbe(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_30

    const-string p1, "Failed to connect to remote ad request service."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_30
    new-instance v1, Lcom/google/android/gms/internal/zzaar;

    invoke-direct {v1, v0, p1, p2, p0}, Lcom/google/android/gms/internal/zzaar;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzalh;Lcom/google/android/gms/internal/zzaal;)V

    return-object v1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzaax;)V
    .registers 15

    const-string v0, "Received ad response."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 2
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjn:Ljava/lang/Object;

    monitor-enter p1

    const/4 v0, 0x0

    :try_start_18
    iput-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcmq:Lcom/google/android/gms/internal/zzaif;

    monitor-exit p1
    :try_end_1b
    .catchall {:try_start_18 .. :try_end_1b} :catchall_206

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/zzaax;->zzcnz:Z

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/zzaft;->zzg(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzblu:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_9a

    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/zzaax;->zzcol:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    if-eqz p1, :cond_75

    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzaat;->zzatw:Ljava/lang/String;

    const-string v3, "admob"

    invoke-virtual {p1, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v3

    const-string v4, "never_pool_slots"

    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9a

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_68
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v2, "never_pool_slots"

    invoke-interface {p1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_9a

    :cond_75
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzaat;->zzatw:Ljava/lang/String;

    const-string v3, "admob"

    invoke-virtual {p1, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v3

    const-string v4, "never_pool_slots"

    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9a

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_68

    :cond_9a
    :goto_9a
    :try_start_9a
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget v2, p1, Lcom/google/android/gms/internal/zzaax;->errorCode:I

    const/4 v3, -0x2

    const/4 v4, -0x3

    if-eq v2, v3, :cond_c6

    if-ne v2, v4, :cond_a5

    goto :goto_c6

    :cond_a5
    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget v0, v0, Lcom/google/android/gms/internal/zzaax;->errorCode:I

    const/16 v1, 0x42

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "There was a problem getting an ad response. ErrorCode: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget v1, v1, Lcom/google/android/gms/internal/zzaax;->errorCode:I

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_c6
    :goto_c6
    if-eq v2, v4, :cond_16a

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaax;->body:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_161

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/zzaax;->zzcnl:Z

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/zzaft;->zzf(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v2, p1, Lcom/google/android/gms/internal/zzaax;->zzcow:Z
    :try_end_e1
    .catch Lcom/google/android/gms/internal/zzaai; {:try_start_9a .. :try_end_e1} :catch_1f9

    if-eqz v2, :cond_11f

    :try_start_e3
    new-instance v2, Lcom/google/android/gms/internal/zzui;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaax;->body:Ljava/lang/String;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/zzui;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcef:Lcom/google/android/gms/internal/zzui;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcef:Lcom/google/android/gms/internal/zzui;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/zzui;->zzcdo:Z

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/zzaft;->zzz(Z)V
    :try_end_f7
    .catch Lorg/json/JSONException; {:try_start_e3 .. :try_end_f7} :catch_f8
    .catch Lcom/google/android/gms/internal/zzaai; {:try_start_e3 .. :try_end_f7} :catch_1f9

    goto :goto_12a

    :catch_f8
    move-exception p1

    :try_start_f9
    const-string v0, "Could not parse mediation config."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    const-string v0, "Could not parse mediation config: "

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzaax;->body:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_115

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_11b

    :cond_115
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_11b
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_11f
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcdo:Z

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzaft;->zzz(Z)V

    :goto_12a
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaax;->zzcoa:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_16a

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbqc:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_16a

    const-string p1, "Received cookie from server. Setting webview cookie in CookieManager."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzaht;->zzay(Landroid/content/Context;)Landroid/webkit/CookieManager;

    move-result-object p1

    if-eqz p1, :cond_16a

    const-string v1, "googleads.g.doubleclick.net"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzaax;->zzcoa:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_16a

    :cond_161
    new-instance p1, Lcom/google/android/gms/internal/zzaai;

    const-string v0, "No fill from ad server."

    const/4 v1, 0x3

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/zzaai;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_16a
    :goto_16a
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    if-eqz v1, :cond_178

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzzy;->zza(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzjn;

    move-result-object p1
    :try_end_176
    .catch Lcom/google/android/gms/internal/zzaai; {:try_start_f9 .. :try_end_176} :catch_1f9

    move-object v4, p1

    goto :goto_179

    :cond_178
    move-object v4, v0

    :goto_179
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcpg:Z

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzaft;->zzx(Z)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcpt:Z

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzaft;->zzy(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaax;->zzcpe:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1aa

    :try_start_199
    new-instance p1, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaax;->zzcpe:Ljava/lang/String;

    invoke-direct {p1, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1a2
    .catch Ljava/lang/Exception; {:try_start_199 .. :try_end_1a2} :catch_1a4

    move-object v10, p1

    goto :goto_1ab

    :catch_1a4
    move-exception p1

    const-string v1, "Error parsing the JSON for Active View."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1aa
    move-object v10, v0

    :goto_1ab
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget p1, p1, Lcom/google/android/gms/internal/zzaax;->zzcpv:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1bf

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    invoke-static {p1, v2}, Lcom/google/android/gms/internal/zzahn;->zzb(Lcom/google/android/gms/internal/zzjj;Z)V

    :cond_1bf
    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget p1, p1, Lcom/google/android/gms/internal/zzaax;->zzcpv:I

    if-ne p1, v2, :cond_1c7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1c7
    if-nez p1, :cond_1da

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahn;->zzp(Lcom/google/android/gms/internal/zzjj;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    move-object v12, p1

    goto :goto_1db

    :cond_1da
    move-object v12, v0

    :goto_1db
    new-instance p1, Lcom/google/android/gms/internal/zzafp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzzy;->zzcef:Lcom/google/android/gms/internal/zzui;

    const/4 v5, -0x2

    iget-wide v8, v2, Lcom/google/android/gms/internal/zzaax;->zzcpa:J

    iget-object v11, p0, Lcom/google/android/gms/internal/zzzy;->zzcmo:Lcom/google/android/gms/internal/zzis;

    move-object v0, p1

    invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaax;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/zzis;Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcmm:Lcom/google/android/gms/internal/zzzx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzzx;->zza(Lcom/google/android/gms/internal/zzafp;)V

    :goto_1f1
    sget-object p1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjm:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void

    :catch_1f9
    move-exception p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaai;->getErrorCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/zzzy;->zzc(ILjava/lang/String;)V

    goto :goto_1f1

    :catchall_206
    move-exception v0

    :try_start_207
    monitor-exit p1
    :try_end_208
    .catchall {:try_start_207 .. :try_end_208} :catchall_206

    goto :goto_20a

    :goto_209
    throw v0

    :goto_20a
    goto :goto_209
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/zzjc;)V
    .registers 3

    iget-object p1, p1, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaau;->zzcne:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/zzjb;->zzbcu:Ljava/lang/String;

    return-void
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/zzjc;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaau;->zzcnq:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/zzjc;->zzbcw:Ljava/lang/String;

    return-void
.end method

.method public final zzdm()V
    .registers 10

    const-string v0, "AdLoaderBackgroundTask started."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaag;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzaag;-><init>(Lcom/google/android/gms/internal/zzzy;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcjm:Ljava/lang/Runnable;

    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzbni:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbng:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_67

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaau;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzjj;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_67

    const-string v1, "_ad"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_67

    new-instance v8, Lcom/google/android/gms/internal/zzaat;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzaat;-><init>(Lcom/google/android/gms/internal/zzaau;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v8, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-static {v1, v8, v0}, Lcom/google/android/gms/internal/zzacg;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)Lcom/google/android/gms/internal/zzaax;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzzy;->zza(Lcom/google/android/gms/internal/zzaax;)V

    return-void

    :cond_67
    new-instance v0, Lcom/google/android/gms/internal/zzall;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzall;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzaah;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzaah;-><init>(Lcom/google/android/gms/internal/zzzy;Lcom/google/android/gms/internal/zzalh;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahh;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/zzakv;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaff;->zzw(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaff;->zzx(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaff;->zzy(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2, v7}, Lcom/google/android/gms/internal/zzaff;->zzg(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v8, Lcom/google/android/gms/internal/zzaat;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzy;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzaat;-><init>(Lcom/google/android/gms/internal/zzaau;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v8, p0, Lcom/google/android/gms/internal/zzzy;->zzcey:Lcom/google/android/gms/internal/zzaat;

    invoke-interface {v0, v8}, Lcom/google/android/gms/internal/zzalh;->zzk(Ljava/lang/Object;)V

    return-void
.end method
