.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:I

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    const/high16 v1, -0x80000000

    iput v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->くし〴〺ぅ:I

    iput v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->びぐびあび:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->づざかべべ:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->なぎぱいぢぎ:I

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〳ぜぞぜべっ:Z

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(II)V
    .registers 5

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->くし〴〺ぅ:I

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->びぐびあび:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〳ぜぞぜべっ:Z

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_16

    if-eq p2, v1, :cond_11

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    :cond_11
    if-eq p1, v1, :cond_1e

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    goto :goto_1e

    :cond_16
    if-eq p1, v1, :cond_1a

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->げつ〴ぬぐ:I

    :cond_1a
    if-eq p2, v1, :cond_1e

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〻ぞまぎな〻;->〺つふすそ:I

    :cond_1e
    :goto_1e
    return-void
.end method
