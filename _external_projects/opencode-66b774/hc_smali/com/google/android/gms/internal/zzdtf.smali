.class public final Lcom/google/android/gms/internal/zzdtf;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtf$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtf;",
        "Lcom/google/android/gms/internal/zzdtf$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtf;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlwx:Lcom/google/android/gms/internal/zzdtf;


# instance fields
.field private zzlwa:Ljava/lang/String;

.field private zzlwt:Ljava/lang/String;

.field private zzlwu:I

.field private zzlwv:Z

.field private zzlww:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtf;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtf;I)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtf;->zzfv(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtf;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtf;->zzok(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtf;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtf;->zzcb(Z)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzdtf;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtf;->zzoi(Ljava/lang/String;)V

    return-void
.end method

.method public static zzboz()Lcom/google/android/gms/internal/zzdtf$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtf;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdtf$zza;

    return-object v1
.end method

.method public static zzbpa()Lcom/google/android/gms/internal/zzdtf;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    return-object v0
.end method

.method public static synthetic zzbpb()Lcom/google/android/gms/internal/zzdtf;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    return-object v0
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzdtf;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtf;->zzol(Ljava/lang/String;)V

    return-void
.end method

.method private final zzcb(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    return-void
.end method

.method private final zzfv(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    return-void
.end method

.method private final zzoi(Ljava/lang/String;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    return-void
.end method

.method private final zzok(Ljava/lang/String;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    return-void
.end method

.method private final zzol(Ljava/lang/String;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdtg;->zzbbi:[I

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
    return-object v2

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdtf;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdtf;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdtf;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtf;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtf;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v0, :cond_a4

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_80

    const/16 p3, 0xa

    if-eq p1, p3, :cond_79

    const/16 p3, 0x12

    if-eq p1, p3, :cond_72

    const/16 p3, 0x18

    if-eq p1, p3, :cond_6b

    const/16 p3, 0x20

    if-eq p1, p3, :cond_64

    const/16 p3, 0x2a

    if-eq p1, p3, :cond_5d

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_80

    :cond_5d
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    goto :goto_3a

    :cond_64
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvz()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    goto :goto_3a

    :cond_6b
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    goto :goto_3a

    :cond_72
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    goto :goto_3a

    :cond_79
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;
    :try_end_7f
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_7f} :catch_98
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_7f} :catch_84
    .catchall {:try_start_3c .. :try_end_7f} :catchall_82

    goto :goto_3a

    :cond_80
    :goto_80
    const/4 v0, 0x1

    goto :goto_3a

    :catchall_82
    move-exception p1

    goto :goto_a3

    :catch_84
    move-exception p1

    :try_start_85
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_98
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_a3
    .catchall {:try_start_85 .. :try_end_a3} :catchall_82

    :goto_a3
    throw p1

    :cond_a4
    :pswitch_a4
    sget-object p1, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    return-object p1

    :pswitch_a7
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtf;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    iget-object v3, p3, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v4, p3, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-interface {p2, p1, v2, v3, v4}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    iget-object v3, p3, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v4, p3, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-interface {p2, p1, v2, v3, v4}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    iget p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    if-eqz p1, :cond_e1

    const/4 v2, 0x1

    goto :goto_e2

    :cond_e1
    const/4 v2, 0x0

    :goto_e2
    iget v3, p3, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    if-eqz v3, :cond_e7

    const/4 v0, 0x1

    :cond_e7
    invoke-interface {p2, v2, p1, v0, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    iget-boolean p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    iget-boolean v0, p3, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    invoke-interface {p2, p1, p1, v0, v0}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZZZZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    iget-object p3, p3, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-interface {p2, p1, v0, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    return-object p0

    :pswitch_110
    new-instance p1, Lcom/google/android/gms/internal/zzdtf$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdtf$zza;-><init>(Lcom/google/android/gms/internal/zzdtg;)V

    return-object p1

    :pswitch_116
    return-object v2

    :pswitch_117
    sget-object p1, Lcom/google/android/gms/internal/zzdtf;->zzlwx:Lcom/google/android/gms/internal/zzdtf;

    return-object p1

    :pswitch_11a
    new-instance p1, Lcom/google/android/gms/internal/zzdtf;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtf;-><init>()V

    return-object p1

    :pswitch_data_120
    .packed-switch 0x1
        :pswitch_11a
        :pswitch_117
        :pswitch_116
        :pswitch_110
        :pswitch_a7
        :pswitch_33
        :pswitch_a4
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_1c
    iget v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    if-eqz v0, :cond_24

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_24
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    if-eqz v0, :cond_2c

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzl(IZ)V

    :cond_2c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3a

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_3a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbon()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    return-object v0
.end method

.method public final zzbov()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    return-object v0
.end method

.method public final zzbow()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    return v0
.end method

.method public final zzbox()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    return v0
.end method

.method public final zzboy()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwt:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwa:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_27
    iget v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwu:I

    if-eqz v0, :cond_31

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_31
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlwv:Z

    if-eqz v0, :cond_3b

    const/4 v2, 0x4

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzm(IZ)I

    move-result v0

    add-int/2addr v1, v0

    :cond_3b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4b

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtf;->zzlww:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_4b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
