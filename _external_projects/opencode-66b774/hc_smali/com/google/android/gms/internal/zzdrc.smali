.class public final Lcom/google/android/gms/internal/zzdrc;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdrc$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdrc;",
        "Lcom/google/android/gms/internal/zzdrc$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdrc;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzltq:Lcom/google/android/gms/internal/zzdrc;


# instance fields
.field private zzltn:I

.field private zzlto:Lcom/google/android/gms/internal/zzdrg;

.field private zzltp:Lcom/google/android/gms/internal/zzdss;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdrc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdrc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdrc;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method private final setVersion(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdrc;I)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdrc;->setVersion(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdrc;Lcom/google/android/gms/internal/zzdrg;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdrc;->zza(Lcom/google/android/gms/internal/zzdrg;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdrc;Lcom/google/android/gms/internal/zzdss;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdrc;->zza(Lcom/google/android/gms/internal/zzdss;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdrg;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdss;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    return-void
.end method

.method public static zzbmd()Lcom/google/android/gms/internal/zzdrc$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdrc;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdrc$zza;

    return-object v1
.end method

.method public static synthetic zzbme()Lcom/google/android/gms/internal/zzdrc;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    return-object v0
.end method

.method public static zzi(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdrc;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdrc;

    return-object p0
.end method


# virtual methods
.method public final getVersion()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdrd;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_11e

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v2

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdrc;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdrc;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdrc;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdrc;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdrc;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v0, :cond_da

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_b6

    const/16 v3, 0x8

    if-eq p1, v3, :cond_af

    const/16 v3, 0x12

    if-eq p1, v3, :cond_82

    const/16 v3, 0x1a

    if-eq p1, v3, :cond_55

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_b6

    :cond_55
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    if-eqz p1, :cond_67

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdss;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdss$zza;

    goto :goto_68

    :cond_67
    move-object v3, v2

    :goto_68
    invoke-static {}, Lcom/google/android/gms/internal/zzdss;->zzbof()Lcom/google/android/gms/internal/zzdss;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdss;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdss;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    goto :goto_3a

    :cond_82
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    if-eqz p1, :cond_94

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdrg;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdrg$zza;

    goto :goto_95

    :cond_94
    move-object v3, v2

    :goto_95
    invoke-static {}, Lcom/google/android/gms/internal/zzdrg;->zzbml()Lcom/google/android/gms/internal/zzdrg;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrg;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrg;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    goto :goto_3a

    :cond_af
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I
    :try_end_b5
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_b5} :catch_ce
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_b5} :catch_ba
    .catchall {:try_start_3c .. :try_end_b5} :catchall_b8

    goto :goto_3a

    :cond_b6
    :goto_b6
    const/4 v0, 0x1

    goto :goto_3a

    :catchall_b8
    move-exception p1

    goto :goto_d9

    :catch_ba
    move-exception p1

    :try_start_bb
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_ce
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_d9
    .catchall {:try_start_bb .. :try_end_d9} :catchall_b8

    :goto_d9
    throw p1

    :cond_da
    :pswitch_da
    sget-object p1, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    return-object p1

    :pswitch_dd
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdrc;

    iget p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    if-eqz p1, :cond_e7

    const/4 v2, 0x1

    goto :goto_e8

    :cond_e7
    const/4 v2, 0x0

    :goto_e8
    iget v3, p3, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    if-eqz v3, :cond_ed

    goto :goto_ee

    :cond_ed
    const/4 v1, 0x0

    :goto_ee
    invoke-interface {p2, v2, p1, v1, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    iget-object v0, p3, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrg;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    iget-object p3, p3, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    invoke-interface {p2, p1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdss;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    return-object p0

    :pswitch_10d
    new-instance p1, Lcom/google/android/gms/internal/zzdrc$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdrc$zza;-><init>(Lcom/google/android/gms/internal/zzdrd;)V

    return-object p1

    :pswitch_113
    return-object v2

    :pswitch_114
    sget-object p1, Lcom/google/android/gms/internal/zzdrc;->zzltq:Lcom/google/android/gms/internal/zzdrc;

    return-object p1

    :pswitch_117
    new-instance p1, Lcom/google/android/gms/internal/zzdrc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdrc;-><init>()V

    return-object p1

    nop

    :pswitch_data_11e
    .packed-switch 0x1
        :pswitch_117
        :pswitch_114
        :pswitch_113
        :pswitch_10d
        :pswitch_dd
        :pswitch_33
        :pswitch_da
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    if-eqz v0, :cond_16

    const/4 v1, 0x2

    if-nez v0, :cond_13

    invoke-static {}, Lcom/google/android/gms/internal/zzdrg;->zzbml()Lcom/google/android/gms/internal/zzdrg;

    move-result-object v0

    :cond_13
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    if-eqz v0, :cond_24

    const/4 v1, 0x3

    if-nez v0, :cond_21

    invoke-static {}, Lcom/google/android/gms/internal/zzdss;->zzbof()Lcom/google/android/gms/internal/zzdss;

    move-result-object v0

    :cond_21
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbmb()Lcom/google/android/gms/internal/zzdrg;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdrg;->zzbml()Lcom/google/android/gms/internal/zzdrg;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzbmc()Lcom/google/android/gms/internal/zzdss;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdss;->zzbof()Lcom/google/android/gms/internal/zzdss;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzltn:I

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzlto:Lcom/google/android/gms/internal/zzdrg;

    if-eqz v0, :cond_21

    const/4 v2, 0x2

    if-nez v0, :cond_1c

    invoke-static {}, Lcom/google/android/gms/internal/zzdrg;->zzbml()Lcom/google/android/gms/internal/zzdrg;

    move-result-object v0

    :cond_1c
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_21
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdrc;->zzltp:Lcom/google/android/gms/internal/zzdss;

    if-eqz v0, :cond_31

    const/4 v2, 0x3

    if-nez v0, :cond_2c

    invoke-static {}, Lcom/google/android/gms/internal/zzdss;->zzbof()Lcom/google/android/gms/internal/zzdss;

    move-result-object v0

    :cond_2c
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_31
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
