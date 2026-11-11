.class public abstract Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$〺つふすそ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$〺つふすそ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/CharSequence;II)Z
    .registers 5

    if-ltz p2, :cond_24

    if-ltz p3, :cond_24

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p3

    if-lt v0, p2, :cond_24

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$〺つふすそ;

    if-nez v0, :cond_14

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ()Z

    move-result p1

    return p1

    .line 1
    :cond_14
    invoke-interface {v0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$〺つふすそ;->げつ〴ぬぐ(Ljava/lang/CharSequence;II)I

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_23

    if-eq p1, p2, :cond_22

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ()Z

    move-result p2

    goto :goto_23

    :cond_22
    const/4 p2, 0x0

    :cond_23
    :goto_23
    return p2

    .line 2
    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public abstract げつ〴ぬぐ()Z
.end method
