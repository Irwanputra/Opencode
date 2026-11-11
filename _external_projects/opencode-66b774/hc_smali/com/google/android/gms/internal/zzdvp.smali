.class public final Lcom/google/android/gms/internal/zzdvp;
.super Lcom/google/android/gms/internal/zzdvm;
.source ""


# instance fields
.field private final zzmam:Lcom/google/android/gms/internal/zzdvn;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzdvm;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzdvn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdvn;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdvp;->zzmam:Lcom/google/android/gms/internal/zzdvn;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;Ljava/io/PrintStream;)V
    .registers 5

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdvp;->zzmam:Lcom/google/android/gms/internal/zzdvn;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zzdvn;->zza(Ljava/lang/Throwable;Z)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_d

    return-void

    :cond_d
    monitor-enter p1

    :try_start_e
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v1, p2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    goto :goto_12

    :cond_22
    monitor-exit p1

    return-void

    :catchall_24
    move-exception p2

    monitor-exit p1
    :try_end_26
    .catchall {:try_start_e .. :try_end_26} :catchall_24

    goto :goto_28

    :goto_27
    throw p2

    :goto_28
    goto :goto_27
.end method

.method public final zza(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V
    .registers 6

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdvp;->zzmam:Lcom/google/android/gms/internal/zzdvn;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zzdvn;->zza(Ljava/lang/Throwable;Z)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_d

    return-void

    :cond_d
    monitor-enter p1

    :try_start_e
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    const-string v2, "Suppressed: "

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    goto :goto_12

    :cond_27
    monitor-exit p1

    return-void

    :catchall_29
    move-exception p2

    monitor-exit p1
    :try_end_2b
    .catchall {:try_start_e .. :try_end_2b} :catchall_29

    goto :goto_2d

    :goto_2c
    throw p2

    :goto_2d
    goto :goto_2c
.end method
