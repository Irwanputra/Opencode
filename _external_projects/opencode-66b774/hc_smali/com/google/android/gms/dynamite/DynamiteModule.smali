.class public final Lcom/google/android/gms/dynamite/DynamiteModule;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;,
        Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;,
        Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;,
        Lcom/google/android/gms/dynamite/DynamiteModule$〺つふすそ;,
        Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;
    }
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;

.field public static 〺つふすそ:Ljava/lang/Boolean;

.field public static final ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;

.field public static くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;

.field public static づざかべべ:Ljava/lang/String;

.field public static final なぎぱいぢぎ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/google/android/gms/dynamite/DynamiteModule$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public static びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〳ぜぞぜべっ;


# instance fields
.field public final げつ〴ぬぐ:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->〳ぜぞぜべっ:Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_8

    iput-object p1, p0, Lcom/google/android/gms/dynamite/DynamiteModule;->げつ〴ぬぐ:Landroid/content/Context;

    return-void

    .line 1
    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null reference"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static 〳ぜぞぜべっ(Landroid/content/Context;Ljava/lang/String;Z)I
    .registers 11

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    if-eqz p2, :cond_a

    const-string p0, "api_force_staging"

    goto :goto_c

    :cond_a
    const-string p0, "api"

    :goto_c
    const-string p2, "content://com.google.android.gms.chimera/"

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_45} :catch_8d
    .catchall {:try_start_1 .. :try_end_45} :catchall_8b

    if-eqz p0, :cond_83

    :try_start_47
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_83

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    if-lez p1, :cond_73

    const-class p2, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter p2
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_47 .. :try_end_57} :catch_7e
    .catchall {:try_start_47 .. :try_end_57} :catchall_7a

    const/4 v1, 0x2

    :try_start_58
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->づざかべべ:Ljava/lang/String;

    monitor-exit p2
    :try_end_5f
    .catchall {:try_start_58 .. :try_end_5f} :catchall_70

    :try_start_5f
    sget-object p2, Lcom/google/android/gms/dynamite/DynamiteModule;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;

    if-eqz p2, :cond_73

    iget-object v1, p2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    if-nez v1, :cond_73

    iput-object p0, p2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;
    :try_end_6f
    .catch Ljava/lang/Exception; {:try_start_5f .. :try_end_6f} :catch_7e
    .catchall {:try_start_5f .. :try_end_6f} :catchall_7a

    goto :goto_74

    :catchall_70
    move-exception p1

    :try_start_71
    monitor-exit p2
    :try_end_72
    .catchall {:try_start_71 .. :try_end_72} :catchall_70

    :try_start_72
    throw p1
    :try_end_73
    .catch Ljava/lang/Exception; {:try_start_72 .. :try_end_73} :catch_7e
    .catchall {:try_start_72 .. :try_end_73} :catchall_7a

    :cond_73
    move-object v0, p0

    :goto_74
    if-eqz v0, :cond_79

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_79
    return p1

    :catchall_7a
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    goto :goto_9e

    :catch_7e
    move-exception p1

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto :goto_8f

    :cond_83
    :try_start_83
    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p2, "Failed to connect to dynamite module ContentResolver."

    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p1
    :try_end_8b
    .catch Ljava/lang/Exception; {:try_start_83 .. :try_end_8b} :catch_7e
    .catchall {:try_start_83 .. :try_end_8b} :catchall_7a

    :catchall_8b
    move-exception p0

    goto :goto_9e

    :catch_8d
    move-exception p0

    move-object p1, v0

    :goto_8f
    :try_start_8f
    instance-of p2, p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    if-eqz p2, :cond_94

    throw p0

    :cond_94
    new-instance p2, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string v1, "V2 version check failed"

    invoke-direct {p2, v1, p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p2
    :try_end_9c
    .catchall {:try_start_8f .. :try_end_9c} :catchall_9c

    :catchall_9c
    move-exception p0

    move-object v0, p1

    :goto_9e
    if-eqz v0, :cond_a3

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_a3
    throw p0
.end method

.method public static 〺つふすそ(Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;
    .registers 7

    const-class v0, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->〺つふすそ:Ljava/lang/Boolean;

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_ca

    const/4 v2, 0x0

    if-eqz v1, :cond_c2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_83

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    monitor-enter v0

    :try_start_17
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〳ぜぞぜべっ;

    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_17 .. :try_end_1a} :catchall_80

    if-eqz v1, :cond_78

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;

    if-eqz v0, :cond_70

    iget-object v3, v0, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    if-eqz v3, :cond_70

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iget-object v0, v0, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    .line 2
    :try_start_30
    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v3, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    new-instance p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-interface {v1, v3, p1, p2, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〳ぜぞぜべっ;->てぜきぽく(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;ILなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p0

    invoke-static {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_44} :catch_45

    goto :goto_60

    :catch_45
    move-exception p0

    const-string p1, "Failed to load DynamiteLoader: "

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_5a

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_5f

    :cond_5a
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_5f
    move-object p0, v2

    :goto_60
    if-eqz p0, :cond_68

    .line 4
    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule;

    invoke-direct {p1, p0}, Lcom/google/android/gms/dynamite/DynamiteModule;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_68
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p1, "Failed to get module context"

    invoke-direct {p0, p1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :cond_70
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p1, "No result cursor"

    invoke-direct {p0, p1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :cond_78
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p1, "DynamiteLoaderV2 was not cached."

    invoke-direct {p0, p1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :catchall_80
    move-exception p0

    :try_start_81
    monitor-exit v0
    :try_end_82
    .catchall {:try_start_81 .. :try_end_82} :catchall_80

    throw p0

    :cond_83
    const-string v0, "Failed to load remote module."

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    invoke-static {p0}, Lcom/google/android/gms/dynamite/DynamiteModule;->ぁごぐすすぃ(Landroid/content/Context;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;

    move-result-object v1

    if-eqz v1, :cond_ba

    .line 6
    :try_start_92
    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v3, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 7
    invoke-interface {v1, v3, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;->ごづごきえ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p0
    :try_end_9b
    .catch Landroid/os/RemoteException; {:try_start_92 .. :try_end_9b} :catch_b3

    invoke-static {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_ad

    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule;

    invoke-static {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {p1, p0}, Lcom/google/android/gms/dynamite/DynamiteModule;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_ad
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    invoke-direct {p0, v0, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :catch_b3
    move-exception p0

    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    invoke-direct {p1, v0, p0, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p1

    :cond_ba
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p1, "Failed to create IDynamiteLoader."

    invoke-direct {p0, p1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    .line 8
    :cond_c2
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p1, "Failed to determine which loading route to use."

    invoke-direct {p0, p1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :catchall_ca
    move-exception p0

    :try_start_cb
    monitor-exit v0
    :try_end_cc
    .catchall {:try_start_cb .. :try_end_cc} :catchall_ca

    throw p0
.end method

.method public static ぁごぐすすぃ(Landroid/content/Context;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;
    .registers 5

    const-class v0, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;

    if-eqz v1, :cond_9

    monitor-exit v0

    return-object v1

    .line 1
    :cond_9
    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

    .line 2
    invoke-virtual {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->げつ〴ぬぐ(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_14

    monitor-exit v0
    :try_end_13
    .catchall {:try_start_3 .. :try_end_13} :catchall_63

    return-object v2

    :cond_14
    :try_start_14
    const-string v1, "com.google.android.gms"

    const/4 v3, 0x3

    invoke-virtual {p0, v1, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v1, "com.google.android.gms.chimera.container.DynamiteLoaderImpl"

    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_2f

    move-object v1, v2

    goto :goto_41

    :cond_2f
    const-string v1, "com.google.android.gms.dynamite.IDynamiteLoader"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v3, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;

    if-eqz v3, :cond_3c

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;

    goto :goto_41

    :cond_3c
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/ぁごぐすすぃ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(Landroid/os/IBinder;)V

    :goto_41
    if-eqz v1, :cond_61

    sput-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_45} :catch_47
    .catchall {:try_start_14 .. :try_end_45} :catchall_63

    :try_start_45
    monitor-exit v0

    return-object v1

    :catch_47
    move-exception p0

    const-string v1, "Failed to load IDynamiteLoader from GmsCore: "

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_5c

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_61

    :cond_5c
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :cond_61
    :goto_61
    monitor-exit v0

    return-object v2

    :catchall_63
    move-exception p0

    monitor-exit v0
    :try_end_65
    .catchall {:try_start_45 .. :try_end_65} :catchall_63

    throw p0
.end method

.method public static くし〴〺ぅ(Ljava/lang/ClassLoader;)V
    .registers 4

    const/4 v0, 0x0

    :try_start_1
    const-string v1, "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"

    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_1a

    move-object v1, v0

    goto :goto_2c

    :cond_1a
    const-string v1, "com.google.android.gms.dynamite.IDynamiteLoaderV2"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〳ぜぞぜべっ;

    if-eqz v2, :cond_27

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〳ぜぞぜべっ;

    goto :goto_2c

    :cond_27
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/ぺぁあねじ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/ぺぁあねじ;-><init>(Landroid/os/IBinder;)V

    :goto_2c
    sput-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〳ぜぞぜべっ;
    :try_end_2e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_2e} :catch_37
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_2e} :catch_35
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_2e} :catch_33
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_2e} :catch_31
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_2e} :catch_2f

    return-void

    :catch_2f
    move-exception p0

    goto :goto_38

    :catch_31
    move-exception p0

    goto :goto_38

    :catch_33
    move-exception p0

    goto :goto_38

    :catch_35
    move-exception p0

    goto :goto_38

    :catch_37
    move-exception p0

    :goto_38
    new-instance v1, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string v2, "Failed to instantiate dynamite loader"

    invoke-direct {v1, v2, p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw v1
.end method

.method public static げつ〴ぬぐ(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    .registers 12

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;

    new-instance v2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :try_start_11
    sget-object v4, Lcom/google/android/gms/dynamite/DynamiteModule;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;

    invoke-interface {p1, p0, p2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;

    move-result-object v4

    iget v5, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    iget v5, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:I

    if-eqz v5, :cond_b4

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2a

    iget v7, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:I

    if-eqz v7, :cond_b4

    :cond_2a
    const/4 v7, 0x1

    if-ne v5, v7, :cond_31

    iget v8, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->〺つふすそ:I

    if-eqz v8, :cond_b4

    :cond_31
    if-ne v5, v6, :cond_42

    invoke-static {p0, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->づざかべべ(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p0
    :try_end_37
    .catchall {:try_start_11 .. :try_end_37} :catchall_de

    iget-object p1, v2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    if-eqz p1, :cond_3e

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_3e
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object p0

    :cond_42
    if-ne v5, v7, :cond_99

    :try_start_44
    iget v5, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->〺つふすそ:I

    invoke-static {p0, p2, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->〺つふすそ(Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p0
    :try_end_4a
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_44 .. :try_end_4a} :catch_55
    .catchall {:try_start_44 .. :try_end_4a} :catchall_de

    iget-object p1, v2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    if-eqz p1, :cond_51

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_51
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object p0

    :catch_55
    move-exception v0

    :try_start_56
    const-string v5, "Failed to load remote module: "

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_6a

    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_6f

    :cond_6a
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_6f
    iget v4, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:I

    if-eqz v4, :cond_91

    new-instance v5, Lcom/google/android/gms/dynamite/DynamiteModule$〺つふすそ;

    invoke-direct {v5, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$〺つふすそ;-><init>(I)V

    invoke-interface {p1, p0, p2, v5}, Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;

    move-result-object p1

    iget p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:I

    if-ne p1, v6, :cond_91

    invoke-static {p0, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->づざかべべ(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p0
    :try_end_84
    .catchall {:try_start_56 .. :try_end_84} :catchall_de

    iget-object p1, v2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    if-eqz p1, :cond_8b

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_8b
    sget-object p1, Lcom/google/android/gms/dynamite/DynamiteModule;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object p0

    :cond_91
    :try_start_91
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string p1, "Remote load failed. No local fallback found."

    invoke-direct {p0, p1, v0, v3}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :cond_99
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    iget p1, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:I

    const/16 p2, 0x2f

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "VersionPolicy returned invalid code:"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v3}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0

    :cond_b4
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    iget p1, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:I

    iget p2, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->〺つふすそ:I

    const/16 v0, 0x5b

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "No acceptable module found. Local version is "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " and remote version is "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v3}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw p0
    :try_end_de
    .catchall {:try_start_91 .. :try_end_de} :catchall_de

    :catchall_de
    move-exception p0

    iget-object p1, v2, Lcom/google/android/gms/dynamite/DynamiteModule$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/database/Cursor;

    if-eqz p1, :cond_e6

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_e6
    sget-object p1, Lcom/google/android/gms/dynamite/DynamiteModule;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    throw p0
.end method

.method public static づざかべべ(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    .registers 4

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "Selected local version of "

    if-eqz v0, :cond_10

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_15

    :cond_10
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_15
    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/android/gms/dynamite/DynamiteModule;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static なぎぱいぢぎ(Landroid/content/Context;Ljava/lang/String;Z)I
    .registers 11

    const-class v0, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->〺つふすそ:Ljava/lang/Boolean;
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_ec

    if-nez v1, :cond_98

    :try_start_7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "sClassLoader"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    monitor-enter v1
    :try_end_20
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_20} :catch_8c
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_20} :catch_8a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_7 .. :try_end_20} :catch_88
    .catchall {:try_start_7 .. :try_end_20} :catchall_ec

    const/4 v3, 0x0

    :try_start_21
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ClassLoader;

    if-eqz v4, :cond_38

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    if-ne v4, v2, :cond_32

    :goto_2f
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_31
    .catchall {:try_start_21 .. :try_end_31} :catchall_85

    goto :goto_82

    :cond_32
    :try_start_32
    invoke-static {v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->くし〴〺ぅ(Ljava/lang/ClassLoader;)V
    :try_end_35
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_32 .. :try_end_35} :catch_35
    .catchall {:try_start_32 .. :try_end_35} :catchall_85

    :catch_35
    :try_start_35
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_82

    :cond_38
    const-string v4, "com.google.android.gms"

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_50

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4f
    .catchall {:try_start_35 .. :try_end_4f} :catchall_85

    goto :goto_2f

    :cond_50
    :try_start_50
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->〳ぜぞぜべっ(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result v4

    sget-object v5, Lcom/google/android/gms/dynamite/DynamiteModule;->づざかべべ:Ljava/lang/String;

    if-eqz v5, :cond_77

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5f

    goto :goto_77

    :cond_5f
    new-instance v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    sget-object v6, Lcom/google/android/gms/dynamite/DynamiteModule;->づざかべべ:Ljava/lang/String;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    invoke-static {v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->くし〴〺ぅ(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2, v3, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v5, Lcom/google/android/gms/dynamite/DynamiteModule;->〺つふすそ:Ljava/lang/Boolean;
    :try_end_74
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_50 .. :try_end_74} :catch_7a
    .catchall {:try_start_50 .. :try_end_74} :catchall_85

    :try_start_74
    monitor-exit v1
    :try_end_75
    .catchall {:try_start_74 .. :try_end_75} :catchall_85

    :try_start_75
    monitor-exit v0
    :try_end_76
    .catchall {:try_start_75 .. :try_end_76} :catchall_ec

    return v4

    :cond_77
    :goto_77
    :try_start_77
    monitor-exit v1
    :try_end_78
    .catchall {:try_start_77 .. :try_end_78} :catchall_85

    :try_start_78
    monitor-exit v0
    :try_end_79
    .catchall {:try_start_78 .. :try_end_79} :catchall_ec

    return v4

    :catch_7a
    :try_start_7a
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2f

    :goto_82
    monitor-exit v1

    move-object v1, v2

    goto :goto_96

    :catchall_85
    move-exception v2

    monitor-exit v1
    :try_end_87
    .catchall {:try_start_7a .. :try_end_87} :catchall_85

    :try_start_87
    throw v2
    :try_end_88
    .catch Ljava/lang/ClassNotFoundException; {:try_start_87 .. :try_end_88} :catch_8c
    .catch Ljava/lang/IllegalAccessException; {:try_start_87 .. :try_end_88} :catch_8a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_87 .. :try_end_88} :catch_88
    .catchall {:try_start_87 .. :try_end_88} :catchall_ec

    :catch_88
    move-exception v1

    goto :goto_8d

    :catch_8a
    move-exception v1

    goto :goto_8d

    :catch_8c
    move-exception v1

    :goto_8d
    :try_start_8d
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_96
    sput-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->〺つふすそ:Ljava/lang/Boolean;

    :cond_98
    monitor-exit v0
    :try_end_99
    .catchall {:try_start_8d .. :try_end_99} :catchall_ec

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c0

    :try_start_a0
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->〳ぜぞぜべっ(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p0
    :try_end_a4
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_a0 .. :try_end_a4} :catch_a5

    return p0

    :catch_a5
    move-exception p0

    const-string p1, "Failed to retrieve remote module version: "

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_ba

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_bf

    :cond_ba
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_bf
    return v1

    .line 1
    :cond_c0
    invoke-static {p0}, Lcom/google/android/gms/dynamite/DynamiteModule;->ぁごぐすすぃ(Landroid/content/Context;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;

    move-result-object v0

    if-nez v0, :cond_c7

    goto :goto_eb

    .line 2
    :cond_c7
    :try_start_c7
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v2, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-interface {v0, v2, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;->のぷのちつ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;Z)I

    move-result v1
    :try_end_d0
    .catch Landroid/os/RemoteException; {:try_start_c7 .. :try_end_d0} :catch_d1

    goto :goto_eb

    :catch_d1
    move-exception p0

    const-string p1, "Failed to retrieve remote module version: "

    invoke-virtual {p0}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_e6

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_eb

    :cond_e6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_eb
    return v1

    :catchall_ec
    move-exception p0

    .line 4
    :try_start_ed
    monitor-exit v0
    :try_end_ee
    .catchall {:try_start_ed .. :try_end_ee} :catchall_ec

    goto :goto_f0

    :goto_ef
    throw p0

    :goto_f0
    goto :goto_ef
.end method

.method public static びぐびあび(Landroid/content/Context;Ljava/lang/String;)I
    .registers 7

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v1, "com.google.android.gms.dynamite.descriptors."

    const-string v2, "ModuleDescriptor"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const-string v1, "MODULE_ID"

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v2, "MODULE_VERSION"

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_66

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    return v0

    :cond_66
    invoke-virtual {p0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result p0
    :try_end_6a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_6a} :catch_86
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_6a} :catch_6b

    return p0

    :catch_6b
    move-exception p0

    const-string p1, "Failed to load module descriptor class: "

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_80

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_8d

    :cond_80
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_8d

    :catch_86
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    :goto_8d
    return v0
.end method


# virtual methods
.method public final ぺぁあねじ(Ljava/lang/String;)Landroid/os/IBinder;
    .registers 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/dynamite/DynamiteModule;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;
    :try_end_10
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_10} :catch_15
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_10} :catch_13
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_10} :catch_11

    return-object v0

    :catch_11
    move-exception v0

    goto :goto_16

    :catch_13
    move-exception v0

    goto :goto_16

    :catch_15
    move-exception v0

    :goto_16
    new-instance v1, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;

    const-string v2, "Failed to instantiate module class: "

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_25

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2a

    :cond_25
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2a
    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;)V

    throw v1
.end method
