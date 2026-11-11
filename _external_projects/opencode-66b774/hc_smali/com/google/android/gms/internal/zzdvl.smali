.class public final Lcom/google/android/gms/internal/zzdvl;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdvl$zza;
    }
.end annotation


# static fields
.field private static zzmag:Lcom/google/android/gms/internal/zzdvm;

.field private static zzmah:I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/zzdvl;->zzbqm()Ljava/lang/Integer;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_2c

    if-eqz v1, :cond_15

    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x13

    if-lt v2, v3, :cond_15

    new-instance v2, Lcom/google/android/gms/internal/zzdvq;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzdvq;-><init>()V

    goto :goto_43

    :cond_15
    const-string v2, "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"

    invoke-static {v2}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    xor-int/2addr v2, v0

    if-eqz v2, :cond_24

    new-instance v2, Lcom/google/android/gms/internal/zzdvp;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzdvp;-><init>()V

    goto :goto_43

    :cond_24
    new-instance v2, Lcom/google/android/gms/internal/zzdvl$zza;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzdvl$zza;-><init>()V
    :try_end_29
    .catchall {:try_start_7 .. :try_end_29} :catchall_2a

    goto :goto_43

    :catchall_2a
    move-exception v2

    goto :goto_2e

    :catchall_2c
    move-exception v2

    const/4 v1, 0x0

    :goto_2e
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-class v3, Lcom/google/android/gms/internal/zzdvl$zza;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    new-instance v2, Lcom/google/android/gms/internal/zzdvl$zza;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzdvl$zza;-><init>()V

    :goto_43
    sput-object v2, Lcom/google/android/gms/internal/zzdvl;->zzmag:Lcom/google/android/gms/internal/zzdvm;

    if-nez v1, :cond_48

    goto :goto_4c

    :cond_48
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_4c
    sput v0, Lcom/google/android/gms/internal/zzdvl;->zzmah:I

    return-void
.end method

.method public static zza(Ljava/lang/Throwable;Ljava/io/PrintStream;)V
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdvl;->zzmag:Lcom/google/android/gms/internal/zzdvm;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/zzdvm;->zza(Ljava/lang/Throwable;Ljava/io/PrintStream;)V

    return-void
.end method

.method public static zza(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdvl;->zzmag:Lcom/google/android/gms/internal/zzdvm;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/zzdvm;->zza(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V

    return-void
.end method

.method private static zzbqm()Ljava/lang/Integer;
    .registers 3

    const/4 v0, 0x0

    :try_start_1
    const-string v1, "android.os.Build$VERSION"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "SDK_INT"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_13} :catch_14

    return-object v1

    :catch_14
    move-exception v1

    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V

    return-object v0
.end method
