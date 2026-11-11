.class public final L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;
.super Ljava/lang/RuntimeException;
.source ""


# static fields
.field public static final くし〴〺ぅ:Ljava/lang/reflect/Method;


# instance fields
.field public 〺つふすそ:Ljava/io/IOException;


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    :try_start_0
    const-class v0, Ljava/lang/Throwable;

    const-string v1, "addSuppressed"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/Throwable;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_10} :catch_11

    goto :goto_12

    :catch_11
    const/4 v0, 0x0

    :goto_12
    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public constructor <init>(Ljava/io/IOException;)V
    .registers 2

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->〺つふすそ:Ljava/io/IOException;

    return-void
.end method
