.class public final L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:[Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public くし〴〺ぅ:[Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public げつ〴ぬぐ:Z

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/〳ぜぞぜべっ;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, L〳ぜぞぜべっ/〳ぜぞぜべっ;->げつ〴ぬぐ:Z

    iput-boolean v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    iget-object v0, p1, L〳ぜぞぜべっ/〳ぜぞぜべっ;->くし〴〺ぅ:[Ljava/lang/String;

    iput-object v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->〺つふすそ:[Ljava/lang/String;

    iget-object v0, p1, L〳ぜぞぜべっ/〳ぜぞぜべっ;->びぐびあび:[Ljava/lang/String;

    iput-object v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->くし〴〺ぅ:[Ljava/lang/String;

    iget-boolean p1, p1, L〳ぜぞぜべっ/〳ぜぞぜべっ;->〺つふすそ:Z

    iput-boolean p1, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->びぐびあび:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public varargs 〺つふすそ([L〳ぜぞぜべっ/なぎぱいぢぎ;)L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;
    .registers 5

    iget-boolean v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_18

    array-length v0, p1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_8
    array-length v2, p1

    if-ge v1, v2, :cond_14

    aget-object v2, p1, v1

    iget-object v2, v2, L〳ぜぞぜべっ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/String;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_14
    invoke-virtual {p0, v0}, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ([Ljava/lang/String;)L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;

    return-object p0

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_21

    :goto_20
    throw p1

    :goto_21
    goto :goto_20
.end method

.method public varargs くし〴〺ぅ([Ljava/lang/String;)L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;
    .registers 3

    iget-boolean v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_18

    array-length v0, p1

    if-eqz v0, :cond_10

    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->くし〴〺ぅ:[Ljava/lang/String;

    return-object p0

    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one TLS version is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs げつ〴ぬぐ([Ljava/lang/String;)L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;
    .registers 3

    iget-boolean v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_18

    array-length v0, p1

    if-eqz v0, :cond_10

    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->〺つふすそ:[Ljava/lang/String;

    return-object p0

    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one cipher suite is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs びぐびあび([L〳ぜぞぜべっ/ぺづげぺが;)L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;
    .registers 5

    iget-boolean v0, p0, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_18

    array-length v0, p1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_8
    array-length v2, p1

    if-ge v1, v2, :cond_14

    aget-object v2, p1, v1

    iget-object v2, v2, L〳ぜぞぜべっ/ぺづげぺが;->〺つふすそ:Ljava/lang/String;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_14
    invoke-virtual {p0, v0}, L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;->くし〴〺ぅ([Ljava/lang/String;)L〳ぜぞぜべっ/〳ぜぞぜべっ$げつ〴ぬぐ;

    return-object p0

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_21

    :goto_20
    throw p1

    :goto_21
    goto :goto_20
.end method
