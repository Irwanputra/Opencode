.class public final Lcom/google/android/gms/internal/zzdry;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdry$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdry;",
        "Lcom/google/android/gms/internal/zzdry$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdry;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzluj:Lcom/google/android/gms/internal/zzdry;


# instance fields
.field private zzltn:I

.field private zzltv:Lcom/google/android/gms/internal/zzfes;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdry;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdry;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdry;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method private final setVersion(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdry;I)V
    .registers 2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdry;->setVersion(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdry;Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdry;->zzk(Lcom/google/android/gms/internal/zzfes;)V

    return-void
.end method

.method public static zzbne()Lcom/google/android/gms/internal/zzdry$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdry;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdry$zza;

    return-object v1
.end method

.method public static synthetic zzbnf()Lcom/google/android/gms/internal/zzdry;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    return-object v0
.end method

.method private final zzk(Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method public static zzu(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdry;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdry;

    return-object p0
.end method


# virtual methods
.method public final getVersion()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdrz;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_c4

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v0

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdry;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdry;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdry;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdry;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2b
    monitor-exit p1

    goto :goto_30

    :catchall_2d
    move-exception p2

    monitor-exit p1
    :try_end_2f
    .catchall {:try_start_1e .. :try_end_2f} :catchall_2d

    throw p2

    :cond_30
    :goto_30
    sget-object p1, Lcom/google/android/gms/internal/zzdry;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v2, :cond_83

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_5f

    const/16 p3, 0x8

    if-eq p1, p3, :cond_58

    const/16 p3, 0x12

    if-eq p1, p3, :cond_51

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_5f

    :cond_51
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    goto :goto_3a

    :cond_58
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I
    :try_end_5e
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_5e} :catch_77
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_5e} :catch_63
    .catchall {:try_start_3c .. :try_end_5e} :catchall_61

    goto :goto_3a

    :cond_5f
    :goto_5f
    const/4 v2, 0x1

    goto :goto_3a

    :catchall_61
    move-exception p1

    goto :goto_82

    :catch_63
    move-exception p1

    :try_start_64
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_77
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_82
    .catchall {:try_start_64 .. :try_end_82} :catchall_61

    :goto_82
    throw p1

    :cond_83
    :pswitch_83
    sget-object p1, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    return-object p1

    :pswitch_86
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdry;

    iget p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    if-eqz p1, :cond_90

    const/4 v0, 0x1

    goto :goto_91

    :cond_90
    const/4 v0, 0x0

    :goto_91
    iget v3, p3, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    if-eqz v3, :cond_97

    const/4 v4, 0x1

    goto :goto_98

    :cond_97
    const/4 v4, 0x0

    :goto_98
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    if-eq p1, v0, :cond_a6

    const/4 v3, 0x1

    goto :goto_a7

    :cond_a6
    const/4 v3, 0x0

    :goto_a7
    iget-object p3, p3, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    if-eq p3, v0, :cond_ac

    goto :goto_ad

    :cond_ac
    const/4 v1, 0x0

    :goto_ad
    invoke-interface {p2, v3, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-object p0

    :pswitch_b4
    new-instance p1, Lcom/google/android/gms/internal/zzdry$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdry$zza;-><init>(Lcom/google/android/gms/internal/zzdrz;)V

    return-object p1

    :pswitch_ba
    return-object v0

    :pswitch_bb
    sget-object p1, Lcom/google/android/gms/internal/zzdry;->zzluj:Lcom/google/android/gms/internal/zzdry;

    return-object p1

    :pswitch_be
    new-instance p1, Lcom/google/android/gms/internal/zzdry;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdry;-><init>()V

    return-object p1

    :pswitch_data_c4
    .packed-switch 0x1
        :pswitch_be
        :pswitch_bb
        :pswitch_ba
        :pswitch_b4
        :pswitch_86
        :pswitch_33
        :pswitch_83
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfes;)V

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbmj()Lcom/google/android/gms/internal/zzfes;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltn:I

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_21

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdry;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfes;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_21
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
