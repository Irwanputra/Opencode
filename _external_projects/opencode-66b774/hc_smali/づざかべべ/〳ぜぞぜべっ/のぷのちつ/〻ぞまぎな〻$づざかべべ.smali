.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public くし〴〺ぅ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public final なぎぱいぢぎ()Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;
    .registers 5

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    if-nez v0, :cond_22

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ(IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    :cond_22
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$づざかべべ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-object v0
.end method

.method public ぺぁあねじ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method
