.class public Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/のぷのちつ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/reflect/Method;

.field public final げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(ILjava/lang/reflect/Method;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:I

    iput-object p2, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-eqz p1, :cond_2d

    const-class v2, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_10

    goto :goto_2d

    :cond_10
    check-cast p1, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;

    iget v2, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:I

    iget v3, p1, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:I

    if-ne v2, v3, :cond_2b

    iget-object v2, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p1, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2b

    goto :goto_2c

    :cond_2b
    const/4 v0, 0x0

    :goto_2c
    return v0

    :cond_2d
    :goto_2d
    return v1
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
