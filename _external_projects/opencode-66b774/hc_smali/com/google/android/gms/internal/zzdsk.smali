.class public final Lcom/google/android/gms/internal/zzdsk;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdsk$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdsk;",
        "Lcom/google/android/gms/internal/zzdsk$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdsk;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlvb:Lcom/google/android/gms/internal/zzdsk;


# instance fields
.field private zzltn:I

.field private zzlur:Lcom/google/android/gms/internal/zzdsg;

.field private zzluz:Lcom/google/android/gms/internal/zzfes;

.field private zzlva:Lcom/google/android/gms/internal/zzfes;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdsk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsk;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method private final setVersion(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdsk;I)V
    .registers 2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsk;->setVersion(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdsk;Lcom/google/android/gms/internal/zzdsg;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsk;->zzb(Lcom/google/android/gms/internal/zzdsg;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdsk;Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsk;->zzz(Lcom/google/android/gms/internal/zzfes;)V

    return-void
.end method

.method private final zzaa(Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method public static zzab(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdsk;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdsk;

    return-object p0
.end method

.method private final zzb(Lcom/google/android/gms/internal/zzdsg;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzdsk;Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsk;->zzaa(Lcom/google/android/gms/internal/zzfes;)V

    return-void
.end method

.method public static zzbnv()Lcom/google/android/gms/internal/zzdsk$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsk;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdsk$zza;

    return-object v1
.end method

.method public static zzbnw()Lcom/google/android/gms/internal/zzdsk;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    return-object v0
.end method

.method public static synthetic zzbnx()Lcom/google/android/gms/internal/zzdsk;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    return-object v0
.end method

.method private final zzz(Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method


# virtual methods
.method public final getVersion()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    sget-object v0, Lcom/google/android/gms/internal/zzdsl;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_120

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
    sget-object p1, Lcom/google/android/gms/internal/zzdsk;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdsk;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdsk;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdsk;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdsk;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v2, :cond_bf

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_9b

    const/16 v3, 0x8

    if-eq p1, v3, :cond_94

    const/16 v3, 0x12

    if-eq p1, v3, :cond_67

    const/16 v3, 0x1a

    if-eq p1, v3, :cond_60

    const/16 v3, 0x22

    if-eq p1, v3, :cond_59

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_9b

    :cond_59
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    goto :goto_3a

    :cond_60
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    goto :goto_3a

    :cond_67
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    if-eqz p1, :cond_79

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v0, v0}, Lcom/google/android/gms/internal/zzdsg;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdsg$zza;

    goto :goto_7a

    :cond_79
    move-object v3, v0

    :goto_7a
    invoke-static {}, Lcom/google/android/gms/internal/zzdsg;->zzbno()Lcom/google/android/gms/internal/zzdsg;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsg;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsg;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    goto :goto_3a

    :cond_94
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I
    :try_end_9a
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_9a} :catch_b3
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_9a} :catch_9f
    .catchall {:try_start_3c .. :try_end_9a} :catchall_9d

    goto :goto_3a

    :cond_9b
    :goto_9b
    const/4 v2, 0x1

    goto :goto_3a

    :catchall_9d
    move-exception p1

    goto :goto_be

    :catch_9f
    move-exception p1

    :try_start_a0
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_b3
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_be
    .catchall {:try_start_a0 .. :try_end_be} :catchall_9d

    :goto_be
    throw p1

    :cond_bf
    :pswitch_bf
    sget-object p1, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    return-object p1

    :pswitch_c2
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdsk;

    iget p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    if-eqz p1, :cond_cc

    const/4 v0, 0x1

    goto :goto_cd

    :cond_cc
    const/4 v0, 0x0

    :goto_cd
    iget v3, p3, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    if-eqz v3, :cond_d3

    const/4 v4, 0x1

    goto :goto_d4

    :cond_d3
    const/4 v4, 0x0

    :goto_d4
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    iget-object v0, p3, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsg;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    if-eq p1, v0, :cond_ee

    const/4 v3, 0x1

    goto :goto_ef

    :cond_ee
    const/4 v3, 0x0

    :goto_ef
    iget-object v4, p3, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    if-eq v4, v0, :cond_f5

    const/4 v5, 0x1

    goto :goto_f6

    :cond_f5
    const/4 v5, 0x0

    :goto_f6
    invoke-interface {p2, v3, p1, v5, v4}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    if-eq p1, v0, :cond_102

    const/4 v3, 0x1

    goto :goto_103

    :cond_102
    const/4 v3, 0x0

    :goto_103
    iget-object p3, p3, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    if-eq p3, v0, :cond_108

    goto :goto_109

    :cond_108
    const/4 v1, 0x0

    :goto_109
    invoke-interface {p2, v3, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    return-object p0

    :pswitch_110
    new-instance p1, Lcom/google/android/gms/internal/zzdsk$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdsk$zza;-><init>(Lcom/google/android/gms/internal/zzdsl;)V

    return-object p1

    :pswitch_116
    return-object v0

    :pswitch_117
    sget-object p1, Lcom/google/android/gms/internal/zzdsk;->zzlvb:Lcom/google/android/gms/internal/zzdsk;

    return-object p1

    :pswitch_11a
    new-instance p1, Lcom/google/android/gms/internal/zzdsk;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdsk;-><init>()V

    return-object p1

    :pswitch_data_120
    .packed-switch 0x1
        :pswitch_11a
        :pswitch_117
        :pswitch_116
        :pswitch_110
        :pswitch_c2
        :pswitch_33
        :pswitch_bf
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    if-eqz v0, :cond_16

    const/4 v1, 0x2

    if-nez v0, :cond_13

    invoke-static {}, Lcom/google/android/gms/internal/zzdsg;->zzbno()Lcom/google/android/gms/internal/zzdsg;

    move-result-object v0

    :cond_13
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfes;)V

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_32

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfes;)V

    :cond_32
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbnj()Lcom/google/android/gms/internal/zzdsg;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdsg;->zzbno()Lcom/google/android/gms/internal/zzdsg;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzbnt()Lcom/google/android/gms/internal/zzfes;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    return-object v0
.end method

.method public final zzbnu()Lcom/google/android/gms/internal/zzfes;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzltn:I

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlur:Lcom/google/android/gms/internal/zzdsg;

    if-eqz v0, :cond_21

    const/4 v2, 0x2

    if-nez v0, :cond_1c

    invoke-static {}, Lcom/google/android/gms/internal/zzdsg;->zzbno()Lcom/google/android/gms/internal/zzdsg;

    move-result-object v0

    :cond_1c
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_21
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_31

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdsk;->zzluz:Lcom/google/android/gms/internal/zzfes;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfes;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_31
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_41

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdsk;->zzlva:Lcom/google/android/gms/internal/zzfes;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfes;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_41
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
