.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/WindowInsets;

.field public くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V
    .registers 3

    invoke-direct {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(IIII)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 8

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_12

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;

    invoke-direct {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    goto :goto_21

    :cond_12
    const/16 v2, 0x14

    if-lt v1, v2, :cond_1c

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    goto :goto_21

    :cond_1c
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;

    invoke-direct {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    .line 2
    :goto_21
    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->ぁごぐすすぃ()Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぁごぐすすぃ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    .line 3
    invoke-virtual {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;->くし〴〺ぅ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;)V

    .line 4
    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;->なぎぱいぢぎ()Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぁごぐすすぃ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object p1

    .line 5
    invoke-virtual {v1, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;->〺つふすそ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;)V

    .line 6
    invoke-virtual {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;->げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p1

    return-object p1
.end method

.method public final ぁごぐすすぃ()Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;
    .registers 5

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    if-nez v0, :cond_22

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iget-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ(IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    :cond_22
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-object v0
.end method

.method public いいにぽつ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method
