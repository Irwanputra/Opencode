.class public abstract Lづざかべべ/ざっざへづ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iput-object p2, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iput-object p3, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public abstract 〳ぜぞぜべっ()Ljava/lang/CharSequence;
.end method

.method public abstract 〺つふすそ()Lづざかべべ/ざっざへづ/げつ〴ぬぐ;
.end method

.method public abstract ぁごぐすすぃ()[B
.end method

.method public abstract いいにぽつ()I
.end method

.method public abstract ぇぬぎばつ(I)V
.end method

.method public abstract ぉざぅち〻(Z)V
.end method

.method public おぐぴう〸ず()Lづざかべべ/ざっざへづ/くし〴〺ぅ;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "L\u3065\u3056\u304b\u3079\u3079/\u3056\u3063\u3056\u3078\u3065/\u304f\u3057\u3034\u303a\u3045;",
            ">()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->へぬ〴づぞ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return-object v1

    :cond_8
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〺つふすそ()Lづざかべべ/ざっざへづ/げつ〴ぬぐ;

    move-result-object v2

    .line 1
    :try_start_c
    invoke-virtual {p0, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/ざっざへづ/くし〴〺ぅ;
    :try_end_1c
    .catch Ljava/lang/IllegalAccessException; {:try_start_c .. :try_end_1c} :catch_47
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_c .. :try_end_1c} :catch_2f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_c .. :try_end_1c} :catch_26
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_1c} :catch_1d

    return-object v0

    :catch_1d
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered ClassNotFoundException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_26
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered NoSuchMethodException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_3f

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_3f
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered InvocationTargetException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_47
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered IllegalAccessException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final くし〴〺ぅ(Ljava/lang/Class;)Ljava/lang/Class;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "L\u3065\u3056\u304b\u3079\u3079/\u3056\u3063\u3056\u3078\u3065/\u304f\u3057\u3034\u303a\u3045;",
            ">;)",
            "Ljava/lang/Class;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v0, v1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_3b

    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    const-string v0, "%s.%sParcelizer"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3b
    return-object v0
.end method

.method public abstract げつ〴ぬぐ()V
.end method

.method public abstract ごづごきえ(I)V
.end method

.method public abstract ざっざへづ(Landroid/os/Parcelable;)V
.end method

.method public abstract ざとぅぼこ〺([B)V
.end method

.method public final づざかべべ(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .registers 6

    iget-object v0, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v0, v1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_30

    invoke-virtual {p0, p1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    const-class v3, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;

    aput-object v3, v1, v2

    const-string v2, "write"

    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_30
    return-object v0
.end method

.method public abstract てぜきぽく()Landroid/os/Parcelable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">()TT;"
        }
    .end annotation
.end method

.method public abstract でどあくず(Ljava/lang/String;)V
.end method

.method public abstract なぎぱいぢぎ()Z
.end method

.method public のぷのちつ(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(TT;I)TT;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result p2

    if-nez p2, :cond_7

    return-object p1

    :cond_7
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->てぜきぽく()Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public abstract は〲ぱなで(Ljava/lang/CharSequence;)V
.end method

.method public final びぐびあび(Ljava/lang/String;)Ljava/lang/reflect/Method;
    .registers 6

    const-class v0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v1, p1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2
    check-cast v1, Ljava/lang/reflect/Method;

    if-nez v1, :cond_29

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "read"

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iget-object v0, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    return-object v1
.end method

.method public ぶでにく〼〳(Lづざかべべ/ざっざへづ/くし〴〺ぅ;)V
    .registers 7

    const/4 v0, 0x0

    if-nez p1, :cond_7

    invoke-virtual {p0, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->でどあくず(Ljava/lang/String;)V

    return-void

    .line 1
    :cond_7
    :try_start_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1
    :try_end_f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_f} :catch_65

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->でどあくず(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〺つふすそ()Lづざかべべ/ざっざへづ/げつ〴ぬぐ;

    move-result-object v1

    .line 3
    :try_start_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v1, v3, p1

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2e
    .catch Ljava/lang/IllegalAccessException; {:try_start_1a .. :try_end_2e} :catch_5c
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1a .. :try_end_2e} :catch_44
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1a .. :try_end_2e} :catch_3b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1a .. :try_end_2e} :catch_32

    .line 4
    invoke-virtual {v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->げつ〴ぬぐ()V

    return-void

    :catch_32
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered ClassNotFoundException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3b
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered NoSuchMethodException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_44
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_54

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    :cond_54
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered InvocationTargetException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_5c
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered IllegalAccessException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_65
    move-exception v0

    .line 6
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " does not have a Parcelizer"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public abstract へぬ〴づぞ()Ljava/lang/String;
.end method

.method public abstract ぺぁあねじ(I)Z
.end method

.method public ぺふねづ〺(II)I
    .registers 3

    invoke-virtual {p0, p2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result p2

    if-nez p2, :cond_7

    return p1

    :cond_7
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->いいにぽつ()I

    move-result p1

    return p1
.end method
