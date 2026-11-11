.class public final Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static げつ〴ぬぐ:I = 0x5


# direct methods
.method public static 〺つふすそ()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    const/16 v1, 0x2e

    invoke-virtual {v3, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "() ["

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 3

    .line 1
    sget v0, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_10

    .line 2
    invoke-static {}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ()Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    :cond_10
    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/lang/Object;)V
    .registers 2

    .line 1
    sget v0, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-lez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    if-eqz v0, :cond_15

    .line 2
    invoke-static {}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ()Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ()Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    :cond_15
    return-void
.end method
