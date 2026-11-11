.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:I

.field public final げつ〴ぬぐ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;

    const/4 v0, 0x0

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:I

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:I

    return-void
.end method

.method public constructor <init>(II)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:[L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;

    iput p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_e

    const/16 p1, 0x8

    :cond_e
    iput p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:I

    return-void
.end method
