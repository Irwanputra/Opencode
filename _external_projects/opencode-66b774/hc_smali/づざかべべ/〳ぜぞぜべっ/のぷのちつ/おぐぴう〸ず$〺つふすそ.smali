.class public abstract Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:I

.field public final げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->げつ〴ぬぐ:I

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->〺つふすそ:Ljava/lang/Class;

    iput p3, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;II)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "TT;>;II)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->げつ〴ぬぐ:I

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->〺つふすそ:Ljava/lang/Class;

    iput p4, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ:I

    return-void
.end method


# virtual methods
.method public abstract 〺つふすそ(Landroid/view/View;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")TT;"
        }
    .end annotation
.end method

.method public くし〴〺ぅ(Landroid/view/View;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")TT;"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v0, v1, :cond_a

    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    if-eqz v1, :cond_12

    .line 2
    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->〺つふすそ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_12
    const/16 v1, 0x13

    if-lt v0, v1, :cond_17

    const/4 v2, 0x1

    :cond_17
    if-eqz v2, :cond_28

    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->げつ〴ぬぐ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->〺つふすそ:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    return-object p1

    :cond_28
    const/4 p1, 0x0

    return-object p1
.end method

.method public げつ〴ぬぐ(Ljava/lang/Boolean;Ljava/lang/Boolean;)Z
    .registers 4

    const/4 v0, 0x0

    if-nez p1, :cond_5

    const/4 p1, 0x0

    goto :goto_9

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_9
    if-nez p2, :cond_d

    const/4 p2, 0x0

    goto :goto_11

    :cond_d
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :goto_11
    if-ne p1, p2, :cond_14

    const/4 v0, 0x1

    :cond_14
    return v0
.end method
