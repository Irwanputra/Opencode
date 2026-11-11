.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$なぎぱいぢぎ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-ne p0, p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    instance-of v0, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$なぎぱいぢぎ;

    if-nez v0, :cond_a

    const/4 p1, 0x0

    return p1

    :cond_a
    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$なぎぱいぢぎ;

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-static {v0, p1}, L〺つふすそ;->げつ〴ぬぐ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method

.method public げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public びぐびあび()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/くし〴〺ぅ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    if-nez v0, :cond_a

    const/4 v0, 0x0

    goto :goto_10

    .line 1
    :cond_a
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/くし〴〺ぅ;

    invoke-direct {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_10
    return-object v0
.end method
